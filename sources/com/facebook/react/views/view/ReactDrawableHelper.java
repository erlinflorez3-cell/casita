package com.facebook.react.views.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.PixelUtil;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactDrawableHelper {
    private static final TypedValue sResolveOutValue = new TypedValue();

    public static Drawable createDrawableFromJSDescription(Context context, ReadableMap readableMap) throws Throwable {
        String string = readableMap.getString(C1561oA.Xd("TZRH", (short) (FB.Xd() ^ 14492)));
        short sXd = (short) (C1499aX.Xd() ^ (-3940));
        int[] iArr = new int["\u0012%!(\u001fy,+(u\"\u0017$ \u0019\u0013".length()];
        QB qb = new QB("\u0012%!(\u001fy,+(u\"\u0017$ \u0019\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        if (!new String(iArr, 0, i2).equals(string)) {
            short sXd2 = (short) (FB.Xd() ^ 25697);
            short sXd3 = (short) (FB.Xd() ^ 10292);
            int[] iArr2 = new int[";XYwm-\u0003N>R)!6".length()];
            QB qb2 = new QB(";XYwm-\u0003N>R)!6");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            if (new String(iArr2, 0, i3).equals(string)) {
                return setRadius(readableMap, getRippleDrawable(context, readableMap));
            }
            throw new JSApplicationIllegalArgumentException(ZO.xd("C7NV<\u0007i\u0003~$zKR\u001d\bT0,0$\u0019n\u001eV\u000eY\b)\u0018e<\u001fK;:", (short) (FB.Xd() ^ 13171), (short) (FB.Xd() ^ 25559)) + string);
        }
        short sXd4 = (short) (FB.Xd() ^ 21616);
        short sXd5 = (short) (FB.Xd() ^ 31308);
        int[] iArr3 = new int["Qcb_UM_]M".length()];
        QB qb3 = new QB("Qcb_UM_]M");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
            i4++;
        }
        String string2 = readableMap.getString(new String(iArr3, 0, i4));
        int attrId = getAttrId(context, string2);
        short sXd6 = (short) (C1633zX.Xd() ^ (-2665));
        short sXd7 = (short) (C1633zX.Xd() ^ (-2872));
        int[] iArr4 = new int["DPERNGA\n>IGL<DI\u0002\u0016A?D4FA".length()];
        QB qb4 = new QB("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4) + sXd7);
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr4, 0, i5));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd8 = (short) (Od.Xd() ^ (-3468));
        int[] iArr5 = new int["xu\u0004buqxo".length()];
        QB qb5 = new QB("xu\u0004buqxo");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(sXd8 + i6 + xuXd5.CK(iKK5));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr5, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            if (((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(attrId, sResolveOutValue, true)) {
                return setRadius(readableMap, getDefaultThemeDrawable(context));
            }
            throw new JSApplicationIllegalArgumentException(C1561oA.yd("\u0016JKJB<PP2m", (short) (C1580rY.Xd() ^ (-26951))) + string2 + C1561oA.Yd("\u0005]P\\Q\nTP\r", (short) (C1580rY.Xd() ^ (-23676))) + attrId + Xg.qd("#gt{slw1\u007f,os/\u0003v\u0006\u0003\u0001\f{{8\u0003\t\u0010\f=\u007f?\u0005\u0014\u0004\u001b\u0006\b\u0013\r", (short) (ZN.Xd() ^ 32288), (short) (ZN.Xd() ^ 5774)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int getAttrId(Context context, String str) throws Throwable {
        SoftAssertions.assertNotNull(str);
        if (C1626yg.Ud("I\u0018AD\u0004\r*\u0003\u0014z1G\u0018\u0010, Cl\u001e\u0002uQ')", (short) (Od.Xd() ^ (-3566)), (short) (Od.Xd() ^ (-8599))).equals(str)) {
            return R.attr.selectableItemBackground;
        }
        if (Ig.wd("y;Th\u0018d!\u001aMuW%K]\u000eR(\u001eaP\u0017h{md\"F\u0004\u000bi3\u0012\be", (short) (C1633zX.Xd() ^ (-17649))).equals(str)) {
            return R.attr.selectableItemBackgroundBorderless;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("{_e\u0012\u00197\u001cH4be\u0004`_y\ro\n`.V1\u000f", (short) (C1580rY.Xd() ^ (-20389)))).getMethod(C1561oA.Qd("RO]:LYTYUEFS", (short) (Od.Xd() ^ (-412))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getIdentifier(str, C1593ug.zd("fz{z", (short) (FB.Xd() ^ 27496), (short) (FB.Xd() ^ 3307)), C1561oA.od("\u0011\u001d\u0012\u001f\u001b\u0014\u000e", (short) (ZN.Xd() ^ 28532)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int getColor(Context context, ReadableMap readableMap) throws Throwable {
        String strKd = C1561oA.Kd("?LJNR", (short) (OY.Xd() ^ 31726));
        if (readableMap.hasKey(strKd) && !readableMap.isNull(strKd)) {
            return readableMap.getInt(strKd);
        }
        short sXd = (short) (C1633zX.Xd() ^ (-27789));
        short sXd2 = (short) (C1633zX.Xd() ^ (-11980));
        int[] iArr = new int["\u0018\"aY`$\t\\[AJ:t\bwz\u001a hXS0\u0016".length()];
        QB qb = new QB("\u0018\"aY`$\t\\[AJ:t\bwz\u001a hXS0\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Xd(" \u001f/\u0010%#,%", (short) (C1499aX.Xd() ^ (-14214))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources.Theme theme = (Resources.Theme) method.invoke(context, objArr);
            TypedValue typedValue = sResolveOutValue;
            if (!theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                throw new JSApplicationIllegalArgumentException(hg.Vd("j\u001d\u001c\u0019\u000f\u0007\u0019\u0017\u0007@\u0003\u000e\n\f\u000e]\t\u0007\f\t\u0005\u0001[{xx{wtt\u007f*lw|rir*v!bd\u001eoanien\\Z\u0015]af`\u0010P\u000eQ^LaJJSK", (short) (C1607wl.Xd() ^ 7314), (short) (C1607wl.Xd() ^ 17816)));
            }
            Class<?> cls = Class.forName(Wg.vd("#1(750,v\u001d**1#-4nt\"\")\u001b/,", (short) (C1633zX.Xd() ^ (-24436))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (OY.Xd() ^ 2440);
            short sXd4 = (short) (OY.Xd() ^ 24505);
            int[] iArr2 = new int["\u0006\u0003\u0011m\u007f\r\b\r\txy\u0007".length()];
            QB qb2 = new QB("\u0006\u0003\u0011m\u007f\r\b\r\txy\u0007");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                return ((Resources) method2.invoke(context, objArr2)).getColor(typedValue.resourceId);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Drawable getDefaultThemeDrawable(Context context) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 19235);
        int[] iArr = new int["!-\"/+$\u001ef\u001b&$)\u0019!&^r\u001e\u001c!\u0011#\u001e".length()];
        QB qb = new QB("!-\"/+$\u001ef\u001b&$)\u0019!&^r\u001e\u001c!\u0011#\u001e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1607wl.Xd() ^ 5413);
        int[] iArr2 = new int["tq\u007f\\n{v{wghu".length()];
        QB qb2 = new QB("tq\u007f\\n{v{wghu");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i4 = sResolveOutValue.resourceId;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Yd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (C1499aX.Xd() ^ (-6209)))).getMethod(Xg.qd("FEU6KIRK", (short) (C1499aX.Xd() ^ (-5737)), (short) (C1499aX.Xd() ^ (-24223))), new Class[0]);
            try {
                method2.setAccessible(true);
                return resources.getDrawable(i4, (Resources.Theme) method2.invoke(context, objArr2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Drawable getMask(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }

    private static RippleDrawable getRippleDrawable(Context context, ReadableMap readableMap) throws Throwable {
        int color = getColor(context, readableMap);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, getMask(readableMap));
    }

    private static Drawable setRadius(ReadableMap readableMap, Drawable drawable) {
        if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) PixelUtil.toPixelFromDIP(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
