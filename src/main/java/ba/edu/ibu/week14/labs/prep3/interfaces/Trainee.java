package ba.edu.ibu.week14.labs.prep3.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trainee implements Trainable, Trackable {
    private HashMap<String, List<Integer>> sessions;

    public Trainee() {
        sessions = new HashMap<>();
    }

    public void enrollInCourse(String courseName) {
        System.out.println("Trainee enrolled in course: " + courseName + ".");
    }

    public void recordSession(String date, int duration) {
        if (!sessions.containsKey(date)) {
            sessions.put(date, new ArrayList<>());
        }
        sessions.get(date).add(duration);
    }

    public int getTotalSessionTime(String date) {
        int total = 0;
        if (sessions.containsKey(date)) {
            for (int duration : sessions.get(date)) {
                total = total + duration;
            }
        }
        return total;
    }
}
