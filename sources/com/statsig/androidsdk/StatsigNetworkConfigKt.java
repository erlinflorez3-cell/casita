package com.statsig.androidsdk;

import com.facebook.common.callercontext.ContextChain;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,\f\bDZc|\u0004O\u00128\u000bDB\u0007\"2\u0016\u0018&tʑQ@TgX.\u0001S:\u0015{\u007fb%D$PEiT۟\u0002(\u0011ѧfimqX^+^\u001d\u000b.\u0005z.YU']\"\u0011BB\u001e@aLڱA?hҚN\u0007&80<\"\r\u000f!JH>w+Cy\rܞ4H"}, d2 = {"\u0013M3\u001dB\u0010'B\u0013]cL&bh#_g\u0004f", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'x\rG\u0001)>hS", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'x\rG\u0001)>h\\)ES\u0016B#", "5dc\u0012A\u000b)=|giX\u000bev)K_\u001cu(\\\u0002", "u(;7T=:\u001d)\u000e~eud\u0005:;", "\u001cdcDb9D2\u0019\u007fvn3\f", "5dc\u001bX;P]&\u0005Y^-x\u00196t", "\u0013mS=b0Gbw\b\tD,\u0011", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigNetworkConfigKt {
    private static final Map<Endpoint, String> ENDPOINT_DNS_KEY_MAP = MapsKt.mapOf(TuplesKt.to(Endpoint.Initialize, ContextChain.TAG_INFRA), TuplesKt.to(Endpoint.Rgstr, "e"));
    private static final Map<Endpoint, String> NetworkDefault = MapsKt.mapOf(TuplesKt.to(Endpoint.Initialize, StatsigOptionsKt.DEFAULT_INIT_API), TuplesKt.to(Endpoint.Rgstr, StatsigOptionsKt.DEFAULT_EVENT_API));

    public static final Map<Endpoint, String> getENDPOINT_DNS_KEY_MAP() {
        return ENDPOINT_DNS_KEY_MAP;
    }

    public static final Map<Endpoint, String> getNetworkDefault() {
        return NetworkDefault;
    }
}
