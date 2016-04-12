package com.example.test.testexampleapplication.abst;

/**
 * Created by Administrator on 2016/4/11.
 */
public class Student extends Person {

    //    Student(String n) {
//        super(n);
//    }
//
//    @Override
//    public String getDescription() {
//        return null;
//    }


    Student(String n, String m) {
        super(n);
        major = m;

    }

    public String getDescription() {
        return "a student majoring in " + major;
    }

    private String major;


}
