package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Diet_plans extends AppCompatActivity {
    RecyclerView list;

    List<String> titles;
    List<Integer> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("KETO DIET");
        titles.add("BASIC DIET");
        titles.add("EXERCISES");
        titles.add("TIPS");
        images.add(R.drawable.picture1);
        images.add(R.drawable.picture2);
        images.add(R.drawable.picture3);
        images.add(R.drawable.picture4);
        adapter = new Adapter(this, titles, images);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        list.setLayoutManager(gridLayoutManager);
        list.setAdapter(adapter);
    }
}
