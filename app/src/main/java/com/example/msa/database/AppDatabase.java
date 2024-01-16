package com.example.msa.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.msa.model.Reteta;  // Import Reteta class
import com.example.msa.model.AlteClaseDeEntitate;  // Import AlteClaseDeEntitate class
import com.example.msa.dao.RetetaDao;  // Import RetetaDao interface
@Database(entities = {Reteta.class, AlteClaseDeEntitate.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RetetaDao retetaDao();
    // Adaugă alte DAO-uri pentru celelalte entități, dacă există
    // public abstract AlteDaouriDao alteDaouriDao();
}
