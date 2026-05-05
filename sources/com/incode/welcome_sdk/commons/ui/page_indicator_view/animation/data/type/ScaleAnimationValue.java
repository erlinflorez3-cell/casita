package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleAnimationValue extends ColorAnimationValue implements Value {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6041a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6042c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6044e;

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f6042c + 115;
        f6041a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6044e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRadius(int i2) {
        int i3 = 2 % 2;
        int i4 = f6041a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i5 = i4 % 128;
        f6042c = i5;
        int i6 = i4 % 2;
        this.f6044e = i2;
        int i7 = i5 + 91;
        f6041a = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f6041a;
        int i4 = i3 + 65;
        f6042c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f6043d;
        int i7 = i3 + 99;
        f6042c = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setRadiusReverse(int i2) {
        int i3 = 2 % 2;
        int i4 = f6042c + 99;
        int i5 = i4 % 128;
        f6041a = i5;
        int i6 = i4 % 2;
        this.f6043d = i2;
        int i7 = i5 + 81;
        f6042c = i7 % 128;
        int i8 = i7 % 2;
    }
}
