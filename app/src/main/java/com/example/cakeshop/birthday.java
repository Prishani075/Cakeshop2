package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class birthday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, home.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.button14);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthdayrecent.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.button15);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthdaypopular.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button16);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthdaycustom.class);
                startActivity(intent);
            }
        });

        ImageButton btn23 = findViewById(R.id.imageButton2);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton btn24 = findViewById(R.id.imageButton3);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, mycart.class);
                startActivity(intent);
            }
        });

        ImageButton btn25 = findViewById(R.id.imageButton4);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, message.class);
                startActivity(intent);
            }
        });

        ImageButton btn26 = findViewById(R.id.imageButton5);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, profile.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button1);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bncar.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button3);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnshirt.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button4);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button5);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bndoll.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button6);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn11 = findViewById(R.id.button7);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnmermaid.class);
                startActivity(intent);
            }
        });

        Button btn12 = findViewById(R.id.button8);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn13 = findViewById(R.id.button9);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bntebby.class);
                startActivity(intent);
            }
        });

        Button btn14 = findViewById(R.id.button10);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn15 = findViewById(R.id.button11);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnface.class);
                startActivity(intent);
            }
        });

        Button btn16 = findViewById(R.id.button12);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn17 = findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bncinderella.class);
                startActivity(intent);
            }
        });

        Button btn18 = findViewById(R.id.button18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn19 = findViewById(R.id.button19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnmickeymouse.class);
                startActivity(intent);
            }
        });

        Button btn20 = findViewById(R.id.button20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn21 = findViewById(R.id.button21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnbook.class);
                startActivity(intent);
            }
        });

        Button btn22 = findViewById(R.id.button22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });

        Button btn27 = findViewById(R.id.button23);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, bnfrock.class);
                startActivity(intent);
            }
        });

        Button btn28 = findViewById(R.id.button24);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthday.this, birthday.class);
                startActivity(intent);
            }
        });
    }
}