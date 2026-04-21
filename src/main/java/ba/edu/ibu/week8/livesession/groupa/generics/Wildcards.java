package ba.edu.ibu.week8.livesession.groupa.generics;

import ba.edu.ibu.week6.livesession.Person;

import java.util.Arrays;
import java.util.List;

public class Wildcards {
    static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal("Mouse"),
                new Animal("Crocodile")
        );
        Wildcards.printAnyList(animals);

        List<String> strings = Arrays.asList(
                "Becir",
                "OOP"
        );
        Wildcards.printAnyList(strings);

        List<Integer> integers = Arrays.asList(
                1,
                2
        );
        Wildcards.printAnyList(integers);

        List<Double> doubles = Arrays.asList(
                1.1,
                2.2
        );
        Wildcards.printAnyList(doubles);
    }

    public static void printAnyList(List<?> list) { // Bounded wildcard // List<? extends Number> list
        for (Object o : list) {
            if (o instanceof Person) {
                Person p = (Person) o;
                System.out.println(p.getName());
            } else if (o instanceof Animal) {
                Animal a = (Animal) o;
                System.out.println(a.getName());
            } else
                System.out.println(o);
        }
    }
}
