package ba.edu.ibu.week8.livesession.groupa.generics;

interface Shoutable {}
interface Eatable {}

class Animal implements Shoutable, Eatable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println("Grrrrrr");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("Mjau");
    }
}

class Crocodile extends Animal {
    public Crocodile(String name) {
        super(name);
    }

    public <T extends Number, K> T whatDoYouDoAfterYouEatMeat(T value, K otherValue) {
        System.out.println("I take a cup of " + value + " and I take a cup of " + otherValue);
        return value;
    }
}

class AnimalPrinter <T extends Animal & Shoutable & Eatable> {
    private T value;

    public AnimalPrinter(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        value.shout();
    }
}

class RunMeV2 {
    static void main(String[] args) {
        AnimalPrinter<Crocodile> crocodileAnimalPrinter = new AnimalPrinter<>(
                new Crocodile("Cicko")
        );

        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(
                new Cat("Micko")
        );

        crocodileAnimalPrinter.print();
        catAnimalPrinter.print();

        Crocodile krokodil = new Crocodile("Huge man");
        krokodil.whatDoYouDoAfterYouEatMeat(new Integer(1), new Animal("Mouse"));
    }
}
