package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    static float addEnd(float f2, float f3, int i2) {
        return f2 + (Math.max(0, i2 - 1) * f3);
    }

    static float addStart(float f2, float f3, int i2) {
        return i2 > 0 ? f2 + (f3 / 2.0f) : f2;
    }

    static KeylineState createCenterAlignedKeylineState(Context context, float f2, float f3, Arrangement arrangement) {
        float fMin = Math.min(getExtraSmallSize(context) + f2, arrangement.largeSize);
        float f4 = fMin / 2.0f;
        float f5 = 0.0f - f4;
        float fAddStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float fUpdateCurPosition = updateCurPosition(0.0f, addEnd(fAddStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float fAddStart2 = addStart(fUpdateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float fUpdateCurPosition2 = updateCurPosition(fUpdateCurPosition, addEnd(fAddStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart3 = addStart(fUpdateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float fUpdateCurPosition3 = updateCurPosition(fUpdateCurPosition2, addEnd(fAddStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float fAddStart4 = addStart(fUpdateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart5 = addStart(updateCurPosition(fUpdateCurPosition3, addEnd(fAddStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f6 = f4 + f3;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.largeSize, f2);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f2);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f2);
        KeylineState.Builder builderAddAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, f3).addAnchorKeyline(f5, childMaskPercentage, fMin);
        if (arrangement.smallCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f));
        }
        if (arrangement.mediumCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f));
        }
        builderAddAnchorKeyline.addKeylineRange(fAddStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f));
        }
        if (arrangement.smallCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(arrangement.smallCount / 2.0f));
        }
        builderAddAnchorKeyline.addAnchorKeyline(f6, childMaskPercentage, fMin);
        return builderAddAnchorKeyline.build();
    }

    static KeylineState createKeylineState(Context context, float f2, float f3, Arrangement arrangement, int i2) {
        return i2 == 1 ? createCenterAlignedKeylineState(context, f2, f3, arrangement) : createLeftAlignedKeylineState(context, f2, f3, arrangement);
    }

    static KeylineState createLeftAlignedKeylineState(Context context, float f2, float f3, Arrangement arrangement) {
        float fMin = Math.min(getExtraSmallSize(context) + f2, arrangement.largeSize);
        float f4 = fMin / 2.0f;
        float f5 = 0.0f - f4;
        float fAddStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float fUpdateCurPosition = updateCurPosition(0.0f, addEnd(fAddStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float fAddStart2 = addStart(fUpdateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart3 = addStart(updateCurPosition(fUpdateCurPosition, fAddStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f6 = f4 + f3;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.largeSize, f2);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f2);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f2);
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(arrangement.largeSize, f3).addAnchorKeyline(f5, childMaskPercentage, fMin).addKeylineRange(fAddStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            builderAddKeylineRange.addKeyline(fAddStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        if (arrangement.smallCount > 0) {
            builderAddKeylineRange.addKeylineRange(fAddStart3, childMaskPercentage2, arrangement.smallSize, arrangement.smallCount);
        }
        builderAddKeylineRange.addAnchorKeyline(f6, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    static float getExtraSmallSize(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1607wl.Xd() ^ 32220))).getMethod(Xg.qd("zy\nh|\f\t\u0010\u000e\u007f\u0003\u0012", (short) (ZN.Xd() ^ 15644), (short) (ZN.Xd() ^ 8658)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimension(R.dimen.m3_carousel_gone_size);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static float getSmallSizeMax(Context context) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("!\\\u007f;u\u001eVM@y'Zx/cJ\u001dv3g\u0016V\u007f", (short) (FB.Xd() ^ 21748), (short) (FB.Xd() ^ 12161)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 3293);
        short sXd2 = (short) (ZN.Xd() ^ 11955);
        int[] iArr = new int["y\rj\n\u0001\u000bA_3y\u001fq".length()];
        QB qb = new QB("y\rj\n\u0001\u000bA_3y\u001fq");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimension(R.dimen.m3_carousel_small_item_size_max);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static float getSmallSizeMin(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\rN5Ta-ure\u0006?v]\u0015\b8WeB[M\u0013&", (short) (C1580rY.Xd() ^ (-12416)), (short) (C1580rY.Xd() ^ (-30026)))).getMethod(Ig.wd("\u0010I\t\u0004u_5\tSy\u007fi", (short) (C1607wl.Xd() ^ 15245)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimension(R.dimen.m3_carousel_small_item_size_min);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static int maxValue(int[] iArr) {
        int i2 = Integer.MIN_VALUE;
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    static float updateCurPosition(float f2, float f3, float f4, int i2) {
        return i2 > 0 ? f3 + (f4 / 2.0f) : f2;
    }
}
