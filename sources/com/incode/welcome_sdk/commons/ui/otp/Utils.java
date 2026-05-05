package com.incode.welcome_sdk.commons.ui.otp;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Utils f5977a = new Utils();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5978b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5979c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5980d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5981e = 1;

    private Utils() {
    }

    public static int c(Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = f5979c + 123;
        f5978b = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static int c(Context context, float f2) {
        int i2 = 2 % 2;
        int i3 = f5978b + 17;
        f5979c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int iApplyDimension = (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
        int i5 = f5978b + 59;
        f5979c = i5 % 128;
        int i6 = i5 % 2;
        return iApplyDimension;
    }

    static {
        int i2 = f5981e + 15;
        f5980d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
    }
}
