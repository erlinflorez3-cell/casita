package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0R\bP.`_2\u000fq{:Ơ[:ڎs;\u0004\u00196!\u0013\u0010SmgĔNZ\u0019CW@$y\u0003._T'_B\u0013@E\b?aQ CGe\r8\u001b\u001f`$h\u007f\u0013\u00072,^\u000f%|s]\u001a\u0019HN\u0001<b\r{\u000e*\u0014\u0016>N\u00034[\u0016V|MǶaE"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,GIq\u0012\u001a\u0013ka\u0018\u0007a0\\z1P\"", "", "u(E", "1g^<f,\u001dW'\u0005XZ*\u007f\t\u0010o\r\u0015{L\u0011\u0017%V", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,$", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "AlP9_\u000bBa\u001f\\v\\/|", "2dU.h3M2\u001d\r\u0001<(z\f/", "2x].`0<2\u001d\r\u0001<(z\f/s", "", "", "\u0012hb86(<V\u0019]z\\0\u000b\r9nh2ZD\u000f\u001dtCm\u0011<T(?g})\u0017\u0001\u0014.XR?u=", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DiskCacheDecision {
    public static final DiskCacheDecision INSTANCE = new DiskCacheDecision();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007\"2\u0012}ј|ʑi4rd1.1Sj\u001c{\u0002B%s&\bBiW۟\u0002\"\u0017Rɇkk"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,GIq\u0012\u001a\u0013ka\u0018\u0007a0\\z1P\u000b-0jXP9\u0012\u0015ZlN)\u0011\u0013]K-WN\u0016#\u00162'}9k\u0001i\u0019\u0018Cjy\"i\u000eG\u0005$yK2>", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
        public DiskCacheDecisionNoDiskCacheChosenException(String str) {
            super(str);
        }
    }

    private DiskCacheDecision() {
    }

    @JvmStatic
    public static final BufferedDiskCache chooseDiskCacheForRequest(ImageRequest imageRequest, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, Map<String, BufferedDiskCache> map) {
        String diskCacheId;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
            return bufferedDiskCache;
        }
        if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.DEFAULT) {
            return bufferedDiskCache2;
        }
        if (imageRequest.getCacheChoice() != ImageRequest.CacheChoice.DYNAMIC || map == null || (diskCacheId = imageRequest.getDiskCacheId()) == null) {
            return null;
        }
        return map.get(diskCacheId);
    }
}
