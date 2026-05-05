package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
final class WeightTypefaceApi14 {
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            declaredField.setAccessible(true);
        } catch (Exception e2) {
            e2.getClass().getName();
            declaredField = null;
        }
        sNativeInstance = declaredField;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static Typeface createWeightStyle(TypefaceCompatBaseImpl typefaceCompatBaseImpl, Context context, Typeface typeface, int i2, boolean z2) {
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i3 = i2 << 1;
        int i4 = (i3 + (z2 ? 1 : 0)) - (i3 & (z2 ? 1 : 0));
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
            SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>(4);
                longSparseArray.put(nativeInstance, sparseArray);
            } else {
                Typeface typeface2 = sparseArray.get(i4);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            Typeface bestFontFromFamily = getBestFontFromFamily(typefaceCompatBaseImpl, context, typeface, i2, z2);
            if (bestFontFromFamily == null) {
                bestFontFromFamily = platformTypefaceCreate(typeface, i2, z2);
            }
            sparseArray.put(i4, bestFontFromFamily);
            return bestFontFromFamily;
        }
    }

    private static Typeface platformTypefaceCreate(Typeface typeface, int i2, boolean z2) {
        int i3 = 1;
        boolean z3 = i2 >= 600;
        if (!z3 && !z2) {
            i3 = 0;
        } else if (!z3) {
            i3 = 2;
        } else if (z2) {
            i3 = 3;
        }
        return Typeface.create(typeface, i3);
    }

    private static Typeface getBestFontFromFamily(TypefaceCompatBaseImpl typefaceCompatBaseImpl, Context context, Typeface typeface, int i2, boolean z2) throws Throwable {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        short sXd = (short) (OY.Xd() ^ 5649);
        short sXd2 = (short) (OY.Xd() ^ 19303);
        int[] iArr = new int["r\u0011\\Bo'{c\f4\u0013\u0005s^wH}\u001a:i(l|".length()];
        QB qb = new QB("r\u0011\\Bo'{c\f4\u0013\u0005s^wH}\u001a:i(l|");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Ig.wd("W&G<7xHFh\u0019\u0019M", (short) (C1499aX.Xd() ^ (-13009))), new Class[0]);
        try {
            method.setAccessible(true);
            return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, (Resources) method.invoke(context, objArr), i2, z2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static long getNativeInstance(Typeface typeface) {
        try {
            return ((Number) sNativeInstance.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    private WeightTypefaceApi14() {
    }
}
