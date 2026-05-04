package ba.edu.ibu.week10.livesession.groupb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @SuppressWarnings({"unused", "invoke"})
    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }
    public void meow() {
        System.out.println("meow");
    }
    public void saySomething(String something, int number) {
        System.out.println("I said something ".concat(something).concat("NUMBER: ").concat(String.valueOf(number)));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }
}

class MainRun {
    static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Cicko", 5);

        Field[] properties = cat.getClass().getDeclaredFields();

        for (Field property : properties) {
            property.setAccessible(true);
            System.out.println(property.get(cat));
        }

        Method[] methods = cat.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(null);
            } else if(method.getName().equals("meow")) {
                method.invoke(cat);
            } else if (method.getName().equals("saySomething")) {
                method.invoke(cat, "something", 1);
            } else {
                method.setAccessible(true);
                method.invoke(cat);
            }
        }
    }
}