package com.geeks.myapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {

    ImageView profile_img;
    TextView id, name;
    FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_img=findViewById(R.id.imageView);
        id=findViewById(R.id.textView);
        name=findViewById(R.id.textView2);
        button=findViewById(R.id.floatingActionButton);

        FacebookSdk.sdkInitialize(getApplicationContext());
        Intent intent=getIntent();

        String UserID= intent.getStringExtra("USER_ID");
        String FirstName= intent.getStringExtra("PROFILE_FIRST_NAME");
        String LastName= intent.getStringExtra("PROFILE_LAST_NAME");
        String ProfileURL= intent.getStringExtra("PROFILE_IMAGE_URL");

        id.setText(UserID);
        name.setText(FirstName +" "+LastName);
        Picasso.get().load(ProfileURL).into(profile_img);
        Toast.makeText(this, "Profile IMAGE URL "+ProfileURL, Toast.LENGTH_LONG).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareDialog shareDialog=new ShareDialog(ProfileActivity.this);
                ShareLinkContent content=new ShareLinkContent.Builder().build();
                shareDialog.show(content);
            }
        });
    }
}