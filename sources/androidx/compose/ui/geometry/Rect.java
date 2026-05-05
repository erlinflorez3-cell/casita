package androidx.compose.ui.geometry;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4I\u0007\"B\u0012\u007f\u0007lxA0RnP.X`2\u000f\u0002{<$a=yCI[\"}(\u000fWNusvJ`\u0010IƬ\f,ю\t\u0004yU'\\J\u000e\n\u0003\u0013O7[oU9\u000fuF\t.4:8(\u0006\u0011\u001e8K(v)D[\u0010 4XphSҫQ\u0005(\u0017NE.;6\\\u0016O|զm&A=^\u001bipOm܆1ET\u001b\u0003l';w(ԣ,\t>CR=S1\b\u0019Ā@KX\u007f{\u001dhUC[M\u0002\u0017NX.\u001f[ۇO\u05ce\\ö͉`\u0007W!\u001ahs~q\u000eh\u000eV»+\u0002\u0013<\u0012\u000e\u001e'v/] l\b\u001c5\rr\u0002A\u0001\bdB\u000e}y6E&0919)jiai\u001a\u0015ҠzM\u001b,f\u0019nOż\u0005\u0012nY3T&RwV\tNV\u0014\"Yk\n4vpHB\u0006FF..BÔ/_,E#Q#O4HӝC0\u0005\u0013*\u0001S\u0018ɭxD03.7X\nR_\rr\u00136hT\u0007\u008cAQ*\u001b\u001f}6ʶfa@b/o(N}Ŗ\u001an[)\"%]gg]|8&Wg_c9_1(a\u0001wDCJ1\u001dX\u0015C\u001a\u0011#h6qJH\u0019,(\u007fR\u0015$\u0013`ŭ:\"B|I\u0019\u000bf\u000f\u0017fZOO!_\tӐ@\u0003br<\u0003\u0018/;\u000eˏOʔʼsi~\u001d:Q)8;\u0014i5Gğ\u0006&v\n\u0015#5\u007f$\u0004U>dGzm\\z&\u0016.\u001a29\u007f0s\u0017eȷ+ɨ\u00069Mɣ\u0003gWS .\u0013~\u007f\u0017Iq~|\u0016t\t,\u000fu\u0001\u0014ް\u0016Ǳ֧]qן\fh\u0018{gR\tT4i\u0019iVI!\u000e\u0010\u0001ӷ7وŷ\u001e\u001dݵ\u0005s:~;<Q4m+\u0006$G\u0015\u0010h 4Ѽxʬр%sФ\b0{\u0018us_j\u0003PF[q~l-Z1ŐAוݬv\u0007ɚ\r8%5NTr}'M[\u001fG}\u0015\u0012bQÖUܪȞ\u0012nϻ82w,yX\f!/X3'eS\u0016x$\u0010ǅ\nͧٳ\t\n֭5r*\u001eC7dd3!>\u001e\f\u0018dBq'[½\u000bӺ86L\n\u0011\\bp\u001e\u0012\u0001\u001aTh_/@]\f;\u0005*\u000b=3ƏJϖdOp#0\u001e\r\u0016K ~P?#>^bN{2/oSMqˊQǎj/;FZY)/p\u0003\u0011dka\u001a\u001aD%_)\u001c\b&P\u000f\u0096~ܫF\"+;W3m}H`\u0011vrl5\u0011 fjNP*5~Sɢ>\u009f\u0013\u0017!ۚ\u0003qhPZU\u00109I>\u000f \u00158\u00151\u0015ct\u001ccJ\u05f91Aal\u001aM\n`$J\f/8 U\u0005+eǛ[\u0012~\fcCH\u001fB0p\u0005!\u0013~!:2!ƛt˹2\u0014>О\u00125\b<l`\u0004y'j54=$Pv\u0001x8\u0010#(Eα\rԿe۲ڵxm\u0094T'\u0019)S[!_r<\u0017\u0002.ea\u001a\"\u0017>\u001fd\t\u0019-f˞e\u05cftwW܀\u001d-5\u001b8hI2XN\f(J\u000b\u0012[l(CF\r\u0012ͷcӷїkAŃ\u0012b\u0003*j'\u001a6d\u0012\r{v\u0011A?|7ܶcӵҧ\u0018\u001e˝\u0011Kx\t\nyW3qF`t37`\u0016&lь\u0010ܛ΅asʷ.F!t\u0006\u001e::\u0017lKQ?YRn\u001bG|ɜGђF\u0012<\u0013\u0014I=aP\"D\u0016(%ԠQ<I\u001c\u0017ܖ1f\u0005w\u0007\u001fT֠U,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "uE5\u00139o/", "5dc\u000fb;M]!=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u000fb;M]!", "u(5", "0ncAb4\u001cS\"\u000ezk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u000fb;M]!\\zg;|\u0016vFK\u0006K\u001dra", "u(9", "0ncAb4%S\u001a\u000e", "5dc\u000fb;M]!ez_;DizCO\u0005m\u000b", "0ncAb4+W\u001b\u0002\n", "5dc\u000fb;M]!k~`/\fP\u00101]wX2K", "1d]AX9", "5dc\u0010X5MS&F[*\nLe!0", "1d]AX9%S\u001a\u000e", "5dc\u0010X5MS&ez_;DizCO\u0005m\u000b", "1d]AX9+W\u001b\u0002\n", "5dc\u0010X5MS&k~`/\fP\u00101]wX2K", "6dX4[;", "5dc\u0015X0@V(=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0015X0@V(", "7r4:c;R", "", "7r4:c;R\u0012\u0015\b\u0004h;x\u00183o\t6", "u(I", "7r56a0MS", "7r56a0MSWz\u0004g6\f\u0005>i\n1\n", "7r8;Y0GW(~", "7r8;Y0GW(~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0019X-M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0019X-M", ";`g\u0011\\4>\\'\u0003\u0005g", "5dc\u001aT?\u001dW!~\u0004l0\u0007\u0012", ";h]\u0011\\4>\\'\u0003\u0005g", "5dc\u001a\\5\u001dW!~\u0004l0\u0007\u0012", "5dc\u001f\\.AbWz\u0004g6\f\u0005>i\n1\n", "5dc\u001f\\.Ab", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007ma\t1\u0006O|&\u001bQx\u001c", "5dc \\A>\u001b\u0002aBc)i\u0007", "5dc!b7|O\"\b\u0005m(\f\r9n\u000e", "5dc!b7", "Bn_\u0010X5MS&", "5dc!b7\u001cS\"\u000ezks]T\r5\\\u001aF", "Bn_\u0019X-M", "5dc!b7%S\u001a\u000eB?wZX\fWJ", "Bn_\u001f\\.Ab", "5dc!b7+W\u001b\u0002\n&\rHf~Bqr", "EhSA[", "5dc$\\+MVWz\u0004g6\f\u0005>i\n1\n", "5dc$\\+MV", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n]AT0Ga", "=eU@X;", "1n]AT0Ga`\u0005B-3hS\u0017", "uI\u0018'", "1n_F", "2dU9T;>", "2d[AT", "3pd._:", "=sW2e", "6`b566=S", "", "7mU9T;>", "7mc2e:>Q(", "=sW2e\u0013>T(", "=sW2e\u001bH^", "=sW2e\u0019BU\u001c\u000e", "=sW2e\tHb(\t\u0003", "=uT?_(Ia", "BnBAe0GU", "", "BqP;f3:b\u0019", "BqP;f3:b\u0019F\u0001&z\u0004tyM", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Io\u0018Dv4BmG\r7k%\u0004", "BqP;f3:b\u0019q", "BqP;f3:b\u0019r", "\u0011n\\=T5B]\"", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ Rect copy$default(Rect rect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = rect.left;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = rect.top;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = rect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = rect.bottom;
        }
        return rect.copy(f2, f3, f4, f5);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3962getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    public final Rect copy(float f2, float f3, float f4, float f5) {
        return new Rect(f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public Rect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: compiled from: Rect.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/uK 6X?Do>'j", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc'X9H\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc'X9H", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3970getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final boolean isInfinite() {
        return this.left >= Float.POSITIVE_INFINITY || this.top >= Float.POSITIVE_INFINITY || this.right >= Float.POSITIVE_INFINITY || this.bottom >= Float.POSITIVE_INFINITY;
    }

    public final boolean isFinite() {
        float f2 = this.left;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            float f3 = this.top;
            if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                float f4 = this.right;
                if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                    float f5 = this.bottom;
                    if (!Float.isInfinite(f5) && !Float.isNaN(f5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m3974translatek4lQ0M(long j2) {
        return new Rect(this.left + Offset.m3937getXimpl(j2), this.top + Offset.m3938getYimpl(j2), this.right + Offset.m3937getXimpl(j2), this.bottom + Offset.m3938getYimpl(j2));
    }

    public final Rect translate(float f2, float f3) {
        return new Rect(this.left + f2, this.top + f3, this.right + f2, this.bottom + f3);
    }

    public final Rect inflate(float f2) {
        return new Rect(this.left - f2, this.top - f2, this.right + f2, this.bottom + f2);
    }

    public final Rect deflate(float f2) {
        return inflate(-f2);
    }

    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final Rect intersect(float f2, float f3, float f4, float f5) {
        return new Rect(Math.max(this.left, f2), Math.max(this.top, f3), Math.min(this.right, f4), Math.min(this.bottom, f5));
    }

    public final boolean overlaps(Rect rect) {
        return this.right > rect.left && rect.right > this.left && this.bottom > rect.top && rect.bottom > this.top;
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m3972getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m3971getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top);
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m3973getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m3968getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + (getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m3967getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m3969getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + (getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m3965getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m3964getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.bottom);
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m3966getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3963containsk4lQ0M(long j2) {
        return Offset.m3937getXimpl(j2) >= this.left && Offset.m3937getXimpl(j2) < this.right && Offset.m3938getYimpl(j2) >= this.top && Offset.m3938getYimpl(j2) < this.bottom;
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
