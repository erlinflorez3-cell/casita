package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.RtlMode;

/* JADX INFO: loaded from: classes5.dex */
public class AttributeController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6148a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6149b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Indicator f6150e;

    public AttributeController(Indicator indicator) {
        this.f6150e = indicator;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        int i3 = f6149b + 49;
        f6148a = i3 % 128;
        TypedArray typedArrayObtainStyledAttributes = i3 % 2 != 0 ? context.obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_PageIndicatorView, 0, 0) : context.obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_PageIndicatorView, 0, 0);
        b(typedArrayObtainStyledAttributes);
        c(typedArrayObtainStyledAttributes);
        a(typedArrayObtainStyledAttributes);
        e(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(TypedArray typedArray) {
        int i2 = 2 % 2;
        int resourceId = typedArray.getResourceId(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_viewPager, -1);
        boolean z2 = typedArray.getBoolean(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_autoVisibility, true);
        int i3 = 0;
        boolean z3 = typedArray.getBoolean(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_dynamicCount, false);
        int i4 = typedArray.getInt(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_count, -1);
        if (i4 == -1) {
            int i5 = f6148a + 1;
            f6149b = i5 % 128;
            int i6 = i5 % 2;
            i4 = 3;
        }
        int i7 = typedArray.getInt(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_select, 0);
        if (i7 >= 0) {
            if (i4 <= 0 || i7 <= i4 - 1) {
                i3 = i7;
            } else {
                int i8 = f6149b + 15;
                f6148a = i8 % 128;
                if (i8 % 2 != 0) {
                    i3 = i4 / 0;
                }
            }
        }
        this.f6150e.setViewPagerId(resourceId);
        this.f6150e.setAutoVisibility(z2);
        this.f6150e.setDynamicCount(z3);
        this.f6150e.setCount(i4);
        this.f6150e.setSelectedPosition(i3);
        this.f6150e.setSelectingPosition(i3);
        this.f6150e.setLastSelectedPosition(i3);
    }

    private void c(TypedArray typedArray) {
        int i2 = 2 % 2;
        int i3 = f6148a + 63;
        f6149b = i3 % 128;
        int i4 = i3 % 2;
        int color = typedArray.getColor(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_selectedColor, Color.parseColor("#ffffff"));
        this.f6150e.setUnselectedColor(color);
        this.f6150e.setSelectedColor(color2);
        int i5 = f6148a + 89;
        f6149b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092 A[PHI: r0 r8
  0x0092: PHI (r0v7 long) = (r0v6 long), (r0v29 long) binds: [B:10:0x008f, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:10:0x008f, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.res.TypedArray r11) {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.f6149b
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.f6148a = r0
            int r1 = r1 % r9
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L7e
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_interactiveAnimation
            r0 = 1
            boolean r8 = r11.getBoolean(r1, r0)
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_animationDuration
            r0 = 28401(0x6ef1, float:3.9798E-41)
            int r0 = r11.getInt(r1, r0)
            long r0 = (long) r0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L92
        L25:
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_animationType
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType.NONE
            int r0 = r0.ordinal()
            int r0 = r11.getInt(r1, r0)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType r7 = d(r0)
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_rtl_mode
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.RtlMode r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.RtlMode.Off
            int r0 = r0.ordinal()
            int r0 = r11.getInt(r1, r0)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.RtlMode r6 = c(r0)
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_fadeOnIdle
            boolean r5 = r11.getBoolean(r0, r2)
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_idleDuration
            r0 = 3000(0xbb8, float:4.204E-42)
            int r0 = r11.getInt(r1, r0)
            long r1 = (long) r0
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setAnimationDuration(r3)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setInteractiveAnimation(r8)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setAnimationType(r7)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setRtlMode(r6)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setFadeOnIdle(r5)
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r10.f6150e
            r0.setIdleDuration(r1)
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.f6149b
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.f6148a = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L94
            return
        L7e:
            int r0 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_interactiveAnimation
            boolean r8 = r11.getBoolean(r0, r2)
            int r1 = com.incode.welcome_sdk.R.styleable.onboard_sdk_PageIndicatorView_onboard_sdk_piv_animationDuration
            r0 = 350(0x15e, float:4.9E-43)
            int r0 = r11.getInt(r1, r0)
            long r0 = (long) r0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L92
            goto L25
        L92:
            r3 = r0
            goto L25
        L94:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.a(android.content.res.TypedArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[PHI: r1
  0x0063: PHI (r1v15 float) = (r1v9 float), (r1v10 float) binds: [B:14:0x0061, B:27:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(android.content.res.TypedArray r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController.e(android.content.res.TypedArray):void");
    }

    private static AnimationType d(int i2) {
        int i3 = 2 % 2;
        Object obj = null;
        switch (i2) {
            case 0:
                return AnimationType.NONE;
            case 1:
                return AnimationType.COLOR;
            case 2:
                return AnimationType.SCALE;
            case 3:
                AnimationType animationType = AnimationType.WORM;
                int i4 = f6149b + 89;
                f6148a = i4 % 128;
                if (i4 % 2 == 0) {
                    return animationType;
                }
                obj.hashCode();
                throw null;
            case 4:
                return AnimationType.SLIDE;
            case 5:
                return AnimationType.FILL;
            case 6:
                return AnimationType.THIN_WORM;
            case 7:
                AnimationType animationType2 = AnimationType.DROP;
                int i5 = f6149b + 117;
                f6148a = i5 % 128;
                if (i5 % 2 == 0) {
                    return animationType2;
                }
                throw null;
            case 8:
                return AnimationType.SWAP;
            case 9:
                return AnimationType.SCALE_DOWN;
            default:
                return AnimationType.NONE;
        }
    }

    private static RtlMode c(int i2) {
        int i3 = 2 % 2;
        int i4 = f6148a + 41;
        f6149b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i2 == 0) {
            return RtlMode.On;
        }
        if (i2 != 1) {
            return i2 != 2 ? RtlMode.Auto : RtlMode.Auto;
        }
        RtlMode rtlMode = RtlMode.Off;
        int i5 = f6148a + 31;
        f6149b = i5 % 128;
        int i6 = i5 % 2;
        return rtlMode;
    }
}
