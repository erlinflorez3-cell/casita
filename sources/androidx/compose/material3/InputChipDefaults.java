package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:%c$\bCC٥\"}0\u0012WNmgvJp\u000bK\u000f\f-\u0001jBI]xc\u0019\u0015̸B\u0006ЀcM\u001e<yez6ӯ$208Ba\u000f-BH>\u000b+GY!*0n\u0007jV\u001bd\u001d\u001a@\u001cn&\u0007\u001ej\u007ff6v\u0006\u000e@5#\u0011\u0004ZNUx`\u0003S\rTo?\r%zN1F7C1=S1 \u0003aE\u0003M\u000fU\u0005\u0017)W1OseTp\u007fB\u0017qT\u05ce\\ö͉`\u0007W\u007f\u001aGsZqlh\u000eV\u0007A\u0001Ɂ@\u0004\u001c(oγ-;;~\b<B%xY@^%vB.\u0014\u0012<\u001d%\u000eWC9I\u007f\u0002gA\u0019\\\\\u0014\u0005;7S\u0007t!iz&`C4\u0005}W1_gUH|#\nCs\u0004~\u000b\u001a*2Iw\u00065{\u001fW/%eti)'k\u0010r\\g%\u001e\u0011nYi`sX\"\u001d/g0\u000f\fhp|\u0005\u001ai\u0005^2\u0011[Il\u0007,!C&bwJO=\u0010|h\u0019opMk9=/\u0015P sā\rãߍb5;\u0002qA*\u001f\u0005FW<\u00118\tlHS\u001a\u000ft(P4xp\u0016w\nyf\fA4ow\"4:g1\\CJ3$HA\u000b@wZ\u0017\u0012/Z9$\u0011\"<t7\u0003\u0001bvou2a,+bh2݄PځԊ*W(#B8s\u001e\rt\u0018G\u0016NݺK˾خtTދ$\u001e\"9_4U\u0015\u0015\u000276RDSR\u000be\u007fOʵ&ϕݙx\u000e³l6o\bxuDbpQ]Xg9\u0005f\u000b#6fҹxӓĸyFϭX\u0013c>Ww\u001b[BWF\u0001U.,/\u0019oP\bkrϡ+!.y\u001a;#n.\u007f}<\u0012b=5\u001de2<\u001aTF̦SЄ6?PK_\u0010L4ؽl\fJKp͍$p\b<\r9gёh-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z.@i\r}:q!\rMD7{;-#>", "", "u(E", "\u000fuPAT9,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000ei(MO&l~s,Dg\u0003E\u0005w|(", "u(5", "\u0014", "\u0016dX4[;", "5dc\u0015X0@V(FY2\f\u0002X0M", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M7\"\n\u000bm\n\u007f\r:C\n/\u0006M\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0012(\u001crnG\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000e^g7\r\u0018\rh\u00043YJ\b!$U.\u00168\u0006%B]y'\u0005g#.TC7y4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNGA+nBF\u001b\u00053I_>l\fi \u0015?w~\u0018", "7m_Bg\nAW$[\u0005k+|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "Ad[2V;>R", "0na1X9\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ad[2V;>Ru\t\b],\nf9l\n5", "2hb.U3>Ru\t\b],\nf9l\n5", "2hb.U3>R\u0007~\u0002^*\f\t.B\n5z@\u000et!Ny\u001b", "0na1X90W\u0018\u000e}", "Ad[2V;>Ru\t\b],\nz3d\u000f+", "7m_Bg\nAW$[\u0005k+|\u0016v_Q\b\u0003\r\fv", "uYI\u0017=\u0011#4yevg+\n\u00133d\u0013qyJ\t\"!UoWI\u0007.D]\u0006 \u0001K 6XMIkAsxL% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001{\u00129H\u0002HV\u0010\u0019 \u00145@", "7m_Bg\nAW$\\\u0005e6\n\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<+\u0014\u0005WP kK7|\u000b0T_Eo\u000b\u0019$c", "1n]AT0GS&\\\u0005e6\n", ":`Q2_\nHZ#\f", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "BqP6_0GU||\u0005g\n\u0007\u00109r", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "Ad[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "Ad[2V;>R\u007fzw^3Z\u00136o\r", "Ad[2V;>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "Ad[2V;>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "7m_Bg\nAW$\\\u0005e6\n\u0017vk\u0012\r\r/cr", "uI9\u0017=\u0011#8}c_C\u0011ao+n~5\u0006D\u007f*`Ey\u0016G\u000135#\u000b0@|\u001a6M\r\u0019u<)\u001fvaF\\G\u00102:\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#I }DD#\u00043\u0017K)h\b\f\u0014\u001d1gwB4\u0013K\u0005r\u007fH3uT/", "7m_Bg\nAW$^\u0002^=x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0014%\u0015y]H\u000bm5$", "3kTCT;B]\"", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "7m_Bg\nAW$^\u0002^=x\u00183o\towLe\b\u0011\u0014c", "uE5\u00139\r\u001f:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fm\\D>\u001f\u0006;E~Bh^\u000f\u001a\u0019\u0015qpSR\u001fK\u0004\u001eK", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InputChipDefaults {
    public static final int $stable = 0;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float Height = InputChipTokens.INSTANCE.m3312getContainerHeightD9Ej5fM();
    private static final float IconSize = InputChipTokens.INSTANCE.m3314getLeadingIconSizeD9Ej5fM();
    private static final float AvatarSize = InputChipTokens.INSTANCE.m3310getAvatarSizeD9Ej5fM();

    private InputChipDefaults() {
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2180getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2181getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2179getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors inputChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -770375587, "C(inputChipColors)1568@77247L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
        }
        SelectableChipColors defaultInputChipColors$material3_release = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultInputChipColors$material3_release;
    }

    /* JADX INFO: renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m2183inputChipColorskwJvTHA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j14;
        long jM4214getUnspecified0d7_KjU2 = j13;
        long jM4214getUnspecified0d7_KjU3 = j8;
        long jM4214getUnspecified0d7_KjU4 = j11;
        long jM4214getUnspecified0d7_KjU5 = j9;
        long jM4214getUnspecified0d7_KjU6 = j7;
        long jM4214getUnspecified0d7_KjU7 = j6;
        long jM4214getUnspecified0d7_KjU8 = j12;
        long jM4214getUnspecified0d7_KjU9 = j10;
        long jM4214getUnspecified0d7_KjU10 = j4;
        long jM4214getUnspecified0d7_KjU11 = j2;
        long jM4214getUnspecified0d7_KjU12 = j5;
        long jM4214getUnspecified0d7_KjU13 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 1312840646, "C(inputChipColors)P(0:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1605@79387L11:Chip.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU13 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 4) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 8) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 16) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 32) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 64) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 512) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 4096) - (i4 | 4096) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i2, i3, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
        }
        SelectableChipColors selectableChipColorsM2478copydaRQuJA = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2478copydaRQuJA(jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU13, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipColorsM2478copydaRQuJA;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached$material3_release = colorScheme.getDefaultInputChipColorsCached$material3_release();
        if (defaultInputChipColorsCached$material3_release != null) {
            return defaultInputChipColorsCached$material3_release;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedTrailingIconColor()), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* JADX INFO: renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2184inputChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float f8 = f7;
        float f9 = f5;
        float f10 = f4;
        float f11 = f3;
        float fM3313getDraggedContainerElevationD9Ej5fM = f6;
        float fM3311getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1745270109, "C(inputChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            fM3311getContainerElevationD9Ej5fM = InputChipTokens.INSTANCE.m3311getContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            f11 = fM3311getContainerElevationD9Ej5fM;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            f10 = fM3311getContainerElevationD9Ej5fM;
        }
        if ((i3 & 8) != 0) {
            f9 = fM3311getContainerElevationD9Ej5fM;
        }
        if ((i3 & 16) != 0) {
            fM3313getDraggedContainerElevationD9Ej5fM = InputChipTokens.INSTANCE.m3313getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 & 32) != 0) {
            f8 = fM3311getContainerElevationD9Ej5fM;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM3311getContainerElevationD9Ej5fM, f11, f10, f9, fM3313getDraggedContainerElevationD9Ej5fM, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipElevation;
    }

    /* JADX INFO: renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m2182inputChipBorder_7El2pE(boolean z2, boolean z3, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        float fM3317getUnselectedOutlineWidthD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 2050575347, "C(inputChipBorder)P(4,5,0:c#ui.graphics.Color,6:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,1:c#ui.unit.Dp,7:c#ui.unit.Dp)1700@84707L5,1703@84866L5:Chip.kt#uh7d8r");
        if ((i3 + 4) - (i3 | 4) != 0) {
            j2 = ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            j3 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i3 & 16) != 0) {
            j4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            j5 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            fM3317getUnselectedOutlineWidthD9Ej5fM = InputChipTokens.INSTANCE.m3317getUnselectedOutlineWidthD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            f3 = InputChipTokens.INSTANCE.m3315getSelectedOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if (!z2) {
            j2 = z3 ? j5 : j4;
        } else if (z3) {
            j2 = j3;
        }
        if (z3) {
            fM3317getUnselectedOutlineWidthD9Ej5fM = f3;
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(fM3317getUnselectedOutlineWidthD9Ej5fM, j2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1052444143, "C1721@85639L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i2, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }
}
