package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.bj;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyViewBold extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17261a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17262c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bj f17263b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ResultsStatus f17265e;

    public PropertyViewBold(Context context) {
        this(context, null);
    }

    public PropertyViewBold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PropertyViewBold(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        e(attributeSet);
    }

    public PropertyViewBold(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        e(attributeSet);
    }

    private void e(AttributeSet attributeSet) {
        int i2 = 2 % 2;
        this.f17263b = bj.c(inflate(getContext(), R.layout.onboard_sdk_results_property_view_bold, this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_PropertyViewBold, 0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.onboard_sdk_PropertyViewBold_onboard_sdk_name, 0);
            if (resourceId != 0) {
                int i3 = f17261a + 19;
                f17262c = i3 % 128;
                int i4 = i3 % 2;
                this.f17263b.f7102a.setText(resourceId);
                int i5 = f17262c + 105;
                f17261a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 4;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i7 = f17262c + 33;
        f17261a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void setValue(Pair<String, ResultsStatus> pair) {
        int i2 = 2 % 2;
        int i3 = f17262c;
        int i4 = i3 + 85;
        f17261a = i4 % 128;
        int i5 = i4 % 2;
        if (pair != null) {
            this.f17264d = pair.first;
            this.f17265e = pair.second;
            a();
        } else {
            int i6 = i3 + 33;
            f17261a = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setValue(String str) {
        int i2 = 2 % 2;
        int i3 = f17261a;
        int i4 = i3 + 9;
        f17262c = i4 % 128;
        int i5 = i4 % 2;
        if (str != null) {
            this.f17264d = str;
            a();
        } else {
            int i6 = i3 + 109;
            f17262c = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f17262c + 5;
        f17261a = i3 % 128;
        int i4 = i3 % 2;
        if (this.f17265e != null) {
            this.f17263b.f7103b.setTextColor(ContextCompat.getColor(getContext(), this.f17265e.getColorResId()));
        }
        this.f17263b.f7103b.setText(this.f17264d);
        int i5 = f17261a + 31;
        f17262c = i5 % 128;
        int i6 = i5 % 2;
    }
}
