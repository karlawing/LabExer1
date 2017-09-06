package com.karl.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView rawScore;
    TextView finalGrade;
    Button bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        rawScore = (TextView) findViewById(R.id.score);
        finalGrade = (TextView) findViewById(R.id.tr);
        bck = (Button) findViewById(R.id.btnBack);

        Double raw = getIntent().getDoubleExtra("raw_average", 0);
        Double tr = getIntent().getDoubleExtra("final_grade", 0);

        rawScore.setText(String.valueOf(raw));

        finalGrade.setText(String.valueOf(tr));
    }

    public void Back(View view) {
        Intent i2 = new Intent(this, LabExer1.class);
        startActivity(i2);
    }
}
