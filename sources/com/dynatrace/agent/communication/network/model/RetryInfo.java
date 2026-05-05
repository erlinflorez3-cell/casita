package com.dynatrace.agent.communication.network.model;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\u000fnjG9LeN0Xݸ0%ӆ,4RZd\tS?c\u001a\u0016\"7P^mupb\\!B=\tȀ|l2Mc}&\u0019\u001d<Zom4\u0014ە>\u0002i\u0003A\u001d\"H!f|Kі\u001bre\u001e\u0003\u0013CyÈB6FpHR%M3\u001bB\u000eD \u000f tid5vo$Ǆ.k\u0014wOf'\u000e>-S\u001bUl)#u\u0010\u001dqÿ8}\u001c3c\u001b\u0007\u0001\\\u0006Ƹ>:D\u0013y?'YL:ʥ5)\u000f\"\u0015CO;^ę*b\rĩx\u000e-1]j\u001ca\u001c*\u0010|\u0012\fj\u0007؝\n-P͓E\u001cl\u0010\u001c<Ϩve"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}&\u001fga@PP,]\u0004;+UO62", "", "1nd;g", "", "@dP@b5", "", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "5dc\u0010b<Gb", "u(8", "5dc\u001fX(L]\"", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RetryInfo {
    private final int count;
    private final String reason;

    public RetryInfo(int i2, String str) {
        this.count = i2;
        this.reason = str;
    }

    public static /* synthetic */ RetryInfo copy$default(RetryInfo retryInfo, int i2, String str, int i3, Object obj) {
        if ((1 & i3) != 0) {
            i2 = retryInfo.count;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str = retryInfo.reason;
        }
        return retryInfo.copy(i2, str);
    }

    public final int component1() {
        return this.count;
    }

    public final String component2() {
        return this.reason;
    }

    public final RetryInfo copy(int i2, String str) {
        return new RetryInfo(i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryInfo)) {
            return false;
        }
        RetryInfo retryInfo = (RetryInfo) obj;
        return this.count == retryInfo.count && Intrinsics.areEqual(this.reason, retryInfo.reason);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.reason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RetryInfo(count=" + this.count + ", reason=" + this.reason + ')';
    }
}
