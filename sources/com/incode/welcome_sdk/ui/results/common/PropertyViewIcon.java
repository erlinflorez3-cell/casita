package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.material.timepicker.TimeModel;
import com.incode.welcome_sdk.d.bm;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyViewIcon extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17266d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17267e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultsStatus f17268a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bm f17269c;

    public PropertyViewIcon(Context context) {
        this(context, null);
    }

    public PropertyViewIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PropertyViewIcon(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d(attributeSet);
    }

    public PropertyViewIcon(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        d(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046 A[PHI: r1 r2
  0x0046: PHI (r1v7 int) = (r1v6 int), (r1v9 int) binds: [B:12:0x006a, B:7:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r2v3 android.content.res.TypedArray) = (r2v1 android.content.res.TypedArray), (r2v5 android.content.res.TypedArray) binds: [B:12:0x006a, B:7:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.util.AttributeSet r5) {
        /*
            r4 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.results.common.PropertyViewIcon.f17266d
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.PropertyViewIcon.f17267e = r0
            int r1 = r1 % r2
            android.content.Context r1 = r4.getContext()
            int r0 = com.incode.welcome_sdk.R.layout.onboard_sdk_results_property_view_icon
            android.view.View r0 = inflate(r1, r0, r4)
            com.incode.welcome_sdk.d.bm r0 = com.incode.welcome_sdk.d.bm.a(r0)
            r4.f17269c = r0
            if (r5 == 0) goto L50
            int r0 = com.incode.welcome_sdk.ui.results.common.PropertyViewIcon.f17266d
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.PropertyViewIcon.f17267e = r0
            int r1 = r1 % r2
            r3 = 0
            if (r1 != 0) goto L51
            android.content.Context r2 = r4.getContext()
            int[] r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView
            r1 = 1
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r5, r0, r1, r1)
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView_onboard_sdk_index
            int r0 = r2.getInteger(r0, r3)
            r4.setIndex(r0)
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView_onboard_sdk_name
            int r1 = r2.getResourceId(r0, r1)
            if (r1 == 0) goto L4d
        L46:
            com.incode.welcome_sdk.d.bm r0 = r4.f17269c
            com.incode.welcome_sdk.views.IncodeTextView r0 = r0.f7121b
            r0.setText(r1)
        L4d:
            r2.recycle()
        L50:
            return
        L51:
            android.content.Context r1 = r4.getContext()
            int[] r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r5, r0, r3, r3)
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView_onboard_sdk_index
            int r0 = r2.getInteger(r0, r3)
            r4.setIndex(r0)
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PropertyView_onboard_sdk_name
            int r1 = r2.getResourceId(r0, r3)
            if (r1 == 0) goto L4d
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.common.PropertyViewIcon.d(android.util.AttributeSet):void");
    }

    public void setIndex(int i2) {
        int i3 = 2 % 2;
        int i4 = f17266d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17267e = i4 % 128;
        int i5 = i4 % 2;
        this.f17269c.f7124e.setText(String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(i2)));
        int i6 = f17267e + 83;
        f17266d = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setName(String str) {
        int i2 = 2 % 2;
        int i3 = f17267e + 35;
        f17266d = i3 % 128;
        int i4 = i3 % 2;
        this.f17269c.f7121b.setText(str);
        int i5 = f17267e + 111;
        f17266d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setName(int i2) {
        int i3 = 2 % 2;
        int i4 = f17266d + 43;
        f17267e = i4 % 128;
        if (i4 % 2 != 0) {
            this.f17269c.f7121b.setText(i2);
        } else {
            this.f17269c.f7121b.setText(i2);
            throw null;
        }
    }

    public void setValue(Pair<String, ResultsStatus> pair) {
        int i2 = 2 % 2;
        int i3 = f17267e + 77;
        f17266d = i3 % 128;
        int i4 = i3 % 2;
        this.f17268a = pair.second;
        c();
        int i5 = f17267e + 45;
        f17266d = i5 % 128;
        int i6 = i5 % 2;
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f17266d + 61;
        f17267e = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17269c.f7122c.setImageResource(this.f17268a.getIconResId());
        } else {
            this.f17269c.f7122c.setImageResource(this.f17268a.getIconResId());
            throw null;
        }
    }
}
