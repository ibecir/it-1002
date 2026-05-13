package ba.edu.ibu.week11.labs.ultimate_java_solution;

import java.io.*;

public class StudentFileManager {
    private static final String FILE_NAME = "students.txt";
    private StudentValidator validator = new StudentValidator();

    public void saveStudent(Student student) {
        try {
            validator.validateStudent(student);

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(student.getFullName() + "," + student.getEmail() + "," +
                    student.getAge() + "," + student.getGrade());
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudents(Student[] students) {
        if (students == null) {
            System.out.println("Student array is null.");
            return;
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for (Student student : students) {
                try {
                    validator.validateStudent(student);

                    bw.write(student.getFullName() + "," + student.getEmail() + "," +
                            student.getAge() + "," + student.getGrade());
                    bw.newLine();

                } catch (InvalidStudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("File error.");
        }
    }

    public void printAllStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            int counter = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(counter + ". " + line);
                counter++;
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No student file found.");
        } catch (IOException e) {
            System.out.println("File reading error.");
        }
    }

    public int countStudents() {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            while (br.readLine() != null) {
                count++;
            }

            br.close();

        } catch (Exception e) {
            return 0;
        }

        return count;
    }
}