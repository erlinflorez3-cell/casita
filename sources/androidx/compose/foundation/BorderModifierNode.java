package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq\u0001<$q$yCA_\"}8\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:R]ތe\u0012\u001d7JģG3coEʠhtL\u0005(݅*8\u0010\u0005\t\u001a0I\u0016͌\u0011ŏ{\f@/\u0001\fJV\u001bM\u001d\u001a@\u0007N$\u000f tg|9Xpk>G#1nŌR'm6Ew\u001bbl';\u0014\n\u001eY^g9#/k\u00035U\fC\u0011^\n=3\tW+9j\fWdz0\u0018#Ng\r\f\u0017l\\M\u0016n1?+}\u0001sP<F(~\n\u0017T\u0004<\tWL<L2f64cx\u0001zXP0\u0007r\u0004\t\u000bN\u0017S*c/G<~Q\u0010]IRE\u001f\u001d\rLGGnƈZ٪\u05f8d\u0017!\u007f\u0006}\u0002_ND`P XkuZ͒n͆.\u00048ϚPQ\n\u001bF\u0017S:\f=1*\u0004\u0002vG&;[¢tרm^Pؗ:p\u001cB8\u0015,\\Jq\u0013y!`f;)MJd]å\n˙$\\\u007f˓qG\u001e_gh\u0018o}a\u0018.Gfe^-0dêEӷ7AYү(cX\t\"R\\d\u000bltW$6hr@\"`I\u001b\u0014\u0006\u0005\\N:\u0014p\u0004Hʐ@в0ǉě\u0014GҴ\"PI|\u0017zrj\u0016\u0016bKD\u0005o=\u0003#əPexrm\u0590eZ{h\"3`ڄ9F"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| DU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "EhSA[\u0017:`\u0015\u0007zm,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "0qd@[\u0017:`\u0015\u0007zm,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "AgP=X\u0017:`\u0015\u0007zm,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D+=)\u00173M\u000b\u0005m\u0012\u0014_\u0012>ypO_\fNCsuB%xMh=\u0004POTo:b\u001bi*D6G*\u0014~n^Y", "0na1X9\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| DK\u0012,PC\u0011", "D`[BX", "0qd@[", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "Adc\u000fe<LV", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epkq>", "2qPDJ0MVvzxa,d\u0013.i\u0001,{Mi!\u0016G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9k8t(58\u000b\u001cIU -QD?kA\u0007\u001fga\u000f", "AgP=X", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "Adc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "EhSA[", "5dc$\\+MV`]N>1L\n\u0017", "u(5", "Adc$\\+MV`IK1v\u0002\u0003}", "uE\u0018#", "\u0014", "2qPD:,GS&\u0003x;6\n\b/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\"Y\f0>|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9k8t(58\u000b\u001cI[\u00148XC\u0011", "=tc9\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016l/CDkA\"\u0013>", "4h[949>O", "", "Asa<^,0W\u0018\u000e}", "", "2qPDE6N\\\u0018kz\\;Y\u0013<d\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016l:MKt3\u001e\u0014>", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "0na1X9,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2qPDE6N\\\u0018kz\\;Y\u0013<d\u007f5C%\r!tSm\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$C\u0002W\u001ar#8Y\\-3\u007f\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0001{TE\"]\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^\u0006ErjSUj|K?S,\u0014t\u001bf!e:x\u0011\u001e\u0002\"\u001ahO\u0004n`Hq69upfT#~77\bkeNPyc<>7#\u0015z\u0005\u000eD\"S8p?p48Fk\u0014!", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f2, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush, shape);
    }

    private BorderModifierNode(float f2, Brush brush, Shape shape) {
        this.width = f2;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo710toPx0680j_4(this.this$0.m591getWidthD9Ej5fM()) < 0.0f || Size.m4005getMinDimensionimpl(cacheDrawScope.m3827getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f3 = 2;
                float fMin = Math.min(Dp.m6643equalsimpl0(this.this$0.m591getWidthD9Ej5fM(), Dp.Companion.m6656getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo710toPx0680j_4(this.this$0.m591getWidthD9Ej5fM())), (float) Math.ceil(Size.m4005getMinDimensionimpl(cacheDrawScope.m3827getSizeNHjbRc()) / f3));
                float f4 = fMin / f3;
                long jOffset = OffsetKt.Offset(f4, f4);
                long jSize = SizeKt.Size(Size.m4006getWidthimpl(cacheDrawScope.m3827getSizeNHjbRc()) - fMin, Size.m4003getHeightimpl(cacheDrawScope.m3827getSizeNHjbRc()) - fMin);
                boolean z2 = f3 * fMin > Size.m4005getMinDimensionimpl(cacheDrawScope.m3827getSizeNHjbRc());
                Outline outlineMo621createOutlinePq9zytI = this.this$0.getShape().mo621createOutlinePq9zytI(cacheDrawScope.m3827getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo621createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo621createOutlinePq9zytI, z2, fMin);
                }
                if (outlineMo621createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m590drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo621createOutlinePq9zytI, jOffset, jSize, z2, fMin);
                }
                if (outlineMo621createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m587drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jOffset, jSize, z2, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m591getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m592setWidth0680j_4(float f2) {
        if (Dp.m6643equalsimpl0(this.width, f2)) {
            return;
        }
        this.width = f2;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r47, final androidx.compose.ui.graphics.Brush r48, final androidx.compose.ui.graphics.Outline.Generic r49, boolean r50, float r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m590drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z2, final float f2) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM3987getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m3987getTopLeftCornerRadiuskKHJgLs();
            final float f3 = f2 / 2;
            final Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) throws Throwable {
                    contentDrawScope.drawContent();
                    if (z2) {
                        DrawScope.m4729drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM3987getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM3912getXimpl = CornerRadius.m3912getXimpl(jM3987getTopLeftCornerRadiuskKHJgLs);
                    float f4 = f3;
                    if (fM3912getXimpl < f4) {
                        ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float f5 = f2;
                        float fM4006getWidthimpl = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - f2;
                        float fM4003getHeightimpl = Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) - f2;
                        int iM4166getDifferencertfAjoo = ClipOp.Companion.m4166getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j4 = jM3987getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext = contentDrawScope2.getDrawContext();
                        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo4658clipRectN_I0leg(f5, f5, fM4006getWidthimpl, fM4003getHeightimpl, iM4166getDifferencertfAjoo);
                            try {
                                DrawScope.m4729drawRoundRectZuiqVtQ$default(contentDrawScope2, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                            } catch (Throwable th) {
                                th = th;
                                drawContext.getCanvas().restore();
                                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        DrawScope.m4729drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j2, j3, BorderKt.m588shrinkKibmq7A(jM3987getTopLeftCornerRadiuskKHJgLs, f4), 0.0f, stroke, null, 0, 208, null);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f2, z2);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                contentDrawScope.drawContent();
                DrawScope.m4723drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
