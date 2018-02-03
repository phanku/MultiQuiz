package org.kicks_ass.phanku.multiquiz;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "MultiQuiz";

    private Question[] mQuestionBank = new Question[] {

    };

    private List<Answer> mAnswers;

    private TextView mQuestionTextView;
    private Button mAnswerButton0;
    private Button mAnswerButton1;
    private Button mAnswerButton2;
    private Button mAnswerButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Log.d(TAG, "onCreate(Bundle) called");

        mQuestionTextView = findViewById(R.id.question_text_view);

        mAnswerButton0 = findViewById(R.id.answer_choice_0);
        mAnswerButton1 = findViewById(R.id.answer_choice_1);
        mAnswerButton2 = findViewById(R.id.answer_choice_2);
        mAnswerButton3 = findViewById(R.id.answer_choice_3);

        mAnswerButton0.getBackground().setColorFilter(0xff00a2ff, PorterDuff.Mode.MULTIPLY);
        mAnswerButton1.getBackground().setColorFilter(0xff00a2ff, PorterDuff.Mode.MULTIPLY);
        mAnswerButton2.getBackground().setColorFilter(0xff00a2ff, PorterDuff.Mode.MULTIPLY);
        mAnswerButton3.getBackground().setColorFilter(0xff00a2ff, PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

}
