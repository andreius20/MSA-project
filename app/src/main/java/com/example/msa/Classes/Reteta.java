package com.example.msa.Classes;

public class Reteta {

    private String name;
    private String ingredients;
    private String preparation;

    public Reteta(String name,String ingredients,String preparation) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public String getIngredients() {
        return this.ingredients;
    }

    public String getPreparation() {
        return this.preparation;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String toString() {
        return "Ingrediente:\n" + this.getIngredients() + "\nMod de preparare:\n" + this.getPreparation();
    }

}
