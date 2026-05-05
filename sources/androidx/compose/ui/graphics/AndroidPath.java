package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lpA0RnP.XV2\u000f\u0002{<řc$\u007fUC٥\"}8\tWȞog|JbŏK\u000f\u001c\u0016\u0001̓4Ic}e\u0012\u00156JoU3UoC:htL\u0005(2(<\u0002\u0005\u0017\u001a2H\u0016\b\u0003Ca\f\u001a0F\u0004BR#M\r\u001a\u0018\u000bTĨ1\u001e\u000bf\u000fCXrc:=#\u001bipOϮc0\u000bOUdb?%v\u00107[DEO-%\u0002\u001e7Vi[\u001b? Z5l5ECI\"t|lH2#Jg\r\f\fV`\u0013kx\fUF\u007fgYp&(&\u0018,\u0011J%&\u0006UetAbt\u00160Kt!lpT\u0010xZ\u007f)||+m\u0016AMQ\u001b\u0015j\u0012?'hO{3(N'\u000f\u00129[\u00032')ct\u0006vIQnVxR\u0018\u007fUm2o\u0013\u00068+HG.WB%ҽ\u0016¦ھ_;)Jy,\u0011Ru\"\u001d`\u0017l\u001aVVl:nDRp\u001dTpR\u0010\u001dk~m\t0\u001fy4T5\u00198\u0017.\u007f\u0010<OIVb\u0018vw\u0018e]8>_jE\b\u0007k<\u0007\u007fr{K_\u0011(a\u0001\u0010DCJ\u0011\u001dX\u0015q\u0004\u0010h\u007f@\"`l1$@\"R~$\u0013`X\" BXI\u0019\u000b0x\u0007,^Y|7|\u000bl\u001e\u001dl3R \u001a(\u0003:\u0019P\u000b}6{AO:/x\"[Z\u0018Ia\\cU\u00014+<7\u0003\u00024_gzd|p$+m{N3J=_eU\u0013=\u001cY6\u0010d]L!\u0003\u0002Q _\u0013|(,kl<! j\u001fI'~\u0013UbQ:v\r\u000ei\u001c-\u0016\b\u001d^zu|\u0005\u000fizar1vlRF:\u001d\u001fLBG\u0004j\u0013Ck['K/(\u0018=Qy]\u0018\r^}pL>t\u0014!rw^\u0018p\u0011u2iEy]\r~:$\u001b\u0002rLx9 B73=7V\u0004|p\u0005{\u0014\u001fʹ|օ¡0\u000fv\u001bi\u007f[\u0016\fzF_X\rs\u0002\"\u0013[%?j\u0004k{#c\\9g?\u000e\u00192In@9m$d\u000fz\t^#:,~gI*\u001d<7=d0J<#C\u0003\u00076\u0014\t5^_=4bF\u0002qn\u000e\u0003\u0016\rZV<xE\u000f>p\u0015GEAf\u00115_\u001e\u001eJbx{2/pM\r)5g~\u0015B[Hb\u00053(\u0007\u001e;Ik\u0010a\u0002d!w-{9\b\ff5-!Pf39\u007f.&\u000bxt\u0019%|N\u0013\u0010Bj`\u001f:)-\u0018-\u0012J['\u000bGl9\u0004+CZ!\u00107q31\u001bRy\u001f\f+\u0001v\u001f;WM-kf1(o\"e'S}69P+\u0012>9\\\u0006+\u0017\u000ekeR\u0016 3\u0013\u0006\u0017^h 2Kzx\u0001VF\bdlHGJ9l.\u0004wOYW/zOZK\u0017\u0016:gz.\u0007U9 \u00175dE\u0007-~:9+[z+X\tWWgh^\u001fU,\u0015T8|\u001c+/\u001e&{h\u001f\u0005\u0016oUC=CBa_I\u0003\"\fw\u0012u2\u0004\u001b<ض:ۮ؉Bf\u000f7z\u001e &lG@d#%Y\u0018\u000b&`^?;zZߪ\u001dҋԘ;\u001b%9\u001b&)\u0015\u0012%a&OJ\u0003C)cJ\u000b\u001eC=\u0011Sbpy\u0018*p\r#\u0004u/EF\u0003AP{\u0018xDѽ\u000fϲJԗҨA\u0007З\u0015\u0018)1`>.E|\u001c\"C_<\u0012(\u001f\u0001-84p߁\u001d;r\u070ek'0\u000b\u000b\f]W\b=\u0004:\"D)w\u0006ހq\u0088[pK';sZ6$\u0004kV\r]4h\u001drDIcRTN,˅\u0002ˌ#(<\b{4\u000eU\u0002V8qtBlr\u0006\u0017|ĤB˷H#O؝I\u0002\u0018@\u0002\u001a\nc\nv\u000bФ\u0007\u008f\u001dDFϠ}z\u0015[ej\u0010\nr$\u001cŬCʷ\n);ٚχ\u0010XyC1߲\u000f{.d]B2ŷ\b\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0019IR>A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "7mc2e5:Z\u0004z\na", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al\u000b`", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "4h[9G@IS", "5dc\u0013\\3EB-\nz&\u0019~P51i6", "u(8", "Adc\u0013\\3EB-\nz&6h[\"jN\u0018", "uH\u0018#", "5dc\u0016a;>`\"z\u0002I(\f\f", "u(;.a+K]\u001d}D`9x\u00142i}6E+|&\u001a\u001d", "7r2<a=>f", "", "7r2<a=>fWz\u0004g6\f\u0005>i\n1\n", "u(E", "u(I", "7r4:c;R", ";LPAe0Q", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "@`S6\\", "", "@dRA9", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "/cS\u000ee*", "", "=uP9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "AsP?g\bGU ~Y^.\n\t/s", "", "AvT2c\bGU ~Y^.\n\t/s", "/cS\u000ee*+O\u0018", "AsP?g\bGU ~gZ+\u0001\u00058s", "AvT2c\bGU ~gZ+\u0001\u00058s", "/cS\u001ci(E", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#uL\u001a;MAJo>'j", "/cS\u001dT;A", ">`c5", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/cS\u001dT;A\u001b\t\u0010Mived", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Czq>", "/cS\u001fX*M", "@dRA", "/cS\u001fb<GR\u0006~xm", "@nd;W\u0019>Q(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "/qR!b", "4na0X\u0014Hd\u0019m\u0005", "1k^@X", "1tQ6V\u001bH", "F0", "G0", "F1", "G1", "F2", "G2", "5dc\u000fb<GR'", ":h]2G6", "F", "G", ";ne2G6", "=o", ">`c5$", ">`c5%", "=oT?T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", "=o\u001c\u001b(0G%\u001fI", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW9'\u001c\b/%gc", "?tP1e(MW\u0017[zs0|\u0016\u001eo", "?tP1e(MW\u0017m\u0005", "@d[.g0OSv\u000fwb*k\u0013", "2w ", "2x ", "2w!", "2x!", "2w\"", "2x\"", "@d[.g0OS\u007f\u0003\u0004^\u001b\u0007", "2w", "2x", "@d[.g0OS\u0001\t\f^\u001b\u0007", "@d[.g0OS\u0005\u000fv]9x\u00183c\\(\u0011D\u0001$\u0006Q", "@d[.g0OS\u0005\u000fv]9x\u00183cn2", "@db2g", "@df6a+", "BqP;f-H`!", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!FJ1)b\u0006!c", "uZ5uI", "BqP;f3:b\u0019", "BqP;f3:b\u0019F\u0001&z\u0004tyM", "uI\u0018#", "D`[6W(MS\u0006~xm(\u0006\u000b6e", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public AndroidPath() {
        this(null, 1, null);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new android.graphics.Path() : path);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    public int mo4069getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? PathFillType.Companion.m4460getEvenOddRgk1Os() : PathFillType.Companion.m4461getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    public void mo4071setFillTypeoQ8Xj4U(int i2) {
        Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m4456equalsimpl0(i2, PathFillType.Companion.m4460getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f2, float f3) {
        this.internalPath.moveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f2, float f3) {
        this.internalPath.rMoveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f2, float f3) {
        this.internalPath.lineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f2, float f3) {
        this.internalPath.rLineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f2, float f3, float f4, float f5) {
        this.internalPath.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticTo(float f2, float f3, float f4, float f5) {
        this.internalPath.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f2, float f3, float f4, float f5) {
        this.internalPath.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float f2, float f3, float f4, float f5) {
        this.internalPath.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.internalPath.cubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.internalPath.rCubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect, float f2, float f3, boolean z2) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.arcTo(rectF2, f2, f3, z2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void addRect(Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect, Path.Direction direction) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addRect(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void addOval(Rect rect) {
        addOval(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addOval(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void addRoundRect(RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs());
        fArr[3] = CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs());
        fArr[4] = CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = this.radii;
        Intrinsics.checkNotNull(fArr2);
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect rect, float f2, float f3) {
        addArc(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(Rect rect, float f2, float f3) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addArc(rectF2, f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    public void mo4068addPathUv8p0NA(Path path, long j2) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: translate-k-4lQ0M */
    public void mo4073translatek4lQ0M(long j2) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo4072transform58bKbWc(float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        Intrinsics.checkNotNull(matrix);
        AndroidMatrixConversions_androidKt.m4048setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        Intrinsics.checkNotNull(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: op-N5in7k0 */
    public boolean mo4070opN5in7k0(Path path, Path path2, int i2) {
        Path.Op op;
        if (PathOperation.m4466equalsimpl0(i2, PathOperation.Companion.m4470getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m4466equalsimpl0(i2, PathOperation.Companion.m4471getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m4466equalsimpl0(i2, PathOperation.Companion.m4472getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m4466equalsimpl0(i2, PathOperation.Companion.m4473getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        }
        android.graphics.Path path3 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        if (path2 instanceof AndroidPath) {
            return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }
}
