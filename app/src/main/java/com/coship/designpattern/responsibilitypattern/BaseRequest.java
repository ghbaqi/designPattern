package com.coship.designpattern.iteratorpattern;

/**
 * Created by ghbaqi on 2017/8/12.
 */

public abstract class BaseRequest {
    private String mUrl;

    public BaseRequest(String url) {
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }
    public abstract int getRequestLevel();
}
