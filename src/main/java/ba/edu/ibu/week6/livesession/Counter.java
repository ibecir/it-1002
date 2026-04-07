package ba.edu.ibu.week6.livesession;

import java.io.Serializable;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }
    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int increment() {
        this.value++; // this.value += 1;
        return this.value;
    }
    public int increment(int number) {
        this.value += number;
        return this.value;
    }

    public Counter clone() {
        return new Counter(this.value);
    }
}

class RunMeMain {
    static void main() {
        Counter c1 = new Counter();
        c1.increment();
        c1.increment();
        c1.increment(3);

        System.out.println(c1.getValue());

        Counter c2 = c1.clone();
        System.out.println(c2.getValue());

        Object object = new Counter();
        Object object2 = new String("Becir");

        Serializable serializable = new String("Becir");
        CharSequence sequence = new String("Something");
    }
}
