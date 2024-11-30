package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class executiverecent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executiverecent);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, Executive.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, Executive.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executivepopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executiveseason.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button6);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button5);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  bndatecake.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  bnchocoblueberry.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  bnchocoalmond.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        ImageButton btn17 = findViewById(R.id.imageButton2);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn18 = findViewById(R.id.imageButton3);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn19 = findViewById(R.id.imageButton4);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = findViewById(R.id.imageButton5);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(executiverecent.this, profile.class);
                startActivity(intent);
            }
        });
    }
}