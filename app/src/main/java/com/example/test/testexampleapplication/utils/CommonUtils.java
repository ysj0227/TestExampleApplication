package com.example.test.testexampleapplication.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;


public class CommonUtils {



    /**
     * 根据字体计算字符所占的宽度
     */
    public static float getTextWidth(String text, float size) {
        TextPaint FontPaint = new TextPaint();
        // sp to px
        FontPaint.setTextSize(size);
        return FontPaint.measureText(text);
    }

    /**
     * 判断字符串是否是整数数字
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static DisplayProperty getDisplayProperty(Context context) {
        DisplayMetrics dm = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        return new DisplayProperty(width, height);

    }

    public static class DisplayProperty {
        private int width;
        private int height;

        public DisplayProperty(int width, int height) {
            super();
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

    }

    /**
     * 根据年月日计算星期几
     * 
     * @param year 年
     * @param month 月
     * @param day 日
     * @return w 星期
     */
    public static int getWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            --year;
        }
        int w = (day + 1 + 2 * month + 3 * (month + 1) / 5 + year + (year >> 2) - year / 100 + year / 400) % 7;
        return w;
    }

    /**
     * <获取手机设备的串号，可以作为唯一识别码>
     * 
     * @param context
     * @return deviceId
     */
    public static String getDeviceId(Context context) {
        TelephonyManager tm = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        String deviceId = tm.getDeviceId();
        return deviceId;
    }

    public static View getRootView(Activity context) {
        return ((ViewGroup)context.findViewById(android.R.id.content)).getChildAt(0);
    }
    

    public static String timestamp2Date(String time, String format) {
        String dateStr = null;
        Date date = null;
        try {
            if (time != null) {
                date = new Timestamp(Long.parseLong(time));
            } else {
                return "";
            }

            DateFormat dateformat = new SimpleDateFormat(format);
            dateStr = dateformat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

}
