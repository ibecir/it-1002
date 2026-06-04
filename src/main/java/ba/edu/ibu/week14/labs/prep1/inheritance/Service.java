package ba.edu.ibu.week14.labs.prep1.inheritance;

public class Service {
    private String name;
    private int baseFee;

    public Service(String name, int baseFee) {
        this.name = name;
        this.baseFee = baseFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public double calculateFee() {
        return 0.0;
    }
}
