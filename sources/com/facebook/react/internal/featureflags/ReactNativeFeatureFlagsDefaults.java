package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005O2&\u000eј\u0017jg/\u0005h߬2Ra*Wq\n5<[Rs\nO\u001e \f%!O|i.\u0003\u0013`\u0019G'\u0006Dz1@\u0012[\u0007b*\u000f`D6S{S}CQ`#8K4z(F\u0001\u001d\u0001H,\u000f$?\u0001QS$\u0012^B7N\u001b\u0013[\u000e2\u00124@f\u0015fbuXNH\u001b_\u0001Ck\twMf'\u000e2CaULb3%v\u0010 qT\u007f;#2k\u00035T\"SKE\u007fK\u001dhU)q]<]Dg\u0018\u0014C-\u0016!&x4l\u001dQ\u000f\u000em?\u0018iYa&(&|B!\u0005\n\u001c\u0018?H\\/`zP\u0014A\b\u000bSnRHr\u000b\u0006\tuN\u0017S\u0002y?\u0002!tfy;GP}\u0010M\u0013,9\u0019nO]\u001b\")\u001b)k\u0010Q_S\u0007Q\u0011T\u0018qUm2r)\u0016r\n>`\u0018/*\u0013t+m=iS;!\u001a\u0004\u000fX0|\u0013{\u0001S\u0018T\u000fTjt$SB\t:\\\u000bxMq^qp,?ObhO\u0004\u001618\\&>g9XT]\b\u0002j{_P9wlEy\u0007k<Y\u007fr{;_\u0005(a\u0001xZS\u0005h\u0013z~B\u0002\u000e!pp(@k\u0003\u0010&}\u000bbT\u0019@c\n\u001cb.w-%\u001bV(6Bo~Os#n\u001e%l3R\u000508=\u000f\u000fwtp\u001ei?]t\u0003nJEA\u007f7_:\u001e(v]\u0015#5\u0001:\u0014\u0010mZqdlDw\u001c\u0010h\u001c(di/k\u0015U\u0013q8\u0010Y]L!g\u0018aZ-\t*\u0012\u000fijt{Pp~ZxjxQ\u001b+j|l\";\b\u0013\u0002@u\u000f\u0001U\u0014l\u000b\n@\u0010\u0007î]m"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hlN,\t\u0015`P2D", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hx[5\u001e\tXA1D", "u(E", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d", "", "1n\\:b5-S'\u000e[e(~", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u=", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOo", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_H", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;l", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X", "4tb2U6Q3\"zwe,{g/b\u0010*", "4tb2U6Q3\"zwe,{u/l\u007f$\n@", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000f", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017T", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6m", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUw", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ReactNativeFeatureFlagsDefaults implements ReactNativeFeatureFlagsProvider {
    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAlignItemsBaselineOnFabricIOS() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidMixBlendModeProp() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundStyleApplicator() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRendererExclusively() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fetchImagesInViewPreallocation() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixIncorrectScrollViewStateUpdateOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMissedFabricStateUpdatesOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean loadVectorDrawablesOnImages() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNewReactImageViewBackgroundDrawing() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimisedViewPreallocationOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        return false;
    }
}
