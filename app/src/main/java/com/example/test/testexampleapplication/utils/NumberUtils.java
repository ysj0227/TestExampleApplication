package com.example.test.testexampleapplication.utils;

import java.text.DecimalFormat;

public class NumberUtils {
	/**
	 * 格式化价格，强制保留2位小数
	 * @param price
	 * @return
	 */
	public static String formatPrice(double price) {
		DecimalFormat df=new DecimalFormat("0.00");
		String format = "¥ " + df.format(price);
		return format;
	}
	public static String formatPrice1(double price) {
		DecimalFormat df=new DecimalFormat("0");
		String format = df.format(price);
		return format;
	}
}
