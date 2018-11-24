package com.geeks.asmat.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> listData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupList();
        RecyclerView list = findViewById(R.id.list);
        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(listData,this);
        list.setAdapter(adapter);
        Toast.makeText(this,"Scroll Up",Toast.LENGTH_SHORT).show();

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
    }
}
