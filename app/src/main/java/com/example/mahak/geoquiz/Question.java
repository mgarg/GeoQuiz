package com.example.mahak.geoquiz;

/**
 * Created by mahak on 19/7/16.
 */
public class Question {
    int quesId;
    boolean trueAnswer;

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getQuesId() {

        return quesId;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    public Question(int quesId, boolean trueAnswer) {

        this.quesId = quesId;
        this.trueAnswer = trueAnswer;
    }
}
