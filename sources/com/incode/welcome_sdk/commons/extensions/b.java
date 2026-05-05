package com.incode.welcome_sdk.commons.extensions;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5114a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5115e = 1;

    public static final boolean d(Bundle bundle, String str) {
        int i2 = 2 % 2;
        int i3 = f5114a + 23;
        f5115e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (bundle != null) {
            int i5 = f5114a + 17;
            f5115e = i5 % 128;
            int i6 = i5 % 2;
            return bundle.getBoolean(str, true);
        }
        int i7 = f5114a + 113;
        f5115e = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
