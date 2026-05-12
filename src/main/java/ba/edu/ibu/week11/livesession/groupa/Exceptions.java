package ba.edu.ibu.week11.livesession.groupa;

public class Exceptions {
    static void main(String[] args) {
        try {
            validateAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int finallyExample(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 0)
            throw new InvalidAgeException("You are a liar", new StackOverflowError());
    }

}
