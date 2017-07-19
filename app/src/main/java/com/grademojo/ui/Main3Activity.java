package com.grademojo.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mainTextView, redColor, blueColor, greenColor, greyColor;

    private View mainBorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mainTextView = (TextView) findViewById(R.id.main_text_view);
        redColor = (TextView) findViewById(R.id.red);
        blueColor = (TextView) findViewById(R.id.blue);
        greenColor = (TextView) findViewById(R.id.green);
        greyColor = (TextView) findViewById(R.id.grey);

        mainBorder = findViewById(R.id.main_border);




        redColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainTextView.setTextColor(Color.RED);
                mainBorder.setBackgroundColor(Color.RED);
            }
        });


        blueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainTextView.setTextColor(Color.BLUE);
                mainBorder.setBackgroundColor(Color.BLUE);
            }
        });


        greenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainTextView.setTextColor(Color.GREEN);
                mainBorder.setBackgroundColor(Color.GREEN);
            }
        });


        greyColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTextView.setTextColor(Color.GRAY);
                mainBorder.setBackgroundColor(Color.GRAY);
            }
        });
    }
}
