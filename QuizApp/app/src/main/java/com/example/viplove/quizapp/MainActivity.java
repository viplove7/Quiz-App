package com.example.viplove.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8;
    RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5, radiobutton6, radiobutton7, radiobutton8;
    CheckBox one, two, three, four;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio1 = (RadioGroup) findViewById(R.id.r1);
        radio2 = (RadioGroup) findViewById(R.id.r2);
        radio3 = (RadioGroup) findViewById(R.id.r3);
        radio4 = (RadioGroup) findViewById(R.id.r4);
        radio5 = (RadioGroup) findViewById(R.id.r5);
        radio6 = (RadioGroup) findViewById(R.id.r6);
        radio7 = (RadioGroup) findViewById(R.id.r7);
        radio8 = (RadioGroup) findViewById(R.id.r8);
        one = (CheckBox) findViewById(R.id.check1);
        two = (CheckBox) findViewById(R.id.check2);
        three = (CheckBox) findViewById(R.id.check3);
        four = (CheckBox) findViewById(R.id.check4);
        text = (EditText) findViewById(R.id.edit);
    }

    public void answer(View v) {
        int score = 0;
        int select = radio1.getCheckedRadioButtonId();
        int select2 = radio2.getCheckedRadioButtonId();
        int select3 = radio3.getCheckedRadioButtonId();
        int select4 = radio4.getCheckedRadioButtonId();
        int select5 = radio5.getCheckedRadioButtonId();
        int select6 = radio6.getCheckedRadioButtonId();
        int select7 = radio7.getCheckedRadioButtonId();
        int select8 = radio8.getCheckedRadioButtonId();
        String content = text.getText().toString();


        if ((!one.isChecked() || !two.isChecked() || !three.isChecked() || !four.isChecked()) && (!"".equals(content)) && select != -1 && select2 != -1 && select3 != -1 && select4 != -1 && select5 != -1 && select6 != -1 && select7 != -1 && select8 != -1) {
            radiobutton1 = (RadioButton) findViewById(select);
            String yourVote = radiobutton1.getText().toString();
            if (yourVote.equals("Rice")) {
                score++;
            }
            radiobutton2 = (RadioButton) findViewById(select2);
            String yourVote2 = radiobutton2.getText().toString();
            if (yourVote2.equals("Vatican City")) {
                score++;
            }
            radiobutton3 = (RadioButton) findViewById(select3);
            String yourVote3 = radiobutton3.getText().toString();
            if (yourVote3.equals("Nasik")) {
                score = score + 1;
            }

            radiobutton4 = (RadioButton) findViewById(select4);
            String yourVote4 = radiobutton4.getText().toString();
            if (yourVote4.equals("Christianity")) {
                score++;
            }

            radiobutton5 = (RadioButton) findViewById(select5);
            String yourVote5 = radiobutton5.getText().toString();
            if (yourVote5.equals("Football")) {
                score++;
            }

            radiobutton6 = (RadioButton) findViewById(select6);
            String yourVote6 = radiobutton6.getText().toString();
            if (yourVote6.equals("Adam Gilchrist")) {
                score++;
            }

            radiobutton7 = (RadioButton) findViewById(select7);
            String yourVote7 = radiobutton7.getText().toString();
            if (yourVote7.equals("Kolkata Knight Riders")) {
                score++;
            }

            radiobutton8 = (RadioButton) findViewById(select8);
            String yourVote8 = radiobutton8.getText().toString();
            if (yourVote8.equals("Nepalese Rupee")) {
                score++;
            }

            if (two.isChecked() && three.isChecked() && four.isChecked()) {
                score++;
            }
            if (content.equalsIgnoreCase("mahatma gandhi")) {
                score++;
            }
            radio1.clearCheck();
            radio2.clearCheck();
            radio3.clearCheck();
            radio4.clearCheck();
            radio5.clearCheck();
            radio6.clearCheck();
            radio7.clearCheck();
            radio8.clearCheck();
            one.setChecked(false);
            two.setChecked(false);
            three.setChecked(false);
            four.setChecked(false);
            text.setText("");
            Toast.makeText(this, "" +
                    "Answers are\n 1:Rice\n 2.Vatican City\n 3.Nasik\n 4.christanity\n 5.football\n 6.kolkata knight riders\n 7.adam gilchrist\n 8.nepalese rupee\n 9. 12,18,36\n 10.mahatma gandhi\n ", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "All question are not answered,answer them and recieve your score :)", Toast.LENGTH_SHORT).show();
        }


        display(score);
    }

    public void display(int number) {
        TextView t = (TextView) findViewById(R.id.text);
        t.setText("Your score is: " + number);
    }

}






