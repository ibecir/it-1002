package ba.edu.ibu.week3.lectures.livesessions.streams;

import ba.edu.ibu.week3.lectures.livesessions.enums.Gender;
import ba.edu.ibu.week3.lectures.livesessions.enums.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    static void main(String[] args) {
        Streams s = new Streams();
        ArrayList<Person> persons = s.getAllPersonsBornBefore(2001);
        printList(persons);
    }

    private List<Person> persons = Arrays.asList(
        new Person("Becir Isakovc", 1994, Gender.MALE),
        new Person("Mirza Krupic", 2000, Gender.MALE),
        new Person("Samira Zeba", 2005, Gender.FEMALE)
    );

    public static void printList(ArrayList<Person> items) {
        for (Person item : items) {
            System.out.println(item.name);
        }
    }

    public ArrayList<Person> getAllPersonsBornBefore(int year) {
        ArrayList<Person> returnedPersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.yearOfBirth < year)
                returnedPersons.add(person);
        }
        return returnedPersons;
    }

    public List<Person> getAllPersonsBornBeforeStreams(int year){
        return persons.
                stream().
                filter(person -> person.yearOfBirth < year).
                collect(Collectors.toList());
    }

    public List<Person> filterByGender(Gender gender) {
        return persons.
                stream().
                filter(person -> person.gender.equals(gender)).
                collect(Collectors.toList());
    }
}
