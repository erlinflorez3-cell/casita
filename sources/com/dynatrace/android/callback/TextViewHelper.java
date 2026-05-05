package com.dynatrace.android.callback;

/* JADX INFO: loaded from: classes3.dex */
public class TextViewHelper {
    public static boolean isPasswordInputType(int i2) {
        int i3 = (i2 + 4095) - (i2 | 4095);
        return i3 == 129 || i3 == 225 || i3 == 18;
    }

    public static boolean isVisiblePasswordInputType(int i2) {
        return (i2 & 4095) == 145;
    }
}
