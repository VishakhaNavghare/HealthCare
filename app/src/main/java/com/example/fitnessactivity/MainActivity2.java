package com.example.fitnessactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private TextInputEditText ageET, heightET, weightEt;

    private RadioGroup gender;

    private String selectGender= "Female";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ageET = findViewById(R.id.ageEditText);
        heightET = findViewById(R.id.heightEditText);
        weightEt = findViewById(R.id.weightEditText);
        gender = findViewById( R.id.radioGroup);


        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton SelectRadioButton = findViewById( checkedId);
                selectGender = SelectRadioButton.getText().toString();

            }
        });
    }


    public void viewToast(View view){
        String ageStr = ageET.getText().toString().trim();
        String heightStr = heightET.getText().toString().trim();
        String weightStr = weightEt.getText().toString().trim();

        double age = Double.parseDouble(ageStr) ;
        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);


        double BMI = weight/((height/100)*( height/100));

        double BMR = (88.362 + ( 13.396 * weight) + ( 4.799 * height) - (5.677 * age));

        Intent intent = new Intent( getApplicationContext(), MainActivity3.class);
        intent.putExtra("BMI", BMI);
        intent.putExtra("BMR", BMR);
        startActivity( intent);
    }
}