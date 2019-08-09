package com.falya.hitechlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {
    Button start_learning;
    Button how_to_learn;
    Button cs_and_it;
    Button you_must_know;
    Button why_this_app;
    Button prerequisits;
    Button about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        start_learning = (Button)findViewById(R.id.start_learning);
        how_to_learn = (Button)findViewById(R.id.how_to_learn);
        cs_and_it = (Button)findViewById(R.id.cs_and_it);
        you_must_know =(Button)findViewById(R.id.you_must_know);
        why_this_app =(Button)findViewById(R.id.why_this_app);
        prerequisits =(Button)findViewById(R.id.prerequisites);
        about =(Button)findViewById(R.id.about);

        start_learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(StartScreen.this,MainActivity.class);
                startActivity(intent);
            }
        });
        how_to_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartScreen.this, com.falya.hitechlearning.how_to_learn.class);
                startActivity(intent);
            }
        });
        cs_and_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartScreen.this, com.falya.hitechlearning.cs_and_it.class);
                startActivity(intent);
            }
        });
        you_must_know.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(StartScreen.this,You_Must_Know.class);
                startActivity(intent);
            }
        });
        why_this_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(StartScreen.this,Why_this_app.class);
                startActivity(intent);
            }
        });
        prerequisits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(StartScreen.this,Prerequisits.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(StartScreen.this,About.class);
                startActivity(intent);
            }
        });
    }
}
