package com.example.msa.Firebase_database;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.msa.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertData extends AppCompatActivity {
    //EditText txtname,txtingredients,txtpreparation;
    Button save;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reff = database.getReference("Hello Firebase");

    //DatabaseReference reff;
    Member member;

   //reff.setValue("Hello Firebase");

    public void writeNewMember() {
        String name = "Reteta a";
        String ingredients = "Ingrediente:......";
        String preparation = "Mod de preparare:.......";

        member = new Member(name,ingredients,preparation);
        //reff.child("Recipees").child(member.getRecipeeName()).setValue(member);
        reff.setValue("Hello Firebase");
    }

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {

        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.fragment_gallery);
        FirebaseApp.initializeApp(this);
        reff = FirebaseDatabase.getInstance("https://msa-project-fc366-default-rtdb.firebaseio.com/").getReference("test");
        String message = "Hello firebase!";
        reff.child("a").setValue(message);
         //reff.child("Recipees").setValue(message);
//        String name = "Reteta a";
//        String ingredients = "Ingrediente:......";
//        String preparation = "Mod de preparare:.......";

//        member.setRecipeeName(name);
//        member.setRecipeeIngredients(ingredients);
//        member.setRecipeePreparation(preparation);


//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name = "Reteta a";
//                String ingredients = "Ingrediente:......";
//                String preparation = "Mod de preparare:.......";
//
//                member.setRecipeeName(name);
//                member.setRecipeeIngredients(ingredients);
//                member.setRecipeePreparation(preparation);
//                Toast.makeText(InsertData.this,"data inserted succesfully",Toast.LENGTH_LONG).show();
//            }
//        });
    }

}
