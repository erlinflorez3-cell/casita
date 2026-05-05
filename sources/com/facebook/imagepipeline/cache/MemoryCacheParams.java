package com.facebook.imagepipeline.cache;

import java.util.concurrent.TimeUnit;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u0019\u007f\u0007ljOӄtev-\u0013\u000b0\u0014{\u007fB$s$ DKY(\u007f:\t}Owk|Mr\u000bq\u0010\u0016\u001a\u0007nDI\u0004ym\u0016\u001d7Zom4]uC9nzN\u0005N9ŕ<y\u0013\tj8V\u0012\u000fzqLB\u0016\u0007ϓrĐV\rUĨj \u0014C8\u0001L]\u001eR\rԧnҺ>/+Ʌ:P\\'w0+NCJ+ܓ\u000fțe\u001e3¨\bC#)k\u00035S\u0012CYӒsݘ\th/ݐ{W\u0002ZNX.\u0015K/&՝_ę*\\\rĩ1\u001a51gcyWD,N߆}Ɂ@\u0004\u0016ͺϒL7"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015S]F\u0003k:$", "", ";`g\u0010T*AS\u0007\u0003\u0010^", "", ";`g\u0010T*ASx\b\nk0|\u0017", ";`g\u0012i0<b\u001d\t\u0004J<|\u0019/S\u0004={", ";`g\u0012i0<b\u001d\t\u0004J<|\u0019/E\t7\tD\u0001%", ";`g\u0010T*ASx\b\nk@j\rDe", ">`a.`:\u001cV\u0019|\u0001B5\f\t<v{/cN", "", "uH8\u0016<\u0010#\u0017\n", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MemoryCacheParams {
    public final int maxCacheEntries;
    public final int maxCacheEntrySize;
    public final int maxCacheSize;
    public final int maxEvictionQueueEntries;
    public final int maxEvictionQueueSize;
    public final long paramsCheckIntervalMs;

    public MemoryCacheParams(int i2, int i3, int i4, int i5, int i6) {
        this(i2, i3, i4, i5, i6, 0L, 32, null);
    }

    public MemoryCacheParams(int i2, int i3, int i4, int i5, int i6, long j2) {
        this.maxCacheSize = i2;
        this.maxCacheEntries = i3;
        this.maxEvictionQueueSize = i4;
        this.maxEvictionQueueEntries = i5;
        this.maxCacheEntrySize = i6;
        this.paramsCheckIntervalMs = j2;
    }

    public /* synthetic */ MemoryCacheParams(int i2, int i3, int i4, int i5, int i6, long j2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, i5, i6, (-1) - (((-1) - i7) | ((-1) - 32)) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j2);
    }
}
