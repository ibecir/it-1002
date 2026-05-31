package ba.edu.ibu.week13.lab.task2;

public class PassCounter {
    private int passed = 0;

    public synchronized void increment() {
        passed++;
    }

    public int getPassed() {
        return passed;
    }
}
