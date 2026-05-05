package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class DropAnimationValue implements Value {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6030a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6031d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6033c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6034e;

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f6030a + 101;
        f6031d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f6032b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = f6030a + 7;
        f6031d = i4 % 128;
        if (i4 % 2 == 0) {
            this.f6032b = i2;
            int i5 = 7 / 0;
        } else {
            this.f6032b = i2;
        }
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f6031d;
        int i4 = i3 + 41;
        f6030a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.f6033c;
        int i6 = i3 + 67;
        f6030a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = f6031d + 93;
        int i5 = i4 % 128;
        f6030a = i5;
        if (i4 % 2 == 0) {
            this.f6033c = i2;
            int i6 = i5 + 103;
            f6031d = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        this.f6033c = i2;
        throw null;
    }

    public final int e() {
        int i2 = 2 % 2;
        int i3 = f6031d + 121;
        int i4 = i3 % 128;
        f6030a = i4;
        int i5 = i3 % 2;
        int i6 = this.f6034e;
        int i7 = i4 + 85;
        f6031d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setRadius(int i2) {
        int i3 = 2 % 2;
        int i4 = f6030a;
        int i5 = i4 + 35;
        f6031d = i5 % 128;
        int i6 = i5 % 2;
        this.f6034e = i2;
        int i7 = i4 + 21;
        f6031d = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
