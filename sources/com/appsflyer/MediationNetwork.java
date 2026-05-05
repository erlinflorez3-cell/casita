package com.appsflyer;

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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eRLc\u0003\u0010I\u00066\u001e4ȗ}8ܥB}\u0017hz9^Ǐ\u0014GnaY*\u001fo\n5<[Rqٴ?W \u007f0\f fuk\u0007J\t\u000by\u0014\\ǥz̶0S]zc\u0016\u001d7ZqE9[v&9f|\u001f\u0005&;\u000b8\u007f\u000fi\u001a0Sxv\u0001O4\f\u0018=)p@`uM\u000b)z\u0006D0i\u001ebx76N~F:56kiHb\u0010_6\u0012"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u0017e~,wO\u0005! 0o\u001dN\u00012;/", "", "", ">/", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "D`[BX", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0017Q>\u001bF\u0016.@v^", "\u000fO?\u0019B\u001d\"<\u0013fVQ", "\u0015N>\u0014?\f8/wfd;", "\u0014X1\u0012E", "\u000fO?\u001c7\f\u001a:", "\u000fC<\u001cF\u001b", "\"N?\u001cA", "\"Q0\u0011C\u0013.A", "'@=\u00118\u001f", "\u0011G0\u001fG\t(=\u0007m", "#M8!L", "\"N?\u001cA&)Bx", "\u0011TB!B\u00148;x]^:\u001b`r\u0018", "\u0012HA\u00126\u001b8;\u0003gZM\u0010qd\u001eIi\u0011u)`\u0006\t1\\s"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum MediationNetwork {
    IRONSOURCE("ironsource"),
    APPLOVIN_MAX("applovinmax"),
    GOOGLE_ADMOB("googleadmob"),
    FYBER("fyber"),
    APPODEAL("appodeal"),
    ADMOST("Admost"),
    TOPON("Topon"),
    TRADPLUS("Tradplus"),
    YANDEX("Yandex"),
    CHARTBOOST("chartboost"),
    UNITY("Unity"),
    TOPON_PTE("toponpte"),
    CUSTOM_MEDIATION("customMediation"),
    DIRECT_MONETIZATION_NETWORK("directMonetizationNetwork");

    private final String value;

    MediationNetwork(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
