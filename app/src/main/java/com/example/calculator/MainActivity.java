package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('1');


            }
        });
        findViewById(R.id.Button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('2');

            }
        });
        findViewById(R.id.Button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('3');

            }
        });
        findViewById(R.id.Button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('4');

            }
        });
        findViewById(R.id.Button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('5');

            }
        });
        findViewById(R.id.Button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('6');

            }
        });
        findViewById(R.id.Button_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('7');

            }
        });
        findViewById(R.id.Button_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('8');


            }
        });
        findViewById(R.id.Button_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('9');


            }
        });
        findViewById(R.id.Button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('0');


            }
        });
        findViewById(R.id.Button_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('+');


            }
        });
        findViewById(R.id.Button_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('-');


            }
        });
        findViewById(R.id.Button_dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('.');


            }
        });
        findViewById(R.id.Button_divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('/');


            }
        });
        findViewById(R.id.Button_multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InputResult('*');


            }
        });
        findViewById(R.id.Button_equals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}