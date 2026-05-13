package ba.edu.ibu.week11.labs.ultimate_java_solution;

public class Student {
    private String fullName;
    private String email;
    private int age;
    private int grade;

    public Student(String fullName, String email, int age, int grade) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return fullName + " | " + email + " | Age: " + age + " | Grade: " + grade;
    }
}