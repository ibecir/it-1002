package ba.edu.ibu.week14.labs.prep4.abstraction;

public class StorePoints extends PointsManager {
    private int totalPoints;
    private String customerName;

    public StorePoints(String customerName) {
        this.customerName = customerName;
        this.totalPoints = 0;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addPoints(int points) {
        totalPoints = totalPoints + points;
        System.out.println(customerName + " earned " + points + " points.");
    }
}
