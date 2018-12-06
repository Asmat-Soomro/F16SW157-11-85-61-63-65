package com.example.alihyder.mysensors;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    GestureDetectorCompat gestureDetectorCompat;
    private int counter = 0;
    //TextView gesture;

    int[] image = {R.drawable.photo1, R.drawable.photo2, R.drawable.photo3};
    ImageView imageView;
    float prev=0l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        gestureDetectorCompat = new GestureDetectorCompat(this, this);
        gestureDetectorCompat.setIsLongpressEnabled(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        // gesture.setText("Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        //gesture.setText("Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        //gesture.setText("Single Tap Up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float
            distanceX, float distanceY) {
        //gesture.setText("Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        //gesture.setText("Long Press");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float
            velocityX, float velocityY) {
        //gesture.setText(velocityX+" "+velocityY);

        if (e1.getX()>=0) {
            counter+=1;
        }

        else if (e2.getX()<0) {
            counter-=1;
        }
        counter = counter % image.length;


        imageView.setImageResource(image[counter]);

        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        //gesture.setText("Single Tap Confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        //gesture.setText("Double Tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        //gesture.setText("Double Tap Confirmed");
        return false;
    }
}
