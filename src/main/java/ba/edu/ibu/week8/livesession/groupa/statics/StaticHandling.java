package ba.edu.ibu.week8.livesession.groupa.statics;

class Program {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        for (int value : values)
            System.out.print(value + " ");  // prints: 1, 2, 3, 4, 5

        StaticHandling.resetArray(values);
        StaticHandling sh = new StaticHandling();
        sh.shout();

        for (int value : values)
            System.out.print(value + " ");  // prints: 0, 0, 0, 0, 0
    }
}

class StaticHandling {
    public static void resetArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = 0;
    }

    public void shout() {
        System.out.println("Aaaaaaaaa");
    }
}

