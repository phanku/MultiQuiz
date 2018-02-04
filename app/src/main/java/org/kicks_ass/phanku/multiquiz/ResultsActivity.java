package org.kicks_ass.phanku.multiquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    private static final String EXTRA_SCORE = "org.kicks_ass.phanku.score";
    // TAG for the logger.
    private static final String TAG = "MultiQuiz";

    // -- View -- //
    private TextView mResults_total_questions;
    private TextView mResults_total_correct;
    private TextView mResults_total_hints_used;

    public static Intent newIntent(Context packageContent, Score score) {
        Intent intent = new Intent(packageContent, ResultsActivity.class);
        intent.putExtra(EXTRA_SCORE, score);

        return intent;
    }

    /**
     * Executed when the activity is created.
     *
     * @param savedInstanceState The saved instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mResults_total_hints_used = findViewById(R.id.results_total_hints_used);
        mResults_total_questions = findViewById(R.id.results_total_questions);
        mResults_total_correct = findViewById(R.id.results_total_correct);

        Score score = (Score) getIntent().getSerializableExtra(EXTRA_SCORE);

        mResults_total_correct.setText(Integer.toString(score.getTotalCorrect()));
        mResults_total_questions.setText(Integer.toString(score.getTotalQuestions()));
        mResults_total_hints_used.setText(Integer.toString(score.getTotalHints()));
    }
}
