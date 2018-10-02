package com.techexchange.mobileapps.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int rightCount=0;
    int wrongCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rightAnswer(View view){
        rightCount+=1;
        displayRight(rightCount);
    }

    public void wrongAnswer(View view){
        wrongCount += 1;
        displayWrong(wrongCount);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayRight(int number) {
        if (number==3){
            win();
        }
        TextView rightTextView = (TextView) findViewById(R.id.right_count);
        rightTextView.setText("" + number);
    }
    private void displayWrong(int number) {
        TextView wrongTextView = (TextView) findViewById(R.id.wrong_count);
        wrongTextView.setText("" + number);
    }

    public void reset(View view) {
        rightCount=0;
        wrongCount=0;
        displayRight(0);
        displayWrong(0);
    }
    public void win(){
        TextView winView = (TextView) findViewById(R.id.win);
        winView.setText("Congratulations!");
    }
}