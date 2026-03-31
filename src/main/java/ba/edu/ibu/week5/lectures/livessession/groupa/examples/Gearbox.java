package ba.edu.ibu.week5.lectures.livessession.groupa.examples;

public class Gearbox extends Component{
    private int numberOfSpeeds;
    private String type;

    public int getNumberOfSpeeds() {
        return numberOfSpeeds;
    }
    public void setNumberOfSpeeds(int numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Gearbox(String name, int year, String description, Producer producer, int numberOfSpeeds, String type) {
        super(name, year, description, producer);
        this.numberOfSpeeds = numberOfSpeeds;
        this.type = type;
    }
}
