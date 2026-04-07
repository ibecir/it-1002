package ba.edu.ibu.week6.livesession;

public class Person {
    private String name;
    private int birthYear;
    private double balance;

    public Person(String name, int birthYear) {
        this.name = name;
        if(birthYear > 0 && birthYear < 2026)
            this.birthYear = birthYear;
        else
            this.birthYear = 2000;
        this.balance = 0.0;
    }
    public Person(String name, int birthYear, double balance) {
        this(name, birthYear);
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        if(birthYear < 0 || birthYear > 2026)
            System.out.println("Invalid attribute value");
        else
            this.birthYear = birthYear;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if(amount <= 0 || amount > 10_000)
            System.out.println("Invalid amount");
        else
            this.balance += amount;

        return this.balance;
    }
    public double withdraw(int amount) {
        if(amount <= 0 || amount >= 10000)
            System.out.println("Invalid amount");
        else if (amount > this.balance)
            System.out.println("Insufficient funds");
        else
            this.balance -= amount;

        return this.balance;
    }

    public boolean isOlder(Person person) {
        // return person.getBirthYear() < this.birthYear; - shorter version of the same logic below
        if (person.getBirthYear() < this.birthYear)
            return true;
        return false;
    }
}

class RunMe {
    static void main(String[] args) {
        Person becir = new Person("Becir", 1994);
        Person alem = new Person("Alem", 2005, 999999999);

        System.out.println(alem.isOlder(becir));
    }
}
