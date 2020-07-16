package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class meal1 extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;







    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal1);
        b1 = findViewById(R.id.bf1);
        b2 = findViewById(R.id.lunch1);
        b3 = findViewById(R.id.snack1);
        b4= findViewById(R.id.dinner1);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),keto_breakfast.class);
                startActivity(i1);

            }});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),keto_lunch.class);
                startActivity(i);

            }});
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),keto_dinner.class);
                startActivity(i);

            }});
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),keto_snacks.class);
                startActivity(i);

            }});


    }
    @Override
    protected void onStart() {
        super.onStart();
    }

}

