package ba.edu.ibu.week14.labs.prep1.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee implements Trainable, Expense {
    private HashMap<String, List<Double>> expenses;

    public Employee() {
        expenses = new HashMap<>();
    }

    public void enroll() {
        System.out.println("Employee enrolled in training.");
    }

    public void recordExpense(String date, double amount) {
        if (!expenses.containsKey(date)) {
            expenses.put(date, new ArrayList<>());
        }
        expenses.get(date).add(amount);
    }

    public double getTotalExpense(String date) {
        double total = 0.0;
        if (expenses.containsKey(date)) {
            for (double amount : expenses.get(date)) {
                total = total + amount;
            }
        }
        return total;
    }
}
