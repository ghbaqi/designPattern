package com.coship.designpattern.builder;

import android.util.Log;

/**
 * Created by ghbaqi on 2017/8/8.
 * 以构建者模式来创建对象
 * 适用场景 ：
 */

public class MacBook extends Computer {
    public MacBook(String board, String display) {
        super(board, display);
    }

    @Override
    public void playGame(String game) {
        Log.d("MacBook", "playgame : " + game);
    }


    public static class Builder {
        private String mBoard;
        private String mDisplay;

        public Builder setBoard(String board) {
            mBoard = board;
            return this;
        }

        public Builder setDisplay(String display) {
            mDisplay = display;
            return this;
        }

        public MacBook build() {
            return new MacBook(mBoard, mDisplay);
        }
    }
}
