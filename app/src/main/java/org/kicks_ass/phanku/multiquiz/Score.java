package org.kicks_ass.phanku.multiquiz;

/**
 * @author Phanku <${USER_EMAIL}>
 * @copyright Phanku, All rights reserved.
 * Created on 2/3/2018
 */

public class Score {

    private int mTotalQuestions = 1;
    private int mTotalCorrect = 0;
    private int mTotalHints = 0;

    public void increaseQuestionCount() {
        mTotalQuestions++;
    }

    public void increaseCorrectCount() {
        mTotalCorrect++;
    }

    public void increaseHintsCount() {
        mTotalHints++;
    }

    public int getTotalQuestions() {
        return mTotalQuestions;
    }

    public int getTotalCorrect() {
        return mTotalCorrect;
    }

    public int getTotalHints() {
        return mTotalHints;
    }
}
