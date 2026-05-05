package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;

/* JADX INFO: loaded from: classes5.dex */
public class WormAnimationValue implements Value {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6055c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6056d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6057b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6058e;

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f6056d + 91;
        f6055c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f6058e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRectStart(int i2) {
        int i3 = 2 % 2;
        int i4 = f6056d + 69;
        int i5 = i4 % 128;
        f6055c = i5;
        if (i4 % 2 == 0) {
            this.f6058e = i2;
            int i6 = i5 + 31;
            f6056d = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        this.f6058e = i2;
        throw null;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f6055c + 115;
        int i4 = i3 % 128;
        f6056d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f6057b;
        int i6 = i4 + 3;
        f6055c = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setRectEnd(int i2) {
        int i3 = 2 % 2;
        int i4 = f6055c + 33;
        f6056d = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6057b = i2;
            return;
        }
        this.f6057b = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
