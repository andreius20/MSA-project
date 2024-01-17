package com.example.msa.Classes;

import java.util.ArrayList;

public class Lista {

    private static ArrayList<Reteta> Lista_retete = new ArrayList<>();

    public Lista() {}

    public void AddRecipe(Reteta r) {
        if(Lista_retete.contains(r))
            throw new RecipeAlreadyExistsException("Aceasta reteta este deja inregistrata.");
        else if(r.getIngredients().equals("") || r.getPreparation().equals(""))
            throw new IncompleteRecipeException("Missing ingredients or mode of preparation.");
        else
            Lista_retete.add(r);

    }

    public String toString() {
        String s = "";
        for (Reteta a : Lista_retete)
            s = s +"Ingrediente:\n" +  a + "\n";
        return s;
    }
    public ArrayList<Reteta> getList() {
        return Lista_retete;
    }
}

