package com.incode.welcome_sdk.ui.camera.video_selfie;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FacePositionConstraint {

    /* JADX INFO: renamed from: d */
    private static int f12129d = 0;

    /* JADX INFO: renamed from: f */
    private static int f12130f = 1;

    /* JADX INFO: renamed from: a */
    private float f12131a;

    /* JADX INFO: renamed from: b */
    private float f12132b;

    /* JADX INFO: renamed from: c */
    private float f12133c;

    /* JADX INFO: renamed from: e */
    private float f12134e;

    public FacePositionConstraint(float f2, float f3, float f4, float f5) {
        this.f12132b = f2;
        this.f12133c = f3;
        this.f12134e = f4;
        this.f12131a = f5;
    }

    public final float getMaxX() {
        int i2 = 2 % 2;
        int i3 = f12129d + 31;
        f12130f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f12134e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getMaxY() {
        int i2 = 2 % 2;
        int i3 = f12129d + 103;
        int i4 = i3 % 128;
        f12130f = i4;
        int i5 = i3 % 2;
        float f2 = this.f12131a;
        int i6 = i4 + 77;
        f12129d = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public final float getMinX() {
        int i2 = 2 % 2;
        int i3 = f12129d + 37;
        int i4 = i3 % 128;
        f12130f = i4;
        int i5 = i3 % 2;
        float f2 = this.f12132b;
        int i6 = i4 + 5;
        f12129d = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public final float getMinY() {
        int i2 = 2 % 2;
        int i3 = f12129d + 23;
        f12130f = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.f12133c;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        return f2;
    }

    public final void setMaxX(float f2) {
        int i2 = 2 % 2;
        int i3 = f12129d + 71;
        f12130f = i3 % 128;
        int i4 = i3 % 2;
        this.f12134e = f2;
        if (i4 == 0) {
            throw null;
        }
    }

    public final void setMaxY(float f2) {
        int i2 = 2 % 2;
        int i3 = f12130f;
        int i4 = i3 + 11;
        f12129d = i4 % 128;
        int i5 = i4 % 2;
        this.f12131a = f2;
        if (i5 != 0) {
            int i6 = 47 / 0;
        }
        int i7 = i3 + 9;
        f12129d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 15 / 0;
        }
    }

    public final void setMinX(float f2) {
        int i2 = 2 % 2;
        int i3 = f12130f;
        int i4 = i3 + 67;
        f12129d = i4 % 128;
        int i5 = i4 % 2;
        this.f12132b = f2;
        int i6 = i3 + 97;
        f12129d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
    }

    public final void setMinY(float f2) {
        int i2 = 2 % 2;
        int i3 = f12130f + 9;
        f12129d = i3 % 128;
        int i4 = i3 % 2;
        this.f12133c = f2;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Rect(");
        sb.append(this.f12132b);
        sb.append(", ");
        sb.append(this.f12133c);
        sb.append(" - ");
        sb.append(this.f12134e);
        sb.append(", ");
        sb.append(this.f12131a);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f12129d + 121;
        f12130f = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public final void scaleFromCenter(float f2) {
        int i2 = 2 % 2;
        int i3 = f12129d + 113;
        int i4 = i3 % 128;
        f12130f = i4;
        int i5 = i3 % 2;
        float f3 = this.f12134e;
        float f4 = this.f12132b;
        float f5 = f3 - f4;
        float f6 = this.f12131a;
        float f7 = this.f12133c;
        float f8 = f6 - f7;
        float f9 = f5 * f2;
        float f10 = f2 * f8;
        float f11 = (f4 + (f5 / 2.0f)) - (f9 / 2.0f);
        this.f12132b = f11;
        float f12 = (f7 + (f8 / 2.0f)) - (f10 / 2.0f);
        this.f12133c = f12;
        this.f12134e = f11 + f9;
        this.f12131a = f12 + f10;
        int i6 = i4 + 93;
        f12129d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 58 / 0;
        }
    }

    public final void scaleWithVerticalBias(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = f12129d;
        int i4 = i3 + 71;
        f12130f = i4 % 128;
        int i5 = i4 % 2;
        float f4 = this.f12134e;
        float f5 = this.f12132b;
        float f6 = f4 - f5;
        float f7 = this.f12131a;
        float f8 = this.f12133c;
        float f9 = f7 - f8;
        float f10 = f6 * f2;
        float f11 = f2 * f9;
        float f12 = f5 + ((f6 - f10) * 0.5f);
        this.f12132b = f12;
        float f13 = f8 + ((f9 - f11) * f3);
        this.f12133c = f13;
        this.f12134e = f12 + f10;
        this.f12131a = f13 + f11;
        int i6 = i3 + 77;
        f12130f = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void scaleFromOrigin(float f2) {
        int i2 = 2 % 2;
        int i3 = f12129d;
        int i4 = i3 + 101;
        f12130f = i4 % 128;
        int i5 = i4 % 2;
        this.f12132b *= f2;
        this.f12133c *= f2;
        this.f12134e *= f2;
        this.f12131a *= f2;
        int i6 = i3 + 75;
        f12130f = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void offsetBy(int i2, int i3) {
        float f2;
        int i4 = 2 % 2;
        int i5 = f12129d + 77;
        f12130f = i5 % 128;
        if (i5 % 2 == 0) {
            float f3 = i2;
            this.f12132b /= f3;
            float f4 = i3;
            this.f12133c += f4;
            this.f12134e += f3;
            f2 = this.f12131a * f4;
        } else {
            float f5 = i2;
            this.f12132b += f5;
            float f6 = i3;
            this.f12133c += f6;
            this.f12134e += f5;
            f2 = this.f12131a + f6;
        }
        this.f12131a = f2;
    }

    public final Rect asRect() {
        int i2 = 2 % 2;
        Rect rect = new Rect((int) this.f12132b, (int) this.f12133c, (int) this.f12134e, (int) this.f12131a);
        int i3 = f12130f + 31;
        f12129d = i3 % 128;
        int i4 = i3 % 2;
        return rect;
    }
}
