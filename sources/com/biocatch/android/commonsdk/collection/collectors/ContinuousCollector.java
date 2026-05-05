package com.biocatch.android.commonsdk.collection.collectors;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.DataQueue;
import com.biocatch.android.commonsdk.di.SdkInjectorKt;
import java.util.Collection;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XT2\u000fy\u0005<$a'yCIU\"}(\nWNu\u0004vJ`\u000fI3\u001cǝ!p2կcw\u0006\u0012=2rom4\u000erެ=`\u00038M3@3Py3\u0013J.V#\u000fzyŷR\u0014ضDpHfUa\u0013+*\u0006l21(j|f<Xnm:e݊1\u007f\tPom>\u0014e\u0015VV7\r%a4*nM{)mW\u0011\u001fj[m\u0015\bwK\u001e\u0001'U=\u0010\u0018 :f\u001a,\u0015YaUc\u0001At\u0005\u007frRK{_qNh\u000eV{Qԯ\u000fʀ\b\u0012\u001e)N3; 7\u001a\u001c:\rr\u0002H\u0007B5ې\u0002ѐe:/'\u0006<9Ck\t_nS\u0019|C,\t\u001b);\u0001\u001d-\u001a\u0017dֲ!ôX\u0004YĸiBCU\\\u0018y?s\u0013~r͌. "}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\"L^1X3", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "u(E", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "2`c.D<>c\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "5dc\u0011T;:?)~\u000b^", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^G]H\u0003O<N\u0007'\u001d", "\nrTA \u0006\u0017", "", "7rBAT9MS\u0018", "u(I", "Adc g(Kb\u0019}", "uY\u0018#", "/cS!b\u0018NS)~", "", "1n[9X*MW#\b^m,\u0005", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001d3k\u001c.VB\u0005I>%\u001ch_H\u000bm52\u0006'O\"\u0012\u001d", "1n[9X*MW#\b^m,\u0005\u0017", "", "1n[9X*M", "@dbAT9M", "AsP?g", "AsP?g\u0010?<#\u000ehm(\n\u0018/d", "As^=", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class ContinuousCollector<TModel extends CollectionItem> extends Collector {
    private boolean isStarted;

    private final DataQueue getDataQueue() {
        return SdkInjectorKt.getCommonInjector().provideDataQueueService().get(getCollectorID());
    }

    protected final void addToQueue(TModel collectionItem) {
        Intrinsics.checkNotNullParameter(collectionItem, "collectionItem");
        getDataQueue().enqueue(collectionItem);
    }

    protected final void addToQueue(Collection<? extends TModel> collectionItems) {
        Intrinsics.checkNotNullParameter(collectionItems, "collectionItems");
        getDataQueue().enqueueMany(collectionItems);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public Collection<CollectionItem> collect() {
        if (getDataQueue().isEmpty()) {
            return null;
        }
        return getDataQueue().dequeueAll();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public abstract ConfigKeys getConfigKey();

    public final boolean isStarted() {
        return this.isStarted;
    }

    public final void restart() {
        stop();
        start();
    }

    protected final void setStarted(boolean z2) {
        this.isStarted = z2;
    }

    public abstract void start();

    public final void startIfNotStarted() {
        if (this.isStarted) {
            return;
        }
        start();
    }

    public abstract void stop();
}
