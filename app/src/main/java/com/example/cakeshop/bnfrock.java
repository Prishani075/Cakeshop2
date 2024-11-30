package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bnfrock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnfrock);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnfrock.this, birthday.class);
                startActivity(intent);
            }
        });

        ImageButton btn1 = findViewById(R.id.imageButton15);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnfrock.this, bnfrock.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button25);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bnfrock.this, confirmation.class);
                startActivity(intent);
            }
        });
    }
}