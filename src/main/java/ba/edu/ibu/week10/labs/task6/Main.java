package ba.edu.ibu.week10.labs.task6;

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();

        Method speakMethod = Animal.class.getDeclaredMethod("speak");
        speakMethod.invoke(animal);

        Method sayMethod = Animal.class.getDeclaredMethod("say", String.class);
        sayMethod.invoke(animal, "Hello!");
    }
}
