package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector[] newArray(int i2) {
            return new SingleDateSelector[i2];
        }
    };
    private CharSequence error;
    private Long selectedItem;
    private SimpleDateFormat textInputFormat;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.selectedItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public Long getSelection() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-701));
        short sXd2 = (short) (C1499aX.Xd() ^ (-17727));
        int[] iArr = new int["s\u007ft\u0002}vp9mxv{ksx1Epnscup".length()];
        QB qb = new QB("s\u007ft\u0002}vp9mxv{ksx1Epnscup");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("\u0010\r\u001bw\n\u0017\u0012\u0017\u0013\u0003\u0004\u0011", (short) (FB.Xd() ^ 11746)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Long l2 = this.selectedItem;
            return resources.getString(R.string.mtrl_picker_announce_current_selection, l2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.getYearMonthDay(l2.longValue()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd(" ,!.2+%m\u001a%#( (-eq\u001d\u001b \u0018*%", (short) (Od.Xd() ^ (-19154)))).getMethod(C1561oA.Yd("^]mL`olsqcfu", (short) (FB.Xd() ^ 31712)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Long l2 = this.selectedItem;
            if (l2 == null) {
                return resources.getString(R.string.mtrl_picker_date_header_unselected);
            }
            return resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.getYearMonthDay(l2.longValue()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z2 = defaultTextInputFormat != null;
        if (!z2) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        String pattern = z2 ? defaultTextInputFormat.toPattern() : UtcDates.getDefaultTextInputHint(viewInflate.getResources(), defaultTextInputFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l2 = this.selectedItem;
        if (l2 != null) {
            editText.setText(defaultTextInputFormat.format(l2));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, defaultTextInputFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(Long l3) {
                if (l3 == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(l3.longValue());
                }
                SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }
        });
        DateSelector.showKeyboardWithAutoHideBehavior(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j2) {
        this.selectedItem = Long.valueOf(j2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(Long l2) {
        this.selectedItem = l2 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l2.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.selectedItem);
    }
}
