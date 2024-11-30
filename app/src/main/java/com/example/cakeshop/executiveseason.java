package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class executiveseason extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executiveseason);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, Executive.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, Executive.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this,  executivepopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this,  executiveseason.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button6);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this,  executiveseason.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button5);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this,  bndatecake.class);
                startActivity(intent);
            }
        });


        ImageButton btn17 = findViewById(R.id.imageButton2);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn18 = findViewById(R.id.imageButton3);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn19 = findViewById(R.id.imageButton4);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = findViewById(R.id.imageButton5);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiveseason.this, profile.class);
                startActivity(intent);
            }
        });
    }
}