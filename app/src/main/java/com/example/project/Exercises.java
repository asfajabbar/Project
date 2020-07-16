package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Exercises extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;
    private ArrayList<Workout> wodList;
    private ArrayList<String> tittleList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        wodList= DataHelper.loadWorkout(this);
        tittleList=new ArrayList<>();
        for(int i=0;i<wodList.size();i++)
        {
            String str=wodList.get(i).getTitle();
            tittleList.add(str);
        }

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tittleList);
        lv.setAdapter((ListAdapter) adapter);

        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

        Intent intent = new Intent(this, Details.class);
        String title= wodList.get(pos).getTitle();
        String wod= wodList.get(pos).getWod();
        intent.putExtra("EXTRA_TITLE",title);
        intent.putExtra("EXTRA_WOD",title);

        startActivity(intent);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}