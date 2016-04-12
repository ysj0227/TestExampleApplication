package com.example.test.testexampleapplication;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.test.testexampleapplication.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Desc:
 * Author: Mrs.Yang
 * Date: 2016/4/11
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.txt)
    TextView textView;

    @Override
    protected int getBodyLayoutResId() {
        return R.layout.test;
    }

    @Override
    protected int getMenuLayoutResId() {

        return R.menu.menu_main;
    }


    @Override
    public void onEventMainThread(Object o) {

    }

    @Override
    protected void init() {
        textView.setText("==================");
        Log.i("TAG", "-----------------bbbbbb");
    }

    @OnClick({R.id.button,})
    @Override
    protected void onClickView(View v) {
        switch (v.getId()){
            case R.id.button:
                Log.i("TAG", "-----------------aaaaaa");
                textView.setText("--------------");
                startAty(null,SecondActivity.class,false);

                break;
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
