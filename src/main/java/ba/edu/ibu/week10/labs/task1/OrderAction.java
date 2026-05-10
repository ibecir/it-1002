package ba.edu.ibu.week10.labs.task1;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderAction {
    String handledBy();
    int estimatedMinutes() default 5;
    boolean requiresPayment() default false;
}
