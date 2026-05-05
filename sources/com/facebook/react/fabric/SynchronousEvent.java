package com.facebook.react.fabric;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007f\u0007lsA0RnP.XU0Šq\u0012éT[Rp\u0004Ve\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'aܫ\u00132Pt\b:[zU9\u000fu|ԓ!z)F\u0006\u001d\u0001H+\u000fǼwCJY\u0019*0nt\u0001Ŭ\u000e\u0016*( \u001e>NҵNbmNDH\u0005]h0S\toB\\)w0+N=LZ'\u001byy\u001eYD}\u0094\u0014md\u0011\u0016j[m\u0013owK\u0016\u0001)=*wr\u001e\u0383YH\u001b#=g\r\fslٯ\u0004\u001ag\u001a:CO\u0012O\u0017̂'H\n\n\u0010T\u0004<\nόL45Կ~\n\u00149\u0003y$O^\u0002vB.{ˋ:\u001d-ĮK-?#tZ2J'PO{3\u000e̷'\u0007vďsV\u0014j#$ǁ{e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW*\u000b.3\\\u000b*@w&<-T;tCs", "", "Ata3T*>7\u0018", "", "DhTDG(@", "3uT;g\u0015:[\u0019", "", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016D\b", "5dc\u0012i,Gb\u0002z\u0003^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc h9?O\u0017~^]", "u(8", "5dc#\\,PB\u0015\u0001", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SynchronousEvent {
    private final String eventName;
    private final int surfaceId;
    private final int viewTag;

    public SynchronousEvent(int i2, int i3, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.surfaceId = i2;
        this.viewTag = i3;
        this.eventName = eventName;
    }

    public static /* synthetic */ SynchronousEvent copy$default(SynchronousEvent synchronousEvent, int i2, int i3, String str, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = synchronousEvent.surfaceId;
        }
        if ((2 & i4) != 0) {
            i3 = synchronousEvent.viewTag;
        }
        if ((i4 & 4) != 0) {
            str = synchronousEvent.eventName;
        }
        return synchronousEvent.copy(i2, i3, str);
    }

    public final int component1() {
        return this.surfaceId;
    }

    public final int component2() {
        return this.viewTag;
    }

    public final String component3() {
        return this.eventName;
    }

    public final SynchronousEvent copy(int i2, int i3, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new SynchronousEvent(i2, i3, eventName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SynchronousEvent)) {
            return false;
        }
        SynchronousEvent synchronousEvent = (SynchronousEvent) obj;
        return this.surfaceId == synchronousEvent.surfaceId && this.viewTag == synchronousEvent.viewTag && Intrinsics.areEqual(this.eventName, synchronousEvent.eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.surfaceId) * 31) + Integer.hashCode(this.viewTag)) * 31) + this.eventName.hashCode();
    }

    public String toString() {
        return "SynchronousEvent(surfaceId=" + this.surfaceId + ", viewTag=" + this.viewTag + ", eventName=" + this.eventName + ")";
    }
}
