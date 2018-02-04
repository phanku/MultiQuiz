package org.kicks_ass.phanku.multiquiz;

import java.io.Serializable;

/**
 * @author Phanku <${USER_EMAIL}>
 * @copyright Phanku, All rights reserved.
 * Created on 2/3/2018
 */

public class Score implements Serializable {

    private int mTotalQuestions;
    private int mTotalCorrect = 0;
    private int mTotalHints = 0;


    public Score(int totalQuestions) {
        mTotalQuestions = totalQuestions;
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
