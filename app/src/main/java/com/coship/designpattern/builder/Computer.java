package com.coship.designpattern.builder;

/**
 * Created by ghbaqi on 2017/8/8.
 */

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;

    public String getBoard() {
        return mBoard;
    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public String getDisplay() {
        return mDisplay;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public Computer(String board, String display) {
        mBoard = board;
        mDisplay = display;
    }
    public abstract void playGame(String game);
}
