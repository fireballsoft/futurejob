package com.fireballsoft.futurejob;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends Activity {

    private TextView txtRst;

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        txtRst = findViewById(R.id.txtRst);

        name = getIntent().getStringExtra("name");

        setResult();
    }

    private String[] JOB = {"거지", "고철 수집가", "심마니", "인력거꾼", "암표상", "셔터맨"};

    private void setResult() {
        Random rand = new Random();
        int val = rand.nextInt(JOB.length);

        txtRst.setText(name + "\n" + JOB[val]);
    }



}
