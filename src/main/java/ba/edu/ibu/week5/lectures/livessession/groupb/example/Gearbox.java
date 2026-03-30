package ba.edu.ibu.week5.lectures.livessession.groupb.example;

public class Gearbox extends Component{
    private int numberOfGears;

    public int getNumberOfGears() {
        return numberOfGears;
    }
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Gearbox(String date, String id, Producer producer, int numberOfGears) {
        super(date, id, producer);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGearbox{" +
                "numberOfGears=" + numberOfGears +
                '}';
    }
}
