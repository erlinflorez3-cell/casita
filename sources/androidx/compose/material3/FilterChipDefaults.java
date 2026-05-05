package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:)c$\bCCU \n*\teNogtQb\u000bY\u000f\u000eǝ\u0001j:R]xc\u001e\u0015̸B\u0006ЀcM\u001e<yez6ӯ$208B\u0010\u000f-BH>\u0004AHƚ\u0010\u0012>T9øQ\u001b`\u001d\u001a@\u0013n&\u0007\u001ej|f6v\u0003\u000e@5#\u0011\u0001ZNUu`\u0003S\rTl?\r%wN1F7C.=S1\u001d\u0003aE\u0003M\fU\u0005\u0017=W1OseQp\u007fB+[U\u0013]\u0001Bt\u0005\u007fv<-1Oqhh\u000eV\u000e+\u0002\u0013<\u0012,\u001e'vD] l\b\u001cR\rr\u0002V\u0001\bdB\u000e\u001by6E;0919)\biai/\u0015<\u009e\u0004ټ̷'\u0003tCiwV-#?lw\u007fV\u0002FCH\\0q=\u001c\u0006!h\b*\u0012W_\u007f]}A4\u001d%E\u0004Q#Om2NJg\u0005.xh\u0002k\u0003NF\"|@O*7\u000e\u000bJj\u0005y{lXZ\u0013\u0014!Ϻ\u0006âݔ\u0017\"b$JNml\\}\u0001i\u0019|\u000e\u000e3_~7\b \u001c\u0012ekv3c\u0003\u0014\u0016gR\u0005GW<\u0011\u001b\tlHS\u001a\u000ft(PHxp\u0016w\nyf\fAHow\"4:g1\\C^3$HA\u000b@wZ\u0017\u0012/Z9$\u0011\"<t7\u0003\u0017a̒nΟ֑M.\u0003\u001a0g\n\\CT>UPuz\u0002ɠ\u000b~\u0002\u0014\u0010ѐKU\b\u0005\u0016$b,&\u001c\u001aGfG=A%//8\u0002;\\dr\u0014g}\u0018-z\u000b\u0012';\u0017D\u0018\u000epp:y\u0003J}jG(|^\u0001= d.\u0010\u0012L\u0001Gqo#[l_#\t_<\\T\u0015\u0005M4U\u0007u\"\u000bRECU3F}\u001a/#\u007fui\u001eD*h\u0015&\u0003\u0005\u001c,\u0012, hW]@[PI\b\u0015n(*l\u0011c`j&\u001e\t\u000eϢ\fΉȈEfv\u0013FpS{\f$\u001f,;\u0016\u0007a@\u0013}$L.\u000e,$I\u0004\u0014lj=\u0011{U\u0018ssKj3b\u000f8\r,7t\u0012*f8V\u0006d96\fs&`Y;\u0011\u0007l\u000f*4:g \u000bqV0\u000bڄyĔʮc\u0011\u001dpP!\fm\u001cU\u0011\\\u0005JЬ_Ѥɰ )ܣ\u0003\u0017;\u001e\u0007:I\u0007sIb34I\u000fY5\tIḷ}ܺ\u0000*Cȗ=#0X\u000f\u0010]_IP\u0010:TV7u\u0004o:ANBܫF\u001c3;W\u001bm\u0002\u0001t\u0019a|N\u0013\u0004:f\u0001\\XgUҔ~ɽ@\u000e'\r\u001f^\u0001\u007f3CZ_\u00107q')\u0017r7=JSݮHɴ1\nM/C[x$ՠ{`[>\u0004к<N&\ft'{ߏ\u0012&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W)<h}-\u0015p\u001a9,C<gD%$v7", "", "u(E", "\u0016dX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015X0@V(FY2\f\u0002X0M", "u(5", "\u0014", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M3 ~\fZ;|\b\u0010i\u00077{M^\u001a\u001bRM\u0018C\u00012C", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0012(\u001crnG\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eZe,\u000e\u0005>e~\t\u007fG\u0010\u0017$%r\u0012GT/<c\u000b.uu\u0012=MP?g;k\u000fua@\u0007_:N", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNGA+nBF\u001b\u00053I_>l\fi \u0015?w~\u0018", "2dU.h3M4\u001d\u0006\n^9Z\f3p]2\u0003J\u000e%", "5dc\u0011X-:c \u000e[b3\f\t<C\u0003,\u0007\u001e\u000b\u001e!T}LDr45f\u0002\u001c>;\u0010;MJ;gB\u001e", "3kTCT;>Ry\u0003\u0002m,\nf2i\u000b\u0006\u0006G\u000b$%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<+\u0014\u0005WP kK7|\u000b0T_Eo\u000b\u0019$c", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":`Q2_\nHZ#\f", "7b^;66E]&", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u007fzw^3Z\u00136o\r", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "Ad[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "Ad[2V;>R\u007fzw^3Z\u00136o\r", "Ad[2V;>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "Ad[2V;>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "3kTCT;>Ry\u0003\u0002m,\nf2i\u000b\u0006\u0006G\u000b$%\u000fb\u001aP\u0003\b9$", "uI9\u0017=\u0011#8}c_C\u0011c\u00058d\r2\u007f?\u0014`\u0015Qw\u0019F\u0005%~f\u000e)Fq\u001e.\u0017!Es?(#hn\u000fjG\u0010\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNa=3nQ;\u001b\u000fy\u0013o;o\u0001\n%\n2qp Y\u0014RW\u001f|K6v\u001c", "3kTCT;>Ry\u0003\u0002m,\nf2i\u000b\b\u0003@\u0012\u0013&Ky\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0014%\u0015y]H\u000bm5$", "3kTCT;B]\"", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "3kTCT;>Ry\u0003\u0002m,\nf2i\u000b\b\u0003@\u0012\u0013&Ky\u0017\u0004r1\u001aJwl+", "uE5\u00139\r\u001f:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fm\\D>\u001f\u0006;E~Bh^\u000f\u001a\u0019\u0015qpSR\u001fK\u0004\u001eK", "4h[AX9\u001cV\u001d\nWh9{\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "Ad[2V;>R", "0na1X9\u001c] \t\b", "Ad[2V;>Ru\t\b],\nf9l\n5", "2hb.U3>Ru\t\b],\nf9l\n5", "2hb.U3>R\u0007~\u0002^*\f\t.B\n5z@\u000et!Ny\u001b", "0na1X90W\u0018\u000e}", "Ad[2V;>Ru\t\b],\nz3d\u000f+", "4h[AX9\u001cV\u001d\nWh9{\t<-yy[GM\"v", "uYI\u0017=\u0011#4yevg+\n\u00133d\u0013qyJ\t\"!UoWI\u0007.D]\u0006 \u0001K 6XMIkAsxL% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001{\u00129H\u0002HV\u0010\u0019 \u00145@", "4h[AX9\u001cV\u001d\nXh3\u0007\u0016=", "4h[AX9\u001cV\u001d\nXh3\u0007\u0016=-r4\u0010Lc\u001ba", "4h[AX9\u001cV\u001d\nZe,\u000e\u0005>i\n1", "4h[AX9\u001cV\u001d\nZe,\u000e\u0005>i\n1C<\r{\bA<\u0002", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FilterChipDefaults {
    public static final int $stable = 0;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float Height = FilterChipTokens.INSTANCE.m3291getContainerHeightD9Ej5fM();
    private static final float IconSize = FilterChipTokens.INSTANCE.m3307getIconSizeD9Ej5fM();

    private FilterChipDefaults() {
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2131getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2132getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final SelectableChipColors filterChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1743772077, "C(filterChipColors)1273@61089L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilterChipColors$material3_release;
    }

    /* JADX INFO: renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m2129filterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j13;
        long jM4214getUnspecified0d7_KjU2 = j9;
        long jM4214getUnspecified0d7_KjU3 = j11;
        long jM4214getUnspecified0d7_KjU4 = j10;
        long jM4214getUnspecified0d7_KjU5 = j8;
        long jM4214getUnspecified0d7_KjU6 = j7;
        long jM4214getUnspecified0d7_KjU7 = j5;
        long jM4214getUnspecified0d7_KjU8 = j6;
        long jM4214getUnspecified0d7_KjU9 = j4;
        long jM4214getUnspecified0d7_KjU10 = j12;
        long jM4214getUnspecified0d7_KjU11 = j3;
        long jM4214getUnspecified0d7_KjU12 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1831479801, "C(filterChipColors)P(0:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1308@63087L11:Chip.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 64) - (i4 | 64) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 256) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i2, i3, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
        }
        SelectableChipColors selectableChipColorsM2478copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2478copydaRQuJA(jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipColorsM2478copydaRQuJA;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached$material3_release = colorScheme.getDefaultFilterChipColorsCached$material3_release();
        if (defaultFilterChipColorsCached$material3_release != null) {
            return defaultFilterChipColorsCached$material3_release;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getFlatSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor()), FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* JADX INFO: renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2130filterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float f8 = f7;
        float fM3292getDraggedContainerElevationD9Ej5fM = f6;
        float fM3300getFlatSelectedHoverContainerElevationD9Ej5fM = f5;
        float fM3299getFlatSelectedFocusContainerElevationD9Ej5fM = f4;
        float fM3302getFlatSelectedPressedContainerElevationD9Ej5fM = f3;
        float fM3298getFlatContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -757972185, "C(filterChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            fM3298getFlatContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3298getFlatContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fM3302getFlatSelectedPressedContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3302getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            fM3299getFlatSelectedFocusContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3299getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            fM3300getFlatSelectedHoverContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3300getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            fM3292getDraggedContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3292getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            f8 = fM3298getFlatContainerElevationD9Ej5fM;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM3298getFlatContainerElevationD9Ej5fM, fM3302getFlatSelectedPressedContainerElevationD9Ej5fM, fM3299getFlatSelectedFocusContainerElevationD9Ej5fM, fM3300getFlatSelectedHoverContainerElevationD9Ej5fM, fM3292getDraggedContainerElevationD9Ej5fM, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipElevation;
    }

    /* JADX INFO: renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m2128filterChipBorder_7El2pE(boolean z2, boolean z3, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        long value = j2;
        float fM3305getFlatUnselectedOutlineWidthD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -1138342447, "C(filterChipBorder)P(4,5,0:c#ui.graphics.Color,6:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,1:c#ui.unit.Dp,7:c#ui.unit.Dp)1406@68670L5,1409@68834L5:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            value = ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            j3 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            j4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            j5 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            fM3305getFlatUnselectedOutlineWidthD9Ej5fM = FilterChipTokens.INSTANCE.m3305getFlatUnselectedOutlineWidthD9Ej5fM();
        }
        if ((i3 & 128) != 0) {
            f3 = FilterChipTokens.INSTANCE.m3301getFlatSelectedOutlineWidthD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z2) {
            value = z3 ? j5 : j4;
        } else if (z3) {
            value = j3;
        }
        if (z3) {
            fM3305getFlatUnselectedOutlineWidthD9Ej5fM = f3;
        }
        BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(fM3305getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM600BorderStrokecXLIe8U;
    }

    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1082953289, "C(elevatedFilterChipColors)1430@69720L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedFilterChipColors$material3_release;
    }

    /* JADX INFO: renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m2126elevatedFilterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j8;
        long jM4214getUnspecified0d7_KjU2 = j10;
        long jM4214getUnspecified0d7_KjU3 = j12;
        long jM4214getUnspecified0d7_KjU4 = j9;
        long jM4214getUnspecified0d7_KjU5 = j13;
        long jM4214getUnspecified0d7_KjU6 = j11;
        long jM4214getUnspecified0d7_KjU7 = j7;
        long jM4214getUnspecified0d7_KjU8 = j3;
        long jM4214getUnspecified0d7_KjU9 = j4;
        long jM4214getUnspecified0d7_KjU10 = j6;
        long jM4214getUnspecified0d7_KjU11 = j2;
        long jM4214getUnspecified0d7_KjU12 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, -915841711, "C(elevatedFilterChipColors)P(0:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1465@71739L11:Chip.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 4) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 8) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 64) - (i4 | 64) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 256) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 512) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 2048) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i2, i3, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
        }
        SelectableChipColors selectableChipColorsM2478copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2478copydaRQuJA(jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipColorsM2478copydaRQuJA;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached$material3_release = colorScheme.getDefaultElevatedFilterChipColorsCached$material3_release();
        if (defaultElevatedFilterChipColorsCached$material3_release != null) {
            return defaultElevatedFilterChipColorsCached$material3_release;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    /* JADX INFO: renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2127elevatedFilterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3294getElevatedDisabledContainerElevationD9Ej5fM = f7;
        float fM3292getDraggedContainerElevationD9Ej5fM = f6;
        float fM3296getElevatedHoverContainerElevationD9Ej5fM = f5;
        float fM3295getElevatedFocusContainerElevationD9Ej5fM = f4;
        float fM3297getElevatedPressedContainerElevationD9Ej5fM = f3;
        float fM3293getElevatedContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 684803697, "C(elevatedFilterChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            fM3293getElevatedContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3293getElevatedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fM3297getElevatedPressedContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3297getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            fM3295getElevatedFocusContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3295getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            fM3296getElevatedHoverContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3296getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            fM3292getDraggedContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3292getDraggedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            fM3294getElevatedDisabledContainerElevationD9Ej5fM = FilterChipTokens.INSTANCE.m3294getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM3293getElevatedContainerElevationD9Ej5fM, fM3297getElevatedPressedContainerElevationD9Ej5fM, fM3295getElevatedFocusContainerElevationD9Ej5fM, fM3296getElevatedHoverContainerElevationD9Ej5fM, fM3292getDraggedContainerElevationD9Ej5fM, fM3294getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return selectableChipElevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1598643637, "C1547@76563L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i2, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }
}
