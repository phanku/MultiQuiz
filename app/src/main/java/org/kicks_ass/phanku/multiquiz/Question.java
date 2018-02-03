package org.kicks_ass.phanku.multiquiz;

import java.util.ArrayList;

/**
 * @author Joseph Pahl <phanku@vt.edu>
 * @copyright Joseph Pahl, All rights reserved.
 * Created on 2/3/2018
 */

public class Question {

    // The question
    private String mQuestion;
    // A list of the possible answers.
    private ArrayList<String> mAnswers;
    // The index within the list of answers that is the correct answer.
    private int mCorrectAnswer;

    /**
     * Constructor
     * @param question
     * @param answers
     * @param correctAnswer
     */
    public Question(String question, ArrayList<String> answers, int correctAnswer) {
        this.mQuestion = question;
        this.mAnswers = answers;
        this.mCorrectAnswer = correctAnswer;
    }

    /**
     * Returns the question text.
     * @return
     */
    public String getQuestion() {
        return mQuestion;
    }

    /**
     * Sets the question text.
     * @param question
     */
    public void setQuestion(String question) {
        mQuestion = question;
    }

    /**
     * Returns the list of possible answers.
     * @return
     */
    public ArrayList<String> getAnswers() {
        return mAnswers;
    }

    /**
     * Sets the list of possible answers.
     * @param answers
     */
    public void setAnswers(ArrayList<String> answers) {
        mAnswers = answers;
    }

    /**
     * Returns the index of the correct answer within th e list of answers.
     * @return
     */
    public int getCorrectAnswer() {
        return mCorrectAnswer;
    }

    /**
     * Sets the index within the list of possible answers that is the correct answer.
     * @param correctAnswer
     */
    public void setCorrectAnswer(int correctAnswer) {
        mCorrectAnswer = correctAnswer;
    }
}
