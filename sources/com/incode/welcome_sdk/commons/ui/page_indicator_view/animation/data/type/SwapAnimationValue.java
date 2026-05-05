package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class SwapAnimationValue implements Value {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6048b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6049e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6050a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6051c;

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f6049e;
        int i4 = i3 + 113;
        f6048b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f6050a;
        int i7 = i3 + 51;
        f6048b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setCoordinate(int i2) {
        int i3 = 2 % 2;
        int i4 = f6049e;
        int i5 = i4 + 49;
        f6048b = i5 % 128;
        int i6 = i5 % 2;
        this.f6050a = i2;
        int i7 = i4 + 29;
        f6048b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f6048b;
        int i4 = i3 + 13;
        f6049e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f6051c;
        int i7 = i3 + 27;
        f6049e = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCoordinateReverse(int i2) {
        int i3 = 2 % 2;
        int i4 = f6048b + 71;
        f6049e = i4 % 128;
        if (i4 % 2 == 0) {
            this.f6051c = i2;
        } else {
            this.f6051c = i2;
            throw null;
        }
    }
}
