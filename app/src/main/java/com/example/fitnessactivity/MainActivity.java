package com.example.fitnessactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewToast( View view){
        Toast.makeText(this, "Wel-Come to Health Care", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent( this, MainActivity2.class);
        startActivity( intent);

    }
}