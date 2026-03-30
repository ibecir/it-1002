package ba.edu.ibu.week5.lectures.livessession.groupb.example;

public class Component {
    private String id;
    private String date;
    private Producer producer;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Producer getProducer() {
        return producer;
    }
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Component(String date, String id, Producer producer) {
        this.date = date;
        this.id = id;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Component{" +
                "date='" + date + '\'' +
                ", id='" + id + '\'' +
                ", producer=" + producer +
                '}';
    }

    public int componentAge() {
        return 10;
    }
}
