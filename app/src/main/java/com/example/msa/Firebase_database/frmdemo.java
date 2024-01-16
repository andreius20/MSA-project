package com.example.msa.Firebase_database;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.msa.R;

public class frmdemo extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Connection succesful");
        Toast.makeText(getApplicationContext(),"Firebase connection success",Toast.LENGTH_SHORT).show();
    }
}
