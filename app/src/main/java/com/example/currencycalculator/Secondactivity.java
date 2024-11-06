package com.example.currencycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Secondactivity extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondactivity);
        btnNext=findViewById(R.id.btnNext);
        Intent INext;
        INext=new Intent(Secondactivity.this,MainActivity.class);
        INext.putExtra("Title","Home");
        INext.putExtra("Roll No","10");
        INext.putExtra("Student","Nasir");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(INext);

            }
        });



    }
}