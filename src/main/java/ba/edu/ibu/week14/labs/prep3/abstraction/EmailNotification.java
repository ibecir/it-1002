package ba.edu.ibu.week14.labs.prep3.abstraction;

public class EmailNotification extends AbstractNotification {
    private String subject;
    private String lastSentTo;

    public EmailNotification(String subject) {
        this.subject = subject;
        this.lastSentTo = "";
    }

    public String getSubject() {
        return subject;
    }

    public void send(String recipient) {
        lastSentTo = recipient;
        System.out.println("Email with subject '" + subject + "' sent to " + recipient + ".");
    }
}
