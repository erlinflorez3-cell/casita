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
/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0018\u007f\u0007lwA0RjP.XT2\u000fy\u0005<$a2yCIa\"}(\rUȦ&}ñh\f;C=\u0005Nw\u001clX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@0Py3\b`ݚPǘz|IZ\u001a\u001cxN~Jj\r{\f`ŏ\u000ȩ$\u0003$muX~mzoR/QɅ\u001aHT'm6\u0015M;M\u0005-\u0013vo)C@e<\u05cf$مЁ\u0006QÜC\u0005E\u0005K\u00191C5@as\u0006̬\t\u0004\"+CO;t9̮\\՝PӠѨ&*յgMV&6\u0011C\u0014\u001bV\u001c\u000e4Bx4;6~\n$2#q\u001aŊQؿbD\u0006\u0018oT_3\u000eRC9Im\u0018ż:ϭR9\u0002%\u001b(k\u001a|BsT<֫E\u001fb\u0014i1\u007f̵\u0004ʸN͜X<ъ\brh$8'x`\u000eS\u0014\u0011\\ϏU;iU;!\u001aȵ\u000fֻgѱ\u0004_ĈWkXmNE72EP!\f\tե\u0015\tyflXZ\u0018\u0014ɄTϮ|ܱ̯\u001f[ʟ@#+7\\w1\u0006xvu\nSÄ\u0017;g\u0005\u0004\u000e\u0006P%ڰ5ʚb߄ҙQu݀C>h/f\u007f\u000b`\u001a\u0006t(P^\u000f\u007fݻ{}J{\u001aAzS\u007fKL,_ǉ#ñHԊ\u001dՓ̿{\bރ^j\u0016/b6t\u0017w$\r\t/Q\u0013ʙFΡzͅ0\u0003hõ=CW9'+&:v:\u0015#5\u0006*D\u001eэNܤPv&w[\u0004.\u001b2;W8K\u001d_\u00177=\u001a-sS)*(˯\u0014ؠ~\u0007\n\u0011At<l lv9nt߃NTϲ!v\rsֿ\bm\byge\u0003JiӜ'\n=ϝv5"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "F", "", "5dc%\u0017(G\\#\u000evm0\u0007\u0012=", "5dc% 0F^ ", "uI\u0018\u0016", "G", "5dc&\u0017(G\\#\u000evm0\u0007\u0012=", "5dc& 0F^ ", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F 0,P$e\u0002R", "uI8\u0016\u001c\u0011", "2he", "=oT?T5=", "", "2hey51H#h\u0006I", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", ";h]Bf", ";h]BfsJY\u0005\u0003KZ ", "uI9u=", ">kd@", ">kd@ 8D?\u001dOvR", "@d\\", "@d\\y51H#h\u0006I", "uI8u=", "Bh\\2f", "Bh\\2fs\u001bX#NJez", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rBg\u0016z\u0007va}", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class IntOffset {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6760constructorimpl(0);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m6757boximpl(long j2) {
        return new IntOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6760constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6764equalsimpl(long j2, Object obj) {
        return (obj instanceof IntOffset) && j2 == ((IntOffset) obj).m6775unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6765equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m6766getXimpl(long j2) {
        return (int) (j2 >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m6767getYimpl(long j2) {
        return (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6768hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6764equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6768hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6775unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntOffset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m6758component1impl(long j2) {
        return m6766getXimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m6759component2impl(long j2) {
        return m6767getYimpl(j2);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m6762copyiSbpLlY$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = (int) (j2 >> 32);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = (int) (4294967295L & j2);
        }
        return m6761copyiSbpLlY(j2, i2, i3);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m6761copyiSbpLlY(long j2, int i2, int i3) {
        long j3 = ((long) i2) << 32;
        long j4 = ((long) i3) & 4294967295L;
        return m6760constructorimpl((j3 + j4) - (j3 & j4));
    }

    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m6769minusqkQi6aY(long j2, long j3) {
        return m6760constructorimpl((((long) (((int) (j2 >> 32)) - ((int) (j3 >> 32)))) << 32) | (((long) (((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) - ((int) ((-1) - (((-1) - j3) | ((-1) - 4294967295L)))))) & 4294967295L));
    }

    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m6770plusqkQi6aY(long j2, long j3) {
        long j4 = ((long) (((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32;
        long j5 = ((int) (j2 & 4294967295L)) + ((int) ((-1) - (((-1) - j3) | ((-1) - 4294967295L))));
        long j6 = (j5 + 4294967295L) - (j5 | 4294967295L);
        return m6760constructorimpl((j4 + j6) - (j4 & j6));
    }

    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m6774unaryMinusnOccac(long j2) {
        return m6760constructorimpl(((-1) - (((-1) - ((long) (-((int) (j2 & 4294967295L))))) | ((-1) - 4294967295L))) | (((long) (-((int) (j2 >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m6771remBjo55l4(long j2, int i2) {
        return m6760constructorimpl((-1) - (((-1) - (((long) (((int) (j2 >> 32)) % i2)) << 32)) & ((-1) - (((long) (((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) % i2)) & 4294967295L))));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6773toStringimpl(long j2) {
        return "(" + m6766getXimpl(j2) + ", " + m6767getYimpl(j2) + ')';
    }

    public String toString() {
        return m6773toStringimpl(this.packedValue);
    }

    /* JADX INFO: compiled from: IntOffset.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0ղU\u0002e\u0015\u0015̒^\u001e>;Mu\\ˉdz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f F,s8UN7t8(\u001e>", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc'X9H\u001b\"hx\\sx\u0007", "u(9", "\u0018", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m6776getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m6772timesBjo55l4(long j2, float f2) {
        long jRound = ((long) Math.round(((int) (j2 >> 32)) * f2)) << 32;
        long jRound2 = ((long) Math.round(((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) * f2)) & 4294967295L;
        return m6760constructorimpl((jRound + jRound2) - (jRound & jRound2));
    }

    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m6763divBjo55l4(long j2, float f2) {
        return m6760constructorimpl((-1) - (((-1) - (((long) Math.round(((int) (j2 >> 32)) / f2)) << 32)) & ((-1) - (((long) Math.round(((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) / f2)) & 4294967295L))));
    }
}
