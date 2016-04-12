package com.example.test.testexampleapplication.abst;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/4/11.
 */
public abstract class Person extends AppCompatActivity{
    private String name;

    Person(String n) {
        name = n;
    }

    protected Person() {
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();//注意抽象方法的使用


}
