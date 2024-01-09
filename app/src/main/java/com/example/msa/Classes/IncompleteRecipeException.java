package com.example.msa.Classes;

public class IncompleteRecipeException extends RuntimeException{
    public IncompleteRecipeException(String message) {
        super(message);
    }
}
