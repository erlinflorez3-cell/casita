package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\u0007nj?]JΤHDɟ\u0004*=j<9*[ҸuCIUb\u00050\ngN\u0016i5ЂxSJ\u001d\t.x\u0019.\u0010ǉ\u0017&\u0019\u001d6Zom5\u0014ږ[\u0002g\u0003;\u001d `(~ю#I!8O(v)E\u0012Ð0xG~Bj\r{\u0007`ŏ$\u0007'\u000f'tg|8\u000fǕ{\u000361\r\u0002B|)&ܦ\u001b\u0016\u0014T_?\r%cdѰ^\u007f<#1k\u00035T\"β!\bxK\u0012\u0001'U-\u0010֝u~_\u000e\"-+}\u000f$þD%\f_o$'YQ*֧nV/\u0006\u000b\u0014\rj\u0006T\u0382E\u00115;+~\b<5;ɉq\tW\u0010pZ\u007f)c|ЕCH:9L3f\u007fc\u0002ϒl\u007f\u0003\u0013!6#/pgƄrVg#0lw\u007f3\u0018̽[\u0011U\u0018oUm2r)̫HL7U\u0017G{?0]®U$@19\u0004\u0002vF.Ѐ#)oa\u0003jHn$5ݳUr\u0010\u001at\\d3m\u0017ԁvt\u0018[7l\u0007,\nY؆z@C/A(N}j0Ҝk&\u00113L~7\bp2ޕu\u0002eASic>c\u0019Π2\bCp$pfpURȟzp)@h\u0003\u0010&}\u000b\u0090*[9M\u001344Z3_ª3\u0011\n,dY|7a!Ә.G[AG\u001biRvOɞn%w}\f\u0011IZ~'ýK\nXC>>UPjzòAO\u000e\u0002&_gzM|p$\u001dm{N\u0015`ߡowD!7\u0017)`\u0004sծj;l_v*')~@ӀY15u2\u0003pZb1߂m\u001d\u001e0\"vrQ\n+ш\u0018*M\ts{T9]\u0005μ\u0011K`J{P|3!dݚ\u001f8)\u000bcECU\u001f\\ߘ2w\u001co\r\u0002o\\{)ϏD=l\u0012\\{\u0016\u001ed\u0018ϩP\u0004?W\u000b\u0017>P&3ß`\u0011q\u0006:Z\tb\u000fyǭ_-wdke\u000b]\u007f-\u0086JUwd\u0010R\u0013\u001e\u007fzʥ}ͱwx"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hka>p\u000ehA1xO\r", "", "u(E", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d", "", "1n\\:b5-S'\u000e[e(~", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8", "2`]4X9Hc'\u0006\u000fK,\u000b\t>", "", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u=", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOo", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_H", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;l", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X", "4tb2U6Q3\"zwe,{g/b\u0010*", "4tb2U6Q3\"zwe,{u/l\u007f$\n@", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000f", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c", "=uT?e0=S", ">q^C\\+>`", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017T", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6m", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUw", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactNativeFeatureFlagsCxxInterop {
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.loadLibrary("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @JvmStatic
    public static final native boolean batchRenderingUpdatesInEventLoop();

    @JvmStatic
    public static final native boolean commonTestFlag();

    @JvmStatic
    public static final native boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    @JvmStatic
    public static final native void dangerouslyReset();

    @JvmStatic
    public static final native boolean destroyFabricSurfacesInReactInstanceManager();

    @JvmStatic
    public static final native boolean enableAlignItemsBaselineOnFabricIOS();

    @JvmStatic
    public static final native boolean enableAndroidMixBlendModeProp();

    @JvmStatic
    public static final native boolean enableBackgroundStyleApplicator();

    @JvmStatic
    public static final native boolean enableCleanTextInputYogaNode();

    @JvmStatic
    public static final native boolean enableEagerRootViewAttachment();

    @JvmStatic
    public static final native boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    @JvmStatic
    public static final native boolean enableFabricLogs();

    @JvmStatic
    public static final native boolean enableFabricRendererExclusively();

    @JvmStatic
    public static final native boolean enableGranularShadowTreeStateReconciliation();

    @JvmStatic
    public static final native boolean enableIOSViewClipToPaddingBox();

    @JvmStatic
    public static final native boolean enableLayoutAnimationsOnIOS();

    @JvmStatic
    public static final native boolean enableLongTaskAPI();

    @JvmStatic
    public static final native boolean enableMicrotasks();

    @JvmStatic
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @JvmStatic
    public static final native boolean enableReportEventPaintTime();

    @JvmStatic
    public static final native boolean enableSynchronousStateUpdates();

    @JvmStatic
    public static final native boolean enableUIConsistency();

    @JvmStatic
    public static final native boolean enableViewRecycling();

    @JvmStatic
    public static final native boolean excludeYogaFromRawProps();

    @JvmStatic
    public static final native boolean fetchImagesInViewPreallocation();

    @JvmStatic
    public static final native boolean fixIncorrectScrollViewStateUpdateOnAndroid();

    @JvmStatic
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @JvmStatic
    public static final native boolean fixMissedFabricStateUpdatesOnAndroid();

    @JvmStatic
    public static final native boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @JvmStatic
    public static final native boolean forceBatchingMountItemsOnAndroid();

    @JvmStatic
    public static final native boolean fuseboxEnabledDebug();

    @JvmStatic
    public static final native boolean fuseboxEnabledRelease();

    @JvmStatic
    public static final native boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    @JvmStatic
    public static final native boolean lazyAnimationCallbacks();

    @JvmStatic
    public static final native boolean loadVectorDrawablesOnImages();

    @JvmStatic
    public static final native void override(Object obj);

    @JvmStatic
    public static final native boolean setAndroidLayoutDirection();

    @JvmStatic
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @JvmStatic
    public static final native boolean useFabricInterop();

    @JvmStatic
    public static final native boolean useImmediateExecutorInAndroidBridgeless();

    @JvmStatic
    public static final native boolean useModernRuntimeScheduler();

    @JvmStatic
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @JvmStatic
    public static final native boolean useNewReactImageViewBackgroundDrawing();

    @JvmStatic
    public static final native boolean useOptimisedViewPreallocationOnAndroid();

    @JvmStatic
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @JvmStatic
    public static final native boolean useRuntimeShadowNodeReferenceUpdate();

    @JvmStatic
    public static final native boolean useRuntimeShadowNodeReferenceUpdateOnLayout();

    @JvmStatic
    public static final native boolean useStateAlignmentMechanism();

    @JvmStatic
    public static final native boolean useTurboModuleInterop();
}
