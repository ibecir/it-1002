package ba.edu.ibu.week1.livesession;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args){
        calculator();
        var a = 0.1415; // Strongly forbidden to be used under any circumstances!!!!
        String b = "Becir";

        hello();

        if(!false)
            System.out.println("Ok");

        String holdMyName = "My name";

        System.out.print("Hello you");
        System.out.print("Becir");

        double result = 3 / (double)2;
        System.out.println("Result is " + result);

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Please enter second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("The sum of provided numbers is " + (firstNumber + secondNumber));

        if(1 == 1) {
            System.out.println("We are good");
        } else if (1 != 2)
            System.out.println("Not good");
        else {
            System.out.println("How are you?");
        }

        String name = "Becir";
        String myName = "Becirs";
        // Why this happens?
        if(name.equals(myName)) {
            System.out.println("They are same");
        } else
            System.out.println("Not same");
    }

    public static void hello() {
        System.out.println("Hello");
        helloOnceMore();
    }

    public static void helloOnceMore() {
        System.out.println("Hello");
    }

    public static void calculator() {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your choice: addition, subtraction, quit? ");
            String choice = reader.nextLine();

            if(choice.equals("quit")){
                System.out.println("Ahhhhh, so sorry to see you go :(");
                break;
            }
            else if (choice.equals("addition") || choice.equals("subtraction")) {
                System.out.println("Please enter first number: ");
                int firstNumber = Integer.parseInt(reader.nextLine());
                System.out.println("Please enter second number: ");
                int secondNumber = Integer.parseInt(reader.nextLine());

                if(choice.equals("addition")){
                    System.out.println("Result of addition is " + (firstNumber + secondNumber));
                    continue;
                }

                System.out.println("Result of subtraction is " + (firstNumber - secondNumber));
            }
        }
    }
}
