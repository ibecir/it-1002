package ba.edu.ibu.week13.lab.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SalesProcessor {

    public List<String> readLines(String address) {
        List<String> lines = new ArrayList<>();
        try {
            URL url = new URL(address);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Could not read from URL: " + e.getMessage());
        }
        return lines;
    }

    public static void main(String[] args) throws InterruptedException {
        String url = "https://raw.githubusercontent.com/MirzaKrupic/"
                   + "NetworkProgrammingLab/refs/heads/main/sales.csv";

        SalesProcessor processor = new SalesProcessor();
        List<String> lines = processor.readLines(url);

        if (lines.isEmpty()) {
            System.out.println("No data received.");
            return;
        }

        if (lines.get(0).startsWith("product")) {
            lines.remove(0);
        }

        int mid = lines.size() / 2;
        List<String> slice1 = new ArrayList<>(lines.subList(0, mid));
        List<String> slice2 = new ArrayList<>(lines.subList(mid, lines.size()));

        long[] results = new long[2];
        Thread t1 = new Thread(new SumTask(slice1, results, 0));
        Thread t2 = new Thread(new SumTask(slice2, results, 1));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long total = results[0] + results[1];
        System.out.println("Total sales amount: " + total);
    }
}
