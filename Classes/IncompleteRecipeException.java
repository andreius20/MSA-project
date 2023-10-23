package Classes;

public class IncompleteRecipeException extends RuntimeException{
    public IncompleteRecipeException(String message) {
        super(message);
    }
}
