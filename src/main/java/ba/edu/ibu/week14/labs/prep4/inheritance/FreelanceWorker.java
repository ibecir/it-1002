package ba.edu.ibu.week14.labs.prep4.inheritance;

public class FreelanceWorker extends Worker {
    private int projectsDone;

    public FreelanceWorker(String name, int baseRate, int projectsDone) {
        super(name, baseRate);
        this.projectsDone = projectsDone;
    }

    public double calculateSalary() {
        return getBaseRate() * projectsDone * 0.90;
    }
}
