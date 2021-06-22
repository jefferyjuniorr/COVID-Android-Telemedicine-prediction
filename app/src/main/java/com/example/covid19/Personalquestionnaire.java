package com.example.covid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Personalquestionnaire extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }

    public void personal(View view){
        intent = new Intent(this, Questionnaire.class);
        startActivity(intent);
    }
}
