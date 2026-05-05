package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors = new int[0];
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    protected BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-29040));
        int[] iArr = new int["[g\\ie^X!U`^cS[`\u0019-XV[K]X".length()];
        QB qb = new QB("[g\\ie^X!U`^cS[`\u0019-XV[K]X");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.yd("DAO,>KFKG78E", (short) (OY.Xd() ^ 18135)), new Class[0]);
        try {
            method.setAccessible(true);
            int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
            TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.BaseProgressIndicator, i2, i3, new int[0]);
            this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
            this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
            this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
            this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
            this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
            loadIndicatorColors(context, typedArrayObtainStyledAttributes);
            loadTrackColor(context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void loadIndicatorColors(Context context, TypedArray typedArray) throws Throwable {
        if (!typedArray.hasValue(R.styleable.BaseProgressIndicator_indicatorColor)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(R.styleable.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1607wl.Xd() ^ 9773))).getMethod(Xg.qd("\u0011\u0010 ~\u0013\"\u001f&$\u0016\u0019(", (short) (Od.Xd() ^ (-7012)), (short) (Od.Xd() ^ (-21030))), new Class[0]);
        try {
            method.setAccessible(true);
            int[] intArray = ((Resources) method.invoke(context, objArr)).getIntArray(typedArray.getResourceId(R.styleable.BaseProgressIndicator_indicatorColor, -1));
            this.indicatorColors = intArray;
            if (intArray.length != 0) {
                return;
            }
            short sXd = (short) (C1633zX.Xd() ^ (-1414));
            short sXd2 = (short) (C1633zX.Xd() ^ (-29172));
            int[] iArr = new int["_O9\u0010~NY'\u001eXZG$\u0018n\u000b%\u0013\u0012cX/Oc^\u000b%\u0017ncBX\u0007gZ4Wqk3,\u0019nsC0UrI<53rPk\u000b\u007fwvB\u0015xK\u007f".length()];
            QB qb = new QB("_O9\u0010~NY'\u001eXZG$\u0018n\u000b%\u0013\u0012cX/Oc^\u000b%\u0017ncBX\u0007gZ4Wqk3,\u0019nsC0UrI<53rPk\u000b\u007fwvB\u0015xK\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void loadTrackColor(Context context, TypedArray typedArray) throws Throwable {
        if (typedArray.hasValue(R.styleable.BaseProgressIndicator_trackColor)) {
            this.trackColor = typedArray.getColor(R.styleable.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        short sXd = (short) (Od.Xd() ^ (-11585));
        short sXd2 = (short) (Od.Xd() ^ (-3546));
        int[] iArr = new int["ZYE2C0mDh\u0015z\u001d\u00025}`j-#\u0017\u0010\u0001w".length()];
        QB qb = new QB("ZYE2C0mDh\u0015z\u001d\u00025}`j-#\u0017\u0010\u0001w");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("[7o\u0010Uw_\u0016", (short) (C1633zX.Xd() ^ (-9266)), (short) (C1633zX.Xd() ^ (-31132))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f2 * 255.0f));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    void validateSpec() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
