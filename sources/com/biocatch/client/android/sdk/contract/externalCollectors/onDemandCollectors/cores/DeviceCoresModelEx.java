package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.cores;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\":\u001b\u007f\u0007lkA0RqP\u008cXݾ0%ӆ,4RZd|S?c\u001a\u0016\"7PɁkg|L#\u0012Q\u0014\u001e\u0016'krֶVAn \u0015JB\u001eЀcSu=G`\r63!xŹ7B\u0016\u000f!BH>~+IY\u0015*2VohQS̶\u0006b\u0019\u0014H8\u0001L].\u00845\u0011skEG#1u\tŎ&0?\u000bM%F\u0003(˼zg&ѨX9;\u00183Wα\u000b_"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u007fEu\u0001\u001a_l5{t@VmQ\u0007\u0015\u0004)3gF`?\r\u001d", "", "2de6V,\u001c]&~\t", "", "uH\u0018#", "5dc\u0011X=BQ\u0019\\\u0005k,\u000b", "u(8", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DeviceCoresModelEx {
    private final int deviceCores;

    public DeviceCoresModelEx(int i2) {
        this.deviceCores = i2;
    }

    public static /* synthetic */ DeviceCoresModelEx copy$default(DeviceCoresModelEx deviceCoresModelEx, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = deviceCoresModelEx.deviceCores;
        }
        return deviceCoresModelEx.copy(i2);
    }

    public final int component1() {
        return this.deviceCores;
    }

    public final DeviceCoresModelEx copy(int i2) {
        return new DeviceCoresModelEx(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceCoresModelEx) && this.deviceCores == ((DeviceCoresModelEx) obj).deviceCores;
    }

    public final int getDeviceCores() {
        return this.deviceCores;
    }

    public int hashCode() {
        return Integer.hashCode(this.deviceCores);
    }

    public String toString() {
        return "DeviceCoresModelEx(deviceCores=" + this.deviceCores + ')';
    }
}
