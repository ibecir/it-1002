package ba.edu.ibu.week14.labs.prep4.inheritance;

public class FullTimeWorker extends Worker {
    private int monthsWorked;

    public FullTimeWorker(String name, int baseRate, int monthsWorked) {
        super(name, baseRate);
        this.monthsWorked = monthsWorked;
    }

    public double calculateSalary() {
        return getBaseRate() * monthsWorked * 1.10;
    }
}
