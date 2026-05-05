package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.material.timepicker.TimeModel;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.bl;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17256a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17257d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bl f17258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResultsStatus f17259c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17260e;

    public PropertyView(Context context) {
        this(context, null);
    }

    public PropertyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PropertyView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d(attributeSet);
    }

    public PropertyView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        d(attributeSet);
    }

    private void d(AttributeSet attributeSet) {
        int i2 = 2 % 2;
        this.f17258b = bl.d(inflate(getContext(), R.layout.onboard_sdk_results_property_view, this));
        if (attributeSet != null) {
            int i3 = f17256a + 3;
            f17257d = i3 % 128;
            int i4 = i3 % 2;
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_PropertyView, 0, 0);
            setIndex(typedArrayObtainStyledAttributes.getInteger(R.styleable.onboard_sdk_PropertyView_onboard_sdk_index, 0));
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.onboard_sdk_PropertyView_onboard_sdk_name, 0);
            if (resourceId != 0) {
                int i5 = f17257d + 9;
                f17256a = i5 % 128;
                int i6 = i5 % 2;
                this.f17258b.f7117b.setText(resourceId);
                int i7 = f17256a + 91;
                f17257d = i7 % 128;
                int i8 = i7 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setIndex(int i2) {
        IncodeTextView incodeTextView;
        String str;
        int i3 = 2 % 2;
        int i4 = f17256a + 41;
        f17257d = i4 % 128;
        if (i4 % 2 == 0) {
            incodeTextView = this.f17258b.f7116a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[1] = Integer.valueOf(i2);
            str = String.format(locale, TimeModel.NUMBER_FORMAT, objArr);
        } else {
            incodeTextView = this.f17258b.f7116a;
            str = String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(i2));
        }
        incodeTextView.setText(str);
        int i5 = f17256a + 107;
        f17257d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    public void setName(String str) {
        int i2 = 2 % 2;
        int i3 = f17257d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17256a = i3 % 128;
        int i4 = i3 % 2;
        this.f17258b.f7117b.setText(str);
        int i5 = f17256a + 73;
        f17257d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setName(int i2) {
        int i3 = 2 % 2;
        int i4 = f17256a + 101;
        f17257d = i4 % 128;
        if (i4 % 2 != 0) {
            this.f17258b.f7117b.setText(i2);
        } else {
            this.f17258b.f7117b.setText(i2);
            throw null;
        }
    }

    public void setValue(Pair<String, ResultsStatus> pair) {
        int i2 = 2 % 2;
        int i3 = f17256a + 41;
        f17257d = i3 % 128;
        if (i3 % 2 == 0) {
            this.f17260e = pair.first;
            this.f17259c = pair.second;
            d();
            int i4 = 85 / 0;
            return;
        }
        this.f17260e = pair.first;
        this.f17259c = pair.second;
        d();
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f17256a + 75;
        f17257d = i3 % 128;
        int i4 = i3 % 2;
        this.f17258b.f7119d.setImageResource(this.f17259c.getIconResId());
        this.f17258b.f7118c.setTextColor(ContextCompat.getColor(getContext(), this.f17259c.getColorResId()));
        this.f17258b.f7118c.setText(this.f17260e);
        int i5 = f17257d + 61;
        f17256a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }
}
