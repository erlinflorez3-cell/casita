package androidx.compose.ui.geometry;

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
/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0017\u007f\u0007lzA0RnP.XU2\u000fy\u0002<$a,yCIa\"}(\rUȦ&}ñh\n;C=\u0005Nw\u001alX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@0Py3\b`ݚPǘz|IZ\u001a\u001cxN~Jj\r{\f`ŏ\u000ȩ$\u0003$muX~mzoR/QɅ\u001aHT'm6\u0015M;M\u0005-\u0013vo)C@e<\u05cf$مЁ\u0006QÜC\u0005E\u0005K\u00191C5@as\u0006̬\t\u0004\"+CO;d9̮\\՝PӠѨ&*յgMV%6\u0010C\u0014\u001bU\u001c\u000e4Ax4;5~\n$2#q\u001aŊQؿbD\u0006\u0017oS_3\u000eQC9I\u0006\u0018ż:ϭR9\u0002%\u001b?k\u001a|CsT<֫E\u001fb\u0013i1\u007f̵\u0004ʸN͜X<ъ\brh%8(x`\u000eT\u0014\u0011\\ϏU;iT;!\u001aȵ\u000fֻgѱ\u0004_ĈWkXnNF72EQ!\f\tե\u0015\tyflXZ\u0018\u0014ɄTϮ|ܱ̯\u001f[ʟ@#+8\\g1vxvu\nSY-K֍rm\u0014\u0003G\u000b{I_\u0011(a\u0001ΘZ̻<Ѯ\u0004֚ۡAR۱^^.P@K;$\u0006{\\N:\u0014hŭHʋ6Ϝ5\u001fdéX\u0005$FO\u0002Ywhn(~\u0003:ZG@ˍv֊\u0005Zlruo\u0007ND~f+;K\"M'1m\"\u0017;3g]ѰuõKq\\IRx$zm}&#(C֠.=в\u000e~W3ċ-NTrkpU\u0015-Ϸ\u0019(\u000e¹l^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "F", "", "5dc%\u0017(G\\#\u000evm0\u0007\u0012=", "5dc% 0F^ ", "uI\u0018\u0013", "G", "5dc&\u0017(G\\#\u000evm0\u0007\u0012=", "5dc& 0F^ ", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F \u0016!?v\u0001|d", "uI5\u0013\u001c\u0011", "2he", "=oT?T5=", "2hey5A\u0010P\fx\u0005", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", ";h]Bf", ";h]BfsO4j{Bf\u0014", "uI9u=", ">kd@", ">kd@ =\u001f%\u0016F\u0003F", "Bh\\2f", "Bh\\2fs\u001bhj{mX6", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rBd\u0012_m1L\u000e", "\u0011n\\=T5B]\"", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class CornerRadius {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m3903boximpl(long j2) {
        return new CornerRadius(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3906constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3910equalsimpl(long j2, Object obj) {
        return (obj instanceof CornerRadius) && j2 == ((CornerRadius) obj).m3920unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3911equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3914hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m3910equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3914hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3920unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ CornerRadius(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m3904component1impl(long j2) {
        return m3912getXimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m3905component2impl(long j2) {
        return m3913getYimpl(j2);
    }

    /* JADX INFO: renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m3907copyOHQCggk(long j2, float f2, float f3) {
        return CornerRadiusKt.CornerRadius(f2, f3);
    }

    /* JADX INFO: renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m3908copyOHQCggk$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = m3912getXimpl(j2);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = m3913getYimpl(j2);
        }
        return m3907copyOHQCggk(j2, f2, f3);
    }

    /* JADX INFO: compiled from: CornerRadius.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8ݼoFAczȤ!N1*8\u007f$и\u001e1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKyr{\u001fpl5\u0010g6WL", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "5dc'X9H\u001b\u001fd]C.c\u0017ma\t1\u0006O|&\u001bQx\u001c", "5dc'X9H\u001b\u001fd]C.c\u0017", "u(9", "\u0018", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m3921getZerokKHJgLs$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m3922getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    /* JADX INFO: renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m3919unaryMinuskKHJgLs(long j2) {
        return CornerRadiusKt.CornerRadius(-m3912getXimpl(j2), -m3913getYimpl(j2));
    }

    /* JADX INFO: renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m3915minusvF7bmM(long j2, long j3) {
        return CornerRadiusKt.CornerRadius(m3912getXimpl(j2) - m3912getXimpl(j3), m3913getYimpl(j2) - m3913getYimpl(j3));
    }

    /* JADX INFO: renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m3916plusvF7bmM(long j2, long j3) {
        return CornerRadiusKt.CornerRadius(m3912getXimpl(j2) + m3912getXimpl(j3), m3913getYimpl(j2) + m3913getYimpl(j3));
    }

    /* JADX INFO: renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m3917timesBz7bX_o(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(m3912getXimpl(j2) * f2, m3913getYimpl(j2) * f2);
    }

    /* JADX INFO: renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m3909divBz7bX_o(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(m3912getXimpl(j2) / f2, m3913getYimpl(j2) / f2);
    }

    public String toString() {
        return m3918toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3918toStringimpl(long j2) {
        return m3912getXimpl(j2) == m3913getYimpl(j2) ? "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m3912getXimpl(j2), 1) + ')' : "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m3912getXimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m3913getYimpl(j2), 1) + ')';
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m3912getXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m3913getYimpl(long j2) {
        return Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L)));
    }
}
