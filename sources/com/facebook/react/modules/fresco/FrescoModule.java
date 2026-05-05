package com.facebook.react.modules.fresco;

import android.content.Context;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.modules.network.OkHttpCompat;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
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
@ReactModule(name = "\u00061#0\u001f*\u0007(\u001c,\"\u001a", needsEagerInit = true)
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a%yCQU\"}(\rWNugvϺb\u000bQ\u001b\u000e\u0016~o2^kތ{-?2pno3{om9\u000fuf\u0005N4Z7\u0015E. ?X\u0016\u0005}[M\"\u0011^D\u0001@`\u0012e\u00070\u00114D0\u0007$\\uUNH\u001beJ5)\u0003wKf'\u000e8ƊQ\rT^g2|f.1N:M\u0017;R1\u000bbaE\u0003MxU\u0005\u0017/73OseAp\u0002*\u0014Y[ոar4iMWn\u001e?+}v\u0012dV.\u0006\u000f\u0014\rj\u0019T\u001aoN<C2f6!y\t;YNg\u001a^p\u0013Au~\u001d3\u0018K+g.-e*A'gO{3 d7It/ul\u000e\u000f(ahH]?XX=vV`Բ?ъ\bpj̣z\u0012>U\u00181\u0012\u0010\\#{ڞgޠ'!sȵ\u0019Xu{\u001db~R\u0018X~\u0001xÅ\u0018֖.\r$\\Js\u0013{!bf=)O2S5\u0004^ʹ,Ϣ{<)طŔRk"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006w25g{*\u0001N#.[AES>\u001d%oa\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/=a\b)\u0001U -]J;J0-\u0011Fh9\u0003l,[5\u0005NLJ5XOy=i", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u0011$\u0014Qw\u0018;\u0007,5#{*Dm_2VR;x5\u001a\u0013ho\u0003us9K\u0001\u000fQK^3\\(", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "7lP4X\u0017B^\u0019\u0006~g,", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh7", "1kT.e\u0016G2\u0019\r\nk6\u0011", "", "6`b\u000fX,G7\"\u0003\nb(\u0004\rDe~\b\u000fO\u0001$ Cv\u0015P", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`WR3\t\u0007YL(yD>#\u0011,\u0013\u007fEu\u0001Uy\u00161lp-Z\u001bG\u0001\u0019~A~];\u001dP", "7lP4X\u0017B^\u0019\u0006~g,Z\u00138f\u0004*", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PL", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$k\u000eEVVu]Np=\u0011\u001cd\u0014\u0018/\u0015\u0001[A/rO7&\f5IK9r\u000e\f_q=frBA\u0014Ry\u001cyJ)FPb`}I\u0017\tS", "1n]3\\.", "5dc\u0016`(@S\u0004\u0003\u0006^3\u0001\u0012/", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9\\", ">h_2_0GS", "1kT.e\u001a>\\'\u0003\nb=|g+t{", "", "5dc\u001bT4>", "", "7mXA\\(EW.~", "7me._0=O(~", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class FrescoModule extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable, LifecycleEventListener, TurboModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized = false;
    private final boolean clearOnDestroy;
    private ImagePipelineConfig config;
    private ImagePipeline pipeline;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u001b\u007fјnjO0L͜P.hS2şs{J$cҕw٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007oDI\u0004~\u000e\u0016\u001d9Zom;\u0014o\u0006Gn}N\u0005N<R<\b\f\u0019\u001aXPV{CIY\u000f*0nt\u0001W]Y\u0013\u001b*\u0006l\"Wȧ/ʄR6PǍ.F=&\u001bipR}ۂ<ƊQ\rNÖܴ\u0011\u0002"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006w25g{*\u0001N#.[AES>\u001d%oawdm4Yr0KVW\u0002", "", "u(E", "\u001c@<\u0012", "", "6`b\u000fX,G7\"\u0003\nb(\u0004\rDe~", "", "5dc\u0011X-:c \u000eXh5}\r1", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PL", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "5dc\u0011X-:c \u000eXh5}\r1B\u0010,\u0003?\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImagePipelineConfig getDefaultConfig(ReactContext reactContext) {
            return getDefaultConfigBuilder(reactContext).build();
        }

        @JvmStatic
        public final ImagePipelineConfig.Builder getDefaultConfigBuilder(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new SystraceRequestListener());
            OkHttpClient okHttpClientCreateClient = OkHttpClientProvider.createClient();
            OkHttpCompat.getCookieJarContainer(okHttpClientCreateClient).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(context)));
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Intrinsics.checkNotNull(okHttpClientCreateClient);
            return OkHttpImagePipelineConfigFactory.newBuilder(applicationContext, okHttpClientCreateClient).setNetworkFetcher(new ReactOkHttpNetworkFetcher(okHttpClientCreateClient)).setDownsampleMode(DownsampleMode.AUTO).setRequestListeners(hashSet);
        }

        @JvmStatic
        public final boolean hasBeenInitialized() {
            return FrescoModule.hasBeenInitialized;
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline) {
        this(reactApplicationContext, imagePipeline, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z2) {
        this(reactApplicationContext, imagePipeline, z2, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z2, boolean z3) {
        this(reactApplicationContext, z2, null, 4, null);
        this.pipeline = imagePipeline;
        if (z3) {
            hasBeenInitialized = true;
        }
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, imagePipeline, (4 & i2) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z2) {
        this(reactApplicationContext, z2, null, 4, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z2, ImagePipelineConfig imagePipelineConfig) {
        super(reactApplicationContext);
        this.clearOnDestroy = z2;
        this.config = imagePipelineConfig;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z2, ImagePipelineConfig imagePipelineConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i2 + 2) - (2 | i2) != 0 ? true : z2, (i2 + 4) - (i2 | 4) != 0 ? null : imagePipelineConfig);
    }

    @JvmStatic
    public static final ImagePipelineConfig.Builder getDefaultConfigBuilder(ReactContext reactContext) {
        return Companion.getDefaultConfigBuilder(reactContext);
    }

    private final ImagePipeline getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = Fresco.getImagePipeline();
        }
        return this.pipeline;
    }

    @JvmStatic
    public static final boolean hasBeenInitialized() {
        return Companion.hasBeenInitialized();
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        ImagePipeline imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.clearCaches();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() throws Throwable {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = Companion;
        if (!companion.hasBeenInitialized()) {
            if (this.config == null) {
                Intrinsics.checkNotNull(reactApplicationContext);
                this.config = companion.getDefaultConfig(reactApplicationContext);
            }
            Fresco.initialize(reactApplicationContext.getApplicationContext(), this.config);
            hasBeenInitialized = true;
        } else if (this.config != null) {
            FLog.w(ReactConstants.TAG, "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (Companion.hasBeenInitialized() && this.clearOnDestroy) {
            ImagePipeline imagePipeline = getImagePipeline();
            Intrinsics.checkNotNull(imagePipeline);
            imagePipeline.clearMemoryCaches();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
