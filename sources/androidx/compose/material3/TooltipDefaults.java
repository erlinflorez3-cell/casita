package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?1Le^.ZS0\u0014s{J$c$\bCCU ~*\teNo˧vJp\u000bK\u000f\f!~͛,_ǁ)]@\u000erGu?ݯQoK9)\u000fD\u001c82PP*\u000b\u0007\u001a8a(v)]\u0012\u0011ݮ/ϋ¤>T\u0013h\u00136Z L=\u0019\u001e\u000b\u007f~<NlkSG#1\u0004\tSф^ܞƊQ\u000fLr5)?l,JX7c(kXΫ\u000bRi_Kw\u007f\\\u001dhU:[OyWDy\u0018\u0014C2\u007f\u0013cr4~\u001dQ\u000f\u0013W1UcYs&(&\u0002,\u0013B\u0004\u001c*?H\\4`kܕ\rޗϢvUFu\u0010\u0005\u0013\u0017\tbN\u0017S\u0002Ɗ*ݍՎePň?!V7\n\n% )\u0004|%,i\u001cf-\u001b\u0003~\bvӾ?׀̩M\tՒAq\u001crh\n8\r\u0001V\u000e9\u0014\u0011\\\"[|٦='9m\bTRtG\u001anvki\u0001OvgĻ\u0015ճӠ\b\u000bʑHh\u001dmVcf5a\\*d\u001f}6\u001eV\"ʟ@%=\u0012T`vv;ck\u001c=/\u0015J\u0002n\u001a\"\u000ew5ک7Ʉg\u0014yT|)MRϸ\u0005anEY۰v\u000b'*2N\nށ{#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$BL\u0016/ISBzBs", "", "u(E", "1`a2g\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "5dc\u0010T9>b\u0007\u0003\u0010^sd|BVL\u001bg", "u(9", "\u0018", ">kP6a\u001bH] \u000e~i\n\u0007\u0012>a\u00041{M^!\u001eQ|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u001d_(B\\\b\t\u0005e;\u0001\u0014\ro\t7wD\n\u0017$%y\u0015F\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", ">kP6a\u001bH] \u000e~i\n\u0007\u0012>a\u00041{Mn\u001a\u0013Ro", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u001d_(B\\\b\t\u0005e;\u0001\u0014\ro\t7wD\n\u0017$5r\nGv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", ">kP6a\u001bH] \u000e~i\n\u0007\u0012>e\t7YJ\b!$", "5dc\u001d_(B\\\b\t\u0005e;\u0001\u0014\ro\t7{I\u0010t!Ny\u001b", "@hR5G6HZ(\u0003\u0006<6\u0006\u0018+i\t(\t.\u0004\u0013\"G", "5dc\u001f\\*AB#\t\u0002m0\bf9n\u000f$\u007fI\u0001$\u0005Jk\u0019<", "2dU.h3M@\u001d|}M6\u0007\u0010>i\u000b\u0006\u0006G\u000b$%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)3\\l*At%2X!Er>+#>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000egb*\u007fw9o\u00077\u007fK^!\u001eQ|\u001cz~!DY\u000b$3tc(ZCBk0,\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNFE\"q3A)\u000f;M\r\u0019r\b\u0016#\u001c\u000b", "@d\\2`)>`\u0004\u0006vb5k\u00139l\u000f,\u0007+\u000b%\u001bVs\u0018Ea2?j\u0002\u001f7z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", "AoP0\\5@0\u0019\u000e\r^,\u0006w9o\u00077\u007fK\\ \u0016#x\f?\u00012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@d\\2`)>`\u0004\u0006vb5k\u00139l\u000f,\u0007+\u000b%\u001bVs\u0018Ea2?j\u0002\u001f7z]40\"0h9\u001c", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u00121\u0007\"g=\u001d\"re8\u001a-*X~2QZNulV<O\u0018\u001bY\u0018`tw\u000fdQ/YNE#\u00170S\u000b&u\u000b\u001d\u001a\r5wF", "@d\\2`)>`\u0006\u0003xa\u001b\u0007\u00136t\u00043fJ\u000f\u001b&Ky\u0017'\u0004/F]| D", "@d\\2`)>`\u0006\u0003xa\u001b\u0007\u00136t\u00043fJ\u000f\u001b&Ky\u0017'\u0004/F]| D5\u001c\u0011,88p2", "@hR5G6HZ(\u0003\u0006<6\u0004\u0013<s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W;/\u000b\bHK.uS;*e6P\fHvV", "1n]AT0GS&\\\u0005e6\n", "1n]AX5M1#\u0006\u0005k", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "/bc6b5\u001c]\"\u000ezg;Z\u00136o\r", "@hR5G6HZ(\u0003\u0006<6\u0004\u0013<sG5\u0006:h{i\u001a", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#.(lG&)\u00123X\u0006FF\u000b\u0013 \u001bC@", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TooltipDefaults {
    public static final int $stable = 0;
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();
    private static final long caretSize = DpKt.m6660DpSizeYgX7TsA(Dp.m6638constructorimpl(16), Dp.m6638constructorimpl(8));

    private TooltipDefaults() {
    }

    public final Shape getPlainTooltipContainerShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 49570325, "C240@10518L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getPlainTooltipContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 102696215, "C244@10694L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getPlainTooltipContentColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1982928937, "C248@10882L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getRichTooltipContainerShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1138709783, "C252@11055L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m2858getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    public final RichTooltipColors richTooltipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1622312141, "C(richTooltipColors)261@11362L11:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i2, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
        }
        RichTooltipColors defaultRichTooltipColors$material3_release = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultRichTooltipColors$material3_release;
    }

    /* JADX INFO: renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m2861richTooltipColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j5;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4214getUnspecified0d7_KjU3 = j3;
        long jM4214getUnspecified0d7_KjU4 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1498555081, "C(richTooltipColors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color)274@11844L11:Tooltip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i2, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:274)");
        }
        RichTooltipColors richTooltipColorsM2415copyjRlVdoo = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2415copyjRlVdoo(jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return richTooltipColorsM2415copyjRlVdoo;
    }

    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached$material3_release = colorScheme.getDefaultRichTooltipColorsCached$material3_release();
        if (defaultRichTooltipColorsCached$material3_release != null) {
            return defaultRichTooltipColorsCached$material3_release;
        }
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, RichTooltipTokens.INSTANCE.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3_release(richTooltipColors);
        return richTooltipColors;
    }

    /* JADX INFO: renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2859rememberPlainTooltipPositionProviderkHDZbjc(float f2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1047866909, "C(rememberPlainTooltipPositionProvider)P(0:c#ui.unit.Dp)*304@13227L7,305@13298L897:Tooltip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final int iMo704roundToPx0680j_4 = ((Density) objConsume).mo704roundToPx0680j_4(f2);
        ComposerKt.sourceInformationMarkerStart(composer, 1994502237, "CC(remember):Tooltip.kt#9igjgp");
        boolean zChanged = composer.changed(iMo704roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
                public long mo682calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                    int left = intRect.getLeft() + ((intRect.getWidth() - IntSize.m6808getWidthimpl(j3)) / 2);
                    int top = (intRect.getTop() - IntSize.m6807getHeightimpl(j3)) - iMo704roundToPx0680j_4;
                    if (top < 0) {
                        top = iMo704roundToPx0680j_4 + intRect.getBottom();
                    }
                    return IntOffsetKt.IntOffset(left, top);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    /* JADX INFO: renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2860rememberRichTooltipPositionProviderkHDZbjc(float f2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1538806795, "C(rememberRichTooltipPositionProvider)P(0:c#ui.unit.Dp)*337@14707L7,338@14778L1457:Tooltip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            f2 = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:335)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final int iMo704roundToPx0680j_4 = ((Density) objConsume).mo704roundToPx0680j_4(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -1778011319, "CC(remember):Tooltip.kt#9igjgp");
        boolean zChanged = composer.changed(iMo704roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
                public long mo682calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                    int left = intRect.getLeft();
                    if (IntSize.m6808getWidthimpl(j3) + left > IntSize.m6808getWidthimpl(j2) && (left = intRect.getRight() - IntSize.m6808getWidthimpl(j3)) < 0) {
                        left = intRect.getLeft() + ((intRect.getWidth() - IntSize.m6808getWidthimpl(j3)) / 2);
                    }
                    int top = (intRect.getTop() - IntSize.m6807getHeightimpl(j3)) - iMo704roundToPx0680j_4;
                    if (top < 0) {
                        top = iMo704roundToPx0680j_4 + intRect.getBottom();
                    }
                    return IntOffsetKt.IntOffset(left, top);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 tooltipDefaults$rememberRichTooltipPositionProvider$1$1 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$1;
    }
}
