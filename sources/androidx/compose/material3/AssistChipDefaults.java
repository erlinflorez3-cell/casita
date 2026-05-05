package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:'c$\bCC٥\"}8\tWNmivJp\u000bKƤ\u000e\u0016\u0007s4I[\u0006e\u0012%2JoE>Sۖ=Oś%63\u001fr'>yڱ\u0005\u001a8HX%\tVc\f@Dpv@R\u001bb\u001d\u001a@\u001cn&\u0007\u001ej~f6v\u0003\u000e@5#\u0011\u0002ZNUav\u0002ת\fϿù+\u000f|z,E\tmC(=S1\"\u0003_M\u001fWqk\"\u0019--+W\to6\u0007\u0016D\u001b1O\u001bt\u000b&\u000b\u001b\u0002f\u0012'9g{K~\u0010n|¶zȞʀ\b\u0010\fEVMu%t(&3#\u007f\u001aEг\u0006^P!CBD7=\u007fa8i!lQo]1Ne\u00125\u0013$#\u000f\u00129[\u0003$\u0011\u001b!T\u0006uIQnSxT\u0010YK\u0013\u001cp\u0011\u0018Z\n6G\u000eU\u0014\u0011\\-U=a91H\u0004\u0002vZ\u0018|\u000b`v{\u0002RvVRt\u001c782$ZrzKpĥSА¯\u0015O\"~\u0015)P_.\t\u0010<OR@TUhw\u0019e]8'_l=Y|\u001b&Wg`c;Wc\u001e\u0012jvBAlh\u000bXtsk\f\t^X(8HxB\u0010{rP<\u00198?\u007fOL,_\u001b#\u001aɶ\u0002ٜնE~\u000f\u0014h\u001eX\nbi<\u0003\u00181;\u000eɹT\\~\u00110YWb\u0015`P:qW;\u00194w:hb\u0013S\r\u0005s\u000ej\u007fLub\u001d\u001c{U\nD.\u001agg_C\u0019\u000f\rNJ\u0002[[|xkQ[8?z+\u0010?An.u/\u0003pZv\u001bPUT%J\u000f^!98j\u0006yoo\u0013G\u0012jQ`ǥHͿè]>To\u000b0gj39\b\"+b]I-\u001d$&,/Cc\u000eou.\b\u0012'&#g42i\u0016}\u0013i]`=hO_~LS<l1Dxp}\bP;L\raJqjvVF\u0001#/,hM1߱o£ݍ>\u0015u7Bc0A\u0002D\u0016\u0014\rEӒ\u0010\u07bdтflߑOd\u0013J\u001d\u000f#}7q  \u000e7d]z\t^\b\u0605\u0017ܽن:aƀ@\u0011,4:A \rI[w\n`\n\u000eNw\u000fE;x9ŌZ\u0012lzb`V\u00101[n-B\u0001-\u001c[\u001e'CgCDۯVвg6\u0019U#\u0018)z \u0015t6CD\u0003FC(\u0007\u000fA\u00044ŞKΜ:\b_+s}}\u001cՇ\u0018\u0006%E\u001eéU\u007f\u0010gv6}πY\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006R3C]\f/\u0015p\u001a9,C<gD%$v7", "", "u(E", "\u0016dX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015X0@V(FY2\f\u0002X0M", "u(5", "\u0014", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M/'\r~l;Z\f3p]2\u0003J\u000e%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d[*>w#<#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eVl:\u0001\u0017>C\u0003,\u0007\u001e\u000b\u001e!T}LDr45f\u0002\u001c>;\u0010;MJ;gB\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7D(y\"A&\u00129WW", "2dU.h3M3 ~\fZ;|\b\u000bs\u000e,\nO^\u001a\u001bRM\u0018C\u00012C", "5dc\u0011X-:c \u000eZe,\u000e\u0005>e~\u0004\nN\u0005%&%r\u0012GT/<c\u000b.uu\u0012=MP?g;k\u000fua@\u0007_:N", "/rb6f;\u001cV\u001d\nWh9{\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9dZ*Dl\u0016;#", "0na1X9\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2hb.U3>Ru\t\b],\nf9l\n5", "0na1X90W\u0018\u000e}", "/rb6f;\u001cV\u001d\nWh9{\t<-~\"I:}g\u0003", "uI9\u0013?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7D(y!A,\u0007,VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "/rb6f;\u001cV\u001d\nWh9{\t<-\u0003s{/H\t)", "uY9\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b\u0001xQ6\u001f\u0015\u001aX\u000fEn\u0001a", "/rb6f;\u001cV\u001d\nXh3\u0007\u0016=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W,.\u0011\u00107K+xQEt", "1n]AT0GS&\\\u0005e6\n", ":`Q2_\nHZ#\f", ":dP1\\5@7\u0017\t\u0004<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "BqP6_0GU||\u0005g\n\u0007\u0012>e\t7YJ\b!$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\n&\u0017P~kF}/B", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b &Gx\u001d\u001a\u0001,?f", "/rb6f;\u001cV\u001d\nXh3\u0007\u0016=-\n4M2\u0001ai", "uI9\u0017=\u0011#8}evg+\n\u00133d\u0013qyJ\t\"!UoWI\u0007.D]\u0006 \u0001K 6XMIkAsxL% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u0016J:\r\u0012]=+<\u000e\u0015\"\f7'\fBr\u000e\u001ak", "/rb6f;\u001cV\u001d\nZe,\u000e\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d]'7~\u0012=QMDA", "3kTCT;B]\"", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "/rb6f;\u001cV\u001d\nZe,\u000e\u0005>i\n1C<\r{\bA<\u0002", "uE5\u00139\r\u001f:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fmLG;*g3I\u00137w\u0005\u0016\u001fc", "3kTCT;>Rt\r\tb:\ff2i\u000b\u0006\u0006G\u000b$%", "3kTCT;>Rt\r\tb:\ff2i\u000b\u0006\u0006G\u000b$%\u000fy\u001a\u000eh%\u007f,", "3kTCT;>Rt\r\tb:\ff2i\u000b\b\u0003@\u0012\u0013&Ky\u0017", "3kTCT;>Rt\r\tb:\ff2i\u000b\b\u0003@\u0012\u0013&Ky\u0017\u0004r1\u001aJwl+", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AssistChipDefaults {
    public static final int $stable = 0;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float Height = AssistChipTokens.INSTANCE.m3022getContainerHeightD9Ej5fM();
    private static final float IconSize = AssistChipTokens.INSTANCE.m3031getIconSizeD9Ej5fM();

    private AssistChipDefaults() {
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1804getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1805getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ChipColors assistChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1961061417, "C(assistChipColors)1019@48412L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
        }
        ChipColors defaultAssistChipColors$material3_release = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultAssistChipColors$material3_release;
    }

    /* JADX INFO: renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1800assistChipColorsoq7We08(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j7;
        long jM4214getUnspecified0d7_KjU2 = j6;
        long jM4214getUnspecified0d7_KjU3 = j5;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j9;
        long jM4214getUnspecified0d7_KjU6 = j3;
        long jM4214getUnspecified0d7_KjU7 = j8;
        long jM4214getUnspecified0d7_KjU8 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -391745725, "C(assistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)1045@49833L11:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
        }
        ChipColors chipColorsM1873copyFD3wquc = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1873copyFD3wquc(jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipColorsM1873copyFD3wquc;
    }

    public final ChipColors getDefaultAssistChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached$material3_release = colorScheme.getDefaultAssistChipColorsCached$material3_release();
        if (defaultAssistChipColorsCached$material3_release != null) {
            return defaultAssistChipColorsCached$material3_release;
        }
        ChipColors chipColors = new ChipColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* JADX INFO: renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1801assistChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float f8 = f7;
        float f9 = f5;
        float fM3023getDraggedContainerElevationD9Ej5fM = f6;
        float f10 = f4;
        float f11 = f3;
        float fM3029getFlatContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 245366099, "C(assistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            fM3029getFlatContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3029getFlatContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f11 = fM3029getFlatContainerElevationD9Ej5fM;
        }
        if ((i3 & 4) != 0) {
            f10 = fM3029getFlatContainerElevationD9Ej5fM;
        }
        if ((i3 & 8) != 0) {
            f9 = fM3029getFlatContainerElevationD9Ej5fM;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            fM3023getDraggedContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3023getDraggedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            f8 = fM3029getFlatContainerElevationD9Ej5fM;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
        }
        ChipElevation chipElevation = new ChipElevation(fM3029getFlatContainerElevationD9Ej5fM, f11, f10, f9, fM3023getDraggedContainerElevationD9Ej5fM, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipElevation;
    }

    /* JADX INFO: renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m1799assistChipBorderh1eTWw(boolean z2, long j2, long j3, float f2, Composer composer, int i2, int i3) {
        float fM3030getFlatOutlineWidthD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -1458649561, "C(assistChipBorder)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1118@53518L5,1120@53616L5:Chip.kt#uh7d8r");
        if ((i3 + 2) - (i3 | 2) != 0) {
            j2 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            j3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            fM3030getFlatOutlineWidthD9Ej5fM = AssistChipTokens.INSTANCE.m3030getFlatOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if (!z2) {
            j2 = j3;
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(fM3030getFlatOutlineWidthD9Ej5fM, j2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u00062;?QW_\r+k\\\u001emGDs\u001bY\u0018I-6:\u0017\u0001\u000f\u0004@+Y=\u0010e#\u001c;Z\u0015S\u0010S<;p5~MW!\u0001n4\b1O\u0015e\b)(\u001f>S\u0016", replaceWith = @ReplaceWith(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1798assistChipBorderd_3_b6Q(long j2, long j3, float f2, Composer composer, int i2, int i3) {
        float fM3030getFlatOutlineWidthD9Ej5fM = f2;
        long jM4177copywmQWz5c$default = j3;
        long value = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 382372847, "C(assistChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1145@54691L5,1147@54789L5:Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            value = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 & 4) != 0) {
            fM3030getFlatOutlineWidthD9Ej5fM = AssistChipTokens.INSTANCE.m3030getFlatOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM4177copywmQWz5c$default, fM3030getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipBorder;
    }

    public final ChipColors elevatedAssistChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 655175583, "C(elevatedAssistChipColors)1163@55344L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
        }
        ChipColors defaultElevatedAssistChipColors$material3_release = getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedAssistChipColors$material3_release;
    }

    /* JADX INFO: renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1802elevatedAssistChipColorsoq7We08(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j9;
        long jM4214getUnspecified0d7_KjU2 = j8;
        long jM4214getUnspecified0d7_KjU3 = j7;
        long jM4214getUnspecified0d7_KjU4 = j6;
        long jM4214getUnspecified0d7_KjU5 = j5;
        long jM4214getUnspecified0d7_KjU6 = j4;
        long jM4214getUnspecified0d7_KjU7 = j3;
        long jM4214getUnspecified0d7_KjU8 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -535762675, "C(elevatedAssistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)1189@56785L11:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
        }
        ChipColors chipColorsM1873copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1873copyFD3wquc(jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipColorsM1873copyFD3wquc;
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached$material3_release = colorScheme.getDefaultElevatedAssistChipColorsCached$material3_release();
        if (defaultElevatedAssistChipColorsCached$material3_release != null) {
            return defaultElevatedAssistChipColorsCached$material3_release;
        }
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    /* JADX INFO: renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1803elevatedAssistChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3025getElevatedDisabledContainerElevationD9Ej5fM = f7;
        float fM3023getDraggedContainerElevationD9Ej5fM = f6;
        float fM3027getElevatedHoverContainerElevationD9Ej5fM = f5;
        float fM3026getElevatedFocusContainerElevationD9Ej5fM = f4;
        float fM3028getElevatedPressedContainerElevationD9Ej5fM = f3;
        float fM3024getElevatedContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1457698077, "C(elevatedAssistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            fM3024getElevatedContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3024getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            fM3028getElevatedPressedContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3028getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            fM3026getElevatedFocusContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3026getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            fM3027getElevatedHoverContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3027getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            fM3023getDraggedContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3023getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 & 32) != 0) {
            fM3025getElevatedDisabledContainerElevationD9Ej5fM = AssistChipTokens.INSTANCE.m3025getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
        }
        ChipElevation chipElevation = new ChipElevation(fM3024getElevatedContainerElevationD9Ej5fM, fM3028getElevatedPressedContainerElevationD9Ej5fM, fM3026getElevatedFocusContainerElevationD9Ej5fM, fM3027getElevatedHoverContainerElevationD9Ej5fM, fM3023getDraggedContainerElevationD9Ej5fM, fM3025getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipElevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1988153916, "C1255@60496L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i2, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }
}
