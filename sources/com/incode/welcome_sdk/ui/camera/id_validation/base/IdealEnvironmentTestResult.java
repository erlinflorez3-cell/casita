package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdealEnvironmentTestResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11824a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11825d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f11827c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11828e;

    public IdealEnvironmentTestResult(int i2, Bitmap bitmap, String str) {
        this.f11826b = i2;
        this.f11827c = bitmap;
        this.f11828e = str;
    }

    public final Bitmap getBitmap() {
        int i2 = 2 % 2;
        int i3 = f11824a + 11;
        f11825d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11827c;
        }
        throw null;
    }

    public final int getResult() {
        int i2 = 2 % 2;
        int i3 = f11824a + 13;
        f11825d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11826b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSource() {
        int i2 = 2 % 2;
        int i3 = f11825d;
        int i4 = i3 + 3;
        f11824a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f11828e;
        int i6 = i3 + 5;
        f11824a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f11825d + 5;
            f11824a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof IdealEnvironmentTestResult)) {
            int i5 = f11825d + 3;
            f11824a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        IdealEnvironmentTestResult idealEnvironmentTestResult = (IdealEnvironmentTestResult) obj;
        if (this.f11826b != idealEnvironmentTestResult.f11826b) {
            int i7 = f11825d + 99;
            f11824a = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f11827c, idealEnvironmentTestResult.f11827c)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f11828e, idealEnvironmentTestResult.f11828e)) {
            return true;
        }
        int i8 = f11825d + 55;
        f11824a = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f11824a + 61;
        f11825d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = Integer.hashCode(this.f11826b) * 31;
        Bitmap bitmap = this.f11827c;
        if (bitmap == null) {
            iHashCode = 0;
        } else {
            iHashCode = bitmap.hashCode();
            int i5 = f11825d + 93;
            f11824a = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = (iHashCode2 + iHashCode) * 31;
        String str = this.f11828e;
        int iHashCode3 = i7 + (str != null ? str.hashCode() : 0);
        int i8 = f11825d + 51;
        f11824a = i8 % 128;
        int i9 = i8 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f11825d + 125;
        f11824a = i3 % 128;
        if (i3 % 2 != 0) {
            return "IdealEnvironmentTestResult(result=" + this.f11826b + ", bitmap=" + this.f11827c + ", source=" + this.f11828e + ")";
        }
        String str = "IdealEnvironmentTestResult(result=" + this.f11826b + ", bitmap=" + this.f11827c + ", source=" + this.f11828e + ")";
        throw null;
    }

    public static /* synthetic */ IdealEnvironmentTestResult copy$default(IdealEnvironmentTestResult idealEnvironmentTestResult, int i2, Bitmap bitmap, String str, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = f11824a + 47;
            f11825d = i5 % 128;
            int i6 = i5 % 2;
            i2 = idealEnvironmentTestResult.f11826b;
        }
        if ((i3 & 2) != 0) {
            int i7 = f11825d + 123;
            f11824a = i7 % 128;
            if (i7 % 2 == 0) {
                bitmap = idealEnvironmentTestResult.f11827c;
                int i8 = 16 / 0;
            } else {
                bitmap = idealEnvironmentTestResult.f11827c;
            }
        }
        if ((i3 & 4) != 0) {
            str = idealEnvironmentTestResult.f11828e;
        }
        return idealEnvironmentTestResult.copy(i2, bitmap, str);
    }

    public final IdealEnvironmentTestResult copy(int i2, Bitmap bitmap, String str) {
        int i3 = 2 % 2;
        IdealEnvironmentTestResult idealEnvironmentTestResult = new IdealEnvironmentTestResult(i2, bitmap, str);
        int i4 = f11825d + 43;
        f11824a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return idealEnvironmentTestResult;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f11824a;
        int i4 = i3 + 49;
        f11825d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f11828e;
        int i6 = i3 + 105;
        f11825d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Bitmap component2() {
        int i2 = 2 % 2;
        int i3 = f11824a;
        int i4 = i3 + 77;
        f11825d = i4 % 128;
        int i5 = i4 % 2;
        Bitmap bitmap = this.f11827c;
        int i6 = i3 + 7;
        f11825d = i6 % 128;
        int i7 = i6 % 2;
        return bitmap;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f11824a + 29;
        int i4 = i3 % 128;
        f11825d = i4;
        int i5 = i3 % 2;
        int i6 = this.f11826b;
        int i7 = i4 + 99;
        f11824a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 98 / 0;
        }
        return i6;
    }
}
