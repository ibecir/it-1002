package ba.edu.ibu.week11.labs.ultimate_java_solution;

import java.io.*;

public class GradeProcessor {

    private static final String FILE_NAME = "grades.txt";

    public void printValidGrades() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 2) {
                    continue;
                }

                try {
                    int grade = Integer.parseInt(parts[1]);

                    if (grade >= 0 && grade <= 100) {
                        System.out.println(parts[0] + ": " + grade);
                    }

                } catch (NumberFormatException e) {
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading grades.");
        }
    }

    public double calculateAverage() {
        int sum = 0;
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 2) {
                    continue;
                }

                try {
                    int grade = Integer.parseInt(parts[1]);

                    if (grade >= 0 && grade <= 100) {
                        sum += grade;
                        count++;
                    }

                } catch (NumberFormatException e) {
                }
            }

            br.close();

        } catch (IOException e) {
            return 0;
        }

        return count == 0 ? 0 : (double) sum / count;
    }

    public void printPassedStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 2) {
                    continue;
                }

                try {
                    int grade = Integer.parseInt(parts[1]);

                    if (grade >= 55 && grade <= 100) {
                        System.out.println(parts[0]);
                    }

                } catch (NumberFormatException e) {
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading grades.");
        }
    }
}