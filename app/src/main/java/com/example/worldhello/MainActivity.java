package com.example.worldhello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v1) {
        TextView text = findViewById(R.id.textView);
        text.setText("I've been expecting you Mr.Martas");
    }

    public void onClick2(View v2) {
        TextView text = findViewById(R.id.textView);
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        text.setTextColor(color);
    }
}