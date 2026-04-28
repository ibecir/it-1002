package ba.edu.ibu.week9.livesession.groupa;

@FunctionalInterface
interface OperationInterface {
    int operation(int a, int b);
    default void operate() {
        System.out.println("Hello");
    }
}
interface MessageInterface {
    String sayMessage(String message);
}

class Lambdas {
    static void main(String[] args) {
        OperationInterface addition = (a, b) -> a + b;

        OperationInterface multiplication = (a, b) -> {
            int result = a * b;
            System.out.println("Result of multiplication is: " + result);
            return result;
        };

        MessageInterface sayHello = m -> m + "!";

        System.out.println(Lambdas.operate(10, 10, multiplication));
        System.out.println(Lambdas.operate(10, 10, addition));
    }

    private static int operate(int a, int b, OperationInterface object) {
        return object.operation(a, b);
    }
}
