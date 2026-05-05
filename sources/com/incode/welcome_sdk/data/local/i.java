package com.incode.welcome_sdk.data.local;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8596b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8597e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8598a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8600d;

    public i(long j2, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f8599c = j2;
        this.f8598a = str;
        this.f8600d = z2;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8596b + 27;
        int i4 = i3 % 128;
        f8597e = i4;
        int i5 = i3 % 2;
        long j2 = this.f8599c;
        int i6 = i4 + 73;
        f8596b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f8596b + 13;
        int i4 = i3 % 128;
        f8597e = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f8598a;
        int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8596b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f8597e + 17;
        f8596b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8600d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f8599c != iVar.f8599c) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8598a, iVar.f8598a)) {
            int i3 = f8597e + 57;
            f8596b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.f8600d == iVar.f8600d) {
            return true;
        }
        int i5 = f8596b + 21;
        f8597e = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8597e + 43;
        f8596b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((Long.hashCode(this.f8599c) * 31) + this.f8598a.hashCode()) * 31) + Boolean.hashCode(this.f8600d);
        int i5 = f8597e + 97;
        f8596b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8596b + 85;
        f8597e = i3 % 128;
        int i4 = i3 % 2;
        long j2 = this.f8599c;
        if (i4 != 0) {
            return "FeatureConfig(id=" + j2 + ", feature=" + this.f8598a + ", enabled=" + this.f8600d + ")";
        }
        String str = "FeatureConfig(id=" + j2 + ", feature=" + this.f8598a + ", enabled=" + this.f8600d + ")";
        throw null;
    }
}
