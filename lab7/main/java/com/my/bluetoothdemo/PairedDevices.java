package com.my.bluetoothdemo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Set;

public class PairedDevices extends AppCompatActivity {
    private Set<BluetoothDevice> pairedDevices;
    private BluetoothAdapter BA;
    String list;
    ListView pairedList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paired_devices);
        pairedDevices = BA.getBondedDevices();
        for(BluetoothDevice b: pairedDevices ){
            list = b.getName();
        }
        pairedList = findViewById(R.id.lv);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(PairedDevices.this, R.layout.listview,list);
//        pairedList.setAdapter(adapter);
    }
}