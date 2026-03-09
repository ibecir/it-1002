package ba.edu.ibu.week2.lectures;

import java.util.Scanner;

public class Lectures {
    public static void main(String[] args) {
        int i = 1;

        while (i < 2){
            System.out.println(i);
            i++;
        }
        int number = 1;
        System.out.println("Main program variable number holds the value: " + number);
        int result = addThree(number);
        System.out.println("Value is " + result);

        String courseName = "OOP";
        char letter = courseName.charAt(2);

        //simpleCalculator();
        printHalfPyramid(5);
        printHalfPyramidV2(10);
        printHalfPyramidV3(6);
        printHalfPyramidReverse(5);
    }
    public static int addThree(int number) {
        System.out.println("Method parameter number holds the value: " + number);
        number = number + 3;
        System.out.println("Method parameter number holds the value: " + number);
        return number;
    }

    public static void simpleCalculator(){
        while(true) {
            System.out.println("Which option do you want: sum, subtraction, quit?");
            Scanner reader = new Scanner(System.in);

            String option = reader.nextLine();

            if(option.equals("quit"))
                break;

            if(option.equals("sum") || option.equals("subtraction")) {
                System.out.println("Please enter first number: ");
                int a = Integer.parseInt(reader.nextLine());

                System.out.println("Please enter second number: ");
                int b = Integer.parseInt(reader.nextLine());

                if (option.equals("sum"))
                    System.out.println("The result is " + (a + b));
                else if (option.equals("subtraction"))
                    System.out.println("The result is " + (a - b));
            }

        }
    }


    // *
    // * *
    // * * *
    // * * * *
    public static void printHalfPyramid(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void printHalfPyramidV2(int n) {
        for(int i = 1; i <= n; i++){ // Controls the row number!!!!
            for(int j = 1; j <= i; j++) // Controls number of starts / symbols being printed
                System.out.print(i + " ");
            System.out.println();
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void printHalfPyramidV3(int n) {
        for(int i = 1; i <= n; i++){ // Controls the row number!!!!
            for(int j = 1; j <= i; j++) // Controls number of starts / symbols being printed
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void printHalfPyramidReverse(int n) {
        for(int i = n; i > 0; i--){ // Controls the row number!!!!
            for(int j = 1; j <= i; j++) // Controls number of starts / symbols being printed
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
