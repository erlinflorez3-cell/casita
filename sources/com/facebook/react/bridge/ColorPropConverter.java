package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class ColorPropConverter {
    private static final String ATTR = "attr";
    private static final String ATTR_SEGMENT = "attr/";
    private static final String JSON_KEY = "resource_paths";
    private static final String PACKAGE_DELIMITER = ":";
    private static final String PATH_DELIMITER = "/";
    private static final String PREFIX_ATTR = "?";
    private static final String PREFIX_RESOURCE = "@";

    public static Integer getColor(Object obj, Context context) {
        Color colorInstance;
        try {
            if (supportWideGamut() && (colorInstance = getColorInstance(obj, context)) != null) {
                return Integer.valueOf(colorInstance.toArgb());
            }
        } catch (JSApplicationCausedNativeException e2) {
            FLog.w(ReactConstants.TAG, e2, "Error extracting color from WideGamut", new Object[0]);
        }
        return getColorInteger(obj, context);
    }

    public static Integer getColor(Object obj, Context context, int i2) {
        try {
            return getColor(obj, context);
        } catch (JSApplicationCausedNativeException e2) {
            FLog.w(ReactConstants.TAG, e2, "Error converting ColorValue", new Object[0]);
            return Integer.valueOf(i2);
        }
    }

    public static Color getColorInstance(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (supportWideGamut() && (obj instanceof Double)) {
            return Color.valueOf(((Double) obj).intValue());
        }
        if (context == null) {
            throw new RuntimeException("Context may not be null.");
        }
        if (!(obj instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) obj;
        if (supportWideGamut() && readableMap.hasKey("space")) {
            String string = readableMap.getString("space");
            return Color.valueOf(Color.pack((float) readableMap.getDouble("r"), (float) readableMap.getDouble("g"), (float) readableMap.getDouble("b"), (float) readableMap.getDouble("a"), ColorSpace.get((string == null || !string.equals("display-p3")) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        for (int i2 = 0; i2 < array.size(); i2++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i2));
            if (supportWideGamut() && numResolveResourcePath != null) {
                return Color.valueOf(numResolveResourcePath.intValue());
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private static Integer getColorInteger(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (context == null) {
            throw new RuntimeException("Context may not be null.");
        }
        if (!(obj instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) obj;
        if (readableMap.hasKey("space")) {
            return Integer.valueOf(Color.argb((int) (((float) readableMap.getDouble("a")) * 255.0f), (int) (((float) readableMap.getDouble("r")) * 255.0f), (int) (((float) readableMap.getDouble("g")) * 255.0f), (int) (((float) readableMap.getDouble("b")) * 255.0f)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        for (int i2 = 0; i2 < array.size(); i2++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i2));
            if (numResolveResourcePath != null) {
                return numResolveResourcePath;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private static int resolveResource(Context context, String str) throws Throwable {
        String[] strArrSplit = str.split(C1561oA.yd("a", (short) (C1607wl.Xd() ^ 19516)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (FB.Xd() ^ 13609))).getMethod(Xg.qd("0/?\u001c.1:187!5B;", (short) (OY.Xd() ^ 12947), (short) (OY.Xd() ^ 10762)), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
            }
            String[] strArrSplit2 = str.split(Jg.Wd("a", (short) (OY.Xd() ^ 18298), (short) (OY.Xd() ^ 16755)));
            String str3 = strArrSplit2[0];
            String str4 = strArrSplit2[1];
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(ZO.xd("e\u000fS1\rT:\u0003\f g< 9M-HZ(l=Ot", (short) (C1499aX.Xd() ^ (-26513)), (short) (C1499aX.Xd() ^ (-32423)))).getMethod(C1626yg.Ud("h/0\u001eX?Z\u000fJ\u007f\fp", (short) (C1607wl.Xd() ^ 16461), (short) (C1607wl.Xd() ^ 5980)), new Class[0]);
            try {
                method2.setAccessible(true);
                int identifier = ((Resources) method2.invoke(context, objArr2)).getIdentifier(str4, str3, str2);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Ig.wd(":qYLX%0\u001a\u0014tqY\u0017rtS Nt?u8J", (short) (Od.Xd() ^ (-31002)))).getMethod(EO.Od("E\fj+G\u0012$l\u0018wug", (short) (C1499aX.Xd() ^ (-21308))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Resources resources = (Resources) method3.invoke(context, objArr3);
                    short sXd = (short) (Od.Xd() ^ (-6731));
                    int[] iArr = new int["\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e".length()];
                    QB qb = new QB("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd2 = (short) (OY.Xd() ^ 26236);
                    short sXd3 = (short) (OY.Xd() ^ 20604);
                    int[] iArr2 = new int["! 0\u0011&$-&".length()];
                    QB qb2 = new QB("! 0\u0011&$-&");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                        i3++;
                    }
                    Method method4 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method4.setAccessible(true);
                        return ResourcesCompat.getColor(resources, identifier, (Resources.Theme) method4.invoke(context, objArr4));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static Integer resolveResourcePath(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            boolean zStartsWith = str.startsWith(PREFIX_RESOURCE);
            boolean zStartsWith2 = str.startsWith("?");
            String strSubstring = str.substring(1);
            try {
                if (zStartsWith) {
                    return Integer.valueOf(resolveResource(context, strSubstring));
                }
                if (zStartsWith2) {
                    return Integer.valueOf(resolveThemeAttribute(context, strSubstring));
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    private static int resolveThemeAttribute(Context context, String str) throws Throwable {
        String strReplaceAll = str.replaceAll(C1561oA.od("GYXU\u0011", (short) (C1580rY.Xd() ^ (-11025))), "");
        short sXd = (short) (C1499aX.Xd() ^ (-447));
        int[] iArr = new int[ExifInterface.GPS_MEASUREMENT_2D.length()];
        QB qb = new QB(ExifInterface.GPS_MEASUREMENT_2D);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String[] strArrSplit = strReplaceAll.split(new String(iArr, 0, i2));
        short sXd2 = (short) (C1633zX.Xd() ^ (-32001));
        short sXd3 = (short) (C1633zX.Xd() ^ (-11132));
        int[] iArr2 = new int["zE),\u001bxi$GO@3yj^\r\u0010\u0015\t{^^G".length()];
        QB qb2 = new QB("zE),\u001bxi$GO@3yj^\r\u0010\u0015\t{^^G");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("10@\u001d/2;298\"6C<", (short) (FB.Xd() ^ 28276)), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[0];
                strReplaceAll = strArrSplit[1];
            }
            Class<?> cls = Class.forName(Wg.vd("ftgvxsk6p}y\u0001v\u0001\u0004>8eah^rk", (short) (OY.Xd() ^ 32485)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd4 = (short) (C1607wl.Xd() ^ 15978);
            short sXd5 = (short) (C1607wl.Xd() ^ 31527);
            int[] iArr3 = new int[",)7\u0014&3.3/\u001f -".length()];
            QB qb3 = new QB(",)7\u0014&3.3/\u001f -");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                Resources resources = (Resources) method2.invoke(context, objArr2);
                short sXd6 = (short) (ZN.Xd() ^ 12619);
                short sXd7 = (short) (ZN.Xd() ^ 22976);
                int[] iArr4 = new int["\u0007\u0019\u0018\u0015".length()];
                QB qb4 = new QB("\u0007\u0019\u0018\u0015");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4) + sXd7);
                    i5++;
                }
                String str3 = new String(iArr4, 0, i5);
                int identifier = resources.getIdentifier(strReplaceAll, str3, str2);
                if (identifier == 0) {
                    Class<?> cls2 = Class.forName(C1561oA.ud("5A6C?82z/:8=-5:r\u0007205%72", (short) (C1499aX.Xd() ^ (-21591))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd8 = (short) (C1580rY.Xd() ^ (-10660));
                    int[] iArr5 = new int["!\u001e0\r\u001b(',$\u0014\u0019&".length()];
                    QB qb5 = new QB("!\u001e0\r\u001b(',$\u0014\u0019&");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd8 ^ i6));
                        i6++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr5, 0, i6), clsArr2);
                    try {
                        method3.setAccessible(true);
                        identifier = ((Resources) method3.invoke(context, objArr3)).getIdentifier(strReplaceAll, str3, C1561oA.Yd("!/&53.*", (short) (C1607wl.Xd() ^ 4180)));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                TypedValue typedValue = new TypedValue();
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(Xg.qd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (Od.Xd() ^ (-19029)), (short) (Od.Xd() ^ (-25774)))).getMethod(Jg.Wd("+/7\u001d:=B\u0014", (short) (C1607wl.Xd() ^ 9858), (short) (C1607wl.Xd() ^ 25016)), new Class[0]);
                try {
                    method4.setAccessible(true);
                    if (((Resources.Theme) method4.invoke(context, objArr4)).resolveAttribute(identifier, typedValue, true)) {
                        return typedValue.data;
                    }
                    throw new Resources.NotFoundException();
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static boolean supportWideGamut() {
        return true;
    }
}
