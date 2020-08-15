package com.example.madassignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    Button add,sub,mul,div;
    TextView result;
    int num1Text,num2Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.result);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        num1Text = Integer.parseInt(num1.getText().toString());
        num2Text = Integer.parseInt(num2.getText().toString());
        int resultNum = -1;
        String operator = "";
        if(v.getId()== R.id.add) {
            resultNum = num1Text + num2Text;
            operator = "+";
        }else if(v.getId() == R.id.sub) {
            resultNum = num1Text - num2Text;
            operator = "-";
        }else if(v.getId() == R.id.mul) {
            resultNum = num1Text * num2Text;
            operator = "*";
        }else {
            resultNum = num1Text / num2Text;
            operator = "/";
        }
        result.setText("Result of "+num1Text+" "+operator+" "+num2Text+" = "+resultNum);
        num1.setText("");
        num2.setText("");
    }
}
