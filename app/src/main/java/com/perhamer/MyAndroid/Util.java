package com.perhamer.MyAndroid;

import android.util.DisplayMetrics;

/**
 * @author perhamer
 * @date 2021-04-07 17:05
 */
public class Util {


    public static int mmToPx(int mm,int dpi) {
        return (int) Math.round(mm * dpi / 25.4);
    }
    
}
