package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class meal2 extends AppCompatActivity {



        private Button b5;
        private Button b6;
        private Button b7;
        private Button b8;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_meal2);
            b5 = findViewById(R.id.bf2);
            b6 = findViewById(R.id.lunch2);
            b7 = findViewById(R.id.snack2);
            b8 = findViewById(R.id.dinner2);

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i1 = new Intent(getApplicationContext(),keto_breakfast.class);
                    startActivity(i1);

                }});
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),keto_lunch.class);
                    startActivity(i);

                }});
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),keto_dinner.class);
                    startActivity(i);

                }});
            b7.setOnClickListener(new View.OnClickListener() {
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

