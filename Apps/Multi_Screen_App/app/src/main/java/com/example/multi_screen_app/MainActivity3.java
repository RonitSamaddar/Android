package com.example.multi_screen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void change_prev_screen(View V)
    {

        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
    public void change_home_screen(View V)
    {

        Intent intent = new Intent(MainActivity3.this, MainActivity.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
}