package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Locale;
import yg.C1561oA;
import yg.C1593ug;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 4;
    private static final int NARROW_FORMAT = 4;
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    public DaysOfWeekAdapter() {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = utcCalendar.getFirstDayOfWeek();
    }

    public DaysOfWeekAdapter(int i2) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = i2;
    }

    private int positionToDayOfWeek(int i2) {
        int i3 = i2 + this.firstDayOfWeek;
        int i4 = this.daysInWeek;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.daysInWeek;
    }

    @Override // android.widget.Adapter
    public Integer getItem(int i2) {
        if (i2 >= this.daysInWeek) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(i2));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) throws Throwable {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.calendar.set(7, positionToDayOfWeek(i2));
        textView.setText(this.calendar.getDisplayName(7, CALENDAR_DAY_STYLE, textView.getResources().getConfiguration().locale));
        Context context = viewGroup.getContext();
        int i3 = R.string.mtrl_picker_day_of_week_column_header;
        Class<?> cls = Class.forName(C1561oA.Qd("dpernga*^igl\\di\"6a_dTfa", (short) (ZN.Xd() ^ 31752)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i3)};
        Method method = cls.getMethod(C1593ug.zd("\u0013\u0012\"\u0002$#\u001b!\u001b", (short) (Od.Xd() ^ (-25685)), (short) (Od.Xd() ^ (-27298))), clsArr);
        try {
            method.setAccessible(true);
            textView.setContentDescription(String.format((String) method.invoke(context, objArr), this.calendar.getDisplayName(7, 2, Locale.getDefault())));
            return textView;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
