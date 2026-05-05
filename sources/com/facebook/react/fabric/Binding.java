package com.facebook.react.fabric;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
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
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SoE9nz>\u0005&2*8\b\n\t\u001a0L\u0018v\tLS\f\u00183HpH^\u0015˟\r\u001a(\u0006F \u0007!bLdȤxl\f9w)\u0011iZNU`v!\u0016\u0013TV?\r%bdO\tIC\u0018=U\u0019\u0006\u0001_o\tMvU\u0007~&U1\u0010\u0018 lf\u0007,\u0015YP=a\u0001.t\u0005\u007fi<+9Y{K~\u0019X{\t\b%<2\u001b6+V<E\u001a\u0015\u0017>7\u0003\u0003k@~\u0013\u000fF\u000e\ry6E8FWsG)ziai\u001a~;\n\u001a%\u001eQ\u00175E$b\u001cw-\u001b\u0003x\u00025_XUH|# a6R~|\u001a*21w\u0004=\u0014).E>g_G>9k0dtk\u0005\"xh\u0002\u0006\u0003LN@\u0007\u0016eF9\u0010hc|\u0005\u001al\u0005\\:1e\u001c\u0003#.\f!Atwj=U\u0014\\q\u0001i\u0019p\u000e\u000e3S~7\b\u001222 GlXMQ\u0012\u0011\u0012V\u0005:W<\u0011!\u001f\u000b\u000bq\u001a\u0002t(P3xn\u001e\u0010\u0014D|%C6M\u001a44ZZI`#r\u001b\u001eplC-(9v<\u0017Ta%3m2\r!\u0001~u!su!a,+\nR1O{M\u0019T\u0001RlB\u0018;\u0007-\u00100Kui_L\u001b2&Y\n>.\u001agm_A!.\u0017)`\u001e]IZ\u0013}Q{.W~\u000b\u001b';\u0017J\u0018\fx\u0013D`\u0019m\u007fX%F\u000f^!FN\tH\bos\u0013G\u0012U;_La\u000b\u0003\bU\u0015\\E\u000b-L=\u0001\u001e#CYuQ5L.wB0Eek~\b.(xUJݢdֽϽc\u001awdW|`:ΘM\n̛B!"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u0019z.4]\u0007\"\r", "", "2qP6a\u0017KS\u0015\u0006\u0002h*x\u0018/V\u0004(\u000eNl'\u0017Wo", "", "2qXCX\nQft\b~f(\f\r9n\u000e", "5dc\u0016a:IS\u0017\u000e\u0005k\u000bx\u0018+F\n5_I\u000f&\u0013Pm\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;S0)j", "3uT;g\fFW(\u000ezk\u001e\n\u0005:p\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW<\b%>h\fi\u0017~\u00167\\#CoC-\u0015uSF\u0003n7N\u0004|", "@dV6f;>`", "@t]A\\4>3,~xn;\u0007\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 \u0017\u0001\u0016,]REx\n", "@t]A\\4>A\u0017\u0002z]<\u0004\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 %k\u0019.LSBkAs", "4`Q?\\*.7\u0001z\u0004Z.|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u001dr\"B]{\u0010\u001bU\u00127IE;x\n", "3uT;g\t>O(fvg(~\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW<\b%>h\fi\u0017~\u00167\\ ;gC\u0006\u0011q];\u0007p\u0002", "1n\\=b5>\\(_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW\u001a\u0001-@c\u0007 @|v*KRExHs", "@dP0g\u0015:b\u001d\u0010z<6\u0006\n3g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW)v!3hf\u001cFq'.+MDl8 j", "@dV6f;>`\u0007\u000f\b_(z\t", "Ata3T*>6\u0015\bye,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW*\u000726U{ \u001ai\u001f-TCHH8'\u0014lj;\\", "@d_<e;&])\b\n", "Ata3T*>7\u0018", "", "Adc\u0010b5Lb&z~g;\u000b", ";h]$\\+MV", "", ";`g$\\+MV", ";h]\u0015X0@V(", ";`g\u0015X0@V(", "=eU@X;1", "=eU@X;2", "7rA!?", "", "2n;2Y;\u001a\\\u0018k~`/\fvAa\u000b\f\u0005-o}", "Adc\u001d\\?>Zw~\u0004l0\f\u001d", ">nX;g\u001a<O ~[Z*\f\u0013<", "AsP?g\u001aN`\u001azx^", ";nSB_,'O!~", "", "7mXA\\(E>&\t\u0006l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", "AsP?g\u001aN`\u001azx^\u001e\u0001\u00182C\n1\nO\u000e\u0013\u001bP~\u001c", "As^=F<KT\u0015|z", "Cma2Z0Lb\u0019\f", "Cma2Z0Lb\u0019\fhn9}\u0005-e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface Binding {
    void drainPreallocateViewsQueue();

    void driveCxxAnimations();

    ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig);

    void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    void reportMount(int i2);

    void setConstraints(int i2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3);

    void setPixelDensity(float f2);

    void startSurface(int i2, String str, NativeMap nativeMap);

    void startSurfaceWithConstraints(int i2, String str, NativeMap nativeMap, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3);

    void stopSurface(int i2);

    void unregister();

    void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
