package ba.edu.ibu.week14.labs.prep1.abstraction;

public class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    public int getActiveMonths() {
        return activeMonths;
    }

    public void renewSubscription(int months) {
        activeMonths = activeMonths + months;
        System.out.println("Subscription for " + serviceName + " renewed for " + months + " months.");
    }
}
