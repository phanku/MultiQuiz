package org.kicks_ass.phanku.multiquiz;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    // TAG for the logger.
    private static final String TAG = "MultiQuiz";

    // Button background and text color constants.
    private static final int DEFAULT_BUTTON_COLOR = 0xff00a2ff;
    private static final int SELECTED_BUTTON_COLOR = 0xffcb297b;
    private static final int DEFAULT_BUTTON_TEXT_COLOR = Color.WHITE;
    private static final int SELECTED_BUTTON_TEXT_COLOR = Color.WHITE;

    // The question bank.
    private Question[] mQuestionBank = new Question[] {

    };

    // The answers that are currently being displayed.
    private List<Answer> mAnswers = new ArrayList<>();

    // Reference to the text view on the screen.
    private TextView mQuestionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Log.d(TAG, "onCreate(Bundle) called");

        // Declaring local variables.
        Answer answer;
        Button button;

        button = findViewById(R.id.hint_button);
        setDefaultButtonStyle(button);


        mQuestionTextView = findViewById(R.id.question_text_view);


        button = findViewById(R.id.answer_button_0);
        button.setText("bob");
        setDefaultButtonStyle(button);
        answer = new Answer(button, false);
        button.setOnClickListener(view -> selectAnswerButton(0));

        mAnswers.add(answer);




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

    private void establishButton(Button button) {

    }

    private void disableButton(Button button) {
        button.setEnabled(false);
    }

    private void enableButton(Button button) {
        button.setEnabled(true);
    }

    private void selectAnswerButton(int n) {
        Button myButton;

        for (Answer myAnswer : mAnswers) {
            myButton = myAnswer.getButton();
            setDefaultButtonStyle(myButton);
        }

        myButton = mAnswers.get(n).getButton();
        setSelectedButtonStyle(myButton);
    }

    private void setDefaultButtonStyle(Button button) {
        button.getBackground().setColorFilter(DEFAULT_BUTTON_COLOR, PorterDuff.Mode.MULTIPLY);
        button.setTextColor(DEFAULT_BUTTON_TEXT_COLOR);
    }

    private void setSelectedButtonStyle(Button button) {
        button.getBackground().setColorFilter(SELECTED_BUTTON_COLOR, PorterDuff.Mode.MULTIPLY);
        button.setTextColor(SELECTED_BUTTON_TEXT_COLOR);
    }

}
