package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?3Le^.ZS0\u0012s{J$c$wFCU0}*\tUNog\u0005JbŏK\u000f\u0014\u001b\u0001j2J]xs\u0012\u00172HpG3[oEʠhtL\u0005(2(E\u0002\u0005\u0017\u001a2H\u0016|\u0001ŏaÈB0nozUҫQ\u0005(\u0012NJ.%6\\\u0016sfLz\u0004R/Q*2X\\Ow0+S=JbP%v\u00109ӡ?ʺ߱\u0019'Y-\u0015}$w\u0011k\n=3nW-9Z\fYLW.&E/]:urTy5Un0?+}i{T\u001cV\u0010z**l\b\u001c5?H\\Eָeڜԧ7vx\u0004N\u0002JdP2\u0013ad<k\u007f{9GN~Q\u0010`IRE0\u001d\rL/GniibCx\u0015Iy(U?\bX=v\u0006PY\u0006{\u0012)z\u0002X)`K\u000eh\u0014\u0011\\8k7$g1[\u0004\u0002vJ\u0010x\u001b_\u0017t\u001aVV{:nDRZ\r\u001a\n\\d3\u0004\u0001Xfh)MJqM}ު\u0012\u05feϢ{>'b\u001e\r ywke_ $]hm\u001eˇo\u0012o;d6CU4,oY\u000f\u0014mB\u0013\tfkZS:`\u001bhxöTн\u0014}\u0004ͩf\u000e\u0019:Mzl@:;1\\CJYٟD˩\u0001\tgʳ9\u001e\r_K&\u0019hR\u0001_ə\\ʷtooծ\u001a=\u000bm:/WPc%\\\u001aɋl8\u0015%\r\r\u0002\u000f\u0018sZWdlD{,ݫ,ک\u001e9Yǽ\u000e!\u001d\u0010A4\u0018,s^IϏ]̊\u0016'\u0003۠J\u001eI{Fg6p'p߯nNgV\u001d6\u0005gC/\u0016y\u0018y\u0010LQõoӝ\u000f[FδC\u0011gRf:\u0013\u0004M*{˝{ݕ\u000155ξw1$\u000f,/Cy4ɓ{Ѽxʬр%sФ\b.k\u0016}{\"q@UPI\b\u001a\u0015а0Ґ\u0002ܩَivڇF\u000b<\rAa\u0012p~rPM9LTֈ\u0013Ր\u0011p^ܪ\u000b!}\u001cL0u)\"OTйjǜ)\u0011Uω8{{jt\r`\u000e8\u0017Rυz݁ =(݈(p\u0017P\u001eu.5o\\9ŠHʢ(44фX\u0019Qv\u0002\b&y.R6ʘ#ЋFsCٙ^`\u0007\u007fnH3f\u001cǺ-Ǆ\u0005~\u0017ɼͫx>9\bsܐp]b:\u0001Y<ͨ\u001f*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001fi\r';v\u0016\u001bMQErE\u001e\">", "", "u(E", "/mS?b0==)\u000e\u0002b5|", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "5dc\u000ea+K]\u001d}dn;\u0004\r8e", "u(;.a+K]\u001d}D`9x\u00142i}6E*\u0011&\u001eKx\u000e\u0012", "\nrTA \u0006\u0017", "", "1`R5X\u0010L2\u001d\f\nr", "5dc\u0010T*AS|\rYb9\f\u001dmu\u0004\"\t@\b\u0017\u0013Uo", "u(I", "1`R5X+(c(\u0006~g,", "1`R5X++`\u0019|\nI(\f\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=C(MV", "5dc\u0010_0I>\u0015\u000e}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpk", "7rBBc7H`(~yH<\f\u00103n\u007f", "=tc9\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "=tc9\\5>1 \u0003\u0006L<\b\u00149r\u000f(z", "5dc\u001ch;EW\"~Xe0\bv?p\u000b2\tO\u0001\u0016", "=tc9\\5><\u0019~y^+", "=tc9\\5>>\u0015\u000e}", "@dRAF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u0018", "@dRAG6I:\u0019\u007f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@nd;W,=1#\f\u0004^9i\u0005.i\u00106", "", "Bl_\u001cc\u0017:b\u001c", "Bl_\u001dT;A", "Bl_\u001fb<GR\u0006~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "Bl_!b<<V\u0004\t~g;g\u0005>h", "CrT\u001dT;A4#\fXe0\b", "1kX=G6(c(\u0006~g,", "", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "7r8;B<MZ\u001d\bz", ">nb6g0H\\", "7r8;B<MZ\u001d\bz&2DW6QJ\u0010", "uI\u0018'", "CoS.g,", "/k_5T", "3kTCT;B]\"", "Ahi2", "CoS.g,\u0006A\u0013\r\u0010D(\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~C\u000e/>q\u001f.#$0L\u0019a\n", "CoS.g,\u001cO\u0017\u0002z", "CoS.g,\u001cO\u0017\u0002zP0\f\f\u001aa\u000f+", "1n\\=b:>>\u0015\u000e}", "CoS.g,\u001cO\u0017\u0002zP0\f\f\u001ce}7", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "CoS.g,\u001cO\u0017\u0002zP0\f\f\u001co\u00101z-\u0001\u0015&", "@nd;W\u0019>Q(", "7rB.`,\u001b])\byl", "=eU@X;", "@`S6h:", "7rB.`,\u001b])\bylsKo{1b\b\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011P\u0019~X]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m3953getZeroF1C5BW0();
        this.rectSize = Size.Companion.m4015getZeroNHjbRc();
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    public final Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    /* JADX INFO: renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m5905updateS_szKao(androidx.compose.ui.graphics.Outline outline, float f2, boolean z2, float f3, long j2) {
        this.cachedOutline.setAlpha(f2);
        boolean zAreEqual = Intrinsics.areEqual(this.outline, outline);
        boolean z3 = !zAreEqual;
        if (!zAreEqual) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j2;
        boolean z4 = outline != null && (z2 || f3 > 0.0f);
        if (this.outlineNeeded != z4) {
            this.outlineNeeded = z4;
            this.cacheIsDirty = true;
        }
        return z3;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m5904isInOutlinek4lQ0M(long j2) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m4149clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f2 = this.roundedCornerRadius;
        if (f2 > 0.0f) {
            Path Path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (Path == null || !m5903isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f2)) {
                RoundRect roundRectM3991RoundRectgG7oq9Y = RoundRectKt.m3991RoundRectgG7oq9Y(Offset.m3937getXimpl(this.rectTopLeft), Offset.m3938getYimpl(this.rectTopLeft), Offset.m3937getXimpl(this.rectTopLeft) + Size.m4006getWidthimpl(this.rectSize), Offset.m3938getYimpl(this.rectTopLeft) + Size.m4003getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                } else {
                    Path.reset();
                }
                Path.addRoundRect$default(Path, roundRectM3991RoundRectgG7oq9Y, null, 2, null);
                this.tmpRoundRect = roundRectM3991RoundRectgG7oq9Y;
                this.tmpPath = Path;
            }
            Canvas.m4149clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            return;
        }
        Canvas.m4150clipRectN_I0leg$default(canvas, Offset.m3937getXimpl(this.rectTopLeft), Offset.m3938getYimpl(this.rectTopLeft), Offset.m3937getXimpl(this.rectTopLeft) + Size.m4006getWidthimpl(this.rectSize), Offset.m3938getYimpl(this.rectTopLeft) + Size.m4003getHeightimpl(this.rectSize), 0, 16, null);
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m3953getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline != null && this.outlineNeeded && Size.m4006getWidthimpl(this.rectSize) > 0.0f && Size.m4003getHeightimpl(this.rectSize) > 0.0f) {
                this.isSupportedOutline = true;
                if (!(outline instanceof Outline.Rectangle)) {
                    if (!(outline instanceof Outline.Rounded)) {
                        if (outline instanceof Outline.Generic) {
                            updateCacheWithPath(((Outline.Generic) outline).getPath());
                            return;
                        }
                        return;
                    }
                    updateCacheWithRoundRect(((Outline.Rounded) outline).getRoundRect());
                    return;
                }
                updateCacheWithRect(((Outline.Rectangle) outline).getRect());
                return;
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fM3912getXimpl = CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fM3912getXimpl);
            this.roundedCornerRadius = fM3912getXimpl;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect$default(Path, roundRect, null, 2, null);
        updateCacheWithPath(Path);
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m5903isSameBounds4L21HEs(RoundRect roundRect, long j2, long j3, float f2) {
        return roundRect != null && RoundRectKt.isSimple(roundRect) && roundRect.getLeft() == Offset.m3937getXimpl(j2) && roundRect.getTop() == Offset.m3938getYimpl(j2) && roundRect.getRight() == Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3) && roundRect.getBottom() == Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == f2;
    }
}
