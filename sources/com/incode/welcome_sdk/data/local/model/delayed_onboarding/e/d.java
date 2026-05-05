package com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8836h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8837i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8838a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f8840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f8842e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8843j;

    public d(long j2, Map<String, String> map, Map<String, String> map2, String str, String str2) {
        this.f8839b = j2;
        this.f8842e = map;
        this.f8840c = map2;
        this.f8841d = str;
        this.f8843j = str2;
    }

    public final long e() {
        int i2 = 2 % 2;
        int i3 = f8836h + 89;
        int i4 = i3 % 128;
        f8837i = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.f8838a;
        int i5 = i4 + 79;
        f8836h = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8836h + 43;
        int i4 = i3 % 128;
        f8837i = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.f8839b;
        int i5 = i4 + 103;
        f8836h = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final Map<String, String> a() {
        int i2 = 2 % 2;
        int i3 = f8836h + 95;
        f8837i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8842e;
        }
        throw null;
    }

    public final Map<String, String> b() {
        int i2 = 2 % 2;
        int i3 = f8837i;
        int i4 = i3 + 89;
        f8836h = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = this.f8840c;
        int i5 = i3 + 29;
        f8836h = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f8836h;
        int i4 = i3 + 39;
        f8837i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8841d;
        int i6 = i3 + 25;
        f8837i = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f8836h + 13;
        int i4 = i3 % 128;
        f8837i = i4;
        int i5 = i3 % 2;
        String str = this.f8843j;
        int i6 = i4 + 9;
        f8836h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
