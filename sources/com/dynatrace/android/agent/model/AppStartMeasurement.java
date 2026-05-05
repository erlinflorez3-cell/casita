package com.dynatrace.android.agent.model;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r)4\u0012}\u000enjG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!Ib^kunbZ9D\u001f\n$z\u0003,wXޯa\u0012\u001d6\u000bvM<eok:'ӡ7M'@,Py3\u0004`ޙIX\u0012\tNc\f@ؓpv@R\u001bM\u001d\u001a@\u0007n&\u0007\u001ejif6vo$Ǆ.k\u0014wNf'\u000e=-S\u001bTl)#u\u0010\u001dqÿ8}\u001c3b\u001b\u0007\u0001k\u0006Ƹ>:D\u0013y?'YJ:ʥ5)\u000f\"\u0015CO;^ę*b\rĩx\u000e-0]i\u001c_\u001c*\u0010z*\u0010ʀ\b\u0014\u000eΩ`03!t\u0010ԭ7\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-?X}'\u0001I!9;R7xC\u0006\u0015doI\u0014c4N\u007f6\u001d", "", "<`\\2", "", "Bh\\2f;:[$", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`\u0004q", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!\\4>a(z\u0003i", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AppStartMeasurement {
    private final String name;
    private final long timestamp;

    public AppStartMeasurement(String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.timestamp = j2;
    }

    public static /* synthetic */ AppStartMeasurement copy$default(AppStartMeasurement appStartMeasurement, String str, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = appStartMeasurement.name;
        }
        if ((i2 & 2) != 0) {
            j2 = appStartMeasurement.timestamp;
        }
        return appStartMeasurement.copy(str, j2);
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final AppStartMeasurement copy(String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AppStartMeasurement(name, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStartMeasurement)) {
            return false;
        }
        AppStartMeasurement appStartMeasurement = (AppStartMeasurement) obj;
        return Intrinsics.areEqual(this.name, appStartMeasurement.name) && this.timestamp == appStartMeasurement.timestamp;
    }

    public final String getName() {
        return this.name;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "AppStartMeasurement(name=" + this.name + ", timestamp=" + this.timestamp + ")";
    }
}
