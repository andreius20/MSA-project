package com.example.msa.Firebase_database;

public class Member {
    private String RecipeeName;
    private String RecipeeIngredients;
    private String RecipeePreparation;

    public Member() {
    }

    public Member(String RecipeeName,String RecipeeIngredients,String RecipeePreparation) {
        this.RecipeeName = RecipeeName;
        this.RecipeeIngredients = RecipeeIngredients;
        this.RecipeePreparation = RecipeePreparation;
    }

    public String getRecipeeName() {
        return RecipeeName;
    }

    public void setRecipeeName(String recipeeName) {
        RecipeeName = recipeeName;
    }

    public String getRecipeeIngredients() {
        return RecipeeIngredients;
    }

    public void setRecipeeIngredients(String recipeeIngredients) {
        RecipeeIngredients = recipeeIngredients;
    }

    public String getRecipeePreparation() {
        return RecipeePreparation;
    }

    public void setRecipeePreparation(String recipeePreparation) {
        RecipeePreparation = recipeePreparation;
    }
}
