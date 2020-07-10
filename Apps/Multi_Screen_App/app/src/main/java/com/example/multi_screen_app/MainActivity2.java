package com.example.multi_screen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void change_prev_screen(View V)
    {

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
    public void change_next_screen(View V)
    {

        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
}