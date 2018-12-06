package com.geeks.asmat.sensorsdemo;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    Sensor sensor;
    ImageView imageView;
    TextView x;
    TextView y;
    TextView z;

    int i = 0;
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
            R.drawable.sandwich,
            R.drawable.pic1,
            R.drawable.pic2
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        imageView = findViewById(R.id.imageView);
        x=findViewById(R.id.x_axis);
        y=findViewById(R.id.y_axis);
        z=findViewById(R.id.z_axis);

    }
    protected void onStart()
    {
        super.onStart();
        sensorManager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }
    protected void onStop()
    {
        super.onStop();
        sensorManager.unregisterListener(this);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {

        x.setText(event.values[0]+"");
        y.setText(event.values[1]+"");
        z.setText(event.values[2]+"");


        if(event.values[2]> 0.5){
            //Anti-Clockwise along z-axis
            if(i<images.length-1) {
                i++;
                imageView.setImageResource(images[i]);
            }

        }
        else if(event.values[2]< -0.5){
            //Clockwise along z-axis
            if(i>0) {
                i--;
                imageView.setImageResource(images[i]);
            }

        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
