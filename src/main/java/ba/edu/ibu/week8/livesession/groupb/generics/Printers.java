package ba.edu.ibu.week8.livesession.groupb.generics;

import ba.edu.ibu.week4.lab.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public String print() {
        return "The value is " + this.value;
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
    public void setValue(int value) {
        this.value = value;
    }

    public String print() {
        return "The value is " + this.value;
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

    public String print() {
        return "The value is " + this.value;
    }
}

class GenericPrinter <T> {
    private T thing;

    public GenericPrinter(T thing) {
        this.thing = thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }
    public T getThing() {
        return this.thing;
    }

    public T print() {
        return this.thing;
    }
}

class MultipleGenericPrinter<T, Something> {
    private T thing;
    private Something anotherThing;

    public MultipleGenericPrinter(T thing, Something anotherThing) {
        this.thing = thing;
        this.anotherThing = anotherThing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }
    public T getThing() {
        return this.thing;
    }

    public Something getAnotherThing() {
        return anotherThing;
    }
    public void setAnotherThing(Something anotherThing) {
        this.anotherThing = anotherThing;
    }

    public void print() {
        System.out.println("Thing: " + this.thing + ", Another thing: " + this.anotherThing);
    }
}

class MainRun {
    static void main(String[] args) {
        IntegerPrinter i = new IntegerPrinter(12);
        System.out.println(i.print());

        DoublePrinter d = new DoublePrinter(1.5);
        System.out.println(d.print());

        StringPrinter p = new StringPrinter("Becir");
        System.out.println(p.print());

        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Raj");
        System.out.println(stringPrinter.print());
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(1.56);
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(15);

        GenericPrinter<Person> personGenericPrinter = new GenericPrinter<>(
                new Person("Becir", 15)
        );

        System.out.println(personGenericPrinter.print());

        MultipleGenericPrinter<Integer, Person> ts = new MultipleGenericPrinter<>(
                1, new Person("Becir", 32)
        );

        ts.print();

        HashMap<Integer, Person> hm = new HashMap<>();
        hm.put(1, new Person("Becir", 32));

        /* TODO Make comments */
        ArrayList<String> s = new ArrayList<>();
        List<String> al = new ArrayList<>();
        // List<String> asl = new List<>();

        Map<String, String> smt = new HashMap<>();
        HashMap<String, String> smtv2 = new HashMap<>();
        // Map<String, String> smtv3 = new Map<>();
    }
}
