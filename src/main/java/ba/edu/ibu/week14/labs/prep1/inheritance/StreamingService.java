package ba.edu.ibu.week14.labs.prep1.inheritance;

public class StreamingService extends Service {
    private int subscriptionLength;

    public StreamingService(String name, int baseFee, int subscriptionLength) {
        super(name, baseFee);
        this.subscriptionLength = subscriptionLength;
    }

    public double calculateFee() {
        return getBaseFee() * subscriptionLength * 1.05;
    }
}
