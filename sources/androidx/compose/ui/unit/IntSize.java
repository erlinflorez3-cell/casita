package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0018\u007f\u0007lyA0RnP.XX2\u000fy\b<$a&wٙykڼ\u001cD9O|f ml\u001b\u001aIƤ\u0016\u001a\u0007jDI\u0004yٕ\u0016\u00118D}B{[}KQ`#;Kڛ:ŕ<{\u000b\u0010(3\u0011\u001e\u0005\u000b[K:\u0017vϓxĐV\u000fS\u0016(\u001bNZ.\u00136\\\u0016ޮfLzpR/Q\b0ıNф^ܞǠL\fТX)\u0013\u000bo3sXEK-%\u0002\u001a7XiR\u001bA\b<3gmާ,ʁwY<p\u000e-]9]'urTaKƀ_В+-U~YYVD\u0006\u0017\u0014\rjǉ>\n5[F-HkNԌ3иqԟŬO\u0001ެF\u0002\u0001~D,m\rAIQ\u001b\u0015p(PϭR9\u0002%\u001b?s\u0019|%sT<eK_+ȵSśUJMJT\u0010gD\u0006\u0006vj\u00103TDU\u007fG{?/M¦\u000eم;؝%q\n҆Ti|\u000fno$\u0002`SX\"\u001d\u001bmn_ȹ\\ֈh\u000f{RZd:\u0018e\u001eZ\u0014\f\u0011ʿ\u001f\\ʏ;!S\u0011ʝOqqjS|\u0012(5ϫS\bm±\u0012z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "6dX4[;", "", "5dc\u0015X0@V(=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u0015X0@V(F~f7\u0004", "uI\u0018\u0016", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "EhSA[", "5dc$\\+MVWz\u0004g6\f\u0005>i\n1\n", "5dc$\\+MV`\u0003\u0003i3", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "2he", "=sW2e", "2heyL\f(\"\t_\r", "uI8u=", "3pd._:", "", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "Bh\\2f", "Bh\\2fs23\u0003Mj?>", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6803constructorimpl(0);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m6800boximpl(long j2) {
        return new IntSize(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6803constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6805equalsimpl(long j2, Object obj) {
        return (obj instanceof IntSize) && j2 == ((IntSize) obj).m6812unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6806equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final int m6807getHeightimpl(long j2) {
        return (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final int m6808getWidthimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6809hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6805equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6809hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6812unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntSize(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m6801component1impl(long j2) {
        return m6808getWidthimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m6802component2impl(long j2) {
        return m6807getHeightimpl(j2);
    }

    /* JADX INFO: renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m6810timesYEO4UFw(long j2, int i2) {
        long j3 = ((long) (((int) (j2 >> 32)) * i2)) << 32;
        long j4 = ((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) * i2;
        long j5 = (j4 + 4294967295L) - (j4 | 4294967295L);
        return m6803constructorimpl((j3 + j5) - (j3 & j5));
    }

    /* JADX INFO: renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m6804divYEO4UFw(long j2, int i2) {
        return m6803constructorimpl((((long) (((int) (j2 >> 32)) / i2)) << 32) | (((long) (((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) / i2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6811toStringimpl(long j2) {
        return m6808getWidthimpl(j2) + " x " + m6807getHeightimpl(j2);
    }

    public String toString() {
        return m6811toStringimpl(this.packedValue);
    }

    /* JADX INFO: compiled from: IntSize.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0ղU\u0002e\u0015\u0015̒^\u001e>;Mu\\ˉdz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}^\u0015w\u001e9IL?u=s", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc'X9H\u001b\r{\u000ff\u0013I\u000b", "u(9", "\u0018", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m6813getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }
}
