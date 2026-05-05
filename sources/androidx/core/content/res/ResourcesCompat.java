package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
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
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();
    private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);
    private static final Object sColorStateCacheLock = new Object();

    public static void clearCachesForTheme(Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            Iterator<ColorStateListCacheKey> it = sColorStateCaches.keySet().iterator();
            while (it.hasNext()) {
                ColorStateListCacheKey next = it.next();
                if (next != null && theme.equals(next.mTheme)) {
                    it.remove();
                }
            }
        }
    }

    public static Drawable getDrawable(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.getDrawable(resources, i2, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i2, int i3, Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.getDrawableForDensity(resources, i2, i3, theme);
    }

    public static int getColor(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return Api23Impl.getColor(resources, i2, theme);
    }

    public static ColorStateList getColorStateList(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i2);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList colorStateListInflateColorStateList = inflateColorStateList(resources, i2, theme);
        if (colorStateListInflateColorStateList != null) {
            addColorStateListToCache(colorStateListCacheKey, i2, colorStateListInflateColorStateList, theme);
            return colorStateListInflateColorStateList;
        }
        return Api23Impl.getColorStateList(resources, i2, theme);
    }

    private static ColorStateList inflateColorStateList(Resources resources, int i2, Resources.Theme theme) {
        if (isColorInt(resources, i2)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            return null;
        }
    }

    private static ColorStateList getCachedColorStateList(ColorStateListCacheKey colorStateListCacheKey, int i2) {
        ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (sColorStateCacheLock) {
            SparseArray<ColorStateListCacheEntry> sparseArray = sColorStateCaches.get(colorStateListCacheKey);
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i2)) != null) {
                if (colorStateListCacheEntry.mConfiguration.equals(colorStateListCacheKey.mResources.getConfiguration()) && ((colorStateListCacheKey.mTheme == null && colorStateListCacheEntry.mThemeHash == 0) || (colorStateListCacheKey.mTheme != null && colorStateListCacheEntry.mThemeHash == colorStateListCacheKey.mTheme.hashCode()))) {
                    return colorStateListCacheEntry.mValue;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    private static void addColorStateListToCache(ColorStateListCacheKey colorStateListCacheKey, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (sColorStateCacheLock) {
            WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            SparseArray<ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray);
            }
            sparseArray.append(i2, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
        }
    }

    private static boolean isColorInt(Resources resources, int i2) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i2, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static final class ColorStateListCacheKey {
        final Resources mResources;
        final Resources.Theme mTheme;

        ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
            return this.mResources.equals(colorStateListCacheKey.mResources) && ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme);
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    private static class ColorStateListCacheEntry {
        final Configuration mConfiguration;
        final int mThemeHash;
        final ColorStateList mValue;

        ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            this.mThemeHash = theme == null ? 0 : theme.hashCode();
        }
    }

    public static float getFloat(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getFloat(resources, i2);
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i2, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i2) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static Typeface getFont(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (C1633zX.Xd() ^ (-5077)), (short) (C1633zX.Xd() ^ (-19828)))).getMethod(Jg.Wd("=Jc=\u00029\u0002/O'RW", (short) (OY.Xd() ^ 25616), (short) (OY.Xd() ^ 22113)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                return null;
            }
            return loadFont(context, i2, new TypedValue(), 0, null, null, false, false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Typeface getCachedFont(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("nzs\u0001\u0001yw@hsuznv\u007f8@kmrfxw", (short) (FB.Xd() ^ 26314))).getMethod(C1561oA.Yd("&1\u0011%465-(:,,", (short) (ZN.Xd() ^ 21835)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                return null;
            }
            return loadFont(context, i2, new TypedValue(), 0, null, null, false, true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static abstract class FontCallback {
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public abstract void m6907xb24343b7(int i2);

        /* JADX INFO: renamed from: onFontRetrieved */
        public abstract void m6908x46c88379(Typeface typeface);

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) throws Throwable {
            Handler handler2 = getHandler(handler);
            Object[] objArr = {new Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m6908x46c88379(typeface);
                }
            }};
            Method method = Class.forName(ZO.xd("\u0016\u001aum\btMtYid#1u;4@~", (short) (C1607wl.Xd() ^ 15374), (short) (C1607wl.Xd() ^ 11806))).getMethod(Ig.wd("1_\u0014.", (short) (C1607wl.Xd() ^ 26254)), Class.forName(C1626yg.Ud("c8\\mJ,\u001cm1~\u000fP~rh xD", (short) (Od.Xd() ^ (-17998)), (short) (Od.Xd() ^ (-3995)))));
            try {
                method.setAccessible(true);
                method.invoke(handler2, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public final void callbackFailAsync(final int i2, Handler handler) throws Throwable {
            Handler handler2 = getHandler(handler);
            Runnable runnable = new Runnable() { // from class: androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m6907xb24343b7(i2);
                }
            };
            Class<?> cls = Class.forName(C1561oA.Yd("esjywrn9{\u0001<Wq\u007fv\u007fy\b", (short) (Od.Xd() ^ (-22875))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (FB.Xd() ^ 10983);
            short sXd2 = (short) (FB.Xd() ^ 11678);
            int[] iArr = new int["\u0018\u0010&\u0012_\u001f\u0015#\u001dd\n.()\u001d\u001f*$".length()];
            QB qb = new QB("\u0018\u0010&\u0012_\u001f\u0015#\u001dd\n.()\u001d\u001f*$");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            Object[] objArr = {runnable};
            short sXd3 = (short) (ZN.Xd() ^ 16766);
            short sXd4 = (short) (ZN.Xd() ^ 31781);
            int[] iArr2 = new int["\u007fF\u0010X".length()];
            QB qb2 = new QB("\u007fF\u0010X");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler2, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public static Handler getHandler(Handler handler) throws Throwable {
            if (handler == null) {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0010\u0013Li\f\u000b\u000b~\u000b", (short) (C1607wl.Xd() ^ 2299))).getDeclaredMethod(C1561oA.yd("GFV0=FL+GHJ@F", (short) (FB.Xd() ^ 6111)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return handler;
        }
    }

    public static void getFont(Context context, int i2, FontCallback fontCallback, Handler handler) throws Throwable {
        Preconditions.checkNotNull(fontCallback);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("K\b{b@d\fug`iIjqw\fK\u000eU3`H.", (short) (ZN.Xd() ^ 7022))).getMethod(EO.Od("[= MF\u001coA}\u001d\u0006-", (short) (Od.Xd() ^ (-134))), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                loadFont(context, i2, new TypedValue(), 0, fontCallback, handler, false, false);
            } else {
                fontCallback.callbackFailAsync(-4, handler);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Typeface getFont(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("m/)MyRfj\u0015\u0013U\u0011;\u0010\u0019~\tzy8\u000e\u001ej", (short) (C1580rY.Xd() ^ (-28300)), (short) (C1580rY.Xd() ^ (-23880)))).getMethod(C1626yg.Ud("4\u0018KZ+l%{\u0015\u0011j@", (short) (Od.Xd() ^ (-21069)), (short) (Od.Xd() ^ (-32237))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                return null;
            }
            return loadFont(context, i2, typedValue, i3, fontCallback, null, true, false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Typeface loadFont(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback, Handler handler, boolean z2, boolean z3) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSg\u0013\u0011\u0016\u0006\u0018\u0013", (short) (C1499aX.Xd() ^ (-18119))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 22869);
        short sXd2 = (short) (OY.Xd() ^ 16273);
        int[] iArr = new int["21A 4C@GE7:I".length()];
        QB qb = new QB("21A 4C@GE7:I");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            resources.getValue(i2, typedValue, true);
            Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i2, i3, fontCallback, handler, z2, z3);
            if (typefaceLoadFont == null && fontCallback == null && !z3) {
                throw new Resources.NotFoundException(C1561oA.od("\u001dECHrD6C>C?/0i\u0012\ffht<", (short) (C1607wl.Xd() ^ 7279)) + Integer.toHexString(i2) + C1561oA.Kd("a&3:2+g79?k/3nB6FE=:L<<\u0007", (short) (C1633zX.Xd() ^ (-8419))));
            }
            return typefaceLoadFont;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface loadFont(android.content.Context r12, android.content.res.Resources r13, android.util.TypedValue r14, int r15, int r16, androidx.core.content.res.ResourcesCompat.FontCallback r17, android.os.Handler r18, boolean r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static float getFloat(Resources resources, int i2) {
            return resources.getFloat(i2);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static ColorStateList getColorStateList(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }

        static int getColor(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Drawable getDrawable(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        static Drawable getDrawableForDensity(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    private ResourcesCompat() {
    }

    public static final class ThemeCompat {
        private ThemeCompat() {
        }

        public static void rebase(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.rebase(theme);
            } else {
                Api23Impl.rebase(theme);
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static void rebase(Resources.Theme theme) {
                theme.rebase();
            }
        }

        static class Api23Impl {
            private static Method sRebaseMethod = null;
            private static boolean sRebaseMethodFetched = false;
            private static final Object sRebaseMethodLock = new Object();

            private Api23Impl() {
            }

            static void rebase(Resources.Theme theme) {
                synchronized (sRebaseMethodLock) {
                    if (!sRebaseMethodFetched) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            sRebaseMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                        }
                        sRebaseMethodFetched = true;
                    }
                    Method method = sRebaseMethod;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            sRebaseMethod = null;
                        }
                    }
                }
            }
        }
    }
}
