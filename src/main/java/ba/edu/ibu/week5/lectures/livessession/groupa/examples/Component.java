package ba.edu.ibu.week5.lectures.livessession.groupa.examples;

public class Component {
    private String name;
    private int yearOfProduction;
    private String description;
    private Producer producer;

    public Component(String name, int year, String description, Producer producer) {
        this.name = name;
        this.yearOfProduction = year;
        this.description = description;
        this.producer = producer;
    }
    public Component(String description, String name, Producer producer) {
        this.description = description;
        this.name = name;
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Producer getProducer() {
        return producer;
    }
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getComponentAge() {
        return 2026 - this.yearOfProduction;
    }

    @Override
    public String toString() {
        return "Component{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", producer=" + producer +
                '}';
    }
}

enum Producer {
    BMW, VW, PORSCHE
}

class RunAndDeleteMe {
    static void main(String[] args) {
        Component engine = new Component("2.0 TDI DI CRVENO", 1998, "Good engine", Producer.VW);
        System.out.println(engine);
    }
}