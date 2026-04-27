package ba.edu.ibu.week9.livesession;

@FunctionalInterface
interface OperationInterface {
    int operation(int a, int b);
}
@FunctionalInterface
interface MessageInterface {
    String sayMessage(String message);
}

class Lambdas {
    static void main(String[] args) {
        OperationInterface add = (a, b) -> a + b;
        OperationInterface multiply = (a, b) -> {
            System.out.println("Becir");
            return a * b;
        };

        MessageInterface giveMeAMessage = becir -> "Hello you " + becir;

        System.out.println(Lambdas.operate(1, 2, add));
        System.out.println(Lambdas.operate(5, 2, multiply));
    }

    private static int operate(int a, int b, OperationInterface object) {
        return object.operation(a, b);
    }
}
