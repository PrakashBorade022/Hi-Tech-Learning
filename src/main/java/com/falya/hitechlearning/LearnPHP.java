package com.falya.hitechlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnPHP extends AppCompatActivity {
    Button php_waht_is_php,php_why_php,php_histroy,php_variable,php_operator,php_loops,php_class_object,php_and_mysql;
    Button php_vs_js,php_and_html,php_function,php_echo,php_file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_php);

        php_waht_is_php =(Button)findViewById(R.id.php_waht_is_php);

        php_why_php =(Button)findViewById(R.id.php_why_php);

        php_histroy =(Button)findViewById(R.id.php_histroy);


        php_variable =(Button)findViewById(R.id.php_variable);

        php_operator =(Button)findViewById(R.id.php_operator);

        php_loops =(Button)findViewById(R.id.php_loops);

        php_class_object =(Button)findViewById(R.id.php_class_object);

        php_and_mysql =(Button)findViewById(R.id.php_and_mysql);

        php_vs_js =(Button)findViewById(R.id.php_vs_js);

        php_and_html =(Button)findViewById(R.id.php_and_html);

        php_function =(Button)findViewById(R.id.php_function);

        php_echo =(Button)findViewById(R.id.php_echo);

        php_file =(Button)findViewById(R.id.php_file);

        php_waht_is_php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_what_is_php.class);
                startActivity(intent);
            }
        });
        php_why_php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_why.class);
                startActivity(intent);
            }
        });
        php_histroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_history.class);
                startActivity(intent);
            }
        });

        php_variable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_veriable.class);
                startActivity(intent);
            }
        });
        php_operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_operator.class);
                startActivity(intent);
            }
        });
        php_loops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_loops.class);
                startActivity(intent);
            }
        });
        php_class_object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_classObject.class);
                startActivity(intent);
            }
        });
        php_and_mysql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_and_mysql.class);
                startActivity(intent);
            }
        });
        php_vs_js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_vs_js.class);
                startActivity(intent);
            }
        });
        php_and_html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_and_html.class);
                startActivity(intent);
            }
        });
        php_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_function.class);
                startActivity(intent);
            }
        });
        php_echo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_echo.class);
                startActivity(intent);
            }
        });
        php_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnPHP.this,Php_file.class);
                startActivity(intent);
            }
        });
    }
}
