package com.example.test.testexampleapplication;

import android.util.Log;

import com.example.test.testexampleapplication.abst.MyMenu;

/**
 * Created by Administrator on 2016/4/11.
 */
public class SecondActivity extends MyMenu {
    @Override
    protected int getMenuLayoutResId() {
        return R.menu.menu_main;
    }

    @Override
    protected String myString() {
        String aa = "-----------";
        Log.i("TAG", aa);
        return aa;
    }


}
