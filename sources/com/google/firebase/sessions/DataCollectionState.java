package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eRLc\u000b\u0004Iي8\u000b<H\u0007\"2\u001a}љe\u0001ˎ`JuJ>R\u0002ճ=j,4R[d~I;e\u001e\f#!O|i̊rJh\u000e\u0014!\u0014\u0017\u0011jZK,ޣ_ܫ\u00138JģW5SsK>It<\u000b\t2(?b\u0005\u0007\"\u0013H\u0016\u007fcCQ\u0016z0F{ĖV\u0019"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0014U\r\u001c\u0015w\u001d5MAJo>'\u0003w]H\u00079", "", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0001 \u0015Qn\u000eI\u0005n:g\b)\u0001V&6JCHk3}\u001exi\u000f", "<t\\/X9", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc\u001bh4;S&", "u(8", "\u0011N;\u00198\n-7\u0003gtN\u0015bq\u0019Wh", "\u0011N;\u00198\n-7\u0003gtL\u000bb\u0003\u0018On\"_)n\u0006r.Vm\u001b", "\u0011N;\u00198\n-7\u0003gt>\u0015Xe\u0016E^", "\u0011N;\u00198\n-7\u0003gt=\u0010jd\fL_\u0007", "\u0011N;\u00198\n-7\u0003gt=\u0010jd\fL_\u0007u-`~\u00016O", "\u0011N;\u00198\n-7\u0003gtL\bds\u0016E^", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum DataCollectionState implements NumberedEnum {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    DataCollectionState(int i2) {
        this.number = i2;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
