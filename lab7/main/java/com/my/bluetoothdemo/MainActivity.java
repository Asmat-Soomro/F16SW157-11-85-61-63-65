package com.my.bluetoothdemo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView tv;
    private BluetoothAdapter BA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BA = BluetoothAdapter.getDefaultAdapter();
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        tv=findViewById(R.id.textView);

    }
    public void turnOn(View view){
        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(turnOn, 0);
    }
    public void turnOff(View view){
        BA.disable();
    }
    public void pairedDevice(View view) {
        if (BA.enable()) {
            Set<BluetoothDevice> devices = BA.getBondedDevices();
            for(BluetoothDevice b:devices){
                tv.append("\n"+b.getName());
            }
        }
    }

    public void visiblity(View view){
        Intent visible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(visible,0);
    }

}