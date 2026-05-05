package androidx.emoji2.text;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = new FontProviderHelper();

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long j2) {
            this.mTotalMs = j2;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (jUptimeMillis > this.mTotalMs) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.mTotalMs - jUptimeMillis);
        }
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest) {
        super(new FontRequestMetadataLoader(context, fontRequest, DEFAULT_FONTS_CONTRACT));
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, fontRequest, fontProviderHelper));
    }

    public FontRequestEmojiCompatConfig setLoadingExecutor(Executor executor) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public FontRequestEmojiCompatConfig setRetryPolicy(RetryPolicy retryPolicy) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(retryPolicy);
        return this;
    }

    static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final Context mContext;
        private Executor mExecutor;
        private final FontProviderHelper mFontProviderHelper;
        private final Object mLock = new Object();
        private Handler mMainHandler;
        private Runnable mMainHandlerLoadCallback;
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        private ContentObserver mObserver;
        private final FontRequest mRequest;
        private RetryPolicy mRetryPolicy;

        FontRequestMetadataLoader(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) throws Throwable {
            Preconditions.checkNotNull(context, Qg.kd("\u0011<:?/A<f)&2115_!#\\*0&%", (short) (C1580rY.Xd() ^ (-12051)), (short) (C1580rY.Xd() ^ (-3329))));
            short sXd = (short) (ZN.Xd() ^ 12223);
            short sXd2 = (short) (ZN.Xd() ^ 31597);
            int[] iArr = new int["+SQV3EPSBOOy<9EDDHr46o=C98".length()];
            QB qb = new QB("+SQV3EPSBOOy<9EDDHr46o=C98");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Preconditions.checkNotNull(fontRequest, new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1499aX.Xd() ^ (-13348)))).getMethod(C1561oA.yd("\u0010\r\u001fj\u001d\u001c\u001b\u0017\u0004\u0001\u0017\u000b\u0014\u0012i\u0015\u0007\f\u007f\u0012\u0011", (short) (C1633zX.Xd() ^ (-13006))), new Class[0]);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
                this.mRequest = fontRequest;
                this.mFontProviderHelper = fontProviderHelper;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public void setExecutor(Executor executor) {
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(RetryPolicy retryPolicy) {
            synchronized (this.mLock) {
                this.mRetryPolicy = retryPolicy;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = metadataRepoLoaderCallback;
            }
            loadInternal();
        }

        void loadInternal() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                if (this.mExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutorCreateBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                    this.mMyThreadPoolExecutor = threadPoolExecutorCreateBackgroundPriorityExecutor;
                    this.mExecutor = threadPoolExecutorCreateBackgroundPriorityExecutor;
                }
                this.mExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.createMetadata();
                    }
                });
            }
        }

        private FontsContractCompat.FontInfo retrieveFontInfo() {
            try {
                FontsContractCompat.FontFamilyResult fontFamilyResultFetchFonts = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + fontFamilyResultFetchFonts.getStatusCode() + ")");
                }
                FontsContractCompat.FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                if (fonts == null || fonts.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fonts[0];
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }

        private void scheduleRetry(Uri uri, long j2) {
            synchronized (this.mLock) {
                Handler handlerMainHandlerAsync = this.mMainHandler;
                if (handlerMainHandlerAsync == null) {
                    handlerMainHandlerAsync = ConcurrencyHelpers.mainHandlerAsync();
                    this.mMainHandler = handlerMainHandlerAsync;
                }
                if (this.mObserver == null) {
                    AnonymousClass1 anonymousClass1 = new ContentObserver(handlerMainHandlerAsync) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                        AnonymousClass1(Handler handlerMainHandlerAsync2) {
                            super(handlerMainHandlerAsync2);
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z2, Uri uri2) {
                            FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                    this.mObserver = anonymousClass1;
                    this.mFontProviderHelper.registerObserver(this.mContext, uri, anonymousClass1);
                }
                if (this.mMainHandlerLoadCallback == null) {
                    this.mMainHandlerLoadCallback = new Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.loadInternal();
                        }
                    };
                }
                Runnable runnable = this.mMainHandlerLoadCallback;
                Class<?> cls = Class.forName(C1561oA.Yd(".<3B@;7\u0002DI\u0005 :H?HBP", (short) (C1607wl.Xd() ^ 1125)));
                Class<?>[] clsArr = {Class.forName(Xg.qd("\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X}\"\u001c\u001d\u0011\u0013\u001e\u0018", (short) (FB.Xd() ^ 28151), (short) (FB.Xd() ^ 377))), Long.TYPE};
                Object[] objArr = {runnable, Long.valueOf(j2)};
                Method method = cls.getMethod(Jg.Wd("bR\u000b_a[S^+\u000b\\", (short) (Od.Xd() ^ (-9078)), (short) (Od.Xd() ^ (-14559))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handlerMainHandlerAsync2, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 */
        class AnonymousClass1 extends ContentObserver {
            AnonymousClass1(Handler handlerMainHandlerAsync2) {
                super(handlerMainHandlerAsync2);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z2, Uri uri2) {
                FontRequestMetadataLoader.this.loadInternal();
            }
        }

        private void cleanUp() {
            synchronized (this.mLock) {
                this.mCallback = null;
                ContentObserver contentObserver = this.mObserver;
                if (contentObserver != null) {
                    this.mFontProviderHelper.unregisterObserver(this.mContext, contentObserver);
                    this.mObserver = null;
                }
                Handler handler = this.mMainHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mMainHandlerLoadCallback);
                }
                this.mMainHandler = null;
                ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.mExecutor = null;
                this.mMyThreadPoolExecutor = null;
            }
        }

        void createMetadata() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                try {
                    FontsContractCompat.FontInfo fontInfoRetrieveFontInfo = retrieveFontInfo();
                    int resultCode = fontInfoRetrieveFontInfo.getResultCode();
                    if (resultCode == 2) {
                        synchronized (this.mLock) {
                            RetryPolicy retryPolicy = this.mRetryPolicy;
                            if (retryPolicy != null) {
                                long retryDelay = retryPolicy.getRetryDelay();
                                if (retryDelay >= 0) {
                                    scheduleRetry(fontInfoRetrieveFontInfo.getUri(), retryDelay);
                                    return;
                                }
                            }
                        }
                    }
                    if (resultCode != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                    }
                    try {
                        TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);
                        Typeface typefaceBuildTypeface = this.mFontProviderHelper.buildTypeface(this.mContext, fontInfoRetrieveFontInfo);
                        ByteBuffer byteBufferMmap = TypefaceCompatUtil.mmap(this.mContext, null, fontInfoRetrieveFontInfo.getUri());
                        if (byteBufferMmap == null || typefaceBuildTypeface == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        MetadataRepo metadataRepoCreate = MetadataRepo.create(typefaceBuildTypeface, byteBufferMmap);
                        TraceCompat.endSection();
                        synchronized (this.mLock) {
                            EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.mCallback;
                            if (metadataRepoLoaderCallback != null) {
                                metadataRepoLoaderCallback.onLoaded(metadataRepoCreate);
                            }
                        }
                        cleanUp();
                    } catch (Throwable th) {
                        TraceCompat.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.mLock) {
                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.mCallback;
                        if (metadataRepoLoaderCallback2 != null) {
                            metadataRepoLoaderCallback2.onFailed(th2);
                        }
                        cleanUp();
                    }
                }
            }
        }
    }

    public static class FontProviderHelper {
        public FontsContractCompat.FontFamilyResult fetchFonts(Context context, FontRequest fontRequest) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public Typeface buildTypeface(Context context, FontsContractCompat.FontInfo fontInfo) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        public void registerObserver(Context context, Uri uri, ContentObserver contentObserver) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (C1633zX.Xd() ^ (-20216)))).getMethod(Wg.Zd("O9~)\fr[@gUi:@j?\u007f\u000bB", (short) (Od.Xd() ^ (-7428)), (short) (Od.Xd() ^ (-877))), new Class[0]);
            try {
                method.setAccessible(true);
                ((ContentResolver) method.invoke(context, objArr)).registerContentObserver(uri, false, contentObserver);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public void unregisterObserver(Context context, ContentObserver contentObserver) throws Throwable {
            short sXd = (short) (Od.Xd() ^ (-6541));
            int[] iArr = new int["m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017".length()];
            QB qb = new QB("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("dco?hhk]cjEYda[fR`", (short) (C1499aX.Xd() ^ (-26131))), new Class[0]);
            try {
                method.setAccessible(true);
                ((ContentResolver) method.invoke(context, objArr)).unregisterContentObserver(contentObserver);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
