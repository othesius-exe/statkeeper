package com.example.android.statkeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int purpleScore;
    int orangeScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     *  Purple team controllers here
     */

    public void displayPurpleScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.purple_score_view);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownPurple(View view) {
        purpleScore += 6;
        displayPurpleScore(purpleScore);
    }

    public void fieldGoalPurple(View view) {
        purpleScore += 3;
        displayPurpleScore(purpleScore);
    }

    public void conversionPurple(View view) {
        purpleScore += 2;
        displayPurpleScore(purpleScore);
    }

    public void extraPointPurple(View view) {
        purpleScore += 1;
        displayPurpleScore(purpleScore);
    }

    /**
     *
     *  Orange team controllers here
     */
    public void displayOrangeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.orange_score_view);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownOrange(View view) {
        orangeScore += 6;
        displayOrangeScore(orangeScore);
    }

    public void fieldGoalOrange(View view) {
        orangeScore += 3;
        displayOrangeScore(orangeScore);
    }

    public void conversionOrange(View view) {
        orangeScore += 2;
        displayOrangeScore(orangeScore);
    }

    public void extraPointOrange(View view) {
        orangeScore += 1;
        displayOrangeScore(orangeScore);
    }

    public void resetScores(View view) {
        orangeScore = 0;
        purpleScore = 0;
        displayOrangeScore(orangeScore);
        displayPurpleScore(purpleScore);
    }


}
