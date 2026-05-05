package com.incode.welcome_sdk.data.local.model.delayed_onboarding.h;

import com.incode.welcome_sdk.data.local.model.delayed_onboarding.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8871b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8872e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c f8873a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f8874c;

    public e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar, d dVar) {
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f8873a = cVar;
        this.f8874c = dVar;
    }

    public final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c a() {
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar;
        int i2 = 2 % 2;
        int i3 = f8871b;
        int i4 = i3 + 51;
        f8872e = i4 % 128;
        if (i4 % 2 != 0) {
            cVar = this.f8873a;
            int i5 = 62 / 0;
        } else {
            cVar = this.f8873a;
        }
        int i6 = i3 + 25;
        f8872e = i6 % 128;
        if (i6 % 2 == 0) {
            return cVar;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            int i3 = f8871b + 77;
            f8872e = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.areEqual(this.f8873a, eVar.f8873a)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f8874c, eVar.f8874c)) {
            return true;
        }
        int i5 = f8872e + 73;
        int i6 = i5 % 128;
        f8871b = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 123;
        f8872e = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8871b + 89;
        f8872e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.f8873a.hashCode();
        return i4 != 0 ? (iHashCode - 93) << this.f8874c.hashCode() : (iHashCode * 31) + this.f8874c.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8871b + 63;
        f8872e = i3 % 128;
        int i4 = i3 % 2;
        String str = "FlowConfigAndDelayedOnboarding(flowConfig=" + this.f8873a + ", delayedOnboarding=" + this.f8874c + ")";
        int i5 = f8872e + 103;
        f8871b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
