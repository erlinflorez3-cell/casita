package com.incode.welcome_sdk.data.local.model.delayed_onboarding.c;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8763f = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f8764n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f8769e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8773j;

    public d(long j2, long j3, double d2, boolean z2, boolean z3, String str, boolean z4, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f8768d = 0L;
        this.f8767c = j3;
        this.f8769e = d2;
        this.f8765a = z2;
        this.f8766b = z3;
        this.f8770g = str;
        this.f8771h = z4;
        this.f8773j = str2;
        this.f8772i = str3;
    }

    public /* synthetic */ d(long j2, String str, String str2, String str3, int i2) {
        this(0L, (i2 & 2) != 0 ? 0L : j2, 0.0d, false, false, (i2 & 32) != 0 ? "" : str, false, (i2 & 128) != 0 ? "" : str2, (i2 & 256) == 0 ? str3 : "");
    }

    public final long b() {
        int i2 = 2 % 2;
        int i3 = f8763f;
        int i4 = i3 + 115;
        f8764n = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f8768d;
        int i6 = i3 + 45;
        f8764n = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 65 / 0;
        }
        return j2;
    }

    public final long d() {
        int i2 = 2 % 2;
        int i3 = f8764n + 105;
        int i4 = i3 % 128;
        f8763f = i4;
        int i5 = i3 % 2;
        long j2 = this.f8767c;
        int i6 = i4 + 29;
        f8764n = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final double a() {
        int i2 = 2 % 2;
        int i3 = f8764n + 9;
        f8763f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8769e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f8764n + 79;
        int i4 = i3 % 128;
        f8763f = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8765a;
        int i6 = i4 + 51;
        f8764n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean e() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f8763f;
        int i4 = i3 + 93;
        f8764n = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f8766b;
            int i5 = 93 / 0;
        } else {
            z2 = this.f8766b;
        }
        int i6 = i3 + 73;
        f8764n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String i() {
        int i2 = 2 % 2;
        int i3 = f8763f;
        int i4 = i3 + 63;
        f8764n = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8770g;
        int i6 = i3 + 87;
        f8764n = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean f() {
        int i2 = 2 % 2;
        int i3 = f8764n + 11;
        int i4 = i3 % 128;
        f8763f = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f8771h;
        int i5 = i4 + 49;
        f8764n = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = f8764n + 117;
        f8763f = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f8773j;
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f8763f;
        int i4 = i3 + 83;
        f8764n = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f8772i;
        int i5 = i3 + 19;
        f8764n = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public d() {
        this(0L, null, null, null, FrameMetricsAggregator.EVERY_DURATION);
    }
}
