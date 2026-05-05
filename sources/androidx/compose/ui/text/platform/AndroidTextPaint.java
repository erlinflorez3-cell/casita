package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
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
/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r'4\u0012}\u0007njO0LeN.ZS@\u000fs{:)c$\bCCU \u0003*\teNogtQb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172XoG3SrE9vt>\u0005&6*8\u0010\u0005\tɝ2H\u001ev\u0003CQ\u0011\u001a0VpBR\u0013Q\u000b܅(ßn /\u001d\u001dz^:Vlu:]$\u0013mPP?_^\u007f֔\u0011Fb+U|oSC@ek[%\u001c-\u0015\ns?1u\"C\u0013x?)AH\"hf\\\u000eL-+}&\u000ex,\\\u0013\u000bx\fU.\u05cbb֟ח\u0012*}5\nH\u0005\u001a\u001cB?H\\cJj\u0016KKt!\u0012ŬO\u061cެF\u0002\u0001!DWm\u000eAlQ\u001b\u0015\b\u0012A'pO}\u001b\fLFI|/\u001el\u000e\u000fKKZ\u0006}ISV<v{RgK1\u001cp\u00118Z\n>z\u00181\u0012\u0010\\KuKi>;!\u001a\b\u001fֶsѱ\u0004\u009bŞRhʐLB*n$>z\u0017\u001ab\\f\u001bj~]/\u008f\u001dܖ T\u000fâX;.g\u0010<O+@R]r\u0002j{c@im+\u000eձzā\rã¢]2̳Um(cX\u0003\"L\\d\u000bftQ$0hl@$HG\u0019!.ӻ\u0003\u0088bƐ>Ɛu.<ιA\u001bb'V\u00166DG\u0011\u0017tzj\u0016\u0015bJt-w<\r\u000b\u0017O\u000b\n&Ο7̢\u0003ʋlŮ,ۋ۔4\u0018łY4pؔ\r%\r\u0019\u0002\u0013_iRbZ\t6w[\u0019.4jK_NU\u0013=\b_rXΒGʆviiO\u0018G\t\u001eJ\u001dI\u000bFi\u001ei\u001fO7ʇVׅX\u0017*Ԯ/\u001b1,|\u0010\nkV\u0003]b\u00031D@_qa\u0001RMf\"[ȕ*ݵ\u0005{*ĜM/IO+?\u0018\u00165?o\t:\u0012<&z\u000fT\"\u001cֽjϣl˳nжaDCͯY[\u0005l07\u0005\u0005Hwx((D\u000fe\u001be\u0019Mr$n8{?\u0006̑r¡0\rx£ܭ:\u001cw\u0001:ʿ{XrK}\u001a}Ǣ)U"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j#\u001e(wL5\u000bl;$", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "4kP4f", "", "2d]@\\;R", "", "uH5uI", "0`R8\\5@0 ~\u0004]\u0014\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "\u0017", "0`R8\\5@1#\u0007\u0006h:|s+i\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "D`[BX", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "5dc\u000fe<LVW\u000f~X;|\u001c>_\r(\u0003@|%\u0017\u0006k\u0017E\u000141h\u0002*@{", "u(E", "5dc\u000fe<LVW\u000f~X;|\u001c>_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "Adc\u000fe<LVW\u000f~X;|\u001c>_\r(\u0003@|%\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epkq>", "0qd@[\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u000fe<LV\u0007\u0003\u0010^sm\u0017\u001cJ\u0012&F~\u0011\u001b\u0011Vo!Kp25`}\u001cEmT*VLEz0-\u0019rjG", "5dc\u000fe<LV\u0007\u0003\u0010^sm\u0017\u001cJ\u0012&F~\u0011\u001b\u0011Vo!Kp25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#k$Lmk", "Adc\u000fe<LV\u0007\u0003\u0010^s\u0001\u0005\r8p&J~\u0011\u001b\u0011Vo!Kp25`}\u001cEm", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~G\u000257CY\u001f", "1n\\=b:>>\u0015\u0003\u0004m", "5dc\u0010b4I]'~eZ0\u0006\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "AgP1X9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "5dc [(=S&l\nZ;|G?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "Adc [(=S&l\nZ;|G?iy7{S\u0010\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYSc(", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "5dc [(=]+=\u000bb&\f\tBty5{G\u0001\u0013%G.\nE\u007f/DU\r$Av$", "5dc [(=]+=\u000bb&\f\tBty5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l @#", "Adc [(=]+=\u000bb&\f\tBty5{G\u0001\u0013%G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001c6w(\u0004\u00114", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "1kT.e\u001aAO\u0018~\b", "", "Adc\u000fe<LV", "Ahi2", "/k_5T", "Adc\u000fe<LV`JGL\rPg\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u0013.\u0007,", "Adc\u0010b3H`", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Adc\u0010b3H``Qt1w\u0004\u0010\u000b", "uI\u0018#", "Adc\u0011e(PA(\u0013\u0002^", "Adc [(=]+", "Adc!X?M2\u0019|\u0005k(\f\r9n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m6385getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    public AndroidTextPaint(int i2, float f2) {
        super(i2);
        this.density = f2;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        this.shadow = shadow;
    }

    public final Brush getBrush$ui_text_release() {
        return this.brush;
    }

    public final void setBrush$ui_text_release(Brush brush) {
        this.brush = brush;
    }

    public final State<Shader> getShaderState$ui_text_release() {
        return this.shaderState;
    }

    public final void setShaderState$ui_text_release(State<? extends Shader> state) {
        this.shaderState = state;
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name */
    public final Size m6388getBrushSizeVsRJwc0$ui_text_release() {
        return this.brushSize;
    }

    /* JADX INFO: renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m6391setBrushSizeiaC8Vc4$ui_text_release(Size size) {
        this.brushSize = size;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        setUnderlineText(textDecoration.contains(TextDecoration.Companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(TextDecoration.Companion.getLineThrough()));
    }

    public final void setShadow(Shadow shadow) {
        if (shadow != null && !Intrinsics.areEqual(this.shadow, shadow)) {
            this.shadow = shadow;
            if (Intrinsics.areEqual(shadow, Shadow.Companion.getNone())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m3937getXimpl(this.shadow.m4504getOffsetF1C5BW0()), Offset.m3938getYimpl(this.shadow.m4504getOffsetF1C5BW0()), ColorKt.m4232toArgb8_81llA(this.shadow.m4503getColor0d7_KjU()));
            }
        }
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6392setColor8_81llA(long j2) {
        if (j2 != 16) {
            setColor(ColorKt.m4232toArgb8_81llA(j2));
            clearShader();
        }
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m6386setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j2, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f2 = Float.NaN;
        }
        androidTextPaint.m6390setBrush12SF9DM(brush, j2, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6390setBrush12SF9DM(final androidx.compose.ui.graphics.Brush r4, final long r5, float r7) {
        /*
            r3 = this;
            if (r4 != 0) goto L6
            r3.clearShader()
        L5:
            return
        L6:
            boolean r0 = r4 instanceof androidx.compose.ui.graphics.SolidColor
            if (r0 == 0) goto L18
            androidx.compose.ui.graphics.SolidColor r4 = (androidx.compose.ui.graphics.SolidColor) r4
            long r0 = r4.m4513getValue0d7_KjU()
            long r0 = androidx.compose.ui.text.style.TextDrawStyleKt.m6547modulateDxMtmZc(r0, r7)
            r3.m6392setColor8_81llA(r0)
            goto L5
        L18:
            boolean r0 = r4 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r0 == 0) goto L5
            androidx.compose.ui.graphics.Brush r0 = r3.brush
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r0 == 0) goto L2b
            androidx.compose.ui.geometry.Size r0 = r3.brushSize
            if (r0 != 0) goto L63
            r0 = 0
        L29:
            if (r0 != 0) goto L49
        L2b:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            r3.brush = r4
            androidx.compose.ui.geometry.Size r0 = androidx.compose.ui.geometry.Size.m3994boximpl(r5)
            r3.brushSize = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r0)
            r3.shaderState = r0
        L49:
            androidx.compose.ui.graphics.Paint r1 = r3.getComposePaint()
            androidx.compose.runtime.State<? extends android.graphics.Shader> r0 = r3.shaderState
            if (r0 == 0) goto L61
            java.lang.Object r0 = r0.getValue()
            android.graphics.Shader r0 = (android.graphics.Shader) r0
        L57:
            r1.setShader(r0)
            r0 = r3
            android.text.TextPaint r0 = (android.text.TextPaint) r0
            androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.setAlpha(r0, r7)
            goto L5
        L61:
            r0 = 0
            goto L57
        L63:
            long r0 = r0.m4011unboximpl()
            boolean r0 = androidx.compose.ui.geometry.Size.m4002equalsimpl0(r0, r5)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.m6390setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle != null && !Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            this.drawStyle = drawStyle;
            if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                getComposePaint().mo4061setStylek9PVt8s(PaintingStyle.Companion.m4446getStrokeTiuSbCo());
                Stroke stroke = (Stroke) drawStyle;
                getComposePaint().setStrokeWidth(stroke.getWidth());
                getComposePaint().setStrokeMiterLimit(stroke.getMiter());
                getComposePaint().mo4060setStrokeJoinWw9F2mQ(stroke.m4804getJoinLxFBmk8());
                getComposePaint().mo4059setStrokeCapBeK7IIE(stroke.m4803getCapKaPHkGw());
                getComposePaint().setPathEffect(stroke.getPathEffect());
            }
        }
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6387getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6389setBlendModes9anfk8(int i2) {
        if (BlendMode.m4089equalsimpl0(i2, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo4056setBlendModes9anfk8(i2);
        this.backingBlendMode = i2;
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }
}
