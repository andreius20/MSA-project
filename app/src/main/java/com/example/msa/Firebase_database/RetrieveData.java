package com.example.msa.Firebase_database;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RetrieveData {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reff = database.getReference("Hello Firebase");

}
