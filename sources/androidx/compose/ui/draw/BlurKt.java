package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0017\u0010-tʑQ0rdp.\u0001RZ\u0013y{L$\n%\"IAU(\u007f:\t}Q.lŪIҙŲG\u0011\f\u001a\u0007oDwcތu\u0012=1jom2}sK?xtd\u0006P60?\u0012\u0005/\u001bZN\u0016v\tEc\f@3\u0007uŦQ҈̂\t\u001c\u0018\u000eL)Ҹ\u001eaoQ<Ձ\t\f9ǫ'\r"}, d2 = {"0kd?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3cV2G9>O(\u0007zg;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9jC\u00072BY|\u007f6o\u0016\u001dZC7z<\u001e\u001ew7", "0kd? \r\u0011?u\u0011\fl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d\u001c@l#8QBN52(\u001dskG\u0007-<R@)THY/`P\u0001\u0007\u0002\u0015V\u0019N\u0001PkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WEn:*`\u000fKz\u0019uN~", "@`S6h:1", "@`S6h:2", "0kd? w?_\u0007F|p", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpIYJ7_VpK]\u007f]\nY+bH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~zt\f>\u001aF}\u0016yA6>", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BlurKt {
    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3813blur1fqSgw$default(Modifier modifier, float f2, float f3, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3816boximpl(BlurredEdgeTreatment.Companion.m3823getRectangleGoahg());
        }
        return m3812blur1fqSgw(modifier, f2, f3, blurredEdgeTreatment.m3822unboximpl());
    }

    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m3812blur1fqSgw(Modifier modifier, final float f2, final float f3, final Shape shape) {
        final int iM4552getDecal3opZhB0;
        final boolean z2;
        if (shape != null) {
            iM4552getDecal3opZhB0 = TileMode.Companion.m4551getClamp3opZhB0();
            z2 = true;
        } else {
            iM4552getDecal3opZhB0 = TileMode.Companion.m4552getDecal3opZhB0();
            z2 = false;
        }
        float f4 = 0;
        return ((Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl(f4)) <= 0 || Dp.m6637compareTo0680j_4(f3, Dp.m6638constructorimpl(f4)) <= 0) && !z2) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float f5 = graphicsLayerScope.mo710toPx0680j_4(f2);
                float f6 = graphicsLayerScope.mo710toPx0680j_4(f3);
                graphicsLayerScope.setRenderEffect((f5 <= 0.0f || f6 <= 0.0f) ? null : RenderEffectKt.m4486BlurEffect3YTHUZs(f5, f6, iM4552getDecal3opZhB0));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z2);
            }
        });
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3815blurF8QBwvs$default(Modifier modifier, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3816boximpl(BlurredEdgeTreatment.Companion.m3823getRectangleGoahg());
        }
        return m3814blurF8QBwvs(modifier, f2, blurredEdgeTreatment.m3822unboximpl());
    }

    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m3814blurF8QBwvs(Modifier modifier, float f2, Shape shape) {
        return m3812blur1fqSgw(modifier, f2, f2, shape);
    }
}
