package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LazyStaggeredGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0014\u007f\u0007tsAӄLeV4Zݷ0ş\u0002ڔd$\n#2TK_(}:\u000f_Pwg\u001dL\t\fß\u0013\u0006${38W[\u0011]@\u0016bF}GKM\u001eF\nu\u00036\u001d&B$Hy3\u0003H+Н\u0014|\u0003ŏc\u000e\u00184NuĖV\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{Y'\u0016ofK5rC7,]", "", "7mc2e=:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YqW:\r\u0012j=+D", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u0018'$hnJ\u0003j\u0013R\u00056\u001d\u0010?", "5dc\u0016a;>`*z\u0002l", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0002\u001ewaF\u0018_35z5V\"", "7r5B_3,^\u0015\b", "", "7sT:<5=S,", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridInterval> intervalList) {
        this.intervals = intervalList;
    }

    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i2) {
        if (i2 < 0 || i2 >= this.intervals.getSize()) {
            return false;
        }
        IntervalList.Interval<LazyStaggeredGridInterval> interval = this.intervals.get(i2);
        Function1<Integer, StaggeredGridItemSpan> span = interval.getValue().getSpan();
        return span != null && span.invoke(Integer.valueOf(i2 - interval.getStartIndex())) == StaggeredGridItemSpan.Companion.getFullLine();
    }
}
