package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.common.mapbuffer.MapBufferSoLoader;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fZDkt\nA\u000e0!.J~(,\u001aw\u0015fr96DmHDR[ճ\u0017k\u00124,[*qK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?Aݹw=?a|6\u001b :\">y\r\u00010*P\u0010|zKK\u001a\u00188@v:Z\r[\n\"\u0012\fB(\u0001,eoN<Kt]H;+ɅqBd'g0\u0003R\u0013Kj܋+0\u0012\u001eY?o4NeVΫ\u000bRi?KF\u007fA\u001dhU,qɵ\u0012 =f\u0006,\u0015YTSƵ\u0011no\u0013Xx\u000e=*}k{V\u001c1\u0010|\u0012\fj\u000eTΑE\u0011e;%~\b<8%vaLh\u0002\rO0~oD/%.B[=)viai*~;\n\u0017%\u001eQ\u0014\u001f%ih&`C0\u0005{_Gi@k_\u0015˦w\u0006$\u0012\tz\u0002X\t`K\u000e;\u0014\u0011\\$U;iG;!\u001a\u0011xHu\u0010\u001d`\u0017d\u001aVVR:nDJZ\r\u001at\\d3\u0001\u0001XfB)MJoM\u0012P\".x\u0010<O*@R]\u0006\u0002j{{PɯM/Fg\u000e\u0004\u000e\u0006>\u000f7Cq{\u0010\u0010s=ܴ]\u00052\u0013z~B\u0002\u0011\u000b`6BJH\u00191(\u007fRq$\u0013`c\" BQI\u0019\u000b9x\u0007,hY|7\u0004\u000bl\u001e&l3R'\u001a(\u00031\u0019P\u000b\u0015 k\u0007rD|\u000fF]E__1&\u0004M\u00198\u000bO\u001f~\"+\u000eќj\u0010[zC\u000eU*%F\u001eG\u007fG=A3EȒPJLS{\u000be\u007fRB+\t\u001d\u0012\u000fi\n^k\u0016\u001b\t,\u000f\u001czSbI:v\r&iο\u0003HYoz\u0013G\u0012Y;_Li\u000b\u0003\b]~<\u000b57\u001eS2 &\u000bgECUPF{\"R-a\f\u000e 2\b\b'&#\n40q<\bb\u007f\u0002b?Fpq~lFTp\u0011j`j&,r\rB6KHo\t!ZFw#/,\u001270\u001b\u001dn[h>6ϯRvn8)[}Bcs)\u001fmkg\u001c\u000f\u0012ţ)\u0013\u0016\u0018A\u00141\u001d\u0017bܾ>\u001f]p@H\u0006\"\u001d|U\u0004q\u0013t!$b1l\f\u0019`li4.Aīd0#%3ZsiXDTOָX߃\tfMǷ1,\u0007\u0002\u001d3Α|o"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u0019z.4]\u0007\"\u001bu!5#", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u0019z.4]\u0007\"\r", "u(E", ";Gh/e0=2\u0015\u000ev", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "5dc\u001a;@;`\u001d}YZ;xG+n\t2\u000b<\u0010\u001b!P}", "2qP6a\u0017KS\u0015\u0006\u0002h*x\u0018/V\u0004(\u000eNl'\u0017Wo", "", "2qXCX\nQft\b~f(\f\r9n\u000e", "5dc\u0016a:IS\u0017\u000e\u0005k\u000bx\u0018+F\n5_I\u000f&\u0013Pm\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;S0)j", "3uT;g\fFW(\u000ezk\u001e\n\u0005:p\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW<\b%>h\fi\u0017~\u00167\\#CoC-\u0015uSF\u0003n7N\u0004|", "7mbAT3E4\u0015{\bb*ll\u0017a\t$}@\u000e", "@t]A\\4>3,~xn;\u0007\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 \u0017\u0001\u0016,]REx\n", "@t]A\\4>A\u0017\u0002z]<\u0004\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 %k\u0019.LSBkAs", "Ch<.a(@S&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u001dr\"B]{\u0010\u001bU\u00127IE;x\n", "3uT;g\t>O(fvg(~\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW<\b%>h\fi\u0017~\u00167\\ ;gC\u0006\u0011q];\u0007p\u0002", "1n\\=b5>\\(\rg^.\u0001\u0017>r\u0014", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u001a\u0001-@c\u0007 @|v*KRExHs", "@dP0g\u0015:b\u001d\u0010z<6\u0006\n3g", "", "@dV6f;>`", "4`Q?\\*.7\u0001z\u0004Z.|\u0016", "1n\\=b5>\\(_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW)v!3hf\u001cFq'.+MDl8 j", "@dV6f;>`\u0007\u000f\b_(z\t", "Ata3T*>6\u0015\bye,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW*\u000726U{ \u001ai\u001f-TCHH8'\u0014lj;\\", "@d_<e;&])\b\n", "Ata3T*>7\u0018", "", "Adc\u0010b5Lb&z~g;\u000b", ";h]$\\+MV", "", ";`g$\\+MV", ";h]\u0015X0@V(", ";`g\u0015X0@V(", "=eU@X;1", "=eU@X;2", "7rA!?", "", "2n;2Y;\u001a\\\u0018k~`/\fvAa\u000b\f\u0005-o}", "Adc\u001d\\?>Zw~\u0004l0\f\u001d", ">nX;g\u001a<O ~[Z*\f\u0013<", "AsP?g\u001aN`\u001azx^", ";nSB_,'O!~", "", "7mXA\\(E>&\t\u0006l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", "AsP?g\u001aN`\u001azx^\u001e\u0001\u00182C\n1\nO\u000e\u0013\u001bP~\u001c", "As^=F<KT\u0015|z", "CmX;f;:Z _v[9\u0001\u0007\u001fIg$\u0005<\u0003\u0017$", "Cma2Z0Lb\u0019\f", "Cma2Z0Lb\u0019\fhn9}\u0005-e", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BindingImpl implements Binding {
    private static final Companion Companion = new Companion(null);
    private final HybridData mHybridData = Companion.initHybrid();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f4\u0003B%s$ E\u0002٩8ԫ&\f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u0019z.4]\u0007\"\u001bu!5\f!Es?\u001a\u001elkB\\", "", "u(E", "7mXA;@;`\u001d}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final HybridData initHybrid() {
            return BindingImpl.initHybrid();
        }
    }

    static {
        FabricSoLoader.staticInit();
        MapBufferSoLoader.staticInit();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native HybridData initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj);

    private final native void uninstallFabricUIManager();

    @Override // com.facebook.react.fabric.Binding
    public native void drainPreallocateViewsQueue();

    @Override // com.facebook.react.fabric.Binding
    public native void driveCxxAnimations();

    @Override // com.facebook.react.fabric.Binding
    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    @Override // com.facebook.react.fabric.Binding
    public void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig) {
        Intrinsics.checkNotNullParameter(runtimeExecutor, "runtimeExecutor");
        Intrinsics.checkNotNullParameter(runtimeScheduler, "runtimeScheduler");
        Intrinsics.checkNotNullParameter(fabricUIManager, "fabricUIManager");
        Intrinsics.checkNotNullParameter(eventBeatManager, "eventBeatManager");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(reactNativeConfig, "reactNativeConfig");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory, reactNativeConfig);
        setPixelDensity(PixelUtil.getDisplayMetricDensity());
    }

    @Override // com.facebook.react.fabric.Binding
    public native void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    @Override // com.facebook.react.fabric.Binding
    public native void reportMount(int i2);

    @Override // com.facebook.react.fabric.Binding
    public native void setConstraints(int i2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3);

    @Override // com.facebook.react.fabric.Binding
    public native void setPixelDensity(float f2);

    @Override // com.facebook.react.fabric.Binding
    public native void startSurface(int i2, String str, NativeMap nativeMap);

    @Override // com.facebook.react.fabric.Binding
    public native void startSurfaceWithConstraints(int i2, String str, NativeMap nativeMap, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3);

    @Override // com.facebook.react.fabric.Binding
    public native void stopSurface(int i2);

    @Override // com.facebook.react.fabric.Binding
    public void unregister() {
        uninstallFabricUIManager();
    }

    @Override // com.facebook.react.fabric.Binding
    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
