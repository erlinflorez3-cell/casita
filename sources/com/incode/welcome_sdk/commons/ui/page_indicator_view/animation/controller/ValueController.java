package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ScaleAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ScaleDownAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SlideAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation;

/* JADX INFO: loaded from: classes5.dex */
public class ValueController {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f6014l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f6015o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScaleAnimation f6016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WormAnimation f6017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FillAnimation f6018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorAnimation f6019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SlideAnimation f6020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private UpdateListener f6021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SwapAnimation f6022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ThinWormAnimation f6023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DropAnimation f6024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ScaleDownAnimation f6025j;

    public interface UpdateListener {
        void a(Value value);
    }

    public ValueController(UpdateListener updateListener) {
        this.f6021f = updateListener;
    }

    public final ColorAnimation d() {
        int i2 = 2 % 2;
        int i3 = f6015o + 65;
        f6014l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6019d == null) {
            this.f6019d = new ColorAnimation(this.f6021f);
            int i5 = f6015o + 111;
            f6014l = i5 % 128;
            int i6 = i5 % 2;
        }
        return this.f6019d;
    }

    public final ScaleAnimation b() {
        int i2 = 2 % 2;
        int i3 = f6014l + 35;
        f6015o = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6016a == null) {
            this.f6016a = new ScaleAnimation(this.f6021f);
        }
        ScaleAnimation scaleAnimation = this.f6016a;
        int i5 = f6015o + 89;
        f6014l = i5 % 128;
        int i6 = i5 % 2;
        return scaleAnimation;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation c() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6015o
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6014l = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2b
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation r1 = r3.f6017b
            r0 = 70
            int r0 = r0 / 0
            if (r1 != 0) goto L28
        L16:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation r1 = new com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController$UpdateListener r0 = r3.f6021f
            r1.<init>(r0)
            r3.f6017b = r1
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6015o
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6014l = r0
            int r1 = r1 % r2
        L28:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation r0 = r3.f6017b
            return r0
        L2b:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation r0 = r3.f6017b
            if (r0 != 0) goto L28
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.c():com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation");
    }

    public final SlideAnimation a() {
        int i2 = 2 % 2;
        int i3 = f6014l + 89;
        f6015o = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6020e == null) {
            this.f6020e = new SlideAnimation(this.f6021f);
            int i5 = f6014l + 17;
            f6015o = i5 % 128;
            int i6 = i5 % 2;
        }
        SlideAnimation slideAnimation = this.f6020e;
        int i7 = f6014l + 17;
        f6015o = i7 % 128;
        if (i7 % 2 != 0) {
            return slideAnimation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FillAnimation e() {
        int i2 = 2 % 2;
        int i3 = f6015o + 101;
        f6014l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6018c == null) {
            this.f6018c = new FillAnimation(this.f6021f);
            int i5 = f6015o + 39;
            f6014l = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            }
        }
        return this.f6018c;
    }

    public final ThinWormAnimation f() {
        int i2 = 2 % 2;
        int i3 = f6014l + 5;
        f6015o = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6023h == null) {
            this.f6023h = new ThinWormAnimation(this.f6021f);
            int i5 = f6015o + 87;
            f6014l = i5 % 128;
            int i6 = i5 % 2;
        }
        return this.f6023h;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation j() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6014l
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6015o = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2d
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation r1 = r4.f6024i
            r0 = 84
            int r0 = r0 / 0
            if (r1 != 0) goto L1f
        L16:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation r1 = new com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController$UpdateListener r0 = r4.f6021f
            r1.<init>(r0)
            r4.f6024i = r1
        L1f:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation r2 = r4.f6024i
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6015o
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.f6014l = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L32
            return r2
        L2d:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation r0 = r4.f6024i
            if (r0 != 0) goto L1f
            goto L16
        L32:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.j():com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation");
    }

    public final SwapAnimation g() {
        int i2 = 2 % 2;
        int i3 = f6015o + 79;
        f6014l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6022g == null) {
            this.f6022g = new SwapAnimation(this.f6021f);
        }
        SwapAnimation swapAnimation = this.f6022g;
        int i5 = f6014l + 17;
        f6015o = i5 % 128;
        int i6 = i5 % 2;
        return swapAnimation;
    }

    public final ScaleDownAnimation h() {
        int i2 = 2 % 2;
        int i3 = f6015o + 3;
        f6014l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6025j == null) {
            this.f6025j = new ScaleDownAnimation(this.f6021f);
        }
        ScaleDownAnimation scaleDownAnimation = this.f6025j;
        int i5 = f6015o + 89;
        f6014l = i5 % 128;
        if (i5 % 2 == 0) {
            return scaleDownAnimation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
