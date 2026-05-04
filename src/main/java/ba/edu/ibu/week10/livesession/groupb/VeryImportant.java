package ba.edu.ibu.week10.livesession.groupb;

import ba.edu.ibu.week7.lectures.livesession.abstractclasses.Animal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface VeryImportant {
}

class Person {
    @VeryImportant
    private String name;
    private String sound;
    @VeryImportant
    private int age;

    public Person(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

class MyMainClass {
    static void main(String[] args) throws IllegalAccessException {
        Person p = new Person("Becir", "Very loud", 15);

        Field[] fields = p.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(VeryImportant.class)) {
                System.out.println(field.get(p).toString().toUpperCase());
            } else {
                System.out.println(field.get(p).toString());
            }
        }
    }
}
