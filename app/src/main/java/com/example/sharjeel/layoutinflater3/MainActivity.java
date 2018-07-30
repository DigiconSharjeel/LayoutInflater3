package com.example.sharjeel.layoutinflater3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////////////////////////////////////////////////////
        LayoutInflater l=getLayoutInflater();
        View v=l.inflate(R.layout.sublayout,null);
        FrameLayout f=(FrameLayout) findViewById(R.id.my_frame_layout);
        f.addView(v);
    }
}
