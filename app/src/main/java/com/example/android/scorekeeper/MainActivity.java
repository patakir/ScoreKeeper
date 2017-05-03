package com.example.android.scorekeeper;





import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome(scoreA);
        displayForAway(scoreB);
    }

    /**
     * Displays the given score for Home team
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Away team
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 5 points for Home team
     */
    public void tryForHome(View view) {
        scoreA = scoreA + 5;
        displayForHome(scoreA);
    }

    /**
     * Adds 2 points for Home team
     */
    public void addTwoForHome (View view) {
        scoreA = scoreA + 2;
        displayForHome(scoreA);
    }

    /**
     * Adds 3 points for Home
     */
    public void addThreeForHome (View view) {
        scoreA = scoreA + 3;
        displayForHome(scoreA);
    }

    /**
     * Adds 5 points for Away team
     */
    public void tryForAway (View view) {
        scoreB = scoreB + 5;
        displayForAway(scoreB);
    }

    /**
     * Adds 2 points for Away team
     */
    public void addTwoForAway (View view) {
        scoreB = scoreB + 2;
        displayForAway(scoreB);
    }

    /**
     * Adds 3 points for Away team
     */
    public void addThreeForAway (View view) {
        scoreB = scoreB + 3;
        displayForAway(scoreB);
    }

    /**
     * Resets score
     */
    public void reset (View view) {
        scoreA = 0;
        displayForHome(scoreA);
        scoreB = 0;
        displayForAway(scoreB);
    }

}
