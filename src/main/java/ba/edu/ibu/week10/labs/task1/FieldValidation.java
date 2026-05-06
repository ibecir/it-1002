package ba.edu.ibu.week10.labs.task1;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldValidation {
    int maxLength() default 50;
    boolean nullable() default false;
}
