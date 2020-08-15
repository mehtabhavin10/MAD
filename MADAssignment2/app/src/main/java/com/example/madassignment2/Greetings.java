package com.example.madassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Greetings extends AppCompatActivity {
    TextView greetings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        Intent i = getIntent();
        greetings = findViewById(R.id.greetings);
        greetings.setText("Greetings from : "+i.getStringExtra("Username"));
    }
}
