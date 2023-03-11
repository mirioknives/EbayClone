package com.example.ebayclone;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    private ImageView topbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topbar = (ImageView)findViewById(R.id.imageView6);
        NavigationView navbar=(NavigationView)findViewById(R.id.NavBarView);
        navbar.setVisibility(View.INVISIBLE);
        topbar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                navbar.setVisibility(View.VISIBLE);

                //sidebargoeshere

            }});


    }
}