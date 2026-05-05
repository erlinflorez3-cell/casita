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
/* JADX INFO: compiled from: Velocity.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0017\u007f\u0007l{A0RnP.XU2\u000fy\u0002<$a.yCIa\"}(\rUȦ&}ñh\u000b;C=\u0005Nw\u001blX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@/Py3\u0006`ݚPǘz|IY\u001a\u001bxN~Ij\r{\n`ŏ\u000ȩ$\u0003$luW~mznR/QɅ\u001aHT'm4\u0015M;K\u0005-\u0013vo(C@e:\u05cf$مЁ\u0006QÜC\u0005E\u0004K\u00181C5?as\u0006̬\t\u0004\"*CO;b9̮\\՝PӠѨ&*յgMV$6\u000fC\u0014\u001bT\u001c\u000e4@x4;4~\n$2#q\u001aŊQؿbD\u0006\u0016oR_3\u000ePC9I\u0005\u0018ż:ϭR9\u0002$\u001b>k\u001a|BsT<֫E\u001fb\u0012i1\u007f̵\u0004ʸN͜X<ъ\brh$8'x`\u000eS\u0014\u0011\\ϏU;iS;!\u001aȵ\u000fֻgѱ\u0004_ĈWkXmNE72EP!\f\tե\u0015\tyelXZ\u0016\u0014ɄTϮ|ܱ̯\u001f[ʟ@#+7\\f1\u0006xuu\nSÄ\u0017;g\u0004\u0004\u000e\u0006>%ڰ5ʚb߄ҙQu݀C>h.f}\u000b`\u001a\u0005t(P]\u000f~ݻ{}Jz\u001a@zS\u007fJL,_ǉ#ñHԊ\u001dՓ̿{\bރ^j\u0016.b6t\u000fw$\r\t/Q3ʜqς|I4ʉ1:;Ei5G+\ff?\u061c~ɠ\u000b\t\u0004\u0002MmZNdn\u001c}c\u0005p.(Ci/k\u0018EC\u007fɍ\u0004βIV\u0003gWX .\u0013~\u007f\u001bIqִf\bϑo,\u000fk\u07bdO]\u001f\"|}z&\u000e\u070f\u001c(`è~x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "F", "", "5dc%\u0017(G\\#\u000evm0\u0007\u0012=", "u(E", "5dc% 0F^ ", "uI\u0018\u0013", "G", "5dc&\u0017(G\\#\u000evm0\u0007\u0012=", "5dc& 0F^ ", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F \u0016AT\u001asJF", "uI5\u0013\u001c\u0011", "2he", "=oT?T5=", "2heyT+C3\u007f\fV", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", ";h]Bf", ";h]Bfs\u001a6eKM@*", "uI9u=", ">kd@", ">kd@ \b! eQ\\\\", "@d\\", "@d\\yT+C3\u007f\fV", "Bh\\2f", "Bh\\2fs:R\u001e^ak\b", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rB2\u001c\u0010p\u001b8g", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6869constructorimpl(0);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m6866boximpl(long j2) {
        return new Velocity(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6869constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6873equalsimpl(long j2, Object obj) {
        return (obj instanceof Velocity) && j2 == ((Velocity) obj).m6884unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6874equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6877hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6873equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6877hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6884unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Velocity(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m6867component1impl(long j2) {
        return m6875getXimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m6868component2impl(long j2) {
        return m6876getYimpl(j2);
    }

    /* JADX INFO: compiled from: Velocity.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8ݼoFAczȤ!N1*8\u007f$и\u001e1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4uK 6X?Do>'j", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "5dc'X9H\u001bln\u000eF\u0018Opma\t1\u0006O|&\u001bQx\u001c", "5dc'X9H\u001bln\u000eF\u0018Op", "u(9", "\u0018", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m6885getZero9UxMQ8M$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m6886getZero9UxMQ8M() {
            return Velocity.Zero;
        }
    }

    /* JADX INFO: renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m6883unaryMinus9UxMQ8M(long j2) {
        return m6869constructorimpl(j2 ^ (-9223372034707292160L));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6882toStringimpl(long j2) {
        return "(" + m6875getXimpl(j2) + ", " + m6876getYimpl(j2) + ") px/sec";
    }

    public String toString() {
        return m6882toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m6875getXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m6876getYimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m6870copyOhffZ5M(long j2, float f2, float f3) {
        return m6869constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(f2)) << 32)) & ((-1) - (((long) Float.floatToRawIntBits(f3)) & 4294967295L))));
    }

    /* JADX INFO: renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m6871copyOhffZ5M$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Float.intBitsToFloat((int) ((-1) - (((-1) - 4294967295L) | ((-1) - j2))));
        }
        return m6870copyOhffZ5M(j2, f2, f3);
    }

    /* JADX INFO: renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m6878minusAH228Gc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) ((j3 + 4294967295L) - (j3 | 4294967295L)));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j4 = jFloatToRawIntBits << 32;
        long j5 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return m6869constructorimpl((j4 + j5) - (j4 & j5));
    }

    /* JADX INFO: renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m6879plusAH228Gc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | ((-1) - 4294967295L));
        return m6869constructorimpl((jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2));
    }

    /* JADX INFO: renamed from: times-adjELrA, reason: not valid java name */
    public static final long m6881timesadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) * f2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return m6869constructorimpl((j3 + j4) - (j3 & j4));
    }

    /* JADX INFO: renamed from: div-adjELrA, reason: not valid java name */
    public static final long m6872divadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) / f2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        return m6869constructorimpl((-1) - (((-1) - (jFloatToRawIntBits << 32)) & ((-1) - ((jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L)))));
    }

    /* JADX INFO: renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m6880remadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) % f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) % f2;
        return m6869constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }
}
