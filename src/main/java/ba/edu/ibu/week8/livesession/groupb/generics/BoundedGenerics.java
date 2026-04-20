package ba.edu.ibu.week8.livesession.groupb.generics;

class Person extends Animal implements Eatable, Printable {}

class Animal implements Eatable, Printable {
    private int numOfLegs;

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public <T, K extends Animal & Eatable> K printAnything(T thingToBePrinted, K anotherThing) {
        System.out.println(thingToBePrinted);
        return anotherThing;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat() {
        System.out.println("Animal Eating");
    }
}
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eating");
    }
}
class Mouse extends Animal {}

class AnimalEater<T extends Animal & Eatable & Printable> {
    private T genericAnimal;

    public AnimalEater(T genericAnimal) {
        this.genericAnimal = genericAnimal;
    }

    public void printEater() {
        this.genericAnimal.eat();
    }
}

interface Eatable {}
interface Printable {}

class Main {
    static void main(String[] args) {
        AnimalEater<Person> stringAnimalEater = new AnimalEater<>(new Person());
    }
}






