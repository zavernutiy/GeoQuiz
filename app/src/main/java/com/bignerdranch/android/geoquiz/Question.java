package com.bignerdranch.android.geoquiz;

/**
 * Created by Max on 9/30/2015.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResID, boolean answerTrue) {
        mTextResId = textResID;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
