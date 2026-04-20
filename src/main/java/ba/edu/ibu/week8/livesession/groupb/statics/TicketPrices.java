package ba.edu.ibu.week8.livesession.groupb.statics;

class TicketPrices {
    public static final double SINGLE_TICKET_ADULT = 2.50;
    public static final double TRAM_TICKET_ADULT = 2.50;

    public static double getSingleTicketAdult() {
        return TicketPrices.SINGLE_TICKET_ADULT;
    }
}

enum TickerPricesV2 {
    SINGLE_TICKET_ADULT(2.50),
    TRAM_TICKET_ADULT(2.50);

    private final double price;

    TickerPricesV2(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Person {
    private String name;
    private double money;
    private int age;

    // constructor
    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    // public static boolean isAdult - static is not allowed
    public boolean isAdult() {
        if (this.age < 18) { // We should not reflect to properties of an instance
            return false;
        }
        return true;
    }


    public String getName() {
        return this.name;
    }
}

