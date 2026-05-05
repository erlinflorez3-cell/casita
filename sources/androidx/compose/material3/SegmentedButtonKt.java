package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"Яx\u001d̉=!,n\bӵLc\u000b\u0004I\u00066\u000b6B\r\"4ߚ\u007f\u0007|jA0JeP.hS2\u000f\u0002{<$q$yCQU\"}(\u000bWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2J]xk\u001b\u00172HoG3coE9ft>\u000562*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00184HpPR\u0015M\u0013 \u001a\u0006T \t\u001ebifxVou:]'3oHN5dH|{\u0013vZ-\r\u0005h6+n8e/3[\u001b\u001db]O\u0003m{M\u0007x'U/w|ɱ:X\u0006\u001fƦ/O\u0013i9+ڑ\u0004ĩԃ\u0010)1\\qYh?6\u0007\u0013{;@4\u001d\u00147`9=\u001cv\b<7#\u0004ՂDP\bir\u000f\tiN\"5\u0002C+g\u001f\u0015bň?\u0019TBB\u0006ڟ\"#\u000f\u00019\u001eb!x\u0015IX(W7QNB`N8_ms\npp\tB\u0004^H0I\n\u0019F-59k9Q5{\u0004XD\u0016z3iĈWiXSغ&n\u001cCp\u000eʪYե\u0081\tmVif:)܅\u001bb\u001d\u0016\bA$\u0005wj+U\u0014\\f\u0001i\u0019e\u000e\u001a3H~Cip{\u000e\u0006Qn5EQ\u0012\u0014\u0010['\u0018MVz\u0005\u0007\u0002rY\u0012Zj-:2vp@}\u0002D\\(+2m\nL:21'y-H1<rG\u0003\tmy\u0001\u0010-tc,\ti2\u0016!\u0003f[\u001f\u0012\u0018\nO,\u000bp:8QSE\u0019TYPyط\u0001#\r\n$\u000fU\u000bdR\\n&u\u0004\u007fN'׀=Q5HY\u0014ɒ-2\u0010Q]ɯqsge\u0012U~%y=O\u00192u-\u0003pZx\u001bT]z/(\u0007`\u0003#6h.\u000b\u0012J\ta{T9vnOx\u0003gAf8+\u000bO$+\u0001}>\u00155[[W#\u001cw\"L-a\f\b 4\u007fb\u001dE\re2L\u0014\u001eub_~J=NH\b!n3*l\u0011R`u\b\nR\tb\u0011aYыhp\\C}\u001a=!~\u0012<\u000f\u0001V\n>A\u0001ϻ8.e5:H\u0382\u0018^QL)ba\u0010\u0006s[^\u001bJ=49%Yn@G\u0004!ݫ[b\u0017\\\u001e\u0014&cY;\u0011\u000bd\tR:\\@\u0016\"[T\u0018\u001e@\u0005\u000etw\u0015'4Rsi\u0001<}?\\vT\u0013ݺ]`O)Wϖaʟ\"x=̍%{TTGc`\u0002*\u07fc\u000bƨnQ\u0007f3-ןT>#+^܀'s\\ƆM1"}, d2 = {"\u0011gT0^,=H|\by^?]\u0005-t\n5", "", "\u0017b^;F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u001bt[A\\\nA]\u001d|zL,~\u0011/n\u000f(z\u001d\u0011&&QxzF\t", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AoP0X", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^5<h\u0002}:w\u001a,M1;m<\u001e\u001ewa8cs;]\u000104V`\u001aZ\\}=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001bt[A\\\nA]\u001d|zL,~\u0011/n\u000f(z\u001d\u0011&&QxzF\tlE:|\u000b5Q\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|FagA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005u\u0011\u0015%\u0012=j: `\u0018R\u0004#uN~L*\u001dP", "!dV:X5MS\u0018[\u000bm;\u0007\u0012\ro\t7{I\u0010", "7b^;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*\u001dP", "!h]4_,\u001cV#\u0003x^\u001a|\u000b7e\t7{?]'&Vy\u0017)\u00017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d)>[\u0005 \u0015p 2KC)k6&\u0015qp9\u0006@<]\u00061P9X>JP|H\u0014g", "!h]4_,\u001cV#\u0003x^\u001a|\u000b7e\t7{?]'&Vy\u0017)\u00017|i^\u001f\"ky\u001a", "!dV:X5MS\u0018[\u000bm;\u0007\u0012", "1gT0^,=", "", "=m25X*DS\u0018\\}Z5~\t", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%7a})Fm\u0015\u000b]RJu={\u001fokF\u00159", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", ":`Q2_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\rE`\r$\u0015p 2KC)k6&\u0015qp9\u0006@<]\u00061P9X>JP|H\u0014gOtT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]s&\u0017sS2\b\n\u001d~uN\u0005g=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{@~*x.\b47\fYkGp\u0017Kh|\u0014?&?1.AF!?\u0015kq{>\u001bl\u001bhUWP53!enrH\u000ecm&j?j=\u000b>\\\u0013L\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roax8#<Y\u001cV9lAS\u0013^O4\u0015zfM\u0019o[YkUzfa}$\u007fy\u001bY*2GKz\\L9\u0014\u001fC\u0001\u0018z\u001b\u0003mL\u0003\u007fz549V?bD8\u001ag`\u001e\u0017v<&(\u001b;\u0012_>n4^-\u001f\r\u0015l\u0006^bO@K4QRh1@mT\u0013\u0006;b\u0019*\\\u00199iAk)a}DQr\u0017I\t<\u0001\\\u001d</sV#q$=0l\u001c\u0013m,3%\n%$|I\u001cmUR\u001e|nx\u0003\u001a*Qr#LJ6SC]L~\u001f|e\b\\\u0011<f7\u00079\u001e^\u0005d2", "Ad[2V;>R", "=m29\\*D", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00139b\u007f'7K\u00198QA;Y4 \u001dhjH\u0007b\t^\u00066QU;6n@pG\u001f\u00120\u000351\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001e@\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZ`Uurg\u001d\u007fvA#Kw_EX9SF|2)Y{A\"6\"\\5s1\u00058*C:y2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-}hM\u000eu#]\u000f[,#1\u001bmelW\u000f\u0006:'jDkh^AY\u0010KWE{#O}Oe}\u0014\u001cP\"wmTM)TJ\u001bzT+^\r\u0012\u0007p!e\u000b JX\u000fu\u0018nDW\u0019\t>\u001f\b\u0005XP\u001ftG#7I|cby26B\u0012S1<J8\u0006VMxY\u001a=\u0010\u000b\f\u0019qxF\u0004?\\\r5LU5i`\u0013\u0014vS/\u0015eG )6\u001f\fbMl^M\u000e\u001b\b\u001do\u0001\u001e'CI\n|BYs KgU\u000eJ$3 5K$3j}b\u0018By?Yu\u0012\tM0\n\u001be-6~E.k%8tUl\u001ax\u001b>\u001f\u000ba\u001bk4\u000fwGU$\u0002ZBN\u000e,Ns\u001fZ\u0001rPJWWz'3Q[^\u000e=bEyp\u0010^\u0005\u0005\u0005\u0003", "7mc2e(<b\u001d\t\u0004<6\r\u0012>A\u000e\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx9(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\u001c\u0019wb\u0011H", "7mc2e(<b\u001d\t\u0004S\u0010\u0006\b/x", "7mc2e(<b\u001d\t\u0004<6\r\u0012>", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = Dp.m6638constructorimpl(8);

    public static final void SegmentedButton(final MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z2, final Function1<? super Boolean, Unit> function1, final Shape shape, Modifier modifier, boolean z3, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final ComposableLambda composableLambdaRememberComposableLambda = function2;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        BorderStroke borderStrokeM2468borderStrokel07J4OM$default = borderStroke;
        SegmentedButtonColors segmentedButtonColorsColors = segmentedButtonColors;
        boolean z5 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1596038053);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SegmentedButton)P(1,8,9,7,3,2!1,5)133@6692L8,137@6905L41,144@7279L25,163@7880L51,146@7310L621:SegmentedButton.kt#uh7d8r");
        if ((Integer.MIN_VALUE + i4) - (Integer.MIN_VALUE | i4) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2)) & ((-1) - i2));
        } else {
            i5 = i2;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(z2) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(shape) ? 2048 : 1024)));
        }
        int i9 = (i4 + 8) - (i4 | 8);
        if (i9 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 16384 : 8192;
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i10 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            int i11 = composerStartRestartGroup.changed(z5) ? 131072 : 65536;
            i5 = (i5 + i11) - (i5 & i11);
        }
        if ((i2 & 1572864) == 0) {
            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(segmentedButtonColorsColors)) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(borderStrokeM2468borderStrokel07J4OM$default)) ? 8388608 : 4194304;
        }
        int i12 = i4 & 128;
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(mutableInteractionSource3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i13 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i13 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 536870912 : 268435456;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((i4 & 512) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            int i15 = composerStartRestartGroup.changedInstance(function22) ? 4 : 2;
            i6 = (i3 + i15) - (i3 & i15);
        } else {
            i6 = i3;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    borderStrokeM2468borderStrokel07J4OM$default = SegmentedButtonDefaults.m2468borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2452borderColorWaAFU9c$material3_release(z5, z2), 0.0f, 2, null);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if (i12 != 0) {
                    mutableInteractionSource3 = null;
                }
                if (i13 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            ComposerKt.sourceInformation(composer2, "C137@6931L13:SegmentedButton.kt#uh7d8r");
                            if ((i16 + 3) - (3 | i16) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970447394, i16, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:137)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z2, null, null, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596038053, i5, i6, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:139)");
            }
            composerStartRestartGroup.startReplaceGroup(1788099965);
            ComposerKt.sourceInformation(composerStartRestartGroup, "141@7068L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1788100616, "CC(remember):SegmentedButton.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i16 = i5 >> 3;
            int i17 = i5 >> 6;
            int i18 = ((i16 + 126) - (i16 | 126)) | ((i17 + 7168) - (i17 | 7168));
            int i19 = (-1) - (((-1) - 57344) | ((-1) - (i5 << 3)));
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = i5 << 6;
            z4 = z5;
            SurfaceKt.m2563Surfaced85dljk(z2, function1, SizeKt.m1047defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, companion, 1.0f, false, 2, null), z2, interactionCountAsState(mutableInteractionSource2, composerStartRestartGroup, 0)), ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), z5, shape, segmentedButtonColorsColors.m2453containerColorWaAFU9c$material3_release(z5, z2), segmentedButtonColorsColors.m2454contentColorWaAFU9c$material3_release(z5, z2), 0.0f, 0.0f, borderStrokeM2468borderStrokel07J4OM$default, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
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

                public final void invoke(Composer composer2, int i22) {
                    ComposerKt.sourceInformation(composer2, "C164@7890L35:SegmentedButton.kt#uh7d8r");
                    if ((i22 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1635710341, i22, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:164)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(composableLambdaRememberComposableLambda, function22, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i20 | ((1879048192 + i21) - (1879048192 | i21)), 48, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final SegmentedButtonColors segmentedButtonColors2 = segmentedButtonColorsColors;
            final BorderStroke borderStroke2 = borderStrokeM2468borderStrokel07J4OM$default;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final Function2<? super Composer, ? super Integer, Unit> function23 = composableLambdaRememberComposableLambda;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
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

                public final void invoke(Composer composer2, int i22) {
                    SegmentedButtonKt.SegmentedButton(multiChoiceSegmentedButtonRowScope, z2, function1, shape, modifier2, z4, segmentedButtonColors2, borderStroke2, mutableInteractionSource4, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    public static final void SegmentedButton(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z2, final Function0<Unit> function0, final Shape shape, Modifier modifier, boolean z3, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final ComposableLambda composableLambdaRememberComposableLambda = function2;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        BorderStroke borderStrokeM2468borderStrokel07J4OM$default = borderStroke;
        SegmentedButtonColors segmentedButtonColorsColors = segmentedButtonColors;
        boolean z5 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1016574361);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SegmentedButton)P(8,7,9,6,2,1!1,4)211@10255L8,215@10469L42,222@10846L25,242@11489L51,224@10877L663:SegmentedButton.kt#uh7d8r");
        if ((-1) - (((-1) - Integer.MIN_VALUE) | ((-1) - i4)) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)));
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(shape) ? 2048 : 1024;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 16384 : 8192;
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i9 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i5 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 32) == 0 && composerStartRestartGroup.changed(segmentedButtonColorsColors)) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i10 = ((i4 & 64) == 0 && composerStartRestartGroup.changed(borderStrokeM2468borderStrokel07J4OM$default)) ? 8388608 : 4194304;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (i4 + 128) - (i4 | 128);
        if (i11 != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i12 != 0) {
            i5 |= 805306368;
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 536870912 : 268435456)));
        }
        if ((i4 & 512) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function22) ? 4 : 2;
            i6 = (i3 + i13) - (i3 & i13);
        } else {
            i6 = i3;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i9 != 0) {
                    z5 = true;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    borderStrokeM2468borderStrokel07J4OM$default = SegmentedButtonDefaults.m2468borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2452borderColorWaAFU9c$material3_release(z5, z2), 0.0f, 2, null);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if (i11 != 0) {
                    mutableInteractionSource3 = null;
                }
                if (i12 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.4
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
                            ComposerKt.sourceInformation(composer2, "C215@10495L14:SegmentedButton.kt#uh7d8r");
                            if ((i14 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1235063168, i14, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:215)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z2, null, null, composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 32) - (i4 | 32) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016574361, i5, i6, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:217)");
            }
            composerStartRestartGroup.startReplaceGroup(1788214045);
            ComposerKt.sourceInformation(composerStartRestartGroup, "219@10633L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1788214696, "CC(remember):SegmentedButton.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i14 = i5 >> 3;
            int i15 = (i14 + 126) - (i14 | 126);
            int i16 = (i5 >> 6) & 7168;
            int i17 = (i15 + i16) - (i15 & i16);
            int i18 = 57344 & (i5 << 3);
            int i19 = (i17 + i18) - (i17 & i18);
            int i20 = i5 << 6;
            int i21 = (1879048192 + i20) - (1879048192 | i20);
            z4 = z5;
            SurfaceKt.m2562Surfaced85dljk(z2, function0, SemanticsModifierKt.semantics$default(SizeKt.m1047defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, companion, 1.0f, false, 2, null), z2, interactionCountAsState(mutableInteractionSource2, composerStartRestartGroup, 0)), ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5937getRadioButtono7Vup1c());
                }
            }, 1, null), z5, shape, segmentedButtonColorsColors.m2453containerColorWaAFU9c$material3_release(z5, z2), segmentedButtonColorsColors.m2454contentColorWaAFU9c$material3_release(z5, z2), 0.0f, 0.0f, borderStrokeM2468borderStrokel07J4OM$default, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
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

                public final void invoke(Composer composer2, int i22) {
                    ComposerKt.sourceInformation(composer2, "C243@11499L35:SegmentedButton.kt#uh7d8r");
                    if ((-1) - (((-1) - i22) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(383378045, i22, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:243)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(composableLambdaRememberComposableLambda, function22, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i19 + i21) - (i19 & i21), 48, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final SegmentedButtonColors segmentedButtonColors2 = segmentedButtonColorsColors;
            final BorderStroke borderStroke2 = borderStrokeM2468borderStrokel07J4OM$default;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final Function2<? super Composer, ? super Integer, Unit> function23 = composableLambdaRememberComposableLambda;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
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

                public final void invoke(Composer composer2, int i22) {
                    SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope2 = singleChoiceSegmentedButtonRowScope;
                    boolean z6 = z2;
                    Function0<Unit> function02 = function0;
                    Shape shape2 = shape;
                    Modifier modifier3 = modifier2;
                    boolean z7 = z4;
                    SegmentedButtonColors segmentedButtonColors3 = segmentedButtonColors2;
                    BorderStroke borderStroke3 = borderStroke2;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                    Function2<Composer, Integer, Unit> function24 = function23;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    int i23 = i2;
                    SegmentedButtonKt.SegmentedButton(singleChoiceSegmentedButtonRowScope2, z6, function02, shape2, modifier3, z7, segmentedButtonColors3, borderStroke3, mutableInteractionSource5, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags((i23 + 1) - (i23 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2474SingleChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f2, final Function3<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier.Companion companion = modifier;
        final float fM2471getBorderWidthD9Ej5fM = f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520863498);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SingleChoiceSegmentedButtonRow)P(1,2:c#ui.unit.Dp)269@12565L447:SegmentedButton.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((6 & i2) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (48 | i2) == 0) {
            int i7 = composerStartRestartGroup.changed(fM2471getBorderWidthD9Ej5fM) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i4 + 147) - (147 | i4) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                fM2471getBorderWidthD9Ej5fM = SegmentedButtonDefaults.INSTANCE.m2471getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520863498, i4, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:268)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m1048defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(companion), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3375getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(Dp.m6638constructorimpl(-fM2471getBorderWidthD9Ej5fM));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM898spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1586778660, "C278@12924L58,279@12997L9:SegmentedButton.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1334286565, "CC(remember):SegmentedButton.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            function3.invoke((SingleChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((-1) - (((-1) - (i4 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | 6));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2
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

                public final void invoke(Composer composer2, int i8) {
                    SegmentedButtonKt.m2474SingleChoiceSegmentedButtonRowuFdPcIQ(companion, fM2471getBorderWidthD9Ej5fM, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2473MultiChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f2, final Function3<? super MultiChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier.Companion companion = modifier;
        final float fM2471getBorderWidthD9Ej5fM = f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(155922315);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MultiChoiceSegmentedButtonRow)P(1,2:c#ui.unit.Dp)307@14058L411:SegmentedButton.kt#uh7d8r");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (6 | i2) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changed(fM2471getBorderWidthD9Ej5fM) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                fM2471getBorderWidthD9Ej5fM = SegmentedButtonDefaults.INSTANCE.m2471getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155922315, i4, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:306)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m1048defaultMinSizeVpY3zN4$default(companion, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3375getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(Dp.m6638constructorimpl(-fM2471getBorderWidthD9Ej5fM));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM898spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1297400858, "C315@14382L57,316@14454L9:SegmentedButton.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 596041317, "CC(remember):SegmentedButton.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i9 = (-1) - (((-1) - (i4 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            function3.invoke((MultiChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf((i9 + 6) - (i9 & 6)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2
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

                public final void invoke(Composer composer2, int i10) {
                    SegmentedButtonKt.m2473MultiChoiceSegmentedButtonRowuFdPcIQ(companion, fM2471getBorderWidthD9Ej5fM, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SegmentedButtonContent(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1464121570);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SegmentedButtonContent)P(1)325@14600L595:SegmentedButton.kt#uh7d8r");
        if ((6 & i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 19)) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464121570, i3, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:324)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1425737070, "C329@14804L5,330@14847L342,330@14818L371:SegmentedButton.kt#uh7d8r");
            TextKt.ProvideTextStyle(TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1420592651, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
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

                public final void invoke(Composer composer2, int i4) {
                    ComposerKt.sourceInformation(composer2, "C331@14873L24,332@14930L55,334@14999L180:SegmentedButton.kt#uh7d8r");
                    if ((3 & i4) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1420592651, i4, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:331)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1708740237, "CC(remember):SegmentedButton.kt#9igjgp");
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new SegmentedButtonContentMeasurePolicy(coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierHeight = IntrinsicKt.height(Modifier.Companion, IntrinsicSize.Min);
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function22});
                    ComposerKt.sourceInformationMarkerStart(composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                    Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                    ComposerKt.sourceInformationMarkerStart(composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(segmentedButtonContentMeasurePolicy);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierHeight);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    function2CombineAsVirtualLayouts.invoke(composer2, 0);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButtonContent.2
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

                public final void invoke(Composer composer2, int i4) {
                    SegmentedButtonKt.SegmentedButtonContent(function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 281890131, "C(interactionCountAsState)397@17381L33,398@17440L499,398@17419L520:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i2, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:396)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 408875648, "CC(remember):SegmentedButton.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 408878002, "CC(remember):SegmentedButton.kt#9igjgp");
        int i3 = (i2 + 14) - (14 | i2);
        boolean z2 = ((i3 ^ 6) > 4 && composer.changed(interactionSource)) || (i2 + 6) - (i2 | 6) == 4;
        SegmentedButtonKt$interactionCountAsState$1$1 segmentedButtonKt$interactionCountAsState$1$1RememberedValue = composer.rememberedValue();
        if (z2 || segmentedButtonKt$interactionCountAsState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            segmentedButtonKt$interactionCountAsState$1$1RememberedValue = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(segmentedButtonKt$interactionCountAsState$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) segmentedButtonKt$interactionCountAsState$1$1RememberedValue, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, final boolean z2, final State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2475invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2475invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                int width = placeableMo5514measureBRTryo0.getWidth();
                int height = placeableMo5514measureBRTryo0.getHeight();
                final State<Integer> state2 = state;
                final boolean z3 = z2;
                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1.1
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
                        placementScope.place(placeableMo5514measureBRTryo0, 0, 0, state2.getValue().floatValue() + (z3 ? 5.0f : 0.0f));
                    }
                }, 4, null);
            }
        });
    }
}
