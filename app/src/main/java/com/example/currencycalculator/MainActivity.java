package com.example.currencycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView Result;
    EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        Result=findViewById(R.id.Result);
        value=findViewById(R.id.editTextText2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float dollar= (float) value1 /300;
                Result.setText(dollar + "  Dollars");

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float Riyal= (float) value1 /74;
                Result.setText(Riyal + " Riyal");

            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float Yuan= (float) value1 * 38;
                Result.setText(Yuan + " Yuan");

            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float  Pound = (float) value1 /350;
                Result.setText( Pound  + "  Pound ");

            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float  Qatari  = (float) value1 /76;
                Result.setText( Qatari  + "   Qatari Riyal ");

            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float   Australian = (float) value1 /180;
                Result.setText(  Australian + "    Australian Dollar ");

            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float  Japanese = (float) value1 /2;
                Result.setText(  Japanese  + "    Japanese Yen  ");

            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float  Bangladeshi = (float) value1 /2;
                Result.setText(  Bangladeshi   + "    Bangladeshi Take   ");

            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int value1 = Integer.parseInt( value.getText().toString());

                float   Euro  = (float) value1 /2;
                Result.setText(   Euro   + "    Euro    ");

            }

        });






    }
}