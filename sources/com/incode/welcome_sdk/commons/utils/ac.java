package com.incode.welcome_sdk.commons.utils;

import com.braze.models.FeatureFlag;

/* JADX INFO: loaded from: classes5.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6358a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6359e = 0;

    public static String d(String str) {
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = f6358a + 123;
            f6359e = i3 % 128;
            int i4 = i3 % 2;
            if (str.toLowerCase().contains("pdf")) {
                return "pdf";
            }
        }
        int i5 = f6358a + 5;
        f6359e = i5 % 128;
        int i6 = i5 % 2;
        return FeatureFlag.PROPERTIES_TYPE_IMAGE;
    }
}
