package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3LeV3ZS0\u0010s{J$c$wHCU0}*\teNogtMb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00153JoU3UoC9htL\u0005(288\u0002\u0005\u000f\u001a2H&v\u0003CQ\f\u001a0VpBR\u0013N\u000b\u001f(ßn /\u001d\u001dlTȤՂp]H/k\u0007wjf'\u000eYEj\u001bpl';\t\u001239kOF%'c\u00035\u007fkA\u0013? k3\u0015Ҋ++O# Sf0,\u0015Ya=r\u0001Qt\u0016ab\u001c'YWsM`\u000eV&)(Ɂ@\u0004\u00145o\u0012<^2f6<[t!|pV\b^P\r\u0013ad\u0016U\u00069+G;~Q\u0010\\IT={\u001316#/!Qpb9x&+V\bQ_YP?XN8\bk\u001aձtb\bY̯/ϚĬ3}\u0017a%Y\bsG$9k0J\u001bϚ\u0003ݶdt[֟jJF%|\u001aW,\u000f\u0011hJ5\u001fyWlZB\u0010{$+Ͷ\nݔ\u0017,dɼT#+\u0019\\Y\tkpXk\u0016uAtDqn\u001a\u001c\u000e\u000e5ڿ7Ʉg\u0014yT|#ML3\u001ffwZU\"Y\u000b:xöTн\u0014\u0004\u0004ͩf\u000e\u0019EM\u0006<62F'reZ\u00115ZA+\u0017\u0016/?ʄ\u0001Ձ7(\u001bk*\r\u0017\u0011!|~\t\u007f\u0001Y.\r`PHWPc3|ş.מ8\t+Ȕ\u0017u\u0006cuigNr4\u0004tL/$:QQ]^ISɒ-6\u001a/Kn\u0001\t\"b K\u0013|(4q-ؤfōзo+߯nNgV\u001dH\u0005\u0006г#\u0011l\u0003\u007fӵb)FkT\u0011zƕM("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9k8t(58\u000b\u001cI[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "u(E", "1`R5X\u0017:`\u0015\u0007\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9jLz,48\u000b\u001cIK\u0012,PC&gA\u001a\u001dv7", "5dc\u0010T*AS\u0004z\bZ4\u000bG?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0016Tk \u0006S59`|~Di(\fIA>k\u001f\u001a\"diG\\", "Adc\u0010T*AS\u0004z\bZ4\u000bG?iy5{G\u0001\u0013%G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$C\u0002W\u0019\u0007)<X\\-3\u007fs*KF;V0+\u0011po\u000fJT", "1n]AX5M2&z\rL*\u0007\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "5dc\u0010b5MS\"\u000eYk(\u000fv-o\u000b(:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0012(\u001ewaB\u0016B9J\t\u0015EVY,2", "Adc\u0010b5MS\"\u000eYk(\u000fv-o\u000b(:P\u0005\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005I>'$hjHep(`d%QWN\u0002 C", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "2qPDE,Lc \u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\"Y\f0>|k", "5dc\u0011e(P@\u0019\r\u000be;;\u00193_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0016Tk \u0006U21kj E}\u001d=#", "Adc\u0011e(P@\u0019\r\u000be;;\u00193_\r(\u0003@|%\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$C\u0002W\u001b\u0004!GF}.Gt%\u0004\u00114", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "5qP=[0<av\t\u0004m,\u0010\u0018\u001ar\n9\u007f?\u0001$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "5dc\u0014e(IV\u001d|\t<6\u0006\u0018/x\u000f\u0013\tJ\u0012\u001b\u0016G|LLz\u001fBY\u0005 3{\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0014e(IV\u001d|\t<6\u0006\u0018/x\u000f\u0013\tJ\u0012\u001b\u0016G|LLz\u001fBY\u0005 3{\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "u(9", "=ac.\\5 `\u0015\n}b*\u000bo+y\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "=m3?T>\u001bS\u001c\u0003\u0004]", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=m3?T>0W(\u0002Xh5\f\t8t", "@dR<e+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "@dR<e+\u0006B\u0018\tn;\u001fK", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b4wHFhf,R\u0010?w\u0015a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\nK\u000bUk.sUF\u0019pDJ3ru&\u001bf_2\u0014\u0005)uYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}xYw\u001b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private ContentDrawScope contentDrawScope;
    private DrawResult drawResult;
    private Function0<? extends GraphicsContext> graphicsContextProvider;

    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final ContentDrawScope getContentDrawScope$ui_release() {
        return this.contentDrawScope;
    }

    public final void setContentDrawScope$ui_release(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final Function0<GraphicsContext> getGraphicsContextProvider$ui_release() {
        return this.graphicsContextProvider;
    }

    public final void setGraphicsContextProvider$ui_release(Function0<? extends GraphicsContext> function0) {
        this.graphicsContextProvider = function0;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3827getSizeNHjbRc() {
        return this.cacheParams.mo3825getSizeNHjbRc();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final GraphicsLayer obtainGraphicsLayer() {
        Function0<? extends GraphicsContext> function0 = this.graphicsContextProvider;
        Intrinsics.checkNotNull(function0);
        return function0.invoke().createGraphicsLayer();
    }

    /* JADX INFO: renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m3826recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j2, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            density = cacheDrawScope;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = IntSizeKt.m6819toIntSizeuvyYCjk(cacheDrawScope.m3827getSizeNHjbRc());
        }
        cacheDrawScope.m3828recordTdoYBX4(graphicsLayer, density, layoutDirection, j2, function1);
    }

    /* JADX INFO: renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m3828recordTdoYBX4(GraphicsLayer graphicsLayer, final Density density, final LayoutDirection layoutDirection, final long j2, final Function1<? super ContentDrawScope, Unit> function1) {
        graphicsLayer.m4828recordmLhObY(density, layoutDirection, j2, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                ContentDrawScope contentDrawScope$ui_release = this.this$0.getContentDrawScope$ui_release();
                Intrinsics.checkNotNull(contentDrawScope$ui_release);
                Density density2 = density;
                LayoutDirection layoutDirection2 = layoutDirection;
                long j3 = j2;
                Function1<ContentDrawScope, Unit> function12 = function1;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                ContentDrawScope contentDrawScope = contentDrawScope$ui_release;
                long jSize = SizeKt.Size(IntSize.m6808getWidthimpl(j3), IntSize.m6807getHeightimpl(j3));
                Density density3 = contentDrawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection3 = contentDrawScope.getDrawContext().getLayoutDirection();
                Canvas canvas2 = contentDrawScope.getDrawContext().getCanvas();
                long jMo4655getSizeNHjbRc = contentDrawScope.getDrawContext().mo4655getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = contentDrawScope.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                drawContext.setDensity(density2);
                drawContext.setLayoutDirection(layoutDirection2);
                drawContext.setCanvas(canvas);
                drawContext.mo4656setSizeuvyYCjk(jSize);
                drawContext.setGraphicsLayer(null);
                canvas.save();
                try {
                    function12.invoke(contentDrawScope$ui_release);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = contentDrawScope.getDrawContext();
                    drawContext2.setDensity(density3);
                    drawContext2.setLayoutDirection(layoutDirection3);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                    drawContext2.setGraphicsLayer(graphicsLayer2);
                }
            }
        });
    }

    public final DrawResult onDrawBehind(final Function1<? super DrawScope, Unit> function1) {
        return onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope.onDrawBehind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                function1.invoke(contentDrawScope);
                contentDrawScope.drawContent();
            }
        });
    }

    public final DrawResult onDrawWithContent(Function1<? super ContentDrawScope, Unit> function1) {
        DrawResult drawResult = new DrawResult(function1);
        this.drawResult = drawResult;
        return drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }
}
