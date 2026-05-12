package ba.edu.ibu.week11.livesession.groupa;

import java.io.*;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FileIOperations {
    private static final String FILE_NAME = "becirs.txt";

    static void main(String[] args) {
        List<String> content = Arrays.asList(
                "Object",
                "Oriented",
                "Programming",
                "IBU"
        );
        writeToFile(content, FileIOperations.FILE_NAME);
        //readFromFile(FileIOperations.FILE_NAME);
    }

    public static void writeToFile(List<String> content, String filename) {
        try {
            int a = Integer.parseInt("Becir");
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(filename)
            );

            for (String line : content)
                writer.write(line + "\n");
            writer.close();
        } catch (Throwable e) {
            if (e instanceof NumberFormatException)
                System.out.println("I'm unable to parse a string");
            System.out.println("Log it to a file");
        }
    }

    public static void readFromFile(String filename) {
        try {
            int a = Integer.parseInt("Becir");
            BufferedReader reader = new BufferedReader(
                    new FileReader(filename)
            );

            // 1st, naive approach
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 2nd approach
            List<String> lines = reader.lines().toList();
            // 3rd approach
            List<String> linesV2 = reader.lines().collect(Collectors.toList());

            for (String linev2 : linesV2)
                System.out.println(linev2);

            reader.close();
        } catch (IOException e) {
            System.out.println("Unable to read a file");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Unable to perform due to the error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Log to a file");
        } finally {
            System.out.println("I'm the boss!");
        }
    }
}
