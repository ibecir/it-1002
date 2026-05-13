package ba.edu.ibu.week11.labs.Task3_OddNumberIterator;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, -3, 2, 5, 8, 7, -9, 11, 14};
        OddNumberIterator iterator = new OddNumberIterator(data);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
