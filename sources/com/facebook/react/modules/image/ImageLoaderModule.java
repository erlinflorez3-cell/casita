package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
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
@ReactModule(name = "\t,\u001f$!\u0007)\u001a\u001c\u001c(")
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tʑA0JeP.hS2şs{J$c$wGCU0}*\teNog\u0005Jb\u000bI\u0013\u000e\u0016\u0007j4կ]xk\u0016\u00172HoG3[{EʠhtL\u0005(2(8\u0002\u0005\u0017\u001a2H\u0016{\u0003Ca\f\u001aؓHpHX\u0015M\u000b\u001c\u0018\u000bTĨ\u001fO\rg|5xl\f:g\"4*OT;o4\u000bN%F\u0003)˼za,.\u0001N;)5W\u0011\bj[m\u0005OwK\t\u0001)=*wxɱ:X\u000e\u001aUHU!mv4]\u001dQ\u000f\u000e7/]jcP<0\b~\n\u0016T\u0004<\u0010όL.;%/\u0016\u001cL\rr\u0002Z\u0001\u0006l]\u0018z\u0010R]9HK9V3f\u007f{k\u001f\\U\u0014\u0007#\u001dQ \u001f%it&`C<\u001b\r\u001aS_bUH|$\nC{\"\td\u0018)2Ow\u0006=\u001f)0-$e\u007fi'/\f\u001aHr\t=\u001a)na\u000fjHn<5*\u007f0\u00172rD\u0013\u001f2d\u001d^:8e\u001c\u0003!D\u001c[@j T!S*~Uv\b\u0003Os\tSN\u0017;g\u0018\u0004\u000e\u0006U\u000f7Cq{\u0010\u0010s=(\bRp/pfpm<^jS:2v\u0017@{\ndf\fAS\u0006\u0007dR:^1\\Cb3\"P\\\u0015\t\u000e\t\u0019\u001c\r\u0004K,\u0013m4v\u001f\u007f~o\u001f\u0002.x\u0012D\u000b\u0011:7QUE\u001b<TP{J{Q\u0019/w\u000eb\u007fLuz3\u0016Fc\n,.\u001cOP]EiÄ\u000bȞ6\u00025զ\u001d\tsUe\u0014=y+~E{?֮iŰnv4ߌ\u0003LUa%0Gl\u0001, f\u0016x\u0010PQõoӝ\u000f[FδC\u000fgKf8+\nuǊ'˽s\"\u0005ކ}]5-.\u0006$9%imm\u007f0\u0010a=9#w2=:ܡq͈U]:ծ\tkg\u0006V\"Rt3FV~\u0010\bp\u0011jMq\t\u0018Я|ެ<W#1\u0004{\u0015B-r\\rH+̳\u0002f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006z-1[}i\u001bu\u00120M*Eg3\u001e\"Pk8\u0017j,$", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u001bu\u00120M*Eg3\u001e\"Dj8\u0014m0Md2GJ$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[9X9\u001c]\"\u000ezq;", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$],C]JucN{?]{W\u0013N)\u001cZ\u001d2", "7lP4X\u0017B^\u0019\u0006~g,", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh7", "1`[9X9\u001c]\"\u000ezq;]\u0005-t\n5\u0010", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#j 3k%\fIJBkA{\u001fqp9\u001ar\rJt6QYb\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`WR3\t\u0007YL(yD>#\u0011,\u0013\u007fEu\u0001Uy\u00161lp-Z\u001bG\u0001\u0019~A~ODcgCH=Cb'n\u0016efi:6\"#;*\u001fhb<S\u007f[\rtRCTgC\u0017\n\u0016 Et[S#y^Kt:.,wu!<e\t\u00018\u001e", "-h\\.Z,)W$~\u0002b5|", "5dc\u0010T3ES&\\\u0005g;|\u001c>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3m`BX<>R\u0006~\u0007n,\u000b\u0018\u0017o\t,\u000bJ\u000e", "3m`BX<>R\u0006~\u0007n,\u000b\u0018=", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "D`[BX", "5dc\u0016`(@S\u0004\u0003\u0006^3\u0001\u0012/", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9\\", "Adc\u0016`(@S\u0004\u0003\u0006^3\u0001\u0012/", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#?f}i\u001bu\u00120M.?v4%\u0019qa\u000fJT", "/a^?g\u0019>_)~\tm", "", "@d`BX:M7\u0018", "", "5dc \\A>", "CqX g9B\\\u001b", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "5dc \\A>E\u001d\u000e}A,x\b/r\u000e", "6dP1X9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", ">qT3X;<V|\u0007v`,", "@d`BX:M7\u0018Z\t=6\r\u00066e", "?tT?l\n:Q\u001c~", "CqX@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "@dV6f;>`\u0006~\u0007n,\u000b\u0018", "", "@d`BX:M", "@d\\<i,+S%\u000fzl;", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private ImagePipeline _imagePipeline;
    private final Object callerContext;
    private ReactCallerContextFactory callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<DataSource<Void>> enqueuedRequests;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓϴt@"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006z-1[}i\u001bu\u00120M*Eg3\u001e\"Pk8\u0017j,\rT1OWJ5`\\{\u0013", "", "u(E", "\u0013QA\u001cE& 3\bxhB!\\\u0003\u0010Ac\u000fk-`", "", "\u0013QA\u001cE&\"<\nZaB\u000bvx\u001cI", "\u0013QA\u001cE&)@x_ZM\n_\u0003\u0010Ac\u000fk-`", "\u001c@<\u0012", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, ImagePipeline imagePipeline, ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePipeline getImagePipeline() {
        ImagePipeline imagePipeline = this._imagePipeline;
        if (imagePipeline != null) {
            return imagePipeline;
        }
        ImagePipeline imagePipeline2 = Fresco.getImagePipeline();
        Intrinsics.checkNotNullExpressionValue(imagePipeline2, "getImagePipeline(...)");
        return imagePipeline2;
    }

    private final void registerRequest(int i2, DataSource<Void> dataSource) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(i2, dataSource);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSource<Void> removeRequest(int i2) {
        DataSource<Void> dataSource;
        synchronized (this.enqueuedRequestMonitor) {
            dataSource = this.enqueuedRequests.get(i2);
            this.enqueuedRequests.remove(i2);
        }
        return dataSource;
    }

    private final void setImagePipeline(ImagePipeline imagePipeline) {
        this._imagePipeline = imagePipeline;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d2) {
        DataSource<Void> dataSourceRemoveRequest = removeRequest((int) d2);
        if (dataSourceRemoveRequest != null) {
            dataSourceRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequest imageRequestBuild = ImageRequestBuilder.newBuilderWithSource(new ImageSource(reactApplicationContext, str, 0.0d, 0.0d, 12, null).getUri()).build();
        Intrinsics.checkNotNullExpressionValue(imageRequestBuild, "build(...)");
        getImagePipeline().fetchDecodedImage(imageRequestBuild, getCallerContext()).subscribe(new BaseDataSubscriber<CloseableReference<CloseableImage>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSize$dataSubscriber$1
            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    CloseableReference<CloseableImage> result = dataSource.getResult();
                    if (result == null) {
                        promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        try {
                            CloseableImage closeableImage = result.get();
                            Intrinsics.checkNotNullExpressionValue(closeableImage, "get(...)");
                            CloseableImage closeableImage2 = closeableImage;
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                            writableMapCreateMap.putInt("width", closeableImage2.getWidth());
                            writableMapCreateMap.putInt("height", closeableImage2.getHeight());
                            promise.resolve(writableMapCreateMap);
                        } catch (Exception e2) {
                            promise.reject("E_GET_SIZE_FAILURE", e2);
                        }
                    } finally {
                        CloseableReference.closeSafely(result);
                    }
                }
            }
        }, CallerThreadExecutor.getInstance());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequestBuilder imageRequestBuilderNewBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(new ImageSource(reactApplicationContext, str, 0.0d, 0.0d, 12, null).getUri());
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderNewBuilderWithSource, "newBuilderWithSource(...)");
        getImagePipeline().fetchDecodedImage(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders(imageRequestBuilderNewBuilderWithSource, readableMap), getCallerContext()).subscribe(new BaseDataSubscriber<CloseableReference<CloseableImage>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSizeWithHeaders$dataSubscriber$1
            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                promise.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    CloseableReference<CloseableImage> result = dataSource.getResult();
                    if (result == null) {
                        promise.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    try {
                        try {
                            CloseableImage closeableImage = result.get();
                            Intrinsics.checkNotNullExpressionValue(closeableImage, "get(...)");
                            CloseableImage closeableImage2 = closeableImage;
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                            writableMapCreateMap.putInt("width", closeableImage2.getWidth());
                            writableMapCreateMap.putInt("height", closeableImage2.getHeight());
                            promise.resolve(writableMapCreateMap);
                        } catch (Exception e2) {
                            promise.reject("E_GET_SIZE_FAILURE", e2);
                        }
                    } finally {
                        CloseableReference.closeSafely(result);
                    }
                }
            }
        }, CallerThreadExecutor.getInstance());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            int size = this.enqueuedRequests.size();
            for (int i2 = 0; i2 < size; i2++) {
                DataSource<Void> dataSourceValueAt = this.enqueuedRequests.valueAt(i2);
                Intrinsics.checkNotNullExpressionValue(dataSourceValueAt, "valueAt(...)");
                dataSourceValueAt.close();
            }
            this.enqueuedRequests.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d2, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i2 = (int) d2;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        ImageRequest imageRequestBuild = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build();
        Intrinsics.checkNotNullExpressionValue(imageRequestBuild, "build(...)");
        DataSource<Void> dataSourcePrefetchToDiskCache = getImagePipeline().prefetchToDiskCache(imageRequestBuild, getCallerContext());
        BaseDataSubscriber<Void> baseDataSubscriber = new BaseDataSubscriber<Void>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onFailureImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    this.this$0.removeRequest(i2);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.getFailureCause());
                } finally {
                    dataSource.close();
                }
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onNewResultImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    try {
                        try {
                            this.this$0.removeRequest(i2);
                            promise.resolve(true);
                        } catch (Exception e2) {
                            promise.reject("E_PREFETCH_FAILURE", e2);
                        }
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i2, dataSourcePrefetchToDiskCache);
        dataSourcePrefetchToDiskCache.subscribe(baseDataSubscriber, CallerThreadExecutor.getInstance());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.react.modules.image.ImageLoaderModule$queryCache$1] */
    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new GuardedAsyncTask<Void, Void>(uris, promise, getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.queryCache.1
            final /* synthetic */ Promise $promise;
            final /* synthetic */ ReadableArray $uris;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                ImagePipeline imagePipeline = ImageLoaderModule.this.getImagePipeline();
                int size = this.$uris.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String string = this.$uris.getString(i2);
                    if (string.length() > 0) {
                        Uri uri = Uri.parse(string);
                        if (imagePipeline.isInBitmapMemoryCache(uri)) {
                            writableMapCreateMap.putString(string, "memory");
                        } else if (imagePipeline.isInDiskCacheSync(uri)) {
                            writableMapCreateMap.putString(string, "disk");
                        }
                    }
                }
                this.$promise.resolve(writableMapCreateMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
