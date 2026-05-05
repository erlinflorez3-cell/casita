package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class ThinWormAnimationValue extends WormAnimationValue implements Value {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6052d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6053e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6054a;

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f6052d + 115;
        f6053e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f6054a;
        }
        throw null;
    }

    public void setHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = f6052d + 77;
        int i5 = i4 % 128;
        f6053e = i5;
        if (i4 % 2 != 0) {
            this.f6054a = i2;
            int i6 = i5 + 99;
            f6052d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 72 / 0;
                return;
            }
            return;
        }
        this.f6054a = i2;
        throw null;
    }
}
