package com.dynatrace.agent.storage.db;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4B\u0007\":\u001b\u007fјnjG6LeN=ZS8\u001bsڔ:Śa:ڎs;\u0004\u0019>G\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`F\u007fCAR\b=gfҽ:\u0007&90@B\f\u000f)BH>wAƖLT\u0019>P\t:\u0001\u000e\u0014ů\u001bZ\rL1\u0019\u001e\u000bk\u0015ɫI5dHA;\u0003\u0018H\u0015В`x,[ ^TU˙'g$+N7M\u0015ST3\rX[M\u0005Wqk\u0006\u0019--+Wvo6\u0007\u0004D\u001b1O\u001bb\u000b&\u000b\u000b\u0018ԧ\u000bo<]wcP<,(\u0001\n\"T\u0006$\u0005UGtǽ\u001b/\u000f\u001cI\rr\u0002F\u0017ٳ]\u000b\u0007\txN\u0017S\u0018yۖ8ku_aS\u0019|8߉\t\u0013&ŀ\u0019p'db\u00181$)V\u0010Q_R͘ANVˣq?s\u000f~lR9\u00123_\u007f]\u007f 2\u001d-ڛs;)$y\u000e\u0019Su{\u001d`\u0017YׂVNH̎\u0007\u0018=7\u0017\u001aʗH}"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u0016MR7j0-\u0011>", "", "7c", "", "Bh\\2f;:[$", "7r??\\6KW(\u0013YZ;x", "", "3uT;g\u001aBh\u0019[\u000fm,\u000b", "", "\nh]6g\u0005", "uI9'<o/", "5dc\u0016W", "u(9", "5dc!\\4>a(z\u0003i", "u(I", "5dc\u0012i,Gb\u0007\u0003\u0010^\t\u0011\u0018/s", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventMetadata {
    private final int eventSizeBytes;
    private final long id;
    private final boolean isPriorityData;
    private final long timestamp;

    public EventMetadata(long j2, long j3, boolean z2, int i2) {
        this.id = j2;
        this.timestamp = j3;
        this.isPriorityData = z2;
        this.eventSizeBytes = i2;
    }

    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, long j2, long j3, boolean z2, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            j2 = eventMetadata.id;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j3 = eventMetadata.timestamp;
        }
        if ((4 & i3) != 0) {
            z2 = eventMetadata.isPriorityData;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i2 = eventMetadata.eventSizeBytes;
        }
        return eventMetadata.copy(j2, j3, z2, i2);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final boolean component3() {
        return this.isPriorityData;
    }

    public final int component4() {
        return this.eventSizeBytes;
    }

    public final EventMetadata copy(long j2, long j3, boolean z2, int i2) {
        return new EventMetadata(j2, j3, z2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return this.id == eventMetadata.id && this.timestamp == eventMetadata.timestamp && this.isPriorityData == eventMetadata.isPriorityData && this.eventSizeBytes == eventMetadata.eventSizeBytes;
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
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isPriorityData)) * 31) + Integer.hashCode(this.eventSizeBytes);
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        return "EventMetadata(id=" + this.id + ", timestamp=" + this.timestamp + ", isPriorityData=" + this.isPriorityData + ", eventSizeBytes=" + this.eventSizeBytes + ')';
    }
}
