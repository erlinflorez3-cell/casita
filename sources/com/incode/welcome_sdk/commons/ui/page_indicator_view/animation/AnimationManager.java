package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.AnimationController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.data.local.db.c.a.ae;

/* JADX INFO: loaded from: classes5.dex */
public class AnimationManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6000d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6001e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationController f6002c;

    public AnimationManager(Indicator indicator, ValueController.UpdateListener updateListener) {
        this.f6002c = new AnimationController(indicator, updateListener);
    }

    public final void d() {
        int i2 = 2 % 2;
        int i3 = f6001e + 5;
        int i4 = i3 % 128;
        f6000d = i4;
        int i5 = i3 % 2;
        AnimationController animationController = this.f6002c;
        if (animationController != null) {
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f6001e = i6 % 128;
            if (i6 % 2 != 0) {
                int iA = ae.AnonymousClass8.a();
                AnimationController.e(ae.AnonymousClass8.a(), 957113915, iA, new Object[]{animationController}, ae.AnonymousClass8.a(), -957113915, ae.AnonymousClass8.a());
                this.f6002c.b();
                int i7 = 85 / 0;
            } else {
                int iA2 = ae.AnonymousClass8.a();
                AnimationController.e(ae.AnonymousClass8.a(), 957113915, iA2, new Object[]{animationController}, ae.AnonymousClass8.a(), -957113915, ae.AnonymousClass8.a());
                this.f6002c.b();
            }
        }
        int i8 = f6000d + 57;
        f6001e = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(float f2) {
        int i2 = 2 % 2;
        int i3 = f6000d + 79;
        int i4 = i3 % 128;
        f6001e = i4;
        int i5 = i3 % 2;
        AnimationController animationController = this.f6002c;
        if (animationController != null) {
            int i6 = i4 + 21;
            f6000d = i6 % 128;
            if (i6 % 2 == 0) {
                animationController.b(f2);
                int i7 = 59 / 0;
            } else {
                animationController.b(f2);
            }
        }
        int i8 = f6001e + 63;
        f6000d = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e() {
        int i2 = 2 % 2;
        AnimationController animationController = this.f6002c;
        if (animationController != null) {
            int i3 = f6000d + 25;
            f6001e = i3 % 128;
            int i4 = i3 % 2;
            int iA = ae.AnonymousClass8.a();
            AnimationController.e(ae.AnonymousClass8.a(), 957113915, iA, new Object[]{animationController}, ae.AnonymousClass8.a(), -957113915, ae.AnonymousClass8.a());
            int i5 = f6000d + 35;
            f6001e = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f6000d + 111;
        f6001e = i7 % 128;
        int i8 = i7 % 2;
    }
}
