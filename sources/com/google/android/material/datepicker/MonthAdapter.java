package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j2) {
        return DateStrings.getDayContentDescription(context, j2, isToday(j2), isStartOfRange(j2), isEndOfRange(j2));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j2) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j2) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j2) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j2;
    }

    private void updateSelectedState(TextView textView, long j2, int i2) {
        boolean zIsSelected;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j2);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j2);
        if (zIsValid) {
            textView.setEnabled(true);
            zIsSelected = isSelected(j2);
            textView.setSelected(zIsSelected);
            calendarItemStyle = zIsSelected ? this.calendarStyle.selectedDay : isToday(j2) ? this.calendarStyle.todayDay : this.calendarStyle.day;
        } else {
            zIsSelected = false;
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        if (this.dayViewDecorator == null || i2 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        int i3 = this.month.year;
        int i4 = this.month.month;
        boolean z2 = zIsSelected;
        calendarItemStyle.styleItem(textView, this.dayViewDecorator.getBackgroundColor(context, i3, i4, i2, zIsValid, z2), this.dayViewDecorator.getTextColor(context, i3, i4, i2, zIsValid, z2));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i3, i4, i2, zIsValid, z2), this.dayViewDecorator.getCompoundDrawableTop(context, i3, i4, i2, zIsValid, z2), this.dayViewDecorator.getCompoundDrawableRight(context, i3, i4, i2, zIsValid, z2), this.dayViewDecorator.getCompoundDrawableBottom(context, i3, i4, i2, zIsValid, z2));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i3, i4, i2, zIsValid, z2, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.create(j2).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j2);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j2, dayOfMonth);
        }
    }

    int dayToPosition(int i2) {
        return firstPositionInMonth() + (i2 - 1);
    }

    int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public Long getItem(int i2) {
        if (i2 < firstPositionInMonth() || i2 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i2)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.month.daysInWeek;
    }

    @Override // android.widget.Adapter
    public TextView getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i2 - firstPositionInMonth();
        if (iFirstPositionInMonth < 0 || iFirstPositionInMonth >= this.month.daysInMonth) {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i3 = -1;
        } else {
            i3 = iFirstPositionInMonth + 1;
            textView.setTag(this.month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i3)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i3);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean isEndOfRange(long j2) {
        for (Pair<Long, Long> pair : this.dateSelector.getSelectedRanges()) {
            if (pair.second != null && pair.second.longValue() == j2) {
                return true;
            }
        }
        return false;
    }

    boolean isFirstInRow(int i2) {
        return i2 % this.month.daysInWeek == 0;
    }

    boolean isLastInRow(int i2) {
        return (i2 + 1) % this.month.daysInWeek == 0;
    }

    boolean isStartOfRange(long j2) {
        for (Pair<Long, Long> pair : this.dateSelector.getSelectedRanges()) {
            if (pair.first != null && pair.first.longValue() == j2) {
                return true;
            }
        }
        return false;
    }

    int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i2) {
        return (i2 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    boolean withinMonth(int i2) {
        return i2 >= firstPositionInMonth() && i2 <= lastPositionInMonth();
    }
}
