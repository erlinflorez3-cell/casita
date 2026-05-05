package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.math.MathUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes9.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Context context, Typeface typeface) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("#1(750,v-::A3=D~\u0015BBI;OL", (short) (FB.Xd() ^ 9503))).getMethod(Wg.vd("\u001b\u0018*\u0007\u001d*).\u001e\u000e\u0013 ", (short) (Od.Xd() ^ (-16733))), new Class[0]);
        try {
            method.setAccessible(true);
            return maybeCopyWithFontWeightAdjustment(((Resources) method.invoke(context, objArr)).getConfiguration(), typeface);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.clamp(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
