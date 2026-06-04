package ba.edu.ibu.week14.labs.prep3.inheritance;

public class ExpressShipping extends Shipping {
    private int priorityLevel;

    public ExpressShipping(double baseFee, double weight, int priorityLevel) {
        super(baseFee, weight);
        this.priorityLevel = priorityLevel;
    }

    public double calculateFee() {
        return getBaseFee() + (getWeight() * 3) + (priorityLevel * 10);
    }
}
