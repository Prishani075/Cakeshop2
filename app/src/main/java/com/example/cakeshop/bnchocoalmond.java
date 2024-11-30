package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bnchocoalmond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnchocoalmond);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnchocoalmond.this, Executive.class);
                startActivity(intent);
            }
        });

        ImageButton btn1 = findViewById(R.id.imageButton15);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnchocoalmond.this, bnchocoalmond.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button25);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnchocoalmond.this, confirmation.class);
                startActivity(intent);
            }
        });
    }
}