package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class royalrecent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royalrecent);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button14);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, royalrecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button15);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, royalpopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, royalseason.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, royalrecent.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button3);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, bnbutterscotch.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button5);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, bnchocolate.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button6);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, royalrecent.class);
                startActivity(intent);
            }
        });

        ImageButton btn19 = findViewById(R.id.imageButton2);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = findViewById(R.id.imageButton3);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn21 = findViewById(R.id.imageButton4);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn22 = findViewById(R.id.imageButton5);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(royalrecent.this, profile.class);
                startActivity(intent);
            }
        });
    }
}