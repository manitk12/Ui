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

                notApplicable.setBackgroundResource(R.drawable.designbutton);
                didNotTake.setBackgroundResource(R.drawable.designbutton);

                tookExam.setBackgroundResource(R.drawable.design2);
            }
        });


        notApplicable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tookExam.setBackgroundResource(R.drawable.designbutton);
                didNotTake.setBackgroundResource(R.drawable.designbutton);

                notApplicable.setBackgroundResource(R.drawable.design2);
            }
        });


        didNotTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notApplicable.setBackgroundResource(R.drawable.designbutton);
                tookExam.setBackgroundResource(R.drawable.designbutton);

                didNotTake.setBackgroundResource(R.drawable.design2);
            }
        });
    }
}
