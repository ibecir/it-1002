package ba.edu.ibu.week11.labs.ultimate_java_solution;

import java.io.*;

public class TextAnalyzer {

    public void printTextLength(String text) {
        if (text == null) {
            System.out.println("Cannot analyze null text.");
            return;
        }

        System.out.println(text.length());
    }

    public void printWordCount(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        System.out.println(text.trim().split("\\s+").length);
    }

    public void printFirstLine(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            System.out.println(br.readLine());
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NullPointerException e) {
            System.out.println("File path is null.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public void printAllLines(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;
            int counter = 1;
            boolean empty = true;

            while ((line = br.readLine()) != null) {
                empty = false;
                System.out.println(counter + ". " + line);
                counter++;
            }

            if (empty) {
                System.out.println("File is empty.");
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}