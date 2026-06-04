package ba.edu.ibu.week14.labs.prep1.inheritance;

public class ConsultingService extends Service {
    private int hoursWorked;

    public ConsultingService(String name, int baseFee, int hoursWorked) {
        super(name, baseFee);
        this.hoursWorked = hoursWorked;
    }

    public double calculateFee() {
        return getBaseFee() * hoursWorked * 1.20;
    }
}
