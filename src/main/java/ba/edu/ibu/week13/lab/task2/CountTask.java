package ba.edu.ibu.week13.lab.task2;

import java.util.List;

public class CountTask implements Runnable {
    private List<String> slice;
    private PassCounter counter;

    public CountTask(List<String> slice, PassCounter counter) {
        this.slice = slice;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (String line : slice) {
            String[] parts = line.split(",");
            if (parts.length != 2) {
                continue;
            }
            try {
                int grade = Integer.parseInt(parts[1].trim());
                if (grade >= 0 && grade <= 100 && grade >= 55) {
                    counter.increment();
                }
            } catch (NumberFormatException e) {
                System.out.println("grade is not a number, skip");
            }
        }
    }
}
