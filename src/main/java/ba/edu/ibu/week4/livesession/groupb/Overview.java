package ba.edu.ibu.week4.livesession.groupb;

import java.util.ArrayList;
import java.util.Scanner;

public class Overview {
    public static void main(String[] args) {
        int number = 1;
        number = addThree(number);
        System.out.println("Main program variable number holds the value: " + number);

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Bosnia");
        countries.add("Bosnia and Herzegovina");
        countries.add("Iran");

        printList(countries);
        removeElement(countries);
        printList(countries);

        pleaseOptimizeMe();

        Integer i = 1;
        String name = "OOP";
        String nameVol2 = new String("OOP");
    }

    public static int addThree(int rayalibybrother) {
        rayalibybrother = rayalibybrother + 3;
        return rayalibybrother;
    }

    public static void removeElement(ArrayList<String> someList) {
        someList.remove(0);
    }

    public static void printList(ArrayList<String> someList) {
        for (String element : someList)
            System.out.println(element);
    }

    public static void printIntList(ArrayList<Integer> someList) {
        for (int element : someList)
            System.out.println(element);
    }

    public static void pleaseOptimizeMe() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);

        System.out.println("The numbers in the beginning:");
        printIntList(numbers);

        while (numbers.contains(Integer.valueOf(3)))
            numbers.remove(Integer.valueOf(3));

        System.out.println("The numbers after removal:");
        printIntList(numbers);
    }
}
