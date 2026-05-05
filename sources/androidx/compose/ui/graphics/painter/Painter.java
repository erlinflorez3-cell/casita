package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS8\u000fs{J$cҕyCQU\"}(\nWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:R]xc\u001e\u0015VXģo3{n}<žx6\u0013 z0F\u000e\u001d\u0001H=x\u0014\u0005{[K:\u0014vR9J`\"e\u0005H%6D.\u00046^}MdL3o\u0003=1\u0019\u0002B|:\u00104\u000b]%F\u00038S\t*,9WO5C-\u0004\u0007\u0015Ss?1A8=Mx5?CI\"_f^\u000e\u0017--e\f\fvl\\M_n%?+}k{T\u001cB\u0010z*\u001e\u0003\u0004V\f5cF-HuN\u000e{%\u0001oXP0fj\u007f)hf\u001b3\u001dK+g&\u0017Wg;'OO{3\u000fN+\u0007n/^l\u0010v\u0014IXʦPĸҨD?Nl\u0018x\u0006w\u0012\u0011z\u0002X\fXG.6B3~#38s9Q#BȸTזkv\r\u009b9awU`B8mD;\u0001¡\u0018ʑHd\rߘ!qf1)^,V\u0017}6\u001a0^\b<O->TћlipV4܆'çj7aʤ<$eCv3c\\:߫c٥uܝά;aۖ\\jZU\u0012fj5r@Vx(y\u0012C|\u001biԸKۇ 44ջih#X\u001b\u001epRSȄk˖l\u0010\u0007Ԟ\u00040\u0011{<t7\u0014'ʗ|״kxQؓʌ`+5DWڣ5TT*h:\u001cɦ\u000b "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "", "u(E", "/k_5T", "", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "2qPD?(FP\u0018z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", ":`h2e\u0017:W\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "CrT\u0019T@>`", "", "/o_9l\bE^\u001cz", "/o_9l\nHZ#\f[b3\f\t<", "/o_9l\u0013:g#\u000f\n=0\n\t-t\u00042\u0005", "1n]3\\.N`\u0019Z\u0002i/x", "1n]3\\.N`\u0019\\\u0005e6\ni3l\u000f(\t", "1n]3\\.N`\u0019evr6\r\u0018\u000ei\r(yO\u0005! ", "@s[", "=ac.\\5)O\u001d\b\n", "2qPD", "Ahi2", "2qPD ?89w^y)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2^\u0016\u001d\u0018BKtIe\u0010TOXf", "=m3?T>", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Painter {
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final Function1<DrawScope, Unit> drawLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            this.this$0.onDraw(drawScope);
        }
    };

    protected boolean applyAlpha(float f2) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo4855getIntrinsicSizeNHjbRc();

    protected abstract void onDraw(DrawScope drawScope);

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureAlpha(float f2) {
        if (this.alpha != f2) {
            if (!applyAlpha(f2)) {
                if (f2 == 1.0f) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setAlpha(f2);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setAlpha(f2);
                    this.useLayer = true;
                }
            }
            this.alpha = f2;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m4860drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j2, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        painter.m4861drawx_KDEd0(drawScope, j2, f2, colorFilter);
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m4861drawx_KDEd0(DrawScope drawScope, long j2, float f2, ColorFilter colorFilter) {
        configureAlpha(f2);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - Size.m4006getWidthimpl(j2);
        float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) - Size.m4003getHeightimpl(j2);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, fM4006getWidthimpl, fM4003getHeightimpl);
        if (f2 > 0.0f) {
            try {
                if (Size.m4006getWidthimpl(j2) > 0.0f && Size.m4003getHeightimpl(j2) > 0.0f) {
                    if (this.useLayer) {
                        Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(Offset.Companion.m3953getZeroF1C5BW0(), SizeKt.Size(Size.m4006getWidthimpl(j2), Size.m4003getHeightimpl(j2)));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(rectM3977Recttz77jQw, obtainPaint());
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } finally {
                drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fM4006getWidthimpl, -fM4003getHeightimpl);
            }
        }
    }
}
