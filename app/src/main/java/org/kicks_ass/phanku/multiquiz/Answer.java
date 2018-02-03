package org.kicks_ass.phanku.multiquiz;

/**
 * @author Joseph Pahl <phanku@vt.edu>
 * @copyright Joseph Pahl, All rights reserved.
 * Created on 2/3/2018
 */

public class Answer {

    // Int ID to the button
    private int mTextResourceId;

    private boolean mSelected = false;
    private boolean mCorrect;
    private boolean mEnabled = true;

    public Answer(int textResourceId, boolean correct) {
        mTextResourceId = textResourceId;
        mCorrect = correct;
    }

    public void select() {
        mSelected = true;
    }

    public void deselect() {
        mSelected = false;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public boolean isCorrect() {
        return mCorrect;
    }

    public boolean isEnabled() {
        return mEnabled;
    }

    public void setEnabled(boolean enabled) {
        mEnabled = enabled;
    }

    public int getTextResourceId() {
        return mTextResourceId;
    }
}
