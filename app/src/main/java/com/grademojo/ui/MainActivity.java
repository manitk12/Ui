package com.grademojo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tookExam , notApplicable , didNotTake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tookExam = (TextView) findViewById(R.id.tookexam1);
        notApplicable = (TextView) findViewById(R.id.notapp1);
        didNotTake = (TextView) findViewById(R.id.didnottake1);


        tookExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notApplicable.setBackgroundResource(R.drawable.xml_bg_blue_r15);
                didNotTake.setBackgroundResource(R.drawable.xml_bg_blue_r15);

                tookExam.setBackgroundResource(R.drawable.xml_bg_grey_r15);
            }
        });


        notApplicable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tookExam.setBackgroundResource(R.drawable.xml_bg_blue_r15);
                didNotTake.setBackgroundResource(R.drawable.xml_bg_blue_r15);

                notApplicable.setBackgroundResource(R.drawable.xml_bg_grey_r15);
            }
        });


        didNotTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notApplicable.setBackgroundResource(R.drawable.xml_bg_blue_r15);
                tookExam.setBackgroundResource(R.drawable.xml_bg_blue_r15);

                didNotTake.setBackgroundResource(R.drawable.xml_bg_grey_r15);
            }
        });
    }
}
