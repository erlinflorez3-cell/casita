package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Deprecated(message = "\u0018Y\u0005Cx4uYk[:{S)\u0010]qN\u0015,xq\u0019WiU\u0004|Qyco{\frQ\rhwGM#Ey$[O\t/eMIiC8]K\\'IZW6\u0015\u0007\u001ep:07\r\nd\u0016\u0011\tM\u0003N\u0010S1-p\\}Ng!o\u007fm")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007fјnjG4LeN.Xx@ş\u001c{b#\u0014#z\u0004Fe\u001e\f\"!O|h̊rJh\r\f\u0015\u0014\u001b\u0011jZO\u001c\r&\u0018\u001d9Zom;\u0014\u0012\u000eKntN\u0005N3x\u0605{ڱ\u0005 2Ϻ(x\u0001FY\u0010ܞ4J"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yO_!'Dv\u000e+z-5G\b0Dk\u0016\u0004", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U9s\u001d?T/=dy-3j\u001d.5?HqBs", "CmXA", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "uKZ<g3B\\b\u000e~f,Fg?r{7\u007fJ\n\u0007 K~c\u007fg", "5dc\"a0M", "u(;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012", ";`a8A6P", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "@dP1", "", "\u0012nd/_,-W!~bZ9\u0003", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\n8é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.`\\2şs{BřcҕyCI[\"}(\u000fWNusvϺ`\u000bYƤ6\u0016'ilde|k\u0012'2ppO7[qU9\u000fwF\t.6:8(\nв\u001e*V\u0016?\u000bQS$\u0012^E7Nƞ\f˟ŋ\u001e\u0014\fG.\u000bfmuYNH\u001bij51\u0010\u0002Dd&\u000e>Cֈ\r\u000fZ5\u001c\u000faL;\u0007K}.3d\u001b\u0007\u0001`o\u0007M~U\u0005\u0017&mǹI؎V̬ݼ\u0004\u0016\u001b=] &\t4p\u001dQ\u000f\u000bW/]xcP<->ߕ{Ɂ@\u0006\u0014\u001c5_v3(~ \u000ea\u000e9g\u0011a\u0010bZ\u007f)f\rА'Ƨ2ٿݰ\u001fhYaI \u001fC\n\u0005%\u001eQ\u0002EĒ]ڍ\u0012`\u001dÑ%\u0004_3i@kK%˦[ǀq\u0004xç̦*\u00068G\u0006Nɮ\u0015H"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yO_!'Dv\u000e+z-5G\b0Dk\u0016l,MKh;\u001e\u0004li9n_9TL", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "AsP?g,=/(", "", "Bh\\2F6N`\u0017~", "\u001aj^A_0G\u001d(\u0003\u0003^uX\u0006=t\r$yO_!'Dv\u000e+z-5G\b0Dk\u0016\u0004", "=eU@X;", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "uC;8b;EW\"H\nb4|R\u000bb\u000e7\t<~&uQ\u007f\u000bCv\u00149a}\u000eA}#,M\u0019 R:($oeBPh=V@+P[N9eNy\u0007r\u0012[\n^2\u001cbcJ2}QG\u001d\u00176Vi7u\u0007\f#cx[", "\u0018", "3kP=f,=<#\u0011", "3kP=f,=<#\u0011BN>\u0011r\u0002p}", "u(9", "3pd._:", "", "=sW2e", "", "6`b566=S", "", ";h]Bf", ";h]Bfs.e-hMi*", "uKZ<g3B\\b\u000e~f,Ff9m\u000b$\t<}\u001e\u00176s\u0016<^!B_Sc\u001c", ">kd@", "2ta.g0H\\", ">kd@ \u0013+2'h_h", "uI\u0018\u0019^6MZ\u001d\bDm0\u0005\txC\n0\u0007<\u000e\u0013\u0014No|@~%\u001dU\u000b&\r", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class DoubleTimeMark implements ComparableTimeMark {
        private final long offset;
        private final double startedAt;
        private final AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double d2, AbstractDoubleTimeSource timeSource, long j2) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = d2;
            this.timeSource = timeSource;
            this.offset = j2;
        }

        public /* synthetic */ DoubleTimeMark(double d2, AbstractDoubleTimeSource abstractDoubleTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(d2, abstractDoubleTimeSource, j2);
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo10296elapsedNowUwyO8pc() {
            return Duration.m10341minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object obj) {
            return (obj instanceof DoubleTimeMark) && Intrinsics.areEqual(this.timeSource, ((DoubleTimeMark) obj).timeSource) && Duration.m10311equalsimpl0(mo10298minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m10409getZEROUwyO8pc());
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
            return Duration.m10334hashCodeimpl(Duration.m10342plusLRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo10297minusLRDsOJo(long j2) {
            return ComparableTimeMark.DefaultImpls.m10301minusLRDsOJo(this, j2);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo10298minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, doubleTimeMark.timeSource)) {
                    if (Duration.m10311equalsimpl0(this.offset, doubleTimeMark.offset) && Duration.m10338isInfiniteimpl(this.offset)) {
                        return Duration.Companion.m10409getZEROUwyO8pc();
                    }
                    long jM10341minusLRDsOJo = Duration.m10341minusLRDsOJo(this.offset, doubleTimeMark.offset);
                    long duration = DurationKt.toDuration(this.startedAt - doubleTimeMark.startedAt, this.timeSource.getUnit());
                    return Duration.m10311equalsimpl0(duration, Duration.m10359unaryMinusUwyO8pc(jM10341minusLRDsOJo)) ? Duration.Companion.m10409getZEROUwyO8pc() : Duration.m10342plusLRDsOJo(duration, jM10341minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo10299plusLRDsOJo(long j2) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.m10342plusLRDsOJo(this.offset, j2), null);
        }

        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m10355toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    public AbstractDoubleTimeSource(DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    protected final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new DoubleTimeMark(read(), this, Duration.Companion.m10409getZEROUwyO8pc(), null);
    }

    protected abstract double read();
}
