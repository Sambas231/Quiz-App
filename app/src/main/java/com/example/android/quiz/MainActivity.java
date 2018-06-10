package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
    }

    public void addListenertOnButton() {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = evaluate();

                if (score != -1) {
                    if (score >= 70) {
                        Toast.makeText(MainActivity.this, "You get " + score + ". Congratulations!", Toast.LENGTH_LONG);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "You get " + score + ". Try Again!", Toast.LENGTH_LONG);
                    }
                }
            }
        });
    }

    
}
