package ba.edu.ibu.week11.labs.Task6_GradeProcessor;

public class Main {
    public static void main(String[] args) {
        GradeProcessor processor = new GradeProcessor();
        System.out.println("Valid grades:");
        processor.printValidGrades();
        System.out.println();
        System.out.println("Passed students:");
        processor.printPassedStudents();
        System.out.println();
        System.out.println("Average grade: " + processor.calculateAverage());
    }
}
