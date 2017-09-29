package com.example.kirthikas.findyourway;

import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button sampleButton;
    TextView matrixText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleButton = (Button) findViewById(R.id.sampleButton);
        sampleButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                matrixText = (TextView) findViewById(R.id.matrix);
                matrixText.setText("3 4 1 2 8 6\n" +
                        "6 1 8 2 7 4\n" +
                        "5 9 3 9 9 5\n" +
                        "8 4 1 3 2 6\n" +
                        "3 7 2 8 6 4");
            }

        });
    }
}
