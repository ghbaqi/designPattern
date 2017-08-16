package com.coship.designpattern.iteratorpattern;

/**
 * Created by ghbaqi on 2017/8/12.
 */

public class Request01 extends BaseRequest {
    public Request01(String url) {
        super(url);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
