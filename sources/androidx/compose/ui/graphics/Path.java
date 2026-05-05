package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\":\u001b\u007f\u0007lkA0ReP\u008cZS@\u000fsڔ<$i)yCAY\"}8\tWNmhvJp\u000bK\u000f\f\u001a\u0001jBI]xc\u001e\u00172XoG\u074cUoS9ht<\r(288\u0002\u0005\u0007/2H&v\u0003CQ\u0013\u0018\u0015V\u0081X/=M3\u0019J\u0006\u001b}I<jqf6vw\u000e>=/\u001bip[Wc>\u000be\rtcW\u0011\u0005q6+nF{9mq\u0011\u0018j[m\u000eouK\u0011\u0001'U8yweHp\u007fB$[S\u001bp\u000b&\u000b\u0014\u0018\u0005T59c{K~\u0019X{\t\b%<2\u001bLL\u0011F;.~\b<>%vaLh\u0002\rO0\u0001g6%:\u00183YOa\u000b\u001a\u0004I0f7*\u0010=\"1\u0019\u0007!\n٪>f\u001b\u001bb\u0011i1\u007fZ\u0004l߉\tԯǀq\u0006v}\u0010FL>U\u001dG{?9G)EyQ#OxHm\r\u007f\u0005\"xh\u0002t\u0003LN@\u0007\u0016e79\u0012`Dr\u001a\u0004P\u0003nr5\u0016*b&\u0016\bA+\r{JA=\u0010|p/\u000f3ek)=/\u0015B\nry.o9\rTeWi\u0010og\u000f\u0014mR))!uPu$Z\u000b̥R6V\u0003(w*ͩ\u0015ܓ\u0015ze\u007f?L,_$\r\u0019V!6Bo\n9chv(~\u0003BT\u0007w4\r\t/_\rt}\f\u0011IZ\u0004'Fug_Z1&\u0004-\u00198\u000bA\u001f~\"\rwkZYdlD\u0005\u0006\u007f.)29\u007f>m\u0017\u001d#A204\f`;k_s*')\b@3\u0004\u001f<\u000f j\u001f7\u0011nXwl\u0017P\u0006\u000fv11|\u007f(pv~U\u000el\u000b\nMyv\u0011\u0005TNf\f5#,Q\u0019oP\fe1QT5\u0016&#u9*cw\u001eFy\u0011\u001cl\u0019.\u000b:\u0013.o\u0011\u0002$н;\u0001ag.V\"R\u001d3FV\u001c\u0010\bp;d\u00139HO\u0018\tVf\\QCF|\u0015`%p\u0005fj\u0017}3L.\u000e9$G\fJvCS \u0014w0|{\u0003t\u000bx\u05fa:\u000f\nI\u0007\u0012JܻfݟW+\u001f>>\f\u0018dLkf\u0013q!$b;l\f\u0019yli4\u001fA$\u000f\b\u001dPJB\"B\u0007\u0012b3tVvγ\u0011In\\B\u0001-۰c\"\u0007qI\u0005\u001c\u0004\u001bSӫ1ܬӘ!\u000b!)]>/49\u0005l9Iι\t\u0005\u0019]uCw\u0379|\u07fbIq|y1$8FӽMF&3QQ?٣=ҁ^S{r\u0011|v@q\u0003R0Q\u0017z+\u001dl\u000e\u001d41O!~\u00131Zx\u00107q)1\u001bRT\u001f\f+r\r@u,CpUI\u0019\u001fW\u007fe{S}6/P+\u0012\u001e9\\\u0006\u001d\u0017\u000ekER\u0016 %\u0013\u0006\u0017>h 2=\u0011\t;@<LNO0>2\u0017l\u001f\u0004wOOW/zLZK\u0017\b:gz+\u0007U9\u0012\u00175dB\u0007-~,9+[w+X\tIAW.#)\u007fB$lC~\u001ept(O\u0012s!o](%+]zZe?}j\u001e,.@\u001aL@bv-;\u0005Xnh\u0017)\u0005B\u0006\u001d\u000fn62\r\fW#C#\u0011\u0005\u001fbLF!)\u00153E^7[;V\u0011\u000b\u0012\fa&O@\u0003C)~J\u000b\u001e7'\u0015\u0011\u0003zt.9\t.;&u|EF\u0003HJ+gi\u0006d15{IF\t ,?\u001dA3h\u007f8>\u000b)L?_{Y\u0019?\u0010[LNu\u0015jMj\u007f^kNI\u0003\u000f_Wy_v\u0001\b\u007f\u000b1\u0003'oIb\u0017?3\n}LUaHy۽}\u07b7\u07b2Z\u0011g\u0003W\r\u000e6\b.X\u007f8*T(\u0014\u000f;\u007fsK\u000fNڜ[ǾҕwY\n\u007f8\u00117S1#\u0005x\"ԁ\\m&\f|[\u0010Ū\bˆ\u0016i`L*El5F$˯\u0006\u0098CԹԮ\u00136ʷ\n3K\u0019\u0003\u0012]t`-Ov[4-mJ\u0019\f\u0004h98ֳ{üD]B\b3\u0018bk;z{Zw\u0010f\u0019cƖ\u0006ֶ5Vx\u0002f&&/؈uFՠ\\\bUDh\u07b3\\=#f.H+\u0013\b\u001cMv\u0016Ѥ\u0002)·\u0019\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "", "4h[9G@IS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "5dc\u0013\\3EB-\nz&\u0019~P51i6", "u(8", "Adc\u0013\\3EB-\nz&6h[\"jN\u0018", "uH\u0018#", "7r2<a=>f", "", "u(I", "7r4:c;R", "/cS\u000ee*", "", "=uP9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "AsP?g\bGU ~Y^.\n\t/s", "", "AvT2c\bGU ~Y^.\n\t/s", "/cS\u000ee*+O\u0018", "AsP?g\bGU ~gZ+\u0001\u00058s", "AvT2c\bGU ~gZ+\u0001\u00058s", "/cS\u001ci(E", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#uL\u001a;MAJo>'j", "/cS\u001dT;A", ">`c5", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/cS\u001dT;A\u001b\t\u0010Mived", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Czq>", "/cS\u001fX*M", "@dRA", "/cS\u001fb<GR\u0006~xm", "@nd;W\u0019>Q(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "/mS", "/qR!b", "4na0X\u0014Hd\u0019m\u0005", "/qR!b\u0019:R", "1k^@X", "1tQ6V\u001bH", "F0", "G0", "F1", "G1", "F2", "G2", "5dc\u000fb<GR'", "7sT?T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001b|\u0016;IREx\n", "1n]6V\fOO \u000fvm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001b|\u0016;IRExr{\u001fqe7ft(U\u0007#VPX52", "Bn[2e(GQ\u0019", ":h]2G6", "F", "G", ";h]Bf", ";ne2G6", "=o", ">`c5$", ">`c5%", "=oT?T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", "=o\u001c\u001b(0G%\u001fI", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW9'\u001c\b/%gc", "=q", ">kd@", "?tP1e(MW\u0017[zs0|\u0016\u001eo", "?tP1e(MW\u0017m\u0005", "@d[.g0OSv\u000fwb*k\u0013", "2w ", "2x ", "2w!", "2x!", "2w\"", "2x\"", "@d[.g0OS\u007f\u0003\u0004^\u001b\u0007", "2w", "2x", "@d[.g0OS\u0001\t\f^\u001b\u0007", "@d[.g0OS\u0005\u000fv]9x\u00183c\\(\u0011D\u0001$\u0006Q", "@d[.g0OS\u0005\u000fv]9x\u00183cn2", "@db2g", "@df6a+", "BqP;f-H`!", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!FJ1)b\u0006!c", "uZ5uI", "BqP;f3:b\u0019", "BqP;f3:b\u0019F\u0001&z\u0004tyM", "uI\u0018#", "Fna", "\u0011n\\=T5B]\"", "\u0012ha2V;B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Path.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#uL\u001a;MAJo>'j", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011nd;g,K1 \txd>\u0001\u0017/", "\u0011k^0^>Ba\u0019", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Direction {
        CounterClockwise,
        Clockwise
    }

    void addArc(Rect rect, float f2, float f3);

    void addArcRad(Rect rect, float f2, float f3);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e]P\r\u0016\u001bi\u0018\u001a?\u0006\u0006sb|cg(cmPQev@\u0006\"<L\u0017Y`\u00031f", replaceWith = @ReplaceWith(expression = "addOval(oval)", imports = {}))
    @InterfaceC1492Gx
    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo4068addPathUv8p0NA(Path path, long j2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e]P\r\u0019\nk \u001a?\u0006\u0006sb|cg(cmPQev@\u0006\"<L\u0017Y`\u00031f", replaceWith = @ReplaceWith(expression = "addRect(rect)", imports = {}))
    @InterfaceC1492Gx
    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e]P\r\u0019\u0014}\u001aVhKq~\u0016=c}q`l\u0002N\u001c\u007fBT\"<H\u0019\u0016P\u00034]KOnMB", replaceWith = @ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    @InterfaceC1492Gx
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    void arcTo(Rect rect, float f2, float f3, boolean z2);

    void close();

    void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    Rect getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo4069getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f2, float f3);

    void moveTo(float f2, float f3);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo4070opN5in7k0(Path path, Path path2, int i2);

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001t\u0003\n\u0016[jH<\u0004S\t;\u0016%\f\u000f6\u0017(\u000fa\u0005Yw}by2i\u0002\f{Kad(<[ <=\u0006e\u0014B", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    @InterfaceC1492Gx
    void quadraticBezierTo(float f2, float f3, float f4, float f5);

    void relativeCubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    void relativeLineTo(float f2, float f3);

    void relativeMoveTo(float f2, float f3);

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001t\u0004y!XlP>\u007fA*-RnM\u001d0\b\\\u001b\u001a?\u0006ty`4'uv_mUaav<_]JC&^\f\f'dIOnT9t!I\u001dG\u000f\u0006{J", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    @InterfaceC1492Gx
    void relativeQuadraticBezierTo(float f2, float f3, float f4, float f5);

    void reset();

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo4071setFillTypeoQ8Xj4U(int i2);

    /* JADX INFO: renamed from: transform-58bKbWc */
    default void mo4072transform58bKbWc(float[] fArr) {
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo4073translatek4lQ0M(long j2);

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static void quadraticTo(Path path, float f2, float f3, float f4, float f5) {
            Path.super.quadraticTo(f2, f3, f4, f5);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f2, float f3, float f4, float f5) {
            Path.super.relativeQuadraticTo(f2, f3, f4, f5);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f2, float f3, boolean z2) {
            Path.super.arcToRad(rect, f2, f3, z2);
        }

        @Deprecated
        public static void rewind(Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* JADX INFO: renamed from: transform-58bKbWc */
        public static void m4451transform58bKbWc(Path path, float[] fArr) {
            Path.super.mo4072transform58bKbWc(fArr);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
            return Path.super.iterator(conicEvaluation, f2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            return Path.super.or(path2);
        }

        @Deprecated
        public static Path and(Path path, Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return Path.super.xor(path2);
        }
    }

    default void quadraticTo(float f2, float f3, float f4, float f5) {
        quadraticBezierTo(f2, f3, f4, f5);
    }

    default void relativeQuadraticTo(float f2, float f3, float f4, float f5) {
        relativeQuadraticBezierTo(f2, f3, f4, f5);
    }

    default void arcToRad(Rect rect, float f2, float f3, boolean z2) {
        arcTo(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z2);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default */
    static /* synthetic */ void m4448addPathUv8p0NA$default(Path path, Path path2, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i2 & 2) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        path.mo4068addPathUv8p0NA(path2, j2);
    }

    default void rewind() {
        reset();
    }

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i2 & 2) != 0) {
            f2 = 0.25f;
        }
        return path.iterator(conicEvaluation, f2);
    }

    default PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f2) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f2);
    }

    default Path plus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4070opN5in7k0(this, path, PathOperation.Companion.m4473getUnionb3I0S0c());
        return Path;
    }

    default Path minus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4070opN5in7k0(this, path, PathOperation.Companion.m4470getDifferenceb3I0S0c());
        return Path;
    }

    default Path or(Path path) {
        return plus(path);
    }

    default Path and(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4070opN5in7k0(this, path, PathOperation.Companion.m4471getIntersectb3I0S0c());
        return Path;
    }

    default Path xor(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4070opN5in7k0(this, path, PathOperation.Companion.m4474getXorb3I0S0c());
        return Path;
    }

    /* JADX INFO: compiled from: Path.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lm?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004{(~:\t}P\u0018k|Mr\u000bq\u00136\u001a\u0007oDI\u0004z\u000e\u0016\u001d8Zom5߲nމ˃dv<\f.:ĵ8~\r\u0004 ݴd>uڂGT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#uK 6X?Do>'j", "", "u(E", "1n\\/\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "=oT?T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", ">`c5$", ">`c5%", "1n\\/\\5>\u001b,\u0002Ks\u001a`[", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Ru^_nH\u0017\u0016X\u001c\u0018\u0016\t\u0014\\\u0017gU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)dCPH8", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: combine-xh6zSI8 */
        public final Path m4449combinexh6zSI8(int i2, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo4070opN5in7k0(path, path2, i2)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }
}
