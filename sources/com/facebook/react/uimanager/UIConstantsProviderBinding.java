package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wEAڧ\u001a\u0014̝9O|f oUf\u0018\u0004\u0014\f\u0016ѱn,WUA\u0005 \u0010JB\u001eAcQ}@Q`#:5$@'Py3\u0007J.V\u0017\u000fzqS<\u0016>I\t:\u0001\u0017\u0014İ8Ű\nL"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN$", "", "u(E", "7mbAT3E", "", "@t]A\\4>3,~xn;\u0007\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)\u0007.D]\u0006 \u0017\u0001\u0016,]REx\n", "2dU.h3M3*~\u0004m\u001b\u0011\u0014/sj5\u0006Q\u0005\u0016\u0017T", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\u000b\\SnM\u001b!:\u001fN4\u001csmL$|/D)\u00190H\u0002H>", "DhTD@(GO\u001b~\b<6\u0006\u0017>a\t7\n+\u000e!(Kn\u000eI", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\nf[\u0001L\u0010\u001bi\u001c/5\u001au]A6V@@\u001b\n,VlHr\u0012\u0010\u0015\u000eB@", "1n]@g(Gb'i\bh=\u0001\b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\nf[\u0001L\u0010\u001bi\u001c98\u0017\u0016]@${\u001a", "\u0011n]@g(Gb'_\u0005k\u001d\u0001\tAM{1wB\u0001$\u0002Ty\u001f@u%B", "\u0011n]@g(Gb'i\bh=\u0001\b/r", "\u0012dU.h3M3*~\u0004m\u001b\u0011\u0014/sj5\u0006Q\u0005\u0016\u0017T", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UIConstantsProviderBinding {
    public static final UIConstantsProviderBinding INSTANCE = new UIConstantsProviderBinding();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ}l|ʑi0rd\u0011>`SB\u0011\u0002zb%\f(\u007fESUH\u0001h-ӠMʴ˪nNb\rI.4\u0015ѷn0ְYw"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\nf[\u0001L\u0010\u001bi\u001c/5\u001au]A6V@@\u001b\n,VlHr\u0012\u0010\u0015\u000eB@", "", "5dc\u0010b5Lb\u0015\b\nl\r\u0007\u0016 i\u007f:c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", "DhTD@(GO\u001b~\bG(\u0005\t", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ConstantsForViewManagerProvider {
        NativeMap getConstantsForViewManager(String str);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004W\u00068é4(\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\nf[\u0001L\u0010\u001bi\u001c98\u0017\u0016]@${\u001a", "", "5dc\u0010b5Lb\u0015\b\nl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ConstantsProvider {
        NativeMap getConstants();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004W\u00068é4(\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=[*@{%*VRIVA(&l`9\u0014@0Wu+PN\r\u000b\\SnM\u001b!:\u001fN4\u001csmL$|/D)\u00190H\u0002H>", "", "5dc\u0011X-:c \u000eZo,\u0006\u0018\u001ey\u000b(\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface DefaultEventTypesProvider {
        NativeMap getDefaultEventTypes();
    }

    static {
        SoLoader.loadLibrary("uimanagerjni");
    }

    private UIConstantsProviderBinding() {
    }

    @JvmStatic
    public static final native void install(RuntimeExecutor runtimeExecutor, DefaultEventTypesProvider defaultEventTypesProvider, ConstantsForViewManagerProvider constantsForViewManagerProvider, ConstantsProvider constantsProvider);
}
