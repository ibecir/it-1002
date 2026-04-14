package ba.edu.ibu.week7.lectures.livesession.abstractclasses;

public abstract class Animal implements Soundable {
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

    public abstract String makeSound();

    public void additionalSound(){

    }
}

class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Grrrrrrrrrr";
    }
}

class Cat extends Animal implements Payable, Soundable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Mow";
    }

    @Override
    public void pay() {

    }
}

class RunMe {
    static void main(String[] args) {
        Cat cicko = new Cat("Cicko");
        Lion lion = new Lion("Lion");
        cicko.getName();

        printAnimalSound(cicko);
        printAnimalSound(lion);
    }

    public static void printAnimalSound(Animal animal) {
        System.out.println(animal.makeSound());
    }
}

interface Soundable {
    void additionalSound();
}

interface Payable {
    void pay();
}
