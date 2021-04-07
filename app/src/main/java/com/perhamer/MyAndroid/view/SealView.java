package com.perhamer.MyAndroid.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.perhamer.MyAndroid.Util;

/**
 * @author perhamer
 * @date 2021-04-07 11:51
 */
public class SealView extends View {

    /** 图片与容器间距*/
    private static Integer STYLE_IMAGE_BORDER = 0;
    /** 图片类型 0圆 1椭圆*/
    private static Integer SEAL_TYPE = 0;
    /** 图片外切圆直径*/
    private static Integer SEAL_SIZE = 0;
    /** 上弦文字*/
    private static String UPPER_ARC_TEXT = "";
    /** 下弦文字*/
    private static String LOWER_ARC_TEXT = "";
    /** 颜色*/
    private static Integer DEFAULT_COLOR = Color.RED;
    /** 外边框粗细*/
    private static Integer DEFAULT_OUTER_BORDER_SIZE = 0;
    /** 内边框粗细*/
    private static Integer DEFAULT_INNER_BORDER_SIZE = 0;
    /** 内外圆间距*/
    private static Integer DEFAULT_INNER_OUTER_DIS = 0;

    private static  Paint PAINT = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        PAINT.setStyle(Paint.Style.STROKE);
        PAINT.setColor(DEFAULT_COLOR);
        int size = getWidth() - STYLE_IMAGE_BORDER;
        canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, size, PAINT);
    }

    public SealView(Context context) {
        super(context);
    }


    public SealView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SealView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int dpi = context.getResources().getDisplayMetrics().densityDpi;
        STYLE_IMAGE_BORDER = Util.mmToPx(10,dpi);
    }
}
