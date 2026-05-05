package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class ColorAnimationValue implements Value {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6026a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6027b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6029e;

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f6026a;
        int i4 = i3 + 87;
        f6027b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f6029e;
        int i7 = i3 + 111;
        f6027b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f6026a + 31;
        int i5 = i4 % 128;
        f6027b = i5;
        int i6 = i4 % 2;
        this.f6029e = i2;
        int i7 = i5 + 111;
        f6026a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f6027b + 3;
        f6026a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6028d;
        }
        throw null;
    }

    public void setColorReverse(int i2) {
        int i3 = 2 % 2;
        int i4 = f6026a;
        int i5 = i4 + 105;
        f6027b = i5 % 128;
        int i6 = i5 % 2;
        this.f6028d = i2;
        int i7 = i4 + 21;
        f6027b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
    }
}
