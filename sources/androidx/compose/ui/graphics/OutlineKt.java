package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.Zݷ2\u000f\u0002{<řc$\u007fHC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HqG3coE9vt>\u000562*8\u007f\u0005\t\u001a@H\u0018͌\u0003Ca\f\u001a0FrBR\u001bV\r܅\u001a\u0006T \t\u001ebhV6^leŽG3\u0011݃ZNU^X|{\rvX5\u000e\u000faL-XOC\u0018=S1\u0006z[m\u0007ouK\u0006\u0001'U-ywe;p\u007fB\u001bC\u001c\u001b`\u000b&\u000b\u0004y`:.[SqLh\u000eVy+\u007f\u001bD\u001c\u000e40x43\u001bt\u0012&3#}\u0004FV\u0002lN\u0018z\u0010CG-\u000639G3hg`i(~=\u0002\u0005\u001b.;\u0001\u001d2ǵSו\u05ce\u0019\u001dZ\n_Di\rKKf\n\b<\u0016\u0004\u001fi2.\u00121_\u007f]}A2%9O[g8Qq\bIRq\u000f\u0005\u000fs\u0004oXHN.\u0007\u0016e79\u0014`Dr\u0013\u0004RjWZ }\"Z\u0007\f\u0018+ \u000b\t͌ طŎRQn\u007fxduܣ$=~OY\u001dj6Wgec9_d(a\u0001xDiJ{\u001d~vDc\f\tc83BW\u0019+ȑ\u007fNT(#8E\u000f,627?z%J\u0013\u001ep@+#ރ^h\u0016\u001e\u0005]2#\u0002J\u0005\u000b\u0011P\u000bw\u007fx\tXZ\u001e˃&7GmE\u001f,r2j:\u0003I)\u000fu\u0010G\u0016Kuf̡\u001au[\u001bP@(\\iUM\u0015\u001f~W9\u0012>U[!e˛Q\u001c-\u0017\r\u007f\u0015Xx0m\u000e\u0011\u0015<bzJ}SE<Ցbr)'+у\u007fyP\tl{T9\u0002fI!$ <fG\u000b,7\u001eS)\u0018\"+PsCے!\u0016\u0006=G$o\u0005\u0002o\\\"\u000b\u000fT\u0016,\u0004Нg\u0016}\ril@fPI\b+f\"R\bIB\u05f8nw\u0016k!C\u001b^`A\u0013\u001d~8{,u}֨\u000b,\u001b\u001b¦[?\u001br\u0004ӐJ\u000e)ϻG+"}, d2 = {"/cS\u001ch;EW\"~", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "=tc9\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "2qPDB<MZ\u001d\bz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPDB<MZ\u001d\bz&/\u0006X\u001eE\u0013*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b&{@B\"\f*WK%x\u0010\u0013\u001a\u00175@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fr..\u000el\u0019g=>\"\";u(x^1_\\:\r{Q\u0007qkF,D6.FxeTE9e@>),G\u0007z\u00160f>*\u0002)\u0016B(@o\u0005\u0015F%:pf$@cA|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~A\u001d/gpD\u001a\na\u0015i~?i\bA_fBP~\u00154\u001cb\u0006L", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPDB<MZ\u001d\bz&>[{|7q:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b&{@B\"\f*WK%x\u0010\u0013\u001a\u00175@U#=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001fi6E'\u0018o'dg]*\u001c\nQ\u001b}RCFtC+hG8Em1-AxTI~+\u001e^Eu\u001c:c~9tv\u00148s8q\u0001Vj\u001c<lBr6cK4\u0007:C\"?X9Y0/", "2qPDB<MZ\u001d\bzA,\u0004\u0014/r", "2qPDE,<bu\u0006\u0005\\2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@dRA", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qPDE6N\\\u0018~yK,z\u0018\fl\n&\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "@qT0g", "2qPDC(MVu\u0006\u0005\\2", ">`c5", "6`b T4>1#\f\u0004^9i\u0005.i\u00106", "", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCY\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011/\u0019", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (!(outline instanceof Outline.Rectangle)) {
            if (outline instanceof Outline.Rounded) {
                Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                return;
            } else {
                if (!(outline instanceof Outline.Generic)) {
                    throw new NoWhenBranchMatchedException();
                }
                Path.m4448addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
                return;
            }
        }
        Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww$default */
    public static /* synthetic */ void m4437drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 + 4) - (4 | i3) != 0) {
            f2 = 1.0f;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            colorFilter = null;
        }
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m4436drawOutlinewDX37Ww(drawScope, outline, j2, f2, drawStyle, colorFilter, i2);
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m4435drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 + 4) - (4 | i3) != 0) {
            f2 = 1.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            colorFilter = null;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i2 = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m4434drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle, colorFilter, i2);
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, Function2<? super DrawScope, ? super Rect, Unit> function2, Function2<? super DrawScope, ? super RoundRect, Unit> function22, Function2<? super DrawScope, ? super Path, Unit> function23) {
        if (!(outline instanceof Outline.Rectangle)) {
            if (outline instanceof Outline.Rounded) {
                Outline.Rounded rounded = (Outline.Rounded) outline;
                Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
                if (roundRectPath$ui_graphics_release != null) {
                    function23.invoke(drawScope, roundRectPath$ui_graphics_release);
                    return;
                } else {
                    function22.invoke(drawScope, rounded.getRoundRect());
                    return;
                }
            }
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            function23.invoke(drawScope, ((Outline.Generic) outline).getPath());
            return;
        }
        function2.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (!(outline instanceof Outline.Rectangle)) {
            if (outline instanceof Outline.Rounded) {
                Outline.Rounded rounded = (Outline.Rounded) outline;
                Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
                if (roundRectPath$ui_graphics_release != null) {
                    canvas.drawPath(roundRectPath$ui_graphics_release, paint);
                    return;
                } else {
                    canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m3912getXimpl(rounded.getRoundRect().m3985getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m3913getYimpl(rounded.getRoundRect().m3985getBottomLeftCornerRadiuskKHJgLs()), paint);
                    return;
                }
            }
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
            return;
        }
        canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) > CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) > CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) > CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) ? 1 : (CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww */
    public static final void m4436drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4647drawRectnJ9OG0(j2, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo4649drawRoundRectuAw5IA(j2, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f2, colorFilter, i2);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawScope.mo4643drawPathLG529CI(path, j2, f2, drawStyle, colorFilter, i2);
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg */
    public static final void m4434drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4646drawRectAsUm42w(brush, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo4648drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f2, drawStyle, colorFilter, i2);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawScope.mo4642drawPathGBMwjPU(path, brush, f2, drawStyle, colorFilter, i2);
    }
}
