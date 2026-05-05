package com.incode.welcome_sdk.commons.ui.page_indicator_view;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.AnimationManager;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.DrawManager;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;

/* JADX INFO: loaded from: classes5.dex */
public class IndicatorManager implements ValueController.UpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5982b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5983d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f5984a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DrawManager f5986e = new DrawManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationManager f5985c = new AnimationManager(this.f5986e.d(), this);

    interface a {
        void onIndicatorUpdated();
    }

    IndicatorManager(a aVar) {
        this.f5984a = aVar;
    }

    public final AnimationManager d() {
        int i2 = 2 % 2;
        int i3 = f5983d + 111;
        int i4 = i3 % 128;
        f5982b = i4;
        int i5 = i3 % 2;
        AnimationManager animationManager = this.f5985c;
        int i6 = i4 + 15;
        f5983d = i6 % 128;
        if (i6 % 2 != 0) {
            return animationManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Indicator e() {
        Indicator indicatorD;
        int i2 = 2 % 2;
        int i3 = f5982b + 9;
        f5983d = i3 % 128;
        if (i3 % 2 == 0) {
            indicatorD = this.f5986e.d();
            int i4 = 65 / 0;
        } else {
            indicatorD = this.f5986e.d();
        }
        int i5 = f5983d + 121;
        f5982b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return indicatorD;
    }

    public final DrawManager b() {
        int i2 = 2 % 2;
        int i3 = f5982b;
        int i4 = i3 + 15;
        f5983d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        DrawManager drawManager = this.f5986e;
        int i5 = i3 + 35;
        f5983d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return drawManager;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController.UpdateListener
    public final void a(Value value) {
        int i2 = 2 % 2;
        int i3 = f5982b + 125;
        f5983d = i3 % 128;
        int i4 = i3 % 2;
        this.f5986e.c(value);
        a aVar = this.f5984a;
        if (aVar != null) {
            aVar.onIndicatorUpdated();
        }
        int i5 = f5983d + 73;
        f5982b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
