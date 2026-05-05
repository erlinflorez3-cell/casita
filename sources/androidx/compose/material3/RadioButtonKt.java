package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\r6B\r\"4ߚ\u007f\u0007tsAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"Ԃ*\teNogtJrXQ\u0014\u001e\u0016'p\\Mc\u007fu\u0012=:r{M<ewM;ptd\u000b61PB*\u000b\u0007\u001a8S(v)O{\u0012\u00180N}RR;U5 \u0018\u0006L.\u0019\u001e\u000bv~>NlkJG%\u0019hp_md݁\u0001M\u001bXt3\u001bǸy\u001eY?\u000eߑgȏW\u0003\u000fѸ{M\u0011?\n=3i}ݓ-ʁwY>X\u000e\u001659]\u0010urT][ĬbВ+-WcYR.6\u0006~\u0014\rj\u0005dͽ)ρ2/\"f\u0016\u0010߀x\u0006"}, d2 = {" `S6b\bGW!z\nb6\u0006g?r{7\u007fJ\n", "", " `S6b\tNb(\t\u0004=6\fv3z\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", " `S6b\tNb(\t\u0004I({\b3n\u0002", " `S6b\u001aM`#\u0005zP0{\u00182", " `S6b\tNb(\t\u0004", "", "Ad[2V;>R", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!4]\b|G|%8V!Er>+#>", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\t\b%\u000eBnlI$Y4u\u0014yK\u0006xUhi\u0003%KLl7raF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<S\u0004wpF\u0015\n<.G7_OTob8r6#U\u0005AyBgp({-g=96q\u0001Iv\u001cHgf\u001f<i?'{\u001d8\u001c>XmykQWf)i\u0013\u0018p5z&unrL\u0017\u0007'te=li\u000f7_[\"-3\u0006", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = Dp.m6638constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX INFO: renamed from: androidx.compose.material3.RadioButtonKt$RadioButton$2 */
    /* JADX INFO: compiled from: RadioButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ RadioButtonColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z2, Function0<Unit> function0, Modifier modifier, boolean z3, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            z = z2;
            function0 = function0;
            modifier = modifier;
            z = z3;
            radioButtonColors = radioButtonColors;
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
            boolean z2 = z;
            Function0<Unit> function0 = function0;
            Modifier modifier = modifier;
            boolean z3 = z;
            RadioButtonColors radioButtonColors = radioButtonColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            RadioButtonKt.RadioButton(z2, function0, modifier, z3, radioButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    public static final void RadioButton(boolean z2, Function0<Unit> function0, Modifier modifier, boolean z3, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        float fM6638constructorimpl;
        Modifier.Companion companionM1269selectableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        Modifier.Companion companion = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        RadioButtonColors radioButtonColorsColors = radioButtonColors;
        boolean z4 = z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RadioButton)P(5,4,3,1)80@3770L8,84@3868L176,88@4073L29,119@5097L415,106@4679L833:RadioButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(radioButtonColorsColors)) ? 16384 : 8192)));
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
        }
        if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i8 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, i4, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
            }
            if (z2) {
                fM6638constructorimpl = Dp.m6638constructorimpl(RadioButtonDotSize / 2);
            } else {
                fM6638constructorimpl = Dp.m6638constructorimpl(0);
            }
            final State<Dp> stateM465animateDpAsStateAjpBEmI = AnimateAsStateKt.m465animateDpAsStateAjpBEmI(fM6638constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            int i9 = (-1) - (((-1) - ((-1) - (((-1) - (i4 >> 9)) | ((-1) - 14)))) & ((-1) - ((i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i10 = i4 >> 6;
            int i11 = (i10 + 896) - (i10 | 896);
            final State<Color> stateRadioColor$material3_release = radioButtonColorsColors.radioColor$material3_release(z4, z2, composerStartRestartGroup, (i11 + i9) - (i11 & i9));
            composerStartRestartGroup.startReplaceGroup(1327106656);
            ComposerKt.sourceInformation(composerStartRestartGroup, "98@4448L164");
            if (function0 != null) {
                companionM1269selectableO2vRcR0 = SelectableKt.m1269selectableO2vRcR0(Modifier.Companion, z2, mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6638constructorimpl(RadioButtonTokens.INSTANCE.m3488getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z4, Role.m5926boximpl(Role.Companion.m5937getRadioButtono7Vup1c()), function0);
            } else {
                companionM1269selectableO2vRcR0 = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (function0 != null) {
                companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            } else {
                companionMinimumInteractiveComponentSize = Modifier.Companion;
            }
            Modifier modifierM1055requiredSize3ABfNKs = SizeKt.m1055requiredSize3ABfNKs(PaddingKt.m1018padding3ABfNKs(SizeKt.wrapContentSize$default(companion.then(companionMinimumInteractiveComponentSize).then(companionM1269selectableO2vRcR0), Alignment.Companion.getCenter(), false, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3487getIconSizeD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1327137161, "CC(remember):RadioButton.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM465animateDpAsStateAjpBEmI);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float f2 = drawScope.mo710toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f3 = 2;
                        float f4 = f2 / f3;
                        DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4188unboximpl(), drawScope.mo710toPx0680j_4(Dp.m6638constructorimpl(RadioButtonTokens.INSTANCE.m3487getIconSizeD9Ej5fM() / f3)) - f4, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m6637compareTo0680j_4(stateM465animateDpAsStateAjpBEmI.getValue().m6652unboximpl(), Dp.m6638constructorimpl(0)) > 0) {
                            DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4188unboximpl(), drawScope.mo710toPx0680j_4(stateM465animateDpAsStateAjpBEmI.getValue().m6652unboximpl()) - f4, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1055requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ RadioButtonColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ boolean $selected;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(boolean z22, Function0<Unit> function02, Modifier companion2, boolean z42, RadioButtonColors radioButtonColorsColors2, MutableInteractionSource mutableInteractionSource22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function0 = function02;
                    modifier = companion2;
                    z = z42;
                    radioButtonColors = radioButtonColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    boolean z22 = z;
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z32 = z;
                    RadioButtonColors radioButtonColors2 = radioButtonColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i32 = i;
                    RadioButtonKt.RadioButton(z22, function02, modifier2, z32, radioButtonColors2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    static {
        float f2 = 2;
        RadioButtonPadding = Dp.m6638constructorimpl(f2);
        RadioStrokeWidth = Dp.m6638constructorimpl(f2);
    }
}
