package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.AndroidPredicates;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactoryProvider;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.EncodedCountingMemoryCacheFactory;
import com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory;
import com.facebook.imagepipeline.cache.InstrumentedMemoryCache;
import com.facebook.imagepipeline.cache.InstrumentedMemoryCacheBitmapMemoryCacheFactory;
import com.facebook.imagepipeline.decoder.DefaultImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.platform.PlatformDecoderFactory;
import com.facebook.imagepipeline.producers.ExperimentalThreadHandoffProducerQueueImpl;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueueImpl;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.imagepipeline.transcoder.MultiImageTranscoderFactory;
import com.facebook.imagepipeline.transcoder.SimpleImageTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePipelineFactory {
    private static final Class<?> TAG = ImagePipelineFactory.class;
    private static boolean sForceSingleInstance = false;
    private static ImagePipeline sImagePipeline = null;

    @Nullable
    private static ImagePipelineFactory sInstance = null;

    @Nullable
    private AnimatedFactory mAnimatedFactory;

    @Nullable
    private CountingMemoryCache<CacheKey, CloseableImage> mBitmapCountingMemoryCache;

    @Nullable
    private InstrumentedMemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final CloseableReferenceFactory mCloseableReferenceFactory;
    private final ImagePipelineConfigInterface mConfig;

    @Nullable
    private ImmutableMap<String, BufferedDiskCache> mDynamicBufferedDiskCaches;

    @Nullable
    private Map<String, FileCache> mDynamicFileCaches;

    @Nullable
    private CountingMemoryCache<CacheKey, PooledByteBuffer> mEncodedCountingMemoryCache;

    @Nullable
    private InstrumentedMemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;

    @Nullable
    private ImageDecoder mImageDecoder;

    @Nullable
    private ImageTranscoderFactory mImageTranscoderFactory;

    @Nullable
    private BufferedDiskCache mMainBufferedDiskCache;

    @Nullable
    private FileCache mMainFileCache;

    @Nullable
    private PlatformBitmapFactory mPlatformBitmapFactory;

    @Nullable
    private PlatformDecoder mPlatformDecoder;

    @Nullable
    private ProducerFactory mProducerFactory;

    @Nullable
    private ProducerSequenceFactory mProducerSequenceFactory;

    @Nullable
    private BufferedDiskCache mSmallImageBufferedDiskCache;

    @Nullable
    private FileCache mSmallImageFileCache;
    private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    public ImagePipelineFactory(ImagePipelineConfigInterface imagePipelineConfigInterface) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ImagePipelineConfig()");
        }
        ImagePipelineConfigInterface imagePipelineConfigInterface2 = (ImagePipelineConfigInterface) Preconditions.checkNotNull(imagePipelineConfigInterface);
        this.mConfig = imagePipelineConfigInterface2;
        this.mThreadHandoffProducerQueue = imagePipelineConfigInterface2.getExperiments().isExperimentalThreadHandoffQueueEnabled() ? new ExperimentalThreadHandoffProducerQueueImpl(imagePipelineConfigInterface.getExecutorSupplier().forLightweightBackgroundTasks()) : new ThreadHandoffProducerQueueImpl(imagePipelineConfigInterface.getExecutorSupplier().forLightweightBackgroundTasks());
        this.mCloseableReferenceFactory = new CloseableReferenceFactory(imagePipelineConfigInterface.getCloseableReferenceLeakTracker());
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    private ImagePipeline createImagePipeline() {
        return new ImagePipeline(getProducerSequenceFactory(), this.mConfig.getRequestListeners(), this.mConfig.getRequestListener2s(), this.mConfig.isPrefetchEnabledSupplier(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), this.mThreadHandoffProducerQueue, this.mConfig.getExperiments().getSuppressBitmapPrefetchingSupplier(), this.mConfig.getExperiments().isLazyDataSource(), this.mConfig.getCallerContextVerifier(), this.mConfig);
    }

    public static synchronized void forceSingleInstance() {
        sForceSingleInstance = true;
    }

    @Nullable
    private AnimatedFactory getAnimatedFactory() {
        if (this.mAnimatedFactory == null) {
            this.mAnimatedFactory = AnimatedFactoryProvider.getAnimatedFactory(getPlatformBitmapFactory(), this.mConfig.getExecutorSupplier(), getBitmapCountingMemoryCache(), this.mConfig.getExperiments().getDownscaleFrameToDrawableDimensions(), this.mConfig.getExperiments().getUseBalancedAnimationStrategy(), this.mConfig.getExperiments().getAnimationRenderFpsLimit(), this.mConfig.getExecutorServiceForAnimatedImages());
        }
        return this.mAnimatedFactory;
    }

    private ImmutableMap<String, BufferedDiskCache> getDynamicBufferedDiskCaches() {
        if (this.mDynamicBufferedDiskCaches == null) {
            HashMap map = new HashMap();
            for (Map.Entry<String, FileCache> entry : getDynamicFileCaches().entrySet()) {
                map.put(entry.getKey(), new BufferedDiskCache(entry.getValue(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker()));
            }
            this.mDynamicBufferedDiskCaches = ImmutableMap.copyOf((Map) map);
        }
        return this.mDynamicBufferedDiskCaches;
    }

    private Map<String, FileCache> getDynamicFileCaches() {
        if (this.mDynamicFileCaches == null) {
            this.mDynamicFileCaches = new HashMap();
            if (this.mConfig.getDynamicDiskCacheConfigMap() != null) {
                for (Map.Entry<String, DiskCacheConfig> entry : this.mConfig.getDynamicDiskCacheConfigMap().entrySet()) {
                    this.mDynamicFileCaches.put(entry.getKey(), this.mConfig.getFileCacheFactory().get(entry.getValue()));
                }
            }
        }
        return this.mDynamicFileCaches;
    }

    private ImageDecoder getImageDecoder() {
        ImageDecoder gifDecoder;
        ImageDecoder webPDecoder;
        if (this.mImageDecoder == null) {
            if (this.mConfig.getImageDecoder() != null) {
                this.mImageDecoder = this.mConfig.getImageDecoder();
            } else {
                AnimatedFactory animatedFactory = getAnimatedFactory();
                if (animatedFactory != null) {
                    gifDecoder = animatedFactory.getGifDecoder();
                    webPDecoder = animatedFactory.getWebPDecoder();
                } else {
                    gifDecoder = null;
                    webPDecoder = null;
                }
                if (this.mConfig.getImageDecoderConfig() == null) {
                    this.mImageDecoder = new DefaultImageDecoder(gifDecoder, webPDecoder, getPlatformDecoder());
                } else {
                    this.mImageDecoder = new DefaultImageDecoder(gifDecoder, webPDecoder, getPlatformDecoder(), this.mConfig.getImageDecoderConfig().getCustomImageDecoders());
                    ImageFormatChecker.getInstance().setCustomImageFormatCheckers(this.mConfig.getImageDecoderConfig().getCustomImageFormats());
                }
            }
        }
        return this.mImageDecoder;
    }

    private ImageTranscoderFactory getImageTranscoderFactory() {
        if (this.mImageTranscoderFactory == null) {
            if (this.mConfig.getImageTranscoderFactory() == null && this.mConfig.getImageTranscoderType() == null && this.mConfig.getExperiments().isNativeCodeDisabled()) {
                this.mImageTranscoderFactory = new SimpleImageTranscoderFactory(this.mConfig.getExperiments().getMaxBitmapSize());
            } else {
                this.mImageTranscoderFactory = new MultiImageTranscoderFactory(this.mConfig.getExperiments().getMaxBitmapSize(), this.mConfig.getExperiments().getUseDownsamplingRatioForResizing(), this.mConfig.getImageTranscoderFactory(), this.mConfig.getImageTranscoderType(), this.mConfig.getExperiments().isEnsureTranscoderLibraryLoaded());
            }
        }
        return this.mImageTranscoderFactory;
    }

    public static ImagePipelineFactory getInstance() {
        return (ImagePipelineFactory) Preconditions.checkNotNull(sInstance, "ImagePipelineFactory was not initialized!");
    }

    private ProducerFactory getProducerFactory() {
        if (this.mProducerFactory == null) {
            this.mProducerFactory = this.mConfig.getExperiments().getProducerFactoryMethod().createProducerFactory(this.mConfig.getContext(), this.mConfig.getPoolFactory().getSmallByteArrayPool(), getImageDecoder(), this.mConfig.getProgressiveJpegConfig(), this.mConfig.getDownsampleMode(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isDecodeCancellationEnabled(), this.mConfig.getExecutorSupplier(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), getDynamicBufferedDiskCaches(), this.mConfig.getCacheKeyFactory(), getPlatformBitmapFactory(), this.mConfig.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.mConfig.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.mConfig.getExperiments().getMaxBitmapSize(), getCloseableReferenceFactory(), this.mConfig.getExperiments().getKeepCancelledFetchAsLowPriority(), this.mConfig.getExperiments().getTrackedKeysSize());
        }
        return this.mProducerFactory;
    }

    private ProducerSequenceFactory getProducerSequenceFactory() throws Throwable {
        boolean useBitmapPrepareToDraw = this.mConfig.getExperiments().getUseBitmapPrepareToDraw();
        if (this.mProducerSequenceFactory == null) {
            Context context = this.mConfig.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH^\f\f\u0013\u0005\u0019\u0016", (short) (C1499aX.Xd() ^ (-8708)), (short) (C1499aX.Xd() ^ (-12920)))).getMethod(Jg.Wd("\t/\u000b\u0001|\u0006nt=dDa4<}3\u001d\u0014\nm\u000f", (short) (C1580rY.Xd() ^ (-3441)), (short) (C1580rY.Xd() ^ (-26896))), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                short sXd = (short) (C1633zX.Xd() ^ (-10048));
                short sXd2 = (short) (C1633zX.Xd() ^ (-31785));
                int[] iArr = new int["s\u0015kckf9XjVCp\\\u0016\u001c\"1\r\u0006Mp\u0003Z".length()];
                QB qb = new QB("s\u0015kckf9XjVCp\\\u0016\u001c\"1\r\u0006Mp\u0003Z");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (FB.Xd() ^ 5000);
                short sXd4 = (short) (FB.Xd() ^ 26909);
                int[] iArr2 = new int["zw*\u001bz_n\u001f,X[\u0014{fhpup".length()];
                QB qb2 = new QB("zw*\u001bz_n\u001f,X[\u0014{fhpup");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    this.mProducerSequenceFactory = new ProducerSequenceFactory((ContentResolver) method2.invoke(context2, objArr2), getProducerFactory(), this.mConfig.getNetworkFetcher(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().isWebpSupportEnabled(), this.mThreadHandoffProducerQueue, this.mConfig.getDownsampleMode(), useBitmapPrepareToDraw, this.mConfig.getExperiments().isPartialImageCachingEnabled(), this.mConfig.isDiskCacheEnabled(), getImageTranscoderFactory(), this.mConfig.getExperiments().isEncodedMemoryCacheProbingEnabled(), this.mConfig.getExperiments().isDiskCacheProbingEnabled(), this.mConfig.getExperiments().getAllowDelay(), this.mConfig.getCustomProducerSequenceFactories());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return this.mProducerSequenceFactory;
    }

    private BufferedDiskCache getSmallImageBufferedDiskCache() {
        if (this.mSmallImageBufferedDiskCache == null) {
            this.mSmallImageBufferedDiskCache = new BufferedDiskCache(getSmallImageFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mSmallImageBufferedDiskCache;
    }

    public static synchronized boolean hasBeenInitialized() {
        return sInstance != null;
    }

    public static synchronized void initialize(Context context) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("ImagePipelineFactory#initialize");
        }
        initialize(ImagePipelineConfig.newBuilder(context).build());
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public static synchronized void initialize(ImagePipelineConfigInterface imagePipelineConfigInterface) {
        if (sInstance != null) {
            FLog.w(TAG, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (sForceSingleInstance) {
                return;
            }
        }
        sInstance = new ImagePipelineFactory(imagePipelineConfigInterface);
    }

    public static void setInstance(ImagePipelineFactory imagePipelineFactory) {
        sInstance = imagePipelineFactory;
    }

    public static synchronized void shutDown() {
        ImagePipelineFactory imagePipelineFactory = sInstance;
        if (imagePipelineFactory != null) {
            imagePipelineFactory.getBitmapMemoryCache().removeAll(AndroidPredicates.True());
            sInstance.getEncodedMemoryCache().removeAll(AndroidPredicates.True());
            sInstance = null;
        }
    }

    @Nullable
    public DrawableFactory getAnimatedDrawableFactory(@Nullable Context context) {
        AnimatedFactory animatedFactory = getAnimatedFactory();
        if (animatedFactory == null) {
            return null;
        }
        return animatedFactory.getAnimatedDrawableFactory(context);
    }

    public CountingMemoryCache<CacheKey, CloseableImage> getBitmapCountingMemoryCache() {
        if (this.mBitmapCountingMemoryCache == null) {
            this.mBitmapCountingMemoryCache = this.mConfig.getBitmapMemoryCacheFactory().create(this.mConfig.getBitmapMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry(), this.mConfig.getBitmapMemoryCacheTrimStrategy(), this.mConfig.getExperiments().getShouldStoreCacheEntrySize(), this.mConfig.getExperiments().getShouldIgnoreCacheSizeMismatch(), this.mConfig.getBitmapMemoryCacheEntryStateObserver());
        }
        return this.mBitmapCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
        if (this.mBitmapMemoryCache == null) {
            this.mBitmapMemoryCache = InstrumentedMemoryCacheBitmapMemoryCacheFactory.get(getBitmapCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mBitmapMemoryCache;
    }

    public CloseableReferenceFactory getCloseableReferenceFactory() {
        return this.mCloseableReferenceFactory;
    }

    public CountingMemoryCache<CacheKey, PooledByteBuffer> getEncodedCountingMemoryCache() {
        if (this.mEncodedCountingMemoryCache == null) {
            this.mEncodedCountingMemoryCache = EncodedCountingMemoryCacheFactory.get(this.mConfig.getEncodedMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry(), this.mConfig.getEncodedMemoryCacheTrimStrategy());
        }
        return this.mEncodedCountingMemoryCache;
    }

    public InstrumentedMemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCache() {
        if (this.mEncodedMemoryCache == null) {
            this.mEncodedMemoryCache = EncodedMemoryCacheFactory.get(this.mConfig.getEncodedMemoryCacheOverride() != null ? this.mConfig.getEncodedMemoryCacheOverride() : getEncodedCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mEncodedMemoryCache;
    }

    public ImagePipeline getImagePipeline() {
        if (sImagePipeline == null) {
            sImagePipeline = createImagePipeline();
        }
        return sImagePipeline;
    }

    public BufferedDiskCache getMainBufferedDiskCache() {
        if (this.mMainBufferedDiskCache == null) {
            this.mMainBufferedDiskCache = new BufferedDiskCache(getMainFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mMainBufferedDiskCache;
    }

    public FileCache getMainFileCache() {
        if (this.mMainFileCache == null) {
            this.mMainFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getMainDiskCacheConfig());
        }
        return this.mMainFileCache;
    }

    public PlatformBitmapFactory getPlatformBitmapFactory() {
        if (this.mPlatformBitmapFactory == null) {
            this.mPlatformBitmapFactory = PlatformBitmapFactoryProvider.buildPlatformBitmapFactory(this.mConfig.getPoolFactory(), getPlatformDecoder(), getCloseableReferenceFactory());
        }
        return this.mPlatformBitmapFactory;
    }

    public PlatformDecoder getPlatformDecoder() {
        if (this.mPlatformDecoder == null) {
            this.mPlatformDecoder = PlatformDecoderFactory.buildPlatformDecoder(this.mConfig.getPoolFactory(), this.mConfig.getExperiments().isGingerbreadDecoderEnabled(), this.mConfig.getExperiments().getShouldUseDecodingBufferHelper(), this.mConfig.getExperiments().getPlatformDecoderOptions());
        }
        return this.mPlatformDecoder;
    }

    public FileCache getSmallImageFileCache() {
        if (this.mSmallImageFileCache == null) {
            this.mSmallImageFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getSmallImageDiskCacheConfig());
        }
        return this.mSmallImageFileCache;
    }

    @Nullable
    public String reportData() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper("ImagePipelineFactory");
        CountingMemoryCache<CacheKey, CloseableImage> countingMemoryCache = this.mBitmapCountingMemoryCache;
        if (countingMemoryCache != null) {
            stringHelper.add("bitmapCountingMemoryCache", countingMemoryCache.getDebugData());
        }
        CountingMemoryCache<CacheKey, PooledByteBuffer> countingMemoryCache2 = this.mEncodedCountingMemoryCache;
        if (countingMemoryCache2 != null) {
            stringHelper.add("encodedCountingMemoryCache", countingMemoryCache2.getDebugData());
        }
        return stringHelper.toString();
    }
}
