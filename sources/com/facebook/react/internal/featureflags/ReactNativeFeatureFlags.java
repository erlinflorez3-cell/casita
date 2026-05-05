package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9LeN/ZS8\u000fs{:Cc$\bCCU \r(ߢOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e~k\u0017'2pu\u00068\u0016uK@xtd\u000bf7j>\b\r\u0019\u001aXNV{CIY\u0015*0nz\u0001WUS\u0013%*\u0006l&G#%m\\B`l\f@u(KoP[?_^\u0003\u0014\u0012\u000fZ5\u001b\u000faL1\u0007<}\u001b3b\u001b\u0007\u0001a\u0006\b\bwK\u0015\u0001'U1\u0010x <f\u0011,\u0015YUSb;,j\u0017i`:-qT,Q^!@w)\u0002SAL\u0014\u0014;`.[ -\rV9\u0003\bk@~\b%GH\u0001oL/%.9q>cl_xS\u0019|=B\nU$1\u0019\u0007!\nZTe]!b\u0011i1\u007fF\u0004M\u0017\u0010gW\u0006\u0004\u001fhH/L6U\u001bG{?4]*\u007faG?9k0N\u000bl?\u000bn\u0006ki\u0001N\u0007'7\u001cEH!\f\tJ+\n4VbwD\u0011{\"\u001b\fF\u000e!@twj'k\u0015\u0017Uv\u000b\u0003M\f\u0010k4/=g\u0011\u0004\u000e\u0006?%8}Wq3yR%\u001a\u0006A+\u000bf\u000bZS:`#-j8V\u0010(w*J\u0015\u0011[8M\u001844Z7_a]N\u0011EZA+\u000f&_1\u0016\r|K$1ojyQ\u0007^\u0006\to\u0016~\u00101En0WYQc#VY0\u0014L|Q3ExH`uy_L\u001b &_\nN. IS?=A\u0011--xĈβILx\u0015\u001aS W\u0013|(\u0015\u0002mvm\u0016\u001c\t,\u000fp\u0011T\u001d\u001d0)vrQ\u000e+\u0005BgT._c\u0003\u0011\"C\u0012x\u0011\u000eTNf\u0003K$f+\u000f%:|c3\n,e\u001c\u0006JG\u0015\u0010c0tv\u007fpF>t\u0014\nrh^up\nu2i>\u0010^GD0]\u0005\u0003pN1|PH\u0017n%3vG+u\u001f>[FG}\u0015\rr\u00129\\iv+o,:tdz\u007fQ~,^q'g߀_ܭqmSŌ[\\\u001d\r#\u0002Ap\"\u001ck\"\u0005[9ׁ<Ӓw\u0018>\u05cdގfB"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hc", "", "u(E", "/bR2f:H`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hiL)\r\u0013gK1D", "/bR2f:H`\u0004\f\u0005o0{\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d", "", "1n\\:b5-S'\u000e[e(~", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8", "2`]4X9Hc'\u0006\u000fK,\u000b\t>", "", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u=", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOo", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_H", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;l", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X", "4tb2U6Q3\"zwe,{g/b\u0010*", "4tb2U6Q3\"zwe,{u/l\u007f$\n@", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000f", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c", "=uT?e0=S", ">q^C\\+>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hx[5\u001e\tXA1D", "Adc\u000eV*>a'\t\bI9\u0007\u001a3d\u007f5", "<df\u000eV*>a'\t\bI9\u0007\u001a3d\u007f5", "Adc\u000eV*>a'\t\bI9\u0007\u001a3d\u007f5:-\u0001\u0013\u0015VK\u0017;\u0004/9Xw-7t\u0016*[C", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017T", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6m", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUw", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactNativeFeatureFlags {
    public static final ReactNativeFeatureFlags INSTANCE = new ReactNativeFeatureFlags();
    private static ReactNativeFeatureFlagsAccessor accessor = null;
    private static Function0<? extends ReactNativeFeatureFlagsAccessor> accessorProvider = null;

    static {
        ReactNativeFeatureFlags$accessorProvider$1 reactNativeFeatureFlags$accessorProvider$1 = new Function0<ReactNativeFeatureFlagsCxxAccessor>() { // from class: com.facebook.react.internal.featureflags.ReactNativeFeatureFlags$accessorProvider$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ReactNativeFeatureFlagsCxxAccessor invoke() {
                return new ReactNativeFeatureFlagsCxxAccessor();
            }
        };
        accessorProvider = reactNativeFeatureFlags$accessorProvider$1;
        accessor = reactNativeFeatureFlags$accessorProvider$1.invoke();
    }

    private ReactNativeFeatureFlags() {
    }

    @JvmStatic
    public static final boolean batchRenderingUpdatesInEventLoop() {
        return accessor.batchRenderingUpdatesInEventLoop();
    }

    @JvmStatic
    public static final boolean commonTestFlag() {
        return accessor.commonTestFlag();
    }

    @JvmStatic
    public static final boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        return accessor.completeReactInstanceCreationOnBgThreadOnAndroid();
    }

    @JvmStatic
    public static final void dangerouslyReset() {
        accessor.dangerouslyReset();
        accessor = accessorProvider.invoke();
    }

    @JvmStatic
    public static final boolean destroyFabricSurfacesInReactInstanceManager() {
        return accessor.destroyFabricSurfacesInReactInstanceManager();
    }

    @JvmStatic
    public static final boolean enableAlignItemsBaselineOnFabricIOS() {
        return accessor.enableAlignItemsBaselineOnFabricIOS();
    }

    @JvmStatic
    public static final boolean enableAndroidMixBlendModeProp() {
        return accessor.enableAndroidMixBlendModeProp();
    }

    @JvmStatic
    public static final boolean enableBackgroundStyleApplicator() {
        return accessor.enableBackgroundStyleApplicator();
    }

    @JvmStatic
    public static final boolean enableCleanTextInputYogaNode() {
        return accessor.enableCleanTextInputYogaNode();
    }

    @JvmStatic
    public static final boolean enableEagerRootViewAttachment() {
        return accessor.enableEagerRootViewAttachment();
    }

    @JvmStatic
    public static final boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        return accessor.enableEventEmitterRetentionDuringGesturesOnAndroid();
    }

    @JvmStatic
    public static final boolean enableFabricLogs() {
        return accessor.enableFabricLogs();
    }

    @JvmStatic
    public static final boolean enableFabricRendererExclusively() {
        return accessor.enableFabricRendererExclusively();
    }

    @JvmStatic
    public static final boolean enableGranularShadowTreeStateReconciliation() {
        return accessor.enableGranularShadowTreeStateReconciliation();
    }

    @JvmStatic
    public static final boolean enableIOSViewClipToPaddingBox() {
        return accessor.enableIOSViewClipToPaddingBox();
    }

    @JvmStatic
    public static final boolean enableLayoutAnimationsOnIOS() {
        return accessor.enableLayoutAnimationsOnIOS();
    }

    @JvmStatic
    public static final boolean enableLongTaskAPI() {
        return accessor.enableLongTaskAPI();
    }

    @JvmStatic
    public static final boolean enableMicrotasks() {
        return accessor.enableMicrotasks();
    }

    @JvmStatic
    public static final boolean enablePropsUpdateReconciliationAndroid() {
        return accessor.enablePropsUpdateReconciliationAndroid();
    }

    @JvmStatic
    public static final boolean enableReportEventPaintTime() {
        return accessor.enableReportEventPaintTime();
    }

    @JvmStatic
    public static final boolean enableSynchronousStateUpdates() {
        return accessor.enableSynchronousStateUpdates();
    }

    @JvmStatic
    public static final boolean enableUIConsistency() {
        return accessor.enableUIConsistency();
    }

    @JvmStatic
    public static final boolean enableViewRecycling() {
        return accessor.enableViewRecycling();
    }

    @JvmStatic
    public static final boolean excludeYogaFromRawProps() {
        return accessor.excludeYogaFromRawProps();
    }

    @JvmStatic
    public static final boolean fetchImagesInViewPreallocation() {
        return accessor.fetchImagesInViewPreallocation();
    }

    @JvmStatic
    public static final boolean fixIncorrectScrollViewStateUpdateOnAndroid() {
        return accessor.fixIncorrectScrollViewStateUpdateOnAndroid();
    }

    @JvmStatic
    public static final boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        return accessor.fixMappingOfEventPrioritiesBetweenFabricAndReact();
    }

    @JvmStatic
    public static final boolean fixMissedFabricStateUpdatesOnAndroid() {
        return accessor.fixMissedFabricStateUpdatesOnAndroid();
    }

    @JvmStatic
    public static final boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        return accessor.fixMountingCoordinatorReportedPendingTransactionsOnAndroid();
    }

    @JvmStatic
    public static final boolean forceBatchingMountItemsOnAndroid() {
        return accessor.forceBatchingMountItemsOnAndroid();
    }

    @JvmStatic
    public static final boolean fuseboxEnabledDebug() {
        return accessor.fuseboxEnabledDebug();
    }

    @JvmStatic
    public static final boolean fuseboxEnabledRelease() {
        return accessor.fuseboxEnabledRelease();
    }

    @JvmStatic
    public static final boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        return accessor.initEagerTurboModulesOnNativeModulesQueueAndroid();
    }

    @JvmStatic
    public static final boolean lazyAnimationCallbacks() {
        return accessor.lazyAnimationCallbacks();
    }

    @JvmStatic
    public static final boolean loadVectorDrawablesOnImages() {
        return accessor.loadVectorDrawablesOnImages();
    }

    @JvmStatic
    public static final void override(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        accessor.override(provider);
    }

    @JvmStatic
    public static final boolean setAndroidLayoutDirection() {
        return accessor.setAndroidLayoutDirection();
    }

    @JvmStatic
    public static final boolean traceTurboModulePromiseRejectionsOnAndroid() {
        return accessor.traceTurboModulePromiseRejectionsOnAndroid();
    }

    @JvmStatic
    public static final boolean useFabricInterop() {
        return accessor.useFabricInterop();
    }

    @JvmStatic
    public static final boolean useImmediateExecutorInAndroidBridgeless() {
        return accessor.useImmediateExecutorInAndroidBridgeless();
    }

    @JvmStatic
    public static final boolean useModernRuntimeScheduler() {
        return accessor.useModernRuntimeScheduler();
    }

    @JvmStatic
    public static final boolean useNativeViewConfigsInBridgelessMode() {
        return accessor.useNativeViewConfigsInBridgelessMode();
    }

    @JvmStatic
    public static final boolean useNewReactImageViewBackgroundDrawing() {
        return accessor.useNewReactImageViewBackgroundDrawing();
    }

    @JvmStatic
    public static final boolean useOptimisedViewPreallocationOnAndroid() {
        return accessor.useOptimisedViewPreallocationOnAndroid();
    }

    @JvmStatic
    public static final boolean useOptimizedEventBatchingOnAndroid() {
        return accessor.useOptimizedEventBatchingOnAndroid();
    }

    @JvmStatic
    public static final boolean useRuntimeShadowNodeReferenceUpdate() {
        return accessor.useRuntimeShadowNodeReferenceUpdate();
    }

    @JvmStatic
    public static final boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        return accessor.useRuntimeShadowNodeReferenceUpdateOnLayout();
    }

    @JvmStatic
    public static final boolean useStateAlignmentMechanism() {
        return accessor.useStateAlignmentMechanism();
    }

    @JvmStatic
    public static final boolean useTurboModuleInterop() {
        return accessor.useTurboModuleInterop();
    }

    public final void setAccessorProvider$ReactAndroid_release(Function0<? extends ReactNativeFeatureFlagsAccessor> newAccessorProvider) {
        Intrinsics.checkNotNullParameter(newAccessorProvider, "newAccessorProvider");
        accessorProvider = newAccessorProvider;
        accessor = newAccessorProvider.invoke();
    }
}
