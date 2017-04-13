package com.example.android.emitsquizzapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int totalCarrots = 1;
    RadioButton answerOne;
    RadioButton answerTwo;
    RadioButton answerThree;
    RadioButton answerFour;
    RadioButton answerFive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();

        final Button countTotal = (Button) findViewById(R.id.button_submit);
        countTotal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkAnswers();
            }

        });
    }

    private void initialise() {

        answerOne = (RadioButton) findViewById(R.id.radio_answer_three_on_one);
        answerTwo = (RadioButton) findViewById(R.id.radio_answer_one_on_two);
        answerThree = (RadioButton) findViewById(R.id.radio_answer_one_on_three);
        answerFour = (RadioButton) findViewById(R.id.radio_answer_three_on_four);
        answerFive = (RadioButton) findViewById(R.id.radio_answer_one_on_five);
    }


    public void checkAnswers() {


        //If question ONE has been answered correctly, then total carrot points are increased for one.

        if (answerOne.isChecked()) {
            totalCarrots++;
        }

        //If question TWO has been answered correctly, then total carrot points are increased for one.

        if (answerTwo.isChecked()) {
            totalCarrots++;
        }

        //If question THREE has been answered correctly, then total carrot points are increased for one.

        if (answerThree.isChecked()) {
            totalCarrots++;
        }

        //If question FOUR has been answered correctly, then total carrot points are increased for one.

        if (answerFour.isChecked()) {
            totalCarrots++;
        }

        //If question FIVE has been answered correctly, then total carrot points are increased for one.

        if (answerFive.isChecked()) {
            totalCarrots++;
        }


        //Show earned carrot sticks with Toast

        if (totalCarrots >= 5) {
            Toast.makeText(this, "Awesome, you got " + totalCarrots + " carrot sticks. Keep going same way!",
                    Toast.LENGTH_SHORT).show();
        } else if (totalCarrots <=5) {
            Toast.makeText(this, "You got " + totalCarrots + " It will all go up with good thoughts, try again!",
                    Toast.LENGTH_SHORT).show();
        }
    }

}

