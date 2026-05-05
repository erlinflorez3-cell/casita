package androidx.compose.ui.unit;

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
/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4I\u0007\"B\u0012\u007f\u0007lxA0RnP.X\\2\u000f\u0002{<$aAyCIa\"}(\u000eUȦm}ñh);C=\u0005Nw9lle|k\u0012'2ppO7[qU9\u000fuF\t.5:8(\u0006\u0011\u001e8L(v)Dƚ\u0010\u0012>E9A`Ce\u0005H\u0013L͋!I%j\u001ff6vm$Ǆ0k\nwzf'\u000e1Cָ\u000e\u000f[5F\u000faL,\u0007́6];a=\u001fR\n[3C\u007fx\u001dhU2ɛH֕ɱ:Z\u0006P#h\u0018<k1>\\3ĩ\u0011\u0012-+]ccP<)(\u0001\u0002\rJ\u0006&\u0006UI^3 f\u0016\u0011Kt!TpV\b^P\u0004\u0013ad\u0018kŵ2sG)&iaiϊ~;\nE%\u001eQ\u00025&$e\u001c\"-\u001b\u0003\u0014\u00027_\u0003UJd\t\b<4֥q+\t8GHG.0BÔ-_3E Q#Oǽ2LR(\u000f\u0005\u000fi\u001an\u001bVNg\u0007\u0016eѧ9\u0010h\u0007|\u0005\u001a¬\u001b]t\u001d[bl\u0007,$C$j:T!Sī\u0017Uv1\u0003M\fRkC/Og8\u0004\u000e\u0006ު\u000f7C\r{\u0010\u0010]=\u0019ά;ϵۖ\\hH\u001e\u001a&%>0{`j>Ǯ,H\\X+2mrL8:~1\\CII#\u0013[\u000b\rwZ\u0017\u00115X\nɼ\u0005Ȑ(\u0001\u0011ɖ`^vuu\u007fa.\u0003h06\u0012fC#>UPsjAʶ\u0006Ѩϗ~FѨPKdn\u001c\u0002c\tp+(Gi/k\u001eECɴ1ĈЈDKȌiUe\u0014-\n\u000b\u0007_Pv>\u007f\b\u0019{b%˽I֢ް\u0016!Ցbv;\nj\u0011\bn\u0017\u0010Uul\u000b\nI\u007f7ľXߢӷ7{ġ#\"=\u0003u5\u000bB}X51.wB:K&ՙh۰ѼxaϪ*x}\u00062x$|3fkHS8wd5\u0003Ҧ#ЗŐAGܖ{\fZ\u000b:$AU\u0012|~nPM904+]Ե\u000f\u0080ZeJ\u0015u\u0017B5w,y]\f\u001d/[3,eS\u0016\n$\u00103֭L؝\u000e\u0015\f3t/*D8X]}\u0017NV\u000e&6Y;\u0011\u0006r\rzґ.ѧ\f\u0017Kҍy\b\u0016\u001a\u000eMw\u0011\u001dRP|\fe\u001cu\u0011\\\u0005I;%҇d%B\u0003\u00051A'ID?(\u0006F\u00030\u001avݏW!!\u001dps\rouERWQ\u001bVY7\u000f\u001cؗE͕\u0006B\fڛ9oq\u0015\u001a?0~#h&$\no\u001f\u0007\u000f0\r3\f)%Ўx֜eŚȂ!(Ή~\u0007\u001e>\u00108\u0019 gtu\r;Y\u001f\u0012EE2\u0001EE_\u000bbŹe̍\u001f9\u000eז=?O\u0016\".\u0014YYg\f\u0011p551\r!\u000bbD+ǃ\\ͩǦ\u0015pїf\u0006!\u0015VN\u0012;\u001b\n\u00019F\bdZ8wű\u0012ȅΈjv̝D+Cn\frYuI\u001fq\u001e{n\u0004\u00169+ݫUҳԠ,Oɢ\r+e0\u0019\u000bhGak.\f)\u007fB\u0016\\c\rʒdЍ\u0014Ysjv ]b%-5!8jɸ0[&\u0001%ݹ\u00122)\\(\u001bZܗQ\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "uH8\u0016<o/", "5dc\u000fb;M]!=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u000fb;M]!", "u(8", "0ncAb4\u001cS\"\u000ezk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u000fb;M]!\\zg;|\u0016vni&y\b|\u0015", "u(9", "0ncAb4%S\u001a\u000e", "5dc\u000fb;M]!ez_;D\u0012\u0019c}ow>", "0ncAb4+W\u001b\u0002\n", "5dc\u000fb;M]!k~`/\fP8O}&C<~", "1d]AX9", "5dc\u0010X5MS&F\u0004H*zP+c", "1d]AX9%S\u001a\u000e", "5dc\u0010X5MS&ez_;D\u0012\u0019c}ow>", "1d]AX9+W\u001b\u0002\n", "5dc\u0010X5MS&k~`/\fP8O}&C<~", "6dX4[;", "5dc\u0015X0@V(=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0015X0@V(", "7r4:c;R", "", "7r4:c;R\u0012\u0015\b\u0004h;x\u00183o\t6", "u(I", "5dc\u0019X-M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0019X-M", ";`g\u0011\\4>\\'\u0003\u0005g", "5dc\u001aT?\u001dW!~\u0004l0\u0007\u0012", ";h]\u0011\\4>\\'\u0003\u0005g", "5dc\u001a\\5\u001dW!~\u0004l0\u0007\u0012", "5dc\u001f\\.AbWz\u0004g6\f\u0005>i\n1\n", "5dc\u001f\\.Ab", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000bma\t1\u0006O|&\u001bQx\u001c", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "5dc!b7|O\"\b\u0005m(\f\r9n\u000e", "5dc!b7", "Bn_\u0010X5MS&", "5dc!b7\u001cS\"\u000ezks\u0006r-cG$y", "Bn_\u0019X-M", "5dc!b7%S\u001a\u000eBg\u0016z\u0007va}", "Bn_\u001f\\.Ab", "5dc!b7+W\u001b\u0002\n&5f\u0007--{&", "EhSA[", "5dc$\\+MVWz\u0004g6\f\u0005>i\n1\n", "5dc$\\+MV", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n]AT0Ga", "=eU@X;", "1n]AT0Ga`F|r@pe=", "uI\u0018'", "1n_F", "2dU9T;>", "2d[AT", "3pd._:", "=sW2e", "6`b566=S", "7mU9T;>", "7mc2e:>Q(", "=uT?_(Ia", "BnBAe0GU", "", "BqP;f3:b\u0019", "BqP;f3:b\u0019FB`@\u0011|\fs", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\t>hj 5|k", "BqP;f3:b\u0019q", "BqP;f3:b\u0019r", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((1 & i6) != 0) {
            i2 = intRect.left;
        }
        if ((2 & i6) != 0) {
            i3 = intRect.top;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            i4 = intRect.right;
        }
        if ((i6 & 8) != 0) {
            i5 = intRect.bottom;
        }
        return intRect.copy(i2, i3, i4, i5);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m6784getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final IntRect copy(int i2, int i3, int i4, int i5) {
        return new IntRect(i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    public IntRect(int i2, int i3, int i4, int i5) {
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: compiled from: IntRect.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\r^\u0015w\u001e9IL?u=s", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "5dc'X9H\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc'X9H", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006Z.DF}\u001eFC", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m6792getSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    /* JADX INFO: renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m6796translategyyYBs(long j2) {
        return new IntRect(this.left + IntOffset.m6766getXimpl(j2), this.top + IntOffset.m6767getYimpl(j2), this.right + IntOffset.m6766getXimpl(j2), this.bottom + IntOffset.m6767getYimpl(j2));
    }

    public final IntRect translate(int i2, int i3) {
        return new IntRect(this.left + i2, this.top + i3, this.right + i2, this.bottom + i3);
    }

    public final IntRect inflate(int i2) {
        return new IntRect(this.left - i2, this.top - i2, this.right + i2, this.bottom + i2);
    }

    public final IntRect deflate(int i2) {
        return inflate(-i2);
    }

    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean overlaps(IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.top && intRect.bottom > this.top;
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m6794getTopLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m6793getTopCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top);
    }

    /* JADX INFO: renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m6795getTopRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top);
    }

    /* JADX INFO: renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m6790getCenterLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top + (getHeight() / 2));
    }

    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m6789getCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top + (getHeight() / 2));
    }

    /* JADX INFO: renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m6791getCenterRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top + (getHeight() / 2));
    }

    /* JADX INFO: renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m6787getBottomLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m6786getBottomCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.bottom);
    }

    /* JADX INFO: renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m6788getBottomRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.bottom);
    }

    /* JADX INFO: renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m6785containsgyyYBs(long j2) {
        return IntOffset.m6766getXimpl(j2) >= this.left && IntOffset.m6766getXimpl(j2) < this.right && IntOffset.m6767getYimpl(j2) >= this.top && IntOffset.m6767getYimpl(j2) < this.bottom;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }
}
