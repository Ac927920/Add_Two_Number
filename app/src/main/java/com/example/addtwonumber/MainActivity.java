package com.example.addtwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView textViewResult;
    private Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textViewResult = findViewById(R.id.textViewResult);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });
    }

    private void addNumbers() {
        String number1Str = editTextNumber1.getText().toString();
        String number2Str = editTextNumber2.getText().toString();

        if (number1Str.isEmpty() || number2Str.isEmpty()) {
            textViewResult.setText("NaN");
            return;
        }

        try {
            double number1 = Double.parseDouble(number1Str);
            double number2 = Double.parseDouble(number2Str);

            double result = number1 + number2;

            textViewResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            textViewResult.setText("NaN");
        }
    }

}