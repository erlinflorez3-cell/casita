package com.incode.welcome_sdk.commons.utils;

import com.dynatrace.android.agent.conf.SessionSplitConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class ab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6356b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6357d = 0;

    public static int a(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (i3 == 1) {
            int i6 = f6357d + 41;
            f6356b = i6 % 128;
            return i6 % 2 == 0 ? ((i2 / i4) << 1607) / 29757 : ((i2 - i4) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        }
        int i7 = (i2 + i4) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        int i8 = f6356b + 87;
        f6357d = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public static int e(int i2, int i3) {
        int i4 = 2 % 2;
        boolean z2 = true;
        if (i3 == -1) {
            int i5 = f6357d + 63;
            f6356b = i5 % 128;
            if (i5 % 2 == 0) {
                z2 = false;
            }
        } else {
            int iAbs = Math.abs(i2 - i3);
            if (Math.min(iAbs, 360 - iAbs) < 50) {
                int i6 = f6357d + 41;
                f6356b = i6 % 128;
                int i7 = i6 % 2;
                z2 = false;
            }
        }
        if (z2) {
            return (((i2 + 45) / 90) * 90) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        }
        int i8 = f6356b + 53;
        f6357d = i8 % 128;
        int i9 = i8 % 2;
        return i3;
    }
}
