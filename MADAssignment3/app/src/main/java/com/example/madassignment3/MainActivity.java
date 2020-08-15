package com.example.madassignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rg;
    Button selectImage;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.radioGroup);
        selectImage = findViewById(R.id.selectImage);
        iv = findViewById(R.id.imageView);
        selectImage.setOnClickListener(this);
        rg.clearCheck();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });

    }

    @Override
    public void onClick(View v) {
        int selectedId = rg.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
        }else {
            if(selectedId == R.id.image1) {
                iv.setImageResource(R.drawable.ic_launcher_background);
            }else {
                iv.setImageResource(R.drawable.ic_launcher_foreground);
            }
        }
    }
}
