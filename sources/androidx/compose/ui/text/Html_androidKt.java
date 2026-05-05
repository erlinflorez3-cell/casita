package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.text.HtmlCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.xml.sax.XMLReader;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: Html.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яk\u001d̉=!,u\bDJc|\u0004G\u00078\u000bDB\u0007\"2\u0012\u007f\u0007tjA0ZeP\u008cZS8şsڔ<$i*yCAU\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG3SpE9vt>\u000562*\u0600\u0002\u0005\u0017\u001a2H&v\u0003Ca\f\u001aؓho<j\u001f[\t2\u0014\u001c=N\u0006NbuTNJ\u0003\\h.i\u0003\u0002x\\.w0+U5F\u00030=zo(C@e@E)a\u000f\u001fR\nL3C\u007fK\u001dhU4[O\u0002fNZ\u0016\u0013C;\u007f\u0013k\u0004>^\u001bP\u000f\u001em+g\nYc&(&\u0003$\rj\r>\n5\\F-H{8\u0014A\u0004\u000bUVO0nr\u0006\trN\u0019;~a=\u007f\u001b~yoQ1Ne\u0013-\rL;1r/tl\u000e\u000f\u0014K\\}Q?`X?^M8imu\npp\u0013B\u0006FF.A\u00143<1=7\nPK!\u001a\u0017xLmv\u0013o\u0001U\u007fQvPRv\u001c78\u001a$\\Zc3}\u0017Sp6\u001fh4T5\u001a0\u0013Ny><91\u001elgj\u007fi{|2%]\u0007}Y\u0007u\u001cuQ^aTyc>\u0003\u0019v4KJϵ\u001dX\u0015A*ۑ-څ,\":ʋ\u000b\u001c\u0006{\\N:\u0012\tŰDʬ8,9ǉ|#V\u00046Bo~_ݣ\\ӳ\u0014\u0001\\32\u0006Ȗ(\u0017"}, d2 = {"\u000fm]<g(MW#\biZ.", "", "\u0011n]AX5M6\u0015\bye,\nu/p\u0007$y@\t\u0017 V^\n>", "\"`V\u0015T5=Z\u0019\f", "/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EO\u0001*&\u0011R\u001dD}\u001f1b|-Aq\u0015\u0014\\\u0002*g6\u0001\u0011q`@\u0007pj\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9pK~,/U\u0007\u001fDw\u001a-3RyZ0 wdj8\u000ec9\rB|", "=oc6b5:Zy\t\u0004m\rx\u00113l\u0014\t\tJ\t\u007f\u0013Oo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4`\\6_@'O!~", "/cS c(G", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0011.\u0019o`9\u00149", "AoP;", "", "AsP?g", "", "3mS", ":h]8F;RZ\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001c]\u0007&%|*5MQ\u0011", ":h]8<5MS&zxm0\u0007\u0012\u0016i\u000e7{I\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0019b\r Di\u0014=QMDR8,$hj9\u00149", "/cS c(Ga", "AoP;a,=", "\u001a`]1e6BRb\u000ezq;Fv:a\t1{?V", "4q^:;;FZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*\u0012(\u001ds]B\u000bm5$", "6s\\9F;KW\"\u0001", "Bn0;a6MO(~yL;\n\r8g", "Bn?.e(@`\u0015\n}L;\u0011\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E\u001c\b\u001b\u0019Pw\u000eE\u0006\u0013@U\u0007u", "BnB=T5,b-\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E.\u0010+\u001eG]\u00198\u007fz", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E/\u0015\"\u0017Hk\f<d01bS", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Html_androidKt {
    private static final String AnnotationTag = "annotation";
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";
    private static final Html_androidKt$TagHandler$1 TagHandler = new Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z2, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z2 || !Intrinsics.areEqual(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
        }
    };

    /* JADX INFO: compiled from: Html.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            textLinkStyles = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    public static final AnnotatedString fromHtml(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(HtmlCompat.fromHtml("<ContentHandlerReplacementTag />" + str, 63, null, TagHandler), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textLinkStyles = null;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    public static final AnnotatedString toAnnotatedString(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder builderAppend = new AnnotatedString.Builder(spanned.length()).append((CharSequence) spanned);
        addSpans(builderAppend, spanned, textLinkStyles, linkInteractionListener);
        return builderAppend.toAnnotatedString();
    }

    private static final void addSpans(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.getLength(), Object.class)) {
            long jTextRange = TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(builder, obj, TextRange.m6123getStartimpl(jTextRange), TextRange.m6118getEndimpl(jTextRange), textLinkStyles, linkInteractionListener);
        }
    }

    private static final void addSpan(AnnotatedString.Builder builder, Object obj, int i2, int i3, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        if (!(obj instanceof AbsoluteSizeSpan)) {
            if (obj instanceof AlignmentSpan) {
                builder.addStyle(toParagraphStyle((AlignmentSpan) obj), i2, i3);
                return;
            }
            if (obj instanceof AnnotationSpan) {
                AnnotationSpan annotationSpan = (AnnotationSpan) obj;
                builder.addStringAnnotation(annotationSpan.getKey(), annotationSpan.getValue(), i2, i3);
                return;
            }
            if (obj instanceof BackgroundColorSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof ForegroundColorSpan) {
                builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof RelativeSizeSpan) {
                builder.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, Utf8.REPLACEMENT_CODE_POINT, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof StrikethroughSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof StyleSpan) {
                SpanStyle spanStyle = toSpanStyle((StyleSpan) obj);
                if (spanStyle != null) {
                    builder.addStyle(spanStyle, i2, i3);
                    return;
                }
                return;
            }
            if (obj instanceof SubscriptSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m6411boximpl(BaselineShift.Companion.m6422getSubscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof SuperscriptSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m6411boximpl(BaselineShift.Companion.m6423getSuperscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i2, i3);
                return;
            }
            if (obj instanceof TypefaceSpan) {
                builder.addStyle(toSpanStyle((TypefaceSpan) obj), i2, i3);
                return;
            }
            if (obj instanceof UnderlineSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i2, i3);
            } else {
                if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                    return;
                }
                builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i2, i3);
            }
        }
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan alignmentSpan) {
        int iM6532getStarte0LSkKk;
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i2 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i2 == 1) {
            iM6532getStarte0LSkKk = TextAlign.Companion.m6532getStarte0LSkKk();
        } else if (i2 == 2) {
            iM6532getStarte0LSkKk = TextAlign.Companion.m6527getCentere0LSkKk();
        } else if (i2 == 3) {
            iM6532getStarte0LSkKk = TextAlign.Companion.m6528getEnde0LSkKk();
        } else {
            iM6532getStarte0LSkKk = TextAlign.Companion.m6533getUnspecifiede0LSkKk();
        }
        return new ParagraphStyle(iM6532getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_POSITION_TYPE, (DefaultConstructorMarker) null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m6230boximpl(FontStyle.Companion.m6239getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m6230boximpl(FontStyle.Companion.m6239getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        GenericFontFamily serif;
        String family = typefaceSpan.getFamily();
        if (Intrinsics.areEqual(family, FontFamily.Companion.getCursive().getName())) {
            serif = FontFamily.Companion.getCursive();
        } else if (Intrinsics.areEqual(family, FontFamily.Companion.getMonospace().getName())) {
            serif = FontFamily.Companion.getMonospace();
        } else if (Intrinsics.areEqual(family, FontFamily.Companion.getSansSerif().getName())) {
            serif = FontFamily.Companion.getSansSerif();
        } else {
            serif = Intrinsics.areEqual(family, FontFamily.Companion.getSerif().getName()) ? FontFamily.Companion.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null);
    }

    private static final FontFamily optionalFontFamilyFromName(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        if (Intrinsics.areEqual(typefaceCreate, Typeface.DEFAULT) || Intrinsics.areEqual(typefaceCreate, Typeface.create(Typeface.DEFAULT, 0))) {
            typefaceCreate = null;
        }
        if (typefaceCreate != null) {
            return AndroidTypeface_androidKt.FontFamily(typefaceCreate);
        }
        return null;
    }
}
