package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.npmdavi.davinotification.Constant;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDJj|\u0004O\u00068é6B\u0015\"4\u0012\u000e\u0007nj?1Le^.Zݷ2\u000f\u0002{<$a+yCQU\"Ԃ*\teNo˧vJh\u0014KƤ\u000e\u0016\u000fj4I[\u007fuu\u001d:Zom<}~KCx\u007fF\u000702PA(\u0010в\u001e*N\u001c'\nQX$\u001d@B\u0001:\u0001\u0016{\u0010ܨ\u0016\u0006D,1/jufCXnm:],\u0019hpYϮc0\u0003Y=Jb6%v\u0010.[DEF-%\u0002\u00157ViR\u001b? OKiӠ&ǢʁwY<l\u000e)-\u0011]#urTe5`n\u0016?6_e[P<1&\u0006ԫ\u0011<\n\u001a68V;E'v\n\u001e3#{i?~\rެF\u007f\u0001mf(3\u000eK8I\u001dvQ\u0010D/Me\u0007˿\u0011\u001e)\r\u001f%ic&`C+\u0005{_Hi@kZ~\u000egU\u0006\u0004\u001ftH+̯/ϚĬ3}\u0017G%:ODG=9k0Qtk\u0005 xh\u0002\u0006\u0003NF\"|3O*7*\u000bJj\u0005yolXZ1}\"Z\u0007\f)+ \u000b\u001al'+\u0010\\r\u0001i\u0019_\u000e\u0010+/t[qn\u001a \b?d3Cv{\u0010\u0010d'\u001aE<p\u0016pfpe<`b(0E`j>\nBIā\u000bƎ\u0558Cs\"Z:X1¼\u0014V\u001d6Bo\u00069e`h\u001e\u001cl3R!\u001a7z\t\u000f]t}\u007fi\tIZ\u0006v![Lپ9\u0019,aR{:|1\u0015\u0017\u0001\u0010IwLuU\u0003\u0015$`ދ$\u0016 E\u00025C\u0013\u001d\u001eA20MuRxe_n*')\u001f*\u0015Ah<\u000b j\u001f>\u0011pPOb;:v\r\u0005S\u000ej\u007f\br^zuu\u0005\u0011a>W\u0006\u001bYj`h\f\u0013G60\u0011q2|c6q2ޗ\u001aw\u001a;[fՙh۰Ц}d\u0015O\u0003\u0010$:qܞ\bb\u007f\\\tձ:ա]\u0001F\"2l#PVk\u0010\bp\b\u000bق5ȈEfxVFM+=\fh\u001f,;o-ܭ<݇s\u007f<.m*\u0014Q\f\u0017vCS\u0010$όiƽqMd\u000bX\u000f*\u0019\n5\u0007\u0012J<v\u074bYť\r2\u000es&6aIp\nT\tR3\u0003ч\nդGVq\u0006\u001ez Tm\u0015/2pr\u0012ٜ\u0010֭|^^H\u0013`en/1\u0019~=2tְ7̰\toNT=cѥ\u0001X%\f!ˤk-eް/o"}, d2 = {"\u0011n]AT0GS&fvq\u001e\u0001\b>h", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0016dX4[;-]y\u0003\bl;c\r8e", "\u0016na6m6Gb\u0015\u0006hi(z\r8g", "\u0016na6m6Gb\u0015\u0006hi(z\r8g\\8\u000bO\u000b \u0005Kn\u000e", "\u001an]45<Mb#\bk^9\f\r-a\u0007\u0012|A\u000f\u0017&", "!d_.e(MSu\u000f\nm6\u0006hBt\r$o", "!mP0^):`\n~\bm0z\u00056P{'zD\n\u0019", "\"dgA85=3,\u000e\bZ\u001a\b\u0005-i\t*", "\u001cdf\u0019\\5>0)\u000e\nh5j\u0012+c\u0006%wM", "", "BdgA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "/bc6b5", "2hb:\\:L/\u0017\u000e~h5", "/bc6b5-S,\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "/bc6b5\u001c]\"\u000ezg;Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2hb:\\:L/\u0017\u000e~h5Z\u00138t\u007f1\u000b\u001e\u000b\u001e!T", "\u001cdf\u0019\\5>0)\u000e\nh5j\u0012+c\u0006%wMH\u001d|S:\u0019\u000bR", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]\u0001\u0019.w\u001a\u001d\n\u000fb~\u0002f\u0001g=,}a4-=zeJD\u0003\u001f:~/*U\nw[?h}:x5\u0004}\b@l\u0010Uu\u0018K4\\X\u001d", "\u001dmT\u001fb>,\\\u0015|\u0001[(\n", "/bc6b5-S,\u000eXh3\u0007\u0016", "2hb:\\:L/\u0017\u000e~h5Z\u00136o\r", "\u001dmT\u001fb>,\\\u0015|\u0001[(\nP5K\fr\u0007\u000f\\", "!mP0^):`", "AmP0^):`wz\nZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zt*\\?\u0011", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/bc6b5(\\\u0002~\rE0\u0006\t", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "1n]AX5M1#\u0006\u0005k", "/bc6b5\u001c] \t\b", "!mP0^):``\rYD;\tX}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013>U{&4i#\rIR7A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]yd\rR,\u0011\u0005f\u0017\u0019U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)gJ=Pb\u007fIpD\u0002A!6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1tW\"\n<,>79PMz_Jt4t/_;\u0003", "1n]AX5M", "!mP0^):``~f;5l\u000f\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O\n\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m\u0016~\u0015&kT,\u0018EA\u0014n]y=L,}_\u001f*H|bJN9ZM|p [\u0005u!6b}9>\u000e\u0014=(Eh\u000fT4m%Z\u0002\u00149fE&9\u007f:\u001dGVm\u0004l\b\u001bx(p\f\u0016b~\u000f#mpmV\u000f\u00143z?xR", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = Dp.m6638constructorimpl(600);
    private static final float HeightToFirstLine = Dp.m6638constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m6638constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m6638constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m6638constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m6638constructorimpl(12);

    /* JADX INFO: renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    public static final void m2546SnackbareQBnUkQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z2, Shape shape, long j2, long j3, long j4, long j5, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        long actionContentColor = j4;
        long contentColor = j3;
        Shape shape2 = shape;
        boolean z3 = z2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        long color = j2;
        long dismissActionContentColor = j5;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1235788955);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Snackbar)P(8!1,6,2,9,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.graphics.Color)107@5066L5,108@5118L5,109@5168L12,110@5231L18,111@5307L25,120@5574L1123,114@5378L1319:Snackbar.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 32 : 16)));
        }
        int i7 = (i3 + 4) - (i3 | 4);
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            int i9 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i10 = ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(shape2)) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((196608 & i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(color)) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(contentColor)) ? 1048576 : 524288;
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i11 = ((i3 & 128) == 0 && composerStartRestartGroup.changed(actionContentColor)) ? 8388608 : 4194304;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((100663296 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(dismissActionContentColor)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i3 & 512) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function25 = null;
                }
                function24 = i7 == 0 ? function22 : null;
                if (i8 != 0) {
                    z3 = false;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
                if ((i3 + 256) - (i3 | 256) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 234881025) - (i4 | (-234881025));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((i3 + 256) - (i3 | 256) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-234881025)));
                }
                function24 = function22;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235788955, i4, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:113)");
            }
            float fM3520getContainerElevationD9Ej5fM = SnackbarTokens.INSTANCE.m3520getContainerElevationD9Ej5fM();
            final boolean z4 = z3;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
            final long j6 = actionContentColor;
            final long j7 = dismissActionContentColor;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C121@5634L5,122@5705L5,123@5779L912,123@5719L972:Snackbar.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1829663446, i12, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
                        }
                        TextStyle value = TypographyKt.getValue(SnackbarTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                        final TextStyle value2 = TypographyKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(value);
                        final boolean z5 = z4;
                        final Function2<Composer, Integer, Unit> function28 = function26;
                        final Function2<Composer, Integer, Unit> function29 = function23;
                        final Function2<Composer, Integer, Unit> function210 = function27;
                        final long j8 = j6;
                        final long j9 = j7;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i13) {
                                ComposerKt.sourceInformation(composer3, "C:Snackbar.kt#uh7d8r");
                                if ((-1) - (((-1) - i13) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(835891690, i13, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
                                    }
                                    if (z5 && function28 != null) {
                                        composer3.startReplaceGroup(-810715387);
                                        ComposerKt.sourceInformation(composer3, "126@5873L383");
                                        SnackbarKt.m2544NewLineButtonSnackbarkKq0p4A(function29, function28, function210, value2, j8, j9, composer3, 0);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-810701708);
                                        ComposerKt.sourceInformation(composer3, "135@6301L366");
                                        SnackbarKt.m2545OneRowSnackbarkKq0p4A(function29, function28, function210, value2, j8, j9, composer3, 0);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54);
                        int i13 = ProvidedValue.$stable;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, composableLambdaRememberComposableLambda2, composer2, (i13 + 48) - (i13 & 48));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i12 = i4 >> 9;
            int i13 = (-1) - (((-1) - ((-1) - (((-1) - (i4 & 14)) & ((-1) - 12779520)))) & ((-1) - ((-1) - (((-1) - i12) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))));
            int i14 = (i12 + 896) - (i12 | 896);
            int i15 = (i13 + i14) - (i13 & i14);
            int i16 = (-1) - (((-1) - i12) | ((-1) - 7168));
            SurfaceKt.m2561SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, fM3520getContainerElevationD9Ej5fM, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i16 + i15) - (i16 & i15), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function24 = function22;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z5 = z3;
            final Shape shape3 = shape2;
            final long j8 = color;
            final long j9 = contentColor;
            final long j10 = actionContentColor;
            final long j11 = dismissActionContentColor;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                public final void invoke(Composer composer2, int i17) {
                    Modifier modifier3 = modifier2;
                    Function2<Composer, Integer, Unit> function29 = function28;
                    Function2<Composer, Integer, Unit> function210 = function24;
                    boolean z6 = z5;
                    Shape shape4 = shape3;
                    long j12 = j8;
                    long j13 = j9;
                    long j14 = j10;
                    long j15 = j11;
                    Function2<Composer, Integer, Unit> function211 = function23;
                    int i18 = i2;
                    SnackbarKt.m2546SnackbareQBnUkQ(modifier3, function29, function210, z6, shape4, j12, j13, j14, j15, function211, composer2, RecomposeScopeImplKt.updateChangedFlags((i18 + 1) - (i18 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Snackbar-sDKtq54, reason: not valid java name */
    public static final void m2547SnackbarsDKtq54(final SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, long j5, long j6, Composer composer, final int i2, final int i3) {
        int i4;
        long dismissActionContentColor = j6;
        long actionContentColor = j5;
        long contentColor = j3;
        Shape shape2 = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        long color = j2;
        final long actionColor = j4;
        Composer composerStartRestartGroup = composer.startRestartGroup(274621471);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Snackbar)P(8,6,2,7,3:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color)205@9602L5,206@9654L5,207@9704L12,208@9760L11,209@9822L18,210@9898L25,251@11371L38,241@10959L456:Snackbar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(snackbarData) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i7 = (i3 + 4) - (i3 | 4);
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(shape2)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(color)) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(contentColor)) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(actionColor)) ? 1048576 : 524288;
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(actionContentColor)) ? 8388608 : 4194304;
        }
        if ((100663296 + i2) - (100663296 | i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(dismissActionContentColor)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i4)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 234881025) - (i4 | (-234881025));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    i4 = (i4 - 234881025) - (i4 | (-234881025));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274621471, i4, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
            }
            final String actionLabel = snackbarData.getVisuals().getActionLabel();
            composerStartRestartGroup.startReplaceGroup(1561344786);
            ComposerKt.sourceInformation(composerStartRestartGroup, "215@10097L267");
            ComposableLambda composableLambdaRememberComposableLambda = actionLabel != null ? ComposableLambdaKt.rememberComposableLambda(-1378313599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C217@10171L44,218@10247L32,219@10311L21,216@10115L235:Snackbar.kt#uh7d8r");
                    if ((-1) - (((-1) - i8) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1378313599, i8, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)");
                        }
                        ButtonColors buttonColorsM1837textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1837textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                        ComposerKt.sourceInformationMarkerStart(composer2, 642119911, "CC(remember):Snackbar.kt#9igjgp");
                        boolean zChanged = composer2.changed(snackbarData);
                        final SnackbarData snackbarData2 = snackbarData;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.performAction();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        final String str = actionLabel;
                        ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, buttonColorsM1837textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope rowScope, Composer composer3, int i9) {
                                ComposerKt.sourceInformation(composer3, "C219@10313L17:Snackbar.kt#uh7d8r");
                                if ((-1) - (((-1) - i9) | ((-1) - 17)) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(521110564, i9, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:219)");
                                }
                                TextKt.m2711Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, 494);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1561358724);
            ComposerKt.sourceInformation(composerStartRestartGroup, "227@10548L362");
            ComposableLambda composableLambdaRememberComposableLambda2 = snackbarData.getVisuals().getWithDismissAction() ? ComposableLambdaKt.rememberComposableLambda(-1812633777, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C229@10608L26,228@10566L330:Snackbar.kt#uh7d8r");
                    if ((i8 + 3) - (3 | i8) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1812633777, i8, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, 642131457, "CC(remember):Snackbar.kt#9igjgp");
                        boolean zChanged = composer2.changed(snackbarData);
                        final SnackbarData snackbarData2 = snackbarData;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snackbarData2.dismiss();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1999getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            int i8 = i4 << 3;
            int i9 = (i8 + 7168) - (i8 | 7168);
            int i10 = ((i9 + 805306368) - (i9 & 805306368)) | ((57344 + i8) - (57344 | i8)) | (458752 & i8);
            int i11 = i8 & 3670016;
            int i12 = (i11 + i10) - (i11 & i10);
            int i13 = (29360128 + i4) - (29360128 | i4);
            m2546SnackbareQBnUkQ(PaddingKt.m1018padding3ABfNKs(companion, Dp.m6638constructorimpl(12)), composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, z3, shape2, color, contentColor, actionContentColor, dismissActionContentColor, ComposableLambdaKt.rememberComposableLambda(-1266389126, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C251@11373L34:Snackbar.kt#uh7d8r");
                    if ((i14 + 3) - (3 | i14) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1266389126, i14, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
                    }
                    TextKt.m2711Text4IGK_g(snackbarData.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 + i13) - (i12 & i13)) | ((-1) - (((-1) - i4) | ((-1) - 234881024))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z4 = z3;
            final Shape shape3 = shape2;
            final long j7 = color;
            final long j8 = contentColor;
            final long j9 = actionColor;
            final long j10 = actionContentColor;
            final long j11 = dismissActionContentColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    SnackbarKt.m2547SnackbarsDKtq54(snackbarData, modifier2, z4, shape3, j7, j8, j9, j10, j11, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2544NewLineButtonSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NewLineButtonSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)264@11690L1175:Snackbar.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            int i6 = composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(j3) ? 131072 : 65536)));
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m1070widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -376152340, "C272@11979L191,279@12180L679:Snackbar.kt#uh7d8r");
            Modifier modifierM872paddingFromBaselineVpY3zN4 = AlignmentLineKt.m872paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset);
            float fM6638constructorimpl = HorizontalSpacingButtonSide;
            Modifier modifierM1022paddingqDBjuR0$default2 = PaddingKt.m1022paddingqDBjuR0$default(modifierM872paddingFromBaselineVpY3zN4, 0.0f, 0.0f, fM6638constructorimpl, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1482962025, "C276@12154L6:Snackbar.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - i3) | ((-1) - 14))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierAlign = columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd());
            if (function23 != null) {
                fM6638constructorimpl = Dp.m6638constructorimpl(0);
            }
            Modifier modifierM1022paddingqDBjuR0$default3 = PaddingKt.m1022paddingqDBjuR0$default(modifierAlign, 0.0f, 0.0f, fM6638constructorimpl, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1482754232, "C283@12348L501:Snackbar.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1996615437, "C284@12370L208:Snackbar.kt#uh7d8r");
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)};
            int i7 = ProvidedValue.$stable;
            int i8 = i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, function22, composerStartRestartGroup, (i7 + i8) - (i7 & i8));
            composerStartRestartGroup.startReplaceGroup(618603253);
            ComposerKt.sourceInformation(composerStartRestartGroup, "290@12644L173");
            if (function23 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), function23, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i3 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - ProvidedValue.$stable)));
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
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
                    Function2<Composer, Integer, Unit> function24 = function2;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    Function2<Composer, Integer, Unit> function26 = function23;
                    TextStyle textStyle2 = textStyle;
                    long j4 = j2;
                    long j5 = j3;
                    int i10 = i2;
                    SnackbarKt.m2544NewLineButtonSnackbarkKq0p4A(function24, function25, function26, textStyle2, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2545OneRowSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        float fM6638constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OneRowSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)338@14229L3580,312@13223L4586:Snackbar.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 & 3072) == 0) {
            int i5 = composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & 24576) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(j2) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 74899) | ((-1) - i3)) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f2 = HorizontalSpacing;
            if (function23 == null) {
                fM6638constructorimpl = HorizontalSpacingButtonSide;
            } else {
                fM6638constructorimpl = Dp.m6638constructorimpl(0);
            }
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(companion, f2, 0.0f, fM6638constructorimpl, 0.0f, 10, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1386942712, "CC(remember):Snackbar.kt#9igjgp");
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            Object empty = Composer.Companion.getEmpty();
            final String str = "text";
            final String str2 = Constant.NOTIFICATION_DETAILS_ACTION;
            final String str3 = "dismissAction";
            if (measurePolicyRememberedValue == empty) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j4) {
                        Measurable measurable;
                        Placeable placeableMo5514measureBRTryo0;
                        Measurable measurable2;
                        int i6;
                        final int height;
                        int iMax;
                        int height2;
                        int i7;
                        int iMin = Math.min(Constraints.m6591getMaxWidthimpl(j4), measureScope.mo704roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
                        String str4 = str2;
                        int size = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str4)) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable3 = measurable;
                        if (measurable3 != null) {
                            placeableMo5514measureBRTryo0 = measurable3.mo5514measureBRTryo0(j4);
                        } else {
                            placeableMo5514measureBRTryo0 = null;
                        }
                        String str5 = str3;
                        int size2 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str5)) {
                                break;
                            }
                            i9++;
                        }
                        Measurable measurable4 = measurable2;
                        final Placeable placeableMo5514measureBRTryo02 = measurable4 != null ? measurable4.mo5514measureBRTryo0(j4) : null;
                        int width = placeableMo5514measureBRTryo0 != null ? placeableMo5514measureBRTryo0.getWidth() : 0;
                        int height3 = placeableMo5514measureBRTryo0 != null ? placeableMo5514measureBRTryo0.getHeight() : 0;
                        int width2 = placeableMo5514measureBRTryo02 != null ? placeableMo5514measureBRTryo02.getWidth() : 0;
                        int height4 = placeableMo5514measureBRTryo02 != null ? placeableMo5514measureBRTryo02.getHeight() : 0;
                        if (width2 == 0) {
                            i6 = measureScope.mo704roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing);
                        } else {
                            i6 = 0;
                        }
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(((iMin - width) - width2) - i6, Constraints.m6593getMinWidthimpl(j4));
                        String str6 = str;
                        int size3 = list.size();
                        for (int i10 = 0; i10 < size3; i10++) {
                            Measurable measurable5 = list.get(i10);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), str6)) {
                                final Placeable placeableMo5514measureBRTryo03 = measurable5.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j4, 0, iCoerceAtLeast, 0, 0, 9, null));
                                int i11 = placeableMo5514measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                int i12 = placeableMo5514measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                boolean z2 = true;
                                boolean z3 = (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE) ? false : true;
                                if (i11 != i12 && z3) {
                                    z2 = false;
                                }
                                final int i13 = iMin - width2;
                                final int i14 = i13 - width;
                                if (!z2) {
                                    height = measureScope.mo704roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i11;
                                    iMax = Math.max(measureScope.mo704roundToPx0680j_4(SnackbarTokens.INSTANCE.m3523getTwoLinesContainerHeightD9Ej5fM()), placeableMo5514measureBRTryo03.getHeight() + height);
                                    height2 = placeableMo5514measureBRTryo0 != null ? (iMax - placeableMo5514measureBRTryo0.getHeight()) / 2 : 0;
                                } else {
                                    iMax = Math.max(measureScope.mo704roundToPx0680j_4(SnackbarTokens.INSTANCE.m3522getSingleLineContainerHeightD9Ej5fM()), Math.max(height3, height4));
                                    height = (iMax - placeableMo5514measureBRTryo03.getHeight()) / 2;
                                    height2 = (placeableMo5514measureBRTryo0 == null || (i7 = placeableMo5514measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) ? 0 : (i11 + height) - i7;
                                }
                                final int height5 = placeableMo5514measureBRTryo02 != null ? (iMax - placeableMo5514measureBRTryo02.getHeight()) / 2 : 0;
                                final int i15 = height2;
                                final Placeable placeable = placeableMo5514measureBRTryo0;
                                return MeasureScope.layout$default(measureScope, iMin, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo03, 0, height, 0.0f, 4, null);
                                        Placeable placeable2 = placeableMo5514measureBRTryo02;
                                        if (placeable2 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i13, height5, 0.0f, 4, null);
                                        }
                                        Placeable placeable3 = placeable;
                                        if (placeable3 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i14, i15, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2016566027, "C314@13253L86:Snackbar.kt#uh7d8r");
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1308937155, "C314@13331L6:Snackbar.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 + 14) - (14 | i3)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-904778058);
            ComposerKt.sourceInformation(composerStartRestartGroup, "316@13390L295");
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, Constant.NOTIFICATION_DETAILS_ACTION);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1309057900, "C317@13446L221:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-904766579);
            ComposerKt.sourceInformation(composerStartRestartGroup, "325@13757L247");
            if (function23 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "dismissAction");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1309427203, "C326@13820L166:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), function23, composerStartRestartGroup, (-1) - (((-1) - ((i3 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - ProvidedValue.$stable)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
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

                public final void invoke(Composer composer2, int i6) {
                    Function2<Composer, Integer, Unit> function24 = function2;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    Function2<Composer, Integer, Unit> function26 = function23;
                    TextStyle textStyle2 = textStyle;
                    long j4 = j2;
                    long j5 = j3;
                    int i7 = i2;
                    SnackbarKt.m2545OneRowSnackbarkKq0p4A(function24, function25, function26, textStyle2, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags((i7 + 1) - (i7 & 1)));
                }
            });
        }
    }

    static {
        float f2 = 8;
        HorizontalSpacingButtonSide = Dp.m6638constructorimpl(f2);
        TextEndExtraSpacing = Dp.m6638constructorimpl(f2);
    }
}
