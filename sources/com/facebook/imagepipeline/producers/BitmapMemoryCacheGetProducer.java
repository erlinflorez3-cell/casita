package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<$a$yCIa\"}(\tWN}gvJ`\fK\u000f\u0014\u001f\u0001j2Ikތ{%?2pnw2`0pIp\u00036\u001d,B$Hy3\u0003*,X\u0010%}qL\u001c\u0016>D\t:\u0001\u0012]\u0015(\u0018\u001eJ0\t.bwPFH\u001b`h7Q\nݦFN5hx\u0003[\u0017^TU\u0018=sf1NCM\u0015S^I\u0019\u001b\u0012M\u0010W}M\rx-7-Ys\u00069\u0007\bB#[_\u001bl\u000b2l\raf\u001c);O\u0012N~\u0016V\u0006+\u007f\u001bL\u001c\u000e4)x2;+~\b<E;\u0005ՈDd"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w*GJs0)|hiC\u0014w\nJt*G.N;G_|<$\u0010Z\u001b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w*GJs0)|hiC\u0014w\nJt*G7[6[bp=!g", ";d\\<e@\u001cO\u0017\u0002z", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", "7m_Bg\u0017K]\u0018\u000fx^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#1W\u0001 \u0001U\u00166WPOI0\u001c\u0018h7 \u0005m4\u0018w#ELK6fX<A\u001c\u000e\\\u000eY/\u0018\u0005`E-n\u000e5\u001b\u0006/IK\u0019d~\u000f\u0016s5~Q>T\u001fQ\u0007)K('rN#`uEABl4jUc%X<:/\u0018|\u0019\"lY.S\u0007`\u001bqbwgtUbeE.=}YFRE\u0019-", "5dc\u001ce0@W\"l\u000b[*x\u0018/g\n5\u0010", "", "5dc\u001de6=c\u0017~\bG(\u0005\t", "EqP=66Ga)\u0007zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "1n]@h4>`", "1`R5X\u0012>g", "7r<2`6Kgvzxa,\\\u0012+b\u0007(z", "", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapMemoryCacheGetProducer extends BitmapMemoryCacheProducer {
    public static final Companion Companion = new Companion(null);
    private static final String ORIGIN_SUBCATEGORY = "pipe_ui";
    public static final String PRODUCER_NAME = "BitmapMemoryCacheGetProducer";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w*GJs0)|hiC\u0014w\nJt*G.N;G_|<$\u0010Z\u001b\r\t\u0017\rd=-rN@t", "", "u(E", "\u001dQ8\u0014<\u00158A\t[X:\u001b\\j\u0019Rs", "", "\u001eQ>\u0011H\n\u001e@\u0013gVF\f", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapMemoryCacheGetProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<CloseableImage>> inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected String getOriginSubcategory() {
        return ORIGIN_SUBCATEGORY;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected Consumer<CloseableReference<CloseableImage>> wrapConsumer(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey, boolean z2) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
