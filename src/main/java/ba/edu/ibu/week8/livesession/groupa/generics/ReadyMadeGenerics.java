package ba.edu.ibu.week8.livesession.groupa.generics;

import ba.edu.ibu.week6.labs.Task1.Animal;
import ba.edu.ibu.week6.livesession.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadyMadeGenerics {
    static void main(String[] args) {
        // List<Integer> myList = new List<>();
        List<Integer> myListV2 = new ArrayList<>();
        ArrayList<Integer> myListV3 = new ArrayList<>();

        ArrayList<Person> persons = new ArrayList<>();

        // Map<Integer, String> myMap = new Map<>();
        HashMap<Integer, String> myMapV2 = new HashMap<>();
        Map<Integer, String> myMapV3 = new HashMap<>();

        HashMap<Double, Animal> myMapVol3 = new HashMap<>();
    }
}
