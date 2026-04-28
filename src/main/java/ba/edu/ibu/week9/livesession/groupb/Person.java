package ba.edu.ibu.week9.livesession.groupb;

import java.util.Objects;

class Person {
    private String name;
    private int age;
    private String address;
    private boolean isAdult;

    public Person(String address, int age, boolean isAdult, String name) {
        this.address = address;
        this.age = age;
        this.isAdult = isAdult;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isAdult == person.isAdult && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, isAdult);
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }
}

record PersonRecord(String name, int age, String address, boolean isAdult) {
    private static final int yoyo = 15;
    public PersonRecord(String name, int age) {
        this(name, age, "", false);
    }

    public void printAge() {
        System.out.println(this.age());
    }
}
