package com.facebook.imagepipeline.platform;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4F\u0015Ӭ\\\u0012&\u0006'\u0002I6JeV.jSX\u0010{\u0002:$i&\nCiV۟\u0002\"\u0017R\u001fvunbZ9DǇ\n\u001c\u0001̓DK[|k\u0017_APqW3{pެ=f|Ȃ\u001d\"8(F~ڷ\u0005!"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002,1h~*Du_\u0019T?Jl>+\u001dGa7\u0011b,[`2VPX5j(", "", "/u^6W\u0017H] `zm", "", "/u^6W\u0017H] kze,x\u0017/", "uYIuI", "5dc\u000ei6BR\u0004\t\u0005e\u000e|\u0018", "u(I", "5dc\u000ei6BR\u0004\t\u0005e\u0019|\u0010/a\u000e(", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformDecoderOptions {
    private final boolean avoidPoolGet;
    private final boolean avoidPoolRelease;

    /* JADX WARN: Illegal instructions before constructor call */
    public PlatformDecoderOptions() {
        boolean z2 = false;
        this(z2, z2, 3, null);
    }

    public PlatformDecoderOptions(boolean z2, boolean z3) {
        this.avoidPoolGet = z2;
        this.avoidPoolRelease = z3;
    }

    public /* synthetic */ PlatformDecoderOptions(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (i2 + 2) - (i2 | 2) != 0 ? false : z3);
    }

    public final boolean getAvoidPoolGet() {
        return this.avoidPoolGet;
    }

    public final boolean getAvoidPoolRelease() {
        return this.avoidPoolRelease;
    }
}
