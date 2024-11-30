package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class birthdaycustom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaycustom);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdaycustom.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdaycustom.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button14);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdaycustom.this,  birthdayrecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button15);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdaycustom.this,  birthdaypopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdaycustom.this,  birthdaycustom.class);
                startActivity(intent);
            }
        });
    }
}