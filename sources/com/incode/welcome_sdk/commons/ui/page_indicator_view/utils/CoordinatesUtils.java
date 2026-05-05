package com.incode.welcome_sdk.commons.ui.page_indicator_view.utils;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class CoordinatesUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6255a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6256c = 1;

    public static int b(Indicator indicator, int i2) {
        int i3 = 2 % 2;
        int i4 = f6256c;
        int i5 = i4 + 1;
        f6255a = i5 % 128;
        int i6 = i5 % 2;
        if (indicator != null) {
            if (indicator.w() == Orientation.HORIZONTAL) {
                return c(indicator, i2);
            }
            return e(indicator, i2);
        }
        int i7 = i4 + 7;
        f6255a = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public static int c(Indicator indicator, int i2) {
        int iE;
        int i3 = 2 % 2;
        if (indicator == null) {
            int i4 = f6255a + 31;
            f6256c = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        if (indicator.w() == Orientation.HORIZONTAL) {
            iE = d(indicator, i2);
            int i6 = f6256c + 103;
            f6255a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iE = e(indicator);
        }
        return iE + indicator.d();
    }

    public static int e(Indicator indicator, int i2) {
        int iD;
        int i3;
        int i4 = 2 % 2;
        int i5 = f6256c + 117;
        int i6 = i5 % 128;
        f6255a = i6;
        int i7 = i5 % 2;
        if (indicator == null) {
            int i8 = i6 + 111;
            f6256c = i8 % 128;
            return i8 % 2 == 0 ? 1 : 0;
        }
        if (indicator.w() == Orientation.HORIZONTAL) {
            iD = e(indicator);
            i3 = f6256c + 73;
            f6255a = i3 % 128;
        } else {
            iD = d(indicator, i2);
            i3 = f6255a + 97;
            f6256c = i3 % 128;
        }
        int i9 = i3 % 2;
        return iD + ((Integer) Indicator.d(-1188935359, w.c(), w.c(), new Object[]{indicator}, 1188935361, w.c(), w.c())).intValue();
    }

    public static int a(Indicator indicator, float f2, float f3) {
        int i2 = 2 % 2;
        if (indicator == null) {
            return -1;
        }
        if (indicator.w() == Orientation.HORIZONTAL) {
            int i3 = f6256c + 85;
            f6255a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 38 / 0;
            }
        } else {
            f3 = f2;
            f2 = f3;
        }
        int iD = d(indicator, f2, f3);
        int i5 = f6256c + 105;
        f6255a = i5 % 128;
        if (i5 % 2 == 0) {
            return iD;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r15, float r16, float r17) {
        /*
            r14 = 2
            int r0 = r14 % r14
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r0
            int r1 = r1 % r14
            int r2 = r15.r()
            java.lang.Object[] r6 = new java.lang.Object[]{r15}
            int r4 = com.incode.welcome_sdk.commons.utils.w.c()
            int r9 = com.incode.welcome_sdk.commons.utils.w.c()
            int r5 = com.incode.welcome_sdk.commons.utils.w.c()
            int r8 = com.incode.welcome_sdk.commons.utils.w.c()
            r7 = -1089547635(0xffffffffbf0ed28d, float:-0.55790025)
            r3 = 1089547635(0x40f12d73, float:7.536798)
            java.lang.Object r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.d(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = r0.intValue()
            int r12 = r15.j()
            int r11 = r15.a()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation r1 = r15.w()
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation.HORIZONTAL
            if (r1 != r0) goto Lbc
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r0
            int r1 = r1 % r14
            int r5 = r15.b()
        L51:
            r10 = 0
            r4 = r10
            r6 = r4
        L54:
            if (r4 >= r2) goto Lc4
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r0 = r0 + 99
            int r7 = r0 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r7
            int r0 = r0 % r14
            if (r0 != 0) goto Lb6
            r0 = 40
            int r0 = r0 / r10
            if (r4 <= 0) goto Lb9
        L66:
            r1 = r11
        L67:
            r9 = 1
            int r3 = r13 << 1
            int r0 = r12 / 2
            int r3 = r3 + r0
            int r3 = r3 + r1
            int r3 = r3 + r6
            float r0 = (float) r6
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            r8 = 0
            if (r0 < 0) goto Lb4
            int r1 = r7 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r14
            if (r1 != 0) goto Lc3
            float r0 = (float) r3
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb4
            r6 = r9
        L84:
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb2
            int r1 = r7 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r14
            if (r1 != 0) goto Lc2
            float r0 = (float) r5
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb2
        L97:
            if (r6 == 0) goto La5
            int r1 = r7 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r14
            if (r1 != 0) goto Lc1
            if (r9 == 0) goto La5
            return r4
        La5:
            int r4 = r4 + 1
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r0
            int r1 = r1 % r14
            r6 = r3
            goto L54
        Lb2:
            r9 = r10
            goto L97
        Lb4:
            r6 = r10
            goto L84
        Lb6:
            if (r4 <= 0) goto Lb9
            goto L66
        Lb9:
            int r1 = r11 / 2
            goto L67
        Lbc:
            int r5 = r15.c()
            goto L51
        Lc1:
            throw r8
        Lc2:
            throw r8
        Lc3:
            throw r8
        Lc4:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.d(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator, float, float):int");
    }

    private static int d(Indicator indicator, int i2) {
        int i3 = 2 % 2;
        int iR = indicator.r();
        int iIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{indicator}, -1089547635, w.c(), w.c())).intValue();
        int iJ = indicator.j();
        int iA = indicator.a();
        int i4 = 0;
        for (int i5 = 0; i5 < iR; i5++) {
            int i6 = iJ / 2;
            int i7 = i4 + iIntValue + i6;
            if (i2 == i5) {
                return i7;
            }
            i4 = i7 + iIntValue + iA + i6;
        }
        if (indicator.v() != AnimationType.DROP) {
            return i4;
        }
        int i8 = f6255a;
        int i9 = i8 + 71;
        f6256c = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i4 + (iIntValue << 1);
        int i12 = i8 + 89;
        f6256c = i12 % 128;
        int i13 = i12 % 2;
        return i11;
    }

    private static int e(Indicator indicator) {
        int i2 = 2 % 2;
        int i3 = f6256c + 91;
        f6255a = i3 % 128;
        int i4 = i3 % 2;
        int iC = w.c();
        int iC2 = w.c();
        int iIntValue = ((Integer) Indicator.d(1089547635, iC, w.c(), new Object[]{indicator}, -1089547635, w.c(), iC2)).intValue();
        if (indicator.v() != AnimationType.DROP) {
            return iIntValue;
        }
        int i5 = f6255a + 5;
        f6256c = i5 % 128;
        int i6 = i5 % 2;
        return iIntValue * 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Float> d(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r7, int r8, float r9, boolean r10) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r5 = r7.r()
            int r4 = r7.q()
            if (r10 == 0) goto L21
            int r2 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c
            int r1 = r2 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L8d
            int r8 = r5 - r8
        L1a:
            int r1 = r2 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r6
        L21:
            r3 = 0
            r2 = 1
            if (r8 >= 0) goto L88
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r0
            int r1 = r1 % r6
            r8 = r3
        L2f:
            if (r8 <= r4) goto L86
            r1 = r2
        L32:
            if (r10 != 0) goto L81
            int r0 = r8 + 1
            if (r0 >= r4) goto L39
        L38:
            r3 = r2
        L39:
            if (r1 != 0) goto L73
            if (r3 == r2) goto L73
        L3d:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r4 != r8) goto L70
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a = r0
            int r1 = r1 % r6
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L70
            if (r10 == 0) goto L6d
            int r8 = r8 + (-1)
        L53:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L65
        L57:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        L65:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6b
            r3 = r2
            goto L57
        L6b:
            r3 = r9
            goto L57
        L6d:
            int r8 = r8 + 1
            goto L53
        L70:
            float r9 = r3 - r9
            goto L53
        L73:
            r7.setSelectedPosition(r8)
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6255a
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.f6256c = r0
            int r1 = r1 % r6
            r4 = r8
            goto L3d
        L81:
            int r0 = r8 + (-1)
            if (r0 >= r4) goto L39
            goto L38
        L86:
            r1 = r3
            goto L32
        L88:
            int r5 = r5 - r2
            if (r8 <= r5) goto L2f
            r8 = r5
            goto L2f
        L8d:
            int r0 = r5 + (-1)
            int r0 = r0 - r8
            r8 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils.d(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator, int, float, boolean):android.util.Pair");
    }
}
