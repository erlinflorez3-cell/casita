package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0012njO0LeN/X8@ş\u001c{b#$2\u007fCSUH~R\r]P\u007fg\u001dM!/\f\u001d\u0014\u001a\u0011jZJ\u0006|k\u0014'2pr\u0006W\u0016}K>xtd\u0006P60:\u0012\u0005/\u001dplX\u0005\tIc\f@1ptHT%M3\u001dX*\u0007.\u000f%tg|7xpk<G#1l\trom>\u0005e\rtUW\u0011\u0005c6+n:{9ma\u0011\u0010j[m\u0004ouK\u0007\u0001'U.\u0010\u0018 Df\n,\u0015YP=a\u0001(t\u0005\u007fcRKs]qVh\u000eVx+\u007f\u001b>\u001c\u000e4*\u000fRu(t\u0014&3#s\u0004D^\u0004vB.}(Z_3\u000e@C9Ig\u0002eI\u001bf7*\bSBk\u000f|/sT<aE\u001fbyi1\u007fC\u0004l\u0017 gL\u0006\u0004\u001fc26\u0012@_\b?{\u0017/'%=\\g4g\u0010J^Ry\u000f\u0005\u000fi\u0004u`[X*~\u0016=+\u0019\f`E\u0013\u00162tԢ\\@"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001bu\u00120M!7i7\u001e\u0003w]H\u0015R9Jt-GY$", "", "=m16g4:^vzxa,_\r>", "", "1`R5X\u0012>g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "=m16g4:^vzxa,d\r=s", "=m16g4:^vzxa,g\u0019>", "=m36f2\u001cO\u0017\u0002z@,\fi+i\u0007", "=m36f2\u001cO\u0017\u0002zA0\f", "=m36f2\u001cO\u0017\u0002zF0\u000b\u0017", "=m36f2\u001cO\u0017\u0002zI<\f", "=m<2`6Kgvzxa,_\r>", "=m<2`6Kgvzxa,d\r=s", "=m<2`6Kgvzxa,g\u0019>", "=mBAT.B\\\u001bZ\b^(_\r>", "=mBAT.B\\\u001bZ\b^(d\r=s", "@dV6f;>`u\u0003\nf(\bp/m\n5\u0010\u001e|\u0015\u001aG", "0hc:T7&S!\t\br\nx\u00072e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "@dV6f;>`x\bxh+|\b\u0017e\b2\tT^\u0013\u0015Jo", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ImageCacheStatsTracker {
    void onBitmapCacheHit(CacheKey cacheKey);

    void onBitmapCacheMiss(CacheKey cacheKey);

    void onBitmapCachePut(CacheKey cacheKey);

    void onDiskCacheGetFail(CacheKey cacheKey);

    void onDiskCacheHit(CacheKey cacheKey);

    void onDiskCacheMiss(CacheKey cacheKey);

    void onDiskCachePut(CacheKey cacheKey);

    void onMemoryCacheHit(CacheKey cacheKey);

    void onMemoryCacheMiss(CacheKey cacheKey);

    void onMemoryCachePut(CacheKey cacheKey);

    void onStagingAreaHit(CacheKey cacheKey);

    void onStagingAreaMiss(CacheKey cacheKey);

    void registerBitmapMemoryCache(MemoryCache<?, ?> memoryCache);

    void registerEncodedMemoryCache(MemoryCache<?, ?> memoryCache);
}
