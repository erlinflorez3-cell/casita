package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JgP.`S2şs{BBcҕyCI^\"}(\nWNu\u0004vJ`\u000fYƤ6\u0016'ilVe~c\u0012\u001d2Zom4ޜs=Gb=:\u0013)J\"f\u0004M\u000b(5`\u0016\u0007|SK:\u0017^L9F`\u001ae\u0005H 6B.\u00106\\\u0016S~ZzmR/Q\r\u001aL\\8w6\rO\u001dF\u0003,;\t*\"9SO5C&\u001c\u0007\u0015fs?1M:I\u0013}?'YS$[DX\u0018\u0014C,\u0018\u0017k\t>b\u0015Sp\fU0}u\u0014V\u001c?\u0010z*\u0017\u0003\u0004^\u00185KF3*h\u0018\u000eay!W\u0017Г\u0004ެF\u007f\u0003ʨ\u0007#3\u007fK+g\u001c=Ϣmޅ\u001dN?ަU\u001c,)\u0019nO\\\u000bR\u05ce\u0019\u001flyW8_HשLf"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "", ";`g \\A>", "", "uH\u0018#", "7mc2e5:Z\u007f\u0003\tm", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/df,\nOV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "Ahi2", "5dc \\A>", "u(8", "1kT.e", "", "2d`BX<>/ \u0006", "", "3m`BX<>", "", "3kT:X5M", "3m`BX<>;\u0015\b\u000f", "1", "", "5dc\u001aT?,W.~", "7r4:c;R", "Adc\u001aT?,W.~", "Bn2<_3>Q(\u0003\u0005g", "BqX:G6,W.~", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataQueue {
    private final LinkedList<CollectionItem> internalList;
    private int maxSize;

    public DataQueue() {
        this(0, 1, null);
    }

    public DataQueue(int i2) {
        this.maxSize = i2;
        this.internalList = new LinkedList<>();
    }

    public /* synthetic */ DataQueue(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    private final void trimToSize() {
        while (this.maxSize != 0 && getSize() > this.maxSize) {
            this.internalList.remove();
        }
    }

    public final synchronized void clear() {
        this.internalList.clear();
    }

    public final synchronized List<CollectionItem> dequeueAll() {
        List<CollectionItem> list;
        list = CollectionsKt.toList(this.internalList);
        clear();
        return list;
    }

    public final synchronized boolean enqueue(CollectionItem element) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(element, "element");
        zAdd = this.internalList.add(element);
        trimToSize();
        return zAdd;
    }

    public final synchronized void enqueueMany(Collection<? extends CollectionItem> c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        this.internalList.addAll(c2);
        trimToSize();
    }

    public final synchronized int getMaxSize() {
        return this.maxSize;
    }

    public final synchronized int getSize() {
        return this.internalList.size();
    }

    public final synchronized boolean isEmpty() {
        return getSize() == 0;
    }

    public final synchronized void setMaxSize(int i2) {
        this.maxSize = i2;
        trimToSize();
    }

    public final synchronized Collection<CollectionItem> toCollection() {
        return this.internalList;
    }
}
