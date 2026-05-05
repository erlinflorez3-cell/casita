package com.incode.welcome_sdk.commons.extensions;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5120a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5121c = 1;

    public static final boolean c(Boolean bool) {
        int i2 = 2 % 2;
        int i3 = f5121c + 11;
        f5120a = i3 % 128;
        int i4 = i3 % 2;
        boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
        int i5 = f5120a + 107;
        f5121c = i5 % 128;
        if (i5 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    public static final boolean b(Boolean bool) {
        int i2 = 2 % 2;
        int i3 = f5121c + 77;
        f5120a = i3 % 128;
        int i4 = i3 % 2;
        boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.FALSE);
        int i5 = f5120a + 63;
        f5121c = i5 % 128;
        int i6 = i5 % 2;
        return zAreEqual;
    }
}
