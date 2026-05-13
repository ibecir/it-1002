package ba.edu.ibu.week11.labs.Task2_RegistrationValidator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        testUser(validator, "amina123", 22, "amina@example.com");
        testUser(validator, "ali", 20, "ali@example.com");
        testUser(validator, "student one", 19, "student@example.com");
        testUser(validator, "kerim123", -2, "kerim@example.com");
        testUser(validator, "sara123", 17, "sara@example.com");
        testUser(validator, "faris123", 25, "farisexample.com");
        testUser(validator, "lejla123", 25, "lejla@example.ba");
    }
    private static void testUser(Validator validator, String username, int age, String email) {
        try {
            validator.validateUser(username, age, email);
            System.out.println("User is valid: " + username);
        } catch (InvalidUserException e) {
            System.out.println("Invalid user: " + e.getMessage());
        }
    }
}
