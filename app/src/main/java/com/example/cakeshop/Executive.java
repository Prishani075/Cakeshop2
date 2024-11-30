package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Executive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executive);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, home.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, Executive.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button14);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  executiverecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button15);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  executivepopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  executiveseason.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button1);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bnchocoalmond.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button3);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bnchocovanilla.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button4);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button5);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bnchocoblueberry.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button6);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        Button btn11 = findViewById(R.id.button7);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bnmangostrawberry.class);
                startActivity(intent);
            }
        });

        Button btn12 = findViewById(R.id.button8);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        Button btn13 = findViewById(R.id.button9);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bnmangoblueberry.class);
                startActivity(intent);
            }
        });

        Button btn14 = findViewById(R.id.button10);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        Button btn15 = findViewById(R.id.button11);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  bndatecake.class);
                startActivity(intent);
            }
        });

        Button btn16 = findViewById(R.id.button12);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this,  Executive.class);
                startActivity(intent);
            }
        });

        ImageButton btn17 = findViewById(R.id.imageButton2);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn18 = findViewById(R.id.imageButton3);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn19 = findViewById(R.id.imageButton4);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = findViewById(R.id.imageButton5);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Executive.this, profile.class);
                startActivity(intent);
            }
        });
    }
}