package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class birthdayrecent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdayrecent);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, birthday.class);
                startActivity(intent);
            }
        });

        ImageButton btn23 = findViewById(R.id.imageButton2);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn24 = findViewById(R.id.imageButton3);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn25 = findViewById(R.id.imageButton4);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn26 = findViewById(R.id.imageButton5);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, profile.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdayrecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdaypopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdaycustom.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdayrecent.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  bncar.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  bntebby.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdayrecent.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  bnfrock.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayrecent.this,  birthdayrecent.class);
                startActivity(intent);
            }
        });
    }
}