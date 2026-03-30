package ba.edu.ibu.week4.livesession.groupa;

class Person {
    /* Attributes / properties of the class */
    private String name;
    public int yearOfBirth;
    // READ ONLY PROPERTIES
    public double balance;
    private String password;
    /* End of attributes / properties of the class */

    /* Getters and setters */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    /* End getters and setters */

    /* Constructors section */
    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(String name, int yearOfBirth, double ubdsijfndsfdbifdubdidfibdfui){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        if (this.balance >= 0)
            this.balance = ubdsijfndsfdbifdubdidfibdfui;
    }
    public Person(String name, int yearOfBirth, double balance, String password){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.balance = balance;
        this.password = password;
    }
    /* End of constructors section */

    /* Custom, class related, methods */
    public void deposit(double amount) {
        if(amount <= 0)
            System.out.println("You cannot deposit invalid funds");
        else
            this.balance += amount;
    }
    public void withdraw(double amount) {
        if(amount > this.balance)
            System.out.println("You cannot get what you do not have");
        else
            this.balance -= amount;
    }

    public void withdraw() {
        System.out.println("You cannot get what you do not have");
    }

    public static double getMeBalance() {
        return 15;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
               "Year of birth: " + this.getYearOfBirth() + "\n" +
               "Balance: " + this.getBalance();
    }
    /* End of custom, class related, methods */
}

class Main {
    public static void main(String[] args) {
        Person becir = new Person("Becir");
        System.out.println(becir.getName());

        Person faris = new Person("Faris", 2000, 0.0);
        System.out.println(faris.getName());

        Person isa = new Person("Isa", 2004, 11111111);
        System.out.println(isa.getBalance());

        //isa.setBalance(-10002321);
        //System.out.println(isa.getBalance());

        Person isaNew = new Person("Isa", 2004, 11111111);
        System.out.println(isa.getBalance());

        isa.deposit(100);
        isa.withdraw(20);

        System.out.println(isa);

        Person.getMeBalance();

        Person b = new Person();
        b.setName("Becir");
        System.out.println(b.getName());
    }
}

class House {
    private String address;
    private double price;
    private Color color;
    private int numberOfBathrooms;
    private int numberOfRooms;
    private int size;
    private boolean pool;
    private boolean garden;
    private boolean ac;
    private boolean garage;
    private int numberOfFloors;

    public House(boolean ac, String address, Color color, boolean garage, boolean garden, int numberOfBathrooms, int numberOfFloors, int numberOfRooms, boolean pool, double price, int size) {
        this.ac = ac;
        this.address = address;
        this.color = color;
        this.garage = garage;
        this.garden = garden;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.pool = pool;
        this.price = price;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                ", price=" + price +
                ", color=" + color +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfRooms=" + numberOfRooms +
                ", size=" + size +
                ", pool=" + pool +
                ", garden=" + garden +
                ", garage=" + garage +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

enum Color {
    BLUE, RED, WHITE
}


