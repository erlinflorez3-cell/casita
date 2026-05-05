package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: HeightInLinesModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,o\bӵLc\u0003\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`ݷB%y{L$\n%\"GIW2}P\b\u007fRuj\u0007J\t\n\nƤ\u001e<\u0007nDI\u0004}\u0006\u0012=7rsM9eok@\u0011z<\u0005.4:8(\u00041 0H\u001ey\u0013Cy\u000bXؓ`|Hĥ%M3\u0019hà\u0011ŋ\u0005\u001edɡߗ:PȀaB=,\u001bipX}ۊܣ|"}, d2 = {"\u0012dU.h3M;\u001d\bab5|\u0017", "", "D`[6W(MS\u0001\u0003\u0004F(\u0010o3n\u007f6", "", ";h]\u0019\\5>a", ";`g\u0019\\5>a", "6dX4[;\"\\\u007f\u0003\u0004^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4nd;W(MW#\btk,\u0004\t+s\u007f", "Bx_2Y(<S", ""}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 1;
        }
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i2, i3);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2 */
    /* JADX INFO: compiled from: HeightInLinesModifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ TextStyle $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, int i3, TextStyle textStyle) {
            super(3);
            i = i2;
            i = i3;
            textStyle = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(408240218);
            ComposerKt.sourceInformation(composer, "C62@2391L7,63@2452L7,64@2507L7,68@2678L96,71@2795L312,80@3135L366,96@3533L428:HeightInLinesModifier.kt#423gt5");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408240218, i2, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(i, i);
            if (i == 1 && i == Integer.MAX_VALUE) {
                Modifier.Companion companion = Modifier.Companion;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return companion;
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) objConsume;
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localFontFamilyResolver);
            ComposerKt.sourceInformationMarkerEnd(composer);
            FontFamily.Resolver resolver = (FontFamily.Resolver) objConsume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
            ComposerKt.sourceInformationMarkerStart(composer, -1954450869, "CC(remember):HeightInLinesModifier.kt#9igjgp");
            boolean zChanged = composer.changed(textStyle);
            boolean zChanged2 = composer.changed(layoutDirection);
            boolean z2 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
            TextStyle textStyle = textStyle;
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                composer.updateRememberedValue(objRememberedValue);
            }
            TextStyle textStyle2 = (TextStyle) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1954446909, "CC(remember):HeightInLinesModifier.kt#9igjgp");
            boolean zChanged3 = composer.changed(resolver) | composer.changed(textStyle2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                FontFamily fontFamily = textStyle2.getFontFamily();
                FontWeight fontWeight = textStyle2.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle fontStyleM6155getFontStyle4Lr2A7w = textStyle2.m6155getFontStyle4Lr2A7w();
                int iM6236unboximpl = fontStyleM6155getFontStyle4Lr2A7w != null ? fontStyleM6155getFontStyle4Lr2A7w.m6236unboximpl() : FontStyle.Companion.m6240getNormal_LCdwA();
                FontSynthesis fontSynthesisM6156getFontSynthesisZQGJjVo = textStyle2.m6156getFontSynthesisZQGJjVo();
                objRememberedValue2 = resolver.mo6208resolveDPcqOEQ(fontFamily, fontWeight, iM6236unboximpl, fontSynthesisM6156getFontSynthesisZQGJjVo != null ? fontSynthesisM6156getFontSynthesisZQGJjVo.m6249unboximpl() : FontSynthesis.Companion.m6250getAllGVVA2EU());
                composer.updateRememberedValue(objRememberedValue2);
            }
            State state = (State) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Object value = state.getValue();
            ComposerKt.sourceInformationMarkerStart(composer, -1954435975, "CC(remember):HeightInLinesModifier.kt#9igjgp");
            boolean zChanged4 = composer.changed(density);
            boolean zChanged5 = composer.changed(resolver);
            int i3 = (((zChanged4 ? 1 : 0) + (zChanged5 ? 1 : 0)) - ((zChanged4 ? 1 : 0) & (zChanged5 ? 1 : 0)) != 1 ? 0 : 1) | (composer.changed(textStyle) ? 1 : 0) | (composer.changed(layoutDirection) ? 1 : 0);
            boolean zChanged6 = composer.changed(value);
            boolean z3 = ((zChanged6 ? 1 : 0) + i3) - ((zChanged6 ? 1 : 0) & i3) == 1;
            Object objRememberedValue3 = composer.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(IntSize.m6807getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                composer.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            Object value2 = state.getValue();
            ComposerKt.sourceInformationMarkerStart(composer, -1954423177, "CC(remember):HeightInLinesModifier.kt#9igjgp");
            int i4 = (composer.changed(layoutDirection) ? 1 : 0) | (composer.changed(density) ? 1 : 0) | (composer.changed(resolver) ? 1 : 0) | (composer.changed(textStyle) ? 1 : 0);
            boolean zChanged7 = composer.changed(value2);
            boolean z4 = (i4 + (zChanged7 ? 1 : 0)) - (i4 & (zChanged7 ? 1 : 0)) == 1;
            Object objRememberedValue4 = composer.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(IntSize.m6807getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                composer.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue2 = ((Number) objRememberedValue4).intValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            int i5 = iIntValue2 - iIntValue;
            int i6 = i;
            Integer numValueOf = i6 == 1 ? null : Integer.valueOf(((i6 - 1) * i5) + iIntValue);
            int i7 = i;
            Integer numValueOf2 = i7 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (i5 * (i7 - 1))) : null;
            Modifier modifierM1050heightInVpY3zN4 = SizeKt.m1050heightInVpY3zN4(Modifier.Companion, numValueOf != null ? density.mo707toDpu2uoSUM(numValueOf.intValue()) : Dp.Companion.m6658getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo707toDpu2uoSUM(numValueOf2.intValue()) : Dp.Companion.m6658getUnspecifiedD9Ej5fM());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierM1050heightInVpY3zN4;
        }
    }

    public static final void validateMinMaxLines(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero").toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(("minLines " + i2 + " must be less than or equal to maxLines " + i3).toString());
        }
    }

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i2, final int i3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i3));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            final /* synthetic */ int $maxLines;
            final /* synthetic */ int $minLines;
            final /* synthetic */ TextStyle $textStyle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(final int i22, final int i32, final TextStyle textStyle2) {
                super(3);
                i = i22;
                i = i32;
                textStyle = textStyle2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i22) {
                composer.startReplaceGroup(408240218);
                ComposerKt.sourceInformation(composer, "C62@2391L7,63@2452L7,64@2507L7,68@2678L96,71@2795L312,80@3135L366,96@3533L428:HeightInLinesModifier.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i22, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i, i);
                if (i == 1 && i == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.Companion;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return companion;
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) objConsume;
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composer.consume(localFontFamilyResolver);
                ComposerKt.sourceInformationMarkerEnd(composer);
                FontFamily.Resolver resolver = (FontFamily.Resolver) objConsume2;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composer.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                ComposerKt.sourceInformationMarkerStart(composer, -1954450869, "CC(remember):HeightInLinesModifier.kt#9igjgp");
                boolean zChanged = composer.changed(textStyle);
                boolean zChanged2 = composer.changed(layoutDirection);
                boolean z2 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
                TextStyle textStyle2 = textStyle;
                Object objRememberedValue = composer.rememberedValue();
                if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextStyle textStyle22 = (TextStyle) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -1954446909, "CC(remember):HeightInLinesModifier.kt#9igjgp");
                boolean zChanged3 = composer.changed(resolver) | composer.changed(textStyle22);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    FontFamily fontFamily = textStyle22.getFontFamily();
                    FontWeight fontWeight = textStyle22.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.Companion.getNormal();
                    }
                    FontStyle fontStyleM6155getFontStyle4Lr2A7w = textStyle22.m6155getFontStyle4Lr2A7w();
                    int iM6236unboximpl = fontStyleM6155getFontStyle4Lr2A7w != null ? fontStyleM6155getFontStyle4Lr2A7w.m6236unboximpl() : FontStyle.Companion.m6240getNormal_LCdwA();
                    FontSynthesis fontSynthesisM6156getFontSynthesisZQGJjVo = textStyle22.m6156getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo6208resolveDPcqOEQ(fontFamily, fontWeight, iM6236unboximpl, fontSynthesisM6156getFontSynthesisZQGJjVo != null ? fontSynthesisM6156getFontSynthesisZQGJjVo.m6249unboximpl() : FontSynthesis.Companion.m6250getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                State state = (State) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Object value = state.getValue();
                ComposerKt.sourceInformationMarkerStart(composer, -1954435975, "CC(remember):HeightInLinesModifier.kt#9igjgp");
                boolean zChanged4 = composer.changed(density);
                boolean zChanged5 = composer.changed(resolver);
                int i32 = (((zChanged4 ? 1 : 0) + (zChanged5 ? 1 : 0)) - ((zChanged4 ? 1 : 0) & (zChanged5 ? 1 : 0)) != 1 ? 0 : 1) | (composer.changed(textStyle) ? 1 : 0) | (composer.changed(layoutDirection) ? 1 : 0);
                boolean zChanged6 = composer.changed(value);
                boolean z3 = ((zChanged6 ? 1 : 0) + i32) - ((zChanged6 ? 1 : 0) & i32) == 1;
                Object objRememberedValue3 = composer.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m6807getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle22, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                int iIntValue = ((Number) objRememberedValue3).intValue();
                ComposerKt.sourceInformationMarkerEnd(composer);
                Object value2 = state.getValue();
                ComposerKt.sourceInformationMarkerStart(composer, -1954423177, "CC(remember):HeightInLinesModifier.kt#9igjgp");
                int i4 = (composer.changed(layoutDirection) ? 1 : 0) | (composer.changed(density) ? 1 : 0) | (composer.changed(resolver) ? 1 : 0) | (composer.changed(textStyle) ? 1 : 0);
                boolean zChanged7 = composer.changed(value2);
                boolean z4 = (i4 + (zChanged7 ? 1 : 0)) - (i4 & (zChanged7 ? 1 : 0)) == 1;
                Object objRememberedValue4 = composer.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m6807getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle22, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                int iIntValue2 = ((Number) objRememberedValue4).intValue();
                ComposerKt.sourceInformationMarkerEnd(composer);
                int i5 = iIntValue2 - iIntValue;
                int i6 = i;
                Integer numValueOf = i6 == 1 ? null : Integer.valueOf(((i6 - 1) * i5) + iIntValue);
                int i7 = i;
                Integer numValueOf2 = i7 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (i5 * (i7 - 1))) : null;
                Modifier modifierM1050heightInVpY3zN4 = SizeKt.m1050heightInVpY3zN4(Modifier.Companion, numValueOf != null ? density.mo707toDpu2uoSUM(numValueOf.intValue()) : Dp.Companion.m6658getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo707toDpu2uoSUM(numValueOf2.intValue()) : Dp.Companion.m6658getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM1050heightInVpY3zN4;
            }
        });
    }
}
