package ba.edu.ibu.week11.labs.ultimate_java_solution;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ValidStudentIterator implements Iterator<Student> {

    private Student[] students;
    private int index = 0;
    private StudentValidator validator = new StudentValidator();

    public ValidStudentIterator(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        while (index < students.length) {
            try {
                validator.validateStudent(students[index]);
                return true;
            } catch (InvalidStudentException e) {
                index++;
            }
        }

        return false;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return students[index++];
    }
}