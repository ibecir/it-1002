package ba.edu.ibu.week9.lectures.lambdas.interfaces;

// Interfaces with one single method are called an FUNCTIONAL INTERFACE
// SAM interface - Single Abstract Method interface
// Lambdas can only be used in the sense of the Functional Interfaces
@FunctionalInterface
public interface Printable {
    public String printMe(String suffix); // Abstract method
    public default void printSometing() {
        System.out.println("Hello");
    }
}
