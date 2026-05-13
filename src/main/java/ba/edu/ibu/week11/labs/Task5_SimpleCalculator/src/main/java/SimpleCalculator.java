package ba.edu.ibu.week11.labs.Task5_SimpleCalculator.src.main.java;

public class SimpleCalculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }
    public boolean isEven(int number) { return number % 2 == 0; }
}
