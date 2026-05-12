package ba.edu.ibu.week11.livesession.groupa;

import java.security.InvalidParameterException;

class InvalidAgeException extends InvalidParameterException {
    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(Throwable cause) {
        super(cause);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
