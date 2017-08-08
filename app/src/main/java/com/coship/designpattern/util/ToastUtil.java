package com.coship.designpattern.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ghbaqi on 2017/8/8.
 */

public class ToastUtil {

    private static Toast toast;

    public static void shortToast(Context context,String s){
        if (toast == null) {
            toast = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        } else {
            toast.setText(s);
        }
        toast.show();
    }
}
