package com.parallelogram.custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnahead,btnback;
    static int count=-1;
    MyProgressBar step_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);
        step_progress_bar=findViewById(R.id.step_progress_bar);

        btnahead=(Button) findViewById(R.id.btnahead);
        btnback=(Button) findViewById(R.id.btnback);

        btnahead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                step_progress_bar.updateProgress(count);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                step_progress_bar.updateProgress(count);
            }
        });
    }
}
