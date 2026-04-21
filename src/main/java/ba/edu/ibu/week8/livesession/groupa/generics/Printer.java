package ba.edu.ibu.week8.livesession.groupa.generics;

import ba.edu.ibu.week6.livesession.Person;

class IntegerPrinter {
    private int value;

    public IntegerPrinter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println(this.value);
    }
}

class DoublePrinter {
    private double value;

    public DoublePrinter(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public void print() {
        System.out.println(this.value);
    }
}

class StringPrinter {
    private String value;

    public StringPrinter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println(this.value);
    }
}

class GenericPrinter <T, SomethingExtremelyStupidAsAName> {
    private T value;
    private SomethingExtremelyStupidAsAName secondValue;

    public GenericPrinter(T value, SomethingExtremelyStupidAsAName secondValue) {
        this.value = value;
        this.secondValue = secondValue;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public SomethingExtremelyStupidAsAName getSecondValue() {
        return secondValue;
    }
    public void setSecondValue(SomethingExtremelyStupidAsAName secondValue) {
        this.secondValue = secondValue;
    }

    public void print() {
        System.out.println("First value: " + this.value + ", Second value: " + this.secondValue);
    }
}

class RunMe {
    static void main(String[] args) {
        GenericPrinter<String, Double> stringGenericPrinter = new GenericPrinter<>(
                "Becir", 155.15
        );
        stringGenericPrinter.print();

        GenericPrinter<Boolean, Person> personGenericPrinter = new GenericPrinter<>(
                true, new Person("Becir", 1994)
        );
        personGenericPrinter.print();
    }
}
