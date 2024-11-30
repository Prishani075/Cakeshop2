package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Royal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, home.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button14);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, royalrecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button15);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, royalpopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, royalseason.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button1);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnwf.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button3);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnbutterscotch.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button4);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button5);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnchocolate.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button6);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });
        Button btn11 = findViewById(R.id.button7);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnblackforest.class);
                startActivity(intent);
            }
        });

        Button btn12 = findViewById(R.id.button6);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn13 = findViewById(R.id.button7);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnblackforest.class);
                startActivity(intent);
            }
        });

        Button btn14 = findViewById(R.id.button8);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn15 = findViewById(R.id.button9);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnredvelvet.class);
                startActivity(intent);
            }
        });

        Button btn16 = findViewById(R.id.button10);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        Button btn17 = findViewById(R.id.button11);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, bnchristmas.class);
                startActivity(intent);
            }
        });

        Button btn18 = findViewById(R.id.button12);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, Royal.class);
                startActivity(intent);
            }
        });

        ImageButton btn19 = findViewById(R.id.imageButton2);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = findViewById(R.id.imageButton3);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn21 = findViewById(R.id.imageButton4);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn22 = findViewById(R.id.imageButton5);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Royal.this, profile.class);
                startActivity(intent);
            }
        });
    }
}