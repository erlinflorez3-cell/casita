package com.incode.welcome_sdk.data.remote.beans;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9522a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9523c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f9524b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9525d;

    public bn(String str, Map<String, Boolean> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f9525d = str;
        this.f9524b = map;
    }

    public final Map<String, Boolean> b() {
        int i2 = 2 % 2;
        int i3 = f9523c + 71;
        int i4 = i3 % 128;
        f9522a = i4;
        int i5 = i3 % 2;
        Map<String, Boolean> map = this.f9524b;
        int i6 = i4 + 61;
        f9523c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 81 / 0;
        }
        return map;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f9523c + 79;
        int i4 = i3 % 128;
        f9522a = i4;
        int i5 = i3 % 2;
        String str = this.f9525d;
        int i6 = i4 + 29;
        f9523c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9523c + 115;
        f9522a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        if (!Intrinsics.areEqual(this.f9525d, bnVar.f9525d)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9524b, bnVar.f9524b)) {
            return true;
        }
        int i4 = f9523c + 7;
        f9522a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9523c + 59;
        f9522a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f9525d.hashCode() * 31) + this.f9524b.hashCode();
        int i5 = f9523c + 25;
        f9522a = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9522a + 63;
        f9523c = i3 % 128;
        int i4 = i3 % 2;
        String str = "SendCombinedConsentRequest(languageConsentId=" + this.f9525d + ", checkboxes=" + this.f9524b + ")";
        int i5 = f9523c + 45;
        f9522a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
