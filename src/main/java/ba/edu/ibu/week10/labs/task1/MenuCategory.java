package ba.edu.ibu.week10.labs.task1;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MenuCategory {
    String name();
    boolean available() default true;
}
