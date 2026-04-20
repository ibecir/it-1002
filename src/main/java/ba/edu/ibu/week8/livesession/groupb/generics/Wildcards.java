package ba.edu.ibu.week8.livesession.groupb.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    static void main(String[] args) {
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Becir");
        myStringList.add("Mirza");

        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(1);
        myIntList.add(2);

        List<Person> myPersonList = new ArrayList<>();
        myPersonList.add(new Person());
        myPersonList.add(new Person());

        Wildcards.printAnyList(myStringList);
        Wildcards.printAnyList(myIntList);
        Wildcards.printAnyList(myPersonList);
    }

    public static void printAnyList(List<?> objects) {
        List<Person> personList = new ArrayList<>();
        for (Object o : objects) {
            if(o instanceof Person)
                personList.add((Person) o);
        }
    }
}
