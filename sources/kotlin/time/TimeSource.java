package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0005\bBߚ\u0016\t\u0017jg/|fJ1V\u001c0\u001dk\u00144R\\j\u0016ٺ?Z"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017l", "", ";`a8A6P", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7eg$\tFV", "\u0011n\\=T5B]\"", "\u001bn]<g6GW\u0017", "%hc566F^\u0015\fv[3|p+r\u00066", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface TimeSource {
    public static final Companion Companion = Companion.$$INSTANCE;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U%y\u0016Gr.9c\u0007u", "", "u(E", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nj?0JΣHDɟ\u0004*=j43+\u001c)wCтY\u001a\f\"Q_\\h\u007fnx\\QWȝ\u0005ǝѱn.OX\u0007aZ\u0015@G\b?aS6Qʣ`v>\u0005&Qś<\u0002"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U/y\u0017F\u0006/>]{u", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U9s\u001d?T/=dy-3j\u001d.5?HqBs", "u(E", ";`a8A6P", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U/y\u0017F\u0006/>]{^(i\u001d>M2?s4\u0006\u0011ug\u000f", ";`a8A6P\u001b.RaH \f\u0013", "u(9", "BnBAe0GU", "", "$`[BX\u001bB[\u0019fvk2", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\r8\u000bDB\u0007\"2\u0013\u007f\u0007tpA0JgP.hS2\u000fq{<$i-yCI٥\"}(\u001bWNusvJ`\fIƬD,ю\u001b,wT9p\u0018ƁBJ}?KQ\u001e>\"`S8ӯ$4(;\b\tI08M(v)I{\u0010 7XphĥS˦\u0005ܨ\u0016\bD(\u000f'%w\\@`l\fEu7ʾhĩĚ+a6\t[\u0011\u000fl5\u001a\u000faL9p=C\u001c=U\u0019\u0006\u0001j\u0006Ƹ@џA\u0007n75<\u0012\u0001eHp\u007fB#qcոat,o\u0013e)\u00195@gcy^T<Þ~}\u0013R\u0012\"N5VEE\u001a\u0015\u000eT߮sɤWBV\u001al[H\u0014oP/%.>[=)miai\u0018\u0015Ѱ{͕\f̔ţ\u0005p'vb*)+)n\u0010Q_҅pAVk\"YkxJͦb͆.\u00066e\u000eND'<1=7\nDS%y\t`D\u0016ϸK¢hרmTN`0\u000e^M8*$Zrߟ5o^qp,?XbΘ\u0007ą\f\u0015&~\u0006[i3\u001eqgh\u0018\u000f\u0014Ё\tɻ3h=~|\u0012^gG^K9\u007fdxa1xj̴>И\tXn̻Ͷ\u000bZٵ'&`IS\u0010V}ͬN\u000e\u001b2E\u0011ʲ8S"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U/y\u0017F\u0006/>]{^(i\u001d>M2?s4\u0006\u0011ug\u000f", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "@dP1\\5@", "", "\u001aj^A_0G\u001d(\u0003\u0003^um\u00056u\u007f\u0017\u007fH\u0001~\u0013Tuz<r$9b\u007fu", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "1n\\=T9>B#", "", "=sW2e", "1n\\=T9>B#FK^\u0015fq)k", "uI9u<", "3kP=f,=<#\u0011", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "3kP=f,=<#\u0011BN>\u0011r\u0002p}", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b\u001bb;)O'\rz]\u0015\u0007\u001b", "6`b\u001bb;)O'\rz]\u0015\u0007\u001bvi\b3\u0003", "uI\u0018'", "6`b\u001dT:LS\u0018g\u0005p", "6`b\u001dT:LS\u0018g\u0005ps\u0001\u0011:l", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", ";h]Bf", ";h]Bfs.e-hMi*", "uI;8b;EW\"H\nb4|R\ro\b3wM|\u0014\u001eG^\u0012Dv\r1f\u0004uzR", "2ta.g0H\\", ";h]Bfs%@w\rdC6", "uI9u=", ";h]Bfs\u000fS\u0002hcX2", ">kd@", ">kd@ \u0013+2'h_h", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        @JvmInline
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j2) {
                this.reading = j2;
            }

            /* JADX INFO: renamed from: box-impl */
            public static final /* synthetic */ ValueTimeMark m10446boximpl(long j2) {
                return new ValueTimeMark(j2);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k */
            public static final int m10447compareTo6eNON_k(long j2, long j3) {
                return Duration.m10305compareToLRDsOJo(m10456minus6eNON_k(j2, j3), Duration.Companion.m10409getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl */
            public static int m10448compareToimpl(long j2, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m10446boximpl(j2).compareTo(other);
            }

            /* JADX INFO: renamed from: constructor-impl */
            public static long m10449constructorimpl(long j2) {
                return j2;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public static long m10450elapsedNowUwyO8pc(long j2) {
                return MonotonicTimeSource.INSTANCE.m10439elapsedFrom6eNON_k(j2);
            }

            /* JADX INFO: renamed from: equals-impl */
            public static boolean m10451equalsimpl(long j2, Object obj) {
                return (obj instanceof ValueTimeMark) && j2 == ((ValueTimeMark) obj).m10463unboximpl();
            }

            /* JADX INFO: renamed from: equals-impl0 */
            public static final boolean m10452equalsimpl0(long j2, long j3) {
                return j2 == j3;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl */
            public static boolean m10453hasNotPassedNowimpl(long j2) {
                return Duration.m10339isNegativeimpl(m10450elapsedNowUwyO8pc(j2));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl */
            public static boolean m10454hasPassedNowimpl(long j2) {
                return !Duration.m10339isNegativeimpl(m10450elapsedNowUwyO8pc(j2));
            }

            /* JADX INFO: renamed from: hashCode-impl */
            public static int m10455hashCodeimpl(long j2) {
                return Long.hashCode(j2);
            }

            /* JADX INFO: renamed from: minus-6eNON_k */
            public static final long m10456minus6eNON_k(long j2, long j3) {
                return MonotonicTimeSource.INSTANCE.m10438differenceBetweenfRLX17w(j2, j3);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo */
            public static long m10457minusLRDsOJo(long j2, long j3) {
                return MonotonicTimeSource.INSTANCE.m10437adjustReading6QKq23U(j2, Duration.m10359unaryMinusUwyO8pc(j3));
            }

            /* JADX INFO: renamed from: minus-UwyO8pc */
            public static long m10458minusUwyO8pc(long j2, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m10456minus6eNON_k(j2, ((ValueTimeMark) other).m10463unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m10460toStringimpl(j2)) + " and " + other);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo */
            public static long m10459plusLRDsOJo(long j2, long j3) {
                return MonotonicTimeSource.INSTANCE.m10437adjustReading6QKq23U(j2, j3);
            }

            /* JADX INFO: renamed from: toString-impl */
            public static String m10460toStringimpl(long j2) {
                return "ValueTimeMark(reading=" + j2 + ')';
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo10296elapsedNowUwyO8pc() {
                return m10450elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m10451equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m10453hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m10454hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m10455hashCodeimpl(this.reading);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo */
            public long m10461minusLRDsOJo(long j2) {
                return m10457minusLRDsOJo(this.reading, j2);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo10297minusLRDsOJo(long j2) {
                return m10446boximpl(m10461minusLRDsOJo(j2));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo10297minusLRDsOJo(long j2) {
                return m10446boximpl(m10461minusLRDsOJo(j2));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo10298minusUwyO8pc(ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m10458minusUwyO8pc(this.reading, other);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo */
            public long m10462plusLRDsOJo(long j2) {
                return m10459plusLRDsOJo(this.reading, j2);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo10299plusLRDsOJo(long j2) {
                return m10446boximpl(m10462plusLRDsOJo(j2));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo10299plusLRDsOJo(long j2) {
                return m10446boximpl(m10462plusLRDsOJo(j2));
            }

            public String toString() {
                return m10460toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl */
            public final /* synthetic */ long m10463unboximpl() {
                return this.reading;
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m10446boximpl(m10445markNowz9LOYto());
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m10446boximpl(m10445markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto */
        public long m10445markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m10440markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLш|\u0004W\u00068é4(\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w֜\u0013m"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U9s\u001d?T/=dy-3j\u001d.5?HqBs", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017l", ";`a8A6P", "\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
