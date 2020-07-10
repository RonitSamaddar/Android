package com.example.multi_screen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change_next_screen(View V)
    {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
}