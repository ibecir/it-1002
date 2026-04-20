package ba.edu.ibu.week8.livesession.groupb.statics;

class Program {
    static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println(Integer.MAX_VALUE);

        for (int value : values)
            System.out.print(value + " ");  // prints: 1, 2, 3, 4, 5

        StaticHandling.resetArray(values);
        StaticHandling s = new StaticHandling();
        s.printSomething();

        System.out.println(StaticHandling.i);

        for (int value : values)
            System.out.print(value + " ");  // prints: 0, 0, 0, 0, 0
    }
}

class StaticHandling {
    public static int i = 15;
    public static void resetArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public void printSomething() {

    }
}

