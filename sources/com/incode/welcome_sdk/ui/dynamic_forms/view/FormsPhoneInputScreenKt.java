package com.incode.welcome_sdk.ui.dynamic_forms.view;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.theme.g;
import com.incode.welcome_sdk.commons.utils.v;
import com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.view.components.EmojiViewKt;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsPhoneInputScreenKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13774b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13775d = 0;

    public static final /* synthetic */ void access$PhoneTextField(FormsPhoneInputUiState formsPhoneInputUiState, Function1 function1, Function1 function12, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13775d + 47;
        f13774b = i4 % 128;
        int i5 = i4 % 2;
        a(formsPhoneInputUiState, function1, function12, composer, i2);
        int i6 = f13774b + 27;
        f13775d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
    }

    public static final /* synthetic */ void access$Preview_FormsPhoneInputScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13775d + 21;
        f13774b = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        if (i5 == 0) {
            throw null;
        }
        int i6 = f13774b + 77;
        f13775d = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static final class d extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13792b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13793d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13794c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsPhoneInputUiState f13795e;

        private void a(TextFieldValue textFieldValue) {
            int i2 = 2 % 2;
            int i3 = f13792b + 59;
            f13793d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(textFieldValue, "");
            this.f13794c.invoke(this.f13795e.getId(), textFieldValue.getText());
            int i5 = f13793d + 75;
            f13792b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            int i2 = 2 % 2;
            int i3 = f13792b + 115;
            f13793d = i3 % 128;
            int i4 = i3 % 2;
            a(textFieldValue);
            Unit unit = Unit.INSTANCE;
            int i5 = f13793d + 11;
            f13792b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super String, ? super String, Unit> function2, FormsPhoneInputUiState formsPhoneInputUiState) {
            super(1);
            this.f13794c = function2;
            this.f13795e = formsPhoneInputUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FormsPhoneInputScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState r62, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r63, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.FormsPhoneInputScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final void a(FormsPhoneInputUiState formsPhoneInputUiState, Function1<? super TextFieldValue, Unit> function1, Function1<? super String, Unit> function12, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(179485930);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(formsPhoneInputUiState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(179485930, i3, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.PhoneTextField (FormsPhoneInputScreen.kt:86)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            MutableState mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1301RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f));
            Modifier.Companion companion = Modifier.Companion;
            float fM6638constructorimpl = Dp.m6638constructorimpl(2.0f);
            g.b bVar = g.b.f5657e;
            RoundedCornerShape roundedCornerShape = roundedCornerShapeM1301RoundedCornerShape0680j_4;
            Modifier modifierM1018padding3ABfNKs = PaddingKt.m1018padding3ABfNKs(BorderKt.m584borderxT4_qwU(companion, fM6638constructorimpl, g.b.j(), roundedCornerShape), Dp.m6638constructorimpl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1018padding3ABfNKs);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String flagEmoji = formsPhoneInputUiState.getFlagEmoji();
            composerStartRestartGroup.startReplaceableGroup(1361908743);
            if (flagEmoji != null) {
                g.d dVar = g.d.f5677e;
                EmojiViewKt.EmojiView(flagEmoji, g.d.a(), composerStartRestartGroup, 48, 0);
                SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(8.0f)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            g.b bVar2 = g.b.f5657e;
            Modifier modifierM572backgroundbw27NRU = BackgroundKt.m572backgroundbw27NRU(modifierFillMaxWidth$default, g.b.c(), roundedCornerShape);
            composerStartRestartGroup.startReplaceableGroup(-58921805);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(function12) | composerStartRestartGroup.changed(formsPhoneInputUiState);
            b bVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || bVarRememberedValue == Composer.Companion.getEmpty()) {
                bVarRememberedValue = new b(mutableState, function12, formsPhoneInputUiState);
                composerStartRestartGroup.updateRememberedValue(bVarRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM572backgroundbw27NRU, (Function1) bVarRememberedValue);
            TextFieldValue textFieldValue = new TextFieldValue(formsPhoneInputUiState.getAnswer2(), TextRangeKt.TextRange(formsPhoneInputUiState.getAnswer2().length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6361getPhonePjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            v vVar = v.f6649b;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String strE = v.e((Context) objConsume);
            composerStartRestartGroup.startReplaceableGroup(414512006);
            Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1274527078);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(scopeCurrentKoinScope) | composerStartRestartGroup.changed((Object) null);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = scopeCurrentKoinScope.get(Reflection.getOrCreateKotlinClass(PhoneNumberUtil.class), null, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            PhoneNumberVisualTransformation phoneNumberVisualTransformation = new PhoneNumberVisualTransformation(strE, (PhoneNumberUtil) objRememberedValue3);
            g.d dVar2 = g.d.f5677e;
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierOnFocusChanged, false, false, TextStyle.m6136copyp1EtxEg$default(g.d.a(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), keyboardOptions, (KeyboardActions) null, true, 0, 0, (VisualTransformation) phoneNumberVisualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, (i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | 102236160, 3072, 54936);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new c(formsPhoneInputUiState, function1, function12, i2));
        }
    }

    static final class b extends Lambda implements Function1<FocusState, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13781c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13782d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableState<Boolean> f13784b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsPhoneInputUiState f13785e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(FocusState focusState) {
            int i2 = 2 % 2;
            int i3 = f13782d + 73;
            f13781c = i3 % 128;
            int i4 = i3 % 2;
            e(focusState);
            Unit unit = Unit.INSTANCE;
            int i5 = f13781c + 59;
            f13782d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(FocusState focusState) {
            int i2 = 2 % 2;
            int i3 = f13781c + 49;
            f13782d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(focusState, "");
            if (!focusState.isFocused()) {
                int i5 = f13782d + 73;
                f13781c = i5 % 128;
                int i6 = i5 % 2;
                if (this.f13784b.getValue().booleanValue()) {
                    int i7 = f13782d + 125;
                    f13781c = i7 % 128;
                    int i8 = i7 % 2;
                    this.f13783a.invoke(this.f13785e.getId());
                    int i9 = f13781c + 125;
                    f13782d = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            this.f13784b.setValue(Boolean.valueOf(focusState.isFocused()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(MutableState<Boolean> mutableState, Function1<? super String, Unit> function1, FormsPhoneInputUiState formsPhoneInputUiState) {
            super(1);
            this.f13784b = mutableState;
            this.f13783a = function1;
            this.f13785e = formsPhoneInputUiState;
        }
    }

    static final class a extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13776a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13777b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13778c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13779d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13780e = 0;

        private static void b(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13780e + 35;
            f13777b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i5 = f13777b + 87;
            f13780e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13780e + 115;
            f13777b = i3 % 128;
            int i4 = i3 % 2;
            b(str, str2);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 30 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13779d + 105;
            f13776a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        a() {
            super(2);
        }
    }

    static final class f extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13802a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f13803b = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13804c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13805d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13806e = 1;

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13806e + 13;
            f13805d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = f13805d + 103;
            f13806e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13806e + 27;
            f13805d = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13806e + 87;
            f13805d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13802a + 23;
            f13804c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
        }

        f() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(androidx.compose.runtime.Composer r6, int r7) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13774b
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13775d = r0
            int r1 = r1 % r5
            r2 = -212242663(0xfffffffff3596f19, float:-1.7226894E31)
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            if (r7 != 0) goto L26
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13775d
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13774b = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L6c
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L68
        L26:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L32
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsPhoneInputScreen (FormsPhoneInputScreen.kt:131)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r1, r0)
        L32:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState$Companion r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState.f13344a
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState r3 = r0.previewData$onboard_release()
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt$a r2 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.a.f13778c
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt$f r1 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f.f13803b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 432(0x1b0, float:6.05E-43)
            FormsPhoneInputScreen(r3, r2, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L4e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L4e:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L67
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt$g r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt$g
            r0.<init>(r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13774b
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.f13775d = r0
            int r1 = r1 % r5
        L67:
            return
        L68:
            r4.skipToGroupEnd()
            goto L4e
        L6c:
            r4.getSkipping()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsPhoneInputScreenKt.d(androidx.compose.runtime.Composer, int):void");
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13786c = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f13787i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ FormsPhoneInputUiState f13788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f13789b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<TextFieldValue, Unit> f13790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13791e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13786c + 13;
            f13787i = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13786c + 109;
            f13787i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13786c + 73;
            f13787i = i3 % 128;
            int i4 = i3 % 2;
            FormsPhoneInputScreenKt.access$PhoneTextField(this.f13788a, this.f13790d, this.f13791e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13789b | 1));
            int i5 = f13786c + 81;
            f13787i = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(FormsPhoneInputUiState formsPhoneInputUiState, Function1<? super TextFieldValue, Unit> function1, Function1<? super String, Unit> function12, int i2) {
            super(2);
            this.f13788a = formsPhoneInputUiState;
            this.f13790d = function1;
            this.f13791e = function12;
            this.f13789b = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13796b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f13797f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13798a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsPhoneInputUiState f13799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13801e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13797f + 87;
            f13796b = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13796b + 9;
            f13797f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            FormsPhoneInputUiState formsPhoneInputUiState;
            Function2<String, String, Unit> function2;
            Function1<String, Unit> function1;
            int i2;
            int i3 = 2 % 2;
            int i4 = f13796b + 45;
            f13797f = i4 % 128;
            if (i4 % 2 == 0) {
                formsPhoneInputUiState = this.f13799c;
                function2 = this.f13798a;
                function1 = this.f13801e;
                i2 = this.f13800d;
            } else {
                formsPhoneInputUiState = this.f13799c;
                function2 = this.f13798a;
                function1 = this.f13801e;
                i2 = this.f13800d | 1;
            }
            FormsPhoneInputScreenKt.FormsPhoneInputScreen(formsPhoneInputUiState, function2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2));
            int i5 = f13797f + 27;
            f13796b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(FormsPhoneInputUiState formsPhoneInputUiState, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, int i2) {
            super(2);
            this.f13799c = formsPhoneInputUiState;
            this.f13798a = function2;
            this.f13801e = function1;
            this.f13800d = i2;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13807d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13808e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13809a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13807d + 121;
            f13808e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f13807d + 87;
            f13808e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13807d + 121;
            f13808e = i3 % 128;
            FormsPhoneInputScreenKt.access$Preview_FormsPhoneInputScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 == 0 ? this.f13809a : this.f13809a | 1));
            int i4 = f13807d + 17;
            f13808e = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(2);
            this.f13809a = i2;
        }
    }
}
