package ba.edu.ibu.week5.lectures.livessession.groupa.examples;

public class Engine extends Component{
    private double size;
    private FuelType fuelType;

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public Engine(String name, int year, String description, Producer producer, double size, FuelType fuelType) {
        super(name, year, description, producer);
        this.size = size;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEngine{" +
                "fuelType=" + fuelType +
                ", size=" + size +
                '}';
    }

    @Override
    public int getComponentAge() {
        return 155;
    }
}

enum FuelType {
    ELECTRIC, DIESEL, GASOLINE, LPG
}
