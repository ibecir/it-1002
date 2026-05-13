package ba.edu.ibu.week11.labs.Task2_RegistrationValidator;

public class Validator {
    public void validateAge(int age) throws InvalidUserException {
        if (age < 0) throw new InvalidUserException("Age cannot be negative.");
        if (age < 18) throw new InvalidUserException("User must be at least 18 years old.");
    }
    public void validateUsername(String username) throws InvalidUserException {
        if (username == null) throw new InvalidUserException("Username cannot be null.");
        if (username.trim().length() < 5) throw new InvalidUserException("Username must contain at least 5 characters.");
        if (username.contains(" ")) throw new InvalidUserException("Username cannot contain spaces.");
    }
    public void validateEmail(String email) throws InvalidUserException {
        if (email == null) throw new InvalidUserException("Email cannot be null.");
        if (!email.contains("@")) throw new InvalidUserException("Email must contain @.");
        if (!email.endsWith(".com")) throw new InvalidUserException("Email must end with .com.");
    }
    public void validateUser(String username, int age, String email) throws InvalidUserException {
        validateUsername(username);
        validateAge(age);
        validateEmail(email);
    }
}
