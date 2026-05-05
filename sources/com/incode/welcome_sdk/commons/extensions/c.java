package com.incode.welcome_sdk.commons.extensions;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5116c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5117e = 0;

    public static final float d(float f2, Density density) {
        int i2 = 2 % 2;
        int i3 = f5117e + 99;
        f5116c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(density, "");
        float fMo710toPx0680j_4 = density.mo710toPx0680j_4(f2);
        int i5 = f5116c + 111;
        f5117e = i5 % 128;
        int i6 = i5 % 2;
        return fMo710toPx0680j_4;
    }
}
