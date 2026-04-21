package ba.edu.ibu.week8.livesession.groupa.statics;

class TicketPrices {
    public static final double SINGLE_TICKET_ADULT = 2.50;
    public static final double TRAM_TICKET_ADULT = 2.70;
}

enum Gender {
    MALE, FEMALE;
}

enum EnumTicketPrices {
    SINGLE_TICKET_ADULT(2.50),
    TRAM_TICKET_ADULT(2.70);

    private final double price;

    EnumTicketPrices(double price) {
        this.price = price;
    }
}

class Person {
    private String name;
    private double money;

    // constructor
    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }
    public double getMoney() {
        return this.money;
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            this.money += amount;
        }
    }

    public boolean enoughMoneyForSingleTicket() {
        if(this.money >= TicketPrices.SINGLE_TICKET_ADULT) {
            return true;
        }

        return false;
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name) {
        this.age = 0;
        this.name = name;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public void becomeOlder() {
        this.age++;
    }

    public String getName() {
        return this.name;
    }
}


