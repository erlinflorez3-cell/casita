package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDZc|İI\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`\\2\u000fq{<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172HoG3coE9ftN9.݅:8(\u0004)\u001aXH@z\tDc\f@2ptHU%M3\u001eB\fL%\u0019 rf|<xpkAG#1qrR5hH|{\u000f\rT??\u0005k6+nB]\u0015S^3\u000b`gW\u0003m~m\tv5?+w\u0003\b:f\u0010,\u0015Y`=i\u00018t\rad\u001c)AN\u0012_~!n»\u0013$\u001bQ\u001c\u000e42p.[%\u0017\f\u001c?\rr\u0002M\u0001\ndB\u000e\u0011y8-$.J[?!f_yS\u0019|?B˜ڥ\"<"}, d2 = {"5dc\u0010h9L]&kz\\;`\u0012\u001dc\r2\u0003G\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1ta@b9(T\u001a\rzm", "", "BqP;f-H`!~yM,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l-3v$/WPCk3\r\u0015{p\u000f", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "@s[", "", "BdgA90>Z\u0018p~];\u007f", "BdgA90>Z\u0018lxk6\u0004\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Aba<_3>`\u0004\t\tb;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3\f\u0013uk@\u000ec99\u00015K[R6e(", "BdgA90>Z\u0018ove<|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "BdgA?(R])\u000eg^:\r\u0010>P\r2\rD\u007f\u0017$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=4?OuD-\u0002hoI\u000er\u0017[\u0001:[\"", "BdgA90>Z\u0018lxk6\u0004\u0010+b\u0007(", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "3mP/_,=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            mutableInteractionSource = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z2);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2 */
    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z2, MutableInteractionSource mutableInteractionSource) {
            super(3);
            z = z2;
            mutableInteractionSource = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(805428266);
            ComposerKt.sourceInformation(composer, "C68@2918L7,70@3087L388,70@3063L412,83@3627L352:TextFieldScroll.kt#423gt5");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805428266, i2, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z2 = false;
            boolean z3 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || !(objConsume == LayoutDirection.Rtl) == true;
            ComposerKt.sourceInformationMarkerStart(composer, 754563504, "CC(remember):TextFieldScroll.kt#9igjgp");
            boolean zChanged = composer.changed(textFieldScrollerPosition);
            final TextFieldScrollerPosition textFieldScrollerPosition = textFieldScrollerPosition;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }

                    public final Float invoke(float f2) {
                        float offset = textFieldScrollerPosition.getOffset() + f2;
                        if (offset > textFieldScrollerPosition.getMaximum()) {
                            f2 = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
                        } else if (offset < 0.0f) {
                            f2 = -textFieldScrollerPosition.getOffset();
                        }
                        TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                        textFieldScrollerPosition2.setOffset(textFieldScrollerPosition2.getOffset() + f2);
                        return Float.valueOf(f2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) objRememberedValue, composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, 754580748, "CC(remember):TextFieldScroll.kt#9igjgp");
            boolean z4 = (-1) - (((-1) - (composer.changed(scrollableStateRememberScrollableState) ? 1 : 0)) & ((-1) - (composer.changed(textFieldScrollerPosition) ? 1 : 0))) == 1;
            final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
            Object objRememberedValue2 = composer.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ScrollableState(textFieldScrollerPosition2) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                    private final State canScrollBackward$delegate;
                    private final State canScrollForward$delegate;

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public float dispatchRawDelta(float f2) {
                        return this.$$delegate_0.dispatchRawDelta(f2);
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getLastScrolledBackward() {
                        return this.$$delegate_0.getLastScrolledBackward();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getLastScrolledForward() {
                        return this.$$delegate_0.getLastScrolledForward();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean isScrollInProgress() {
                        return this.$$delegate_0.isScrollInProgress();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                        return this.$$delegate_0.scroll(mutatePriority, function2, continuation);
                    }

                    {
                        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(textFieldScrollerPosition2.getOffset() < textFieldScrollerPosition2.getMaximum());
                            }
                        });
                        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(textFieldScrollerPosition2.getOffset() > 0.0f);
                            }
                        });
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getCanScrollForward() {
                        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getCanScrollBackward() {
                        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 = (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation = textFieldScrollerPosition.getOrientation();
            if (z && textFieldScrollerPosition.getMaximum() != 0.0f) {
                z2 = true;
            }
            Modifier modifierScrollable$default = ScrollableKt.scrollable$default(companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientation, z2, z3, null, mutableInteractionSource, 16, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierScrollable$default;
        }
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0<TextLayoutResultProxy> function0) {
        VerticalScrollLayoutModifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int iM1419getOffsetToFollow5zctL8 = textFieldScrollerPosition.m1419getOffsetToFollow5zctL8(textFieldValue.m6370getSelectiond9O1mEE());
        textFieldScrollerPosition.m1421setPreviousSelection5zctL8(textFieldValue.m6370getSelectiond9O1mEE());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, iM1419getOffsetToFollow5zctL8, transformedTextFilterWithValidation, function0);
        } else if (i2 == 2) {
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, iM1419getOffsetToFollow5zctL8, transformedTextFilterWithValidation, function0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    public static final Rect getCursorRectInScroller(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z2, int i3) {
        Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i2))) == null) {
            zero = Rect.Companion.getZero();
        }
        int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (z2) {
            left = (i3 - zero.getLeft()) - iMo704roundToPx0680j_4;
        } else {
            left = zero.getLeft();
        }
        if (z2) {
            left2 = i3 - zero.getLeft();
        } else {
            left2 = zero.getLeft() + iMo704roundToPx0680j_4;
        }
        return Rect.copy$default(zero, left, 0.0f, left2, 0.0f, 10, null);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", textFieldScrollerPosition);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(final boolean z22, final MutableInteractionSource mutableInteractionSource2) {
                super(3);
                z = z22;
                mutableInteractionSource = mutableInteractionSource2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(805428266);
                ComposerKt.sourceInformation(composer, "C68@2918L7,70@3087L388,70@3063L412,83@3627L352:TextFieldScroll.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(805428266, i2, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
                }
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(composer);
                boolean z22 = false;
                boolean z3 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || !(objConsume == LayoutDirection.Rtl) == true;
                ComposerKt.sourceInformationMarkerStart(composer, 754563504, "CC(remember):TextFieldScroll.kt#9igjgp");
                boolean zChanged = composer.changed(textFieldScrollerPosition);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }

                        public final Float invoke(float f2) {
                            float offset = textFieldScrollerPosition2.getOffset() + f2;
                            if (offset > textFieldScrollerPosition2.getMaximum()) {
                                f2 = textFieldScrollerPosition2.getMaximum() - textFieldScrollerPosition2.getOffset();
                            } else if (offset < 0.0f) {
                                f2 = -textFieldScrollerPosition2.getOffset();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition2;
                            textFieldScrollerPosition22.setOffset(textFieldScrollerPosition22.getOffset() + f2);
                            return Float.valueOf(f2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) objRememberedValue, composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, 754580748, "CC(remember):TextFieldScroll.kt#9igjgp");
                boolean z4 = (-1) - (((-1) - (composer.changed(scrollableStateRememberScrollableState) ? 1 : 0)) & ((-1) - (composer.changed(textFieldScrollerPosition) ? 1 : 0))) == 1;
                final TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition;
                Object objRememberedValue2 = composer.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new ScrollableState(textFieldScrollerPosition22) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        private final State canScrollBackward$delegate;
                        private final State canScrollForward$delegate;

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float f2) {
                            return this.$$delegate_0.dispatchRawDelta(f2);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledBackward() {
                            return this.$$delegate_0.getLastScrolledBackward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledForward() {
                            return this.$$delegate_0.getLastScrolledForward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return this.$$delegate_0.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                            return this.$$delegate_0.scroll(mutatePriority, function2, continuation);
                        }

                        {
                            this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition22.getOffset() < textFieldScrollerPosition22.getMaximum());
                                }
                            });
                            this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition22.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 = (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier.Companion companion = Modifier.Companion;
                Orientation orientation = textFieldScrollerPosition.getOrientation();
                if (z && textFieldScrollerPosition.getMaximum() != 0.0f) {
                    z22 = true;
                }
                Modifier modifierScrollable$default = ScrollableKt.scrollable$default(companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientation, z22, z3, null, mutableInteractionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierScrollable$default;
            }
        });
    }
}
