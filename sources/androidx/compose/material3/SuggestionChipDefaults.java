package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:'c$\bCCU \u0004*\teNogtQb\u000bY\u000f\u000e\u0016~m4Ikxe܈\u00172PxG3StC˨`\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCNY\u001d*0n}\u0001WҫQ\u0005($N\u000b.\u00126\\\u0016[fNr]HB;\u0003\u0018V~-e0\u000bb%F\u0003;=|g\u001e9VO5C9\u0004\t\rRiV\u001b? Q5n-'9a\fWdl0\u001a\u001b+]&urTpKVՙ\u000bʬ˦SeQj\u001cC@G\n)T\u0004<#WN4-(\u0005 \u000eav#YFP\u0010}Z\u007f)cf\u001d+\u007fAKQ\u001b\u0015S\u0012A\u001fNE\u001d\u001d\rL%1t'[b0x\u0015IV(W7QN``N8[\u0004rׇoç͆.\u00066k\u000eTD?<==7\n`S'q\u0002Vl\u007fv3t\u0019YoRVi:nDKZ\u000f\u0012ZR\u000f\u001dk~V\u001f1ԃLȼΤ\u000b\u007f\u000e>.\t@r/K(N}\u0016\u001an[\f\"%]\u0016g_tk\u001c\u007fQ^aI\u0002i\u0016a` ,?jv5^lBa6r\\V$xMғ\u000fǮԞHP\u0012C@p:'B^I\u0019\u000b\"\u000f\bٿFA\u000b\u001b('vB\u0017Ta13o*t\u0017\u0014h\\\u001f\u0004\u0018~O,\u000bu:-oee\u001f,U0~L|Q\u001b/y\u0006Guc_L\u001b*&[\u0002 $2QQ]QC\u0015\u0005)@\u001bEEz\u0007,V͠\u0011\u05fdϸ\u0001{\u0015nvI0Tx%D`\u0019g\u007fZ\u001d\"\u0005|\u000b#6f0\u007fgF\tf{T9]nOx\u0003g\\f8+\u0007O$+\u0001}C\u00155[EW#\u001cw\"Q-a\fk 4\u007fb\u001dI\re2.*\u001bͪaГЄ6=>~g$\u000f92m\u001bBvlΤ\u0007ȷ߿3\fάLIlpd=e\r5\u0001t\u000b|$~\\s:Aqё3ʝ˷)rʸ\u0002\u001cfC3\u0016eUmt{O-\u001aX\u0017\"\u000b*:%WεA$nYh\u0013>\u0011D.DMSb3I1$b:rFa͐VɎ\n\u0014\u0013\u0002Ln\u001d'ϫB|CY\u0014֬\u0015\u000bUP\u0005fdȠ%`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d57[}.Fq 7+F?v\u0013\u001e\u0016dq@\u0016q\u0002", "", "u(E", "\u0016dX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015X0@V(FY2\f\u0002X0M", "u(5", "\u0014", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M3 ~\fZ;|\b\u001du\u0002*{N\u0010\u001b!PM\u0011@\u0002\u0003?`\b-E", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d[*>w#<#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eZe,\u000e\u0005>e~\u0016\fB\u0003\u0017%Vs\u0018ET(9d[*>w#<\fK7z4+\u0019dh\u0007\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7D(y\"A&\u00129WW", "3kTCT;>R\u0007\u000f|`,\u000b\u00183o\t\u0006~D\ft!Ny\u001bJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W,.\u0011\u00107K+xQEt", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":`Q2_\nHZ#\f", "7b^;66Gb\u0019\b\n<6\u0004\u0013<", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R||\u0005g\n\u0007\u0012>e\t7YJ\b!$", "3kTCT;>R\u0007\u000f|`,\u000b\u00183o\t\u0006~D\ft!Ny\u001bJ>tD`L\"Ek", "uI9\u0017=\u0011#:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fmLG;*e6P\fHvV", "3kTCT;>R\u0007\u000f|`,\u000b\u00183o\t\u0006~D\fv\u001eG\u0001\nKz/>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d]'7~\u0012=QMDA", "3kTCT;B]\"", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "3kTCT;>R\u0007\u000f|`,\u000b\u00183o\t\u0006~D\fv\u001eG\u0001\nKz/>!y,\u001c^\u0010zA", "uE5\u00139\r\u001f:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fmLG;*g3I\u00137w\u0005\u0016\u001fc", "AtV4X:MW#\bXa0\be9r~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9dZ*Dl\u0016;#", "0na1X9\u001c] \t\b", "2hb.U3>Ru\t\b],\nf9l\n5", "0na1X90W\u0018\u000e}", "AtV4X:MW#\bXa0\be9r~(\t\b\u007f\u0011dAl^(", "uI9\u0013?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7D(y!A,\u0007,VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "AtV4X:MW#\bXa0\be9r~(\t\b\u0004b\u001767\u007fN", "uY9\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b\u0001xQ6\u001f\u0015\u001aX\u000fEn\u0001a", "AtV4X:MW#\bXa0\bf9l\n5\n", "AtV4X:MW#\bXa0\bf9l\n5\n\bP&\u001e\u0016q\u001c:", "AtV4X:MW#\bXa0\bh6e\u0011$\u000bD\u000b ", "AtV4X:MW#\bXa0\bh6e\u0011$\u000bD\u000b ^C{r-pq)", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float Height = SuggestionChipTokens.INSTANCE.m3524getContainerHeightD9Ej5fM();
    private static final float IconSize = SuggestionChipTokens.INSTANCE.m3533getLeadingIconSizeD9Ej5fM();

    private SuggestionChipDefaults() {
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2555getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2556getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ChipColors suggestionChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1918570697, "C(suggestionChipColors)1739@86258L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSuggestionChipColors;
    }

    /* JADX INFO: renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2559suggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j7;
        long jM4214getUnspecified0d7_KjU2 = j2;
        long jM4214getUnspecified0d7_KjU3 = j5;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j6;
        long jM4214getUnspecified0d7_KjU6 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 1882647883, "C(suggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1761@87335L11:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1761)");
        }
        ChipColors chipColorsM1873copyFD3wquc = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1873copyFD3wquc(jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU4, Color.Companion.m4214getUnspecified0d7_KjU(), jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU, Color.Companion.m4214getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipColorsM1873copyFD3wquc;
    }

    /* JADX INFO: renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2560suggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float f8 = f7;
        float f9 = f4;
        float f10 = f3;
        float fM3525getDraggedContainerElevationD9Ej5fM = f6;
        float f11 = f5;
        float fM3531getFlatContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1929994057, "C(suggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            fM3531getFlatContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3531getFlatContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f10 = fM3531getFlatContainerElevationD9Ej5fM;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            f9 = fM3531getFlatContainerElevationD9Ej5fM;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            f11 = fM3531getFlatContainerElevationD9Ej5fM;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            fM3525getDraggedContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3525getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 & 32) != 0) {
            f8 = fM3531getFlatContainerElevationD9Ej5fM;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
        }
        ChipElevation chipElevation = new ChipElevation(fM3531getFlatContainerElevationD9Ej5fM, f10, f9, f11, fM3525getDraggedContainerElevationD9Ej5fM, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipElevation;
    }

    /* JADX INFO: renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m2558suggestionChipBorderh1eTWw(boolean z2, long j2, long j3, float f2, Composer composer, int i2, int i3) {
        float fM3532getFlatOutlineWidthD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -637354809, "C(suggestionChipBorder)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1812@89713L5,1814@89815L5:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j2 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            fM3532getFlatOutlineWidthD9Ej5fM = SuggestionChipTokens.INSTANCE.m3532getFlatOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
        }
        if (!z2) {
            j2 = j3;
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(fM3532getFlatOutlineWidthD9Ej5fM, j2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u00062;?Qia\u0001)][OHF=\"mV&H \ts\b\b\u001arK%Z\f\u000f\u001d+\u0016\u000f\\\u0015@~", replaceWith = @ReplaceWith(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m2557suggestionChipBorderd_3_b6Q(long j2, long j3, float f2, Composer composer, int i2, int i3) {
        float fM3532getFlatOutlineWidthD9Ej5fM = f2;
        long jM4177copywmQWz5c$default = j3;
        long value = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 439283919, "C(suggestionChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1838@90873L5,1840@90975L5:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            value = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 & 4) != 0) {
            fM3532getFlatOutlineWidthD9Ej5fM = SuggestionChipTokens.INSTANCE.m3532getFlatOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM4177copywmQWz5c$default, fM3532getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipBorder;
    }

    public final ChipColors elevatedSuggestionChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1671233087, "C(elevatedSuggestionChipColors)1857@91554L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedSuggestionChipColors$material3_release;
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2553elevatedSuggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j7;
        long jM4214getUnspecified0d7_KjU2 = j6;
        long jM4214getUnspecified0d7_KjU3 = j2;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j3;
        long jM4214getUnspecified0d7_KjU6 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, 1269423125, "C(elevatedSuggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1879@92652L11:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1879)");
        }
        ChipColors chipColorsM1873copyFD3wquc = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1873copyFD3wquc(jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU4, Color.Companion.m4214getUnspecified0d7_KjU(), jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU, Color.Companion.m4214getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipColorsM1873copyFD3wquc;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached$material3_release = colorScheme.getDefaultElevatedSuggestionChipColorsCached$material3_release();
        if (defaultElevatedSuggestionChipColorsCached$material3_release != null) {
            return defaultElevatedSuggestionChipColorsCached$material3_release;
        }
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m4214getUnspecified0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4214getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2554elevatedSuggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3527getElevatedDisabledContainerElevationD9Ej5fM = f7;
        float fM3525getDraggedContainerElevationD9Ej5fM = f6;
        float fM3529getElevatedHoverContainerElevationD9Ej5fM = f5;
        float fM3528getElevatedFocusContainerElevationD9Ej5fM = f4;
        float fM3530getElevatedPressedContainerElevationD9Ej5fM = f3;
        float fM3526getElevatedContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1118088467, "C(elevatedSuggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            fM3526getElevatedContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3526getElevatedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fM3530getElevatedPressedContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3530getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            fM3528getElevatedFocusContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3528getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3529getElevatedHoverContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3529getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            fM3525getDraggedContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3525getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 & 32) != 0) {
            fM3527getElevatedDisabledContainerElevationD9Ej5fM = SuggestionChipTokens.INSTANCE.m3527getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
        }
        ChipElevation chipElevation = new ChipElevation(fM3526getElevatedContainerElevationD9Ej5fM, fM3530getElevatedPressedContainerElevationD9Ej5fM, fM3528getElevatedFocusContainerElevationD9Ej5fM, fM3529getElevatedHoverContainerElevationD9Ej5fM, fM3525getDraggedContainerElevationD9Ej5fM, fM3527getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipElevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 641188183, "C1943@96240L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }
}
