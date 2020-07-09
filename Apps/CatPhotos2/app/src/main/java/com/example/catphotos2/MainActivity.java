package com.example.catphotos2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int c=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changePhoto(View V)
    {

        System.out.println("HelloWorld");
        ImageView I = findViewById(R.id.cat_pic);
        int[] img={R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5};
        c=(c+1)%5;
        System.out.println(img[c]);
        I.setImageResource(img[c]);
        //if (d != null) {
        //    I.setImageDrawable(drawable);
        //}
    }

}