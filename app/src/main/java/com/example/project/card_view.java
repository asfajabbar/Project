package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class card_view extends AppCompatActivity {
    private CardView meal1card, meal2card, exercisescard, tipscard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        meal1card = findViewById(R.id.meal1);
        meal2card = findViewById(R.id.meal2);
        exercisescard = findViewById(R.id.exercise);
        tipscard = findViewById(R.id.tips);


        meal1card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),meal1.class);
                startActivity(i1);

            }});
        meal2card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),meal2.class);
                startActivity(i2);

            }});
        exercisescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(),Exercises.class);
                startActivity(i3);

            }});
        tipscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(),Tips.class);
                startActivity(i4);

            }});

    }

}
