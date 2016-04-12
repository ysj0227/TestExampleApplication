package com.example.test.testexampleapplication.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Desc:
 * Author:zhjm
 * Date:2015/10/26.
 */
public class MyDateUtil {

    public static long getTime(String date, String formate) {

        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        Long startTime = null;
        try {
            startTime = sdf.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return startTime;
    }
}
