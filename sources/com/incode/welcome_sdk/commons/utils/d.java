package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6466c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6467d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6468a;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f6468a = context;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f6467d + 65;
        f6466c = i3 % 128;
        if (i3 % 2 == 0) {
            Object systemService = this.f6468a.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int i4 = f6466c + 25;
                int i5 = i4 % 128;
                f6467d = i5;
                z = i4 % 2 != 0;
                int i6 = i5 + 59;
                f6466c = i6 % 128;
                int i7 = i6 % 2;
            }
            return z;
        }
        Object systemService2 = this.f6468a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, "");
        ((ConnectivityManager) systemService2).getActiveNetworkInfo();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
