package com.example.msa.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "retete")
public class Reteta {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String nume;
    private String durata;
    private String ingrediente;
    private String instructiuni;

    // getteri și setteri
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getInstructiuni() {
        return instructiuni;
    }

    public void setInstructiuni(String instructiuni) {
        this.instructiuni = instructiuni;
    }
}
