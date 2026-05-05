package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4H\u0007\":\u0018\u007fјnjG<L͜N\u0093Xiճ?k*3dh4wI;c\u001a\u0016\"7PɁkg|L#\u0012Q\u0014\u001e\u0016'krֶVAn \u0015JB\u001eЀcSu=G`\r63!xŹ7B\u0016\u000f!BH>w+IY\u0014*2VohQS̶\u0006b\u0019\u0014G8\u0001Lf.\u00845\u0011skEG#1u\tŎ&0?\u000bM%F\u0003(˼zg&ѨX9;\u00183Wα\u000b_"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.-T7rD\u001a$lkBpn;R\u00010U\"", "", "2hb.U3>3,\n\u0005l<\n\t\u0016o\u0002", "", "uY\u0018#", "5dc\u0011\\::P ~Zq7\u0007\u0017?r\u007f\u000f\u0006B", "u(I", "1n\\=b5>\\(J", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ParameterStoreEvaluationOptions {
    private final boolean disableExposureLog;

    public ParameterStoreEvaluationOptions() {
        this(false, 1, null);
    }

    public ParameterStoreEvaluationOptions(boolean z2) {
        this.disableExposureLog = z2;
    }

    public /* synthetic */ ParameterStoreEvaluationOptions(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? false : z2);
    }

    public static /* synthetic */ ParameterStoreEvaluationOptions copy$default(ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = parameterStoreEvaluationOptions.disableExposureLog;
        }
        return parameterStoreEvaluationOptions.copy(z2);
    }

    public final boolean component1() {
        return this.disableExposureLog;
    }

    public final ParameterStoreEvaluationOptions copy(boolean z2) {
        return new ParameterStoreEvaluationOptions(z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParameterStoreEvaluationOptions) && this.disableExposureLog == ((ParameterStoreEvaluationOptions) obj).disableExposureLog;
    }

    public final boolean getDisableExposureLog() {
        return this.disableExposureLog;
    }

    public int hashCode() {
        boolean z2 = this.disableExposureLog;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        return "ParameterStoreEvaluationOptions(disableExposureLog=" + this.disableExposureLog + ')';
    }
}
