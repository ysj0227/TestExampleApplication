package com.example.test.testexampleapplication.utils;

import android.content.Context;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class StringUtil {

    /**
     *
     * <3DES加密>
     *
     * @param src
     * @param key
     *            (key必须是长度大于等于 3*8 = 24 位)
     * @return
     * @throws Exception
     * @see [类、类#方法、类#成员]
     */
    // public static String encryptByDes(String src, String key)
    // throws Exception {
    // DESedeKeySpec dks = new DESedeKeySpec(key.getBytes("UTF-8"));
    // SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
    // SecretKey secureKey = keyFactory.generateSecret(dks);
    //
    // Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
    // cipher.init(Cipher.ENCRYPT_MODE, secureKey);
    // byte[] byteArr = cipher.doFinal(src.getBytes());
    //
    // BASE64Encoder encoder = new BASE64Encoder();
    //
    // String result = encoder.encode(byteArr).replaceAll("\r", "").replaceAll("\n", "");
    // // System.out.println("加密后的参数：" + result);
    //
    // return result;
    //
    // }

    /**
     *
     * <3DES解密>
     *
     * @param src
     * @param key
     *            (key必须是长度大于等于 3*8 = 24 位)
     * @return
     * @throws Exception
     * @see [类、类#方法、类#成员]
     */
    // public static String decryptByDes(String src, String key)
    // throws Exception {
    // // 通过base64,将字符串转成byte数组
    // BASE64Decoder decoder = new BASE64Decoder();
    //
    // byte[] byteSrc = decoder.decodeBuffer(src);
    // // 解密的key
    // DESedeKeySpec dks = new DESedeKeySpec(key.getBytes("UTF-8"));
    // SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
    // SecretKey securekey = keyFactory.generateSecret(dks);
    //
    // // Chipher对象解密
    // Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
    // cipher.init(Cipher.DECRYPT_MODE, securekey);
    // byte[] retByte = cipher.doFinal(byteSrc);
    //
    // return new String(retByte);
    // }


    /**
     * @param map
     * @return
     */
    public static String genXmlString(Map<String, String> map) {

        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            sb.append("<").append(entry.getKey()).append(">");
            sb.append(entry.getValue());
            sb.append("</").append(entry.getKey()).append(">");
        }
        sb.append("</xml>");
        // System.out.println(sb.toString());
        String s;
        try {
            s = new String(sb.toString().getBytes("ISO-8859-1"), "GB2312");
            return s;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将map键值对参数形式转变为xml形式，加密作为webservice参数值
     *
     * @param map
     * @return
     * @throws Exception
     */
    // public static HashMap<String, String> genMapParam(Map<String, String> map)
    // throws Exception {
    // HashMap<String, String> paramMap = new HashMap<String, String>();
    // // System.out.println(encryptByDes(genXmlString(map), Constants.KEY));
    // paramMap.put("param", encryptByDes(genXmlString(map), Constants.KEY));
    // return paramMap;
    // }

    /**
     * 将单个参数加密，作为webservice参数值
     *
     * @param map
     * @return
     * @throws Exception
     */
    // public static HashMap<String, String> genMapParam(String strSource)
    // throws Exception {
    // HashMap<String, String> paramMap = new HashMap<String, String>();
    //
    // // String filePath = Environment.getExternalStorageDirectory().getPath() +
    // "/m6/paramValue.txt";
    // // StringUl.string2File(encryptByDes(strSource, Constants.KEY), filePath);
    //
    // paramMap.put("param", encryptByDes(strSource, Constants.KEY));
    // return paramMap;
    // }

    /**
     * 获得当前月
     *
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        return String.valueOf(month);

    }

    /**
     * 从年月中获得月份
     *
     * @param content 形式如："2014年10月"
     * @return 月份
     */
    public static String getMonth(String content) {
        // int yearIndex = content.indexOf("年");
        // int monthIndex = content.indexOf("月");
        // String sMonth = content.substring(yearIndex + 1, monthIndex);

        int dotIndex = content.indexOf(".");
        String sMonth = content.substring(dotIndex + 1);

        return sMonth;
    }

    /**
     * 将数字转变为数字千分位格式
     *
     * @param sourceString
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String convertToCurrency(String sourceString) {
        String currency = NumberFormat.getCurrencyInstance().format(sourceString);
        return currency;
    }

    /**
     * 判断字符串是否不为空
     *
     * @param string
     * @return
     */
    public static boolean isNotNull(String string) {
        boolean flag = false;
        if (string != null && !"".equals(string.trim())) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断字符串是否为空
     *
     * @param string
     * @return
     */
    public static boolean isNull(String string) {
        boolean flag = false;
        String str = string.trim();
        if (str == null || "".equals(str) || "null".equalsIgnoreCase(str)) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断多个字符串，其中一个为空，则返回false
     *
     * @param strings
     * @return
     */
    public static boolean isNull(String... strings) {
        boolean flag = false;
        for (String s : strings) {
            String str = s.trim();
            if (isNull(str)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static boolean string2File(String res, String filePath) {

        if (!Constants.Config.DEVELOPER_MODE) { // 如果不是开发调试模式
            return false;
        }

        boolean flag = true;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            File distFile = new File(filePath);
            if (!distFile.getParentFile().exists()) {
                distFile.getParentFile().mkdirs();
            }

            bufferedReader = new BufferedReader(new StringReader(res));
            bufferedWriter = new BufferedWriter(new FileWriter(distFile));
            char buf[] = new char[1024];
            int len;
            while ((len = bufferedReader.read(buf)) != -1) {
                bufferedWriter.write(buf, 0, len);
            }
            bufferedWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            flag = false;
            return flag;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 读取存放在assets下的文本文件到String对象
     *
     * @param context  上下文
     * @param fileName 存放在assets下的文本文件名
     * @return
     */
    public static String readTextFile(Context context, String fileName) {
        StringBuffer sb = new StringBuffer();
        InputStream in = null;
        BufferedReader bufferedReader = null;
        try {
            in = context.getAssets().open(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(in));
            String text = null;
            while ((text = bufferedReader.readLine()) != null) {
                sb.append(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (in != null) {
                    in.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

     public static boolean isCellPhone(String tel) {
     // 只适合中国的手机号
     if (isNull(tel)) {
     return false;
     }

     Pattern p = Pattern.compile("1[34578][0-9]{9}");
     return p.matcher(tel).matches();

     }

    public static boolean isMail(String sEmail) {

        if (!sEmail.trim().contains("@")) {
            return false;
        }

        String[] strArr = sEmail.split("@");

        if (strArr.length == 1) {
            return false;
        }

        if (strArr[0].equals("") || strArr[1].indexOf(".") <= 0 || strArr[1].indexOf(".") == strArr[1].length() - 1) {
            return false;
        }

        return true;
    }

    public static String convertToGB(String s) {
        if (s == null) {
            return null;
        }

        try {
            return new String(s.getBytes("ISO-8859-1"), "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static boolean isEmpty(String string) {
        return (string == null || "".equals(string.trim()) || "null".equals(string.trim()));
    }

    public static boolean isTel(String tel) {
        if (isEmpty(tel))
            return false;
//		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Pattern p = Pattern.compile("1[34578][0-9]{9}");
        return p.matcher(tel).matches();
    }

    public static String toHtml(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        sb.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        sb.append("<head>");
        sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />");
        sb.append("</head>");
        sb.append("<body>");
        sb.append(str);
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    public static String formatDecimal(double doubleValue) {

        if (doubleValue > 0) {

//			DecimalFormat df = new DecimalFormat("########0.00");

            if(doubleValue < 1D) { // 小于1的显示两位小数
                // 采用千分位格式
                String format = ",##0.00";
                DecimalFormat df = new DecimalFormat(format);
//                return df.format(doubleValue);
                return df.format(doubleValue).replaceAll("\\.", ","); // ","表示小数点
            } else { // 大于等于1的，不显示小数部分
                String format = ",##0";
                DecimalFormat df = new DecimalFormat(format);
//                return df.format(doubleValue);
                return df.format(doubleValue).replaceAll(",", "."); // "."表示千分位
            }

        } else if (doubleValue == 0D) {
            return "0";
        } else {
            return "";
        }

    }

    /**
     * 将String型的time值转换为日期（年/月/日 时:分）
     *
     * @param time
     *            毫秒数字符串
     * @param format
     *            如："yyyy-MM-dd HH:mm:ss"
     * @return dateStr 日期字符串,传参为空时,返回""
     *
     */
    public static String timestampDate(String time, String format) {
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
