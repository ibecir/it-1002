package ba.edu.ibu.week11.labs.Task7_StudentNameIterator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Amir", "", null, "Emina", "Sara"};
        StudentNameIterator iterator = new StudentNameIterator(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
