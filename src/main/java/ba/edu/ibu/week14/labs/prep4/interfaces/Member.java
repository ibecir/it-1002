package ba.edu.ibu.week14.labs.prep4.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Member implements Borrowable, Finable {
    private HashMap<String, List<Double>> fines;

    public Member() {
        fines = new HashMap<>();
    }

    public void borrowBook() {
        System.out.println("Member borrowed a book.");
    }

    public void recordFine(String date, double amount) {
        if (!fines.containsKey(date)) {
            fines.put(date, new ArrayList<>());
        }
        fines.get(date).add(amount);
    }

    public double getTotalFine(String date) {
        double total = 0.0;
        if (fines.containsKey(date)) {
            for (double amount : fines.get(date)) {
                total = total + amount;
            }
        }
        return total;
    }
}
