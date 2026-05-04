package ba.edu.ibu.week10.livesession.groupb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunNTimes {
    int times() default 5;
}

record Animal(String name) {
    @RunNTimes(times = 3)
    public void sayYourName() {
        System.out.println(this.name);
    }
    @RunNTimes
    public void giveSound() {
        System.out.println("Arrrrr");
    }
}

class MainB {
    static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal a = new Animal("Papagaj");

        Method[] methods = a.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(RunNTimes.class)) {
                RunNTimes myAnnotation = method.getAnnotation(RunNTimes.class);
                int times = myAnnotation.times();

                for (int i = 0; i < times; i++){
                    method.invoke(a);
                }
            }
        }
    }
}