package com.example.covid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Questionnaire extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnarie);
    }

    public void personal(View view){
        intent = new Intent(this, Personalquestionnaire.class);
        startActivity(intent);
    }

    public void travel(View view){
        intent = new Intent(this, Travelquestionnaire.class);
        startActivity(intent);
    }

    public void mental(View view){
        intent = new Intent(this, Mentalquestionnaire.class);
        startActivity(intent);
    }
}
