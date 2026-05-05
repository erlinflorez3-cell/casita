package com.dynatrace.agent.storage.db;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r.4\u0012}\u0007njG9L͜P.`Y2\u000fq\u000f:śa:ڎs;\u0004\u0019>Q\u0019UTgunbZ9D\u001f\n$z\u0003,wX\ta \u0013JB\u001e@CQ}BQ`#<\u0015$@)Py3\tʀ.J\u0016\u007f\tM\u0014\u0013 CXphSȘ\u0006b\u0019\u0014R8\u0001L_.ߵ7\u0011skOG#1j\tľ((7\u000bc%F\u0003-Sȿbf2NNM\u0015S[IߞS$x\u0011W\n=3ؒW-1I\u0002WNX.\u0015E1U\rkt>\\3T\u0011\u0012-+]gcP<)(\u0001\u0002\rJ\t&\u0006UN^3 f\u0016\u0015Kt![\u0007ї\u0001'S\u000e\u0014y6E+099S3hg`i\u0018\u0015Ұ|M\u0014,>\u0019nOc\u001bج_]\"b\u0014i1\u007fC\u0004̇MZmKm\u001cp\u0011\u0003`\b\u0007Ϣ\u0002\u009e\u007f\u00176Ϗ=9aD1-<\u0011VF\u007fv3cĈWoZ̲X$t#E8Y\u001bhH|\u0005\u001aQԜ\\2\u0019۳4V\r\r\u0016\u001fpk\u0006A9%>Tћlorܔu\f+4tG*}y\u0015o9\r;̳Ui\u0018Рjx\u001aPJtۜ\\\u0004"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "", "7c", "", "3uT;g", "", "Bh\\2f;:[$", "7r??\\6KW(\u0013YZ;x", "", "3uT;g\u001aBh\u0019[\u000fm,\u000b", "", "\nh]6g\u0005", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q%uzZ8", "5dc\u0016W", "u(9", "5dc\u0012i,Gb", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!\\4>a(z\u0003i", "u(I", "5dc\u0012i,Gb\u0007\u0003\u0010^\t\u0011\u0018/s", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventRecord {
    private final String event;
    private final int eventSizeBytes;
    private final long id;
    private final boolean isPriorityData;
    private final long timestamp;

    public EventRecord(long j2, String event, long j3, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.id = j2;
        this.event = event;
        this.timestamp = j3;
        this.isPriorityData = z2;
        this.eventSizeBytes = i2;
    }

    public /* synthetic */ EventRecord(long j2, String str, long j3, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 0L : j2, str, j3, z2, i2);
    }

    public static /* synthetic */ EventRecord copy$default(EventRecord eventRecord, long j2, String str, long j3, boolean z2, int i2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            j2 = eventRecord.id;
        }
        if ((2 & i3) != 0) {
            str = eventRecord.event;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            j3 = eventRecord.timestamp;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            z2 = eventRecord.isPriorityData;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i2 = eventRecord.eventSizeBytes;
        }
        return eventRecord.copy(j2, str, j3, z2, i2);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.event;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final boolean component4() {
        return this.isPriorityData;
    }

    public final int component5() {
        return this.eventSizeBytes;
    }

    public final EventRecord copy(long j2, String event, long j3, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new EventRecord(j2, event, j3, z2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRecord)) {
            return false;
        }
        EventRecord eventRecord = (EventRecord) obj;
        return this.id == eventRecord.id && Intrinsics.areEqual(this.event, eventRecord.event) && this.timestamp == eventRecord.timestamp && this.isPriorityData == eventRecord.isPriorityData && this.eventSizeBytes == eventRecord.eventSizeBytes;
    }

    public final String getEvent() {
        return this.event;
    }

    public final int getEventSizeBytes() {
        return this.eventSizeBytes;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.event.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isPriorityData)) * 31) + Integer.hashCode(this.eventSizeBytes);
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        return "EventRecord(id=" + this.id + ", event=" + this.event + ", timestamp=" + this.timestamp + ", isPriorityData=" + this.isPriorityData + ", eventSizeBytes=" + this.eventSizeBytes + ')';
    }
}
