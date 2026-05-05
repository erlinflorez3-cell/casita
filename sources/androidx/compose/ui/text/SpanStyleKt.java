package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D߬)\u001e\u007f\u007fLDiu\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9FDmH4S[*\u001dp\u00044*_,qY;]\u001a\u0004)\u0011OdgonP[\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u0013,:\">y\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z\rS\u0005\"\u0012\u001c>(ҵ&\\}N>Hr]B/9\u0003qBT*wL\u000bT%F\u0003/=zo'C@e=E)a\r\u001fR\nG3C\u007fH\u001dhU3Cr\u0002dNXF\"5-UՕk\u0001V`\u0013`x\fm9\u007fgY`&(>\t,\u0011J\u000f&\u0006UTtƦբj\b\u001cD\r\u0017aRh\u0004tA.\u000e\u0012<%.\u00185A8Iy\u0002gI#f9\u0012\u0004;1S\u0005|,sT<l[\u001bl _Ei@kM~\u000egL\u0006\u0004\u001fg2.\u0012@_\u007f]\u0001A2%:O[g/gǽʮGֳϼz\u0007f~a\u0001jVN:\u0007\u0016e29\u0010h]|\u0005\u001aX\u001bАDӋL*n\u001f}6\u001bH\\&DQ)\u001eigh\u0018i}c\u0018AGhMX\u001d\t>[G|K5\u007fo@e`\u0016,?jg5^tbk\u000ep[VCbNx2\u0010}ZM:6bE\u007f@L.G\u0018\u000b:x\t,hY~\u001f^\t\u0010@\u0005b[<\u0005\u007f##21Tj\u001b\bg'N\\\u0003nMECg4GR\u0006(va\u0015%\u001d}\".wmZvdn,t\u0004,P\u001a(ji/k\u0012?\u00057d\u001a/[K!\u0019\u0002S [\u0013~\u0010\u000ei\u001e^m\u0016!\t.vixb\u0005\u001d0.vt9\u0007\u00138@ӓĸyòϭX\rawW-\u001boJ\nP~\u001b\u001eL8)oP\u0005e3Qc5\u0018\u000e\u0013]((]\n}<Ӡz\u000fTs<׀.І\u001aqjQk2[FWZ\u0017>P#CÚD\u05f8ny\u0010B\u00174-?VC|p\u0005;$ߕ1̱j\u00074ݸ\u0011di>+o,9\u0005ʁ,ϵG\u007f\u001c^Q%1[am\u0006myaaͪ\u0011ϻ\u000f}9n \u001cܾ [_e\u000fޗ\"\"\u0017ݦEx"}, d2 = {"\u0012dU.h3M0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u0018", "\u0012dU.h3M1#\u0006\u0005k", "\u0012dU.h3M1#\u0006\u0005k\r\u0007\u0016/g\r2\fI\u007f\u0005&[v\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "\u0012dU.h3M4#\b\nL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "\u0012dU.h3M:\u0019\u000e\n^9j\u0014+c\u00041}", ":da=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "AsP?g", "As^=", "4qP0g0H\\", "", ":da=70LQ&~\n^", "\"", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u000f\u0011*@gE\u001a^o]B\t-\u0016K{'E[$", ":da=C3:b\u001a\t\bf\u001a\f\u001d6e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(%x\u00127;ROr4s", ":da=G,Qb\t\b~m\u0010\u0006\f/r\u00047w=\b\u0017", "B", ":da=G,Qb\t\b~m\u0010\u0006\f/r\u00047w=\b\u0017^%=\u0019ET\u0016)", "uI9\u0013\u001c\u0011", "@db<_=>A$z\u0004L;\u0011\u0010/D\u007f)wP\b&%", "Ash9X", "4`bA@,KU\u0019", "1n[<e", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "4n]AF0SS", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", ":dcAX9,^\u0015|~g.", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "0`R8Z9Hc\"}", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", ">kPAY6K[\u0007\u000e\u000fe,", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "4`bA@,KU\u0019FyL\u000f\u000b\f|o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W*\u0002!>G\r4>mk\u00134?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\ti\u0012iO'D%\u001c\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#`\u0004PP\u000fC4m\u001bQ\u001d`<=3iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\b|[YT9VF}6h,\u0006\u0001! g\t2t\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\NKv\u00056?\u0018q.+h\u0018kD\u001f-ntfH\u001d\u000bklB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C%\rP3mxX\r\u001c^\n):%,h c~n\u001c#Bk$^\u000by&)>I\u001c\u000b2&\u001b\t]L\u0017F-viTqhas#IB\u000fS)>UJv\u001cSsY%4\u0014\u001aH+\u0003}Iy\u007fo!3=`<k`\u001d\u000ekT1nN4%\u001e:;\u0006QS8\\\u0002/ \b\u001chF%a\bG\u0002FP\u0013x1PjKN+Ze\u001f\u000eM\u001f7`\u0004#FYbBFw\u001c\u0001\u000e8\u0001h\u0003(/tT)k\u001aB0\n\u0016\u0012z'=\u001bJhR_\\\u0013\u0002W\u0012\u001e\u0007j6Nv,Dd\u001cLg-QI$-]\u001b<\u0007\u000b^\n1k\u0001wmB\u0006+/A[\u0016\f\u001a\u0016\u001fX*%$\t\fsNxPQ5\u001bSV= [7$<*#V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf3\u0004(tJkk\u0005j*\u000f$R\b-\u000bWd-\u0005tpvseM\u000e5A<\u0005T<\u001c.D\u00176|\bkw\u0015+\u007fZD#\u000b>`(\u0019R_#R{\u0007|._\u0013@\u0001\"<RX\u000f[4(&\u0011m\u0007\u0003m2\u001ar.QUK.Tf>Z\u000f\u0010^.b/\u0016\u0013\u001d\"/t\\'(\u0012X<h\u001d\u0019\u0007\u000b\u0017\u001d9\\yS\u001e\fgs\u001a\nA\u000b<T[#\u0007IbN2\u001e1y:`]tG&k", ";da4X\u0017EO(\u007f\u0005k4j\u0018Cl\u007f", "=sW2e", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpanStyleKt {
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultBackgroundColor = Color.Companion.m4213getTransparent0d7_KjU();

    public static final <T> T lerpDiscrete(T t2, T t3, float f2) {
        return ((double) f2) < 0.5d ? t2 : t3;
    }

    static {
        long jM4204getBlack0d7_KjU = Color.Companion.m4204getBlack0d7_KjU();
        DefaultColor = jM4204getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m6548from8_81llA(jM4204getBlack0d7_KjU);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m6079lerpTextUnitInheritableC3pnCVY(long j2, long j3, float f2) {
        return (TextUnitKt.m6849isUnspecifiedR2X_6o(j2) || TextUnitKt.m6849isUnspecifiedR2X_6o(j3)) ? ((TextUnit) lerpDiscrete(TextUnit.m6821boximpl(j2), TextUnit.m6821boximpl(j3), f2)).m6840unboximpl() : TextUnitKt.m6851lerpC3pnCVY(j2, j3, f2);
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f2) {
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f2);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f2);
        long jM6079lerpTextUnitInheritableC3pnCVY = m6079lerpTextUnitInheritableC3pnCVY(spanStyle.m6074getFontSizeXSAIIZE(), spanStyle2.m6074getFontSizeXSAIIZE(), f2);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f2);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m6075getFontStyle4Lr2A7w(), spanStyle2.m6075getFontStyle4Lr2A7w(), f2);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m6076getFontSynthesisZQGJjVo(), spanStyle2.m6076getFontSynthesisZQGJjVo(), f2);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f2);
        long jM6079lerpTextUnitInheritableC3pnCVY2 = m6079lerpTextUnitInheritableC3pnCVY(spanStyle.m6077getLetterSpacingXSAIIZE(), spanStyle2.m6077getLetterSpacingXSAIIZE(), f2);
        BaselineShift baselineShiftM6072getBaselineShift5SSeXJ0 = spanStyle.m6072getBaselineShift5SSeXJ0();
        float fM6417unboximpl = baselineShiftM6072getBaselineShift5SSeXJ0 != null ? baselineShiftM6072getBaselineShift5SSeXJ0.m6417unboximpl() : BaselineShift.m6412constructorimpl(0.0f);
        BaselineShift baselineShiftM6072getBaselineShift5SSeXJ02 = spanStyle2.m6072getBaselineShift5SSeXJ0();
        float fM6424lerpjWV1Mfo = BaselineShiftKt.m6424lerpjWV1Mfo(fM6417unboximpl, baselineShiftM6072getBaselineShift5SSeXJ02 != null ? baselineShiftM6072getBaselineShift5SSeXJ02.m6417unboximpl() : BaselineShift.m6412constructorimpl(0.0f), f2);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f2);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f2);
        long jM4229lerpjxsXWHM = ColorKt.m4229lerpjxsXWHM(spanStyle.m6071getBackground0d7_KjU(), spanStyle2.m6071getBackground0d7_KjU(), f2);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f2);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM6079lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM6079lerpTextUnitInheritableC3pnCVY2, BaselineShift.m6411boximpl(fM6424lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM4229lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f2), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f2), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f2), (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f2) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f2);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        long jM6077getLetterSpacingXSAIIZE;
        TextForegroundStyle textForegroundStyleTakeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextForegroundStyle invoke() {
                return SpanStyleKt.DefaultColorForegroundStyle;
            }
        });
        long jM6074getFontSizeXSAIIZE = TextUnitKt.m6849isUnspecifiedR2X_6o(spanStyle.m6074getFontSizeXSAIIZE()) ? DefaultFontSize : spanStyle.m6074getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM6075getFontStyle4Lr2A7w = spanStyle.m6075getFontStyle4Lr2A7w();
        FontStyle fontStyleM6230boximpl = FontStyle.m6230boximpl(fontStyleM6075getFontStyle4Lr2A7w != null ? fontStyleM6075getFontStyle4Lr2A7w.m6236unboximpl() : FontStyle.Companion.m6240getNormal_LCdwA());
        FontSynthesis fontSynthesisM6076getFontSynthesisZQGJjVo = spanStyle.m6076getFontSynthesisZQGJjVo();
        FontSynthesis fontSynthesisM6241boximpl = FontSynthesis.m6241boximpl(fontSynthesisM6076getFontSynthesisZQGJjVo != null ? fontSynthesisM6076getFontSynthesisZQGJjVo.m6249unboximpl() : FontSynthesis.Companion.m6250getAllGVVA2EU());
        SystemFontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(spanStyle.m6077getLetterSpacingXSAIIZE())) {
            jM6077getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            jM6077getLetterSpacingXSAIIZE = spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        BaselineShift baselineShiftM6072getBaselineShift5SSeXJ0 = spanStyle.m6072getBaselineShift5SSeXJ0();
        BaselineShift baselineShiftM6411boximpl = BaselineShift.m6411boximpl(baselineShiftM6072getBaselineShift5SSeXJ0 != null ? baselineShiftM6072getBaselineShift5SSeXJ0.m6417unboximpl() : BaselineShift.Companion.m6421getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        long jM6071getBackground0d7_KjU = spanStyle.m6071getBackground0d7_KjU();
        if (jM6071getBackground0d7_KjU == 16) {
            jM6071getBackground0d7_KjU = DefaultBackgroundColor;
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, jM6074getFontSizeXSAIIZE, fontWeight, fontStyleM6230boximpl, fontSynthesisM6241boximpl, fontFamily, fontFeatureSettings, jM6077getLetterSpacingXSAIIZE, baselineShiftM6411boximpl, textGeometricTransform, localeList, jM6071getBackground0d7_KjU, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    public static final SpanStyle m6078fastMergedSHsh3o(SpanStyle spanStyle, long j2, Brush brush, float f2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        long jM6074getFontSizeXSAIIZE = j3;
        long jM6077getLetterSpacingXSAIIZE = j4;
        long jM6071getBackground0d7_KjU = j5;
        LocaleList localeList2 = localeList;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        BaselineShift baselineShiftM6072getBaselineShift5SSeXJ0 = baselineShift;
        DrawStyle drawStyle2 = drawStyle;
        String fontFeatureSettings = str;
        Shadow shadow2 = shadow;
        FontSynthesis fontSynthesisM6076getFontSynthesisZQGJjVo = fontSynthesis;
        TextDecoration textDecoration2 = textDecoration;
        FontStyle fontStyleM6075getFontStyle4Lr2A7w = fontStyle;
        FontWeight fontWeight2 = fontWeight;
        FontFamily fontFamily2 = fontFamily;
        if ((TextUnitKt.m6849isUnspecifiedR2X_6o(jM6074getFontSizeXSAIIZE) || TextUnit.m6828equalsimpl0(jM6074getFontSizeXSAIIZE, spanStyle.m6074getFontSizeXSAIIZE())) && ((brush != null || j2 == 16 || Color.m4179equalsimpl0(j2, spanStyle.getTextForegroundStyle$ui_text_release().mo6425getColor0d7_KjU())) && ((fontStyleM6075getFontStyle4Lr2A7w == null || Intrinsics.areEqual(fontStyleM6075getFontStyle4Lr2A7w, spanStyle.m6075getFontStyle4Lr2A7w())) && ((fontWeight2 == null || Intrinsics.areEqual(fontWeight2, spanStyle.getFontWeight())) && ((fontFamily2 == null || fontFamily2 == spanStyle.getFontFamily()) && ((TextUnitKt.m6849isUnspecifiedR2X_6o(jM6077getLetterSpacingXSAIIZE) || TextUnit.m6828equalsimpl0(jM6077getLetterSpacingXSAIIZE, spanStyle.m6077getLetterSpacingXSAIIZE())) && ((textDecoration2 == null || Intrinsics.areEqual(textDecoration2, spanStyle.getTextDecoration())) && Intrinsics.areEqual(brush, spanStyle.getTextForegroundStyle$ui_text_release().getBrush()) && ((brush == null || f2 == spanStyle.getTextForegroundStyle$ui_text_release().getAlpha()) && ((fontSynthesisM6076getFontSynthesisZQGJjVo == null || Intrinsics.areEqual(fontSynthesisM6076getFontSynthesisZQGJjVo, spanStyle.m6076getFontSynthesisZQGJjVo())) && ((fontFeatureSettings == null || Intrinsics.areEqual(fontFeatureSettings, spanStyle.getFontFeatureSettings())) && ((baselineShiftM6072getBaselineShift5SSeXJ0 == null || Intrinsics.areEqual(baselineShiftM6072getBaselineShift5SSeXJ0, spanStyle.m6072getBaselineShift5SSeXJ0())) && ((textGeometricTransform2 == null || Intrinsics.areEqual(textGeometricTransform2, spanStyle.getTextGeometricTransform())) && ((localeList2 == null || Intrinsics.areEqual(localeList2, spanStyle.getLocaleList())) && ((jM6071getBackground0d7_KjU == 16 || Color.m4179equalsimpl0(jM6071getBackground0d7_KjU, spanStyle.m6071getBackground0d7_KjU())) && ((shadow2 == null || Intrinsics.areEqual(shadow2, spanStyle.getShadow())) && ((platformSpanStyle == null || Intrinsics.areEqual(platformSpanStyle, spanStyle.getPlatformStyle())) && (drawStyle2 == null || Intrinsics.areEqual(drawStyle2, spanStyle.getDrawStyle())))))))))))))))))) {
            return spanStyle;
        }
        if (brush != null) {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.from(brush, f2);
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        TextForegroundStyle textForegroundStyleMerge = spanStyle.getTextForegroundStyle$ui_text_release().merge(textForegroundStyleM6548from8_81llA);
        if (fontFamily2 == null) {
            fontFamily2 = spanStyle.getFontFamily();
        }
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(jM6074getFontSizeXSAIIZE)) {
            jM6074getFontSizeXSAIIZE = spanStyle.m6074getFontSizeXSAIIZE();
        }
        if (fontWeight2 == null) {
            fontWeight2 = spanStyle.getFontWeight();
        }
        if (fontStyleM6075getFontStyle4Lr2A7w == null) {
            fontStyleM6075getFontStyle4Lr2A7w = spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if (fontSynthesisM6076getFontSynthesisZQGJjVo == null) {
            fontSynthesisM6076getFontSynthesisZQGJjVo = spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = spanStyle.getFontFeatureSettings();
        }
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(jM6077getLetterSpacingXSAIIZE)) {
            jM6077getLetterSpacingXSAIIZE = spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if (baselineShiftM6072getBaselineShift5SSeXJ0 == null) {
            baselineShiftM6072getBaselineShift5SSeXJ0 = spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
        }
        if (localeList2 == null) {
            localeList2 = spanStyle.getLocaleList();
        }
        if (jM6071getBackground0d7_KjU == 16) {
            jM6071getBackground0d7_KjU = spanStyle.m6071getBackground0d7_KjU();
        }
        if (textDecoration2 == null) {
            textDecoration2 = spanStyle.getTextDecoration();
        }
        if (shadow2 == null) {
            shadow2 = spanStyle.getShadow();
        }
        PlatformSpanStyle platformSpanStyleMergePlatformStyle = mergePlatformStyle(spanStyle, platformSpanStyle);
        if (drawStyle2 == null) {
            drawStyle2 = spanStyle.getDrawStyle();
        }
        return new SpanStyle(textForegroundStyleMerge, jM6074getFontSizeXSAIIZE, fontWeight2, fontStyleM6075getFontStyle4Lr2A7w, fontSynthesisM6076getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM6077getLetterSpacingXSAIIZE, baselineShiftM6072getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM6071getBackground0d7_KjU, textDecoration2, shadow2, platformSpanStyleMergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
    }
}
