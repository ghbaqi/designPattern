package com.coship.designpattern.iteratorpattern;

import android.content.Context;

import com.coship.designpattern.util.ToastUtil;

/**
 * Created by ghbaqi on 2017/8/12.
 */

public class Handler03 extends BaseHandler {
    public Handler03(Context context) {
        super(context);
    }

    @Override
    public int getHandlerLevel() {
        return 3;
    }

    @Override
    protected void handler(BaseRequest request) {
        ToastUtil.shortToast(mContext,""+this.getClass().getSimpleName()+", request:"+request.getRequestLevel());
    }
}
