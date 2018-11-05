package com.geeks.asmat.groupmembersinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Information extends AppCompatActivity {
    ImageView imageView;
    TextView t1,t2,t3,t4;
    String arr[][]={{"Asmat","F16SW157","Asmatullah540@gmail.com","05-07-1997"},{"Haris","F16SW11","mohammadharistdm@gmail.com","28-08-1998"},{"Amir Hyder","F16SW85","Amirhyderkaloi@gmail.com","01-02-1998"},{"Vinod","F16SW61","vinod.kumar.3624423@gmail.com","15-05-1998"},{"Haresh","F16SW63","Haresh1998uk@gmail.com","11-07-1997"},{"Eidan","F16SW65","Eidankhan11@gmail.com","05-09-1998"},};
    int i=0, j=0;

    ImageView image[]=new ImageView[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        imageView = findViewById(R.id.i_imageView);
        t1=findViewById(R.id.t_name);
        t2=findViewById(R.id.t_rollno);
        t3=findViewById(R.id.t_email);
        t4=findViewById(R.id.t_dob);
        imageView.setImageResource(R.drawable.asmat);
        t1.setText(arr[i][j]);
        t2.setText(arr[i][j + 1]);
        t3.setText(arr[i][j + 2]);
        t4.setText(arr[i][j + 3]);
    }

    public void nextButtonClick(View v)

    {
        if(i>=0&&i<5) {
            i++;
            checkImages();
            t1.setText(arr[i][j]);
            t2.setText(arr[i][j + 1]);
            t3.setText(arr[i][j + 2]);
            t4.setText(arr[i][j + 3]);
        }
        else
            Toast.makeText(getApplicationContext(),"Last Member!",Toast.LENGTH_SHORT).show();
    }
    public void previousButtonClick(View v)

    {
        if(i>0&&i<6) {
            i--;
            checkImages();
            t1.setText(arr[i][j]);
            t2.setText(arr[i][j + 1]);
            t3.setText(arr[i][j + 2]);
            t4.setText(arr[i][j + 3]);
        }
        else
            Toast.makeText(getApplicationContext(),"First Member!",Toast.LENGTH_SHORT).show();

    }
    public void checkImages()
    {

        if(i==0)
        {
            imageView.setImageResource(R.drawable.asmat);
        }
        else if(i==1)
        {
            imageView.setImageResource(R.drawable.haris);
        }
        else if(i==2)
        {
            imageView.setImageResource(R.drawable.amir);
        }
        else if(i==3)
        {
            imageView.setImageResource(R.drawable.vinod);
        }
        else if(i==4)
        {
            imageView.setImageResource(R.drawable.haresh);
        }
        else if(i==5)
        {
            imageView.setImageResource(R.drawable.eidan);
        }
    }
}