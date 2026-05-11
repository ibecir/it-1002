package ba.edu.ibu.week11.livesession.groupb;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileIOperations {
    static void main() {
        List<String> myList = Arrays.asList(
                "Becir",
                "Object",
                "Oriented",
                "Programming"
        );
        // writeToFile("becir.txt", myList);
        // readFromFile("becir.txt");
        readFromFileWithStreams("becir.txt");
    }

    public static void writeToFile(String filename, List<String> content) {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(filename)
            );

            for (String line : content)
                writer.write(line + "\n");

            writer.close();
        } catch (IOException e) {

        }
    }

    public static void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    public static void readFromFileWithStreams(String filename) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("becir.txt")
            );

            // You are not allowed to read from a file twice by using the same buffered reader
            List<String> lines = reader.lines().toList();
            List<String> linesV2 = reader.lines().collect(Collectors.toList());

            for (String line : linesV2)
                System.out.println(line);

            reader.close();

            if(1 == 1)
                throw new InvalidAgeException("Who are you?", new RuntimeException());
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File was not found");
        } catch (IOException ioException) {
            System.out.println("Something bad happend while communicating with file!");
        } catch (NumberFormatException | NullPointerException exception) {
            System.out.println("Unable to parse your code!");
        } catch (InvalidAgeException invalidAgeException) {

        } finally {
            System.out.println("Becir Isakovic");
        }
    }
}
