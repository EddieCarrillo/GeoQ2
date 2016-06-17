package com.example.eddie.geoquiz;

/**
 * Created by eddie on 6/15/2016.
 */
public class Question {



    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
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

    /*Private Instance Variables*/
    private int mTextResId;
    private boolean mAnswerTrue;
}
