package com.example.tuan2_anotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView img1, img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img1 = findViewById(R.id.imageView4);
        img1 = findViewById(R.id.imageView7);
        img1 = findViewById(R.id.imageView9);
    }
}