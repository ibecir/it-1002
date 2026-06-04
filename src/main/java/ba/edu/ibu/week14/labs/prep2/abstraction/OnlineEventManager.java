package ba.edu.ibu.week14.labs.prep2.abstraction;

public class OnlineEventManager extends EventManager {
    private String eventName;
    private String scheduledDate;

    public OnlineEventManager(String eventName) {
        this.eventName = eventName;
        this.scheduledDate = "";
    }

    public String getEventName() {
        return eventName;
    }

    public void scheduleEvent(String eventDate) {
        scheduledDate = eventDate;
        System.out.println("Event " + eventName + " scheduled for " + scheduledDate + ".");
    }
}
