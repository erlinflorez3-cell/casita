package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\f6B\r(4\u0012}\bnjO0LeN.ZS@\u000fs{J$cҕyCQU\"}(\tWNuvvJp\u000bK\u000f\f\u001c\u0001j:R]xs\u0012\u00172HoWN[rU9\u000fuf\t.6:8(\n1\u001e8N(v)H\u0012Èܘ4@~Aj\u001b[\r2\u00124GP\u0005,f\u007fNdM3җR`1\u000e\u0002Dd&\u000e<%M;S\u0005+\u001b\u0005y\u001eYOg9#5k\u00035[\fK\u0011P\nE\u0015j7'Y\\\nVdjF\u0014Ʀ/O\u001bq\u000b;j\u001ai`:(SUsM`\u000eV\u000b)\u000eS<Ǭ\u0012\u00065^FD(} \u0016Cv\u0003Snc\u0018]p\u0012#ad$k\u007fĴ/9)~ipI2f7*\u00065\u001eQ\u000e5!ƟX\u000en/3f\u0006lIQnYpN8vmq\u0012\u000fz\u0002X\tvϚ ;\n߾F\u0017S62ހ%\u074co\u0002Pֳ\b\u0005\u0013`\u0001S\u0018S\u001fؚ$å\u001a92\t\u001a\\֎h$"}, d2 = {"!gP?X+-S,\u000eVg+\n\u00133d]$\u0005Q|%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=)L:x>\"\u0014F]B\u0018_:$", "(da<I,Kb\u001d|ve\u0017x\b.i\t*", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i(m#=QA7r\u001f\u001a\u0014geB\tq\u0002", "\u0018", "$daA\\*:Z\u0004zy]0\u0006\u000b=", "Bn_\u001dT+=W\"\u0001", "", "0ncAb4)O\u0018}~g.", "uH8u=", "5dc!X?M2\u001d\fz\\;\u0001\u00138H\u007f8\tD\u000f&\u001bE", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "BdgA70KS\u0017\u000e~h5_\t?r\u00046\u000bD~", "5dc\u0019T:M:\u001d\bzF,\f\u00163c\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", "BdgAC(B\\(", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "4qP:X>H`\u001fmzq;[\r<", ":h]2;,BU\u001c\u000ehi(\u0006\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iE|*5M\r\"o=\u001ewhe;\nr\u001a]\u000b.G:Y(e(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001\\\u0016A\\*7\u007f>.$>H5\u0010b9Xz&\u0011[N?k\u001ca='!E\nR4\u001cZ@=-mQA#\u0007uX\u0002NwJz\u0016!DItOV\u000eV}\u001f~$)xS]m\tK?\u001bX\u0011`\u0015^*f>97]o##sZ<\nEc\u0015<ayzv\u0011\u0015\u000471HqZ\u0010S~iCtp\u0006O\u0005wt2\\v.\u0004\u001b\u0013H16R\u0010Gpm\u0002Et\u001e+iK+%\u007f> ;VfyjLWS\u001be\u0011\u001d!\u0016;\"tMcW\u001c\u000b[%?>p5", "5dc\u0019\\5>6\u0019\u0003|a;g\u0005.d\u00041}N", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67$=aJ;5\u001b\"\u001ehD9\u000be/]d6[SN\u001agN{\u0013Wv", "5dc\u0019\\5>6\u0019\u0003|a;j\u0014+n\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001\\\u0016A\\*7\u007f>.$>%/m_5M\u00041KKauZ\\zH\u001e ZW^/V\u0014YT38@@\u001e\u00156M\u0001\u0005v\u0010 \u001d\u000e~QtKVrG}\u0017xP\u0017wZ`_gR=N8", "5dc#X9MW\u0017z\u0002I({\b3n\u00026", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001\\\u0016A\\*7\u007f>.$>%\u001e", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", "", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b\u0016", ":h]2<5=S,", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayout_androidKt {
    private static final TextAndroidCanvas SharedTextAndroidCanvas = new TextAndroidCanvas();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i2) {
        if (i2 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i2 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i2 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i2 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i2 == 4) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (i2 == 5) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final long VerticalPaddings(int i2, int i3) {
        long j2 = ((long) i2) << 32;
        long j3 = (-1) - (((-1) - ((long) i3)) | ((-1) - 4294967295L));
        return VerticalPaddings.m6172constructorimpl((j3 + j2) - (j3 & j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            return ZeroVerticalPadding;
        }
        TextPaint paint = textLayout.getLayout().getPaint();
        CharSequence text = textLayout.getLayout().getText();
        Rect charSequenceBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        if (charSequenceBounds.top < lineAscent) {
            topPadding = lineAscent - charSequenceBounds.top;
        } else {
            topPadding = textLayout.getLayout().getTopPadding();
        }
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        if (charSequenceBounds.bottom > lineDescent) {
            bottomPadding = charSequenceBounds.bottom - lineDescent;
        } else {
            bottomPadding = textLayout.getLayout().getBottomPadding();
        }
        return (topPadding == 0 && bottomPadding == 0) ? ZeroVerticalPadding : VerticalPaddings(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? ZeroVerticalPadding : VerticalPaddings(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount) && lineHeightStyleSpanArr != null && lineHeightStyleSpanArr.length != 0) {
            SpannableString spannableString = new SpannableString("\u200b");
            LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) ArraysKt.first(lineHeightStyleSpanArr);
            spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, spannableString.length(), (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
            StaticLayout staticLayoutCreate$default = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout.getIncludePadding(), textLayout.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 2072512, null);
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            fontMetricsInt.ascent = staticLayoutCreate$default.getLineAscent(0);
            fontMetricsInt.descent = staticLayoutCreate$default.getLineDescent(0);
            fontMetricsInt.top = staticLayoutCreate$default.getLineTop(0);
            fontMetricsInt.bottom = staticLayoutCreate$default.getLineBottom(0);
            return fontMetricsInt;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!SpannedExtensions_androidKt.hasSpan((Spanned) text, LineHeightStyleSpan.class) && textLayout.getText().length() > 0) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (LineHeightStyleSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
    }

    public static final boolean isLineEllipsized(Layout layout, int i2) {
        return layout.getEllipsisCount(i2) > 0;
    }
}
