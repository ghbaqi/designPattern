package com.coship.designpattern.iteratorpattern;

/**
 * Created by ghbaqi on 2017/8/12.
 */

public class Request03 extends BaseRequest {
    public Request03(String url) {
        super(url);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
