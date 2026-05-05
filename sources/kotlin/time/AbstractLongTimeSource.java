package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u0019\u007f\u0007lnA0ZeP.XT04\u0002ڔd$\n#*BJ\u0016%\u000e&\u0017Ofg\u0016oН^\u000bQ\u0011N\u001c\u0007uDI\u0004~$\u0012W8P{W3{|\u0004M)zD\u001382P>@'Q,8H(v)D\"Í\u0014ضDvBĥ%O\u000b\u001d \n\u000f9\u000f#tg|<~-4ƀǇ#ɨmLV)e9\u000bW%HZ.\u001b~Җ\";"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yOg! I^\u0012Dv\u0013?i\u000b\u001e7C", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U9s\u001d?T/=dy-3j\u001d.5?HqBs", "CmXA", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "uKZ<g3B\\b\u000e~f,Fg?r{7\u007fJ\n\u0007 K~c\u007fg", "5dc\"a0M", "u(;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012", "Hda<", "", "5dc'X9H", "u(9", "Hda<\u0017+>Z\u0019\u0001vm,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/cYBf;>R\u0006~v]", ";`a8A6P", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "@dP1", "\u001an]4G0FS\u0001z\bd", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;
    private final Lazy zero$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.`\\2şs{BřcҕyCI[\"}(\u000fWNusvϺ`\u000bYƤ6\u0016'ilde|k\u0012'2ppO7[qU9\u000fwF\t.6:8(\nв\u001e*V\u0016?\u000bQS$\u0012^E7Nƞ\f˟ŋ\u001e\u0014\fG.\u000bfmuYNH\u001bij51\u0010\u0002Dd&\u000e>Cֈ\r\u000fZ5\u001c\u000faL;\u0007K}.3d\u001b\u0007\u0001`o\u0007M~U\u0005\u0017&mǹI؎V̬ݼ\u0004\u0016\u001b=] &\t4p\u001dQ\u000f\u000bW/]xcP<->ߕ{Ɂ@\u0006\u0014\u001c5_v3(~ \u000ea\u000e9g\u0011a\u0010bZ\u007f)f\rА'Ƨ2ٿݰ\u001fhYaI \u001fC\n\u0005%\u001eQ\u0002EĒ]ڍ\u0012`\u001dÑ%\u0004_3i@kK%˦[ǀq\u0004xç̦*\u00068G\u0006Nɮ\u0015H"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yOg! I^\u0012Dv\u0013?i\u000b\u001e7,|8VE*o<\u001e|dn?\\", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "AsP?g,=/(", "", "Bh\\2F6N`\u0017~", "\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yOg! I^\u0012Dv\u0013?i\u000b\u001e7C", "=eU@X;", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "uI;8b;EW\"H\nb4|R\u000bb\u000e7\t<~&}Qx\u0010+z-5G\b0Dk\u0016\u00042*AuC%\u0019q+>\u0018kuR\u007f6GYW(c\u001cQ=\u0015\u000ej\u0015]\t\u0017\u000egP1~BF)\u0015\u0014E\u000fAh\u000eaY~", "\u0018", "3kP=f,=<#\u0011", "3kP=f,=<#\u0011BN>\u0011r\u0002p}", "u(9", "3pd._:", "", "=sW2e", "", "6`b566=S", "", ";h]Bf", ";h]Bfs.e-hMi*", "uKZ<g3B\\b\u000e~f,Ff9m\u000b$\t<}\u001e\u00176s\u0016<^!B_Sc\u001c", ">kd@", "2ta.g0H\\", ">kd@ \u0013+2'h_h", "uI\u0018\u0019^6MZ\u001d\bDm0\u0005\txC\n0\u0007<\u000e\u0013\u0014No|@~%\u001dU\u000b&\r", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        private LongTimeMark(long j2, AbstractLongTimeSource timeSource, long j3) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j2;
            this.timeSource = timeSource;
            this.offset = j3;
        }

        public /* synthetic */ LongTimeMark(long j2, AbstractLongTimeSource abstractLongTimeSource, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, abstractLongTimeSource, j3);
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo10296elapsedNowUwyO8pc() {
            return Duration.m10341minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            return (obj instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) obj).timeSource) && Duration.m10311equalsimpl0(mo10298minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m10409getZEROUwyO8pc());
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (Duration.m10334hashCodeimpl(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo10297minusLRDsOJo(long j2) {
            return ComparableTimeMark.DefaultImpls.m10301minusLRDsOJo(this, j2);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo10298minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m10342plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m10341minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo10299plusLRDsOJo(long j2) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m10338isInfiniteimpl(j2)) {
                return new LongTimeMark(LongSaturatedMathKt.m10435saturatingAddNuflL3o(this.startedAt, unit, j2), this.timeSource, Duration.Companion.m10409getZEROUwyO8pc(), null);
            }
            long jM10358truncateToUwyO8pc$kotlin_stdlib = Duration.m10358truncateToUwyO8pc$kotlin_stdlib(j2, unit);
            long jM10342plusLRDsOJo = Duration.m10342plusLRDsOJo(Duration.m10341minusLRDsOJo(j2, jM10358truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long jM10435saturatingAddNuflL3o = LongSaturatedMathKt.m10435saturatingAddNuflL3o(this.startedAt, unit, jM10358truncateToUwyO8pc$kotlin_stdlib);
            long jM10358truncateToUwyO8pc$kotlin_stdlib2 = Duration.m10358truncateToUwyO8pc$kotlin_stdlib(jM10342plusLRDsOJo, unit);
            long jM10435saturatingAddNuflL3o2 = LongSaturatedMathKt.m10435saturatingAddNuflL3o(jM10435saturatingAddNuflL3o, unit, jM10358truncateToUwyO8pc$kotlin_stdlib2);
            long jM10341minusLRDsOJo = Duration.m10341minusLRDsOJo(jM10342plusLRDsOJo, jM10358truncateToUwyO8pc$kotlin_stdlib2);
            long jM10326getInWholeNanosecondsimpl = Duration.m10326getInWholeNanosecondsimpl(jM10341minusLRDsOJo);
            if (jM10435saturatingAddNuflL3o2 != 0 && jM10326getInWholeNanosecondsimpl != 0 && (jM10435saturatingAddNuflL3o2 ^ jM10326getInWholeNanosecondsimpl) < 0) {
                long duration = DurationKt.toDuration(MathKt.getSign(jM10326getInWholeNanosecondsimpl), unit);
                jM10435saturatingAddNuflL3o2 = LongSaturatedMathKt.m10435saturatingAddNuflL3o(jM10435saturatingAddNuflL3o2, unit, duration);
                jM10341minusLRDsOJo = Duration.m10341minusLRDsOJo(jM10341minusLRDsOJo, duration);
            }
            long j3 = jM10435saturatingAddNuflL3o2 - 1;
            if ((1 + j3) - (1 & j3) == Long.MAX_VALUE) {
                jM10341minusLRDsOJo = Duration.Companion.m10409getZEROUwyO8pc();
            }
            return new LongTimeMark(jM10435saturatingAddNuflL3o2, this.timeSource, jM10341minusLRDsOJo, null);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m10355toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    public AbstractLongTimeSource(DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero$delegate = LazyKt.lazy(new Function0<Long>() { // from class: kotlin.time.AbstractLongTimeSource$zero$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(this.this$0.read());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    protected final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.Companion.m10409getZEROUwyO8pc(), null);
    }

    protected abstract long read();
}
