package com.falya.hitechlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnJava extends AppCompatActivity {
    Button javahistry;
    Button whyjava;
    Button oopjava;
    Button classesandobject_java;
    Button simpleprogram_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_java);
        javahistry = (Button)findViewById(R.id.java_history);
        whyjava = (Button)findViewById(R.id.why_java);
        oopjava =(Button)findViewById(R.id.oop_java);
        classesandobject_java =(Button)findViewById(R.id.classesandobject_java);
        simpleprogram_java = (Button)findViewById(R.id.simpleprogram_java);

        javahistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnJava.this,Java_History.class);
                startActivity(intent);
            }
        });
        whyjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnJava.this,Why_Java.class);
                startActivity(intent);
            }
        });
        oopjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnJava.this,Java_OOP.class);
                startActivity(intent);
            }
        });
        classesandobject_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnJava.this,Java_Class_Object.class);
                startActivity(intent);
            }
        });
        simpleprogram_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnJava.this,Java_Simple_Program.class);
                startActivity(intent);
            }
        });
    }
}
