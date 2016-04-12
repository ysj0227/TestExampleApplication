package com.example.test.testexampleapplication.abst;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import com.example.test.testexampleapplication.R;

/**
 * Created by Administrator on 2016/4/11.
 */
public abstract class MyMenu extends AppCompatActivity {

    protected abstract int getMenuLayoutResId();
    protected abstract String myString();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_base);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int menuLayoutResId = this.getMenuLayoutResId();
        if (menuLayoutResId != 0) {
            super.getMenuInflater().inflate(menuLayoutResId, menu);
        }

        return true;
    }

    public String logString(String s) {
        s = this.myString();
        String aa = "aaaaaa";
        Log.i("TAG", "aa");
        return aa;
    }

}
