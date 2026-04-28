package ba.edu.ibu.week9.livesession.groupa;

import java.util.Objects;

public class House {
    private String address;
    private int size;
    private boolean garden;
    private int numberOfFloors;
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    public House(String address, boolean garden, int numberOfBathrooms, int numberOfBedrooms, int numberOfFloors, int size) {
        this.address = address;
        this.garden = garden;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfFloors = numberOfFloors;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return size == house.size && garden == house.garden && numberOfFloors == house.numberOfFloors && numberOfBedrooms == house.numberOfBedrooms && numberOfBathrooms == house.numberOfBathrooms && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, size, garden, numberOfFloors, numberOfBedrooms, numberOfBathrooms);
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", size=" + size +
                ", garden=" + garden +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}

record HouseRecord(
        String address,
        int size,
        boolean garden,
        int numberOfFloors,
        int numberOfBedrooms,
        int numberOfBathrooms
){
    private static int boolSize;

    public HouseRecord(String address) {
        this(address, 1, false, 0, 0,0);
    }

    public void sayHello() {
        System.out.println("Hello my beutife house on " + this.address);
    }
}

class MainRun {
    static void main(String[] args) {
        HouseRecord house = new HouseRecord("a",1,true,1,1,1);
        System.out.println(house);

        HouseRecord house2 = new HouseRecord("b",1,true,1,1,1);
        System.out.println(house.equals(house2));

        System.out.println(house.address());
    }
}