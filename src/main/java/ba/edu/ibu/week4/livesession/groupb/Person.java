package ba.edu.ibu.week4.livesession.groupb;

import java.util.Objects;

class Person {
    // ############################ //
    private String name;
    private int yearOfBirth;
    private double amountOfMoney;
    // ############################ //

    // ############################ //
    public Person() {}
    public Person(String name) {
        this.name = name;
        this.yearOfBirth = 2000;
    }
    public Person(String name, int yearOfBirthdxtcgsgidhosidhfojsifjdojfdjsifjdsijfdsjfodsnfjdsnfjkdsnfkldjsnfslkdn, double amountOfMoney) {
        this.name = name;
        this.yearOfBirth = yearOfBirthdxtcgsgidhosidhfojsifjdojfdjsifjdsijfdsjfodsnfjdsnfjkdsnfkldjsnfslkdn;
        this.amountOfMoney = amountOfMoney;
    }
    // ############################ //

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setAmountOfMoney(double amount) {
        if(amount <= 0)
            System.out.println("You are a bastard!!!!");
        else
            this.amountOfMoney = amount;
    }
    public double getAmountOfMoney() {
        return this.amountOfMoney;
    }

    // ############################ //
    public void withdrawMoney(double amount){
        this.amountOfMoney -= amount;
    }
    public void depositMoney(double amount){
        this.amountOfMoney += amount;
    }
    public int getPersonAge() {
        return 2026 - this.yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
               ", Year of birth: " + this.getYearOfBirth() +
               ", Money: " + this.getAmountOfMoney();
    }
    // ############################ //
}

class RunMe {
    public static void main(String[] args) {
        Person becir = new Person("Becir", 1994, -50);
        Person amina = new Person("Amina");
        becir.setAmountOfMoney(-1000000000);

        System.out.println(becir);
    }
}

class House {
    private String address;
    private int size;
    private int numOfRooms;
    private int numOfBathrooms;
    private boolean pool;
    private boolean garden;
    private String color;
    private int postalCode;
    private String previousOwner;
    private boolean ac;

    public House(boolean ac, String address, String color, boolean garden, int numOfBathrooms, int numOfRooms, boolean pool, int postalCode, String previousOwner, int size) {
        this.ac = ac;
        this.address = address;
        this.color = color;
        this.garden = garden;
        this.numOfBathrooms = numOfBathrooms;
        this.numOfRooms = numOfRooms;
        this.pool = pool;
        this.postalCode = postalCode;
        this.previousOwner = previousOwner;
        this.size = size;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPreviousOwner() {
        return previousOwner;
    }

    public void setPreviousOwner(String previousOwner) {
        this.previousOwner = previousOwner;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "House{" +
                "ac=" + ac +
                ", address='" + address + '\'' +
                ", size=" + size +
                ", numOfRooms=" + numOfRooms +
                ", numOfBathrooms=" + numOfBathrooms +
                ", pool=" + pool +
                ", garden=" + garden +
                ", color='" + color + '\'' +
                ", postalCode=" + postalCode +
                ", previousOwner='" + previousOwner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return size == house.size && numOfRooms == house.numOfRooms && numOfBathrooms == house.numOfBathrooms && pool == house.pool && garden == house.garden && postalCode == house.postalCode && ac == house.ac && Objects.equals(address, house.address) && Objects.equals(color, house.color) && Objects.equals(previousOwner, house.previousOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, size, numOfRooms, numOfBathrooms, pool, garden, color, postalCode, previousOwner, ac);
    }
}