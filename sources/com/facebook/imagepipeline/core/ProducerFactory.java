package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BoundedLinkedHashSet;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.BitmapPrepareProducer;
import com.facebook.imagepipeline.producers.BitmapProbeProducer;
import com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer;
import com.facebook.imagepipeline.producers.DataFetchProducer;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.DelayProducer;
import com.facebook.imagepipeline.producers.DiskCacheReadProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.EncodedCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.producers.EncodedProbeProducer;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.LocalThumbnailBitmapSdk29Producer;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import com.facebook.imagepipeline.producers.NetworkFetchProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.PartialDiskCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessorProducer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.imagepipeline.producers.SwallowResultProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThrottlingProducer;
import com.facebook.imagepipeline.producers.ThumbnailBranchProducer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class ProducerFactory {
    private static final int MAX_SIMULTANEOUS_REQUESTS = 5;
    protected AssetManager mAssetManager;
    protected final MemoryCache<CacheKey, CloseableImage> mBitmapMemoryCache;
    protected boolean mBitmapPrepareToDrawForPrefetch;
    protected final int mBitmapPrepareToDrawMaxSizeBytes;
    protected final int mBitmapPrepareToDrawMinSizeBytes;
    protected final ByteArrayPool mByteArrayPool;
    protected final CacheKeyFactory mCacheKeyFactory;
    protected final CloseableReferenceFactory mCloseableReferenceFactory;
    protected ContentResolver mContentResolver;
    protected final boolean mDecodeCancellationEnabled;
    protected final BufferedDiskCache mDefaultBufferedDiskCache;
    protected final BoundedLinkedHashSet<CacheKey> mDiskCacheHistory;
    protected final DownsampleMode mDownsampleMode;

    @Nullable
    protected final Map<String, BufferedDiskCache> mDynamicBufferedDiskCaches;
    protected final MemoryCache<CacheKey, PooledByteBuffer> mEncodedMemoryCache;
    protected final BoundedLinkedHashSet<CacheKey> mEncodedMemoryCacheHistory;
    protected final ExecutorSupplier mExecutorSupplier;
    protected final ImageDecoder mImageDecoder;
    protected final boolean mKeepCancelledFetchAsLowPriority;
    protected final int mMaxBitmapSize;
    protected final PlatformBitmapFactory mPlatformBitmapFactory;
    protected final PooledByteBufferFactory mPooledByteBufferFactory;
    protected final ProgressiveJpegConfig mProgressiveJpegConfig;
    protected final boolean mResizeAndRotateEnabledForNetwork;
    protected Resources mResources;
    protected final BufferedDiskCache mSmallImageBufferedDiskCache;

    public ProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, DownsampleMode downsampleMode, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, @Nullable Map<String, BufferedDiskCache> map, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i2, int i3, boolean z4, int i4, CloseableReferenceFactory closeableReferenceFactory, boolean z5, int i5) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("+d\u000b;e2\u0003+%C>l*\u0003'E\u0011=b\u0013H\u0006]", (short) (Od.Xd() ^ (-28858)))).getMethod(EO.Od("#v\u0016\u007fy\u001f\u0005c\u00154KXI@'0{m9R\u0005", (short) (Od.Xd() ^ (-10289))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Qd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (OY.Xd() ^ 16303))).getMethod(C1593ug.zd("\u0012\u0011!p\u001e\u001e%\u0017!(\u0007\u001b*'%0 .", (short) (OY.Xd() ^ 1128), (short) (OY.Xd() ^ 3692)), new Class[0]);
            try {
                method2.setAccessible(true);
                this.mContentResolver = (ContentResolver) method2.invoke(context2, objArr2);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.od("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (C1580rY.Xd() ^ (-12552)))).getMethod(C1561oA.Kd("\u000b\n\u001ag\u0018\u0019\u0016\u0014\u000f\u000e\"\u0018\u001f\u001ft\"\")\u001b/,", (short) (ZN.Xd() ^ 680)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Context context3 = (Context) method3.invoke(context, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(Wg.Zd("\u001e\u0016{qV<#XqiWE\u001e\u000f\u0005*#;&\u0017ojV", (short) (OY.Xd() ^ 30506), (short) (OY.Xd() ^ 14609))).getMethod(C1561oA.Xd("\u0019\u0018(\u0007\u001b*'.,\u001e!0", (short) (C1580rY.Xd() ^ (-32584))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        this.mResources = (Resources) method4.invoke(context3, objArr4);
                        short sXd = (short) (C1580rY.Xd() ^ (-29046));
                        int[] iArr = new int["*8/>4/+u4AAH2<C}{))0\u001a.+".length()];
                        QB qb = new QB("*8/>4/+u4AAH2<C}{))0\u001a.+");
                        int i6 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i6] = xuXd.fK((sXd ^ i6) + xuXd.CK(iKK));
                            i6++;
                        }
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(new String(iArr, 0, i6)).getMethod(Qg.kd("\u0003\u007f\u000eY\b\u0007\u0002}vs\u0006y~|P{y~n\u0001{", (short) (C1580rY.Xd() ^ (-11902)), (short) (C1580rY.Xd() ^ (-30983))), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            Context context4 = (Context) method5.invoke(context, objArr5);
                            short sXd2 = (short) (C1580rY.Xd() ^ (-21403));
                            short sXd3 = (short) (C1580rY.Xd() ^ (-9710));
                            int[] iArr2 = new int["u\u0002v\u0004\u007fxr;ozx}muz3Grpuewr".length()];
                            QB qb2 = new QB("u\u0002v\u0004\u007fxr;ozx}muz3Grpuewr");
                            int i7 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i7] = xuXd2.fK(sXd2 + i7 + xuXd2.CK(iKK2) + sXd3);
                                i7++;
                            }
                            Class<?> cls = Class.forName(new String(iArr2, 0, i7));
                            Class<?>[] clsArr = new Class[0];
                            Object[] objArr6 = new Object[0];
                            short sXd4 = (short) (C1499aX.Xd() ^ (-15064));
                            int[] iArr3 = new int["fcq=nm^lj".length()];
                            QB qb3 = new QB("fcq=nm^lj");
                            int i8 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i8] = xuXd3.fK(sXd4 + i8 + xuXd3.CK(iKK3));
                                i8++;
                            }
                            Method method6 = cls.getMethod(new String(iArr3, 0, i8), clsArr);
                            try {
                                method6.setAccessible(true);
                                this.mAssetManager = (AssetManager) method6.invoke(context4, objArr6);
                                this.mByteArrayPool = byteArrayPool;
                                this.mImageDecoder = imageDecoder;
                                this.mProgressiveJpegConfig = progressiveJpegConfig;
                                this.mDownsampleMode = downsampleMode;
                                this.mResizeAndRotateEnabledForNetwork = z2;
                                this.mDecodeCancellationEnabled = z3;
                                this.mExecutorSupplier = executorSupplier;
                                this.mPooledByteBufferFactory = pooledByteBufferFactory;
                                this.mBitmapMemoryCache = memoryCache;
                                this.mEncodedMemoryCache = memoryCache2;
                                this.mDefaultBufferedDiskCache = bufferedDiskCache;
                                this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
                                this.mDynamicBufferedDiskCaches = map;
                                this.mCacheKeyFactory = cacheKeyFactory;
                                this.mPlatformBitmapFactory = platformBitmapFactory;
                                this.mEncodedMemoryCacheHistory = new BoundedLinkedHashSet<>(i5);
                                this.mDiskCacheHistory = new BoundedLinkedHashSet<>(i5);
                                this.mBitmapPrepareToDrawMinSizeBytes = i2;
                                this.mBitmapPrepareToDrawMaxSizeBytes = i3;
                                this.mBitmapPrepareToDrawForPrefetch = z4;
                                this.mMaxBitmapSize = i4;
                                this.mCloseableReferenceFactory = closeableReferenceFactory;
                                this.mKeepCancelledFetchAsLowPriority = z5;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    @Deprecated
    public ProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z2, boolean z3, boolean z4, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, @Nullable Map<String, BufferedDiskCache> map, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i2, int i3, boolean z5, int i4, CloseableReferenceFactory closeableReferenceFactory, boolean z6, int i5) {
        this(context, byteArrayPool, imageDecoder, progressiveJpegConfig, z2 ? DownsampleMode.ALWAYS : DownsampleMode.AUTO, z3, z4, executorSupplier, pooledByteBufferFactory, memoryCache, memoryCache2, bufferedDiskCache, bufferedDiskCache2, map, cacheKeyFactory, platformBitmapFactory, i2, i3, z5, i4, closeableReferenceFactory, z6, i5);
    }

    public static AddImageTransformMetaDataProducer newAddImageTransformMetaDataProducer(Producer<EncodedImage> producer) {
        return new AddImageTransformMetaDataProducer(producer);
    }

    public static BranchOnSeparateImagesProducer newBranchOnSeparateImagesProducer(Producer<EncodedImage> producer, Producer<EncodedImage> producer2) {
        return new BranchOnSeparateImagesProducer(producer, producer2);
    }

    public <T> Producer<T> newBackgroundThreadHandoffProducer(Producer<T> producer, ThreadHandoffProducerQueue threadHandoffProducerQueue) {
        return new ThreadHandoffProducer(producer, threadHandoffProducerQueue);
    }

    public BitmapMemoryCacheGetProducer newBitmapMemoryCacheGetProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheGetProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public BitmapMemoryCacheKeyMultiplexProducer newBitmapMemoryCacheKeyMultiplexProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheKeyMultiplexProducer(this.mCacheKeyFactory, producer);
    }

    public BitmapMemoryCacheProducer newBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapMemoryCacheProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public BitmapPrepareProducer newBitmapPrepareProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapPrepareProducer(producer, this.mBitmapPrepareToDrawMinSizeBytes, this.mBitmapPrepareToDrawMaxSizeBytes, this.mBitmapPrepareToDrawForPrefetch);
    }

    public BitmapProbeProducer newBitmapProbeProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new BitmapProbeProducer(this.mEncodedMemoryCache, this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory, this.mEncodedMemoryCacheHistory, this.mDiskCacheHistory, producer);
    }

    public DataFetchProducer newDataFetchProducer() {
        return new DataFetchProducer(this.mPooledByteBufferFactory);
    }

    public DecodeProducer newDecodeProducer(Producer<EncodedImage> producer) {
        return new DecodeProducer(this.mByteArrayPool, this.mExecutorSupplier.forDecode(), this.mImageDecoder, this.mProgressiveJpegConfig, this.mDownsampleMode, this.mResizeAndRotateEnabledForNetwork, this.mDecodeCancellationEnabled, producer, this.mMaxBitmapSize, this.mCloseableReferenceFactory, null, Suppliers.BOOLEAN_FALSE);
    }

    public DelayProducer newDelayProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new DelayProducer(producer, this.mExecutorSupplier.scheduledExecutorServiceForBackgroundTasks());
    }

    public DiskCacheReadProducer newDiskCacheReadProducer(Producer<EncodedImage> producer) {
        return new DiskCacheReadProducer(this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mDynamicBufferedDiskCaches, this.mCacheKeyFactory, producer);
    }

    public DiskCacheWriteProducer newDiskCacheWriteProducer(Producer<EncodedImage> producer) {
        return new DiskCacheWriteProducer(this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mDynamicBufferedDiskCaches, this.mCacheKeyFactory, producer);
    }

    public EncodedCacheKeyMultiplexProducer newEncodedCacheKeyMultiplexProducer(Producer<EncodedImage> producer) {
        return new EncodedCacheKeyMultiplexProducer(this.mCacheKeyFactory, this.mKeepCancelledFetchAsLowPriority, producer);
    }

    public Producer<EncodedImage> newEncodedMemoryCacheProducer(Producer<EncodedImage> producer) {
        return new EncodedMemoryCacheProducer(this.mEncodedMemoryCache, this.mCacheKeyFactory, producer);
    }

    public EncodedProbeProducer newEncodedProbeProducer(Producer<EncodedImage> producer) {
        return new EncodedProbeProducer(this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory, this.mEncodedMemoryCacheHistory, this.mDiskCacheHistory, producer);
    }

    public LocalAssetFetchProducer newLocalAssetFetchProducer() {
        return new LocalAssetFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mAssetManager);
    }

    public LocalContentUriFetchProducer newLocalContentUriFetchProducer() {
        return new LocalContentUriFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalContentUriThumbnailFetchProducer newLocalContentUriThumbnailFetchProducer() {
        return new LocalContentUriThumbnailFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalExifThumbnailProducer newLocalExifThumbnailProducer() {
        return new LocalExifThumbnailProducer(this.mExecutorSupplier.forThumbnailProducer(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public LocalFileFetchProducer newLocalFileFetchProducer() {
        return new LocalFileFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory);
    }

    public LocalResourceFetchProducer newLocalResourceFetchProducer() {
        return new LocalResourceFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mResources);
    }

    public LocalThumbnailBitmapSdk29Producer newLocalThumbnailBitmapSdk29Producer() {
        return new LocalThumbnailBitmapSdk29Producer(this.mExecutorSupplier.forBackgroundTasks(), this.mContentResolver);
    }

    public LocalVideoThumbnailProducer newLocalVideoThumbnailProducer() {
        return new LocalVideoThumbnailProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mContentResolver);
    }

    public Producer<EncodedImage> newNetworkFetchProducer(NetworkFetcher networkFetcher) {
        return new NetworkFetchProducer(this.mPooledByteBufferFactory, this.mByteArrayPool, networkFetcher);
    }

    public PartialDiskCacheProducer newPartialDiskCacheProducer(Producer<EncodedImage> producer) {
        return new PartialDiskCacheProducer(this.mDefaultBufferedDiskCache, this.mCacheKeyFactory, this.mPooledByteBufferFactory, this.mByteArrayPool, producer);
    }

    public PostprocessedBitmapMemoryCacheProducer newPostprocessorBitmapMemoryCacheProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new PostprocessedBitmapMemoryCacheProducer(this.mBitmapMemoryCache, this.mCacheKeyFactory, producer);
    }

    public PostprocessorProducer newPostprocessorProducer(Producer<CloseableReference<CloseableImage>> producer) {
        return new PostprocessorProducer(producer, this.mPlatformBitmapFactory, this.mExecutorSupplier.forBackgroundTasks());
    }

    public QualifiedResourceFetchProducer newQualifiedResourceFetchProducer() {
        return new QualifiedResourceFetchProducer(this.mExecutorSupplier.forLocalStorageRead(), this.mPooledByteBufferFactory, this.mContentResolver);
    }

    public ResizeAndRotateProducer newResizeAndRotateProducer(Producer<EncodedImage> producer, boolean z2, ImageTranscoderFactory imageTranscoderFactory) {
        return new ResizeAndRotateProducer(this.mExecutorSupplier.forBackgroundTasks(), this.mPooledByteBufferFactory, producer, z2, imageTranscoderFactory);
    }

    public <T> SwallowResultProducer<T> newSwallowResultProducer(Producer<T> producer) {
        return new SwallowResultProducer<>(producer);
    }

    public <T> ThrottlingProducer<T> newThrottlingProducer(Producer<T> producer) {
        return new ThrottlingProducer<>(5, this.mExecutorSupplier.forLightweightBackgroundTasks(), producer);
    }

    public ThumbnailBranchProducer newThumbnailBranchProducer(ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return new ThumbnailBranchProducer(thumbnailProducerArr);
    }
}
