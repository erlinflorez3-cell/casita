package com.facebook.imagepipeline.cache;

import bolts.Task;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.instrumentation.FrescoInstrumenter;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wCCU(\u0005*\tUOog\u0005JbŏK\u000f\u0014\u0016\u0001̓4Ikxe܈\u00172PxG\u074cUoS9htL\u0005(2(;\u0002\u0005\u0017\u001a2H\u0016w\u0003Ca\f\u001a0FsBR#M\r\u001a\u0018\bTĨ\u001fK\rg|5\u0001k\u000bzb3\u0007wBf'\u000e1\rQ\u001bHl';yq\"9DO5C*c\u0007\u0015Xs?1F\u0002A\u0013p?'YP\u0004[Da\u0018\u0014C5̠\u0011]\u00011%\u0011_r$'Yb\u0014O^\"@w)\u0011UJ\u0012$\u001e'vE]\u001et\u001c&3#\b\u001a@\u0019\flZ\u0018\u0001q8'%.MYRcx_|S\u001f^9\f\u0005;5Q\u001a\u001f%ih&`C0\u001d\f_MiFMJ^\n\bT\u001c\u001d!f\u0010>\u001c0u\u0015u{Y:%BO[g:Qo\u0010\\\\g%\u001a)ta\bjHn9\u001f\u001aE>!\f\tY-!yol^<\u0013]\u001c\u0003',!C$j\fT!S%~Sv\u000b\u0003M\f*k//Tg\u0011\u0004\u0014g;n3cq\u0012)\u0012V\u0005(W<\u0011\u001a\tjPv$Z\u000bLhüH3,\u0006!\\T\u001c\u0015B? <bEa\u001dj)`\u0003LWq\u0001\u0017\u0003rh>#\u001b3l\u0015wJ\r\u000f\u0011Rlp\u001e\u0002'b\\\u0001n6EA\u007fJa:cI\u00014+67\u0003\u0002\u0014_gz\\|p$\u001em{N6bI_XU\u0015%}W\\21S`\u000be\u007fbX'C\u000f\b:Sn>i\u0018j\u001fF\u000f\u0004zSb+:v\r\bk r,\u0012at\u000ewgb\u001fs>w\b3_JvP~\u001b\u001eLEGor\tC-['K\u0017NҤ1ֵe]q۰~\u0006p\u0018>t\u0014\u000e\u0003Ϧ\u0018̔fQeЦ\fDW[\u0017>P'CÚD\u05f8nw\u0010ȷY@\u001b7`A\u0013u-ИOߵ3}n߿|\u0019~\\s:AvTұ0ʡ.sK͟dmQ1)M\u0002t$2љ`\u000fb\u0011\u0010\u0019\n@?\u001e*M8V\u0006s_ݸ\b֯\u001c6Iݥ3\u0011J\u0011<4ZC^ՄEҰm\u0006\u0018ÿĽJ\u000e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,$", "", "4h[26(<V\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E?\u0005%\u001d\u0011P\u0012Cv\u00031W\u0001 \r", ">n^9X+\u001bg(~Wn-}\t<F{&\u000bJ\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+ud_H\u0011p@$", ">n^9X+\u001bg(~hm9|\u00057s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.;RHk0&#>", "@dP18?>Q)\u000e\u0005k", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "EqXAX\fQS\u0017\u000f\nh9", "7lP4X\n:Q\u001c~hm(\f\u0017\u001er{&\u0002@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001bu\u00120M!7i7\u001e\u0003w]H\u0015R9Jt-GY$", "uKR<`u?O\u0017~wh6\u0003R-a}+{\n\u007f\u001b%M9n@}%\u0013U{#7C|,WK\u0005l0\u001c\u0015ekC\r-*X~/QU\u00184\\Z|J([E\u0018X2\r\u00046U3n!G \t,Vb7f\u0010\u0016#\"\u000bQnL^YHu\u0013u>3rL#]\u0004OIOksl\fg'iN\u0004\u000f\u001e{ \u001bg-B\u0019{A \u007fRuou\u001d\u007f\u007f45:7kUIv\u001f:~0\u001d[\t\u0005\u0012;g>\u000b\b-\u0002D9@qZ2l\u0014OZB%;`Hp$@E\u0011OXpuuMWH2a\u0006\u001eq?>nLcmPX\bY\u0015[2ki\u0007\u0001V\u000e:Ko +Q~I_\u0003\u0015R\u0005 khI\r~\\|\u001cp\"\u001e]\u0014\u0003pu\u0014+<\u0005JU\rn*l\r\u0011\u0004", "Ahi2", "", "5dc \\A>", "u(9", "AsP4\\5@/&~v", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i%|\u00120QL=GA\u001e\u0011>", "/cS\u0018X@\u001f]&Z\tr5zs<o|,\u0005B", "", "9dh", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "1gT0^\u0010GA(z|b5~d<e{\u0004\u0005?a\u001b\u001eGM\n:y%", "", "1kT.e\bEZ", "\u001aa^9g:\bB\u0015\r\u00014", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "1n]AT0Ga", "1n]AT0Gat\r\u000fg*", "1n]AT0Ga\u0007\u0013\u0004\\", "2hb86/>Q\u001fl\u000fg*", "4nd;W\u0017B\\\"~yB4x\u000b/", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", ">h];X+\"[\u0015\u0001z", "5dc", "7r2.a*>Z ~y", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u000ef@GQ", ">q^/X", ">tc", "3mR<W,=7!z|^", "@dP199H[w\u0003\td\nx\u00072e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "@d\\<i,", "EqXAX\u001bH2\u001d\r\u0001<(z\f/", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BufferedDiskCache {
    public static final Companion Companion = new Companion(null);
    private static final Class<?> TAG = BufferedDiskCache.class;
    private final FileCache fileCache;
    private final ImageCacheStatsTracker imageCacheStatsTracker;
    private final PooledByteBufferFactory pooledByteBufferFactory;
    private final PooledByteStreams pooledByteStreams;
    private final Executor readExecutor;
    private final StagingArea stagingArea;
    private final Executor writeExecutor;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\fB%s(\u0002CAVH\u007fxޞQɁkgvϺӂ\u000fF"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,\rT1OWJ5`\\{\u0013", "", "u(E", "\"@6", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BufferedDiskCache(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, Executor readExecutor, Executor writeExecutor, ImageCacheStatsTracker imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.fileCache = fileCache;
        this.pooledByteBufferFactory = pooledByteBufferFactory;
        this.pooledByteStreams = pooledByteStreams;
        this.readExecutor = readExecutor;
        this.writeExecutor = writeExecutor;
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        StagingArea stagingArea = StagingArea.getInstance();
        Intrinsics.checkNotNullExpressionValue(stagingArea, "getInstance()");
        this.stagingArea = stagingArea;
    }

    private final boolean checkInStagingAreaAndFileCache(CacheKey cacheKey) {
        EncodedImage encodedImage = this.stagingArea.get(cacheKey);
        if (encodedImage != null) {
            encodedImage.close();
            FLog.v(TAG, "Found image for %s in staging area", cacheKey.getUriString());
            this.imageCacheStatsTracker.onStagingAreaHit(cacheKey);
            return true;
        }
        FLog.v(TAG, "Did not find image for %s in staging area", cacheKey.getUriString());
        this.imageCacheStatsTracker.onStagingAreaMiss(cacheKey);
        try {
            return this.fileCache.hasKey(cacheKey);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void clearAll$lambda$8(Object obj, BufferedDiskCache this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            this$0.stagingArea.clearAll();
            this$0.fileCache.clearAll();
            return null;
        } finally {
        }
    }

    private final Task<Boolean> containsAsync(final CacheKey cacheKey) {
        try {
            final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_containsAsync");
            Task<Boolean> taskCall = Task.call(new Callable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.containsAsync$lambda$0(objOnBeforeSubmitWork, this, cacheKey);
                }
            }, this.readExecutor);
            Intrinsics.checkNotNullExpressionValue(taskCall, "{\n      val token = Fres…      readExecutor)\n    }");
            return taskCall;
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            Task<Boolean> taskForError = Task.forError(e2);
            Intrinsics.checkNotNullExpressionValue(taskForError, "{\n      // Log failure\n …forError(exception)\n    }");
            return taskForError;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsAsync$lambda$0(Object obj, BufferedDiskCache this$0, CacheKey key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            return Boolean.valueOf(this$0.checkInStagingAreaAndFileCache(key));
        } finally {
        }
    }

    private final Task<EncodedImage> foundPinnedImage(CacheKey cacheKey, EncodedImage encodedImage) {
        FLog.v(TAG, "Found image for %s in staging area", cacheKey.getUriString());
        this.imageCacheStatsTracker.onStagingAreaHit(cacheKey);
        Task<EncodedImage> taskForResult = Task.forResult(encodedImage);
        Intrinsics.checkNotNullExpressionValue(taskForResult, "forResult(pinnedImage)");
        return taskForResult;
    }

    private final Task<EncodedImage> getAsync(final CacheKey cacheKey, final AtomicBoolean atomicBoolean) {
        try {
            final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_getAsync");
            Task<EncodedImage> taskCall = Task.call(new Callable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.getAsync$lambda$4(objOnBeforeSubmitWork, atomicBoolean, this, cacheKey);
                }
            }, this.readExecutor);
            Intrinsics.checkNotNullExpressionValue(taskCall, "{\n      val token = Fres…      readExecutor)\n    }");
            return taskCall;
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            Task<EncodedImage> taskForError = Task.forError(e2);
            Intrinsics.checkNotNullExpressionValue(taskForError, "{\n      // Log failure\n …forError(exception)\n    }");
            return taskForError;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EncodedImage getAsync$lambda$4(Object obj, AtomicBoolean isCancelled, BufferedDiskCache this$0, CacheKey key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            EncodedImage encodedImage = this$0.stagingArea.get(key);
            if (encodedImage != null) {
                FLog.v(TAG, "Found image for %s in staging area", key.getUriString());
                this$0.imageCacheStatsTracker.onStagingAreaHit(key);
            } else {
                FLog.v(TAG, "Did not find image for %s in staging area", key.getUriString());
                this$0.imageCacheStatsTracker.onStagingAreaMiss(key);
                try {
                    PooledByteBuffer fromDiskCache = this$0.readFromDiskCache(key);
                    if (fromDiskCache == null) {
                        return null;
                    }
                    CloseableReference closeableReferenceOf = CloseableReference.of(fromDiskCache);
                    Intrinsics.checkNotNullExpressionValue(closeableReferenceOf, "of(buffer)");
                    try {
                        encodedImage = new EncodedImage((CloseableReference<PooledByteBuffer>) closeableReferenceOf);
                        CloseableReference.closeSafely((CloseableReference<?>) closeableReferenceOf);
                    } catch (Throwable th) {
                        CloseableReference.closeSafely((CloseableReference<?>) closeableReferenceOf);
                        throw th;
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return encodedImage;
            }
            FLog.v(TAG, "Host thread was interrupted, decreasing reference count");
            encodedImage.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                FrescoInstrumenter.markFailure(obj, th2);
                throw th2;
            } finally {
                FrescoInstrumenter.onEndWork(objOnBeginWork);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void probe$lambda$3(Object obj, BufferedDiskCache this$0, CacheKey key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            this$0.fileCache.probe(key);
            return null;
        } finally {
            FrescoInstrumenter.onEndWork(objOnBeginWork);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void put$lambda$6$lambda$5(Object obj, BufferedDiskCache this$0, CacheKey key, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            this$0.writeToDiskCache(key, encodedImage);
        } finally {
        }
    }

    private final PooledByteBuffer readFromDiskCache(CacheKey cacheKey) throws IOException {
        try {
            Class<?> cls = TAG;
            FLog.v(cls, "Disk cache read for %s", cacheKey.getUriString());
            BinaryResource resource = this.fileCache.getResource(cacheKey);
            if (resource == null) {
                FLog.v(cls, "Disk cache miss for %s", cacheKey.getUriString());
                this.imageCacheStatsTracker.onDiskCacheMiss(cacheKey);
                return null;
            }
            FLog.v(cls, "Found entry in disk cache for %s", cacheKey.getUriString());
            this.imageCacheStatsTracker.onDiskCacheHit(cacheKey);
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                PooledByteBuffer pooledByteBufferNewByteBuffer = this.pooledByteBufferFactory.newByteBuffer(inputStreamOpenStream, (int) resource.size());
                inputStreamOpenStream.close();
                FLog.v(cls, "Successful read from disk cache for %s", cacheKey.getUriString());
                return pooledByteBufferNewByteBuffer;
            } catch (Throwable th) {
                inputStreamOpenStream.close();
                throw th;
            }
        } catch (IOException e2) {
            FLog.w(TAG, e2, "Exception reading from cache for %s", cacheKey.getUriString());
            this.imageCacheStatsTracker.onDiskCacheGetFail(cacheKey);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void remove$lambda$7(Object obj, BufferedDiskCache this$0, CacheKey key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objOnBeginWork = FrescoInstrumenter.onBeginWork(obj, null);
        try {
            this$0.stagingArea.remove(key);
            this$0.fileCache.remove(key);
            return null;
        } finally {
        }
    }

    private final void writeToDiskCache(CacheKey cacheKey, final EncodedImage encodedImage) {
        Class<?> cls = TAG;
        FLog.v(cls, "About to write to disk-cache for key %s", cacheKey.getUriString());
        try {
            this.fileCache.insert(cacheKey, new WriterCallback() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda6
                @Override // com.facebook.cache.common.WriterCallback
                public final void write(OutputStream outputStream) throws IOException {
                    BufferedDiskCache.writeToDiskCache$lambda$9(encodedImage, this, outputStream);
                }
            });
            this.imageCacheStatsTracker.onDiskCachePut(cacheKey);
            FLog.v(cls, "Successful disk-cache write for key %s", cacheKey.getUriString());
        } catch (IOException e2) {
            FLog.w(TAG, e2, "Failed to write to disk-cache for key %s", cacheKey.getUriString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeToDiskCache$lambda$9(EncodedImage encodedImage, BufferedDiskCache this$0, OutputStream os) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNull(encodedImage);
        InputStream inputStream = encodedImage.getInputStream();
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this$0.pooledByteStreams.copy(inputStream, os);
    }

    public final void addKeyForAsyncProbing(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.fileCache.probe(key);
    }

    public final Task<Void> clearAll() {
        this.stagingArea.clearAll();
        final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_clearAll");
        try {
            Task<Void> taskCall = Task.call(new Callable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.clearAll$lambda$8(objOnBeforeSubmitWork, this);
                }
            }, this.writeExecutor);
            Intrinsics.checkNotNullExpressionValue(taskCall, "{\n      Task.call(\n     …     writeExecutor)\n    }");
            return taskCall;
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache clear", new Object[0]);
            Task<Void> taskForError = Task.forError(e2);
            Intrinsics.checkNotNullExpressionValue(taskForError, "{\n      // Log failure\n …forError(exception)\n    }");
            return taskForError;
        }
    }

    public final Task<Boolean> contains(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!containsSync(key)) {
            return containsAsync(key);
        }
        Task<Boolean> taskForResult = Task.forResult(true);
        Intrinsics.checkNotNullExpressionValue(taskForResult, "{\n        Task.forResult(true)\n      }");
        return taskForResult;
    }

    public final boolean containsSync(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.stagingArea.containsKey(key) || this.fileCache.hasKeySync(key);
    }

    public final boolean diskCheckSync(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (containsSync(key)) {
            return true;
        }
        return checkInStagingAreaAndFileCache(key);
    }

    public final Task<EncodedImage> get(CacheKey key, AtomicBoolean isCancelled) {
        Task<EncodedImage> async;
        Task<EncodedImage> taskFoundPinnedImage;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            EncodedImage encodedImage = this.stagingArea.get(key);
            return (encodedImage == null || (taskFoundPinnedImage = foundPinnedImage(key, encodedImage)) == null) ? getAsync(key, isCancelled) : taskFoundPinnedImage;
        }
        FrescoSystrace.beginSection("BufferedDiskCache#get");
        try {
            EncodedImage encodedImage2 = this.stagingArea.get(key);
            if (encodedImage2 == null || (async = foundPinnedImage(key, encodedImage2)) == null) {
                async = getAsync(key, isCancelled);
            }
            return async;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final long getSize() {
        return this.fileCache.getSize();
    }

    public final Task<Void> probe(final CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_probe");
            Task<Void> taskCall = Task.call(new Callable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.probe$lambda$3(objOnBeforeSubmitWork, this, key);
                }
            }, this.writeExecutor);
            Intrinsics.checkNotNullExpressionValue(taskCall, "{\n      val token = Fres…     writeExecutor)\n    }");
            return taskCall;
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache probe for %s", key.getUriString());
            Task<Void> taskForError = Task.forError(e2);
            Intrinsics.checkNotNullExpressionValue(taskForError, "{\n      FLog.w(TAG, exce…forError(exception)\n    }");
            return taskForError;
        }
    }

    public final void put(final CacheKey key, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            if (!EncodedImage.isValid(encodedImage)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.stagingArea.put(key, encodedImage);
            final EncodedImage encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImage);
            try {
                final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BufferedDiskCache.put$lambda$6$lambda$5(objOnBeforeSubmitWork, this, key, encodedImageCloneOrNull);
                    }
                });
                return;
            } catch (Exception e2) {
                FLog.w(TAG, e2, "Failed to schedule disk-cache write for %s", key.getUriString());
                this.stagingArea.remove(key, encodedImage);
                EncodedImage.closeSafely(encodedImageCloneOrNull);
                return;
            }
        }
        FrescoSystrace.beginSection("BufferedDiskCache#put");
        try {
            if (!EncodedImage.isValid(encodedImage)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.stagingArea.put(key, encodedImage);
            final EncodedImage encodedImageCloneOrNull2 = EncodedImage.cloneOrNull(encodedImage);
            try {
                final Object objOnBeforeSubmitWork2 = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BufferedDiskCache.put$lambda$6$lambda$5(objOnBeforeSubmitWork2, this, key, encodedImageCloneOrNull2);
                    }
                });
            } catch (Exception e3) {
                FLog.w(TAG, e3, "Failed to schedule disk-cache write for %s", key.getUriString());
                this.stagingArea.remove(key, encodedImage);
                EncodedImage.closeSafely(encodedImageCloneOrNull2);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final Task<Void> remove(final CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.stagingArea.remove(key);
        try {
            final Object objOnBeforeSubmitWork = FrescoInstrumenter.onBeforeSubmitWork("BufferedDiskCache_remove");
            Task<Void> taskCall = Task.call(new Callable() { // from class: com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.remove$lambda$7(objOnBeforeSubmitWork, this, key);
                }
            }, this.writeExecutor);
            Intrinsics.checkNotNullExpressionValue(taskCall, "{\n      val token = Fres…     writeExecutor)\n    }");
            return taskCall;
        } catch (Exception e2) {
            FLog.w(TAG, e2, "Failed to schedule disk-cache remove for %s", key.getUriString());
            Task<Void> taskForError = Task.forError(e2);
            Intrinsics.checkNotNullExpressionValue(taskForError, "{\n      // Log failure\n …forError(exception)\n    }");
            return taskForError;
        }
    }
}
