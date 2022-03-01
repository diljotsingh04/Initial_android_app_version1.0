package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView output;
    Button plus;
    Button minus;
    Button divide;
    Button multiply;
    EditText n1;
    EditText n2;


    public void multiply(View view){
        Toast.makeText(this, "Multiply", Toast.LENGTH_SHORT).show();
        String first = n1.getText().toString();
        String Second = n2.getText().toString();
        Double n1 = Double.parseDouble(first);
        Double n2 = Double.parseDouble(Second);
        Double result = n1 * n2;
        output.setText("The result is-> "+ String.format("%.2f",result));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        output = findViewById(R.id.output);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);

//        String n1 = n1.getText().toString();
//        String n2 = n2.getText().toString();
//
//        Double first = Double.parseDouble(n1);
//        Double Second = Double.parseDouble(n2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "plus", Toast.LENGTH_SHORT).show();
                String first = n1.getText().toString();
                String Second = n2.getText().toString();
                Double n1 = Double.parseDouble(first);
                Double n2 = Double.parseDouble(Second);
                Double result = n1 + n2;
                output.setText("The result is-> "+ String.format("%.2f",result));

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "minus", Toast.LENGTH_SHORT).show();
                String first = n1.getText().toString();
                String Second = n2.getText().toString();
                Double n1 = Double.parseDouble(first);
                Double n2 = Double.parseDouble(Second);
                Double result = n1 - n2;
                output.setText("The result is-> "+ String.format("%.2f",result));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "divide", Toast.LENGTH_SHORT).show();
                String first = n1.getText().toString();
                String Second = n2.getText().toString();
                Double n1 = Double.parseDouble(first);
                Double n2 = Double.parseDouble(Second);
                Double result = n1 / n2;
                output.setText("The result is-> "+ String.format("%.2f",result));
            }
        });
//        multiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "multiply", Toast.LENGTH_SHORT).show();
//                String first = n1.getText().toString();
//                String Second = n2.getText().toString();
//                Double n1 = Double.parseDouble(first);
//                Double n2 = Double.parseDouble(Second);
//                Double result = n1 * n2;
//                output.setText("The sum is "+ String.format("%.2f",result));
//            }
//        });

    }
}