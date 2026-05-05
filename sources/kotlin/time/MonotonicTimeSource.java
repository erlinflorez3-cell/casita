package kotlin.time;

import kotlin.Metadata;
import kotlin.time.TimeSource;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.X_2\u000fy\b<řaӗqYП\u0006\u001a,!ITTg̊rJh\u000b\f*\u0014\u0019\u0011jZM\u0006|k\u0017'2pso7[uU9\u000f{ȥ\t\"8*F\u0003M\u001c(4`\u0010%\u0002sO\u001a\u001dH@\u001f>\u0003\u0011[\u00112\u00124Bŋ\u0005 bt\\?\u0011\u007fkHG#1prR5dH|{\u0011ТX)\u0013\u0006o.sPEF-%\u0002\u0007MfĲ>šӭu?\u000bz5:sO\u0002kNX.\u0016[+\u0018\u0013k\b>\\3g' w7]dcP<*N߁}Ɂ@\u0004\u0016ͺάH05\u001al'ԭ7\f"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^ud\u00138o\u000f2\u0005D~\u0006\u001bOo{F\u000723YS", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U9s\u001d?T/=dy-3j\u001d.5?HqBs", "u(E", "Hda<", "", "/cYBf;+S\u0015}~g.", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U/y\u0017F\u0006/>]{^(i\u001d>M2?s4\u0006\u0011ug\u000f", "Bh\\2@(KY", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "/cYBf;+S\u0015}~g.DY\u001bK\ftI0", "uI9u=", "2hU3X9>\\\u0017~W^;\u000f\t/n", "=mT", "/m^A[,K", "2hU3X9>\\\u0017~W^;\u000f\t/nG)h'sbhY", "3kP=f,=4&\t\u0003", "3kP=f,=4&\t\u0003&||q\u0019Ny.", "uI\u0018\u0017", ";`a8A6P", ";`a8A6P\u001b.RaH \f\u0013", "u(9", "@dP1", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m10437adjustReading6QKq23U(long j2, long j3) {
        return TimeSource.Monotonic.ValueTimeMark.m10449constructorimpl(LongSaturatedMathKt.m10435saturatingAddNuflL3o(j2, DurationUnit.NANOSECONDS, j3));
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m10438differenceBetweenfRLX17w(long j2, long j3) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j2, j3, DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m10439elapsedFrom6eNON_k(long j2) {
        return LongSaturatedMathKt.saturatingDiff(read(), j2, DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m10446boximpl(m10440markNowz9LOYto());
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m10446boximpl(m10440markNowz9LOYto());
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m10440markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m10449constructorimpl(read());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
