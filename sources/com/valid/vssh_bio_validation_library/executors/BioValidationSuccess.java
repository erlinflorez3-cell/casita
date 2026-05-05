package com.valid.vssh_bio_validation_library.executors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&˛\bDRш|\u0004G\u000e8\u000b<K\u0007\"2\u0012\u007f\u0007tpAӄLeV:Zݷ0Ŧq\u0012éL]*ڎQ:\u0006\u001a,\"IZ^kuobZA¼Ǉ\n\u0016\u0007ltUc\u007fu\u0012E˰\tŪ@ݯQoK=)\u0011D\r882:\n\u00057ɝXϺ@|\u0001CY\r*0v\u0081\u0001Ŭ\f̂\t\u001a \u000f\u00071\u000f(tg|AxrkFG%\u0019hpNmܖ1ET\u001bSl';\u0005(Գ*\t>C$=S1\u0017\u0019Đ>SY\u007f>\u001dh]ݐ\u0002ɥ\u007fɱ:f\b\u0014#1g\u000fcu4`%Sf\u00115-ջg\\"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|F\u0002\"X\fN9\u001bZ", "\"", "", "@dbB_;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc\u001fX:NZ(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001fX:NZ(", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1n\\=b5>\\(J", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'~!\u001f\u0011\u0001\nCz$~j\f.:g\u00132W=Lg;\"\u0014dp=\u0011l&Uz$TH[@&R\u0006=\u0012\"i\u0018[9Va]K\u0015jK;\u001e\u0004;M\fDV\u0011\n\u0014\u000eCxF", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationSuccess<T> {
    private T result;

    public BioValidationSuccess(T t2) {
        this.result = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BioValidationSuccess copy$default(BioValidationSuccess bioValidationSuccess, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = bioValidationSuccess.result;
        }
        return bioValidationSuccess.copy(obj);
    }

    public final T component1() {
        return this.result;
    }

    public final BioValidationSuccess<T> copy(T t2) {
        return new BioValidationSuccess<>(t2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BioValidationSuccess) && Intrinsics.areEqual(this.result, ((BioValidationSuccess) obj).result);
        }
        return true;
    }

    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        T t2 = this.result;
        if (t2 != null) {
            return t2.hashCode();
        }
        return 0;
    }

    public final void setResult(T t2) {
        this.result = t2;
    }

    public String toString() {
        return C1593ug.zd("u\u001e%\r\u0019%#\u001f\u001d1'..\u00147&'*9:o;/>A9B\f", (short) (Od.Xd() ^ (FB.Xd() ^ (896936596 ^ (-1788430300)))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1034295864 ^ 2117947218)))) + this.result + C1561oA.od("{", (short) (OY.Xd() ^ ((753327417 ^ 1559159937) ^ 1879600588)));
    }
}
