package com.incode.welcome_sdk.commons.ui.page_indicator_view.utils;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes5.dex */
public class DensityUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6257a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6258c = 1;

    public static int b(int i2) {
        int i3 = 2 % 2;
        int i4 = f6258c + 13;
        f6257a = i4 % 128;
        int i5 = i4 % 2;
        int iApplyDimension = (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
        int i6 = f6258c + 75;
        f6257a = i6 % 128;
        int i7 = i6 % 2;
        return iApplyDimension;
    }
}
