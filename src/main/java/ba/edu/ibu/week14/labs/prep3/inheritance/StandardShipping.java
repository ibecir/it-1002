package ba.edu.ibu.week14.labs.prep3.inheritance;

public class StandardShipping extends Shipping {
    private double distance;

    public StandardShipping(double baseFee, double weight, double distance) {
        super(baseFee, weight);
        this.distance = distance;
    }

    public double calculateFee() {
        return getBaseFee() + (getWeight() * 2) + (distance * 0.5);
    }
}
