package com.grademojo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView buttonStart, buttonEnd, buttonTop, buttonBottom;

    private View borderStart, borderEnd, borderTop, borderBottom;

    private Boolean isTopBorderVisible, isStartBorderVisible,
            isEndBorderVisible, isBottomBorderVisible;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        buttonStart = (TextView) findViewById(R.id.start);
        buttonEnd = (TextView) findViewById(R.id.end);
        buttonTop = (TextView) findViewById(R.id.top);
        buttonBottom = (TextView) findViewById(R.id.bottom);

        borderStart = findViewById(R.id.start1);
        borderEnd = findViewById(R.id.end1);
        borderTop = findViewById(R.id.top1);
        borderBottom = findViewById(R.id.bottom1);





        isTopBorderVisible = true;
        isStartBorderVisible = true;
        isEndBorderVisible = true;
        isBottomBorderVisible = true;





        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isStartBorderVisible){

                    isStartBorderVisible= false;
                    borderStart.setVisibility(View.INVISIBLE);
                }else {

                    isStartBorderVisible = true;
                    borderStart.setVisibility(View.VISIBLE);
                }
            }
        });


        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isEndBorderVisible){

                    isEndBorderVisible = false;
                    borderEnd.setVisibility(View.INVISIBLE);
                } else {

                    isEndBorderVisible = true;
                    borderEnd.setVisibility(View.VISIBLE);
                }
            }
        });


        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isTopBorderVisible){

                    isTopBorderVisible = false;
                    borderTop.setVisibility(View.INVISIBLE);
                } else {

                    isTopBorderVisible = true;
                    borderTop.setVisibility(View.VISIBLE);
                }
            }
        });


        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isBottomBorderVisible){

                    isBottomBorderVisible = false;
                    borderBottom.setVisibility(View.INVISIBLE);
                } else {

                    isBottomBorderVisible = true;
                    borderBottom.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
