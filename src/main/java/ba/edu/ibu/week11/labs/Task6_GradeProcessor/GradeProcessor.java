package ba.edu.ibu.week11.labs.Task6_GradeProcessor;

import java.io.*;

public class GradeProcessor {
    private static final String FILE_NAME = "grades.txt";
    public void printValidGrades() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    StudentGrade sg = parseLine(line);
                    System.out.println(sg.name + ": " + sg.grade);
                } catch (InvalidGradeLineException e) {
                    System.out.println("Warning: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read grades file: " + e.getMessage());
        }
    }
    public double calculateAverage() {
        int sum = 0, count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    StudentGrade sg = parseLine(line);
                    sum += sg.grade;
                    count++;
                } catch (InvalidGradeLineException e) {
                    System.out.println("Skipping invalid line while calculating average: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not calculate average: " + e.getMessage());
        }
        return count == 0 ? 0 : (double) sum / count;
    }
    public void printPassedStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    StudentGrade sg = parseLine(line);
                    if (sg.grade >= 55) System.out.println(sg.name + " passed with grade " + sg.grade);
                } catch (InvalidGradeLineException e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read grades file: " + e.getMessage());
        }
    }
    private StudentGrade parseLine(String line) throws InvalidGradeLineException {
        if (line == null || line.trim().isEmpty()) throw new InvalidGradeLineException("Line is empty.");
        String[] parts = line.split(",");
        if (parts.length != 2) throw new InvalidGradeLineException("Line must contain name and grade separated by comma: " + line);
        String name = parts[0].trim();
        String gradeText = parts[1].trim();
        if (name.isEmpty()) throw new InvalidGradeLineException("Student name is missing.");
        try {
            int grade = Integer.parseInt(gradeText);
            if (grade < 0 || grade > 100) throw new InvalidGradeLineException("Grade must be between 0 and 100: " + line);
            return new StudentGrade(name, grade);
        } catch (NumberFormatException e) {
            throw new InvalidGradeLineException("Grade is not a valid number: " + line);
        }
    }
    private static class StudentGrade {
        private final String name;
        private final int grade;
        private StudentGrade(String name, int grade) { this.name = name; this.grade = grade; }
    }
}
