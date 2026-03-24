package ba.edu.ibu.week4.livesession.groupa;

import java.util.ArrayList;

public class Examples {
    public static void main(String[] args) {
        String name = "OOP";
        String courseName = new String("OOP");
        Integer i = 1;

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Bosnia");
        countries.add("Bosnia and Herzegovina");
        countries.add("Iran");

        removeFirst(countries);
        printStringList(countries);

        problematicCode();
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }

    public static void printStringList(ArrayList<String> list) {
        for (String item : list)
            System.out.println(item);
    }

    public static void printIntegerList(ArrayList<Integer> list) {
        for (Integer item : list)
            System.out.println(item);
    }

    public static void problematicCode() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);

        System.out.println("The numbers in the beginning:");
        printIntegerList(numbers);

        while (numbers.contains(Integer.valueOf(3)))
            numbers.remove(Integer.valueOf(3));

        System.out.println("The numbers after removal:");
        printIntegerList(numbers);
    }
}
