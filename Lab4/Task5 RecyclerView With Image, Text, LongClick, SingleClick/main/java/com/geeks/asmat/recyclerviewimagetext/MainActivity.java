package com.geeks.asmat.recyclerviewimagetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> listData = new ArrayList<>();
    private int[] images = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.ginger,
            R.drawable.honeycomb,
            R.drawable.icecreamsandwich,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop,
            R.drawable.marshmallow,
            R.drawable.nougat,
            R.drawable.oreo,
            R.drawable.pie,
            R.drawable.quesito,
            R.drawable.raspberry,
            R.drawable.sandwich
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupList();
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images,listData,this);
        recyclerView.setAdapter(adapter);
    }

    private void setupList() {
        listData.add("APPLE");
        listData.add("BANANA");
        listData.add("CUP CAKE");
        listData.add("DONUT");
        listData.add("ECLAIR");
        listData.add("FROYO");
        listData.add("GINGERBREAD");
        listData.add("HONEYCOMB");
        listData.add("ICE CREAM SANDWICH");
        listData.add("JELLYBEAN");
        listData.add("KITKAT");
        listData.add("LOLLIPOP");
        listData.add("MARSHMALLOW");
        listData.add("NOUGAT");
        listData.add("OREO");
        listData.add("PIE");
        listData.add("QUESITO");
        listData.add("RASPBERRY");
        listData.add("SANDWICH");
    }
}
