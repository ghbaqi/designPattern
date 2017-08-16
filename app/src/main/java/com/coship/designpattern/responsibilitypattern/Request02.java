package com.coship.designpattern.iteratorpattern;

/**
 * Created by ghbaqi on 2017/8/12.
 */

public class Request02 extends BaseRequest {
    public Request02(String url) {
        super(url);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
