package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d̉=!4i\bDJc|\u0004W\u00068\u000b4C\u0007\":\u0017\u007fјnjO0LeN/ZS@\u000fs{:$c$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JģG3coEʠhtL\u0005(2(;\u0012#\u000f\u001bBH>x+GY\u000f*0nrjV\u001bQ\u001d\u001a@\bn$\u000f#tg|<\u000fqu^=*\u001bkXMUg`\u0003[\u0010^V=\f%iN1N;M\u0017;R1\u000f\u0003_M\bWqk\u000b/'?AW|o6\u0007\u0002D\u00199Y%]!(\r\t_k$'Y[*֟hr6\u0005\u0013{;>,\u000e4)x2;(~\b<B%vaPh\u0002\rS0~oH/%.2[?)yicQ\u0018|K,\u000b\u001b3;\u0003\u0005 \n\\>f#1lyg0\u007fWmL\\\"q=\u001c\u001d!f\u0010D\u001c0u\u001b_\u0002\u001fJ/'MZg@gǽʮGֳϼz\u0007f\u0007a\tj^NB\u0007\u0018M)7\u0014\u0003D\u0013\u0007\u001cVbyD\u0013c\u001b\u0003\u000fD\b3.jɼT!S\u000f%лjȬnOe\n3/ό7^vn\u0014ąU\r2̹U\u0006"}, d2 = {"\u0012dU.h3M:\u001d\bzA,\u0001\u000b2t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "\u0018", ":da=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "AsP?g", "As^=", "4qP0g0H\\", "", ":da=C3:b\u001a\t\bf\u001a\f\u001d6e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(\"i#*OP7v7\f$|h9\\", "@db<_=>>\u0015\fv`9x\u00142S\u000f<\u0003@_\u0017\u0018C\u007f\u0015K\u0005", "Ash9X", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "4`bA@,KU\u0019", "BdgA43BU\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "BdgA70KS\u0017\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t2ZC9z8(\u001e>", ":h]2;,BU\u001c\u000e", "BdgA<5=S\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|y7LCDz\n", ">kPAY6K[\u0007\u000e\u000fe,", ":h]2;,BU\u001c\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", ":h]259>O\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?AA", "6x_5X5L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#`4Bp\u00167[\u0019", "BdgA@6MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "4`bA@,KU\u0019F\u007f.\u001bO\u001d\rg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W'r21[\u000b\u001cBp\u0004=aJ;A\u0018\u0002yO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#O3\u0003K7hv,\\\u0011\u001fq\u007f\f\u001f\u001d\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfss\fr,&%A #r#(p;*\u0017wU\u001en]|Uv[ z\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/><\u0004G9\u007fr\u0014_n\u0018\bE|\u001e,?A+(9K\u0001N_juB\"qO\u001bj\u0007\u001bl90,/cmP\u001a\u0011k\u0017%Ee)\u00107e\u0015\bW~).FH1[\r$p\u00113qoR\u0019^;|#oQ,c\u0010\u0016Ld\"$9 KYXx.)FM&\u00182#\b\tUE\"lS\u0013[Z\u0007bWE", ";da4X\u0017EO(\u007f\u0005k4j\u0018Cl\u007f", "=sW2e", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f2) {
        int iM6526unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m6520boximpl(paragraphStyle.m6029getTextAligne0LSkKk()), TextAlign.m6520boximpl(paragraphStyle2.m6029getTextAligne0LSkKk()), f2)).m6526unboximpl();
        int iM6540unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m6534boximpl(paragraphStyle.m6031getTextDirections_7Xco()), TextDirection.m6534boximpl(paragraphStyle2.m6031getTextDirections_7Xco()), f2)).m6540unboximpl();
        long jM6079lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m6079lerpTextUnitInheritableC3pnCVY(paragraphStyle.m6027getLineHeightXSAIIZE(), paragraphStyle2.m6027getLineHeightXSAIIZE(), f2);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(iM6526unboximpl, iM6540unboximpl, jM6079lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f2), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f2), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f2), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m6440boximpl(paragraphStyle.m6026getLineBreakrAG3T2k()), LineBreak.m6440boximpl(paragraphStyle2.m6026getLineBreakrAG3T2k()), f2)).m6452unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m6430boximpl(paragraphStyle.m6024getHyphensvmbZdU8()), Hyphens.m6430boximpl(paragraphStyle2.m6024getHyphensvmbZdU8()), f2)).m6436unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f2), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f2) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f2);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int iM6532getStarte0LSkKk = TextAlign.m6523equalsimpl0(paragraphStyle.m6029getTextAligne0LSkKk(), TextAlign.Companion.m6533getUnspecifiede0LSkKk()) ? TextAlign.Companion.m6532getStarte0LSkKk() : paragraphStyle.m6029getTextAligne0LSkKk();
        int iM6169resolveTextDirectionIhaHGbI = TextStyleKt.m6169resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m6031getTextDirections_7Xco());
        long jM6027getLineHeightXSAIIZE = TextUnitKt.m6849isUnspecifiedR2X_6o(paragraphStyle.m6027getLineHeightXSAIIZE()) ? DefaultLineHeight : paragraphStyle.m6027getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int iM6459getSimplerAG3T2k = LineBreak.m6446equalsimpl0(paragraphStyle.m6026getLineBreakrAG3T2k(), LineBreak.Companion.m6460getUnspecifiedrAG3T2k()) ? LineBreak.Companion.m6459getSimplerAG3T2k() : paragraphStyle.m6026getLineBreakrAG3T2k();
        int iM6438getNonevmbZdU8 = Hyphens.m6433equalsimpl0(paragraphStyle.m6024getHyphensvmbZdU8(), Hyphens.Companion.m6439getUnspecifiedvmbZdU8()) ? Hyphens.Companion.m6438getNonevmbZdU8() : paragraphStyle.m6024getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(iM6532getStarte0LSkKk, iM6169resolveTextDirectionIhaHGbI, jM6027getLineHeightXSAIIZE, textIndent, platformStyle, lineHeightStyle, iM6459getSimplerAG3T2k, iM6438getNonevmbZdU8, textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m6032fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        int iM6029getTextAligne0LSkKk = i2;
        int iM6031getTextDirections_7Xco = i3;
        int iM6026getLineBreakrAG3T2k = i4;
        int iM6024getHyphensvmbZdU8 = i5;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextMotion textMotion2 = textMotion;
        TextIndent textIndent2 = textIndent;
        long jM6027getLineHeightXSAIIZE = j2;
        if ((TextAlign.m6523equalsimpl0(iM6029getTextAligne0LSkKk, TextAlign.Companion.m6533getUnspecifiede0LSkKk()) || TextAlign.m6523equalsimpl0(iM6029getTextAligne0LSkKk, paragraphStyle.m6029getTextAligne0LSkKk())) && ((TextUnitKt.m6849isUnspecifiedR2X_6o(jM6027getLineHeightXSAIIZE) || TextUnit.m6828equalsimpl0(jM6027getLineHeightXSAIIZE, paragraphStyle.m6027getLineHeightXSAIIZE())) && ((textIndent2 == null || Intrinsics.areEqual(textIndent2, paragraphStyle.getTextIndent())) && ((TextDirection.m6537equalsimpl0(iM6031getTextDirections_7Xco, TextDirection.Companion.m6546getUnspecifieds_7Xco()) || TextDirection.m6537equalsimpl0(iM6031getTextDirections_7Xco, paragraphStyle.m6031getTextDirections_7Xco())) && ((platformParagraphStyle == null || Intrinsics.areEqual(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle2 == null || Intrinsics.areEqual(lineHeightStyle2, paragraphStyle.getLineHeightStyle())) && ((LineBreak.m6446equalsimpl0(iM6026getLineBreakrAG3T2k, LineBreak.Companion.m6460getUnspecifiedrAG3T2k()) || LineBreak.m6446equalsimpl0(iM6026getLineBreakrAG3T2k, paragraphStyle.m6026getLineBreakrAG3T2k())) && ((Hyphens.m6433equalsimpl0(iM6024getHyphensvmbZdU8, Hyphens.Companion.m6439getUnspecifiedvmbZdU8()) || Hyphens.m6433equalsimpl0(iM6024getHyphensvmbZdU8, paragraphStyle.m6024getHyphensvmbZdU8())) && (textMotion2 == null || Intrinsics.areEqual(textMotion2, paragraphStyle.getTextMotion())))))))))) {
            return paragraphStyle;
        }
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(jM6027getLineHeightXSAIIZE)) {
            jM6027getLineHeightXSAIIZE = paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        if (TextAlign.m6523equalsimpl0(iM6029getTextAligne0LSkKk, TextAlign.Companion.m6533getUnspecifiede0LSkKk())) {
            iM6029getTextAligne0LSkKk = paragraphStyle.m6029getTextAligne0LSkKk();
        }
        if (TextDirection.m6537equalsimpl0(iM6031getTextDirections_7Xco, TextDirection.Companion.m6546getUnspecifieds_7Xco())) {
            iM6031getTextDirections_7Xco = paragraphStyle.m6031getTextDirections_7Xco();
        }
        PlatformParagraphStyle platformParagraphStyleMergePlatformStyle = mergePlatformStyle(paragraphStyle, platformParagraphStyle);
        if (lineHeightStyle2 == null) {
            lineHeightStyle2 = paragraphStyle.getLineHeightStyle();
        }
        if (LineBreak.m6446equalsimpl0(iM6026getLineBreakrAG3T2k, LineBreak.Companion.m6460getUnspecifiedrAG3T2k())) {
            iM6026getLineBreakrAG3T2k = paragraphStyle.m6026getLineBreakrAG3T2k();
        }
        if (Hyphens.m6433equalsimpl0(iM6024getHyphensvmbZdU8, Hyphens.Companion.m6439getUnspecifiedvmbZdU8())) {
            iM6024getHyphensvmbZdU8 = paragraphStyle.m6024getHyphensvmbZdU8();
        }
        if (textMotion2 == null) {
            textMotion2 = paragraphStyle.getTextMotion();
        }
        return new ParagraphStyle(iM6029getTextAligne0LSkKk, iM6031getTextDirections_7Xco, jM6027getLineHeightXSAIIZE, textIndent2, platformParagraphStyleMergePlatformStyle, lineHeightStyle2, iM6026getLineBreakrAG3T2k, iM6024getHyphensvmbZdU8, textMotion2, (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }
}
