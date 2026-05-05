package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
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
/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d̉=!4i\bDJj|\u0004W\u00068\u000b4N\u0007\":\u0018\u007f\u0007lnA0ReP\u008cZS@\u000fsڔ<$q$yCQU\"}8\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012\u001d;JoE3UoS9ht<\b(288\u0002\u0005\u0007\u001c2H&v\u0003CQ\u000f\u001a0NuBĥ%8\u00138*\u0006l?1\"j\bf6v\u000e\u000eT=E\u001b\u007fRP7_^!]\u000fVTU,%\u0005ӿ/@=Zչ)S\t-\u0003_M*Wqk-\u0019--+W\u001do6\u0007*D\u001b1O\u001b\t\u000b&\u000b1\u0002f\u0012'9|{K~:X\u0007\t*%G\u0014\u0010\u0016'vM[IǴ\f\u000e9\u001a9XĖT\u0002lr\u0018\u001fog/%.[[?!f_\u0014S\u0019|c,\u000b\u0013\u001e14\u0007!\n\u0001>f\u001b\u001bb,i1\u007fu\u0004Mf3gs\u0006\u0004\u001f\u000b20\n0U2G{?ZG+=[GV9k0ttm|\u0005n\u001dki\u0001}\u0007'å\u001a78@$rR\u001d\u001dk~~\u0001,?wL^\u00157 \u00190^\b<OQ>\t\u0016Ŗ\u0002\u0005[\u0019\"%]\u0011_Y\u001d\u0016>[G\u001bK5\u007f\u0010@e`4,?j\u000fKW\u0007Vaێr\\V!\tʌlݻ{\u0004LN\u001a\u0015JAw\u001cB-Q-j\u0018`\u0003LA\u0018Ғ\u000bރ^p\u0018~b5<\u0005o(\u0003\n!^ju\bg'H\u0003ʌbĘ1CY5'(u6v:\u0015#5}JÓIѨPOTl$wm}&\u001d(:qAK\u001b'~W;XΐGʆvkY˧*)\u0001\u0007\b\u001a[v<s j\u001f+7ʇLׅX\u0019*vltC\u001cr\r\u0012aty\u001eϋVߏ_FQr\u0011[TP>\u000b\u0013 >3\u000f~:|c,\u001aڲ\u001fə{\u00167\u0015o_\n\u0004<\nz\u000fTs<־.І\u001awjQk4S:Oj\r?B8z\u0015ZH\u0019v^ȸ\u000bΌ\u0011;PArrn:S\u001e=~\u0007\u001b:!\tV\n9i̋\u007fӑ2g2sQ\u007f,`I:\u001fNsu{\u0004c\\9Ieϛ\r֭5p\u001a\u001cK\"vcp H\u0006\"0\r\u05ce\u000eك\t<\u0011ӗT8J!#C\u0003\u0002\\،MķJ_\u0017ğRV\u0002Un\u000e\u0003w3ƈJϖdMh!8\u0003\u0017\u001199\u00076Q\u0019{bl/\u00121WҶ\u001f͢\u001frW~t'CFZV))\u0098\u0005IըaKWAN\u0004uiD«Ɩ\fշ\u001c\u0005+\u00040\u001bg\u0012gٮۀ0"}, d2 = {"\u000fbc6b5%O\u0016~\u0002;6\f\u00189mj$z?\u0005 \u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000eV;B]\"ev[,\u0004e9t\u000f2\u0004+|\u0016\u0016Kx\u0010", "u(5", "\u0014", "\u000fbc6b5%O\u0016~\u0002F0\u0006k/i\u0002+\u000b", "5dc\u000eV;B]\"ev[,\u0004p3nb(\u007fB\u0004&", "\u0016dX4[;\u001f`#\u0007hn)\u007f\t+dn2j@\u0014&wK|\u001cK])>Y", "\u0016dX4[;-]\u0007\u000fwa,x\b\u0010i\r6\u000b'\u0005 \u0017", "5dc\u0015X0@V(m\u0005L<y\f/a~\t\u007fM\u000f&}Kx\u000e", "\u001ekP6a\u001bH] \u000e~i\n\u0007\u0012>e\t7f<\u007f\u0016\u001bPq", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "5dc\u001d_(B\\\b\t\u0005e;\u0001\u0014\ro\t7{I\u0010\u0002\u0013Fn\u0012Ex", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\u001ekP6a\u001bH] \u000e~i\u000f\u0007\u00163z\n1\u000b<\b\u0002\u0013Fn\u0012Ex", "\u001ekP6a\u001bH] \u000e~i\u0014x\u001c!i~7~", "5dc\u001d_(B\\\b\t\u0005e;\u0001\u0014\u0017a\u0013\u001a\u007f?\u0010\u001a", "\u001ekP6a\u001bH] \u000e~i\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010", " hR5G6HZ(\u0003\u0006A6\n\rDo\t7wGk\u0013\u0016Fs\u0017>", "5dc\u001f\\*AB#\t\u0002m0\bk9r\u0004=\u0006I\u0010\u0013\u001e2k\r;z.7", " hR5G6HZ(\u0003\u0006F(\u0010z3d\u000f+", "5dc\u001f\\*AB#\t\u0002m0\bp+xq,zO\u0004", "!oP0\\5@0\u0019\u000e\r^,\u0006w9o\u00077\u007fK\\ \u0016#x\f?\u00012", "5dc c(<W\"\u0001W^;\u000f\t/nn2\u0006G\u0010\u001b\"#x\r\u0018\u007f#8c\u000b", "\"dgA56Mb#\u0007eZ+{\r8g", "\"n^9g0I4\u0015}zB5[\u0019<a\u000f,\u0006I", "", "\"n^9g0I4\u0015}zH<\fg?r{7\u007fJ\n", "\"n^9g0I;\u001d\b]^0~\f>", "5dc!b6Eb\u001d\nbb5_\t3g\u00037", "\"n^9g0I;\u001d\blb+\f\f", "5dc!b6Eb\u001d\nbb5n\r.t\u0003", "\"n^9g0I0#\u0012", "", ">nb6g0H\\\u0004\f\u0005o0{\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", "Bn^9g0I", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$B[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$B[%*\\C\u0011", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "4nRBf(;Z\u0019", "", "3mP/_,.a\u0019\f^g7\r\u0018", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u0010?d\u000e+\"w$2\\GEt\u001f+\u001fye8\u0007p\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\t>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010a[\tGNI^12UN'fAI(\u001f_(\u0017wP\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Us\u001f$~&#L\u007fw\u001f\bMi\u0012z7\u0013;.?.\n\\oa?n\u0002\u0013;`K04\u007f\u001d#HIryvGZ>\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~no\nFV\u000e>\u0013M\u001f/Q\tP[\u0007jljg^", "\"n^9g0IA(z\n^", "7mXA\\(E7'o~l0y\u0010/", "7r?2e:Ba(~\u0004m", ";tc.g6K;)\u000ezq", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CNA", "@d\\2`)>`\b\t\u0005e;\u0001\u0014\u001dt{7{", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#e0Fi%8Z+Kz41jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001fj\u0017]/\u0015\u0005#\u001f.vOA-\b9\u001fe\u001f,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010a[\tGNI^12UN'fAI(\u001f_(\u0017wP\u0004", "/mX:T;>B#\t\u0002m0\b", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BdgAI,Kb\u001d|ve\u0017x\b.i\t*", "AtQ5X(=3,\u0003\tm:", "/bc6b5\u001ef\u001d\r\nl", ";`c2e0:Zfx\b^3|\u0005=e", "AbP9X", "", "/k_5T"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth;
    private static final float SpacingBetweenTooltipAndAnchor;
    private static final float TextBottomPadding;
    public static final int TooltipFadeInDuration = 150;
    public static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m6638constructorimpl(40);
    private static final float PlainTooltipMaxWidth = Dp.m6638constructorimpl(200);

    public static final void TooltipBox(final PopupPositionProvider popupPositionProvider, final Function3<? super TooltipScope, ? super Composer, ? super Integer, Unit> function3, final TooltipState tooltipState, Modifier modifier, boolean z2, boolean z3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z4 = z3;
        boolean z5 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1836749106);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TooltipBox)P(4,6,5,3,2,1)133@5704L64,134@5826L33,135@5876L52,137@5979L103,143@6168L64,141@6088L310:Tooltip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i3 & 4) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= (-1) - (((-1) - i2) | ((-1) - 512)) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i10 = composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i12 = composerStartRestartGroup.changed(z4) ? 131072 : 65536;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((i3 & 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i4)) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (i7 != 0) {
                companion = Modifier.Companion;
            }
            if (i9 != 0) {
                z5 = true;
            }
            if (i11 != 0) {
                z4 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1836749106, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:131)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) tooltipState.getTransition(), "tooltip transition", composerStartRestartGroup, MutableTransitionState.$stable | 48, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1495108980, "CC(remember):Tooltip.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1495107361, "CC(remember):Tooltip.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new TooltipScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final LayoutCoordinates invoke() {
                        return mutableState.getValue();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i13 = (i4 + 14) - (14 | i4);
            boolean z6 = z5;
            Modifier modifier2 = companion;
            BasicTooltip_androidKt.BasicTooltipBox(popupPositionProvider, ComposableLambdaKt.rememberComposableLambda(-149611544, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt.TooltipBox.1
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

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C143@6170L60:Tooltip.kt#uh7d8r");
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-149611544, i14, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:143)");
                    }
                    Modifier modifierAnimateTooltip = TooltipKt.animateTooltip(Modifier.Companion, transitionUpdateTransition);
                    Function3<TooltipScope, Composer, Integer, Unit> function32 = function3;
                    TooltipScopeImpl tooltipScopeImpl2 = tooltipScopeImpl;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateTooltip);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1844698027, "C143@6219L9:Tooltip.kt#uh7d8r");
                    function32.invoke(tooltipScopeImpl2, composer2, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), tooltipState, modifier2, z6, z4, ComposableLambdaKt.rememberComposableLambda(-1130808188, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1
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

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C138@6034L27,138@5989L87:Tooltip.kt#uh7d8r");
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1130808188, i14, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:138)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1741232635, "CC(remember):Tooltip.kt#9igjgp");
                    final MutableState<LayoutCoordinates> mutableState2 = mutableState;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                mutableState2.setValue(layoutCoordinates);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) objRememberedValue3);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnGloballyPositioned);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1844551025, "C138@6065L9:Tooltip.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((-1) - (((-1) - ((-1) - (((-1) - (((i13 + 1572912) - (i13 & 1572912)) | ((i4 + 896) - (896 | i4)))) & ((-1) - (7168 & i4))))) & ((-1) - ((57344 + i4) - (57344 | i4))))) | ((i4 + 458752) - (i4 | 458752)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = companion;
            final boolean z7 = z5;
            final boolean z8 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TooltipKt.TooltipBox.2
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

                public final void invoke(Composer composer2, int i14) {
                    TooltipKt.TooltipBox(popupPositionProvider, function3, tooltipState, modifier3, z7, z8, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final TooltipState rememberTooltipState(boolean z2, boolean z3, MutatorMutex mutatorMutex, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1413230530, "C(rememberTooltipState)436@18949L210:Tooltip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i2, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:436)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1281295952, "CC(remember):Tooltip.kt#9igjgp");
        int i4 = (((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(z3)) && (i2 + 48) - (48 | i2) != 32) ? 0 : 1;
        int i5 = ((((896 & i2) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(mutatorMutex)) || (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256) ? 1 : 0;
        int i6 = (i4 + i5) - (i4 & i5);
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new TooltipStateImpl(z2, z3, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tooltipStateImpl;
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z2, boolean z3, MutatorMutex mutatorMutex, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(z2, z3, mutatorMutex);
    }

    public static final TooltipState TooltipState(boolean z2, boolean z3, MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z2, z3, mutatorMutex);
    }

    public static final Modifier textVerticalPadding(Modifier modifier, boolean z2, boolean z3) {
        if (!z2 && !z3) {
            return PaddingKt.m1020paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
        }
        return PaddingKt.m1022paddingqDBjuR0$default(AlignmentLineKt.m873paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null);
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    public static final float getPlainTooltipMaxWidth() {
        return PlainTooltipMaxWidth;
    }

    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getRichTooltipMaxWidth() {
        return RichTooltipMaxWidth;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }

    public static final Modifier animateTooltip(Modifier modifier, final Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("animateTooltip");
                inspectorInfo.getProperties().set("transition", transition);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TooltipKt.animateTooltip.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                int i3;
                composer.startReplaceGroup(-1498516085);
                ComposerKt.sourceInformation(composer, "C585@24638L747,607@25431L561:Tooltip.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498516085, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:584)");
                }
                Transition<Boolean> transition2 = transition;
                TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i4) {
                        TweenSpec tweenSpecTween$default;
                        composer2.startReplaceGroup(386845748);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(386845748, i4, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:587)");
                        }
                        if (segment.isTransitioningTo(false, true)) {
                            tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        } else {
                            tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                boolean zBooleanValue = transition2.getCurrentState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f2 = zBooleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float fValueOf = Float.valueOf(f2);
                boolean zBooleanValue2 = transition2.getTargetState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f3 = zBooleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, fValueOf, Float.valueOf(f3), tooltipKt$animateTooltip$2$scale$2.invoke(transition2.getSegment(), composer, 0), vectorConverter, "tooltip transition: scaling", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Transition<Boolean> transition3 = transition;
                TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i4) {
                        composer2.startReplaceGroup(-281714272);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-281714272, i4, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:609)");
                        }
                        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(false, true) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                boolean zBooleanValue3 = transition3.getCurrentState().booleanValue();
                composer.startReplaceGroup(2073045083);
                ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    i3 = 0;
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                } else {
                    i3 = 0;
                }
                float f4 = zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float fValueOf2 = Float.valueOf(f4);
                boolean zBooleanValue4 = transition3.getTargetState().booleanValue();
                composer.startReplaceGroup(2073045083);
                ComposerKt.sourceInformation(composer, "C:Tooltip.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, i3, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                float f5 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition3, fValueOf2, Float.valueOf(f5), tooltipKt$animateTooltip$2$alpha$2.invoke(transition3.getSegment(), composer, Integer.valueOf(i3)), vectorConverter2, "tooltip transition: alpha", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifierM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(modifier2, invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$3(stateCreateTransitionAnimation2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM4339graphicsLayerAp8cVGQ$default;
            }

            private static final float invoke$lambda$1(State<Float> state) {
                return state.getValue().floatValue();
            }

            private static final float invoke$lambda$3(State<Float> state) {
                return state.getValue().floatValue();
            }
        });
    }

    static {
        float f2 = 4;
        SpacingBetweenTooltipAndAnchor = Dp.m6638constructorimpl(f2);
        float f3 = 24;
        TooltipMinHeight = Dp.m6638constructorimpl(f3);
        float fM6638constructorimpl = Dp.m6638constructorimpl(f2);
        PlainTooltipVerticalPadding = fM6638constructorimpl;
        float f4 = 8;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(f4);
        PlainTooltipHorizontalPadding = fM6638constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m1012PaddingValuesYgX7TsA(fM6638constructorimpl2, fM6638constructorimpl);
        RichTooltipMaxWidth = Dp.m6638constructorimpl(AviDirectory.TAG_DATETIME_ORIGINAL);
        float f5 = 16;
        RichTooltipHorizontalPadding = Dp.m6638constructorimpl(f5);
        HeightToSubheadFirstLine = Dp.m6638constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m6638constructorimpl(f3);
        TextBottomPadding = Dp.m6638constructorimpl(f5);
        ActionLabelMinHeight = Dp.m6638constructorimpl(36);
        ActionLabelBottomPadding = Dp.m6638constructorimpl(f4);
    }
}
