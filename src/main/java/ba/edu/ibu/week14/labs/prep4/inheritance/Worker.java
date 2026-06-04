package ba.edu.ibu.week14.labs.prep4.inheritance;

public class Worker {
    private String name;
    private int baseRate;

    public Worker(String name, int baseRate) {
        this.name = name;
        this.baseRate = baseRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public double calculateSalary() {
        return 0.0;
    }
}
