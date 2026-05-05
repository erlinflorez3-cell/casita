package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:%c$\u007fCCU ~*\t]Wo˧vJp\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u0017˰JoU3UoCKhtL\u0005(݅*8\b\u000b\t\u001a0I\u0016ΔzYŷ<\u0012^?1?X\r̂\t\u001a \u0006\u0007+\u000f/tg|H\u000fqҺ>/1\u00162\u0002\\;w0+_=Jb<%v\u00104[Q=5#<k\u000e\u0017Tk?1Q Uݾl'-Dy\u0007]6f\u001a,\";Q\u001d]!8r\u0004\u007fxВ++U|\u0012Uˎ,w\t\u0017U\\\u0012*\u001e'vK]\u001et&&3#\u0012\u0004FV\u0002lb\u0018z\u00108҆$ĮĴ/;!\b_\u0004\u0004$\\Z\u0014\u0005;+i\u0006ͼ%[b2)ڈ\u001ab\u001bi1\u007fMmNT\ngb\u0006\u0004\u001f\u000220\n0U&G{?MG+=[GJ9k0gtm|\u0005n\u0011ki\u0001gp(t\u0016ES!\f\tc\u0015\u000bqPb\u0003D\u0011{;\u0005\r\u0004\b!Ktwj@U\u0016TOv\u0016\u0003M\f)U5l7g\u001c\u0004\u000e\u0006X\u000f9;Qq>yR%3oBh\u0005f\u0016ZS:y\r.(2V\u001b(w*c\u0015\u0011ȇ1ŭۇ 62b'\u000f]m\u0011QZA+=\u0010^vE\u0017TaZ3m2,!\u0001~\u0013!umxW4\u0015`P6\bVڤ\u001d&cZ9K\u000b$\u001f~\"\u0002űfնݺKkטy]\u0004 $\u001fQS5@!\u0013O@@\bEEztхP˧ʵ&y܃}\u0017Ch<l lv3nn\u001b^b\u001f:v\r{YMܐ\u0004}yH\u0001Qq_[qLU\u000b\u0003\bIv8+\u0013U\\{˛qݕ\u00019EE-,$\bҤ/\u001ei`oܒJ(a\u0017&z\u0005צ0\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%7a})Fm\u0015\u000b]RJu=|\u0015i]I\u000er:$", "", "u(E", "\u0010na1X90W\u0018\u000e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000fb9=S&p~];\u007fP\u000e9_-KAh", "u(5", "\u0014", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "0`b2F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHH0,\u0015gO<\u0003n,$", "5dc\u000fT:>A\u001cz\u0006^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u00189\u0010\u0001dAmLND(\b9&}Ih\u007fy\u0019\n@jF", "2dU.h3MA\u0019\u0001\u0003^5\f\t.B\u00107\u000bJ\nt!Ny\u001bJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%7a})Fm\u0015\u000b]RJu={\u001fokF\u00159", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eh^.\u0005\t8t\u007f'XP\u0010&!PM\u0018C\u00012C\u0018\u0006\u001cFm#2IJ\teA\u001e\u001ch]G\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNGA&vD@.\b+&\u0012Jw\u000b\u0015s\u0018<t}P,", "\u000fbc6i,\"Q#\b", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "\u0017b^;", "/bc6i,", "", "/bc6i,\u001c]\"\u000ezg;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7mP0g0OSv\t\u0004m,\u0006\u0018", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u0019&\u0017DnxB mQ\u0002 \u007fO)u\u001c=C=8", "0na1X9,b&\t\u0001^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "EhSA[", "0na1X9,b&\t\u0001^s\u0004S\u0001JN\u0012c", "uI5u?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG|Az\u0015.Z1Jx>$\u0015>", "1n[<e:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<+\u000f\rYJ3nC\u0014/\u0017;S\u000b\u0019r\b\u0016#\u001c\u000b", "/bc6i,\u001c]\"\u000evb5|\u0016\ro\u00072\t", "/bc6i,\u001c]\"\u000ezg;Z\u00136o\r", "/bc6i,\u001b]&}zk\n\u0007\u00109r", "7mP0g0OSv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "7mP0g0OSv\t\u0004m,\u0006\u0018\ro\u00072\t", "7mP0g0OSu\t\b],\nf9l\n5", "2hb.U3>Rt|\nb=|f9n\u000f$\u007fI\u0001$tQv\u0018I", "2hb.U3>Rt|\nb=|f9n\u000f(\u0005O^!\u001eQ|", "2hb.U3>Rt|\nb=|e9r~(\t\u001e\u000b\u001e!T", "2hb.U3>R|\bv\\;\u0001\u001a/C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "2hb.U3>R|\bv\\;\u0001\u001a/C\n1\u000b@\n&tQv\u0018I", "2hb.U3>R|\bv\\;\u0001\u001a/B\n5z@\u000et!Ny\u001b", "1n[<e:\u0006F%\u0013\u0007A0G", "uI9\u0017=\u0011#8}c_C\u0011c\u00058d\r2\u007f?\u0014`\u0015Qw\u0019F\u0005%~f\u000e)Fq\u001e.\u0017!Es?(#hn\u000fjG\u0010\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNa=3nQ;\u001b\u000fy\u0013o;j\t\f\u001f\u001d5iMRe\u001fQ\u0003r\u007fH3uT/", "7sT:F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "7mS2k", "", "1nd;g", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\f#3x\u0016w+MHt4+qdo9\u0006Q/J\u0002'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm{T@.\f4IK\u0019r\t\u0017 \u001c5wF&:S.u\u001etN3lEl)wQIPl8dUo!&<G \u001ft\u001d\u0019v\u001a\u001c\rw^\u0011H", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float BorderWidth = OutlinedSegmentedButtonTokens.INSTANCE.m3377getOutlineWidthD9Ej5fM();
    private static final float IconSize = OutlinedSegmentedButtonTokens.INSTANCE.m3376getIconSizeD9Ej5fM();

    private SegmentedButtonDefaults() {
    }

    public final SegmentedButtonColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 679457321, "C(colors)431@18542L11:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3_release = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSegmentedButtonColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m2470colorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j3;
        long jM4214getUnspecified0d7_KjU2 = j11;
        long jM4214getUnspecified0d7_KjU3 = j9;
        long jM4214getUnspecified0d7_KjU4 = j6;
        long jM4214getUnspecified0d7_KjU5 = j12;
        long jM4214getUnspecified0d7_KjU6 = j4;
        long jM4214getUnspecified0d7_KjU7 = j10;
        long jM4214getUnspecified0d7_KjU8 = j8;
        long jM4214getUnspecified0d7_KjU9 = j7;
        long jM4214getUnspecified0d7_KjU10 = j13;
        long jM4214getUnspecified0d7_KjU11 = j5;
        long jM4214getUnspecified0d7_KjU12 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 132526205, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color,9:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color,6:c#ui.graphics.Color)467@20709L11:SegmentedButton.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 16) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 256) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 512) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(132526205, i2, i3, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:467)");
        }
        SegmentedButtonColors segmentedButtonColorsM2455copy2qZNXz8 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2455copy2qZNXz8(jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return segmentedButtonColorsM2455copy2qZNXz8;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached$material3_release = colorScheme.getDefaultSegmentedButtonColorsCached$material3_release();
        if (defaultSegmentedButtonColorsCached$material3_release != null) {
            return defaultSegmentedButtonColorsCached$material3_release;
        }
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), colorScheme.m1933getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3_release(segmentedButtonColors);
        return segmentedButtonColors;
    }

    public final CornerBasedShape getBaseShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1264240381, "C512@23272L5:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:512)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cornerBasedShape;
    }

    /* JADX INFO: renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m2471getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final Shape itemShape(int i2, int i3, CornerBasedShape cornerBasedShape, Composer composer, int i4, int i5) {
        CornerBasedShape rectangleShape;
        ComposerKt.sourceInformationMarkerStart(composer, -942072063, "C(itemShape)P(2,1)528@23938L9:SegmentedButton.kt#uh7d8r");
        if ((i5 + 4) - (i5 | 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i4 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:528)");
        }
        if (i3 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return cornerBasedShape;
        }
        if (i2 == 0) {
            rectangleShape = ShapesKt.start(cornerBasedShape);
        } else if (i2 == i3 - 1) {
            rectangleShape = ShapesKt.end(cornerBasedShape);
        } else {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rectangleShape;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2472getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final void ActiveIcon(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273041460);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ActiveIcon)546@24428L147:SegmentedButton.kt#uh7d8r");
        if ((6 & i2) == 0) {
            i3 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((3 & i3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
            }
            IconKt.m2168Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, SizeKt.m1063size3ABfNKs(Modifier.Companion, IconSize), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.this;
                    int i5 = i2;
                    segmentedButtonDefaults.ActiveIcon(composer2, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)));
                }
            });
        }
    }

    public final void Icon(final boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        final Function2<? super Composer, ? super Integer, Unit> function2M1997getLambda1$material3_release = function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(683517296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Icon):SegmentedButton.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function2M1997getLambda1$material3_release) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i4 + 147) - (147 | i4) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                function2M1997getLambda1$material3_release = ComposableSingletons$SegmentedButtonKt.INSTANCE.m1997getLambda1$material3_release();
            }
            if (i7 != 0) {
                function23 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(683517296, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:566)");
            }
            if (function23 == null) {
                composerStartRestartGroup.startReplaceGroup(1631306250);
                ComposerKt.sourceInformation(composerStartRestartGroup, "578@25645L47,568@25168L524");
                AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m410scaleInL8ZKhE(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, TransformOriginKt.TransformOrigin(0.0f, 1.0f))), ExitTransition.Companion.getNone(), (String) null, ComposableLambdaKt.rememberComposableLambda(-750750819, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults.Icon.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i8) {
                        ComposerKt.sourceInformation(composer2, "C579@25663L15:SegmentedButton.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-750750819, i8, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:579)");
                        }
                        function2M1997getLambda1$material3_release.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((i4 + 14) - (i4 | 14))) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)), 18);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1631842116);
                ComposerKt.sourceInformation(composerStartRestartGroup, "582@25754L50,582@25722L82");
                int i8 = (i4 + 14) - (i4 | 14);
                CrossfadeKt.Crossfade(Boolean.valueOf(z2), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1364873619, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults.Icon.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                        invoke(bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3, Composer composer2, int i9) {
                        Function2<Composer, Integer, Unit> function24;
                        ComposerKt.sourceInformation(composer2, "C:SegmentedButton.kt#uh7d8r");
                        if ((i9 + 6) - (6 | i9) == 0) {
                            i9 = (-1) - (((-1) - i9) & ((-1) - (composer2.changed(z3) ? 4 : 2)));
                        }
                        if ((-1) - (((-1) - i9) | ((-1) - 19)) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1364873619, i9, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:582)");
                        }
                        if (z3) {
                            composer2.startReplaceGroup(94251810);
                            ComposerKt.sourceInformation(composer2, "582@25764L15");
                            function24 = function2M1997getLambda1$material3_release;
                        } else {
                            composer2.startReplaceGroup(94252484);
                            ComposerKt.sourceInformation(composer2, "582@25785L17");
                            function24 = function23;
                        }
                        function24.invoke(composer2, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i8 + 24576) - (i8 & 24576), 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function24 = function2M1997getLambda1$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults.Icon.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    SegmentedButtonDefaults.this.Icon(z2, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m2468borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j2, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = BorderWidth;
        }
        return segmentedButtonDefaults.m2469borderStrokel07J4OM(j2, f2);
    }

    /* JADX INFO: renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m2469borderStrokel07J4OM(long j2, float f2) {
        return BorderStrokeKt.m600BorderStrokecXLIe8U(f2, j2);
    }
}
