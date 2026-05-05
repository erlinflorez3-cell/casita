package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class FillAnimationValue extends ColorAnimationValue implements Value {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6035a = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f6036j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6040e;

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f6036j;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f6035a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f6039d;
        int i7 = i3 + 73;
        f6035a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setRadius(int i2) {
        int i3 = 2 % 2;
        int i4 = f6035a;
        int i5 = i4 + 69;
        f6036j = i5 % 128;
        int i6 = i5 % 2;
        this.f6039d = i2;
        int i7 = i4 + 37;
        f6036j = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 51 / 0;
        }
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f6035a + 35;
        int i4 = i3 % 128;
        f6036j = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.f6038c;
        int i6 = i4 + 121;
        f6035a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void setRadiusReverse(int i2) {
        int i3 = 2 % 2;
        int i4 = f6036j;
        int i5 = i4 + 77;
        f6035a = i5 % 128;
        int i6 = i5 % 2;
        this.f6038c = i2;
        int i7 = i4 + 51;
        f6035a = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int e() {
        int i2 = 2 % 2;
        int i3 = f6036j + 57;
        int i4 = i3 % 128;
        f6035a = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f6040e;
        int i6 = i4 + 95;
        f6036j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return i5;
    }

    public void setStroke(int i2) {
        int i3 = 2 % 2;
        int i4 = f6035a + 27;
        f6036j = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6040e = i2;
        } else {
            this.f6040e = i2;
            throw null;
        }
    }

    public final int i() {
        int i2 = 2 % 2;
        int i3 = f6036j + 85;
        f6035a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6037b;
        }
        throw null;
    }

    public void setStrokeReverse(int i2) {
        int i3 = 2 % 2;
        int i4 = f6035a + 41;
        f6036j = i4 % 128;
        if (i4 % 2 == 0) {
            this.f6037b = i2;
            int i5 = 53 / 0;
        } else {
            this.f6037b = i2;
        }
    }
}
