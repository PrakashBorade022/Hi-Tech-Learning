package com.falya.hitechlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button learnjava;
    Button learnandroid;
    Button learnphp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learnjava = (Button)findViewById(R.id.java);
        learnandroid =(Button)findViewById(R.id.android);
        learnphp = (Button)findViewById(R.id.php);


        learnjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent javaintent =new Intent(MainActivity.this,LearnJava.class);
                startActivity(javaintent);
            }
        });
        learnandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent androidintent =new Intent(MainActivity.this,LearnAndroid.class);
                startActivity(androidintent);
            }
        });



        learnphp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phpintent =new Intent(MainActivity.this,LearnPHP.class);
                startActivity(phpintent);
            }
        });

    }
}
