package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.utils.LottieTrace;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class L {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";
    private static LottieNetworkCacheProvider cacheProvider = null;
    private static boolean disablePathInterpolatorCache = true;
    private static LottieNetworkFetcher fetcher = null;
    private static ThreadLocal<LottieTrace> lottieTrace = null;
    private static volatile NetworkCache networkCache = null;
    private static boolean networkCacheEnabled = true;
    private static volatile NetworkFetcher networkFetcher = null;
    private static boolean traceEnabled = false;
    private static AsyncUpdates defaultAsyncUpdates = AsyncUpdates.AUTOMATIC;
    private static ReducedMotionOption reducedMotionOption = new SystemReducedMotionOption();

    private L() {
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            getTrace().beginSection(str);
        }
    }

    public static float endSection(String str) {
        if (traceEnabled) {
            return getTrace().endSection(str);
        }
        return 0.0f;
    }

    public static AsyncUpdates getDefaultAsyncUpdates() {
        return defaultAsyncUpdates;
    }

    public static boolean getDisablePathInterpolatorCache() {
        return disablePathInterpolatorCache;
    }

    public static ReducedMotionOption getReducedMotionOption() {
        return reducedMotionOption;
    }

    private static LottieTrace getTrace() {
        LottieTrace lottieTrace2 = lottieTrace.get();
        if (lottieTrace2 != null) {
            return lottieTrace2;
        }
        LottieTrace lottieTrace3 = new LottieTrace();
        lottieTrace.set(lottieTrace3);
        return lottieTrace3;
    }

    public static boolean isTraceEnabled() {
        return traceEnabled;
    }

    static /* synthetic */ File lambda$networkCache$0(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("\u000e\u001c\u000f\u001e\u0018\u0013\u000bU\b\u0015\u0011\u0018\u0006\u0010\u0013M\u007f-)0\u001e2+", (short) (C1580rY.Xd() ^ (-10929)))).getMethod(C1561oA.Yd("vu\u0006Utw}{[\u0002\f", (short) (C1580rY.Xd() ^ (-12839))), new Class[0]);
        try {
            method.setAccessible(true);
            return new File((File) method.invoke(context, objArr), Xg.qd("=AGH>;6F>NRKOI>CBEKI", (short) (Od.Xd() ^ (-5768)), (short) (Od.Xd() ^ (-20555))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static NetworkCache networkCache(Context context) throws Throwable {
        if (!networkCacheEnabled) {
            return null;
        }
        Class<?> cls = Class.forName(Jg.Wd("bG-30\u0016l\"7;*\bxmo\u0015\n\u000e|~gf>", (short) (FB.Xd() ^ 5178), (short) (FB.Xd() ^ 15934)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 4186);
        short sXd2 = (short) (ZN.Xd() ^ 29807);
        int[] iArr = new int["oy\ne^TD29+<{*Nrd1\u0012\u0017\u001e0".length()];
        QB qb = new QB("oy\ne^TD29+<{*Nrd1\u0012\u0017\u001e0");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            NetworkCache networkCache2 = networkCache;
            if (networkCache2 == null) {
                synchronized (NetworkCache.class) {
                    networkCache2 = networkCache;
                    if (networkCache2 == null) {
                        LottieNetworkCacheProvider lottieNetworkCacheProvider = cacheProvider;
                        if (lottieNetworkCacheProvider == null) {
                            lottieNetworkCacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L$$ExternalSyntheticLambda0
                                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                                public final File getCacheDir() {
                                    return L.lambda$networkCache$0(context2);
                                }
                            };
                        }
                        networkCache2 = new NetworkCache(lottieNetworkCacheProvider);
                        networkCache = networkCache2;
                    }
                }
            }
            return networkCache2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static NetworkFetcher networkFetcher(Context context) {
        NetworkFetcher networkFetcher2 = networkFetcher;
        if (networkFetcher2 == null) {
            synchronized (NetworkFetcher.class) {
                networkFetcher2 = networkFetcher;
                if (networkFetcher2 == null) {
                    NetworkCache networkCache2 = networkCache(context);
                    LottieNetworkFetcher defaultLottieNetworkFetcher = fetcher;
                    if (defaultLottieNetworkFetcher == null) {
                        defaultLottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                    }
                    networkFetcher2 = new NetworkFetcher(networkCache2, defaultLottieNetworkFetcher);
                    networkFetcher = networkFetcher2;
                }
            }
        }
        return networkFetcher2;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        LottieNetworkCacheProvider lottieNetworkCacheProvider2 = cacheProvider;
        if (lottieNetworkCacheProvider2 == null && lottieNetworkCacheProvider == null) {
            return;
        }
        if (lottieNetworkCacheProvider2 == null || !lottieNetworkCacheProvider2.equals(lottieNetworkCacheProvider)) {
            cacheProvider = lottieNetworkCacheProvider;
            networkCache = null;
        }
    }

    public static void setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
        defaultAsyncUpdates = asyncUpdates;
    }

    public static void setDisablePathInterpolatorCache(boolean z2) {
        disablePathInterpolatorCache = z2;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        LottieNetworkFetcher lottieNetworkFetcher2 = fetcher;
        if (lottieNetworkFetcher2 == null && lottieNetworkFetcher == null) {
            return;
        }
        if (lottieNetworkFetcher2 == null || !lottieNetworkFetcher2.equals(lottieNetworkFetcher)) {
            fetcher = lottieNetworkFetcher;
            networkFetcher = null;
        }
    }

    public static void setNetworkCacheEnabled(boolean z2) {
        networkCacheEnabled = z2;
    }

    public static void setReducedMotionOption(ReducedMotionOption reducedMotionOption2) {
        reducedMotionOption = reducedMotionOption2;
    }

    public static void setTraceEnabled(boolean z2) {
        if (traceEnabled == z2) {
            return;
        }
        traceEnabled = z2;
        if (z2 && lottieTrace == null) {
            lottieTrace = new ThreadLocal<>();
        }
    }
}
