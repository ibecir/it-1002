package ba.edu.ibu.week14.labs.prep2.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee implements Assignable, Workable {
    private HashMap<String, List<Double>> workHours;

    public Employee() {
        workHours = new HashMap<>();
    }

    public void assignProject(String projectName) {
        System.out.println("Employee assigned to project: " + projectName + ".");
    }

    public void logWorkHours(String date, double hours) {
        if (!workHours.containsKey(date)) {
            workHours.put(date, new ArrayList<>());
        }
        workHours.get(date).add(hours);
    }

    public double getTotalWorkHours(String date) {
        double total = 0.0;
        if (workHours.containsKey(date)) {
            for (double hours : workHours.get(date)) {
                total = total + hours;
            }
        }
        return total;
    }
}
