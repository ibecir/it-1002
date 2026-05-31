package ba.edu.ibu.week13.lab.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GradeProcessor {

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
                   + "NetworkProgrammingLab/refs/heads/main/grades.csv";

        GradeProcessor processor = new GradeProcessor();
        List<String> lines = processor.readLines(url);

        if (lines.isEmpty()) {
            System.out.println("No data received.");
            return;
        }

        if (lines.get(0).startsWith("student")) {
            lines.remove(0);
        }

        PassCounter counter = new PassCounter();

        int third = lines.size() / 3;
        List<String> slice1 = new ArrayList<>(lines.subList(0, third));
        List<String> slice2 = new ArrayList<>(lines.subList(third, 2 * third));
        List<String> slice3 = new ArrayList<>(lines.subList(2 * third, lines.size()));

        Thread t1 = new Thread(new CountTask(slice1, counter));
        Thread t2 = new Thread(new CountTask(slice2, counter));
        Thread t3 = new Thread(new CountTask(slice3, counter));

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Students who passed: " + counter.getPassed());
    }
}
