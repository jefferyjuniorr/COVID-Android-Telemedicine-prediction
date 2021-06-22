package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bodydata(View view){
        intent = new Intent(this, Bodydata.class);
        startActivity(intent);
    }

    public void questionnaire(View view){
        intent = new Intent(this, Questionnaire.class);
        startActivity(intent);
    }

    public void model(View view){
        intent = new Intent(this, Model.class);
        startActivity(intent);
    }

    public void lung(View view){
        intent = new Intent(this, Lungrecovery.class);
        startActivity(intent);
    }
}

