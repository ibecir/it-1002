package ba.edu.ibu.week11.labs.Task3_OddNumberIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OddNumberIterator implements Iterator<Integer> {
    private final int[] numbers;
    private int index;
    public OddNumberIterator(int[] numbers) {
        this.numbers = numbers == null ? new int[0] : numbers;
    }
    public boolean hasNext() {
        while (index < numbers.length) {
            if (numbers[index] > 0 && numbers[index] % 2 != 0) return true;
            index++;
        }
        return false;
    }
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException("There are no more positive odd numbers.");
        return numbers[index++];
    }
}
