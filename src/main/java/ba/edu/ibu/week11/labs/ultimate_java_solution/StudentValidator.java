package ba.edu.ibu.week11.labs.ultimate_java_solution;

public class StudentValidator {

    public void validateName(String name) throws InvalidStudentException {
        if (name == null || name.trim().length() < 5 || name.matches(".*\\d.*")) {
            throw new InvalidStudentException("Invalid student name.");
        }
    }

    public void validateEmail(String email) throws InvalidStudentException {
        if (email == null || !email.contains("@") || !email.contains(".") || email.contains(" ")) {
            throw new InvalidStudentException("Invalid email.");
        }
    }

    public void validateAge(int age) throws InvalidStudentException {
        if (age < 18 || age > 100) {
            throw new InvalidStudentException("Invalid age.");
        }
    }

    public void validateGrade(int grade) throws InvalidStudentException {
        if (grade < 0 || grade > 100) {
            throw new InvalidStudentException("Invalid grade.");
        }
    }

    public void validateStudent(Student student) throws InvalidStudentException {
        validateName(student.getFullName());
        validateEmail(student.getEmail());
        validateAge(student.getAge());
        validateGrade(student.getGrade());
        System.out.println("Student is valid.");
    }
}