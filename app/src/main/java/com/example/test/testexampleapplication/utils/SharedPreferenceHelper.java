package com.example.test.testexampleapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {

    SharedPreferences sp;

    SharedPreferences.Editor editor;

    Context context;

    public SharedPreferenceHelper(Context ctx, String name) {

        context = ctx;
        sp = ctx.getSharedPreferences(name, 0);
    }

    /**
     * <存储>
     *  @param key
     * @param value
     */
    public String putValue(String key, String value) {
        editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
        return key;
    }

    /**
     * <取值>
     * 
     * @param key
     * @return key对应的值
     */
    public String getValue(String key) {
        return sp.getString(key, "");
    }

    public void delValue(String key) {
        editor = sp.edit();
        editor.remove(key);
        editor.commit();
    }
    
    public void clearAll() {
        editor = sp.edit();
        editor.clear();
        editor.commit();
    }
}
