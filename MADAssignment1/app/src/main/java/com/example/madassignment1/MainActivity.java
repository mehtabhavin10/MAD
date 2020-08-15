package com.example.madassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button member1 , member2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Member 1 - Member 2");
        member1 = findViewById(R.id.member1);
        member2 = findViewById(R.id.member2);
        member1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("Name","Priyam Vora");
                intent.putExtra("Email","priyamvora99@gmail.com");
                intent.putExtra("Image",R.drawable.person1);
                startActivity(intent);

            }
        });
        member2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("Name","Bhavin Mehta");
                intent.putExtra("Email","mehtabhavin10@gmail.com");
                intent.putExtra("Image",R.drawable.person2);
                startActivity(intent);
            }
        });
    }


}
