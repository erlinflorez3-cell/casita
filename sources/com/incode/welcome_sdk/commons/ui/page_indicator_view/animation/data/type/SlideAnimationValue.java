package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class SlideAnimationValue implements Value {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6045d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6046e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6047a;

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f6045d + 27;
        f6046e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f6047a;
        if (i4 == 0) {
            int i6 = 11 / 0;
        }
        return i5;
    }

    public void setCoordinate(int i2) {
        int i3 = 2 % 2;
        int i4 = f6045d;
        int i5 = i4 + 97;
        f6046e = i5 % 128;
        int i6 = i5 % 2;
        this.f6047a = i2;
        int i7 = i4 + 99;
        f6046e = i7 % 128;
        int i8 = i7 % 2;
    }
}
