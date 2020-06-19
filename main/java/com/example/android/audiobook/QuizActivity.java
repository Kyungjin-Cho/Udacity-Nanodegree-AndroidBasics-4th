package com.example.android.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private EditText question1;
    private CheckBox question2_1;
    private CheckBox question2_2;
    private CheckBox question2_3;
    private CheckBox question2_4;
    private RadioButton question3;
    private RadioButton question4;
    private RadioGroup thirdQuestion;
    private RadioGroup fourthQuestion;

    private int answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        question1 = (EditText) findViewById(R.id.textAnswer);
        question2_1 = (CheckBox) findViewById(R.id.checkBox1);
        question2_2 = (CheckBox) findViewById(R.id.checkBox2);
        question2_3 = (CheckBox) findViewById(R.id.checkBox3);
        question2_4 = (CheckBox) findViewById(R.id.checkBox4);
        question3 = (RadioButton) findViewById(R.id.question3);
        question4 = (RadioButton) findViewById(R.id.question4);
        thirdQuestion = (RadioGroup) findViewById(R.id.thirdQuestion);
        fourthQuestion = (RadioGroup) findViewById(R.id.fourthQuestion);

    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitButton(View v) {
        String answerOne = getResources().getString(R.string.answer_one);

        if (question3.isChecked()) {
            answers++;
        }
        if (question4.isChecked()) {
            answers++;
        }
        if (question2_1.isChecked() && question2_2.isChecked() && !question2_3.isChecked() && !question2_4.isChecked()) {
            answers++;
        }
        if (answerOne.equals(question1.getText().toString())) {
            answers++;
        }

        if (answers == 4) {
            Toast.makeText(this, "Congrats, every answer is right", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Correct answers: " + answers, Toast.LENGTH_LONG).show();
        }

        answers = 0;

        question1.getText().clear();
        thirdQuestion.clearCheck();
        fourthQuestion.clearCheck();

        if (question2_1.isChecked()) {
            question2_1.toggle();
        }
        if (question2_2.isChecked()) {
            question2_2.toggle();
        }
        if (question2_3.isChecked()) {
            question2_3.toggle();
        }
        if (question2_4.isChecked()) {
            question2_4.toggle();
        }
    }
}


