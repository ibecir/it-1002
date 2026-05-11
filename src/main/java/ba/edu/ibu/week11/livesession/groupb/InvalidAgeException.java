package ba.edu.ibu.week11.livesession.groupb;

import java.security.InvalidParameterException;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(Throwable cause) {
        super(cause);
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
