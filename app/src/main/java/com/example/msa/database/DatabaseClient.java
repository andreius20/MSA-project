package com.example.msa.database;

import android.content.Context;
import androidx.room.Room;

public class DatabaseClient {

    private static AppDatabase appDatabase;

    public static synchronized AppDatabase getInstance(Context context) {
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "nume_baza_de_date")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return appDatabase;
    }
}
