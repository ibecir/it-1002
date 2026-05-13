package ba.edu.ibu.week11.labs.Task4_SafeFileReader;

import java.io.*;

public class SafeFileReader {
    public void printFirstLine(String filePath) {
        if (filePath == null) {
            System.out.println("File path cannot be null.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            System.out.println(firstLine == null ? "File is empty." : "First line: " + firstLine);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
    public void printAllLines(String filePath) {
        if (filePath == null) {
            System.out.println("File path cannot be null.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            boolean hasContent = false;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
                hasContent = true;
            }
            if (!hasContent) System.out.println("File is empty.");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
    public void printLength(String input) {
        try {
            System.out.println("Length: " + input.length());
        } catch (NullPointerException e) {
            System.out.println("Input cannot be null.");
        }
    }
    public void printWordCount(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }
        System.out.println("Word count: " + input.trim().split("\s+").length);
    }
}
