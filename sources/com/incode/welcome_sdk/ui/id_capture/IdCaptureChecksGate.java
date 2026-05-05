package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.commons.d;
import com.incode.welcome_sdk.commons.statsig.StatsigFeature;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureChecksGate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14756a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14757b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14758d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14759e = 0;

    private IdCaptureChecksGate() {
    }

    @JvmStatic
    public static final boolean useBarcodeAndTextReadabilityAlgorithm() {
        int i2 = 2 % 2;
        int i3 = f14759e + 125;
        f14758d = i3 % 128;
        if (i3 % 2 == 0) {
            d.e(d.c.f4781b);
            throw null;
        }
        if (d.e(d.c.f4781b) || StatsigFeature.d.f5377c.isAvailable()) {
            return true;
        }
        int i4 = f14759e + 21;
        f14758d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @JvmStatic
    public static final boolean isIdIouCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f14759e + 69;
        f14758d = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsAvailable = StatsigFeature.e.f5379a.isAvailable();
        int i5 = f14759e + 71;
        f14758d = i5 % 128;
        int i6 = i5 % 2;
        return zIsAvailable;
    }

    static {
        new IdCaptureChecksGate();
        int i2 = f14757b + 71;
        f14756a = i2 % 128;
        int i3 = i2 % 2;
    }
}
