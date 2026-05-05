package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8879i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8880j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8885e;

    public j(long j2, long j3, String str, long j4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f8883c = j2;
        this.f8882b = j3;
        this.f8881a = str;
        this.f8885e = j4;
        this.f8884d = i2;
    }

    public final long d() {
        int i2 = 2 % 2;
        int i3 = f8879i + 63;
        int i4 = i3 % 128;
        f8880j = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.f8883c;
        int i5 = i4 + 57;
        f8879i = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8879i + 9;
        int i4 = i3 % 128;
        f8880j = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.f8882b;
        int i5 = i4 + 57;
        f8879i = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f8880j + 109;
        int i4 = i3 % 128;
        f8879i = i4;
        int i5 = i3 % 2;
        String str = this.f8881a;
        int i6 = i4 + 7;
        f8880j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return str;
    }

    public final long e() {
        int i2 = 2 % 2;
        int i3 = f8880j + 71;
        int i4 = i3 % 128;
        f8879i = i4;
        int i5 = i3 % 2;
        long j2 = this.f8885e;
        int i6 = i4 + 123;
        f8880j = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f8879i;
        int i4 = i3 + 99;
        f8880j = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.f8884d;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8880j = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8879i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f8880j = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!(obj instanceof j)) {
            int i4 = f8880j + 107;
            f8879i = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        j jVar = (j) obj;
        if (this.f8883c != jVar.f8883c) {
            return false;
        }
        if (this.f8882b != jVar.f8882b) {
            int i5 = f8879i + 23;
            f8880j = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8881a, jVar.f8881a)) {
            return false;
        }
        if (this.f8885e != jVar.f8885e) {
            int i7 = f8879i + 73;
            f8880j = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.f8884d == jVar.f8884d) {
            return true;
        }
        int i9 = f8880j + 19;
        f8879i = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8880j + 121;
        f8879i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((Long.hashCode(this.f8883c) * 31) + Long.hashCode(this.f8882b)) * 31) + this.f8881a.hashCode()) * 31) + Long.hashCode(this.f8885e)) * 31) + Integer.hashCode(this.f8884d);
        int i5 = f8879i + 79;
        f8880j = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8879i + 111;
        f8880j = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "FlowModulesEntity(id=" + this.f8883c + ", flowConfigId=" + this.f8882b + ", moduleTypeName=" + this.f8881a + ", moduleId=" + this.f8885e + ", moduleIndex=" + this.f8884d + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "FlowModulesEntity(id=" + this.f8883c + ", flowConfigId=" + this.f8882b + ", moduleTypeName=" + this.f8881a + ", moduleId=" + this.f8885e + ", moduleIndex=" + this.f8884d + ")";
        int i4 = f8879i + 91;
        f8880j = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }
}
