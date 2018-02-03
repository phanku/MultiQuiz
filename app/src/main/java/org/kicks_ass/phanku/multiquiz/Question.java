package org.kicks_ass.phanku.multiquiz;

import java.util.List;

/**
 * @author Joseph Pahl <phanku@vt.edu>
 * @copyright Joseph Pahl, All rights reserved.
 * Created on 2/3/2018
 */

public class Question {

    // The question
    private int mQuestionTextResourceId;
    // A list of the possible answers.
    private List<Answer> mAnswers;
    // The number of hints given to the user on this question.
    private int mHintsGiven;
    // A flag to determine if the user answered the question correctly.
    private boolean answeredCorrectly;

    /**
     * Constructor
     * @param question
     * @param answers
     */
    public Question(int question, List<Answer> answers) {
        mQuestionTextResourceId = question;
        mAnswers = answers;
    }

    /**
     * Returns the question text.
     * @return The question text.
     */
    public int getQuestionTextResourceId() {
        return mQuestionTextResourceId;
    }

    /**
     * Returns the list of possible answers.
     * @return The list of answers.
     */
    public List<Answer> getAnswers() {
        return mAnswers;
    }

    /**
     * Sets the list of possible answers.
     * @param answers
     */
    public void setAnswers(List<Answer> answers) {
        mAnswers = answers;
    }

    /**
     * Returns the number of hints that was provided on this question.
     * @return The number of hints.
     */
    public int getHintsGiven() {
        return mHintsGiven;
    }

    /**
     * Increases the hint count by one.
     */
    public void addHint() {
        mHintsGiven++;
    }

    /**
     * Returns true if, and only if, the question has been answered correctly.
     *
     * @return True if, and only if, the question has been answered correctly.
     */
    public boolean isAnsweredCorrectly() {
        return answeredCorrectly;
    }

    /**
     * Sets if question has been answered correctly.
     *
     * @param answeredCorrectly
     */
    public void setAnsweredCorrectly(boolean answeredCorrectly) {
        this.answeredCorrectly = answeredCorrectly;
    }
}
