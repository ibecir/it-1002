package ba.edu.ibu.week10.labs.task4;

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Leo", 3);
        Class<?> clazz = animal.getClass();

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());
        }
    }
}
