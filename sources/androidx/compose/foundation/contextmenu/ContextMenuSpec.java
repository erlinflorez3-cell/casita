package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u000e\u0007nj?2Le^.ZS0\u0014s{J$c$wECU0}*\tUYog\u0005JbŏK\u000f\u001c\u0016\u0001j2J[ߎ](ƁbB\u001e>sRu=˃dtD\u0005hH0b\u0012\u0005/EZL\u001e#\u0013Cy9ݮ/ϋ¤>T\u0013{\u0013Ib\u001dL!\u0019\u001e\u000bi¦5ԟɆ\\9ǥ'\u000bqB\\,w2\u0003P\u001bJ%>\u001b|y\u001eYB̳4ՖɥR\u0002\u07baVcG\u0003MvU\u0007n.5/\u001a\u000be>p\u007fB\u0017ܹNՕȗq%ػ\tYh\f50geQY\u001c,H\u0012\n\u0017T\u0004<\u0011ТG͓ȟ\u0019eڿ\u0012;|raNh\u0004dN\u000e\b2E%4\u00183YIӸjWiݢ1P=\r\u0013\u001fn:\u000f\u00029[\u0003\u0010ؤ\u0014ÑȑvPśUHEH\\\u000fq?s\u0018~fRA\u0012E_\u007f]}ö-Ϗğ6Zޠ')s\u0002VI\u007fx\u000bvvW:iVW:nDOӠ\bȱ˧CcʰoX\\X:,e\u001eZ \f\"c/j\u0014T!S-ʽSnqҔe_\u0010C=\u0006\bp|\f&Wgiܡ4ȡԨ\u000f`؏z\u001cG<p\u0013phHt\u001ag-?0T`j>\u0003մC\u0088ݵ\u00121Ɛu$<,?'t\u0017N&,O\u0012\u0014\u0017\u0004rh>\u0001֗2ɴөh#ڲ\r\tX\\~t\u007fzOQ\u000bdrDOwM\u0019TWʡgؔţ\"\u0006ҋw\bOgZLdn\u001c\u001dc\u007fp-(ai/k\u0015ĺ}ǻʾ\u0001,։PzmQ[\u0017?|\u0003#\u001d?ß.p\u0010mvݼ|\u0019IWT\u001dA\u0557b#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^d2GJ$", "", "u(E", "\u0011n]AT0GS&p~];\u007fp+x", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010b5MO\u001d\bzk\u001e\u0001\b>hg$\u000f\b_jvL?\u000f$", "u(5", "\u0014", "\u0011n]AT0GS&p~];\u007fp3n", "5dc\u0010b5MO\u001d\bzk\u001e\u0001\b>hg,\u0005\b_jvL?\u000f$", "\u0011na;X9+O\u0018\u0003\u000bl", "5dc\u0010b9GS&kv]0\r\u0017vDS\b\u0001\u0010\u0002~", "\u0014n]AF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "5dc\u0013b5MA\u001d\u0014z&\u001fjd\u0013It\b", "u(9", "\u0018", "\u0014n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "5dc\u0013b5ME\u0019\u0003|a;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "\u0016na6m6Gb\u0015\u0006eZ+{\r8g", "5dc\u0015b9Bh#\b\nZ3g\u0005.d\u00041}\b_jvL?\u000f$", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "\u001a`Q2_\u000fH`\u001d\u0014\u0005g;x\u0010\u001ee\u00137WG\u0005\u0019 Oo\u0017K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "5dc\u0019T)>Z{\t\bbA\u0007\u0012>a\u0007\u0017{S\u0010r\u001eKq\u0017Dv.D!}j\u001e[\u001c\u0014S", "u(8", "\u0017", "\u001a`Q2_\u001d>`(\u0003xZ3k\tBt[/\u007fB\n\u001f\u0017P~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "5dc\u0019T)>Z\n~\bm0z\u00056T\u007f;\u000b\u001c\b\u001b\u0019Pw\u000eE\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u00117z%2K?BA", "\u001adcAX9,^\u0015|~g.", "5dc\u0019X;MS&l\u0006Z*\u0001\u00121-r\u0016W$d\fv", "\u001ah]2;,BU\u001c\u000e", "5dc\u0019\\5>6\u0019\u0003|a;D{\u001dAc\fp ", "\u001ahbA<;>[{~~`/\f", "5dc\u0019\\:M7(~\u0003A,\u0001\u000b2tG\u0007O \u0006f\u0018/", "\u001bd]B66Gb\u0015\u0003\u0004^9\\\u0010/v{7\u007fJ\n", "5dc\u001aX5N1#\b\nZ0\u0006\t<E\u0007(\r<\u0010\u001b!P7l\u0010V*\u0005Ze", "$daA\\*:Z\u0004zy]0\u0006\u000b", "5dc#X9MW\u0017z\u0002I({\b3n\u0002oZ\u0014`\u001cfHW", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "BdgAF;RZ\u0019FMX~H\u00106A", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@\u00145l\r\u000eF\u0002\u001d.#", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextMenuSpec {
    public static final int $stable = 0;
    public static final ContextMenuSpec INSTANCE = new ContextMenuSpec();
    private static final float ContainerWidthMin = Dp.m6638constructorimpl(PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
    private static final float ContainerWidthMax = Dp.m6638constructorimpl(280);
    private static final float ListItemHeight = Dp.m6638constructorimpl(48);
    private static final float MenuContainerElevation = Dp.m6638constructorimpl(3);
    private static final float CornerRadius = Dp.m6638constructorimpl(4);
    private static final Alignment.Vertical LabelVerticalTextAlignment = Alignment.Companion.getCenterVertically();
    private static final int LabelHorizontalTextAlignment = TextAlign.Companion.m6532getStarte0LSkKk();
    private static final float HorizontalPadding = Dp.m6638constructorimpl(12);
    private static final float VerticalPadding = Dp.m6638constructorimpl(8);
    private static final float IconSize = Dp.m6638constructorimpl(24);
    private static final long FontSize = TextUnitKt.getSp(14);
    private static final FontWeight FontWeight = FontWeight.Companion.getMedium();
    private static final long LineHeight = TextUnitKt.getSp(20);
    private static final long LetterSpacing = TextUnitKt.getSp(0.1f);

    private ContextMenuSpec() {
    }

    /* JADX INFO: renamed from: getContainerWidthMin-D9Ej5fM, reason: not valid java name */
    public final float m684getContainerWidthMinD9Ej5fM() {
        return ContainerWidthMin;
    }

    /* JADX INFO: renamed from: getContainerWidthMax-D9Ej5fM, reason: not valid java name */
    public final float m683getContainerWidthMaxD9Ej5fM() {
        return ContainerWidthMax;
    }

    /* JADX INFO: renamed from: getListItemHeight-D9Ej5fM, reason: not valid java name */
    public final float m692getListItemHeightD9Ej5fM() {
        return ListItemHeight;
    }

    /* JADX INFO: renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m693getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m685getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    public final Alignment.Vertical getLabelVerticalTextAlignment() {
        return LabelVerticalTextAlignment;
    }

    /* JADX INFO: renamed from: getLabelHorizontalTextAlignment-e0LSkKk, reason: not valid java name */
    public final int m689getLabelHorizontalTextAlignmente0LSkKk() {
        return LabelHorizontalTextAlignment;
    }

    /* JADX INFO: renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m687getHorizontalPaddingD9Ej5fM() {
        return HorizontalPadding;
    }

    /* JADX INFO: renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m694getVerticalPaddingD9Ej5fM() {
        return VerticalPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m688getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m686getFontSizeXSAIIZE() {
        return FontSize;
    }

    public final FontWeight getFontWeight() {
        return FontWeight;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m691getLineHeightXSAIIZE() {
        return LineHeight;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m690getLetterSpacingXSAIIZE() {
        return LetterSpacing;
    }

    /* JADX INFO: renamed from: textStyle-8_81llA, reason: not valid java name */
    public final TextStyle m695textStyle8_81llA(long j2) {
        int i2 = LabelHorizontalTextAlignment;
        return new TextStyle(j2, FontSize, FontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, LetterSpacing, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, i2, 0, LineHeight, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (DefaultConstructorMarker) null);
    }
}
