package com.example.fitnessactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView BMI;
    private TextView BMR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BMI = findViewById( R.id.outputTextBMI);
        BMR = findViewById( R.id.outputTextBMR);

        double bmi = getIntent().getDoubleExtra( "BMI", 0);
        BMI.setText(String.format("BMI = %.2f",bmi));

        double bmr = getIntent().getDoubleExtra( "BMR", 0);
        BMR.setText(String.format("BMR = %.2f",bmr));




    }
}