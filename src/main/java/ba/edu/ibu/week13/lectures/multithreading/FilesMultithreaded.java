package ba.edu.ibu.week13.lectures.multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class FilesMultithreaded {
    private static final int NUM_OF_THREADS = 4;
    private static final String FILENAME = "full_grouped.csv";
    private static final String SEARCH_CRITERIA = "Bosnia and Herzegovina";

    public static void main(String[] args) {
        System.out.println("--- Starting Measured Runs ---");
        searchFile(SEARCH_CRITERIA, true);
        searchFileMultithreaded(SEARCH_CRITERIA, true);
        searchFileParallelStream(SEARCH_CRITERIA, true);
    }

    public static List<String> readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Exception happened in the reading file: " + filename);
        }
        return null;
    }

    /**
     * Best Approach: Parallel Streams
     * Uses the common ForkJoinPool and handles partitioning/merging automatically.
     */
    public static void searchFileParallelStream(String searchCriteria, boolean printResults) {
        List<String> lines = readFile(FILENAME);
        if (lines == null) return;

        long startTime = System.nanoTime();

        List<String> searchResult = lines.parallelStream()
                .filter(line -> line.contains(searchCriteria))
                .collect(Collectors.toList());

        System.out.println("Number of threads utilized: " + ForkJoinPool.commonPool().getParallelism());

        long endTime = System.nanoTime();
        if (printResults) {
            System.out.printf("PARALLEL STREAM - Time: %.3f ms, Results: %d%n", 
                (endTime - startTime) / 1_000_000.0, searchResult.size());
        }
    }

    public static void searchFileMultithreaded(String searchCriteria, boolean printResults) {
        List<String> lines = readFile(FILENAME);
        if (lines == null) return;

        List<String> searchResult = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threadPool = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OF_THREADS; i++) {
            final int threadIndex = i;
            Thread thread = new Thread(() -> {
                for (int j = threadIndex; j < lines.size(); j += NUM_OF_THREADS) {
                    if (lines.get(j).contains(searchCriteria)) searchResult.add(lines.get(j));
                }
            });
            thread.start();
            threadPool.add(thread);
        }

        for (Thread thread : threadPool) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        long endTime = System.nanoTime();
        if (printResults) {
            System.out.printf("MANUAL THREADS  - Time: %.3f ms, Results: %d%n", 
                (endTime - startTime) / 1_000_000.0, searchResult.size());
        }
    }

    public static void searchFile(String searchCriteria, boolean printResults) {
        List<String> lines = readFile(FILENAME);
        if (lines == null) return;

        List<String> searchResult = new ArrayList<>();

        long startTime = System.nanoTime();
        for (String line : lines) {
            if (line.contains(searchCriteria)) searchResult.add(line);
        }
        long endTime = System.nanoTime();

        if (printResults) {
            System.out.printf("SINGLE-THREADED - Time: %.3f ms, Results: %d%n", 
                (endTime - startTime) / 1_000_000.0, searchResult.size());
        }
    }
}
