package com.ass3.assignemnt_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.btn);
        final TextView t1 = findViewById(R.id.t1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Radio Group 1
                RadioGroup rdb = findViewById(R.id.r1);
                int checked = rdb.getCheckedRadioButtonId();
                final RadioButton r1 = findViewById(checked);

                //Radio Group 2
                RadioGroup rdb2 = findViewById(R.id.r2);
                int checked2 = rdb2.getCheckedRadioButtonId();
                final RadioButton r2 = findViewById(checked2);

                //Check Boxes
                CheckBox cb1 = findViewById(R.id.c1);
                CheckBox cb2 = findViewById(R.id.c2);
                CheckBox cb3 = findViewById(R.id.c3);
                CheckBox cb4 = findViewById(R.id.c4);

                if(r1 != null && r2 != null && (cb1 != null || cb2 != null || cb3 != null || cb4 != null)) {

                    final String rad1 = r1.getText().toString();
                    final String rad2 = r2.getText().toString();
                    String c1,c2,c3,c4;

                    if(cb1.isChecked())
                        c1 = "Checked";

                    else
                        c1 = "Unchecked";

                    if(cb2.isChecked())
                        c2 = "Checked";

                    else
                        c2 = "Unchecked";

                    if(cb3.isChecked())
                        c3 = "Checked";

                    else
                        c3 = "Unchecked";

                    if(cb4.isChecked())
                        c4 = "Checked";

                    else
                        c4 = "Unchecked";


                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("radio1", rad1);
                    i.putExtra("radio2", rad2);
                    i.putExtra("cbox1",c1);
                    i.putExtra("cbox2",c2);
                    i.putExtra("cbox3",c3);
                    i.putExtra("cbox4",c4);
                    startActivity(i);
                }
            }
        });
    }
}