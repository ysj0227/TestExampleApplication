package com.example.test.testexampleapplication.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by zhjm on 2015/9/27.
 */
public class MathUtil {

    public static double multiply(double multiplier, double multiplicand) {
        String multiplier1 = String.valueOf(multiplier);
        String multiplicand1 = String.valueOf(multiplicand);
        return multiply(multiplier1, multiplicand1);
    }

    public static double multiply(String multiplier, String multiplicand) {
        BigDecimal b1 = new BigDecimal(multiplier);
        BigDecimal b2 = new BigDecimal(multiplicand);
        double result = b1.multiply(b2).doubleValue();
        return result;
    }

    public static double divide(double dividend, double divisor) {

        String dividend1 = String.valueOf(dividend);
        String divisor1 = String.valueOf(divisor);
        return divide(dividend1, divisor1);
    }

    public static double divide(String dividend, String divisor) {
        BigDecimal b1 = new BigDecimal(dividend);
        BigDecimal b2 = new BigDecimal(divisor);
        double result = b1.divide(b2, 6, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 格式化数字，保留两位小数
     * @param doubleValue
     * @return
     */
    public static String formatDecimal(double doubleValue) {

        if (doubleValue > 0) {

           // 采用千分位格式
            String format = "###0.00";
            DecimalFormat df = new DecimalFormat(format);
            return df.format(doubleValue);


        } else if (doubleValue == 0D) {
            return "0";
        } else {
            return "null";
        }

    }


}
