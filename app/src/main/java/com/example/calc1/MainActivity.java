package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number_1);
        number2 = (EditText) findViewById(R.id.number_2);
        result = (TextView) findViewById(R.id.result);

    }


    public void btnSoma(View view){
        double resultado = Double.parseDouble(number1.getText().toString()) + Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(resultado));

    }

    public void btnMult(View view){
        double resultado = Double.parseDouble(number1.getText().toString()) * Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(resultado));

    }

    public void btnDivide(View view){
        double resultado = Double.parseDouble(number1.getText().toString()) / Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(resultado));

    }

    public void btnSub(View view){
        double resultado = Double.parseDouble(number1.getText().toString()) - Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(resultado));

    }

}