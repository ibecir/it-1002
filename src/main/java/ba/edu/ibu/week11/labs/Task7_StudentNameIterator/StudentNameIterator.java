package ba.edu.ibu.week11.labs.Task7_StudentNameIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentNameIterator implements Iterator<String> {
    private final String[] names;
    private int index;
    public StudentNameIterator(String[] names) {
        this.names = names == null ? new String[0] : names;
    }
    public boolean hasNext() {
        while (index < names.length) {
            if (names[index] != null && !names[index].trim().isEmpty()) return true;
            index++;
        }
        return false;
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException("There are no more valid student names.");
        return names[index++].trim().toUpperCase();
    }
}

