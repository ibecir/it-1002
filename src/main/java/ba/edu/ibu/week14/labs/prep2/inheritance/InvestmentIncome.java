package ba.edu.ibu.week14.labs.prep2.inheritance;

public class InvestmentIncome extends Income {
    private String investmentType;

    public InvestmentIncome(double amount, double taxRate, String investmentType) {
        super(amount, taxRate);
        this.investmentType = investmentType;
    }

    public double calculateTax() {
        return getAmount() * getTaxRate() * 1.15;
    }
}
