package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidMultiParagraphDraw.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG5L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtMrgQƤ\u001e\u0016'iTI\u0004x\u000e\u0016\u001d3Zom5}sK<xtd\tP8(8\b\n\u0019\u001aXN@~\u0001CY\u0013*2VohZ=U\u000b\u001a \u000fV\"\u0017\u001d\u000bq~>NlkEG%\u0019hpZWe6|[\u001a^TU\u001b=ѭՕ*¨˝9\u0017+b\u0011\u0017j.M\u0014Wqk\u0004\u0011'U+ywe7p\u007fB\u0017[S\u001b`\u000b&\u000b\t\u0002d\u001a,CO\u0012Q\u0001\u00146~\u0013}#;2\u00166-V7E\u001c|\u0007<=%xaKh\u0004tA.\u0007\u0012:%2\u00183YGafј`ݢϭR9\u0002\u0017\u001b.Ń\u0001s)^Z\u05f7|C\u001aǁ{d"}, d2 = {"2qPD@<Eb\u001divk(~\u0016+p\u0003", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "2dR<e(MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPD@<Eb\u001divk(~\u0016+p\u0003oM\u001cs\u0015\u000bAS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0002jMH\u001b\u0016\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2Hf[\u0005JECpsA\u0019o+_\u0010\u001b\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002&KifIImc\u0006b*\u001bJ\u0006\ng\u0019T}*\u00027\b3=\u007fb\u000fSr\"L^B%0&P'9E\u0006!N_ju6-\u000e{.@\b\flB-(iol\u001eu\u0003f\u0016h?e^\u0014\u0001P\u0010FTy#'\u0010\u000fF%{\"\u0005\u0012'qcW\r\u001aa|,~B,j\u0011Las\u0014.\u001c%Q`\u000f>\u000e#(", "2qPDC(KO\u001b\fvi/\u000b", "2qPDC(KO\u001b\fvi/\u000bP\u0001Ar&o:d", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidMultiParagraphDraw_androidKt {
    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m6377drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1 || (brush instanceof SolidColor)) {
            m6379drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i3);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderMo4147createShaderuvyYCjk = ((ShaderBrush) brush).mo4147createShaderuvyYCjk(SizeKt.Size(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo4147createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i4);
                paragraphInfo2.getParagraph().mo5961painthn5TExg(canvas, BrushKt.ShaderBrush(shaderMo4147createShaderuvyYCjk), f2, shadow, textDecoration, drawStyle, i2);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderMo4147createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m6378drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        int iM4120getSrcOver0nO6VwU = i2;
        float f3 = f2;
        Shadow shadow2 = shadow;
        TextDecoration textDecoration2 = textDecoration;
        if ((i3 & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            shadow2 = null;
        }
        if ((i3 & 16) != 0) {
            textDecoration2 = null;
        }
        DrawStyle drawStyle2 = (i3 & 32) == 0 ? drawStyle : null;
        if ((i3 & 64) != 0) {
            iM4120getSrcOver0nO6VwU = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        }
        m6377drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f3, shadow2, textDecoration2, drawStyle2, iM4120getSrcOver0nO6VwU);
    }

    /* JADX INFO: renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m6379drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i3);
            paragraphInfo.getParagraph().mo5961painthn5TExg(canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
