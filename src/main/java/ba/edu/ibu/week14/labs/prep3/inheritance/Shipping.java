package ba.edu.ibu.week14.labs.prep3.inheritance;

public class Shipping {
    private double baseFee;
    private double weight;

    public Shipping(double baseFee, double weight) {
        this.baseFee = baseFee;
        this.weight = weight;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateFee() {
        return 0.0;
    }
}
