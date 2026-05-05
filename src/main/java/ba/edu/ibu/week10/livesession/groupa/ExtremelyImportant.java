package ba.edu.ibu.week10.livesession.groupa;

import ba.edu.ibu.week10.lectures.annotations.RunImmediatelyNTimes;
import ba.edu.ibu.week10.lectures.annotations.VeryImportant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.classfile.constantpool.FieldRefEntry;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface ExtremelyImportant {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunMeASAPNTimes {
    int numberOfTimes() default 1;
}

class Person {
    @ExtremelyImportant
    private String name;
    @ExtremelyImportant
    private int age;
    @ExtremelyImportant
    private String address;

    public Person(String address, int age, String name) {
        this.address = address;
        this.age = age;
        this.name = name;
    }

    @SuppressWarnings("unused")
    @RunMeASAPNTimes(numberOfTimes = 15)
    public void sayHello() {
        System.out.println("Hello my friends");
    }

    @RunMeASAPNTimes(numberOfTimes = 4) // default of 1 as we declared it!
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}

class EmployNAnnotation {
    static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person("Fr bb", 32, "Becir");
        Method[] methods = person.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(RunMeASAPNTimes.class)) {
                RunMeASAPNTimes annotation = method.getAnnotation(RunMeASAPNTimes.class);
                for(int i = 0; i < annotation.numberOfTimes(); i++)
                    method.invoke(person);
            }

            // TODO Check it
            if(method.isAnnotationPresent(SuppressWarnings.class)){
                SuppressWarnings variable = method.getAnnotation(SuppressWarnings.class);
                System.out.println("MY VALUE US " + variable.value());
            }
        }
    }
}

class EmployAnnotation {
    static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Fr bb", 32, "Becir");
        Field[] fields =  person.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(ExtremelyImportant.class)) {
                Object tmp = (Object) field.get(person);
                if(tmp instanceof String)
                    System.out.println(tmp.toString().toUpperCase());
            } else {
                System.out.println(field.get(person));
            }
        }
    }
}
