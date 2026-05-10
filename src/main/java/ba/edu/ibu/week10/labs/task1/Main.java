package ba.edu.ibu.week10.labs.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Amir", "Extra cheese", "Margherita");

        Class<?> clazz = order.getClass();

        if (clazz.isAnnotationPresent(MenuCategory.class)) {
            MenuCategory category = clazz.getAnnotation(MenuCategory.class);

            System.out.println("=== Menu Category ===");
            System.out.println("Category : " + category.name());
            System.out.println("Available: " + (category.available() ? "Yes" : "No"));
        }

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FieldValidation.class)) {
                FieldValidation validation = field.getAnnotation(FieldValidation.class);

                System.out.println();
                System.out.println("=== Field Validation ===");
                System.out.println("Field    : " + field.getName());
                System.out.println("Max Len  : " + validation.maxLength());
                System.out.println("Nullable : " + (validation.nullable() ? "Yes" : "No"));
            }
        }

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(OrderAction.class)) {
                OrderAction action = method.getAnnotation(OrderAction.class);

                System.out.println();
                System.out.println("=== Order Action ===");
                System.out.println("Method   : " + method.getName());
                System.out.println("Handled By     : " + action.handledBy());
                System.out.println("Est. Time      : " + action.estimatedMinutes() + " min(s)");
                System.out.println("Requires Payment: " + (action.requiresPayment() ? "Yes" : "No"));
            }
        }
    }
}
