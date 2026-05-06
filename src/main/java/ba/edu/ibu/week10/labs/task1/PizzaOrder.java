package ba.edu.ibu.week10.labs.task1;

@MenuCategory(name = "Pizza", available = true)
public class PizzaOrder {

    @FieldValidation(maxLength = 30, nullable = false)
    private String customerName;

    @FieldValidation(maxLength = 100, nullable = true)
    private String specialRequest;

    @FieldValidation(maxLength = 20, nullable = false)
    private String itemName;

    public PizzaOrder(String customerName, String specialRequest, String itemName) {
        this.customerName = customerName;
        this.specialRequest = specialRequest;
        this.itemName = itemName;
    }

    @OrderAction(handledBy = "Cashier", estimatedMinutes = 2, requiresPayment = false)
    public void takeOrder() {
        System.out.println("Taking the order...");
    }

    @OrderAction(handledBy = "Chef", estimatedMinutes = 15)
    public void prepareFood() {
        System.out.println("Preparing the pizza...");
    }

    @OrderAction(handledBy = "Cashier", requiresPayment = true)
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}