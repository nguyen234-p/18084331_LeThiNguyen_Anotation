package com.example.tuan2_anotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Bai2 extends AppCompatActivity {
    ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        img1=findViewById(R.id.imageView);
        img1=findViewById(R.id.imageView10);
        img1=findViewById(R.id.imageView11);
    }
}