package ba.edu.ibu.week3.livesessions.enums;

public class Person {
    public String name;
    public int yearOfBirth;
    public Gender gender;

    public Person(String name, int yearOfBirth, Gender gender) {
        this.gender = gender;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
