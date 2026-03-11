package ba.edu.ibu.week2.livesession;

public class LecturesV2 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 15){
            System.out.println("The current number is " + i);
            i++;
        }

        sayHello();

        LecturesV2 mySmallObject = new LecturesV2();
        mySmallObject.sayHelloV2();

        String name = "OOP";
        System.out.println(name.toUpperCase());
        System.out.println(getFullName("Becir", "Isakovic"));
        System.out.println(getFullName("Isakovic"));

        char a= name.charAt((name.length() - 1) / 2);
        name.length();
        name.concat(" I love it").concat(". 100%");

        String words = "I love object oriented programming!";
        String[] wordsArray = words.split(" ");

        for (int j = 0; j < wordsArray.length; j++)
            System.out.println(wordsArray[j]);

        System.out.println(name.indexOf("sdfghjkl"));
        printHalfPyramid(5);
        printHalfPyramidV2(5);
        printHalfPyramidV3(5);
        printHalfPyramidV4(5);
    }


    // *
    // * *
    // * * *
    // * * * *
    public static void printHalfPyramid(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void printHalfPyramidV2(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println("");
        }
    }

    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void printHalfPyramidV3(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println("");
        }
    }

    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void printHalfPyramidV4(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println("");
        }
    }

    public static boolean greaterNumber(int x, int y) {
        return x > y;
    }

    public static void sayHello(){
        System.out.println("Hellppppp");
    }

    public void sayHelloV2(){
        System.out.println("Hellppppp");
    }

    public static String getFullName(String firstName, String lastName) {
        System.out.println(getFullName("Becir", 32));
        return firstName + " " + lastName;
    }
    public static String getFullName(String lastName, int number) {
        System.out.println("Hello");
        return number + " " + lastName;
    }

    public static String getFullName(int number, String lastName) {
        return number + " " + lastName;
    }
    public static String getFullName(String firstName) {
        return firstName;
    }
}
