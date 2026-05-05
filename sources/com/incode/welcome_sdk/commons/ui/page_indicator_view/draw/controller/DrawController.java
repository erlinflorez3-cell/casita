package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.Drawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils;

/* JADX INFO: loaded from: classes5.dex */
public class DrawController {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6151e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f6152h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Indicator f6153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawer f6154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Value f6155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ClickListener f6156d;

    public interface ClickListener {
    }

    public DrawController(Indicator indicator) {
        this.f6153a = indicator;
        this.f6154b = new Drawer(indicator);
    }

    public final void e(Value value) {
        int i2 = 2 % 2;
        int i3 = f6152h;
        int i4 = i3 + 15;
        f6151e = i4 % 128;
        if (i4 % 2 != 0) {
            this.f6155c = value;
            int i5 = 94 / 0;
        } else {
            this.f6155c = value;
        }
        int i6 = i3 + 49;
        f6151e = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setClickListener(ClickListener clickListener) {
        int i2 = 2 % 2;
        int i3 = f6152h + 51;
        int i4 = i3 % 128;
        f6151e = i4;
        if (i3 % 2 == 0) {
            this.f6156d = clickListener;
            int i5 = i4 + 89;
            f6152h = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.f6156d = clickListener;
        throw null;
    }

    public final void e(MotionEvent motionEvent) {
        int i2 = 2 % 2;
        if (motionEvent == null) {
            int i3 = f6152h + 15;
            f6151e = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (motionEvent.getAction() == 1) {
            e(motionEvent.getX(), motionEvent.getY());
        }
        int i4 = f6152h + 63;
        f6151e = i4 % 128;
        int i5 = i4 % 2;
    }

    private void e(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = f6151e + 17;
        f6152h = i3 % 128;
        int i4 = i3 % 2;
        if (this.f6156d == null || CoordinatesUtils.a(this.f6153a, f2, f3) < 0) {
            return;
        }
        int i5 = f6152h + 81;
        f6151e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 4;
        }
    }

    public final void a(Canvas canvas) {
        int i2 = 2 % 2;
        int iR = this.f6153a.r();
        for (int i3 = 0; i3 < iR; i3++) {
            int i4 = f6152h + 85;
            f6151e = i4 % 128;
            int i5 = i4 % 2;
            d(canvas, i3, CoordinatesUtils.c(this.f6153a, i3), CoordinatesUtils.e(this.f6153a, i3));
        }
        int i6 = f6152h + 101;
        f6151e = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r2 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.graphics.Canvas r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6151e
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6152h = r0
            int r1 = r1 % r9
            r8 = 0
            if (r1 == 0) goto L7f
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            boolean r3 = r0.l()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            int r7 = r0.q()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            int r5 = r0.x()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            int r2 = r0.u()
            r6 = 1
            r4 = 0
            if (r3 != 0) goto L7b
            if (r12 == r7) goto L3a
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6151e
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6152h = r0
            int r1 = r1 % r9
            if (r1 == 0) goto L7e
            if (r12 != r2) goto L7b
        L3a:
            r2 = r6
        L3b:
            if (r3 == 0) goto L79
            int r3 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6152h
            int r1 = r3 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6151e = r0
            int r1 = r1 % r9
            if (r12 == r7) goto L53
            int r1 = r3 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6151e = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L7d
            if (r12 != r5) goto L79
        L53:
            r2 = r2 | r6
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.Drawer r0 = r10.f6154b
            r0.setup(r12, r13, r14)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value r0 = r10.f6155c
            if (r0 == 0) goto L6d
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6152h
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.f6151e = r0
            int r1 = r1 % r9
            if (r1 == 0) goto L73
            r0 = 27
            int r0 = r0 / r4
            if (r2 != 0) goto L75
        L6d:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.Drawer r0 = r10.f6154b
            r0.d(r11, r2)
            return
        L73:
            if (r2 == 0) goto L6d
        L75:
            r10.d(r11)
            return
        L79:
            r6 = r4
            goto L53
        L7b:
            r2 = r4
            goto L3b
        L7d:
            throw r8
        L7e:
            throw r8
        L7f:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            r0.l()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            r0.q()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            r0.x()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6153a
            r0.u()
            r8.hashCode()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.d(android.graphics.Canvas, int, int, int):void");
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f6157c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f6158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f6159e = 1;

        static {
            int[] iArr = new int[AnimationType.valuesCustom().length];
            f6158d = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6158d[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6158d[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6158d[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6158d[AnimationType.SLIDE.ordinal()] = 5;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6158d[AnimationType.FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6158d[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6158d[AnimationType.DROP.ordinal()] = 8;
                int i3 = f6157c + 25;
                f6159e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6158d[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6158d[AnimationType.SCALE_DOWN.ordinal()] = 10;
                int i6 = f6157c + 13;
                f6159e = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 36 / 0;
                }
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController.d(android.graphics.Canvas):void");
    }
}
