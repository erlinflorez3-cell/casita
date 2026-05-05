package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, 0), attributeSet, i2);
        initialize(attributeSet, i2, 0);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        initialize(attributeSet, i2, i3);
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int i2) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, com.google.android.material.R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight, com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void initialize(AttributeSet attributeSet, int i2, int i3) throws Throwable {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("|\u000b\u0002\u0011\u000f\n\u0006P\u0007\u0014\u0014\u001b\r\u0017\u001eXn\u001c\u001c#\u0015)&", (short) (C1607wl.Xd() ^ 24296))).getMethod(Wg.Zd("wWAza1\u0013m", (short) (OY.Xd() ^ 7468), (short) (OY.Xd() ^ 2127)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources.Theme theme = (Resources.Theme) method.invoke(context, objArr);
                if (viewAttrsHasLineHeight(context, theme, attributeSet, i2, i3) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i2, i3)) == -1) {
                    return;
                }
                applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static int readFirstAvailableDimension(Context context, TypedArray typedArray, int... iArr) throws Throwable {
        int dimensionPixelSize = -1;
        for (int i2 = 0; i2 < iArr.length && dimensionPixelSize < 0; i2++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i2], -1);
        }
        return dimensionPixelSize;
    }

    private static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i2, i3);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextView_android_lineHeight, com.google.android.material.R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i2) throws Throwable {
        super.setTextAppearance(context, i2);
        if (canApplyTextAppearanceLineHeight(context)) {
            short sXd = (short) (ZN.Xd() ^ 1272);
            int[] iArr = new int["^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b".length()];
            QB qb = new QB("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.vd("# 2\u0011($/&", (short) (Od.Xd() ^ (-19805))), new Class[0]);
            try {
                method.setAccessible(true);
                applyLineHeightFromViewAppearance((Resources.Theme) method.invoke(context, objArr), i2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
