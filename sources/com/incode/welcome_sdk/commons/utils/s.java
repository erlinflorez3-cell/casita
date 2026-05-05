package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import com.huawei.hms.api.HuaweiMobileServicesUtil;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: b */
    private static int f6638b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6639c = 1;

    /* JADX INFO: renamed from: d */
    private static int f6640d = 1;

    /* JADX INFO: renamed from: e */
    private static int f6641e = 0;

    private s() {
    }

    @JvmStatic
    public static final boolean c(Context context) {
        int i2 = 2 % 2;
        int i3 = f6640d + 111;
        f6638b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            if (HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context) == 0) {
                int i5 = f6640d + 43;
                f6638b = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = f6640d + 81;
            f6638b = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        } catch (Exception e2) {
            Timber.Forest.e(e2);
            return false;
        } catch (NoClassDefFoundError e3) {
            Timber.Forest.e(e3);
            return false;
        }
    }

    static {
        new s();
        int i2 = f6641e + 79;
        f6639c = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
    }
}
