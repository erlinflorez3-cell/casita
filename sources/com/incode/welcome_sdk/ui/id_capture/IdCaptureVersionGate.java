package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.commons.d;
import com.incode.welcome_sdk.commons.statsig.StatsigFeature;
import com.incode.welcome_sdk.ui.camera.IncodeCameraProvider;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureVersionGate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14880a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14881c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14882d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14883e = 1;

    private IdCaptureVersionGate() {
    }

    @JvmStatic
    public static final boolean useV2() {
        int i2 = 2 % 2;
        int i3 = f14883e + 117;
        f14881c = i3 % 128;
        if (i3 % 2 == 0) {
            if (!d.e(d.c.f4783d)) {
                return (d.e(d.c.f4784e) || StatsigFeature.c.f5373a.isAvailable()) && IncodeCameraProvider.doesCameraDependencyExist();
            }
            int i4 = f14881c + 69;
            f14883e = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        d.e(d.c.f4783d);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        new IdCaptureVersionGate();
        int i2 = f14882d + 107;
        f14880a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
    }
}
