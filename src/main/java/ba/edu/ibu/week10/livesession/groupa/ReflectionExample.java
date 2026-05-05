package ba.edu.ibu.week10.livesession.groupa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Format;

class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Deprecated
    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }
    @Deprecated
    public void meow() {
        System.out.println("meow");
    }
    @SuppressWarnings({"unused", "deprecated"})
    public void saySomething(String something, int numberOfLegs) {
        System.out.println("I said something ".concat(something).concat(", LEGS NO.: ".concat(String.valueOf(numberOfLegs))));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }
}


class ReflectionExample {
    static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Macka", 32);
        cat.meow();
        Field[] fields = cat.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.get(cat));
            if(field.getName().equals("name"))
                field.set(cat, "Mackica");
            System.out.println(field.get(cat));
        }

        Method[] methods = cat.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(null);
            } else if (method.getName().equals("meow")) {
                method.invoke(cat);
            } else if (method.getName().equals("saySomething")) {
                method.invoke(cat, "Becir", 2);
            } else {
                method.setAccessible(true);
                method.invoke(cat);
            }
        }
    }
}
