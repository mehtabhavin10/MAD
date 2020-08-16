package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    EditText ip1EditText,ip2EditText;
    Button addButton,subtractButton,multiplyButton,divisionButton;
    TextView outputTextView;
    int num1Text,num2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.add);
        subtractButton = findViewById(R.id.sub);
        multiplyButton = findViewById(R.id.mul);
        divisionButton = findViewById(R.id.div);

        outputTextView = findViewById(R.id.result);

        ip1EditText = findViewById(R.id.num1);
        ip2EditText = findViewById(R.id.num2);

        addButton.setOnClickListener(this);
        subtractButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String s1 = ip1EditText.getText().toString();
        String s2 = ip2EditText.getText().toString();

        if(s1=="" || s2=="") return;

        num1Text = Integer.parseInt(s1);
        num2Text = Integer.parseInt(s2);


        int ans;

        if(v.getId()== R.id.add) ans = num1Text + num2Text;  
        else if(v.getId() == R.id.sub) ans = num1Text - num2Text;
        else if(v.getId() == R.id.mul) ans = num1Text * num2Text;
        else ans = num1Text / num2Text;
        
        outputTextView.setText(ans);
    }
}
