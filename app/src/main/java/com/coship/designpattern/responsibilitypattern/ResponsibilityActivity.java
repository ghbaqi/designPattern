package com.coship.designpattern.iteratorpattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.coship.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ghbaqi on 2017/8/12.
 *  责任链模式：
 *  使用场景 ： 运行时动态决定由谁来处理请求
 *  优点 ： 将请求者和处理者关系解耦
 *  将处理请求的对象链接成链 ，一个对象要么处理请求（符合处理条件） 要么将请求转发给它的下一级。
 */

public class ResponsibilityActivity extends AppCompatActivity {

    @BindView(R.id.bt_11)
    Button mBt11;
    @BindView(R.id.bt_12)
    Button mBt12;
    @BindView(R.id.bt_13)
    Button mBt13;
    private Handler01 mHandler01;
    private Handler02 mHandler02;
    private Handler03 mHandler03;
    private Request01 mUrl;
    private Request01 mRequest01;
    private Request02 mRequest02;
    private Request03 mRequest03;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        ButterKnife.bind(this);
        iterator();
    }

    private void iterator() {
        mHandler01 = new Handler01(this);
        mHandler02 = new Handler02(this);
        mHandler03 = new Handler03(this);
        mRequest01 = new Request01("");
        mRequest02 = new Request02("");
        mRequest03 = new Request03("");
        mHandler01.setNextHandler(mHandler02);
        mHandler02.setNextHandler(mHandler03);
    }

    @OnClick({R.id.bt_11, R.id.bt_12, R.id.bt_13,R.id.bt_23,R.id.bt_31})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_11:
                mHandler01.dispatchRequest(mRequest01);
                break;
            case R.id.bt_12:
                mHandler01.dispatchRequest(mRequest02);
                break;
            case R.id.bt_13:
                mHandler01.dispatchRequest(mRequest03);
                break;                                         //  忘记加 break；  踩坑
            case R.id.bt_23:
                mHandler02.dispatchRequest(mRequest03);
                break;
            case R.id.bt_31:
                mHandler03.dispatchRequest(mRequest01);
                break;
        }
    }
}
