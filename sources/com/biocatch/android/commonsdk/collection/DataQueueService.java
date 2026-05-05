package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.hS2şs{J$c$wDCU0}*\tUN}˧\u001fJ\t\n\u0004\"\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6ޜs=Gd=Y\u0013%J\"f\u007f%\u0007 ݒV\u0017\u001fzqS<\u0016>I\t:\u0001\u0017}\t(\u001d\u001e>f\bɉ`g\\B\u0011xkGG#1wrR5hH|{\u0017\u000fb5\u001c\u000faL9p;C\u001e=S1\u0011\u0019[\u0010\u000fMqU\u0005\u0017(}ǥKָ[6`Üd!9Q%]!)3ӧSԃ\u0010'3ՒӓO`"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "", "2`c.D<>c\u0019_v\\;\u0007\u0016C", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NW#E[X9p(", "2`c.D<>c\u0019kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nc'RV\\0k\\\u007fQi", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=gsdp5rs,^v\bCJ]6ifH$\u0012\u001cbWK/\u0017\u0003UP\"q\u000e3(\u00079S\u0006:2~\u0016\u001e\u0016?s~A\\YE\u0004\u001c|A'wJchC&=T^\u0016t\fo\u001dI:E.\"u(%ud\u0004Ml", "/o_2a+", "", "\"", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "7sT:", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u0004\u000b&\"5*fZ<:\u0018\u001cX\n])\u0010NUJ#{N;\u001eQ*S\nCr\n\u001a\u0015\u0014~gl@\\\u0010Px^SK0oFWn}QJ)q*la#\u000e", "5dc", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "5dc\u0011T;:?)~\u000b^", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataQueueService {
    private final DataQueueFactory dataQueueFactory;
    private final DataQueueRepository dataQueueRepository;

    /* JADX INFO: renamed from: com.biocatch.android.commonsdk.collection.DataQueueService$getDataQueue$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "7me<^,"}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<DataQueue> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DataQueue invoke() {
            return DataQueueService.this.dataQueueFactory.create();
        }
    }

    public DataQueueService(DataQueueFactory dataQueueFactory, DataQueueRepository dataQueueRepository) {
        Intrinsics.checkNotNullParameter(dataQueueFactory, "dataQueueFactory");
        Intrinsics.checkNotNullParameter(dataQueueRepository, "dataQueueRepository");
        this.dataQueueFactory = dataQueueFactory;
        this.dataQueueRepository = dataQueueRepository;
    }

    private final DataQueue getDataQueue(CollectorID collectorID) {
        return this.dataQueueRepository.getOrPut(collectorID, new Function0<DataQueue>() { // from class: com.biocatch.android.commonsdk.collection.DataQueueService.getDataQueue.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final DataQueue invoke() {
                return DataQueueService.this.dataQueueFactory.create();
            }
        });
    }

    public final <T extends CollectionItem> void append(CollectorID collectorID, T item) {
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        Intrinsics.checkNotNullParameter(item, "item");
        getDataQueue(collectorID).enqueue(item);
    }

    public final DataQueue get(CollectorID collectorID) {
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        return getDataQueue(collectorID);
    }
}
