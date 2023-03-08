package com.example.posterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecycleView adapterRecycleView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i = 0; i < Myitem.judulFilm.length; i++){
            data.add(new ItemModel(
                    Myitem.judulFilm[i],
                    Myitem.tahunFilm[i],
                    Myitem.poster[i]
            ));
        }

        adapterRecycleView = new AdapterRecycleView(data);
        recyclerView.setAdapter(adapterRecycleView);

    }
}