package com.karl.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LabExer1 extends AppCompatActivity {

    EditText quiz1;
    EditText quiz2;
    EditText seatwork;
    EditText labexam;
    EditText majorexam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_exer1);

        quiz1 = (EditText) findViewById(R. id.q1);
        quiz2 = (EditText)findViewById(R.id.q2);
        seatwork = (EditText) findViewById(R. id.sw);
        labexam = (EditText) findViewById(R. id.labex);
        majorexam = (EditText) findViewById(R. id.majex);
    }

    public void compute(View view){
        double q1,q2,sw,le,me,rawA,fg=0;

        q1 = Double.parseDouble(quiz1.getText().toString());
        q2 = Double.parseDouble(quiz2.getText().toString());
        sw = Double.parseDouble(seatwork.getText().toString());
        le = Double.parseDouble(labexam.getText(). toString());
        me = Double.parseDouble(majorexam.getText().toString());

        rawA = (0.10 * q1) + (0.10 * q2) + (0.10 * sw) + (0.40 * le) + (0.30 * me);


        if (rawA < 60 ){
            fg = 5;
        }

        else if (rawA == 60 || rawA <= 65 ){
            fg = 3;
        }

        else if  (rawA == 66 || rawA <= 70){
            fg = 2.75;
        }

        else if (rawA == 71 || rawA <= 75){
            fg = 2.50;
        }

        else if (rawA == 76 || rawA <= 80){
            fg = 2.25;
        }
        //2.0
        else if (rawA == 81 || rawA <= 85){
            fg = 2.00;
        }
        //1.75
        else if (rawA == 86 || rawA <= 90){
            fg = 1.75;
        }
        //1.5
        else if (rawA == 91 || rawA <= 92){
            fg = 1.50;
        }
        //1.25
        else if (rawA == 93 || rawA <= 94){
            fg = 1.25;
        }
        //1.0
        else if (rawA == 95 || rawA <= 100){
            fg = 1.00;
        }

        Intent i = new Intent(this, secondactivity.class);
        i.putExtra("raw_average", rawA);
        i.putExtra("final_grade", fg);


        startActivity(i);

    }
}
