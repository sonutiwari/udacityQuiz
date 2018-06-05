package com.ikai.doyouknow;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Declaring global objects.
    final int Q1_ANSWER = R.id.question_1_second_logo_radio;
    final int Q2_ANSWER = R.id.question_2_first_logo_radio;
    final String Q4_ANSWER = "flipkart";
    final int Q5_ANSWER = R.id.question_5_third_radio;
    final String Q6_ANSWER = "white";
    final String Q7_ANSWER = "udacity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        // Code to set custom text font style from assets folder.
//        Typeface typeface = Typeface.createFromAsset(getAssets(),
//                "fonts/Tangerine-Bold.ttf");
    }

    public void checkQuiz(View v) {
        ArrayList<String> incorrectAnswersList = new ArrayList<>();

        int numberOfQuestionsCorrect = 0;

        if (checkAnswer1()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 1");
        }

        if (checkAnswer2()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 2");
        }

        if (checkAnswer3()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 3");
        }

        if (checkAnswer4()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 4");
        }

        if (checkAnswer5()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 5");
        }

        if (checkAnswer6()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 6");
        }

        if (checkAnswer7()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 7");
        }

        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswersList)
        {
            sb.append(s);
            sb.append("\n");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + numberOfQuestionsCorrect +
                "/7 answers right.\n\nRecheck the following:\n" + sb.toString();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private boolean checkAnswer1() {
        RadioGroup question1RadioGroup = findViewById(R.id.question_1_radio_group);

        return question1RadioGroup.getCheckedRadioButtonId() == Q1_ANSWER;

    }

    private boolean checkAnswer2() {
        RadioGroup question2RadioGroup = findViewById(R.id.question_2_radio_group);

        return question2RadioGroup.getCheckedRadioButtonId() == Q2_ANSWER;

    }

    private boolean checkAnswer3() {
        CheckBox c1 = findViewById(R.id.question_3_first_checkbox);
        CheckBox c2 = findViewById(R.id.question_3_second_checkbox);
        CheckBox c3 = findViewById(R.id.question_3_third_checkbox);

        return c1.isChecked() && c2.isChecked() && !c3.isChecked();

    }

    private boolean checkAnswer4() {
        EditText et = findViewById(R.id.question_4_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q4_ANSWER);
    }

    private boolean checkAnswer5() {
        RadioGroup rg = findViewById(R.id.question_5_radio_group);

        return rg.getCheckedRadioButtonId() == Q5_ANSWER;

    }

    private boolean checkAnswer6() {
        EditText et = findViewById(R.id.question_6_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q6_ANSWER);
    }

    private boolean checkAnswer7() {
        EditText et = findViewById(R.id.question_7_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q7_ANSWER);
    }
}
