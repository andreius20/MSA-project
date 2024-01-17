//package com.example.msa.model;
package com.example.msa.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import com.example.msa.model.Reteta;
@Dao
public interface RetetaDao {
    @Query("SELECT * FROM retete")
    List<Reteta> getAll();

    @Insert
    long insert(Reteta reteta);

    // Alte metode pentru actualizare și ștergere
    // ...
}
