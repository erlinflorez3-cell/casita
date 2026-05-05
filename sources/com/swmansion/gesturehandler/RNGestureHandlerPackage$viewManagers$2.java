package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,\f\bDRo|\u0004W\u00068\u000b4B\rӬD&\b\tvjg0ToX6pUR\u0011\u0002zb%\n% B\u0002]۟\u0002\"\u000fR"}, d2 = {"\n`]<a@F])\rS", "", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW$\u0001$E`}\u000eBm\u0014\u0004", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class RNGestureHandlerPackage$viewManagers$2 extends Lambda implements Function0<Map<String, ? extends ModuleSpec>> {
    public static final RNGestureHandlerPackage$viewManagers$2 INSTANCE = new RNGestureHandlerPackage$viewManagers$2();

    RNGestureHandlerPackage$viewManagers$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule invoke$lambda$0() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule invoke$lambda$1() {
        return new RNGestureHandlerButtonViewManager();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends ModuleSpec> invoke() {
        return MapsKt.mapOf(TuplesKt.to(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$viewManagers$2$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                return RNGestureHandlerPackage$viewManagers$2.invoke$lambda$0();
            }
        })), TuplesKt.to(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$viewManagers$2$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return RNGestureHandlerPackage$viewManagers$2.invoke$lambda$1();
            }
        })));
    }
}
