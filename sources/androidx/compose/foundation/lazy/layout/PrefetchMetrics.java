package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectLongMap;
import androidx.collection.ObjectLongMapKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005$4\u0012\u000e\u0007nj?8LeV.ZS0\u000fs{J$c$wFAT0ԂR\t}M(jĔNZ\u0019CW\u001c$\u0007\u0003,wW)a \u001eJB\u001eAcQ}MQ`#8K zFF\u000b\u001d\u0001H<x\u0016\u0005\u000e[M\"\u0011^?!D`!e\u000b*\u0014\u0016>N\u0013Lq.ޯ<Ղp]@Ek'wYf'\u000eB-S\u001bYl)#u\u0010\u001d[JEM-+c\u0005\u0017R\nQ1T8ܶ\u000bص+'1bDsD[\u0018\u0014C-\u007f\u0011ks>\\3S\u001fL}ˊ[ӍOV\u0016ߊ\u0010|\u0002\u0011J\t^\u001b5NF3*h\u0018\u000eas!ZĖT\bfۍ\u0018|g>%.PO9C3f\u007fck\u001d\\8\u0014\u0005; aAEĖgڍ\u0012f\u001dÑlyW<_E\u000e]\\\u0016qC}\u0006\u0001b0)27Ͻ\u00045\u0004߾F\u0019+DiBأ%\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nK,]\u0004+EZ$", "", "u(E", "\nrTA \u0006\u0017", "", "/uT?T.>1#\u0007\u0006h:\u0001\u00183o\t\u0017\u007fH\u0001\u007f\u0013Py\u001c", "5dc\u000ei,KO\u001b~Xh4\b\u0013=i\u000f,\u0006Io\u001b\u001fGX\nE\u00013", "u(9", "/uT?T.>1#\u0007\u0006h:\u0001\u00183o\t\u0017\u007fH\u0001\u007f\u0013Py\u001c\u0019\u000b\u0003?b\r @|\u0005BXC", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001ew\u001f05?FA", "5dc\u000ei,KO\u001b~Xh4\b\u0013=i\u000f,\u0006Io\u001b\u001fGX\nE\u00013\u0012m[*@|\u00167\\2Ov4", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%\u001fV\u0003 5||8VE#g?s", "/uT?T.>;\u0019z\tn9|w3m\u007f\u0011wI\u000b%", "5dc\u000ei,KO\u001b~b^(\u000b\u0019<en,\u0004@i\u0013 Q}", "/uT?T.>;\u0019z\tn9|w3m\u007f\u0011wI\u000b%s[M\u0018E\u0006%>hl4Bm", "5dc\u000ei,KO\u001b~b^(\u000b\u0019<en,\u0004@i\u0013 Q}jPT/>h})F\\*9M", "1`[0h3:b\u0019Z\f^9x\u000b/T\u00040{", "<df", "1ta?X5M", "@dR<e+\u001c]!\n\u0005l0\f\r9nn,\u0004D\n\u0019", "", "1n]AX5MB-\nz", "2n2<`7Ha\u001d\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "@dR<e+\u001c]!\n\u0005l0\f\r9nn,\u0004D\n\u0019UHy\u001eEu!D]\b)1z\u00165M?Ik", "@dR<e+&S\u0015\r\u000bk,k\r7i\t*", "2n<2T:N`\u0019", "@dR<e+&S\u0015\r\u000bk,k\r7i\t*:A\u000b' Fk\u001d@\u0001./f}'7i$.", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PrefetchMetrics {
    public static final int $stable = 8;
    private long averageCompositionTimeNanos;
    private long averageMeasureTimeNanos;
    private final MutableObjectLongMap<Object> averageCompositionTimeNanosByContentType = ObjectLongMapKt.mutableObjectLongMapOf();
    private final MutableObjectLongMap<Object> averageMeasureTimeNanosByContentType = ObjectLongMapKt.mutableObjectLongMapOf();

    public final MutableObjectLongMap<Object> getAverageCompositionTimeNanosByContentType() {
        return this.averageCompositionTimeNanosByContentType;
    }

    public final MutableObjectLongMap<Object> getAverageMeasureTimeNanosByContentType() {
        return this.averageMeasureTimeNanosByContentType;
    }

    public final long getAverageCompositionTimeNanos() {
        return this.averageCompositionTimeNanos;
    }

    public final long getAverageMeasureTimeNanos() {
        return this.averageMeasureTimeNanos;
    }

    public final long calculateAverageTime(long j2, long j3) {
        if (j3 == 0) {
            return j2;
        }
        long j4 = 4;
        return (j2 / j4) + ((j3 / j4) * ((long) 3));
    }

    public final void recordCompositionTiming$foundation_release(Object obj, Function0<Unit> function0) {
        long jNanoTime = System.nanoTime();
        function0.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            getAverageCompositionTimeNanosByContentType().set(obj, calculateAverageTime(jNanoTime2, getAverageCompositionTimeNanosByContentType().getOrDefault(obj, 0L)));
        }
        this.averageCompositionTimeNanos = calculateAverageTime(jNanoTime2, getAverageCompositionTimeNanos());
    }

    public final void recordMeasureTiming$foundation_release(Object obj, Function0<Unit> function0) {
        long jNanoTime = System.nanoTime();
        function0.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            getAverageMeasureTimeNanosByContentType().set(obj, calculateAverageTime(jNanoTime2, getAverageMeasureTimeNanosByContentType().getOrDefault(obj, 0L)));
        }
        this.averageMeasureTimeNanos = calculateAverageTime(jNanoTime2, getAverageMeasureTimeNanos());
    }
}
