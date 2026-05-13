package ba.edu.ibu.week11.labs.ultimate_java_solution;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Amir Hasanovic", "amir@example.com", 21, 85);
        Student s2 = new Student("Ali", "ali@example.com", 20, 70);
        Student s3 = new Student("Sara2", "sara@example.com", 19, 90);

        Student[] students = {s1, s2, s3};

        StudentFileManager manager = new StudentFileManager();

        manager.saveAllStudents(students);

        manager.printAllStudents();

        System.out.println("Total students: " + manager.countStudents());

        ValidStudentIterator iterator = new ValidStudentIterator(students);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        GradeProcessor gp = new GradeProcessor();

        gp.printValidGrades();
        gp.printPassedStudents();

        System.out.println(gp.calculateAverage());

        TextAnalyzer ta = new TextAnalyzer();

        ta.printTextLength("Java programming");
        ta.printWordCount("Java programming is powerful");
    }
}