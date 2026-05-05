package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1626yg;
import yg.Ig;
import yg.OY;
import yg.Od;

/* JADX INFO: loaded from: classes8.dex */
final class CalendarStyle {
    final CalendarItemStyle day;
    final CalendarItemStyle invalidDay;
    final Paint rangeFill;
    final CalendarItemStyle selectedDay;
    final CalendarItemStyle selectedYear;
    final CalendarItemStyle todayDay;
    final CalendarItemStyle todayYear;
    final CalendarItemStyle year;

    CalendarStyle(Context context) throws Throwable {
        int iResolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName());
        int[] iArr = R.styleable.MaterialCalendar;
        Class<?> cls = Class.forName(C1626yg.Ud("G\u0002L?l\"#=0\u0004v\u0016\nj\u0012\b\"JLcpih", (short) (Od.Xd() ^ (-20915)), (short) (Od.Xd() ^ (-29183))));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(iResolveOrThrow), iArr};
        Method method = cls.getMethod(Ig.wd("Add2Y!2k1\u0005\u007f`\u000e77?mx3\n<\u0002", (short) (OY.Xd() ^ 18265)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.day = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
            this.invalidDay = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
            this.selectedDay = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
            this.todayDay = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
            ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArray, R.styleable.MaterialCalendar_rangeFillColor);
            this.year = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
            this.selectedYear = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
            this.todayYear = CalendarItemStyle.create(context, typedArray.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
            Paint paint = new Paint();
            this.rangeFill = paint;
            paint.setColor(colorStateList.getDefaultColor());
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
