package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText num1,num2;
    Button button, button2, button3, button4, button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                textView.setText("The sum is "+ sum);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                textView.setText("The difference is "+ sub);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                textView.setText("The product is "+ sub);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString());
                double b = Integer.parseInt(num2.getText().toString());
                textView.setText("The qoutient is "+String.format("%4f",a/b)+" and the remainder is "+a%b);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString());
                double b = Integer.parseInt(num2.getText().toString());
                double c = Math.pow(a, b);
                textView.setText("The value of "+a+ " raised to "+b+ " is "+c);
            }
        });
    }
}
