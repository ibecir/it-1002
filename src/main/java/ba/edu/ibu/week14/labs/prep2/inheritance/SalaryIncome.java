package ba.edu.ibu.week14.labs.prep2.inheritance;

public class SalaryIncome extends Income {
    private double bonus;

    public SalaryIncome(double amount, double taxRate, double bonus) {
        super(amount, taxRate);
        this.bonus = bonus;
    }

    public double calculateTax() {
        return getAmount() * getTaxRate() + bonus * 0.10;
    }
}
