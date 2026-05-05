package com.incode.welcome_sdk.commons.ui.page_indicator_view.utils;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class IdUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6259a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6260c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6261d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6262e = 0;

    static {
        new AtomicInteger(1);
        int i2 = f6260c + 95;
        f6261d = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int a() {
        int i2 = 2 % 2;
        int i3 = f6262e + 41;
        f6259a = i3 % 128;
        int i4 = i3 % 2;
        int iGenerateViewId = View.generateViewId();
        int i5 = f6262e + 117;
        f6259a = i5 % 128;
        int i6 = i5 % 2;
        return iGenerateViewId;
    }
}
