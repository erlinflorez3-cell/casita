package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class TintContextWrapper extends ContextWrapper {
    private static final Object CACHE_LOCK = new Object();
    private static ArrayList<WeakReference<TintContextWrapper>> sCache = null;
    private final Resources mResources;
    private final Resources.Theme mTheme;

    public static Context wrap(Context context) {
        if (!shouldWrap(context)) {
            return context;
        }
        synchronized (CACHE_LOCK) {
            ArrayList<WeakReference<TintContextWrapper>> arrayList = sCache;
            if (arrayList == null) {
                sCache = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<TintContextWrapper> weakReference = sCache.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        sCache.remove(size);
                    }
                }
                for (int size2 = sCache.size() - 1; size2 >= 0; size2--) {
                    WeakReference<TintContextWrapper> weakReference2 = sCache.get(size2);
                    TintContextWrapper tintContextWrapper = weakReference2 != null ? weakReference2.get() : null;
                    if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                        return tintContextWrapper;
                    }
                }
            }
            TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
            sCache.add(new WeakReference<>(tintContextWrapper2));
            return tintContextWrapper2;
        }
    }

    private static boolean shouldWrap(Context context) throws Throwable {
        if (!(context instanceof TintContextWrapper)) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("/=4CA<8\u00039FFM?IP\u000b!NNUG[X", (short) (C1580rY.Xd() ^ (-9720)))).getMethod(Wg.vd("\b\u0005\u0013o\n\u0017\u0012\u0017\u000bz{\t", (short) (FB.Xd() ^ 21079)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!(((Resources) method.invoke(context, objArr)) instanceof TintResources)) {
                    Class<?> cls = Class.forName(Qg.kd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (OY.Xd() ^ 27788), (short) (OY.Xd() ^ 4798)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (C1580rY.Xd() ^ (-20880));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-17796));
                    int[] iArr = new int["\t\u0006\u0014p\u0003\u0010\u000b\u0010\f{|\n".length()];
                    QB qb = new QB("\t\u0006\u0014p\u0003\u0010\u000b\u0010\f{|\n");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        if (((Resources) method2.invoke(context, objArr2)) instanceof VectorEnabledTintResources) {
                            return false;
                        }
                        return VectorEnabledTintResources.shouldBeUsed();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return false;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }

    private TintContextWrapper(Context context) throws Throwable {
        super(context);
        if (VectorEnabledTintResources.shouldBeUsed()) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("9w[ER*=\u001e#~wc 7)D\u0017]\u0014u&lF", (short) (C1607wl.Xd() ^ 31386))).getMethod(C1561oA.Qd(">;I&8E@EA12?", (short) (ZN.Xd() ^ 32326)), new Class[0]);
            try {
                method.setAccessible(true);
                VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, (Resources) method.invoke(context, objArr));
                this.mResources = vectorEnabledTintResources;
                Resources.Theme themeNewTheme = vectorEnabledTintResources.newTheme();
                this.mTheme = themeNewTheme;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1593ug.zd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0002//6(<9", (short) (Od.Xd() ^ (-10659)), (short) (Od.Xd() ^ (-23705)))).getMethod(C1561oA.od("[XfEXT[R", (short) (ZN.Xd() ^ 14473)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    themeNewTheme.setTo((Resources.Theme) method2.invoke(context, objArr2));
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Object[] objArr3 = new Object[0];
        Method method3 = Class.forName(C1561oA.Kd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (FB.Xd() ^ 27107))).getMethod(Wg.Zd("i7B ISO3$\u0011/;", (short) (C1607wl.Xd() ^ 26441), (short) (C1607wl.Xd() ^ 7295)), new Class[0]);
        try {
            method3.setAccessible(true);
            this.mResources = new TintResources(this, (Resources) method3.invoke(context, objArr3));
            this.mTheme = null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.mTheme;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.mTheme;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.mResources.getAssets();
    }
}
