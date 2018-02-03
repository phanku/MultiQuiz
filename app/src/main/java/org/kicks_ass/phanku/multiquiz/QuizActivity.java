package org.kicks_ass.phanku.multiquiz;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    // TAG for the logger.
    private static final String TAG = "MultiQuiz";

    // Button background and text color constants.
    private static final int DEFAULT_BUTTON_COLOR = 0xff00a2ff;
    private static final int SELECTED_BUTTON_COLOR = 0xffcb297b;
    private static final int DEFAULT_BUTTON_TEXT_COLOR = Color.WHITE;
    private static final int SELECTED_BUTTON_TEXT_COLOR = Color.WHITE;
    private static final int DISABLED_BUTTON_TEXT_COLOR = Color.GRAY;
    private static final int MAX_NUMBER_OF_HINTS_PER_QUESTION = 3;


    // -- Model -- //

    // The question bank.
    private List<Question> mQuestionBank = new ArrayList<Question>();

    // The answers that are currently being displayed.
    private List<Answer> mAnswers = new ArrayList<>();

    // The current question.
    private Question mCurrentQuestion;


    // -- View -- //

    // Reference to the text view on the screen.
    private TextView mQuestionTextView;

    // Reference to the answer buttons.
    private List<Button> mAnswerButtons = new ArrayList<>();

    // Reference to the hint and submit button on the view.
    private Button mHintButton;

    // Reference to the submit button.
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Sending debug message.
        Log.d(TAG, "onCreate(Bundle) called");

        // Binding to the show hint button.
        mHintButton = findViewById(R.id.hint_button);
        setDefaultButtonStyle(mHintButton);
        mHintButton.setOnClickListener(view -> {
            processHintRequest();
        });

        // Binding to the submit button.
        mSubmitButton = findViewById(R.id.submit_button);
        disableButton(mSubmitButton);
        mSubmitButton.setOnClickListener(view -> {
            processQuestionSubmission();
        });

        // Declaring local variables.
        List<Answer> answers;
        Button button;
        Question question;

        // Collecting the references to the answer buttons.
        mAnswerButtons = Arrays.asList(
                findViewById(R.id.answer_button_0),
                findViewById(R.id.answer_button_1),
                findViewById(R.id.answer_button_2),
                findViewById(R.id.answer_button_3)
        );

        // Binding to buttons to the action listeners.
        mAnswerButtons.get(0).setOnClickListener(view -> processSelectedAnswer(0));
        mAnswerButtons.get(1).setOnClickListener(view -> processSelectedAnswer(1));
        mAnswerButtons.get(2).setOnClickListener(view -> processSelectedAnswer(2));
        mAnswerButtons.get(3).setOnClickListener(view -> processSelectedAnswer(3));

        // Fetching the reference to the question text view.
        mQuestionTextView = findViewById(R.id.question_text_view);

        answers = Arrays.asList(
                new Answer(R.string.question_answer_0_0, false),
                new Answer(R.string.question_answer_0_1, false),
                new Answer(R.string.question_answer_0_2, true),
                new Answer(R.string.question_answer_0_3, false)
        );

        question = new Question(R.string.question_0, answers);

        mCurrentQuestion = question;
        mQuestionBank.add(question);

        answers = Arrays.asList(
                new Answer(R.string.question_answer_1_0, false),
                new Answer(R.string.question_answer_1_1, false),
                new Answer(R.string.question_answer_1_2, true),
                new Answer(R.string.question_answer_1_3, false)
        );

        question = new Question(R.string.question_1, answers);

        mQuestionBank.add(question);

        answers = Arrays.asList(
                new Answer(R.string.question_answer_2_0, false),
                new Answer(R.string.question_answer_2_1, false),
                new Answer(R.string.question_answer_2_2, true),
                new Answer(R.string.question_answer_2_3, false)
        );

        question = new Question(R.string.question_2, answers);

        mQuestionBank.add(question);

        answers = Arrays.asList(
                new Answer(R.string.question_answer_3_0, false),
                new Answer(R.string.question_answer_3_1, false),
                new Answer(R.string.question_answer_3_2, true),
                new Answer(R.string.question_answer_3_3, false)
        );

        question = new Question(R.string.question_3, answers);

        mQuestionBank.add(question);

        refreshView();
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

    private void processQuestionSubmission() {

    }

    private void processSelectedAnswer(int buttonNumber) {
        if (mCurrentQuestion.getAnswers().get(buttonNumber).isCorrect()) {

        }
    }

    /**
     * Refreshes the view controls based on the specified model.
     */
    private void refreshView() {

        List<Answer> myCurrentAnswers = mCurrentQuestion.getAnswers();

        Button myCurrentButton;
        Answer myCurrentAnswer;

        boolean hasASelection = false;

        // Update the question text.
        mQuestionTextView.setText(mCurrentQuestion.getQuestionTextResourceId());

        for (int i = 0; i < myCurrentAnswers.size(); i++) {
            myCurrentAnswer = myCurrentAnswers.get(i);
            myCurrentButton = mAnswerButtons.get(i);

            myCurrentButton.setText(myCurrentAnswer.getTextResourceId());

            if (myCurrentAnswer.isEnabled()) {
                enableButton(myCurrentButton);

                if (myCurrentAnswer.isSelected()) {

                    hasASelection = true;

                    setSelectedButtonStyle(myCurrentButton);
                } else {
                    setDefaultButtonStyle(myCurrentButton);
                }

            } else {
                disableButton(myCurrentButton);
            }
        }

        if (mCurrentQuestion.getHintsGiven() >= MAX_NUMBER_OF_HINTS_PER_QUESTION) {
            disableButton(mHintButton);
        } else {
            enableButton(mHintButton);
        }

        if (hasASelection) {
            enableButton(mSubmitButton);
        }
    }

    private void refreshQuestionText(String questionText) {
        mQuestionTextView.setText(questionText);
    }

    private void displayNextQuestion(Question question) {

    }

    private void establishButton(Button button) {

    }

    /**
     * Processes the event request of getting a hint.
     */
    private void processHintRequest() {
        List<Answer> myCurrentAnswers = mCurrentQuestion.getAnswers();

        Random random = new Random();

        int answerToDisable;
        boolean answerDisabled = false;

        do {

            answerToDisable = random.nextInt((MAX_NUMBER_OF_HINTS_PER_QUESTION - 1) + 1) + 1;
            if (myCurrentAnswers.get(answerToDisable).isEnabled()) {
                myCurrentAnswers.get(answerToDisable).setEnabled(false);
                answerDisabled = true;
                mCurrentQuestion.addHint();
            }

        } while (!answerDisabled);

        refreshView();
    }

    private void disableButton(Button button) {
        button.setEnabled(false);
        button.getBackground().clearColorFilter();
        button.setTextColor(DISABLED_BUTTON_TEXT_COLOR);
    }

    private void enableButton(Button button) {
        button.setEnabled(true);
        button.getBackground().setColorFilter(DEFAULT_BUTTON_COLOR, PorterDuff.Mode.MULTIPLY);
        button.setTextColor(DEFAULT_BUTTON_TEXT_COLOR);
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
