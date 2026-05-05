package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001ew\u007fLDyt\fǻ\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u000442`,ڎK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,QU~^\u001a\u000fHBw?9Nw=O`|Ȃ\r H\"@ц\r\u00010*PƵ~zYK\u0014۵8@~CZ҈U\u0005(\u0018\u000ē(\u0001,zoNLHt]P/+ɅqBd'g0\u0003M\u0015Fb3\u0015vg\u001f3@M5\u001d%Y\u0004\u001fdiΪ\u001b? <-hU'[M\u0002XNX.\u0016[+gqku>\\3P\t\fU/\u007fgYQ&(&|,\u0011J\t&\u0006UN^3 f\u0016\u0015Kt![pV\b^P\t\u0013ad!U\b9+G&~Sw:GZg\u0004\u000b\r,0\u0019p7Z\u0003\u001c\u0011\u001d!T\u0006`ISV<v^:_Cm\u0012\u0002z\u0002X\u0016ϻFĉ\u009e\u007f\u00134*3Ks 1$\u0004\u0002vC\u0010v3d\u0019WwS`@PpF=0\t\u001ao\\d3\u0002\u0001Z^,\u001fT4T5\u00068\u0019&\\\u0006E9%>X\u007fpoj[h\"'Eeee\u001fs\u0014WGkK7gb>o\u0003~\u001a?Jq\u001dZ|A\u0002\u001c\u000bb.\"@Y\u0003\u0010&\u000eϢMۼƱ6Aw3BDIǊ[#K\u001b\u001ep@%\t\u000e^\u0019\u0014\rmK$1\u0004Tx\u0017\u001ch\\\u001f\f\u0018~O,\u000bg:-oYe\u001f,U0\u0006L|Q%/y\u0006Guk_L\u001b6&[\u0002 $;QQ]_C\u0015\u0005)@%EEz\u0017\u0016cS\u00125 \u0015\u0006\u001fCx4w\nzpZ\t\u0019q}zG(|^\u0001L d.$\u0012L\u0001Gqe#[l[ϸ\u0002ʛ\u0084R:\u00030-J=i}%\u00155[BO\u001dD{D3#zui\u001eH*f\u001dA\re2Y\u0014\u001cub_dJ;fQ\n\u0005D\"2\n\u001bBv\t(\u000eH\tB,KHo\u0005!\\>M\u0019P\u0016f5N=v\\[H6\b}bR\u00100yC\f=vCS;}Ymm{\\t\u000bx!ё\n֊ϥr\u0014\"k.\u0006o\u0007\u0017`\u001esFgi;\u0011\tl\r2]D<65sXw\r(z.N&\u000fƘ1߿Ǡ?X\u0014\u0007\u0007\u0010ƊH\nhHfՂF/}ܙ7R"}, d2 = {"1kX=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0004u]B\u0015d6[~|", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "2qPDG,Qb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/k_5T", "", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPDG,Qb`ek_\u000fv|\u001f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhv,\\\u0011\"d\u0015\u0016&\u001d\"j~R]\u001f\u001d`\u0011~@6rJXrCEKMm4r\f)-`\u0004<1\u0010|\u001c\u001ff^wf\tc\u001fu(^HNC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[4ep6w1\u0002Bs$g\u0001Jq*\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wx#+\u0017\u000euDz'tyjHXu]*j\u0014a]\u000bDN\u0015BSxj\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001c\u0001Hka\u001e~\u000ei\u001c\u001a<_<f\u000bz8]AX\u0013RGE\b\u000eGR)wHeQ\u000fc", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPDG,Qb`}M&9\u0012n9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhv,\\\u0011\"d\u0015\u0016&\u001d\"j~R]\u001f\u001d^yV(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]s&\u0017sS2\b\n\u001d~uNxqy\u001d\u007fvA#Kw_EX9SF|2)Y{A\"6\"\u0004+\b<MB9Jk\u0005\u0015V\u0018QmW\u0015*fN#5:F\u001c\u00152_~kK\u0018l\u001etQ\fl=<#se-X\u0013P_$W@dc~E\u001c\u0005KE\u0002#%P\nB%X\"\u0005\u0019\u0012|yPCp8D\u000b", "BdgA@,:a)\fzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001dYy.Gz\u0016;#", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2qPDG,Qb`c[a\tIn}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhv,\\\u0011#h|\u001a&\u001b5wF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u0004\u007f\u001dz#*d_.\tib\u001ev[{=L.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vr4=ER\u0014_n\u0018\u0014Bmx\u0013a=8\"\u007fL\"CR-\\pL\u001d>\u0004EK~", "", "2qPDG,Qb`meP\nZ\u0018\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhv,\\\u0011#h|\u001a&\u001b5wF)[\fXu^|=2j\u0010Gn\u0007KJG8\u000fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d!v\u001c\tgzVbi87M[jZLo+ i\u000b\u0004/?h", "BdgA?(R])\u000eXh5\u000b\u0018<a\u00041\u000bN", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "BdgA?(R])\u000eXh5\u000b\u0018<a\u00041\u000bNH(\u0011YB\u001d\u001bt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023[j,", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextPainterKt {
    /* JADX INFO: renamed from: drawText-JFhB2K4$default, reason: not valid java name */
    public static /* synthetic */ void m6103drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j2, TextStyle textStyle, int i2, boolean z2, int i3, List list, long j3, int i4, int i5, Object obj) {
        if ((4 & i5) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((8 & i5) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            i2 = TextOverflow.Companion.m6576getClipgIe3tQ8();
        }
        if ((32 & i5) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 64)) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 128)) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i5 + 256) - (256 | i5) != 0) {
            j3 = Size.Companion.m4014getUnspecifiedNHjbRc();
        }
        if ((i5 & 512) != 0) {
            i4 = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m6102drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, j2, textStyle, i2, z2, i3, list, j3, i4);
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m6102drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j2, TextStyle textStyle, int i2, boolean z2, int i3, List<AnnotatedString.Range<Placeholder>> list, long j3, int i4) {
        TextLayoutResult textLayoutResultM6099measurexDpz5zY$default = TextMeasurer.m6099measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i2, z2, i3, list, m6110textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
            clip(transform, textLayoutResultM6099measurexDpz5zY$default);
            MultiParagraph.m5985paintLG529CI$default(textLayoutResultM6099measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i4, 30, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM$default, reason: not valid java name */
    public static /* synthetic */ void m6107drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j2, TextStyle textStyle, int i2, boolean z2, int i3, long j3, int i4, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            i2 = TextOverflow.Companion.m6576getClipgIe3tQ8();
        }
        if ((i5 + 32) - (32 | i5) != 0) {
            z2 = true;
        }
        if ((i5 + 64) - (64 | i5) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i5 + 128) - (128 | i5) != 0) {
            j3 = Size.Companion.m4014getUnspecifiedNHjbRc();
        }
        if ((i5 & 256) != 0) {
            i4 = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m6106drawTextTPWCCtM(drawScope, textMeasurer, str, j2, textStyle, i2, z2, i3, j3, i4);
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m6106drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j2, TextStyle textStyle, int i2, boolean z2, int i3, long j3, int i4) {
        TextLayoutResult textLayoutResultM6099measurexDpz5zY$default = TextMeasurer.m6099measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i2, z2, i3, null, m6110textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
            clip(transform, textLayoutResultM6099measurexDpz5zY$default);
            MultiParagraph.m5985paintLG529CI$default(textLayoutResultM6099measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i4, 30, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo$default, reason: not valid java name */
    public static /* synthetic */ void m6109drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j2, long j3, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        long jM4214getUnspecified0d7_KjU = j2;
        TextDecoration textDecoration2 = textDecoration;
        float f3 = f2;
        long jM3953getZeroF1C5BW0 = j3;
        Shadow shadow2 = shadow;
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 16) != 0) {
            shadow2 = null;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            textDecoration2 = null;
        }
        DrawStyle drawStyle2 = (i3 + 64) - (i3 | 64) == 0 ? drawStyle : null;
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m6108drawTextd8rzKo(drawScope, textLayoutResult, jM4214getUnspecified0d7_KjU, jM3953getZeroF1C5BW0, f3, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m6108drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j2, long j3, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        float alpha = f2;
        DrawStyle drawStyle2 = drawStyle;
        TextDecoration textDecoration2 = textDecoration;
        long jM6153getColor0d7_KjU = j2;
        Shadow shadow2 = shadow;
        if (shadow2 == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        }
        if (textDecoration2 == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        }
        if (drawStyle2 == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush != null && jM6153getColor0d7_KjU == 16) {
                MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(alpha)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                }
                multiParagraph.m5994painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i2);
            } else {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (jM6153getColor0d7_KjU == 16) {
                    jM6153getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m6153getColor0d7_KjU();
                }
                multiParagraph2.m5992paintLG529CI(canvas2, TextDrawStyleKt.m6547modulateDxMtmZc(jM6153getColor0d7_KjU, alpha), shadow2, textDecoration2, drawStyle2, i2);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU$default, reason: not valid java name */
    public static /* synthetic */ void m6105drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j2, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        Shadow shadow2 = shadow;
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        float f3 = f2;
        TextDecoration textDecoration2 = textDecoration;
        long jM3953getZeroF1C5BW0 = j2;
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 16) != 0) {
            shadow2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            textDecoration2 = null;
        }
        DrawStyle drawStyle2 = (i3 & 64) == 0 ? drawStyle : null;
        if ((i3 & 128) != 0) {
            iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        m6104drawTextLVfH_YU(drawScope, textLayoutResult, brush, jM3953getZeroF1C5BW0, f3, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m6104drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j2, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        TextDecoration textDecoration2 = textDecoration;
        float alpha = f2;
        DrawStyle drawStyle2 = drawStyle;
        Shadow shadow2 = shadow;
        if (shadow2 == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        }
        if (textDecoration2 == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        }
        if (drawStyle2 == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
            clip(transform, textLayoutResult);
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            if (Float.isNaN(alpha)) {
                alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
            }
            multiParagraph.m5994painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i2);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m6569equalsimpl0(textLayoutResult.getLayoutInput().m6092getOverflowgIe3tQ8(), TextOverflow.Companion.m6578getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m4791clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g()), 0, 16, null);
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m6110textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j2, long j3) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m4006getWidthimpl(j2))) {
            iRound2 = Math.round((float) Math.ceil(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - Offset.m3937getXimpl(j3)));
            iRound = 0;
        } else {
            iRound = Math.round((float) Math.ceil(Size.m4006getWidthimpl(j2)));
            iRound2 = iRound;
        }
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m4003getHeightimpl(j2))) {
            iRound3 = Math.round((float) Math.ceil(Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) - Offset.m3938getYimpl(j3)));
        } else {
            iRound4 = Math.round((float) Math.ceil(Size.m4003getHeightimpl(j2)));
            iRound3 = iRound4;
        }
        return ConstraintsKt.Constraints(iRound, iRound2, iRound4, iRound3);
    }
}
