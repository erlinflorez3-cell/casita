package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.drew.metadata.exif.ExifDirectoryBase;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private SimpleArrayMap<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    private interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface ResourceManagerHooks {
        Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i2);

        ColorStateList getTintListForDrawableRes(Context context, int i2);

        PorterDuff.Mode getTintModeForDrawableRes(int i2);

        boolean tintDrawable(Context context, int i2, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i2, Drawable drawable);
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal resourceManagerInternal) {
    }

    public static synchronized ResourceManagerInternal get() {
        if (INSTANCE == null) {
            ResourceManagerInternal resourceManagerInternal = new ResourceManagerInternal();
            INSTANCE = resourceManagerInternal;
            installDefaultInflateDelegates(resourceManagerInternal);
        }
        return INSTANCE;
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public synchronized Drawable getDrawable(Context context, int i2) {
        return getDrawable(context, i2, false);
    }

    synchronized Drawable getDrawable(Context context, int i2, boolean z2) {
        Drawable drawableLoadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i2);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = createDrawableIfNeeded(context, i2);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = ContextCompat.getDrawable(context, i2);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            drawableLoadDrawableFromDelegates = tintDrawable(context, i2, z2, drawableLoadDrawableFromDelegates);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(drawableLoadDrawableFromDelegates);
        }
        return drawableLoadDrawableFromDelegates;
    }

    public synchronized void onConfigurationChanged(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        long j2 = ((long) typedValue.assetCookie) << 32;
        long j3 = typedValue.data;
        return (j2 + j3) - (j2 & j3);
    }

    private Drawable createDrawableIfNeeded(Context context, int i2) throws Throwable {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Class<?> cls = Class.forName(C1561oA.Qd(":F;HD=7\u007f4?=B2:?w\f75:*<7", (short) (C1499aX.Xd() ^ (-22336))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-32499));
        short sXd2 = (short) (Od.Xd() ^ (-5656));
        int[] iArr = new int["%$4\u0013'63:8*-<".length()];
        QB qb = new QB("%$4\u0013'63:8*-<");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources) method.invoke(context, objArr)).getValue(i2, typedValue, true);
            long jCreateCacheKey = createCacheKey(typedValue);
            Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
            if (cachedDrawable != null) {
                return cachedDrawable;
            }
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            Drawable drawableCreateDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i2);
            if (drawableCreateDrawableFor != null) {
                drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
                addDrawableToCache(context, jCreateCacheKey, drawableCreateDrawableFor);
            }
            return drawableCreateDrawableFor;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Drawable tintDrawable(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i2);
        if (tintList != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawableWrap, tintList);
            PorterDuff.Mode tintMode = getTintMode(i2);
            if (tintMode != null) {
                DrawableCompat.setTintMode(drawableWrap, tintMode);
                return drawableWrap;
            }
            return drawableWrap;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i2, drawable)) && !tintDrawableUsingColorFilter(context, i2, drawable) && z2) {
            return null;
        }
        return drawable;
    }

    private Drawable loadDrawableFromDelegates(Context context, int i2) throws Throwable {
        int next;
        SimpleArrayMap<String, InflateDelegate> simpleArrayMap = this.mDelegates;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.mKnownDrawableIdTags;
        String strZd = Wg.Zd("k\u000b1Fv\u001b`u/<tr\u0013>S\n&j\u0014", (short) (FB.Xd() ^ 11740), (short) (FB.Xd() ^ 17614));
        if (sparseArrayCompat == null) {
            this.mKnownDrawableIdTags = new SparseArrayCompat<>();
        } else {
            String str = sparseArrayCompat.get(i2);
            if (strZd.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (C1633zX.Xd() ^ (-1936)))).getMethod(Wg.vd("\u0003\u007f\u000ej|\n\u0005\n\u0016\u0006\u0007\u0014", (short) (C1607wl.Xd() ^ 9762)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            resources.getValue(i2, typedValue, true);
            long jCreateCacheKey = createCacheKey(typedValue);
            Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
            if (cachedDrawable != null) {
                return cachedDrawable;
            }
            if (typedValue.string != null && typedValue.string.toString().endsWith(Qg.kd("I\u0013\u0007\u0005", (short) (FB.Xd() ^ 30118), (short) (FB.Xd() ^ 14087)))) {
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        short sXd = (short) (FB.Xd() ^ 27731);
                        int[] iArr = new int["5W\t]_M_b\u000fdRY\u0013Zdke\\".length()];
                        QB qb = new QB("5W\t]_M_b\u000fdRY\u0013Zdke\\");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                            i3++;
                        }
                        throw new XmlPullParserException(new String(iArr, 0, i3));
                    }
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.append(i2, name);
                    InflateDelegate inflateDelegate = this.mDelegates.get(name);
                    if (inflateDelegate != null) {
                        Class<?> cls = Class.forName(hg.Vd("&2'40)#k +).\u001e&+cw#!&\u0016(#", (short) (ZN.Xd() ^ 25031), (short) (ZN.Xd() ^ 29012)));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd2 = (short) (OY.Xd() ^ 22052);
                        int[] iArr2 = new int["\\YgFYU\\S".length()];
                        QB qb2 = new QB("\\YgFYU\\S");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                            i4++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                        try {
                            method2.setAccessible(true);
                            cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, attributeSetAsAttributeSet, (Resources.Theme) method2.invoke(context, objArr2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, jCreateCacheKey, cachedDrawable);
                    }
                } catch (Exception e3) {
                    C1561oA.Yd("r\u0007\u0016\u0013\u001a\u0018\n\ru\u000b\u0019\r\u0014\u0013!x\u001f&\u0018&#\u0017#", (short) (Od.Xd() ^ (-12504)));
                    Xg.qd("@t`cotjqq$|nptn*tzszp\u0005z\u0001z4y\tx\u0010z|\b\u0002", (short) (C1580rY.Xd() ^ (-31335)), (short) (C1580rY.Xd() ^ (-21704)));
                }
            }
            if (cachedDrawable == null) {
                this.mKnownDrawableIdTags.append(i2, strZd);
            }
            return cachedDrawable;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private synchronized Drawable getCachedDrawable(Context context, long j2) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.od("&2'40)#k +).\u001e&+cw#!&\u0016(#", (short) (C1633zX.Xd() ^ (-12956)))).getMethod(C1561oA.Kd("HGW6JYV][MP_", (short) (FB.Xd() ^ 24573)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return constantState.newDrawable((Resources) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            longSparseArray.remove(j2);
        }
        return null;
    }

    private synchronized boolean addDrawableToCache(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.mDrawableCaches.put(context, longSparseArray);
        }
        longSparseArray.put(j2, new WeakReference<>(constantState));
        return true;
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i2) {
        Drawable drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i2);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i2);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i2, false, drawableLoadDrawableFromDelegates);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i2, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i2, drawable);
    }

    private void addDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new SimpleArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    PorterDuff.Mode getTintMode(int i2) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i2);
    }

    synchronized ColorStateList getTintList(Context context, int i2) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i2);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i2);
            if (tintListFromCache != null) {
                addTintListToCache(context, i2, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    private ColorStateList getTintListFromCache(Context context, int i2) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i2);
    }

    private void addTintListToCache(Context context, int i2, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.mTintLists.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.mTintLists.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i2, colorStateList);
    }

    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i2) {
            super(i2);
        }

        PorterDuffColorFilter get(int i2, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i2, mode)));
        }

        PorterDuffColorFilter put(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i2, mode)), porterDuffColorFilter);
        }

        private static int generateCacheKey(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            if (tintInfo.mHasTintList || tintInfo.mHasTintMode) {
                drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        porterDuffColorFilter = colorFilterLruCache.get(i2, mode);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            colorFilterLruCache.put(i2, mode, porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Ig.wd("{Cg\u0012\u0017c6@&\u0017\u0018{\u001d,2V\u0012L\u0004\u000e?~L", (short) (Od.Xd() ^ (-27444)))).getMethod(EO.Od("|0#[\u0019[m.M-'\u001d", (short) (C1633zX.Xd() ^ (-25364))), new Class[0]);
                try {
                    method.setAccessible(true);
                    return VectorDrawableCompat.createFromXmlInner((Resources) method.invoke(context, objArr), xmlPullParser, attributeSet, theme);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                short sXd = (short) (FB.Xd() ^ 18524);
                int[] iArr = new int["\u001b(&\u000b/&+\u001f1!~\u001f%\u001d\u001e\u0017)\u0019".length()];
                QB qb = new QB("\u001b(&\u000b/&+\u001f1!~\u001f%\u001d\u001e\u0017)\u0019");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                new String(iArr, 0, i2);
                C1593ug.zd("f\u001b\u0007\n\u0016\u001b\u0011\u0018\u0018J#\u0015\u0017\u001b\u0015P\u001b!\u001a!\u0017+!'!Zw3#\"404\u0001", (short) (ZN.Xd() ^ ExifDirectoryBase.TAG_EXTRA_SAMPLES), (short) (ZN.Xd() ^ 30490));
                return null;
            }
        }
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
            short sXd = (short) (ZN.Xd() ^ 13041);
            int[] iArr = new int["\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=".length()];
            QB qb = new QB("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("F3p<}y\"6A@Qk", (short) (ZN.Xd() ^ 9856), (short) (ZN.Xd() ^ 616)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return AnimatedVectorDrawableCompat.createFromXmlInner(context, (Resources) method.invoke(context, objArr), xmlPullParser, attributeSet, theme);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                C1561oA.Xd("q(\u0017\u0017}$\u001d$\u001a. \u007f\"*$'\"6(", (short) (Od.Xd() ^ (-13144)));
                Wg.vd("\u001dQ=@DI?FN\u0001YKEIC~QWPWEYOUW\u0011.TZV[Pl^^(jZYkos@", (short) (C1633zX.Xd() ^ (-29264)));
                return null;
            }
        }
    }

    static class AsldcInflateDelegate implements InflateDelegate {
        AsldcInflateDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Qd("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA", (short) (C1607wl.Xd() ^ 18727))).getMethod(C1593ug.zd("\u001f\u001e.\r!0-42$'6", (short) (ZN.Xd() ^ 18938), (short) (ZN.Xd() ^ 14529)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return AnimatedStateListDrawableCompat.createFromXmlInner(context, (Resources) method.invoke(context, objArr), xmlPullParser, attributeSet, theme);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                C1561oA.od("\u0019JB97\u001c@7<0B2\u001006./(:*", (short) (C1607wl.Xd() ^ 8310));
                short sXd = (short) (C1499aX.Xd() ^ (-8884));
                int[] iArr = new int["\u001eR>AMRHOO\u0002ZLNRL\bRXQXNbX^X\u0012/Uc_dYm__)pckedvrvC".length()];
                QB qb = new QB("\u001eR>AMRHOO\u0002ZLNRL\bRXQXNbX^X\u0012/Uc_dYm__)pckedvrvC");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                new String(iArr, 0, i2);
                return null;
            }
        }
    }

    static class DrawableDelegate implements InflateDelegate {
        DrawableDelegate() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Wg.vd("dretnia,^kgn\\fi$6c_fTha", (short) (C1499aX.Xd() ^ (-27379)))).getMethod(Qg.kd("\u0018\u0015#\u007f\u0012\u001f\u001a\u001f\u001b\u000b\f\u0019", (short) (C1499aX.Xd() ^ (-3814)), (short) (C1499aX.Xd() ^ (-23313))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Compatibility.Api21Impl.inflate(drawable, (Resources) method.invoke(context, objArr), xmlPullParser, attributeSet, theme);
                        return drawable;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Exception e3) {
                    hg.Vd("#P>S<<E=\u001b;A9:3E5", (short) (C1633zX.Xd() ^ (-4028)), (short) (C1633zX.Xd() ^ (-15421)));
                    short sXd = (short) (C1499aX.Xd() ^ (-24522));
                    int[] iArr = new int["x+\u0015\u0016 #\u0017\u001c\u001aJ!\u0011\u0011\u0013\u000bD\r\u0011\b\r\u0001\u0013\u0007\u000b\u0003:U|\nw\ruu~vN".length()];
                    QB qb = new QB("x+\u0015\u0016 #\u0017\u001c\u001aJ!\u0011\u0011\u0013\u000bD\r\u0011\b\r\u0001\u0013\u0007\u000b\u0003:U|\nw\ruu~vN");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    new String(iArr, 0, i2);
                }
            }
            return null;
        }
    }
}
