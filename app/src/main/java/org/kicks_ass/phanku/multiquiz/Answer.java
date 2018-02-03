package org.kicks_ass.phanku.multiquiz;

import android.widget.Button;

/**
 * @author Joseph Pahl <phanku@vt.edu>
 * @copyright Joseph Pahl, All rights reserved.
 * Created on 2/3/2018
 */

public class Answer {

    private Button mButton;
    private boolean mSelected;
    private boolean mCorrect;

    public Answer(Button button, boolean correct) {
        mButton = button;
        mCorrect = correct;
    }

    public void select() {
        mSelected = true;
    }

    public void deselct() {
        mSelected = false;
    }

    public Button getButton() {
        return mButton;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public boolean isCorrect() {
        return mCorrect;
    }
}
