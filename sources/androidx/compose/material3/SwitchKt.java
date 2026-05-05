package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.SwitchTokens;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d̉=!4i\bDRh|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lqA0ReP\u008cZS8\u0018sڔ<$q$yّCU0}*ޛWN}gvJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JoE3UoS9hҚ>\u000562*8\u007f\u0005\u0019\u00058U(v)Q{\u0010 ?Xphb=_\u0013+*\u0014N\"\u0011\u001e\u000bw^8Xl\fHE\"1{rT-_>\u0010e\rthW |a,@XDE\u00175S1\u0015hZm\u0019ӭu=\u000b\u007fW-1I\u0002oNX.$E1U\rk\f>\\3k\u0011\u0014-+]~cR$'&\u0017B\u0012ʀ\b\u000e\u0014D`~;8~\b<A%vaSh\u0002\rV0~oE/%.C[=)~iai)~;\n\u001e%\u001eQ\u001b\u001f2ii&m%\u001ddw\u007f?g?k^ݳ\u000eYC\u00054tp\u001dB\u0004^f03\n1F\u0017SX\":؝%k\u0010jdy\u0005ݓxnckbHn\"\u001d\u0015\u000eѪ\u000bɔ^Dlʍ\fbbYD\u0017]\u001ed\u0007,\bA\"3ɿ>Ƽ)\u0010Vи\twxPu\nS3=ƀ[ˇo\u0010_9l8U_q\u0016yR%\u0018\u0016ֽdۖ\\hJS\u001a_|<09`j>{RͪPܟ\u0017:Gq*9D3\u001fd#Q#,PK\u0015\t\u000e^?ɰ\u0001Ձ7&\u000bi2y)\u0015^g\to\u0016| ؔ~˃&5IQC\u001e>W(tB\u0006ɦ\u000b\""}, d2 = {"\u000fmX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "", "!mP=F7>Q", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e@i!\u001cXC9A", "!vXAV/!S\u001d\u0001}m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "!vXAV/0W\u0018\u000e}", "\"gd:U\u000bBO!~\n^9", "5dc![<FPw\u0003vf,\f\t<", "u(5", "\"gd:U\u0017:R\u0018\u0003\u0004`", "#mR5X*DS\u0018m}n4yg3a\b(\u000b@\u000e", "5dc\"a*AS\u0017\u0005z]\u001b\u007f\u00197b^,wH\u0001&\u0017T", "!vXAV/", "", "1gT0^,=", "", "=m25X*DS\u0018\\}Z5~\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Bgd:U\nH\\(~\u0004m", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79h{#\u0015w\u001d8ZQ\u0011", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPFjj(%qEfi}FT\u000f`4l\u0017i+\\\u0004B #q&\u001fdW{Sie\u0015\u0002P|EqN#\bFy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>,~=\r3&Eh\u000fT1\u001cGmx\"(ZP+0?\u0006zOZ_rs>qq.a\u0015\n`D5#nSmX\u001c\u0005]lB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C\"\u0019\u00103qmI\rx^\t%zR\"lfff*\t", "!vXAV/\"[$\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "Bgd:U\u001aAO$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNr\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuVr6GYR(c <+&\u0016i\fQ\t\u0017\fcN2D+=)\u00173M\u000b\u0005m\u0012\u0014_\u000fEsnQZ\u001aP\b^VQ2fU]i\u0003\u0014\u0017,^3c\u0019i![M\u0004\"\u001ey$%vPw\u000b\u0006c\u001aqN\tkqPb~A3>zWDTs_E>\u000b(Z{\u0005\u000e0gx5}\u001b\u000eD74dZ2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0006p\b\u0010u\u001bl\u000b\u0012`Cz\u0007hanHdmY ZBkc\u007fJ\u001c\u0004HQz\u001f5FHOk\u0003$\r\u000f$7CSK&^\u000f\u001a}\u001a\u0006#\u0002", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final SnapSpec<Float> SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    /* JADX INFO: renamed from: androidx.compose.material3.SwitchKt$Switch$1 */
    /* JADX INFO: compiled from: Switch.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        final /* synthetic */ Function2<Composer, Integer, Unit> $thumbContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            function2 = function2;
            z = z3;
            switchColors = switchColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SwitchKt.Switch(z, function1, modifier, function2, z, switchColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwitchKt$SwitchImpl$2 */
    /* JADX INFO: compiled from: Switch.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $thumbContent;
        final /* synthetic */ Shape $thumbShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z2, boolean z3, SwitchColors switchColors, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, int i2) {
            super(2);
            z = z2;
            z = z3;
            switchColors = switchColors;
            function2 = function2;
            interactionSource = interactionSource;
            shape = shape;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SwitchKt.SwitchImpl(modifier, z, z, switchColors, function2, interactionSource, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    public static final void Switch(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Object obj;
        Modifier.Companion companionM1274toggleableO2vRcR0;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        boolean z4 = z3;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        SwitchColors switchColorsColors = switchColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1580463220);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Switch)P(!1,5,4,6,2)97@4514L8,129@5619L5,119@5244L424:Switch.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z4) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            i4 |= ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(switchColorsColors)) ? 131072 : 65536;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i9 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((1572864 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? 1048576 : 524288)));
        }
        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function22 = null;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if ((i3 & 32) != 0) {
                    switchColorsColors = SwitchDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if (i9 != 0) {
                    mutableInteractionSource3 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580463220, i4, -1, "androidx.compose.material3.Switch (Switch.kt:99)");
            }
            composerStartRestartGroup.startReplaceGroup(783532531);
            ComposerKt.sourceInformation(composerStartRestartGroup, "101@4666L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 783533182, "CC(remember):Switch.kt#9igjgp");
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
            if (function1 != null) {
                obj = null;
                companionM1274toggleableO2vRcR0 = ToggleableKt.m1274toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), z2, mutableInteractionSource2, null, z4, Role.m5926boximpl(Role.Companion.m5938getSwitcho7Vup1c()), function1);
            } else {
                obj = null;
                companionM1274toggleableO2vRcR0 = Modifier.Companion;
            }
            Modifier modifierM1057requiredSizeVpY3zN4 = SizeKt.m1057requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(companion.then(companionM1274toggleableO2vRcR0), Alignment.Companion.getCenter(), false, 2, obj), SwitchWidth, SwitchHeight);
            Shape value = ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
            int i10 = i4 << 3;
            int i11 = i4 >> 6;
            int i12 = ((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i10)) | ((-1) - (((-1) - i11) | ((-1) - 896)));
            int i13 = (i11 + 7168) - (i11 | 7168);
            SwitchImpl(modifierM1057requiredSizeVpY3zN4, z2, z4, switchColorsColors, function22, mutableInteractionSource2, value, composerStartRestartGroup, ((i12 + i13) - (i12 & i13)) | ((i10 + 57344) - (i10 | 57344)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt.Switch.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ SwitchColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                final /* synthetic */ Function2<Composer, Integer, Unit> $thumbContent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z22, Function1<? super Boolean, Unit> function12, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function222, boolean z42, SwitchColors switchColorsColors2, MutableInteractionSource mutableInteractionSource32, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    function2 = function222;
                    z = z42;
                    switchColors = switchColorsColors2;
                    mutableInteractionSource = mutableInteractionSource32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SwitchKt.Switch(z, function1, modifier, function2, z, switchColors, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final void SwitchImpl(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594099146);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwitchImpl)P(4!1,2!1,5)147@6165L5,149@6176L1114:Switch.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i4 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            int i5 = composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i6 = composerStartRestartGroup.changed(shape) ? 1048576 : 524288;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i3)) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594099146, i3, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
            }
            long jM2592trackColorWaAFU9c$material3_release = switchColors.m2592trackColorWaAFU9c$material3_release(z3, z2);
            long jM2591thumbColorWaAFU9c$material3_release = switchColors.m2591thumbColorWaAFU9c$material3_release(z3, z2);
            Shape value = ShapesKt.getValue(SwitchTokens.INSTANCE.getTrackShape(), composerStartRestartGroup, 6);
            Modifier modifierM572backgroundbw27NRU = BackgroundKt.m572backgroundbw27NRU(BorderKt.m584borderxT4_qwU(modifier, SwitchTokens.INSTANCE.m3543getTrackOutlineWidthD9Ej5fM(), switchColors.m2572borderColorWaAFU9c$material3_release(z3, z2), value), jM2592trackColorWaAFU9c$material3_release, value);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM572backgroundbw27NRU);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -249502072, "C161@6662L183,154@6351L933:Switch.kt#uh7d8r");
            composer2 = composerStartRestartGroup;
            Modifier modifierM572backgroundbw27NRU2 = BackgroundKt.m572backgroundbw27NRU(IndicationKt.indication(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()).then(new ThumbElement(interactionSource, z2)), interactionSource, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6638constructorimpl(SwitchTokens.INSTANCE.m3541getStateLayerSizeD9Ej5fM() / 2), 0L, composer2, 54, 4)), jM2591thumbColorWaAFU9c$material3_release, shape);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM572backgroundbw27NRU2);
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
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1707453249, "C:Switch.kt#uh7d8r");
            composer2.startReplaceGroup(1163457794);
            ComposerKt.sourceInformation(composer2, "171@7116L144");
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(switchColors.m2590iconColorWaAFU9c$material3_release(z3, z2))), function2, composer2, ProvidedValue.$stable | ((-1) - (((-1) - (i3 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt.SwitchImpl.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ SwitchColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ InteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $thumbContent;
                final /* synthetic */ Shape $thumbShape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(boolean z22, boolean z32, SwitchColors switchColors2, Function2<? super Composer, ? super Integer, Unit> function22, InteractionSource interactionSource2, Shape shape2, int i22) {
                    super(2);
                    z = z22;
                    z = z32;
                    switchColors = switchColors2;
                    function2 = function22;
                    interactionSource = interactionSource2;
                    shape = shape2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i22) {
                    SwitchKt.SwitchImpl(modifier, z, z, switchColors, function2, interactionSource, shape, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float fM3539getSelectedHandleWidthD9Ej5fM = SwitchTokens.INSTANCE.m3539getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM3539getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = SwitchTokens.INSTANCE.m3546getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = SwitchTokens.INSTANCE.m3544getTrackWidthD9Ej5fM();
        float fM3542getTrackHeightD9Ej5fM = SwitchTokens.INSTANCE.m3542getTrackHeightD9Ej5fM();
        SwitchHeight = fM3542getTrackHeightD9Ej5fM;
        ThumbPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(fM3542getTrackHeightD9Ej5fM - fM3539getSelectedHandleWidthD9Ej5fM) / 2);
        SnapSpec = new SnapSpec<>(0, 1, null);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
