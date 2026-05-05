package com.dynatrace.android.agent;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,u\bDJg\u0015\u0010OيH\u000b\\AUӳ~߽{\u0007nʑY<Re`.\u0001R\u0001Ţ>ڷ8$cҕ\u0012OIV2}P\b&ȡ:̊rJbŏc\u001b\u0014\u0018\u0011jZH,ޏ0ܫ\u00132Jģ_?[rU9\u000fs\rӏrݨ&8\u0002ڎ!&8L(v)B\"ËdضDpBĥұQ\n"}, d2 = {"\u0010Q8\u0011:\f8<tfZ", "", "\u0012@C\u000eR\n(:\u007f^XM\u0010fq)O`\t", "\u0012@C\u000eR\n(:\u007f^XM\u0010fq)P_\u0015\\*m~r0Mm", "\u0012@C\u000eR\n(:\u007f^XM\u0010fq)Um\bh\u001d`yr8Sw)", "\u001eK0!9\u0016+;\u0013Zc=\u0019fl\u000e", "\u001eK0!9\u0016+;\u0013bdL", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceRNBridgeImplKt {
    public static final String BRIDGE_NAME = "DynatraceBridge";
    private static final String DATA_COLLECTION_OFF = "OFF";
    private static final String DATA_COLLECTION_PERFORMANCE = "PERFORMANCE";
    private static final String DATA_COLLECTION_USERBEHAVIOR = "USER_BEHAVIOR";
    private static final String PLATFORM_ANDROID = "android";
    private static final String PLATFORM_IOS = "ios";
}
