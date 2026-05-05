package com.incode.welcome_sdk.commons.utils;

import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<TextView, Float> f6398a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6399b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6400c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6401d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6402e = 1;

    static {
        int i2 = f6400c + 125;
        f6402e = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    public static void a(TextView textView) {
        int i2 = 2 % 2;
        int i3 = f6399b + 65;
        f6401d = i3 % 128;
        if (i3 % 2 == 0) {
            f6398a.put(textView, Float.valueOf(textView.getTextSize()));
            int i4 = f6399b + 71;
            f6401d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
                return;
            }
            return;
        }
        f6398a.put(textView, Float.valueOf(textView.getTextSize()));
        throw null;
    }

    private static void b(TextView textView) {
        float fIntValue;
        int i2;
        int i3 = 2 % 2;
        Float f2 = f6398a.get(textView);
        if (f2 != null) {
            int i4 = f6401d + 97;
            f6399b = i4 % 128;
            if (i4 % 2 == 0) {
                fIntValue = f2.intValue();
                i2 = 1;
            } else {
                fIntValue = f2.intValue();
                i2 = 0;
            }
            textView.setTextSize(i2, fIntValue);
        }
        int i5 = f6401d + 13;
        f6399b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.widget.TextView r9) {
        /*
            r8 = 2
            int r0 = r8 % r8
            int r0 = com.incode.welcome_sdk.commons.utils.aj.f6401d
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.aj.f6399b = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L67
            int r0 = androidx.core.widget.TextViewCompat.getAutoSizeTextType(r9)
            if (r0 != 0) goto L21
            int r0 = com.incode.welcome_sdk.commons.utils.aj.f6399b
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.aj.f6401d = r0
            int r1 = r1 % r8
            b(r9)
            return
        L21:
            int r7 = androidx.core.widget.TextViewCompat.getAutoSizeMinTextSize(r9)
            int r6 = androidx.core.widget.TextViewCompat.getAutoSizeMaxTextSize(r9)
            int r5 = androidx.core.widget.TextViewCompat.getAutoSizeStepGranularity(r9)
            r4 = 1
            r3 = 0
            if (r7 <= 0) goto L3c
            int r0 = com.incode.welcome_sdk.commons.utils.aj.f6401d
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.aj.f6399b = r0
            int r1 = r1 % r8
            if (r6 > r7) goto L65
        L3c:
            r2 = r3
        L3d:
            if (r5 >= 0) goto L49
            int r0 = com.incode.welcome_sdk.commons.utils.aj.f6401d
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.aj.f6399b = r0
            int r1 = r1 % r8
            r5 = r4
        L49:
            androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(r9, r3)
            b(r9)
            if (r2 == 0) goto L64
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r9.measure(r1, r0)
            r9.requestLayout()
            androidx.core.widget.TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(r9, r7, r6, r5, r3)
        L64:
            return
        L65:
            r2 = r4
            goto L3d
        L67:
            androidx.core.widget.TextViewCompat.getAutoSizeTextType(r9)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.aj.e(android.widget.TextView):void");
    }
}
