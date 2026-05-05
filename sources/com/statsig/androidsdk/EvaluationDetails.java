package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4\u0012}\u0013njG9LeN.ZS8\u0015sڔ<$i0yّA٬ \u0014̝9O|f(\fZ^\u0019C'\u0006Dyz2OU\u0007_*\u000f`E\u007fCAQ\b=gcҽ:\u0005.7j?\b\u0012\u0019\u001aXIVΓ{\fR\u001a H@\u001f=\u0019ӏNM! \u0015V /!#ʨO~mzmR/QɅ\u001aHT'm0\u0015M;G\u0005-\u0013vo C@e8E+Y\u0003\u0015Vs?1B8ݼ\u0004185<as\u0006H\t\u0006\"(CQ#\\!%#ԻR)\u00135?gcyeT vC\u0003\u001bR\u001c\u000e4>\u000fΪ,ju\u0016\u0012Kt!VĖT\bfۍ\u0018|g<%,PK993f\u007fb\u0012ϑZѼ\u007f\u0011\u0015̔;\u0003t)i].b\u001b%b\u0003\"@_BUH|\rՒAs\f͏z\u00040\u0010>NĲ3\u0014"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "Bh\\2", "", ":bdA", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001f8}51h\u0002*@Z\u0016*[MDA\u0019\u0003XY", "5dc\u0019V<M", "u(9", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Av\u0003.IQEt\n", "Adc\u001fX(L]\"", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001f8}51h\u0002*@Z\u0016*[MDAw\u000f", "5dc!\\4>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class EvaluationDetails {
    private final transient long lcut;
    private EvaluationReason reason;
    private final long time;

    public EvaluationDetails(EvaluationReason reason, long j2, long j3) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
        this.time = j2;
        this.lcut = j3;
    }

    public /* synthetic */ EvaluationDetails(EvaluationReason evaluationReason, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluationReason, (i2 & 2) != 0 ? System.currentTimeMillis() : j2, j3);
    }

    public static /* synthetic */ EvaluationDetails copy$default(EvaluationDetails evaluationDetails, EvaluationReason evaluationReason, long j2, long j3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            evaluationReason = evaluationDetails.reason;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = evaluationDetails.time;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j3 = evaluationDetails.lcut;
        }
        return evaluationDetails.copy(evaluationReason, j2, j3);
    }

    public final EvaluationReason component1() {
        return this.reason;
    }

    public final long component2() {
        return this.time;
    }

    public final long component3() {
        return this.lcut;
    }

    public final EvaluationDetails copy(EvaluationReason reason, long j2, long j3) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new EvaluationDetails(reason, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationDetails)) {
            return false;
        }
        EvaluationDetails evaluationDetails = (EvaluationDetails) obj;
        return this.reason == evaluationDetails.reason && this.time == evaluationDetails.time && this.lcut == evaluationDetails.lcut;
    }

    public final long getLcut() {
        return this.lcut;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.reason.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.lcut);
    }

    public final void setReason(EvaluationReason evaluationReason) {
        Intrinsics.checkNotNullParameter(evaluationReason, "<set-?>");
        this.reason = evaluationReason;
    }

    public String toString() {
        return "EvaluationDetails(reason=" + this.reason + ", time=" + this.time + ", lcut=" + this.lcut + ')';
    }
}
