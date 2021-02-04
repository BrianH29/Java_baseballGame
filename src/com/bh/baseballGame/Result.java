package com.bh.baseballGame;

public class Result {

    private int strikes;
    private int balls;

    public Result() {}

    public Result(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }


    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }
}

