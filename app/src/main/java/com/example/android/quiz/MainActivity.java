package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenertOnButton();
    }

    public void addListenertOnButton() {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = evaluate();

                if (score != -1) {
                    if (score >= 70) {
                        Toast.makeText(MainActivity.this, "You get " + score + ". Congratulations!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "You get " + score + ". Try Again!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    private int evaluate() {
        int tmp = 0;
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.rg2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.rg3);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.rg4);
        RadioGroup rg5 = (RadioGroup) findViewById(R.id.rg5);
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.rg6);
        RadioGroup rg7 = (RadioGroup) findViewById(R.id.rg7);
        RadioGroup rg8 = (RadioGroup) findViewById(R.id.rg8);
        RadioGroup rg9 = (RadioGroup) findViewById(R.id.rg9);
        RadioGroup rg10 = (RadioGroup) findViewById(R.id.rg10);
        int Id1 = rg1.getCheckedRadioButtonId();
        int Id2 = rg2.getCheckedRadioButtonId();
        int Id3 = rg3.getCheckedRadioButtonId();
        int Id4 = rg4.getCheckedRadioButtonId();
        int Id5 = rg5.getCheckedRadioButtonId();
        int Id6 = rg6.getCheckedRadioButtonId();
        int Id7 = rg7.getCheckedRadioButtonId();
        int Id8 = rg8.getCheckedRadioButtonId();
        int Id9 = rg9.getCheckedRadioButtonId();
        int Id10 = rg10.getCheckedRadioButtonId();

        if (Id1 == -1
                || Id2 == -1
                || Id3 == -1
                || Id4 == -1
                || Id5 == -1
                || Id6 == -1
                || Id7 == -1
                || Id8 == -1
                || Id9 == -1
                || Id10 == -1) {
            tmp = -1;
            Toast.makeText(MainActivity.this, "Please answer all of them", Toast.LENGTH_LONG).show();
            return tmp;
        }
        else {
            RadioButton but1 = (RadioButton) findViewById(Id1);
            RadioButton but2 = (RadioButton) findViewById(Id2);
            RadioButton but3 = (RadioButton) findViewById(Id3);
            RadioButton but4 = (RadioButton) findViewById(Id4);
            RadioButton but5 = (RadioButton) findViewById(Id5);
            RadioButton but6 = (RadioButton) findViewById(Id6);
            RadioButton but7 = (RadioButton) findViewById(Id7);
            RadioButton but8 = (RadioButton) findViewById(Id8);
            RadioButton but9 = (RadioButton) findViewById(Id9);
            RadioButton but10 = (RadioButton) findViewById(Id10);
            String ans1 = "karbohidrat";
            String ans2 = "salah";
            String ans3 = "salah";
            String ans4 = "salah";
            String ans5 = "salah";
            String ans6 = "bagian kuning telur";
            String ans7 = "ayam";
            String ans8 = "salah";
            String ans9 = "benar";
            String ans10 = "salah";

            if (but1.getText().toString().toLowerCase().equals(ans1)) tmp += 10;
            if (but2.getText().toString().toLowerCase().equals(ans2)) tmp += 10;
            if (but3.getText().toString().toLowerCase().equals(ans3)) tmp += 10;
            if (but4.getText().toString().toLowerCase().equals(ans4)) tmp += 10;
            if (but5.getText().toString().toLowerCase().equals(ans5)) tmp += 10;
            if (but6.getText().toString().toLowerCase().equals(ans6)) tmp += 10;
            if (but7.getText().toString().toLowerCase().equals(ans7)) tmp += 10;
            if (but8.getText().toString().toLowerCase().equals(ans8)) tmp += 10;
            if (but9.getText().toString().toLowerCase().equals(ans9)) tmp += 10;
            if (but10.getText().toString().toLowerCase().equals(ans10)) tmp += 10;

            return tmp;
        }
    }
}
