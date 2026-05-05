package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.Od;

/* JADX INFO: loaded from: classes9.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
        }
        return f2;
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return str.substring(str2.length() + EASING_TYPE_FORMAT_START.length(), str.length() - EASING_TYPE_FORMAT_END.length());
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, "path")) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(getLegacyEasingContent(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (strArrSplit.length == 4) {
            return PathInterpolatorCompat.create(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        return str.startsWith(new StringBuilder().append(str2).append(EASING_TYPE_FORMAT_START).toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    public static int resolveThemeDuration(Context context, int i2, int i3) {
        return MaterialAttributes.resolveInteger(context, i2, i3);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i2, TimeInterpolator timeInterpolator) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1499aX.Xd() ^ (-27850)))).getMethod(C1593ug.zd("dcsTigpi", (short) (C1633zX.Xd() ^ (-2235)), (short) (C1633zX.Xd() ^ (-1532))), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true)) {
                return timeInterpolator;
            }
            if (typedValue.type != 3) {
                throw new IllegalArgumentException(C1561oA.od("\\}\u0002uzx)mhynrj\"uhdkb\u001c\\nmj`XjhX\u0012^ebb\rNP\nJV\u0007&NRWGSPNJ>PJLxJ<IDIE56o5=?k\n+=<9t237+0.\u0004\u001f0%)!b\u0001%*\u001a&#!\u001d\u0011#\u001d\u001fK\f\u001e\u001d\u001a\u0010\b\u001a\u0018\b\u0015@\u000f\u0011=};\u000e\u000e\u000b\u0001\u0005|4y\u0002\u00040No\u0002\u0001}9vw{otrHctime'\u001c\\nmj`XjhXe\u001f", (short) (Od.Xd() ^ (-3150))));
            }
            String strValueOf = String.valueOf(typedValue.string);
            return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
