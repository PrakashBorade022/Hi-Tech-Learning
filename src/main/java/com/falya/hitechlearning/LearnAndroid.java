package com.falya.hitechlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnAndroid extends AppCompatActivity {
    Button android_what_is_android,android_why_android,android_history,android_oop,android_and_java,android_and_kotlin,android_avd,android_types_of_android_app;
    Button android_intent,android_services,android_activity,android_layout,android_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_android);



        android_what_is_android = (Button)findViewById(R.id.android_what_is_android);

        android_why_android = (Button)findViewById(R.id.android_why_android);

        android_history = (Button)findViewById(R.id.android_history);

        android_oop = (Button)findViewById(R.id.android_oop);

        android_and_java = (Button)findViewById(R.id.android_and_java);

        android_and_kotlin = (Button)findViewById(R.id.android_and_kotlin);

        android_avd = (Button)findViewById(R.id.android_avd);

        android_types_of_android_app = (Button)findViewById(R.id.android_types_of_android_app);

        android_intent = (Button)findViewById(R.id.android_intent);

        android_services = (Button)findViewById(R.id.android_services);

        android_activity = (Button)findViewById(R.id.android_activity);

        android_layout = (Button)findViewById(R.id.android_layout);


        android_sqlite =(Button)findViewById(R.id.android_sqlite);



        android_what_is_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_what_is_android.class);
                startActivity(intent);
            }
        });
        android_why_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_why_android.class);
                startActivity(intent);
            }
        });
        android_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_history.class);
                startActivity(intent);
            }
        });
        android_oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_oop.class);
                startActivity(intent);
            }
        });
        android_and_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_and_java.class);
                startActivity(intent);
            }
        });
        android_and_kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_and_kotlin.class);
                startActivity(intent);
            }
        });
        android_avd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_avd.class);
                startActivity(intent);
            }
        });
        android_types_of_android_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_types_of_app.class);
                startActivity(intent);
            }
        });
        android_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_intent.class);
                startActivity(intent);
            }
        });
        android_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_services.class);
                startActivity(intent);
            }
        });
        android_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_activity.class);
                startActivity(intent);
            }
        });
        android_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_layout.class);
                startActivity(intent);
            }
        });

        android_sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnAndroid.this,Android_sqlite.class);
                startActivity(intent);
            }
        });


    }
}
