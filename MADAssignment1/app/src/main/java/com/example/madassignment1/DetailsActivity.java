package com.example.madassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView memberEmail , memberName;
    String memberNameString, memberEmailString;
    int image;
    ImageView memeberImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        memberEmail = findViewById(R.id.memberEmail);
        memberName = findViewById(R.id.memberName);
        memeberImage = findViewById(R.id.memberImage);

        Intent intent = getIntent();
        memberNameString = intent.getStringExtra("Name");
        memberEmailString = intent.getStringExtra("Email");
        image = intent.getIntExtra("Image",0);

        memberEmail.setText("Email: "+memberEmailString);
        memberName.setText("Name: "+memberNameString);
        memeberImage.setImageResource(image);



    }
}
