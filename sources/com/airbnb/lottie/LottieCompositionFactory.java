package com.airbnb.lottie;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import org.json.JSONObject;
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
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory {
    private static final Map<String, LottieTask<LottieComposition>> taskCache = new HashMap();
    private static final Set<LottieTaskIdleListener> taskIdleListeners = new HashSet();
    private static final byte[] ZIP_MAGIC = {80, 75, 3, 4};
    private static final byte[] GZIP_MAGIC = {Ascii.US, -117, 8};

    private LottieCompositionFactory() {
    }

    private static LottieTask<LottieComposition> cache(final String str, Callable<LottieResult<LottieComposition>> callable, Runnable runnable) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        LottieTask<LottieComposition> lottieTask = lottieComposition != null ? new LottieTask<>(lottieComposition) : null;
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = taskCache;
            if (map.containsKey(str)) {
                lottieTask = map.get(str);
            }
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask<LottieComposition> lottieTask2 = new LottieTask<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            lottieTask2.addListener(new LottieListener() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda8
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieCompositionFactory.lambda$cache$18(str, atomicBoolean, (LottieComposition) obj);
                }
            });
            lottieTask2.addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda9
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieCompositionFactory.lambda$cache$19(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, LottieTask<LottieComposition>> map2 = taskCache;
                map2.put(str, lottieTask2);
                if (map2.size() == 1) {
                    notifyTaskCacheIdleListeners(false);
                }
            }
        }
        return lottieTask2;
    }

    public static void clearCache(Context context) {
        clearCache(context, true);
    }

    public static void clearCache(Context context, boolean z2) {
        NetworkCache networkCache;
        taskCache.clear();
        LottieCompositionCache.getInstance().clear();
        if (!z2 || (networkCache = L.networkCache(context)) == null) {
            return;
        }
        networkCache.clear();
    }

    private static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, final String str, final String str2) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-18866));
        short sXd2 = (short) (C1633zX.Xd() ^ (-30770));
        int[] iArr = new int[">J?LHA;\u00048CAF6>C{\u0010;9>.@;".length()];
        QB qb = new QB(">J?LHA;\u00048CAF6>C{\u0010;9>.@;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("!\u001e,w&% \u001c\u0015\u0012$\u0018\u001d\u001bn\u001a\u0018\u001d\r\u001f\u001a", (short) (C1580rY.Xd() ^ (-119)), (short) (C1580rY.Xd() ^ (-30790))), new Class[0]);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            return cache(str2, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieCompositionFactory.fromAssetSync(context2, str, str2);
                }
            }, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, String str2) throws Throwable {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=Q|z\u007fo\u0002|", (short) (Od.Xd() ^ (-10610)))).getMethod(C1561oA.yd("cbn<kl[kg", (short) (Od.Xd() ^ (-13717))), new Class[0]);
            try {
                method.setAccessible(true);
                return fromInputStreamSync(context, ((AssetManager) method.invoke(context, objArr)).open(str), str2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            return new LottieResult<>((Throwable) e3);
        }
    }

    public static LottieTask<LottieComposition> fromInputStream(Context context, final InputStream inputStream, final String str) throws Throwable {
        final Context context2;
        if (context == null) {
            context2 = null;
        } else {
            short sXd = (short) (C1633zX.Xd() ^ (-13388));
            int[] iArr = new int["ESJYWRN\u0019O\\\\cU_f!7ddk]qn".length()];
            QB qb = new QB("ESJYWRN\u0019O\\\\cU_f!7ddk]qn");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("FEU#STQOJI]SZZ0]]dVjg", (short) (C1580rY.Xd() ^ (-397)), (short) (C1580rY.Xd() ^ (-8023))), new Class[0]);
            try {
                method.setAccessible(true);
                context2 = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromInputStreamSync(context2, inputStream, str);
            }
        }, null);
    }

    public static LottieResult<LottieComposition> fromInputStreamSync(Context context, InputStream inputStream, String str) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
            return isZipCompressed(bufferedSourceBuffer).booleanValue() ? fromZipStreamSync(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : isGzipCompressed(bufferedSourceBuffer).booleanValue() ? fromJsonInputStreamSync(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str) : fromJsonReaderSync(JsonReader.of(bufferedSourceBuffer), str);
        } catch (IOException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(final JSONObject jSONObject, final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda18
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonSync(jSONObject, str);
            }
        }, null);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                Utils.closeQuietly(inputStream);
            }
        });
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, final String str, final boolean z2) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda19
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str, z2);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LottieCompositionFactory.lambda$fromJsonInputStream$7(z2, inputStream);
            }
        });
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str, boolean z2) {
        return fromJsonSourceSync(Okio.source(inputStream), str, z2);
    }

    public static LottieTask<LottieComposition> fromJsonReader(final JsonReader jsonReader, final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonReaderSync(jsonReader, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Utils.closeQuietly(jsonReader);
            }
        });
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str) {
        return fromJsonReaderSync(jsonReader, str, true);
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str, boolean z2) {
        return fromJsonReaderSyncInternal(jsonReader, str, z2);
    }

    private static LottieResult<LottieComposition> fromJsonReaderSyncInternal(JsonReader jsonReader, String str, boolean z2) {
        LottieComposition lottieComposition;
        try {
            if (str == null) {
                lottieComposition = null;
            } else {
                try {
                    lottieComposition = LottieCompositionCache.getInstance().get(str);
                } catch (Exception e2) {
                    LottieResult<LottieComposition> lottieResult = new LottieResult<>(e2);
                    if (z2) {
                        Utils.closeQuietly(jsonReader);
                    }
                    return lottieResult;
                }
            }
            if (lottieComposition != null) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(lottieComposition);
                if (z2) {
                    Utils.closeQuietly(jsonReader);
                }
                return lottieResult2;
            }
            LottieComposition lottieComposition2 = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition2);
            }
            LottieResult<LottieComposition> lottieResult3 = new LottieResult<>(lottieComposition2);
            if (z2) {
                Utils.closeQuietly(jsonReader);
            }
            return lottieResult3;
        } catch (Throwable th) {
            if (z2) {
                Utils.closeQuietly(jsonReader);
            }
            throw th;
        }
    }

    public static LottieTask<LottieComposition> fromJsonSource(final Source source, final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonSourceSync(source, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Utils.closeQuietly(source);
            }
        });
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(Source source, String str) {
        return fromJsonSourceSync(source, str, true);
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(Source source, String str, boolean z2) {
        return fromJsonReaderSyncInternal(JsonReader.of(Okio.buffer(source)), str, z2);
    }

    public static LottieTask<LottieComposition> fromJsonString(final String str, final String str2) {
        return cache(str2, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonStringSync(str, str2);
            }
        }, null);
    }

    public static LottieResult<LottieComposition> fromJsonStringSync(String str, String str2) {
        return fromJsonSourceSync(Okio.source(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, int i2) {
        return fromRawRes(context, i2, rawResCacheKey(context, i2));
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, final int i2, final String str) throws Throwable {
        final WeakReference weakReference = new WeakReference(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("s>WG\b\u001f}\u0007aM\u000e3\bJ{\u0013KA\u001cAs^\b", (short) (ZN.Xd() ^ 29445), (short) (ZN.Xd() ^ 23419))).getMethod(ZO.xd("~rGAupN\u0001\u000f\fKLp\u001d\bHmt\u0005R\u000b", (short) (FB.Xd() ^ 16327), (short) (FB.Xd() ^ 10995)), new Class[0]);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieCompositionFactory.lambda$fromRawRes$3(weakReference, context2, i2, str);
                }
            }, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i2) {
        return fromRawResSync(context, i2, rawResCacheKey(context, i2));
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i2, String str) throws Throwable {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("M`\u000eLlk\u000f6Z\u001dj!s+N$m^.;\u000fi[", (short) (OY.Xd() ^ 6051), (short) (OY.Xd() ^ 21406))).getMethod(Ig.wd("T\u0005\u0004@8iG3e{y,", (short) (C1607wl.Xd() ^ 19425)), new Class[0]);
            try {
                method.setAccessible(true);
                BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(((Resources) method.invoke(context, objArr)).openRawResource(i2)));
                if (isZipCompressed(bufferedSourceBuffer).booleanValue()) {
                    return fromZipStreamSync(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
                }
                if (!isGzipCompressed(bufferedSourceBuffer).booleanValue()) {
                    return fromJsonReaderSync(JsonReader.of(bufferedSourceBuffer), str);
                }
                try {
                    return fromJsonInputStreamSync(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
                } catch (IOException e2) {
                    return new LottieResult<>((Throwable) e2);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Resources.NotFoundException e4) {
            return new LottieResult<>((Throwable) e4);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static LottieTask<LottieComposition> fromUrl(final Context context, final String str, final String str2) {
        return cache(str2, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.lambda$fromUrl$0(context, str, str2);
            }
        }, null);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(final Context context, final ZipInputStream zipInputStream, final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Utils.closeQuietly(zipInputStream);
            }
        });
    }

    public static LottieTask<LottieComposition> fromZipStream(final Context context, final ZipInputStream zipInputStream, final String str, boolean z2) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
            }
        }, z2 ? new Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Utils.closeQuietly(zipInputStream);
            }
        } : null);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str) {
        return fromZipStream((Context) null, zipInputStream, str);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str, boolean z2) {
        return fromZipStream(null, zipInputStream, str, z2);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str, boolean z2) {
        try {
            return fromZipStreamSyncInternal(context, zipInputStream, str);
        } finally {
            if (z2) {
                Utils.closeQuietly(zipInputStream);
            }
        }
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str, boolean z2) {
        return fromZipStreamSync(null, zipInputStream, str, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:352:0x02a0 A[Catch: IOException -> 0x06b4, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b4, blocks: (B:285:0x0022, B:293:0x0072, B:299:0x00b9, B:300:0x00be, B:301:0x00c5, B:303:0x00dd, B:305:0x00e3, B:306:0x00e6, B:312:0x0127, B:314:0x0140, B:315:0x0145, B:316:0x014c, B:318:0x0164, B:320:0x016a, B:326:0x01a9, B:328:0x01c1, B:329:0x01c6, B:330:0x01cd, B:332:0x01e5, B:334:0x01eb, B:336:0x021a, B:340:0x023c, B:343:0x0250, B:350:0x029a, B:354:0x02c9, B:357:0x02e5, B:406:0x0432, B:359:0x02eb, B:361:0x0309, B:363:0x0313, B:408:0x0445, B:410:0x045b, B:364:0x031e, B:366:0x032e, B:368:0x034e, B:369:0x0353, B:370:0x035a, B:398:0x03eb, B:400:0x03f5, B:402:0x0408, B:404:0x0422, B:405:0x042d, B:391:0x0399, B:393:0x03ac, B:395:0x03c2, B:397:0x03e0, B:413:0x046b, B:414:0x046f, B:352:0x02a0, B:416:0x0471, B:417:0x0475, B:419:0x0477, B:420:0x047b, B:422:0x047d, B:423:0x0481, B:283:0x001c, B:282:0x0013, B:371:0x035f, B:379:0x0380, B:389:0x0397, B:388:0x0394), top: B:496:0x0013, inners: #2, #4, #7, #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x03f5 A[Catch: IOException -> 0x06b4, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b4, blocks: (B:285:0x0022, B:293:0x0072, B:299:0x00b9, B:300:0x00be, B:301:0x00c5, B:303:0x00dd, B:305:0x00e3, B:306:0x00e6, B:312:0x0127, B:314:0x0140, B:315:0x0145, B:316:0x014c, B:318:0x0164, B:320:0x016a, B:326:0x01a9, B:328:0x01c1, B:329:0x01c6, B:330:0x01cd, B:332:0x01e5, B:334:0x01eb, B:336:0x021a, B:340:0x023c, B:343:0x0250, B:350:0x029a, B:354:0x02c9, B:357:0x02e5, B:406:0x0432, B:359:0x02eb, B:361:0x0309, B:363:0x0313, B:408:0x0445, B:410:0x045b, B:364:0x031e, B:366:0x032e, B:368:0x034e, B:369:0x0353, B:370:0x035a, B:398:0x03eb, B:400:0x03f5, B:402:0x0408, B:404:0x0422, B:405:0x042d, B:391:0x0399, B:393:0x03ac, B:395:0x03c2, B:397:0x03e0, B:413:0x046b, B:414:0x046f, B:352:0x02a0, B:416:0x0471, B:417:0x0475, B:419:0x0477, B:420:0x047b, B:422:0x047d, B:423:0x0481, B:283:0x001c, B:282:0x0013, B:371:0x035f, B:379:0x0380, B:389:0x0397, B:388:0x0394), top: B:496:0x0013, inners: #2, #4, #7, #9, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSyncInternal(android.content.Context r19, java.util.zip.ZipInputStream r20, java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSyncInternal(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):com.airbnb.lottie.LottieResult");
    }

    private static Boolean isGzipCompressed(BufferedSource bufferedSource) {
        return matchesMagicBytes(bufferedSource, GZIP_MAGIC);
    }

    private static boolean isNightMode(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("H\rpVK\u0019Bzd#\"HivvP\u0010P\u0006BwAm", (short) (C1499aX.Xd() ^ (-21226)))).getMethod(EO.Od("N\u001cz6;\u0007\u0015T\u0001caO", (short) (ZN.Xd() ^ 24440)), new Class[0]);
        try {
            method.setAccessible(true);
            return (((Resources) method.invoke(context, objArr)).getConfiguration().uiMode & 48) == 32;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Boolean isZipCompressed(BufferedSource bufferedSource) {
        return matchesMagicBytes(bufferedSource, ZIP_MAGIC);
    }

    static /* synthetic */ void lambda$cache$18(String str, AtomicBoolean atomicBoolean, LottieComposition lottieComposition) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    static /* synthetic */ void lambda$cache$19(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    static /* synthetic */ void lambda$fromJsonInputStream$7(boolean z2, InputStream inputStream) {
        if (z2) {
            Utils.closeQuietly(inputStream);
        }
    }

    static /* synthetic */ LottieResult lambda$fromRawRes$3(WeakReference weakReference, Context context, int i2, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i2, str);
    }

    static /* synthetic */ LottieResult lambda$fromUrl$0(Context context, String str, String str2) throws Exception {
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    private static Boolean matchesMagicBytes(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : bArr) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return false;
                }
            }
            bufferedSourcePeek.close();
            return true;
        } catch (Exception e2) {
            Logger.error("Failed to check zip file header", e2);
            return false;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    private static void notifyTaskCacheIdleListeners(boolean z2) {
        ArrayList arrayList = new ArrayList(taskIdleListeners);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((LottieTaskIdleListener) arrayList.get(i2)).onIdleChanged(z2);
        }
    }

    private static String rawResCacheKey(Context context, int i2) {
        return "rawRes" + (isNightMode(context) ? "_night_" : "_day_") + i2;
    }

    public static void registerLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        taskIdleListeners.add(lottieTaskIdleListener);
        lottieTaskIdleListener.onIdleChanged(taskCache.size() == 0);
    }

    public static void setMaxCacheSize(int i2) {
        LottieCompositionCache.getInstance().resize(i2);
    }

    public static void unregisterLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        taskIdleListeners.remove(lottieTaskIdleListener);
    }
}
