package com.incode.welcome_sdk.data.local.model.delayed_onboarding.h;

import com.incode.welcome_sdk.data.local.model.delayed_onboarding.d;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8867b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8868c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f8869a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f8870d;

    public c(n nVar, d dVar) {
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f8869a = nVar;
        this.f8870d = dVar;
    }

    public final n d() {
        int i2 = 2 % 2;
        int i3 = f8867b + 105;
        int i4 = i3 % 128;
        f8868c = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        n nVar = this.f8869a;
        int i5 = i4 + 101;
        f8867b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return nVar;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8868c + 109;
            f8867b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof c)) {
            int i5 = f8867b + 59;
            f8868c = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        c cVar = (c) obj;
        if (!Intrinsics.areEqual(this.f8869a, cVar.f8869a)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f8870d, cVar.f8870d)) {
            return true;
        }
        int i7 = f8867b + 107;
        f8868c = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8868c + 29;
        f8867b = i3 % 128;
        int iHashCode = (i3 % 2 != 0 ? this.f8869a.hashCode() * 8 : this.f8869a.hashCode() * 31) + this.f8870d.hashCode();
        int i4 = f8867b + 27;
        f8868c = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8868c + 79;
        f8867b = i3 % 128;
        int i4 = i3 % 2;
        String str = "SessionConfigAndDelayedOnboarding(sessionConfig=" + this.f8869a + ", delayedOnboarding=" + this.f8870d + ")";
        int i5 = f8868c + 43;
        f8867b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return str;
    }
}
