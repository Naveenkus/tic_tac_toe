package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView textView14;
//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView14 = findViewById(R.id.textView14);
        Intent intent = getIntent();
       String winner =  intent.getStringExtra(MainActivity2.EXTRA_NAME);
        textView14.setText(winner);
    }
}