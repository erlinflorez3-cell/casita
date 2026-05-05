package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {R.attr.colorPrimaryVariant};

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        int[] iArr = R.styleable.ThemeEnforcement;
        Class<?> cls = Class.forName(C1561oA.yd("\u001a(\u001b*$\u001f\u0017a\u0014!\u001d$\u0012\u001c\u001fYk\u0019\u0015\u001c\n\u001e\u0017", (short) (OY.Xd() ^ 1526)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u000f\u001d\u0014#!\u001c\u0018b++!%g{010(\"66(\u0017*:", (short) (C1607wl.Xd() ^ 6951))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(Xg.qd("\u001e\u0012%\u0013\u001c\"\b*0$\u001e\u001e{010(\"66(7", (short) (ZN.Xd() ^ 21408), (short) (ZN.Xd() ^ 269)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean z2 = typedArray.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
            typedArray.recycle();
            if (z2) {
                TypedValue typedValue = new TypedValue();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("\u0003\u001b_>H\u000fX16\u0011\u001bo1G\u001a#EB\u0010!`DN", (short) (FB.Xd() ^ 24460), (short) (FB.Xd() ^ 1530))).getMethod(ZO.xd("S\u001f*\u0004iq&\u0017", (short) (Od.Xd() ^ (-14958)), (short) (Od.Xd() ^ (-31193))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (!((Resources.Theme) method2.invoke(context, objArr2)).resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                        checkMaterialTheme(context);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            checkAppCompatTheme(context);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void checkMaterialTheme(Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) throws Throwable {
        int[] iArr3 = R.styleable.ThemeEnforcement;
        Class<?> cls = Class.forName(C1626yg.Ud("v9\u001f5zYq}'d@1z;\"G^<[\u00057\u0012.", (short) (ZN.Xd() ^ 14553), (short) (ZN.Xd() ^ 22843)));
        Class<?>[] clsArr = {Class.forName(Ig.wd("lCIy\u001daBZz\bx$:Ev\u001b[F\u0016#\u000b2\u0010$\u001c", (short) (FB.Xd() ^ 20543))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr3, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(EO.Od("\u00158x\u000e\u0006?\u007f\u001aElg\u0001\bAe}10kR_3", (short) (C1633zX.Xd() ^ (-16067))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean zIsCustomTextAppearanceValid = false;
            if (!typedArray.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
                typedArray.recycle();
                return;
            }
            if (iArr2 != null && iArr2.length != 0) {
                zIsCustomTextAppearanceValid = isCustomTextAppearanceValid(context, attributeSet, iArr, i2, i3, iArr2);
            } else if (typedArray.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
                zIsCustomTextAppearanceValid = true;
            }
            typedArray.recycle();
            if (zIsCustomTextAppearanceValid) {
                return;
            }
            short sXd = (short) (ZN.Xd() ^ 7164);
            int[] iArr4 = new int["Pccl\u0018Zebdb`V^c\u000e_Q\\_RZLY\u0005XKCU\u007fXMR{NJ>;@<Ns4qG1;71k\u001f/A<\b65)$4\".\"#\\\u001d/.+!\u0019+)\u0019`Q\u0006 \u0013\u000f!\u0011J#\u0018\u001d\u0019E\u0006\u0014\u0013A\u0015\b\u0004\u000b\u0002;\u000f\t8\u0001\u0005}y\u0006{\u00060u\u0001|y+^qmtk3Qdvfrh_i?jgige[chf\u0012\u0019_a\u000eN\fOO\\KLTIEQV\n\u000e".length()];
            QB qb = new QB("Pccl\u0018Zebdb`V^c\u000e_Q\\_RZLY\u0005XKCU\u007fXMR{NJ>;@<Ns4qG1;71k\u001f/A<\b65)$4\".\"#\\\u001d/.+!\u0019+)\u0019`Q\u0006 \u0013\u000f!\u0011J#\u0018\u001d\u0019E\u0006\u0014\u0013A\u0015\b\u0004\u000b\u0002;\u000f\t8\u0001\u0005}y\u0006{\u00060u\u0001|y+^qmtk3Qdvfrh_i?jgige[chf\u0012\u0019_a\u000eN\fOO\\KLTIEQV\n\u000e");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr4[i4] = xuXd.fK(sXd + sXd + sXd + i4 + xuXd.CK(iKK));
                i4++;
            }
            throw new IllegalArgumentException(new String(iArr4, 0, i4));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void checkTheme(Context context, int[] iArr, String str) {
        if (!isTheme(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static boolean isAppCompatTheme(Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) throws Throwable {
        Class<?> cls = Class.forName(C1593ug.zd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1580rY.Xd() ^ (-3315)), (short) (C1580rY.Xd() ^ (-15026))));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("*6+84-'o64(*j|/.+!\u0019+)\u0019\u0006\u0017%", (short) (C1499aX.Xd() ^ (-19608)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        short sXd = (short) (C1580rY.Xd() ^ (-58));
        int[] iArr3 = new int["\u000f\u0003\u0016\u0004\r\u0013x\u001b!\u0015\u000f\u000fl!\"!\u0019\u0013''\u0019(".length()];
        QB qb = new QB("\u000f\u0003\u0016\u0004\r\u0013x\u001b!\u0015\u000f\u000fl!\"!\u0019\u0013''\u0019(");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr3[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            for (int i5 : iArr2) {
                if (typedArray.getResourceId(i5, -1) == -1) {
                    typedArray.recycle();
                    return false;
                }
            }
            typedArray.recycle();
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isMaterial3Theme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(Context context, int[] iArr) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 10807);
        short sXd2 = (short) (ZN.Xd() ^ 27848);
        int[] iArr2 = new int["p`I;\u000bdR\u007fH6%}RN4\u0001x\u0018yO3*9".length()];
        QB qb = new QB("p`I;\u000bdR\u007fH6%}RN4\u0001x\u0018yO3*9");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {iArr};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1561oA.Xd("SGZHQW=_eYSS1efe]Wkk]l", (short) (C1499aX.Xd() ^ (-24776))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (!typedArray.hasValue(i3)) {
                    typedArray.recycle();
                    return false;
                }
            }
            typedArray.recycle();
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i2, i3);
        checkTextAppearance(context, attributeSet, iArr, i2, i3, iArr2);
        Class<?> cls = Class.forName(Wg.vd("0>5DB=9\u0004:GGN@JQ\f\"OOVH\\Y", (short) (C1607wl.Xd() ^ 11109)));
        Class<?>[] clsArr = {Class.forName(Qg.kd("w\u0004x\u0006\u0002zt=\u0004\u0002uw8J|{xnfxvfSdr", (short) (ZN.Xd() ^ 889), (short) (ZN.Xd() ^ 12039))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(hg.Vd("\tz\fw~\u0003f\u0007\u000b|trN\u0001\u007f|rj|zjw", (short) (C1499aX.Xd() ^ (-19264)), (short) (C1499aX.Xd() ^ (-24770))), clsArr);
        try {
            method.setAccessible(true);
            return (TypedArray) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static TintTypedArray obtainTintedStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) throws Throwable {
        checkCompatibleTheme(context, attributeSet, i2, i3);
        checkTextAppearance(context, attributeSet, iArr, i2, i3, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i2, i3);
    }
}
