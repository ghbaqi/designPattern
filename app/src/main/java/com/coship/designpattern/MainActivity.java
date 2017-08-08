package com.coship.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.coship.designpattern.builder.MacBook;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_builder)
    Button mBtBuilder;
    private MacBook mMacBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
    }

    @OnClick(R.id.bt_builder)
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_builder:
                builder();
                break;
        }
    }

    /**
     * 构建者模式
     */
    private void builder() {
        if (mMacBook==null) {
            MacBook.Builder builder = new MacBook.Builder();
            builder.setBoard("Mac主板");
            builder.setDisplay("retin屏幕");
            mMacBook = builder.build();
        }
        mMacBook.playGame("play game!!!");

    }
}
