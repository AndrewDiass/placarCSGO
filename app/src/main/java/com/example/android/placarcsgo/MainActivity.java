package com.example.android.placarcsgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int rounds = 30;
    int scoreCtTimeA = 0;
    int scoreTrTimeA = 0;
    int scoreCtTimeB = 0;
    int scoreTrTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForRounds(30);
        displayForCTTeamA(0);
        displayForTRTeamA(0);
        displayForCTTeamB(0);
        displayForTRTeamB(0);
    }

    public void addOnePointsCTTeamA(View V) {
        scoreCtTimeA = scoreCtTimeA + 1;
        displayForCTTeamA(scoreCtTimeA);
        rounds = rounds -1;
        displayForRounds(rounds);
    }

    public void addOnePointsTRTeamA(View V) {
        scoreTrTimeA = scoreTrTimeA + 1;
        displayForTRTeamA(scoreTrTimeA);
        rounds = rounds -1;
        displayForRounds(rounds);
    }

    public void addOnePointsCTTeamB(View V) {
        scoreCtTimeB = scoreCtTimeB + 1;
        displayForCTTeamB(scoreCtTimeB);
        rounds = rounds -1;
        displayForRounds(rounds);
    }

    public void addOnePointsTRTeamB(View V) {
        scoreTrTimeB = scoreTrTimeB + 1;
        displayForTRTeamB(scoreTrTimeB);
        rounds = rounds -1;
        displayForRounds(rounds);
    }

    public void resetarGame(View V) {
        rounds = 30;
        scoreCtTimeA = 0;
        scoreTrTimeA = 0;
        scoreCtTimeB = 0;
        scoreTrTimeB = 0;
        displayForRounds(rounds);
        displayForCTTeamA(scoreCtTimeA);
        displayForTRTeamA(scoreTrTimeA);
        displayForCTTeamB(scoreCtTimeB);
        displayForTRTeamB(scoreTrTimeB);
    }

    public void displayForRounds(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rounds);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForCTTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCtTimeA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTRTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTrTimeA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForCTTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCtTimeB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTRTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTrTimeB);
        scoreView.setText(String.valueOf(score));
    }
}
