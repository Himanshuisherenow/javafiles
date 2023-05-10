package exception.THrow;

public class InvalideHappyError extends Exception {

    public InvalideHappyError(String userDefineException) {

        System.out.println("this is new thing");
    }

    public static void main(String[] args) throws InvalideHappyError {
        throw new InvalideHappyError("User define exception");
    }




}
