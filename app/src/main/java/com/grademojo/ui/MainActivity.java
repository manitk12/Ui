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
                //tookExam.setBackground(getResources().getDrawable(R.drawable.whatever));
                tookExam.setSelected(!tookExam.isSelected());
                    if (tookExam.isSelected()){
                    tookExam.setBackgroundResource(R.drawable.design2);
                    tookExam.setClickable(true);

                }

               else {
                    tookExam.setClickable(false);
                    notApplicable.setClickable(true);
                    didNotTake.setClickable(true);
                    notApplicable.setBackgroundResource(R.drawable.designbutton);
                    didNotTake.setBackgroundResource(R.drawable.designbutton);
                }


            }
        });


        notApplicable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tookExam.setBackground(getResources().getDrawable(R.drawable.whatever));
                notApplicable.setSelected(!notApplicable.isSelected());
                if (notApplicable.isSelected()){
                    notApplicable.setBackgroundResource(R.drawable.design2);
                    notApplicable.setClickable(true);
                    tookExam.setClickable(false);
                    didNotTake.setClickable(false);
                }
                else {
                    notApplicable.setClickable(false);
                    tookExam.setClickable(true);
                    tookExam.setBackgroundResource(R.drawable.designbutton);
                    didNotTake.setClickable(true);
                    didNotTake.setBackgroundResource(R.drawable.designbutton);
                }

            }
        });


        didNotTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tookExam.setBackground(getResources().getDrawable(R.drawable.whatever));
                didNotTake.setSelected(!didNotTake.isSelected());
                if (didNotTake.isSelected()){
                    didNotTake.setBackgroundResource(R.drawable.design2);
                    didNotTake.setClickable(true);
                    notApplicable.setClickable(false);
                    tookExam.setClickable(false);
                }
                else {
                    didNotTake.setClickable(false);
                    tookExam.setClickable(true);
                    notApplicable.setClickable(true);
                    tookExam.setBackgroundResource(R.drawable.designbutton);
                    notApplicable.setBackgroundResource(R.drawable.designbutton);
                }

            }
        });
    }
}
