package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDJe|\u0004W\u00068\u000b<G\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWNupvϺr=Q\u0015\u001e\u0016'qTI\u0004\u007f\u000e\u0016\u001d:Zom<}sKCxtd\u0010P60D\u0012\u0005/'ZL\u001e\u0005\u0013Cy\u001bB4N\u0001RR;^K܅2\u001aLĨ\u0019\u001e\u000bf%ȥJǰaB7#\u0011kZP-_>}m\u001fTW?\u0013\u0007c.+n<c\u0019{و\u0005\u07baV[GšӳuO"}, d2 = {"\u0012dU.h3M1)\f\th9k\f3c\u00061{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0011X-:c \u000eXn9\u000b\u0013<T\u0003,yF\n\u0017%U", "u(5", "\u0014", "1ta@b9\u001a\\\u001d\u0007vm0\u0007\u0012\u001dp\u007f&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "1ta@b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "1ta@b9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "3mP/_,=", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldCursorKt {
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.at(fValueOf, 0);
            keyframesSpecConfig.at(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.at(fValueOf2, 500);
            keyframesSpecConfig.at(fValueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m6638constructorimpl(2);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1 */
    /* JADX INFO: compiled from: TextFieldCursor.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ LegacyTextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            super(3);
            legacyTextFieldState = legacyTextFieldState;
            textFieldValue = textFieldValue;
            offsetMapping = offsetMapping;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            Modifier.Companion companionDrawWithContent;
            composer.startReplaceGroup(-84507373);
            ComposerKt.sourceInformation(composer, "C45@1789L35,51@2211L7:TextFieldCursor.kt#423gt5");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84507373, i2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1411529727, "CC(remember):TextFieldCursor.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CursorAnimationState();
                composer.updateRememberedValue(objRememberedValue);
            }
            final CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Brush brush = brush;
            boolean z2 = ((brush instanceof SolidColor) && ((SolidColor) brush).m4513getValue0d7_KjU() == 16) ? false : true;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localWindowInfo);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (((WindowInfo) objConsume).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m6117getCollapsedimpl(textFieldValue.m6370getSelectiond9O1mEE()) && z2) {
                composer.startReplaceGroup(808320157);
                ComposerKt.sourceInformation(composer, "53@2392L65,53@2337L120,56@2482L1096");
                AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                TextRange textRangeM6111boximpl = TextRange.m6111boximpl(textFieldValue.m6370getSelectiond9O1mEE());
                ComposerKt.sourceInformationMarkerStart(composer, 1411549053, "CC(remember):TextFieldCursor.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function2) new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EffectsKt.LaunchedEffect(annotatedString, textRangeM6111boximpl, (Function2) objRememberedValue2, composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, 1411552964, "CC(remember):TextFieldCursor.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState);
                boolean zChangedInstance3 = composer.changedInstance(offsetMapping);
                int i3 = ((zChangedInstance2 ? 1 : 0) + (zChangedInstance3 ? 1 : 0)) - ((zChangedInstance2 ? 1 : 0) & (zChangedInstance3 ? 1 : 0)) != 1 ? 0 : 1;
                boolean zChanged = composer.changed(textFieldValue);
                int i4 = (i3 + (zChanged ? 1 : 0)) - (i3 & (zChanged ? 1 : 0)) != 1 ? 0 : 1;
                boolean zChangedInstance4 = composer.changedInstance(legacyTextFieldState);
                boolean zChanged2 = ((i4 + (zChangedInstance4 ? 1 : 0)) - (i4 & (zChangedInstance4 ? 1 : 0)) == 1) | composer.changed(brush);
                final OffsetMapping offsetMapping = offsetMapping;
                final TextFieldValue textFieldValue = textFieldValue;
                final LegacyTextFieldState legacyTextFieldState = legacyTextFieldState;
                final Brush brush2 = brush;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = (Function1) new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ContentDrawScope contentDrawScope) {
                            Rect rect;
                            TextLayoutResult value;
                            contentDrawScope.drawContent();
                            float cursorAlpha = cursorAnimationState.getCursorAlpha();
                            if (cursorAlpha != 0.0f) {
                                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m6123getStartimpl(textFieldValue.m6370getSelectiond9O1mEE()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float f2 = contentDrawScope.mo710toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                                float f3 = f2 / 2;
                                float fCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(rect.getLeft() + f3, Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - f3), f3);
                                DrawScope.m4719drawLine1RTmtNc$default(contentDrawScope, brush2, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), f2, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companionDrawWithContent = DrawModifierKt.drawWithContent(modifier, (Function1) objRememberedValue3);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(809534830);
                composer.endReplaceGroup();
                companionDrawWithContent = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return companionDrawWithContent;
        }
    }

    public static final Modifier cursor(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z2) {
        return z2 ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1
            final /* synthetic */ OffsetMapping $offsetMapping;
            final /* synthetic */ LegacyTextFieldState $state;
            final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LegacyTextFieldState legacyTextFieldState2, TextFieldValue textFieldValue2, OffsetMapping offsetMapping2) {
                super(3);
                legacyTextFieldState = legacyTextFieldState2;
                textFieldValue = textFieldValue2;
                offsetMapping = offsetMapping2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                Modifier.Companion companionDrawWithContent;
                composer.startReplaceGroup(-84507373);
                ComposerKt.sourceInformation(composer, "C45@1789L35,51@2211L7:TextFieldCursor.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 1411529727, "CC(remember):TextFieldCursor.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new CursorAnimationState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Brush brush2 = brush;
                boolean z22 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).m4513getValue0d7_KjU() == 16) ? false : true;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localWindowInfo);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (((WindowInfo) objConsume).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m6117getCollapsedimpl(textFieldValue.m6370getSelectiond9O1mEE()) && z22) {
                    composer.startReplaceGroup(808320157);
                    ComposerKt.sourceInformation(composer, "53@2392L65,53@2337L120,56@2482L1096");
                    AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                    TextRange textRangeM6111boximpl = TextRange.m6111boximpl(textFieldValue.m6370getSelectiond9O1mEE());
                    ComposerKt.sourceInformationMarkerStart(composer, 1411549053, "CC(remember):TextFieldCursor.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function2) new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    EffectsKt.LaunchedEffect(annotatedString, textRangeM6111boximpl, (Function2) objRememberedValue2, composer, 0);
                    ComposerKt.sourceInformationMarkerStart(composer, 1411552964, "CC(remember):TextFieldCursor.kt#9igjgp");
                    boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState);
                    boolean zChangedInstance3 = composer.changedInstance(offsetMapping);
                    int i3 = ((zChangedInstance2 ? 1 : 0) + (zChangedInstance3 ? 1 : 0)) - ((zChangedInstance2 ? 1 : 0) & (zChangedInstance3 ? 1 : 0)) != 1 ? 0 : 1;
                    boolean zChanged = composer.changed(textFieldValue);
                    int i4 = (i3 + (zChanged ? 1 : 0)) - (i3 & (zChanged ? 1 : 0)) != 1 ? 0 : 1;
                    boolean zChangedInstance4 = composer.changedInstance(legacyTextFieldState);
                    boolean zChanged2 = ((i4 + (zChangedInstance4 ? 1 : 0)) - (i4 & (zChangedInstance4 ? 1 : 0)) == 1) | composer.changed(brush);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush22 = brush;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = cursorAnimationState.getCursorAlpha();
                                if (cursorAlpha != 0.0f) {
                                    int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m6123getStartimpl(textFieldValue2.m6370getSelectiond9O1mEE()));
                                    TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                    if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                        rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                    }
                                    float f2 = contentDrawScope.mo710toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                                    float f3 = f2 / 2;
                                    float fCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(rect.getLeft() + f3, Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - f3), f3);
                                    DrawScope.m4719drawLine1RTmtNc$default(contentDrawScope, brush22, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), f2, 0, null, cursorAlpha, null, 0, 432, null);
                                }
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    companionDrawWithContent = DrawModifierKt.drawWithContent(modifier2, (Function1) objRememberedValue3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(809534830);
                    composer.endReplaceGroup();
                    companionDrawWithContent = Modifier.Companion;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return companionDrawWithContent;
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
