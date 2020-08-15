package com.example.mad_trial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreate:started.");
        ImageView firstImage=(ImageView)findViewById(R.id.imageView2);

        int imageResource=getResources().getIdentifier("@drawable/rice",null,this.getPackageName());
        firstImage.setImageResource(imageResource);
    }
}