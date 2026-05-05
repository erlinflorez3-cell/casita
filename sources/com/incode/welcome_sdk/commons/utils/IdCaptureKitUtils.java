package com.incode.welcome_sdk.commons.utils;

import com.incode.recogkitandroid.IdCaptureKitAndroid;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureKitUtils {
    public static final int $stable = 0;
    public static final IdCaptureKitUtils INSTANCE = new IdCaptureKitUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6314a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6315b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6316c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6317d = 1;

    private IdCaptureKitUtils() {
    }

    @JvmStatic
    public static final String getModelVersion(IdCaptureKitAndroid idCaptureKitAndroid) {
        int i2 = 2 % 2;
        int i3 = f6317d + 45;
        f6314a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idCaptureKitAndroid, "");
        String str = "1." + idCaptureKitAndroid.getVersion() + ".0";
        int i5 = f6314a + 117;
        f6317d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i2 = f6316c + 97;
        f6315b = i2 % 128;
        int i3 = i2 % 2;
    }
}
