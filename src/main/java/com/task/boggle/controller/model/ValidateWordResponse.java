package com.task.boggle.controller.model;

public class ValidateWordResponse {
    private boolean valid;

    private int score;

    public ValidateWordResponse(boolean valid, int score){
        this.valid = valid;
        this.score = score;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
