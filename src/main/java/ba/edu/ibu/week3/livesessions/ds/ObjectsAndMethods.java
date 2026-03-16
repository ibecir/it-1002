package ba.edu.ibu.week3.livesessions.ds;

import java.util.*;

public class ObjectsAndMethods {
    public static void main(String[] args) {
        int a = 1;
        String name = "OOP";
        String courseName = new String("OOP");
        Scanner reader = new Scanner(System.in);

        System.out.println();

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add(new String("Becir"));
        studentNames.add(new String("Mirza"));
        studentNames.add(new String("Samira"));
        studentNames.add(new String("Dino"));

        System.out.println(studentNames.size());
        System.out.println(studentNames.get(0));
        System.out.println(studentNames.contains("Ilma")); // Returns -> false
        System.out.println(studentNames.contains("Becir")); // Returns -> true

        // Not sure why, check this.
        studentNames.remove("Becir");
        System.out.println(studentNames.contains("Becir")); // Returns -> false

        for (int i = 0; i < studentNames.size(); i++)
            System.out.println(studentNames.get(i));

        for (String student : studentNames)
            System.out.println(student);

        Collections.sort(studentNames);

        System.out.println("########");
        printList(studentNames);

        Collections.reverse(studentNames);
        System.out.println("########");
        printList(studentNames);

        Collections.shuffle(studentNames);
        System.out.println("########");
        printList(studentNames);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Boolean> values = new ArrayList<>();
        ArrayList<Double> numbers2 = new ArrayList<>();
        ArrayList<Float> numbers3 = new ArrayList<>();

        numbers.add(15);
        numbers.add(new Integer(66));
        numbers.add(new Integer(99));

        numbers.remove(Integer.valueOf(15));

        Random random = new Random();
        System.out.println(random.nextDouble(1000));
        System.out.println(random.nextInt(500, 505));
    }

    public static ArrayList<String> printList(ArrayList<String> items) {
        for (String item : items) {
            System.out.println(item);
        }

        return items;
    }
}
