package ba.edu.ibu.week14.labs.prep2.inheritance;

public class Income {
    private double amount;
    private double taxRate;

    public Income(double amount, double taxRate) {
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax() {
        return 0.0;
    }
}
