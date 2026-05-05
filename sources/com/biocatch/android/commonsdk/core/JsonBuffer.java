package com.biocatch.android.commonsdk.core;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007llA0RnP.XS2\u000fy{<řc$\u007f_CU }*\teNogtPpŏs\u000f4\u00159w<O[xk\u0012'2ppУ7M}?\u0002l\u0003>\u001d `+h}\u0013\u000b2*v\u000f?\rQV$\u0012^L!D`\u001ae\u000b*\u0014\u0016>N\u007fLj0RDW\u0005]h;k\u0007wRf'\u000eAEQ\u001bXl';w*\"9SO5C.\u001c\u0007\u0015fs?1P:I\u0013}?'YR$[Db\u0018\u0014C*\u0018\u0019k\t>\\3]\u0011\u00105+gcyQV2\u0006\u0012\u0014\u0013L\u0006\u001e\u0006UG\\;bl\u0016&Kt!_\u0007PRpP\u0003\u0013gF\u00195\u007fa*g\u001f=Ϣcޅ\u001dN?ަU\u0019,#\u0019nO\\+טlڠ\u001fT\u007f\u0383\u0002`NB`N8Zs2ձtf\u001a,\n6U\u0007¤\u007f*"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u0013[MDHD\u001f\u0016hn\u000f", "", ";`g \\A>", "", "uH\u0018#", "7mc2e5:Z\u007f\u0003\tm", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/df,\nOV", "Ahi2", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "/cS\u000e_3", "", "1", "", "1kT.e", "5dc", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "5dc\u001aT?,W.~", "7r4:c;R", ">dT8", "@d\\<i,", "Adc\u001aT?,W.~", "Bn2<_3>Q(\u0003\u0005g", "BqX:G6,W.~", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JsonBuffer {
    private final LinkedList<Object> internalList;
    private int maxSize;

    public JsonBuffer() {
        this(0, 1, null);
    }

    public JsonBuffer(int i2) {
        this.maxSize = i2;
        this.internalList = new LinkedList<>();
    }

    public /* synthetic */ JsonBuffer(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 0 : i2);
    }

    private final void trimToSize() {
        while (this.maxSize != 0 && getSize() > this.maxSize) {
            this.internalList.remove();
        }
    }

    public final synchronized boolean add(Object element) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(element, "element");
        zAdd = this.internalList.add(element);
        trimToSize();
        return zAdd;
    }

    public final synchronized void addAll(Collection<? extends Object> c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        this.internalList.addAll(c2);
        trimToSize();
    }

    public final synchronized void clear() {
        this.internalList.clear();
    }

    public final synchronized JSONArray get() {
        JSONArray jSONArray;
        jSONArray = new JSONArray((Collection) this.internalList);
        clear();
        return jSONArray;
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

    public final synchronized JSONArray peek() {
        return new JSONArray((Collection) this.internalList);
    }

    public final synchronized boolean remove(Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.internalList.remove(element);
    }

    public final synchronized void setMaxSize(int i2) {
        this.maxSize = i2;
        trimToSize();
    }

    public final synchronized Collection<Object> toCollection() {
        return CollectionsKt.toList(this.internalList);
    }
}
