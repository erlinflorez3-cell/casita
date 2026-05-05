package com.facebook.react.internal.turbomodule.core.interfaces;

import com.facebook.react.bridge.NativeModule;
import java.util.Collection;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O$8\u000b<N\u0007\"2\u0013\u007f\u0007t\u0007A0ZeP.XV2\u000fy\u0005<řc$\u007fCC٥ b8ޛ\u007fN\u0016f7Zh\u0015[\u0011\u001c\u0015'q\\Mc\u0004u\u0012=4\t\u0014\bA[{U9\u000f\u0002f\t.=:8(\u0007G>rN\u001e\u0005\u0013Cy\u001bXT\u0011\u0007HR%S\u0015\u001c\"\u0006l\"/\u001f3ʈPɇLpu<5&\u0011m\u0013d5dH\u0003]\u000fVTU\u0014%gtҏB˝9\u0019=U\t\u000f`dУ\u0002ӊп=\tp)-Jwrɷ:hĝ\u0018\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@4Efz*?w\u0015>TC\u0005i>+\u00152eB\u0016c9Or%GZ\u0018\u001bl_oG{\u001cY\u001eU+y\u0005[E2}QKt", "", "3`V2e\u0010GW(f\u0005]<\u0004\t\u0018a\b(\n", "", "", "5dc\u0012T.>`|\b~m\u0014\u0007\b?l\u007f\u0011wH\u0001%", "u(;7T=:\u001d)\u000e~euc\r=tU", ";nSB_,L", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "5dc\u001ab+NZ\u0019\r", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "5dc\u001ab+NZ\u0019", ";nSB_,'O!~", "6`b\u001ab+NZ\u0019", "", "7me._0=O(~", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface TurboModuleRegistry {
    List<String> getEagerInitModuleNames();

    NativeModule getModule(String str);

    Collection<NativeModule> getModules();

    boolean hasModule(String str);

    void invalidate();
}
