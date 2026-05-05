package com.incode.welcome_sdk.data.local.model.delayed_onboarding.a;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8650a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8651e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8654d;

    private d(long j2, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f8652b = 0L;
        this.f8654d = str;
        this.f8653c = str2;
    }

    public /* synthetic */ d(String str, String str2) {
        this(0L, str, str2);
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8650a + 5;
        int i4 = i3 % 128;
        f8651e = i4;
        int i5 = i3 % 2;
        long j2 = this.f8652b;
        int i6 = i4 + 53;
        f8650a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f8651e + 63;
        f8650a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8654d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f8651e + 117;
        int i4 = i3 % 128;
        f8650a = i4;
        int i5 = i3 % 2;
        String str = this.f8653c;
        int i6 = i4 + 29;
        f8651e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f8650a + 89;
        int i4 = i3 % 128;
        f8651e = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 33;
            f8650a = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8652b != dVar.f8652b) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8654d, dVar.f8654d)) {
            int i8 = f8650a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f8651e = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8653c, dVar.f8653c)) {
            int i10 = f8650a + 65;
            f8651e = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = f8651e + 13;
        f8650a = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = ((Long.hashCode(this.f8652b) * 31) + this.f8654d.hashCode()) * 31;
        String str = this.f8653c;
        if (str == null) {
            int i3 = f8650a;
            int i4 = i3 + 117;
            f8651e = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 11;
            f8651e = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8651e + 51;
        f8650a = i3 % 128;
        int i4 = i3 % 2;
        String str = "CombinedConsentResultEntity(id=" + this.f8652b + ", resultCode=" + this.f8654d + ", error=" + this.f8653c + ")";
        int i5 = f8650a + 63;
        f8651e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }
}
