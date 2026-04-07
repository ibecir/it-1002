package ba.edu.ibu.week6.livesession;

class Animal {
    private String name;
    private int yearOfBirth;

    public Animal(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void produceNoise() {
        System.out.println("hmmmmmmmmmmm");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj instanceof Animal) {
            Animal animal = (Animal) obj;

            if(this.name.equals(animal.getName()) && this.yearOfBirth == animal.getYearOfBirth())
                return true;
        }

        return false;
    }
}

class Lion extends Animal{
    private double beardLength;

    public Lion(String name, int yearOfBirth, double beardLength) {
        super(name, yearOfBirth);
        this.beardLength = beardLength;
    }

    public double getBeardLength() {
        return beardLength;
    }
    public void setBeardLength(double beardLength) {
        this.beardLength = beardLength;
    }

    @Override
    public void produceNoise() {
        System.out.println("Grrrrrrrrr");
    }

    public void roar() {
        System.out.println("I'm roaring");
    }
}

class Mosquito extends Animal {
    private double wingsSpan;

    public Mosquito(String name, int yearOfBirth, double wingsSpan) {
        super(name, yearOfBirth);
        this.wingsSpan = wingsSpan;
    }

    public double getWingsSpan() {
        return wingsSpan;
    }
    public void setWingsSpan(double wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    @Override
    public void produceNoise() {
        System.out.println("Zzzzzz");
    }
}

class RunMePlease {
    static void main(String[] args) {
        Mosquito komarac = new Mosquito("Komarcic", 1994, 14.1);

        Lion lav = new Lion("Lafcina", 2025, 1234324.1);
        Lion lav2 = new Lion("Lafcina", 2025, 10.1);

        Animal someAnimal = new Lion("Lafcina", 2025, 10.1);
        Animal newAnimal = new Animal("Kengur", 1992);

        printAnimalSounds(someAnimal);

        System.out.println(lav.equals(lav2));
    }

    public static void printAnimalSounds(Animal animal) {
        if(animal instanceof Lion){
            Lion l1 = (Lion) animal;
            l1.roar();
        }

        animal.produceNoise();
    }
}
