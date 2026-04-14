package ba.edu.ibu.week7.lectures.livesession.interfaces;

interface Payable {
    void pay(double amount, String cardNumber, String expirationDate, String cvc);
    default void whoAmI() {
        System.out.println("I'm not good type of method");
    }
}

class Stripe implements Payable {
    private String customerName;
    private String cardNumber;
    private String expirationDate;
    private String cvc;

    public Stripe(String cardNumber, String customerName, String cvc, String expirationDate) {
        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.cvc = cvc;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCvc() {
        return cvc;
    }
    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount, String cardNumber, String expirationDate, String cvc) {
        System.out.println("I'm paying with the Stripe payment processor");
    }
}

class Monri implements Payable{
    private String customerName;
    private String cardNumber;
    private String expirationDate;
    private String cvc;

    public Monri(String cardNumber, String customerName, String cvc, String expirationDate) {
        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.cvc = cvc;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCvc() {
        return cvc;
    }
    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount, String cardNumber, String expirationDate, String cvc) {
        System.out.println("I'm paying with the Monri payment processor");
    }
}

class RunMe {
    static void main(String[] args) {
        Stripe bingoPayment = new Stripe("1234567", "Becir Isakovic", "123", "12/26");
        Monri amkoPayment = new Monri("1234567231", "Becir Isakovic", "123", "12/26");

        Payable a = new Stripe("1234567", "Becir Isakovic", "123", "12/26");

        performPayment(bingoPayment, 15.14);
        performPayment(amkoPayment, 18.99);
    }

    public static boolean performPayment(Payable paymentProcessor, double amount) {
        if (paymentProcessor instanceof Stripe) {
            Stripe s = (Stripe) paymentProcessor;
            s.pay(amount,s.getCardNumber(),s.getExpirationDate(),s.getCvc());
            return true;
        } else {
            paymentProcessor.pay(amount,"123123","12312","21312312213");
            return true;
        }
    }
}