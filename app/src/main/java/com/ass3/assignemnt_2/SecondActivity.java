package com.ass3.assignemnt_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView t = findViewById(R.id.t7);
        TextView t1 = findViewById(R.id.t9);
        TextView t2 = findViewById(R.id.t11);
        TextView t3 = findViewById(R.id.t12);
        TextView t4 = findViewById(R.id.t13);
        TextView t5 = findViewById(R.id.t14);

        Intent i1 = getIntent();
        String radio1 = i1.getStringExtra("radio1");
        String radio2 = i1.getStringExtra("radio2");
        String cbox1 = i1.getStringExtra("cbox1");
        String cbox2 = i1.getStringExtra("cbox2");
        String cbox3 = i1.getStringExtra("cbox3");
        String cbox4 = i1.getStringExtra("cbox4");
        t.setText(radio1);
        t1.setText(radio2);
        t2.setText(cbox1);
        t3.setText(cbox2);
        t4.setText(cbox3);
        t5.setText(cbox4);
    }
}