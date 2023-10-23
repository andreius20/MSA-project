package Classes;

public class RecipeAlreadyExistsException extends RuntimeException{
    public  RecipeAlreadyExistsException(String message) {
        super(message);
    }
}
