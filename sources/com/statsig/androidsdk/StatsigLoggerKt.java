package com.statsig.androidsdk;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!,u\bDJc|\u0004O\r8\u000b4D\u0007\":\u0018\u007f\u0007lkY<R͜`.\u0001R\u0001Š>ڷ8$cҕ\u0012OIU2}P\b&ȟ:̊rJbŏc\u001b\u0014\u0017\u0011jZK,ޏ0ܫ\u00132Jģ_?[rU9\u000fv\rӍrݨ&8\u0002ڎ!&8L(v)B\"ÉdضDpBĥ-Y\u0013\u001f*\u0006l\u001fWȧ/ʄR6PǍ}F=)\u001bipU}ۀ\u0003ƊQ\rNÖG\u0019\u0005i6+n6\f\u0557w٨\u0007\u0007Z¹_\u000fMzU\u0005\u0017)}ǣ\u001cָ[6`ÜЕ\u00195"}, d2 = {"\u0011N=\u0013<\u000e83\fidL\u001cih", "", "\u0012H0\u0014A\u0016,B|\\hX\fmh\u0018T", "\u0013W?\u001cF\u001c+3\u0013]Z=\u001cgh)Ih\u0017[-qr}", "", "\u0014KD ;&-7\u0001^gX\u0014j", "\u0015@C\u0012R\f1>\u0003ljK\f", "\u001a@H\u0012E&\u001eF\u0004hhN\u0019\\", "\u001b@G,8\u001d\u001e<\bl", "", "\u001cN=,8\u001f)=\u0007^YX\n_h\rKm\"[1`\u007f\u0006", "!GD!7\u00160<\u0013pVB\u001bvv", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigLoggerKt {
    public static final String CONFIG_EXPOSURE = "statsig::config_exposure";
    public static final String DIAGNOSTICS_EVENT = "statsig::diagnostics";
    private static final long EXPOSURE_DEDUPE_INTERVAL = 600000;
    public static final long FLUSH_TIMER_MS = 60000;
    public static final String GATE_EXPOSURE = "statsig::gate_exposure";
    public static final String LAYER_EXPOSURE = "statsig::layer_exposure";
    public static final int MAX_EVENTS = 50;
    public static final String NON_EXPOSED_CHECKS_EVENT = "statsig::non_exposed_checks";
    public static final long SHUTDOWN_WAIT_S = 3;
}
