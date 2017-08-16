package com.coship.designpattern.iteratorpattern;

import android.content.Context;

/**
 * Created by ghbaqi on 2017/8/12.
 *  责任链模式：
 *  将处理请求的对象链接成链 ，一个对象要么处理请求（符合处理条件） 要么将请求转发给它的下一级。
 *
 */

public abstract class BaseHandler  {


public Context mContext;
    private BaseHandler mNextHandler;

    public BaseHandler(Context context) {
        mContext = context;
    }

    public void setNextHandler(BaseHandler nextHandler) {
        mNextHandler = nextHandler;
    }

    public final void dispatchRequest(BaseRequest request){
        if (getHandlerLevel() == request.getRequestLevel()) {
            handler(request);
        } else {
            if (mNextHandler != null) {
                mNextHandler.dispatchRequest(request);                      //   !!!!!  踩坑
            } else {
                throw new RuntimeException("没有人正确处理请求");
            }
        }
    }

    public abstract int getHandlerLevel();
    protected abstract void handler(BaseRequest request);
}
