package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\r\"4\u0012\u000e\u0007nʑA0RjP.X[2\u000f\u0002{<řc$\bCC٥\"}0\u0012WNmhvJp\u000bK\u000f\f\u0017\u0001jBI]xc\u0014\u00172XoG3SqU\\nҚN\u0005N1J8(\u00041/8H(\b\u000bE[\f@2PrJR;P3\u001bŪ\n>&\u0005da\u007f߇5VǍu:]\"+ipMWe6|[\u0012^TU\u0013'g$+N>M\u0015SY3\rX[M\u000bWqk\u000b\u0019--+W|o6\u0007\u0006D\u001b1O\u001bg\u000b&\u000b\u000b\u0002f\u0012'9Z{K~\u0014X}\u0001{\u001bH\u001c\u000e4-x43\u001at\u0015&3#x\u0004FV\u0002lP\u0018z\u0010<G+\u000639H3f\u007fgk\u001fT7\n\u0015%\u001eQ\u0012\u001f'aT\u001cr-\u001b\u0003\u000b\u00027W@K\\f\n\bR4\tψạò\b2M\u0016=\u0013)ѩ\u00163ڛs9Q \u0014\u0002vC\u0018|\u000b`vX\u0002RvFRt\u001c78\u0010$Zrj5qVTf4)MJZ7\u0004\u000e\u0013.e\u0010<O+@TUhwte]8+_l=Y|v&Wgdc;Wc\u001emjvBElh\u000bXtOk\f\tbX(8Hx\u001e\u0010{rT<\u00198?\u007f+L,_\u001f\r\u001bN\u0003,RY|7p\u000bn\u0016~bE<\u0003\u00187%\u000f\u0007Pj\u0005\bg'^\\\u0005f\";Yi7/%\u0004;/9ţ\"Ȕҋw\u0002M\u0002Zbd̷\u0015\u0004ɝ\u0014 D\u0019aQ]<C\u0015\u0005)@\u0007EEzx\u0016WS\u00125\u0002\u0015y=A\u00194m\bxxD`\u0019P\u007fZ\u001d\"\u0005g\u000b#6j0\u007fgF\tQ{T9anOx\u0003gGf8+\u000bO$+\u0001}.\u00155[IW#\u001cw\"<-a\fo 4\u007fb\u001d4\re22\u0014\u001cub_lJ;fO\n\u0005D\"2|\u001bBv{(\u000eH\tB\u001fKHow!\\>M\u0019C\u0016f5A=x\\[H+\b\u007fJ-\u000eC$I\u0004\u0014l_=\u0011{p\u0018ssKj)b\u000f8(B6£\u0011Βݞ$X]\u0002\u0017P\u001e\u05cf\u0017D\u05cdSb3;1$b+l\u000e\u0011Cbn\u001e\u0010)\u0006ve\u0015\u0017@I\f;\u0005\u0014\u0005~bVV\rxE\u000f'Z\u0007\u0005\u000fA'\u00115_\u000b\u001eLZ/q<\u0019SK\u000fKpU~t0CD\u0003?K.^\u0001\u0019QuCw\bf\nM){x\b\ff\u001e-#H\u0018)Gi\u0011\u000e|`d\u0011Ur]|v@l\u0003T()\r\u000b\u0015\u000ej\u001b?\u0011\u001fO\u0001\u0002z-za(=I\u001a\u000f+\\)5!-kL\u001b;\u001eM/SH\u0019-W\u0002]SI\u001a  ND4z'\\e,~\n\f8j\u001cw\u0016p#!\u0013~BJ3ٶsҚ˹2\n<r\u0010W\u001a\u001dl~\u0004wO?O+\u001b\u0005\tPИx\u000fkoi߽q9\u0002Ј5|"}, d2 = {"5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AbP9X\u001f", "", "AbP9X ", "/k_5T", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "@nc.g0H\\\f", "@nc.g0H\\\r", "@nc.g0H\\\u000e", "1`\\2e(\u001dW'\u000evg*|", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1kX=", "", "5qP=[0<a\u007fz\u000f^9D\u0017\u0015Fs\"g ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u0018Nv\u000f.$\u001cP\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0012q@B\u001f]!\rh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010AixKBIb7:", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "5qP=[0<a\u007fz\u000f^9DU\"nQ$\n$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u0018Nv\u000f.$\u001cP\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0012q@B\u001f]!0}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2Hf[\u0005JECpsQ\fh\u001c\\G\u001a%\u0015q\u0017*>\u0014\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9=Fs+ O{\u0005g", "/lQ6X5MA\u001czyh>Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5qP=[0<a\u007fz\u000f^9D\u0014\u000bNkzmB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u0018Nv\u000f.$\u001cP\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0012q@B\u001f]!0}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2Hf[\u0005JECpsQ\fh\u001c\\G\u001a%\u0015q\u0017*>5\u0013MbO\u001aq_\u0004kfZbxB,IwiF\u000f\u007fY\u0006\\1\u001eO|{\u0012?.", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "5qP=[0<a\u007fz\u000f^9Dd:8}\u0019],", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u0018Nv\u000f.$\u001cP\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0012q@B\u001f]!0}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2Hf[\u0005JECpsQ\fh\u001c\\G\u001a%\u0015q\u0017*>5\u0013m?:\r{Q\u0007qkF,D6.FxeTE9e@>\u000f)J\u007fx\u00162eJ", "Bn^9\\5@5&z\u0006a0z\u0017\u0016a\u0014(\t", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsLayerModifierKt {
    /* JADX INFO: renamed from: graphicsLayer-sKFY_QE$default */
    public static /* synthetic */ Modifier m4343graphicsLayersKFY_QE$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, int i2, Object obj) {
        float f12 = f2;
        Shape rectangleShape = shape;
        float f13 = f11;
        boolean z3 = z2;
        float f14 = f6;
        float f15 = f9;
        long jM4569getCenterSzJe1aQ = j2;
        float f16 = f8;
        float f17 = f7;
        float f18 = f3;
        float f19 = f5;
        if ((i2 + 1) - (i2 | 1) != 0) {
            f12 = 1.0f;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f18 = 1.0f;
        }
        float f20 = (-1) - (((-1) - i2) | ((-1) - 4)) == 0 ? f4 : 1.0f;
        if ((i2 + 8) - (i2 | 8) != 0) {
            f19 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            f14 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            f17 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f16 = 0.0f;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            f15 = 0.0f;
        }
        float f21 = (-1) - (((-1) - i2) | ((-1) - 256)) == 0 ? f10 : 0.0f;
        if ((i2 + 512) - (i2 | 512) != 0) {
            f13 = 8.0f;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            jM4569getCenterSzJe1aQ = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            z3 = false;
        }
        return m4342graphicsLayersKFY_QE(modifier, f12, f18, f20, f19, f14, f17, f16, f15, f21, f13, jM4569getCenterSzJe1aQ, rectangleShape, z3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010\u001c>OlT\u0012*\u0018T\rk{X.~Vu8&k[rUbimL\u0006\u001fAy!f`\u00031fIG%09 \u0010L&)!|9\u0005\u0007K\u007f8.L\u000b\u0001q'\u001a;I\u001eC:T6)5b\u0007zV+z\u000b252E\"'\f )\u0010Ke", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: graphicsLayer-sKFY_QE */
    public static final /* synthetic */ Modifier m4342graphicsLayersKFY_QE(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2) {
        return m4339graphicsLayerAp8cVGQ$default(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, null, 0L, 0L, 0, 114688, null);
    }

    /* JADX INFO: renamed from: graphicsLayer-2Xn7asI$default */
    public static /* synthetic */ Modifier m4337graphicsLayer2Xn7asI$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, int i2, Object obj) {
        RenderEffect renderEffect2 = renderEffect;
        float f12 = f2;
        float f13 = f8;
        float f14 = f11;
        boolean z3 = z2;
        Shape rectangleShape = shape;
        float f15 = f7;
        float f16 = f6;
        long jM4569getCenterSzJe1aQ = j2;
        float f17 = f5;
        float f18 = f3;
        float f19 = f9;
        if ((i2 & 1) != 0) {
            f12 = 1.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f18 = 1.0f;
        }
        float f20 = (i2 & 4) == 0 ? f4 : 1.0f;
        if ((i2 & 8) != 0) {
            f17 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            f16 = 0.0f;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            f15 = 0.0f;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            f13 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            f19 = 0.0f;
        }
        float f21 = (i2 & 256) == 0 ? f10 : 0.0f;
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            f14 = 8.0f;
        }
        if ((i2 & 1024) != 0) {
            jM4569getCenterSzJe1aQ = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        if ((i2 & 2048) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            z3 = false;
        }
        if ((i2 & 8192) != 0) {
            renderEffect2 = null;
        }
        return m4336graphicsLayer2Xn7asI(modifier, f12, f18, f20, f17, f16, f15, f13, f19, f21, f14, jM4569getCenterSzJe1aQ, rectangleShape, z3, renderEffect2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010\u001c>OlT\u0012*\u0018T\rk{X.~Vu8&k[rUbimL\u00061;;\u0016ec9%gTJw}D\u0013\u001eH!I/{F\u0015", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: graphicsLayer-2Xn7asI */
    public static final /* synthetic */ Modifier m4336graphicsLayer2Xn7asI(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect) {
        return m4338graphicsLayerAp8cVGQ(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m4267getAutoNrFUSI());
    }

    /* JADX INFO: renamed from: graphicsLayer-pANQ8Wg$default */
    public static /* synthetic */ Modifier m4341graphicsLayerpANQ8Wg$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, Object obj) {
        long defaultShadowColor = j4;
        float f12 = f5;
        float f13 = f8;
        boolean z3 = z2;
        long jM4569getCenterSzJe1aQ = j2;
        float f14 = f9;
        long defaultShadowColor2 = j3;
        Shape rectangleShape = shape;
        float f15 = f3;
        float f16 = f7;
        RenderEffect renderEffect2 = renderEffect;
        float f17 = f6;
        float f18 = f11;
        float f19 = f2;
        if ((i2 + 1) - (i2 | 1) != 0) {
            f19 = 1.0f;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f15 = 1.0f;
        }
        float f20 = (i2 + 4) - (i2 | 4) == 0 ? f4 : 1.0f;
        if ((i2 + 8) - (i2 | 8) != 0) {
            f12 = 0.0f;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            f17 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            f16 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f13 = 0.0f;
        }
        if ((i2 & 128) != 0) {
            f14 = 0.0f;
        }
        float f21 = (i2 + 256) - (i2 | 256) == 0 ? f10 : 0.0f;
        if ((i2 & 512) != 0) {
            f18 = 8.0f;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            jM4569getCenterSzJe1aQ = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            z3 = false;
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            renderEffect2 = null;
        }
        if ((i2 & 16384) != 0) {
            defaultShadowColor2 = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32768)) != 0) {
            defaultShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        return m4340graphicsLayerpANQ8Wg(modifier, f19, f15, f20, f12, f17, f16, f13, f14, f21, f18, jM4569getCenterSzJe1aQ, rectangleShape, z3, renderEffect2, defaultShadowColor2, defaultShadowColor);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010\u001c>OlT\u0012*\u0018T\rk{X.~Vu8&k[rUbimL\u0006\u001fr=!c\\\t5a\\DsEs% Y\u0015X }M", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: graphicsLayer-pANQ8Wg */
    public static final /* synthetic */ Modifier m4340graphicsLayerpANQ8Wg(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4) {
        return m4338graphicsLayerAp8cVGQ(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, CompositingStrategy.Companion.m4267getAutoNrFUSI());
    }

    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ$default */
    public static /* synthetic */ Modifier m4339graphicsLayerAp8cVGQ$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, int i3, Object obj) {
        int iM4267getAutoNrFUSI = i2;
        long defaultShadowColor = j4;
        long defaultShadowColor2 = j3;
        RenderEffect renderEffect2 = renderEffect;
        boolean z3 = z2;
        long jM4569getCenterSzJe1aQ = j2;
        float f12 = f11;
        Shape rectangleShape = shape;
        float f13 = f2;
        float f14 = f5;
        float f15 = f8;
        float f16 = f9;
        float f17 = f6;
        float f18 = f3;
        float f19 = f7;
        if ((i3 + 1) - (i3 | 1) != 0) {
            f13 = 1.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f18 = 1.0f;
        }
        float f20 = (i3 & 4) == 0 ? f4 : 1.0f;
        if ((i3 + 8) - (i3 | 8) != 0) {
            f14 = 0.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            f17 = 0.0f;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            f19 = 0.0f;
        }
        if ((i3 & 64) != 0) {
            f15 = 0.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            f16 = 0.0f;
        }
        float f21 = (i3 + 256) - (i3 | 256) == 0 ? f10 : 0.0f;
        if ((i3 + 512) - (i3 | 512) != 0) {
            f12 = 8.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1024)) != 0) {
            jM4569getCenterSzJe1aQ = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2048)) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((i3 & 4096) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8192)) != 0) {
            renderEffect2 = null;
        }
        if ((i3 & 16384) != 0) {
            defaultShadowColor2 = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32768)) != 0) {
            defaultShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 65536)) != 0) {
            iM4267getAutoNrFUSI = CompositingStrategy.Companion.m4267getAutoNrFUSI();
        }
        return m4338graphicsLayerAp8cVGQ(modifier, f13, f18, f20, f14, f17, f19, f15, f16, f21, f12, jM4569getCenterSzJe1aQ, rectangleShape, z3, renderEffect2, defaultShadowColor2, defaultShadowColor, iM4267getAutoNrFUSI);
    }

    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ */
    public static final Modifier m4338graphicsLayerAp8cVGQ(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        return modifier.then(new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2, null));
    }

    public static final Modifier graphicsLayer(Modifier modifier, Function1<? super GraphicsLayerScope, Unit> function1) {
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m4339graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
