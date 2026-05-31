package ba.edu.ibu.week13.lab.task1;

import java.util.List;

public class SumTask implements Runnable {
    private List<String> slice;
    private long[] results;
    private int index;

    public SumTask(List<String> slice, long[] results, int index) {
        this.slice = slice;
        this.results = results;
        this.index = index;
    }

    @Override
    public void run() {
        long sum = 0;
        for (String line : slice) {
            String[] parts = line.split(",");
            if (parts.length != 2) {
                continue;
            }
            try {
                sum += Long.parseLong(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid: amount is not a number, skip it");
            }
        }
        results[index] = sum;
    }
}
