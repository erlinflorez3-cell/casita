package com.dynatrace.agent.events.enrichment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4\u0012}\u0012njG9LeN.ZS8\u0015sڔ<$i0yّA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz2OU\u0007_*\u000f`EņC5SsK>){D\u000f82P9@ە\u0002b8V\u001b\u000fzqNRܼ1Ϯt<X\u0019[\fb4\u0014K8\u0001Lձ\u0018T<Hz]R/Q\u0004\u001aHT'm2\u0015M;I\u001bݒ\fțe 1NED]6a\u0013\u001fR\nP3E\u007fO\u001dj=&YH:ʥ7!\u0007\"(CO;q9ͽ[MXn!?+}y\u0012؋\rx\u0007\t{%<2\u000fΝ+N6Ʀ2h\u000e\u0014A{CdNR\u001a^p\u0003ѐe>\u001f%\u000e<C;!n_hދ\u001de"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u00172?s4\u0006\u0015wn=\u0005q\u0002", "", "AsP?g\u001bB[\u0019", "", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "\nh]6g\u0005", "uI9\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "5dc g(Kb\b\u0003\u0003^", "u(9", "5dc\u0011h9:b\u001d\t\u0004&\u001c\u000f\u001d\u00198\u000b&", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBN>\u0011r\u0002p}", "1n_F", "1n_F \u000f \u001e)Q^>", "uI9u?*H[b}\u000fg(\f\u0016+c\u007fqwB\u0001 &\u0011o\u001f<\u007f4C#})Dq\u00141UCDz}\r\u0019pa!\u0007r9Rt5\u001d", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TimeMetrics {
    private final long duration;
    private final long startTime;

    private TimeMetrics(long j2, long j3) {
        this.startTime = j2;
        this.duration = j3;
    }

    public /* synthetic */ TimeMetrics(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? Duration.Companion.m10409getZEROUwyO8pc() : j3, null);
    }

    public /* synthetic */ TimeMetrics(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* JADX INFO: renamed from: copy-HG0u8IE$default, reason: not valid java name */
    public static /* synthetic */ TimeMetrics m7117copyHG0u8IE$default(TimeMetrics timeMetrics, long j2, long j3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = timeMetrics.startTime;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j3 = timeMetrics.duration;
        }
        return timeMetrics.m7119copyHG0u8IE(j2, j3);
    }

    public final long component1() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m7118component2UwyO8pc() {
        return this.duration;
    }

    /* JADX INFO: renamed from: copy-HG0u8IE, reason: not valid java name */
    public final TimeMetrics m7119copyHG0u8IE(long j2, long j3) {
        return new TimeMetrics(j2, j3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeMetrics)) {
            return false;
        }
        TimeMetrics timeMetrics = (TimeMetrics) obj;
        return this.startTime == timeMetrics.startTime && Duration.m10311equalsimpl0(this.duration, timeMetrics.duration);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m7120getDurationUwyO8pc() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Duration.m10334hashCodeimpl(this.duration);
    }

    public String toString() {
        return "TimeMetrics(startTime=" + this.startTime + ", duration=" + ((Object) Duration.m10355toStringimpl(this.duration)) + ')';
    }
}
