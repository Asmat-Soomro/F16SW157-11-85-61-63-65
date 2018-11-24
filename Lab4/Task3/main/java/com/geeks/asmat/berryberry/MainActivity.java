package com.geeks.asmat.berryberry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolBar;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        listView = findViewById(R.id.listView);
        getSupportActionBar().setLogo(R.drawable.ic_search);
        List<String> list  = new ArrayList<>();
        for(int i=1; i<=100; i+=2)
        {
            list.add("F16SW"+i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = listView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"User Clicked "+s, Toast.LENGTH_LONG).show();

            }
        });



    }


}
