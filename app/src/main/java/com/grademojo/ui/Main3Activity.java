package com.grademojo.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView changeColor ,redColor ,blueColor ,greenColor ,greyColor;

    View borderColorChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        changeColor = (TextView) findViewById(R.id.textcolor);
        redColor = (TextView) findViewById(R.id.start);
        blueColor = (TextView) findViewById(R.id.end);
        greenColor = (TextView) findViewById(R.id.top);
        greyColor = (TextView) findViewById(R.id.bottom);

        borderColorChange = findViewById(R.id.top1);




        redColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeColor.setTextColor(Color.RED);
                borderColorChange.setBackgroundColor(Color.RED);
            }
        });


        blueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeColor.setTextColor(Color.BLUE);
                borderColorChange.setBackgroundColor(Color.BLUE);
            }
        });


        greenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeColor.setTextColor(Color.GREEN);
                borderColorChange.setBackgroundColor(Color.GREEN);
            }
        });


        greyColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor.setTextColor(Color.GRAY);
                borderColorChange.setBackgroundColor(Color.GRAY);
            }
        });
    }
}
