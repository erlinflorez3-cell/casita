package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.theme.g;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.view.components.EmojiViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsCountrySelectorScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13535a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13536c = 1;

    public static final /* synthetic */ void access$CountryPickerDialog(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1 function1, Function2 function2, Function2 function22, Function1 function12, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13535a + 103;
        f13536c = i4 % 128;
        int i5 = i4 % 2;
        d(formsCountrySelectorUiState, function1, function2, function22, function12, composer, i2);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f13535a + 13;
        f13536c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 38 / 0;
        }
    }

    public static final /* synthetic */ void access$CountryTextField(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1 function1, Function1 function12, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13535a + 3;
        f13536c = i4 % 128;
        int i5 = i4 % 2;
        e(formsCountrySelectorUiState, function1, function12, composer, i2);
        int i6 = f13535a + 57;
        f13536c = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$OptionItem(FormsCountrySelectorUiState.CountryUiState countryUiState, Function1 function1, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13536c + 103;
        f13535a = i4 % 128;
        int i5 = i4 % 2;
        e(countryUiState, function1, composer, i2);
        int i6 = f13536c + 73;
        f13535a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$Preview_CountryPickerDialog_Default(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13535a + 45;
        f13536c = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        if (i5 == 0) {
            int i6 = 54 / 0;
        }
    }

    public static final /* synthetic */ void access$Preview_FormsCountrySelectorOldScreen_Default(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13536c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13535a = i4 % 128;
        int i5 = i4 % 2;
        a(composer, i2);
        if (i5 != 0) {
            int i6 = 48 / 0;
        }
        int i7 = f13535a + 33;
        f13536c = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$Preview_FormsCountrySelectorScreen_Selected(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13536c + 13;
        f13535a = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f13535a + 101;
        f13536c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FormsCountrySelectorScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r58, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r59, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r60, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r61, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.CountryUiState, kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, int r65) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.FormsCountrySelectorScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final void e(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Composer composer, int i2) {
        boolean z2;
        String strStringResource;
        long jH;
        Composer composerStartRestartGroup = composer.startRestartGroup(888036852);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(888036852, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryTextField (FormsCountrySelectorScreen.kt:99)");
        }
        Unit unit = null;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        float fM6638constructorimpl = Dp.m6638constructorimpl(2.0f);
        g.b bVar = g.b.f5657e;
        Modifier modifierM584borderxT4_qwU = BorderKt.m584borderxT4_qwU(modifierFillMaxWidth$default, fM6638constructorimpl, g.b.j(), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f)));
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM584borderxT4_qwU);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(8.0f)), composerStartRestartGroup, 6);
        FormsCountrySelectorUiState.CountryUiState answer = formsCountrySelectorUiState.getAnswer();
        composerStartRestartGroup.startReplaceableGroup(-1725332881);
        if (answer == null) {
            z2 = false;
        } else {
            String flagEmoji = answer.getFlagEmoji();
            g.d dVar = g.d.f5677e;
            z2 = false;
            EmojiViewKt.EmojiView(flagEmoji, g.d.a(), composerStartRestartGroup, 48, 0);
            unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1725332895);
        if (unit == null) {
            g.b bVar2 = g.b.f5657e;
            IconKt.m2168Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Search", (Modifier) null, g.b.h(), composerStartRestartGroup, 3120, 4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(8.0f)), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1725332382);
        if (formsCountrySelectorUiState.getAnswer() != null) {
            strStringResource = formsCountrySelectorUiState.getSearchedText();
        } else {
            strStringResource = StringResources_androidKt.stringResource(R.string.onboard_sdk_dynamic_forms_country_selector_hint, composerStartRestartGroup, z2 ? 1 : 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AnnotatedString annotatedString = new AnnotatedString(strStringResource, null, null, 6, null);
        if (formsCountrySelectorUiState.getAnswer() != null) {
            g.b bVar3 = g.b.f5657e;
            jH = g.b.d();
        } else {
            g.b bVar4 = g.b.f5657e;
            jH = g.b.h();
        }
        Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m6638constructorimpl(16.0f), 1, null);
        g.b bVar5 = g.b.f5657e;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, BackgroundKt.m573backgroundbw27NRU$default(modifierM1020paddingVpY3zN4$default, g.b.c(), null, 2, null), 1.0f, false, 2, null);
        g.d dVar2 = g.d.f5677e;
        ClickableTextKt.m1319ClickableText4YKlhWE(annotatedString, modifierWeight$default, TextStyle.m6136copyp1EtxEg$default(g.d.a(), jH, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), false, 0, 0, null, new c(function1, formsCountrySelectorUiState), composerStartRestartGroup, 0, 120);
        SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(8.0f)), composerStartRestartGroup, 6);
        if (formsCountrySelectorUiState.getAnswer() != null) {
            z2 = true;
        }
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -120917082, true, new a(function12, formsCountrySelectorUiState)), composerStartRestartGroup, 1572870, 30);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(formsCountrySelectorUiState, function1, function12, i2));
        }
    }

    static final class c extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13571a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13572d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13573b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13574e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int i2 = 2 % 2;
            int i3 = f13572d + 93;
            f13571a = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f13572d + 79;
            f13571a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f13571a + 7;
            f13572d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f13573b.invoke(this.f13574e.getId());
                int i4 = 24 / 0;
            } else {
                this.f13573b.invoke(this.f13574e.getId());
            }
            int i5 = f13572d + 79;
            f13571a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super String, Unit> function1, FormsCountrySelectorUiState formsCountrySelectorUiState) {
            super(1);
            this.f13573b = function1;
            this.f13574e = formsCountrySelectorUiState;
        }
    }

    static final class a extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13556b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13557e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13558a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13559c;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13556b + 27;
            f13557e = i3 % 128;
            int i4 = i3 % 2;
            d(animatedVisibilityScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13557e + 5;
            f13556b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d(androidx.compose.animation.AnimatedVisibilityScope r14, androidx.compose.runtime.Composer r15, int r16) {
            /*
                r13 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13557e
                int r1 = r0 + 71
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13556b = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L5f
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                int r0 = r3 / 0
                if (r1 == 0) goto L26
            L1b:
                r2 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryTextField.<anonymous>.<anonymous>.<anonymous> (FormsCountrySelectorScreen.kt:149)"
                r0 = -120917082(0xfffffffff8caf3a6, float:-3.2930804E34)
                r4 = r16
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r2, r1)
            L26:
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$a$1 r4 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$a$1
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r13.f13558a
                com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r0 = r13.f13559c
                r4.<init>()
                kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.f13424e
                kotlin.jvm.functions.Function2 r9 = r0.m8449getLambda1$onboard_release()
                r11 = 196608(0x30000, float:2.75506E-40)
                r12 = 30
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = r15
                androidx.compose.material3.IconButtonKt.IconButton(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L5e
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13556b
                int r1 = r0 + 97
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13557e = r0
                int r1 = r1 % r3
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13556b
                int r1 = r0 + 81
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.f13557e = r0
                int r1 = r1 % r3
            L5e:
                return
            L5f:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L26
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a.d(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super String, Unit> function1, FormsCountrySelectorUiState formsCountrySelectorUiState) {
            super(3);
            this.f13558a = function1;
            this.f13559c = formsCountrySelectorUiState;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13567a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13568e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13569b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13570d;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13568e + 51;
            f13567a = i3 % 128;
            int i4 = i3 % 2;
            this.f13569b.invoke(this.f13570d.getId());
            int i5 = f13567a + 83;
            f13568e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13567a + 59;
            f13568e = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13568e + 103;
            f13567a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super String, Unit> function1, FormsCountrySelectorUiState formsCountrySelectorUiState) {
            super(0);
            this.f13569b = function1;
            this.f13570d = formsCountrySelectorUiState;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f13583g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f13584h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> f13587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ RoundedCornerShape f13589e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13584h + 99;
            f13583g = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13583g + 117;
            f13584h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return unit;
        }

        private void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(928735304, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog.<anonymous> (FormsCountrySelectorScreen.kt:172)");
                int i4 = f13583g + 89;
                f13584h = i4 % 128;
                int i5 = i4 % 2;
            }
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m6638constructorimpl(60.0f), 1, null);
            float fM6638constructorimpl = Dp.m6638constructorimpl(2.0f);
            g.b bVar = g.b.f5657e;
            Modifier modifierM584borderxT4_qwU = BorderKt.m584borderxT4_qwU(modifierM1020paddingVpY3zN4$default, fM6638constructorimpl, g.b.j(), this.f13589e);
            RoundedCornerShape roundedCornerShape = this.f13589e;
            g.b bVar2 = g.b.f5657e;
            long jC = g.b.c();
            final FormsCountrySelectorUiState formsCountrySelectorUiState = this.f13586b;
            final Function2<String, String, Unit> function2 = this.f13588d;
            final Function1<String, Unit> function1 = this.f13585a;
            final Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> function22 = this.f13587c;
            SurfaceKt.m2561SurfaceT9BRK9s(modifierM584borderxT4_qwU, roundedCornerShape, jC, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, -2076578483, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f13590d = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f13591h = 1;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    int i6 = 2 % 2;
                    int i7 = f13591h + 107;
                    f13590d = i7 % 128;
                    int i8 = i7 % 2;
                    c(composer2, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i9 = f13591h + 61;
                    f13590d = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$a */
                static final class a extends Lambda implements Function1<String, Unit> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f13596a = 1;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f13597b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Function2<String, String, Unit> f13598c;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private /* synthetic */ FormsCountrySelectorUiState f13599e;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(String str) {
                        int i2 = 2 % 2;
                        int i3 = f13596a + 49;
                        f13597b = i3 % 128;
                        int i4 = i3 % 2;
                        a(str);
                        Unit unit = Unit.INSTANCE;
                        if (i4 != 0) {
                            throw null;
                        }
                        int i5 = f13597b + 99;
                        f13596a = i5 % 128;
                        int i6 = i5 % 2;
                        return unit;
                    }

                    private void a(String str) {
                        int i2 = 2 % 2;
                        int i3 = f13596a + 17;
                        f13597b = i3 % 128;
                        int i4 = i3 % 2;
                        Intrinsics.checkNotNullParameter(str, "");
                        this.f13598c.invoke(this.f13599e.getId(), str);
                        int i5 = f13596a + 35;
                        f13597b = i5 % 128;
                        int i6 = i5 % 2;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    a(Function2<? super String, ? super String, Unit> function2, FormsCountrySelectorUiState formsCountrySelectorUiState) {
                        super(1);
                        this.f13598c = function2;
                        this.f13599e = formsCountrySelectorUiState;
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$e, reason: collision with other inner class name */
                static final class C0248e extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static int f13610f = 0;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static int f13611j = 1;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private /* synthetic */ MutableInteractionSource f13612a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ RowScope f13613b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ FormsCountrySelectorUiState f13614c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private /* synthetic */ FocusManager f13615d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private /* synthetic */ Function1<String, Unit> f13616e;

                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
                        int i2 = 2 % 2;
                        int i3 = f13611j + 1;
                        f13610f = i3 % 128;
                        int i4 = i3 % 2;
                        c(function2, composer, num.intValue());
                        Unit unit = Unit.INSTANCE;
                        int i5 = f13611j + 55;
                        f13610f = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    private void c(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
                        int i3 = i2;
                        int i4 = 2 % 2;
                        int i5 = f13611j + 81;
                        f13610f = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.checkNotNullParameter(function2, "");
                        if ((i3 & 14) == 0) {
                            i3 |= composer.changedInstance(function2) ? 4 : 2;
                        }
                        if ((i3 & 91) == 18) {
                            int i7 = f13610f + 47;
                            f13611j = i7 % 128;
                            int i8 = i7 % 2;
                            if (!(!composer.getSkipping())) {
                                composer.skipToGroupEnd();
                                return;
                            }
                        }
                        if (!(!ComposerKt.isTraceInProgress())) {
                            ComposerKt.traceEventStart(-682498643, i3, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FormsCountrySelectorScreen.kt:220)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                        String searchedText = this.f13614c.getSearchedText();
                        VisualTransformation none = VisualTransformation.Companion.getNone();
                        PaddingValues paddingValuesM1014PaddingValuesa9UjIt4 = PaddingKt.m1014PaddingValuesa9UjIt4(Dp.m6638constructorimpl(0.0f), Dp.m6638constructorimpl(16.0f), Dp.m6638constructorimpl(16.0f), Dp.m6638constructorimpl(16.0f));
                        MutableInteractionSource mutableInteractionSource = this.f13612a;
                        Function2<Composer, Integer, Unit> function2M8450getLambda2$onboard_release = ComposableSingletons$FormsCountrySelectorScreenKt.f13424e.m8450getLambda2$onboard_release();
                        final RowScope rowScope = this.f13613b;
                        final FormsCountrySelectorUiState formsCountrySelectorUiState = this.f13614c;
                        final Function1<String, Unit> function1 = this.f13616e;
                        final FocusManager focusManager = this.f13615d;
                        outlinedTextFieldDefaults.DecorationBox(searchedText, function2, true, true, none, mutableInteractionSource, false, null, function2M8450getLambda2$onboard_release, null, ComposableLambdaKt.composableLambda(composer, -278315962, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e.1.e.1

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f13617e = 0;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            private static int f13618i = 1;

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                int i9 = 2 % 2;
                                int i10 = f13617e + 99;
                                f13618i = i10 % 128;
                                int i11 = i10 % 2;
                                e(composer2, num.intValue());
                                Unit unit = Unit.INSTANCE;
                                int i12 = f13617e + 29;
                                f13618i = i12 % 128;
                                int i13 = i12 % 2;
                                return unit;
                            }

                            private void e(Composer composer2, int i9) {
                                int i10 = 2 % 2;
                                int i11 = f13617e + 123;
                                f13618i = i11 % 128;
                                int i12 = i11 % 2;
                                if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    int i13 = f13617e + 93;
                                    f13618i = i13 % 128;
                                    int i14 = i13 % 2;
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    int i15 = f13617e + 73;
                                    f13618i = i15 % 128;
                                    int i16 = i15 % 2;
                                    ComposerKt.traceEventStart(-278315962, i9, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FormsCountrySelectorScreen.kt:240)");
                                }
                                RowScope rowScope2 = rowScope;
                                boolean z2 = formsCountrySelectorUiState.getSearchedText().length() > 0;
                                final Function1<String, Unit> function12 = function1;
                                final FormsCountrySelectorUiState formsCountrySelectorUiState2 = formsCountrySelectorUiState;
                                final FocusManager focusManager2 = focusManager;
                                AnimatedVisibilityKt.AnimatedVisibility(rowScope2, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 501611294, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e.1.e.1.2

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    private static int f13623b = 0;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    private static int f13624d = 1;

                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        int i17 = 2 % 2;
                                        int i18 = f13623b + 105;
                                        f13624d = i18 % 128;
                                        int i19 = i18 % 2;
                                        a(animatedVisibilityScope, composer3, num.intValue());
                                        Unit unit = Unit.INSTANCE;
                                        int i20 = f13623b + 39;
                                        f13624d = i20 % 128;
                                        int i21 = i20 % 2;
                                        return unit;
                                    }

                                    private void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i17) {
                                        int i18 = 2 % 2;
                                        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                                        if (ComposerKt.isTraceInProgress()) {
                                            int i19 = f13624d + 65;
                                            f13623b = i19 % 128;
                                            int i20 = i19 % 2;
                                            ComposerKt.traceEventStart(501611294, i17, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FormsCountrySelectorScreen.kt:241)");
                                        }
                                        final Function1<String, Unit> function13 = function12;
                                        final FormsCountrySelectorUiState formsCountrySelectorUiState3 = formsCountrySelectorUiState2;
                                        final FocusManager focusManager3 = focusManager2;
                                        IconButtonKt.IconButton(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e.1.e.1.2.4

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            private static int f13628b = 1;

                                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                                            private static int f13629e = 0;

                                            @Override // kotlin.jvm.functions.Function0
                                            public final /* synthetic */ Unit invoke() {
                                                int i21 = 2 % 2;
                                                int i22 = f13629e + 49;
                                                f13628b = i22 % 128;
                                                int i23 = i22 % 2;
                                                b();
                                                Unit unit = Unit.INSTANCE;
                                                int i24 = f13628b + 11;
                                                f13629e = i24 % 128;
                                                int i25 = i24 % 2;
                                                return unit;
                                            }

                                            private void b() {
                                                FocusManager focusManager4;
                                                boolean z3;
                                                int i21 = 2 % 2;
                                                int i22 = f13629e + 61;
                                                f13628b = i22 % 128;
                                                if (i22 % 2 == 0) {
                                                    function13.invoke(formsCountrySelectorUiState3.getId());
                                                    focusManager4 = focusManager3;
                                                    z3 = false;
                                                } else {
                                                    function13.invoke(formsCountrySelectorUiState3.getId());
                                                    focusManager4 = focusManager3;
                                                    z3 = true;
                                                }
                                                focusManager4.clearFocus(z3);
                                                int i23 = f13628b + 41;
                                                f13629e = i23 % 128;
                                                int i24 = i23 % 2;
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }
                                        }, null, false, null, null, ComposableSingletons$FormsCountrySelectorScreenKt.f13424e.m8451getLambda3$onboard_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        if (!(!ComposerKt.isTraceInProgress())) {
                                            ComposerKt.traceEventEnd();
                                            int i21 = f13623b + 31;
                                            f13624d = i21 % 128;
                                            int i22 = i21 % 2;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }
                                }), composer2, 1572864, 30);
                                if (!ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                int i17 = f13617e + 67;
                                f13618i = i17 % 128;
                                if (i17 % 2 == 0) {
                                    ComposerKt.traceEventEnd();
                                    int i18 = 3 / 0;
                                } else {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        }), null, null, null, null, paddingValuesM1014PaddingValuesa9UjIt4, ComposableSingletons$FormsCountrySelectorScreenKt.f13424e.m8452getLambda4$onboard_release(), composer, ((i3 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | 100887936, 14155782, 31424);
                        if (ComposerKt.isTraceInProgress()) {
                            int i9 = f13611j + 1;
                            f13610f = i9 % 128;
                            if (i9 % 2 == 0) {
                                ComposerKt.traceEventEnd();
                            } else {
                                ComposerKt.traceEventEnd();
                                int i10 = 56 / 0;
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0248e(FormsCountrySelectorUiState formsCountrySelectorUiState, MutableInteractionSource mutableInteractionSource, RowScope rowScope, Function1<? super String, Unit> function1, FocusManager focusManager) {
                        super(3);
                        this.f13614c = formsCountrySelectorUiState;
                        this.f13612a = mutableInteractionSource;
                        this.f13613b = rowScope;
                        this.f13616e = function1;
                        this.f13615d = focusManager;
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$c */
                static final class c extends Lambda implements Function1<LazyListScope, Unit> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f13600b = 1;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f13601c = 0;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private /* synthetic */ FormsCountrySelectorUiState f13602a;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private /* synthetic */ FocusManager f13603d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private /* synthetic */ Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> f13604e;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        int i2 = 2 % 2;
                        int i3 = f13600b + 17;
                        f13601c = i3 % 128;
                        int i4 = i3 % 2;
                        a(lazyListScope);
                        Unit unit = Unit.INSTANCE;
                        if (i4 == 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$c$b */
                    static final class b extends Lambda implements Function1<FormsCountrySelectorUiState.CountryUiState, Unit> {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f13605b = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f13606d = 1;

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private /* synthetic */ FocusManager f13607a;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private /* synthetic */ FormsCountrySelectorUiState f13608c;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private /* synthetic */ Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> f13609e;

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ Unit invoke(FormsCountrySelectorUiState.CountryUiState countryUiState) {
                            int i2 = 2 % 2;
                            int i3 = f13606d + 21;
                            f13605b = i3 % 128;
                            int i4 = i3 % 2;
                            a(countryUiState);
                            Unit unit = Unit.INSTANCE;
                            if (i4 == 0) {
                                return unit;
                            }
                            throw null;
                        }

                        private void a(FormsCountrySelectorUiState.CountryUiState countryUiState) {
                            int i2 = 2 % 2;
                            int i3 = f13606d + 7;
                            f13605b = i3 % 128;
                            if (i3 % 2 != 0) {
                                Intrinsics.checkNotNullParameter(countryUiState, "");
                                this.f13609e.invoke(this.f13608c.getId(), countryUiState);
                                this.f13607a.clearFocus(false);
                            } else {
                                Intrinsics.checkNotNullParameter(countryUiState, "");
                                this.f13609e.invoke(this.f13608c.getId(), countryUiState);
                                this.f13607a.clearFocus(true);
                            }
                            int i4 = f13606d + 99;
                            f13605b = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 83 / 0;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        b(Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function2, FormsCountrySelectorUiState formsCountrySelectorUiState, FocusManager focusManager) {
                            super(1);
                            this.f13609e = function2;
                            this.f13608c = formsCountrySelectorUiState;
                            this.f13607a = focusManager;
                        }
                    }

                    private void a(LazyListScope lazyListScope) {
                        int i2 = 2 % 2;
                        Intrinsics.checkNotNullParameter(lazyListScope, "");
                        final List<FormsCountrySelectorUiState.CountryUiState> filteredOptions = this.f13602a.getFilteredOptions();
                        final Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> function2 = this.f13604e;
                        final FormsCountrySelectorUiState formsCountrySelectorUiState = this.f13602a;
                        final FocusManager focusManager = this.f13603d;
                        final FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$1 formsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$1 = new Function1() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$1

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f13537a = 0;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f13539c = 1;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private static int f13540d = 0;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f13541e = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Object obj) {
                                int i3 = 2 % 2;
                                int i4 = f13537a + 113;
                                f13539c = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return invoke((FormsCountrySelectorUiState.CountryUiState) obj);
                                }
                                invoke((FormsCountrySelectorUiState.CountryUiState) obj);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Void invoke(FormsCountrySelectorUiState.CountryUiState countryUiState) {
                                int i3 = 2 % 2;
                                int i4 = f13539c;
                                int i5 = i4 + 39;
                                f13537a = i5 % 128;
                                int i6 = i5 % 2;
                                int i7 = i4 + 45;
                                f13537a = i7 % 128;
                                int i8 = i7 % 2;
                                return null;
                            }

                            static {
                                int i3 = f13541e + 93;
                                f13540d = i3 % 128;
                                if (i3 % 2 != 0) {
                                    int i4 = 94 / 0;
                                }
                            }
                        };
                        lazyListScope.items(filteredOptions.size(), null, new Function1<Integer, Object>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$3

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            private static int f13546c = 1;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private static int f13547d = 0;

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                int i3 = 2 % 2;
                                int i4 = f13547d + 91;
                                f13546c = i4 % 128;
                                int i5 = i4 % 2;
                                Object objInvoke = invoke(num.intValue());
                                int i6 = f13546c + 5;
                                f13547d = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return objInvoke;
                                }
                                throw null;
                            }

                            public final Object invoke(int i3) {
                                int i4 = 2 % 2;
                                int i5 = f13547d + 85;
                                f13546c = i5 % 128;
                                int i6 = i5 % 2;
                                Object objInvoke = formsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$1.invoke(filteredOptions.get(i3));
                                int i7 = f13546c + 23;
                                f13547d = i7 % 128;
                                if (i7 % 2 != 0) {
                                    int i8 = 56 / 0;
                                }
                                return objInvoke;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            private static int f13550e = 0;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            private static int f13551i = 1;

                            @Override // kotlin.jvm.functions.Function4
                            public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                int i3 = 2 % 2;
                                int i4 = f13550e + 39;
                                f13551i = i4 % 128;
                                int i5 = i4 % 2;
                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                Unit unit = Unit.INSTANCE;
                                if (i5 == 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i6 = f13550e + 19;
                                f13551i = i6 % 128;
                                int i7 = i6 % 2;
                                return unit;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                            
                                if (r9.getSkipping() == false) goto L20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
                            
                                if (r9.getSkipping() == false) goto L20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
                            
                                r9.skipToGroupEnd();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
                            
                                return;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r7, int r8, androidx.compose.runtime.Composer r9, int r10) {
                                /*
                                    r6 = this;
                                    r2 = 2
                                    int r0 = r2 % r2
                                    java.lang.String r0 = "C152@7074L22:LazyDsl.kt#428nma"
                                    androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
                                    r0 = r10 & 6
                                    if (r0 != 0) goto L98
                                    boolean r0 = r9.changed(r7)
                                    if (r0 == 0) goto L96
                                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13551i
                                    int r1 = r0 + 67
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13550e = r0
                                    int r1 = r1 % r2
                                    r3 = 4
                                L1c:
                                    r3 = r3 | r10
                                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13550e
                                    int r1 = r0 + 59
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13551i = r0
                                    int r1 = r1 % r2
                                L26:
                                    r0 = r10 & 48
                                    if (r0 != 0) goto L3c
                                    boolean r0 = r9.changed(r8)
                                    if (r0 == 0) goto L93
                                    r0 = 32
                                L32:
                                    r3 = r3 | r0
                                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13551i
                                    int r1 = r0 + 117
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13550e = r0
                                    int r1 = r1 % r2
                                L3c:
                                    r1 = r3 & 147(0x93, float:2.06E-43)
                                    r0 = 146(0x92, float:2.05E-43)
                                    r5 = 0
                                    if (r1 != r0) goto L57
                                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13551i
                                    int r1 = r0 + 77
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.f13550e = r0
                                    int r1 = r1 % r2
                                    if (r1 == 0) goto L88
                                    boolean r1 = r9.getSkipping()
                                    r0 = 68
                                    int r0 = r0 / r5
                                    if (r1 != 0) goto L8f
                                L57:
                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r0 == 0) goto L66
                                    r2 = -1
                                    java.lang.String r1 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                                    r0 = -632812321(0xffffffffda480cdf, float:-1.4077287E16)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r2, r1)
                                L66:
                                    java.util.List r0 = r2
                                    java.lang.Object r4 = r0.get(r8)
                                    com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r4 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.CountryUiState) r4
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$c$b r3 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$e$1$c$b
                                    kotlin.jvm.functions.Function2 r2 = r3
                                    com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r1 = r4
                                    androidx.compose.ui.focus.FocusManager r0 = r5
                                    r3.<init>(r2, r1, r0)
                                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                                    com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.access$OptionItem(r4, r3, r9, r5)
                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r0 == 0) goto L87
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L87:
                                    return
                                L88:
                                    boolean r0 = r9.getSkipping()
                                    if (r0 != 0) goto L8f
                                    goto L57
                                L8f:
                                    r9.skipToGroupEnd()
                                    goto L87
                                L93:
                                    r0 = 16
                                    goto L32
                                L96:
                                    r3 = r2
                                    goto L1c
                                L98:
                                    r3 = r10
                                    goto L26
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$4.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }
                        }));
                        int i3 = f13601c + 65;
                        f13600b = i3 % 128;
                        int i4 = i3 % 2;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    c(FormsCountrySelectorUiState formsCountrySelectorUiState, Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function2, FocusManager focusManager) {
                        super(1);
                        this.f13602a = formsCountrySelectorUiState;
                        this.f13604e = function2;
                        this.f13603d = focusManager;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:52:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0338  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void c(androidx.compose.runtime.Composer r62, int r63) {
                    /*
                        Method dump skipped, instruction units count: 1328
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e.AnonymousClass1.c(androidx.compose.runtime.Composer, int):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer, 12583296, 120);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13583g + 3;
                f13584h = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(RoundedCornerShape roundedCornerShape, FormsCountrySelectorUiState formsCountrySelectorUiState, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function22) {
            super(2);
            this.f13589e = roundedCornerShape;
            this.f13586b = formsCountrySelectorUiState;
            this.f13588d = function2;
            this.f13585a = function1;
            this.f13587c = function22;
        }
    }

    private static final void d(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1<? super String, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function22, Function1<? super String, Unit> function12, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13536c + 125;
        f13535a = i4 % 128;
        int i5 = i4 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1567304513);
        if (ComposerKt.isTraceInProgress()) {
            int i6 = f13536c + 105;
            f13535a = i6 % 128;
            if (i6 % 2 == 0) {
                ComposerKt.traceEventStart(-1567304513, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog (FormsCountrySelectorScreen.kt:169)");
            } else {
                ComposerKt.traceEventStart(-1567304513, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.CountryPickerDialog (FormsCountrySelectorScreen.kt:169)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        AndroidDialog_androidKt.Dialog(new b(function1, formsCountrySelectorUiState), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 928735304, true, new e(RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(16.0f)), formsCountrySelectorUiState, function2, function12, function22)), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(formsCountrySelectorUiState, function1, function2, function22, function12, i2));
        }
    }

    static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13647a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13648e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState.CountryUiState f13649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<FormsCountrySelectorUiState.CountryUiState, Unit> f13650d;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13648e + 45;
            f13647a = i3 % 128;
            int i4 = i3 % 2;
            this.f13650d.invoke(this.f13649c);
            int i5 = f13647a + 117;
            f13648e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13648e + 53;
            f13647a = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13648e + 5;
            f13647a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super FormsCountrySelectorUiState.CountryUiState, Unit> function1, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            super(0);
            this.f13650d = function1;
            this.f13649c = countryUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.CountryUiState r26, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.CountryUiState, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.e(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class k extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13662a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f13663b = new k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13664c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13665d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13666e = 1;

        private static void b(String str) {
            int i2 = 2 % 2;
            int i3 = f13666e + 25;
            f13665d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13665d + 3;
            f13666e = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13666e + 13;
            f13665d = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13666e + 111;
            f13665d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13662a + 63;
            f13664c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        k() {
            super(1);
        }
    }

    static final class q extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13688a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13689b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f13690c = new q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13691d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13692e = 0;

        private static void e(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13691d + 37;
            f13688a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i4 = f13691d + 71;
            f13688a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13688a + 111;
            f13691d = i3 % 128;
            int i4 = i3 % 2;
            e(str, str2);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13692e + 45;
            f13689b = i2 % 128;
            int i3 = i2 % 2;
        }

        q() {
            super(2);
        }
    }

    static final class r extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f13693a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13694b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13695c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13696d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13697e = 1;

        private static void b(String str) {
            int i2 = 2 % 2;
            int i3 = f13694b + 91;
            f13695c = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13695c + 49;
            f13694b = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13694b + 99;
            f13695c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13696d + 83;
            f13697e = i2 % 128;
            int i3 = i2 % 2;
        }

        r() {
            super(1);
        }
    }

    static final class s extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f13698a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13699b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13700c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13701d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13702e = 1;

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13699b + 47;
            f13700c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13700c + 37;
            f13699b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13699b + 75;
            f13700c = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f13700c + 105;
            f13699b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13701d + 25;
            f13702e = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        s() {
            super(1);
        }
    }

    static final class t extends Lambda implements Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13703a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13704b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13705c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f13706d = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13707e = 1;

        private static void c(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13704b + 75;
            f13705c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(countryUiState, "");
            int i5 = f13705c + 29;
            f13704b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13705c + 31;
            f13704b = i3 % 128;
            int i4 = i3 % 2;
            c(str, countryUiState);
            Unit unit = Unit.INSTANCE;
            int i5 = f13705c + 49;
            f13704b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13707e + 9;
            f13703a = i2 % 128;
            int i3 = i2 % 2;
        }

        t() {
            super(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.runtime.Composer r13, int r14) {
        /*
            r5 = 2
            int r0 = r5 % r5
            r4 = 1818895236(0x6c6a2384, float:1.13222544E27)
            androidx.compose.runtime.Composer r12 = r13.startRestartGroup(r4)
            if (r14 != 0) goto L12
            boolean r0 = r12.getSkipping()
            if (r0 != 0) goto L78
        L12:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r3 = 0
            if (r0 == 0) goto L2a
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a
            int r2 = r0 + 63
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c = r0
            int r2 = r2 % r5
            java.lang.String r1 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsCountrySelectorOldScreen_Default (FormsCountrySelectorScreen.kt:305)"
            r0 = -1
            if (r2 == 0) goto L80
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r14, r0, r1)
        L2a:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$Companion r2 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13309a
            r1 = 0
            r0 = 1
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r6 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.Companion.previewData$onboard_release$default(r2, r1, r0, r3)
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$k r7 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.k.f13663b
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$s r8 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.s.f13698a
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$q r9 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.q.f13690c
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$t r10 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.t.f13706d
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$r r11 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.r.f13693a
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r13 = 224696(0x36db8, float:3.14866E-40)
            FormsCountrySelectorScreen(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L67
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r1 = r1 % r5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 81
        L62:
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r1 = r1 % r5
        L67:
            androidx.compose.runtime.ScopeUpdateScope r1 = r12.endRestartGroup()
            if (r1 == 0) goto L77
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$p r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$p
            r0.<init>(r14)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L77:
            return
        L78:
            r12.skipToGroupEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 23
            goto L62
        L80:
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r14, r0, r1)
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.a(androidx.compose.runtime.Composer, int):void");
    }

    static final class u extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13708a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13709b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f13710c = new u();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13711d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13712e = 1;

        private static void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13712e + 105;
            f13709b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13709b + 17;
            f13712e = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13709b + 83;
            f13712e = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13709b + 83;
            f13712e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13711d + 87;
            f13708a = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        u() {
            super(1);
        }
    }

    static final class v extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13713a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13714b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13715c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13716d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final v f13717e = new v();

        private static void c(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13714b + 93;
            f13716d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i4 = f13714b + 83;
            f13716d = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13714b + 93;
            f13716d = i3 % 128;
            int i4 = i3 % 2;
            c(str, str2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13716d + 111;
            f13714b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13715c + 7;
            f13713a = i2 % 128;
            int i3 = i2 % 2;
        }

        v() {
            super(2);
        }
    }

    static final class w extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13718a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13719b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13720c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13721d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final w f13722e = new w();

        private static void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13720c + 55;
            f13719b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13719b + 117;
            f13720c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13720c + 1;
            f13719b = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13719b + 101;
            f13720c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13718a + 79;
            f13721d = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        w() {
            super(1);
        }
    }

    static final class x extends Lambda implements Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13723a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13724b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13725c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final x f13726d = new x();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13727e = 1;

        private static void e(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13724b + 65;
            f13723a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(countryUiState, "");
            int i5 = f13724b + 35;
            f13723a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13724b + 121;
            f13723a = i3 % 128;
            int i4 = i3 % 2;
            e(str, countryUiState);
            Unit unit = Unit.INSTANCE;
            int i5 = f13724b + 103;
            f13723a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13727e + 85;
            f13725c = i2 % 128;
            int i3 = i2 % 2;
        }

        x() {
            super(2);
        }
    }

    static final class y extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f13728a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13729b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13730c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13731d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13732e = 1;

        private static void b(String str) {
            int i2 = 2 % 2;
            int i3 = f13731d + 65;
            f13729b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13731d + 23;
            f13729b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13729b + 5;
            f13731d = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13731d + 123;
            f13729b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13730c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13732e = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        y() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r11, int r12) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r1 = r1 % r3
            r2 = -1447959203(0xffffffffa9b1e55d, float:-7.900167E-14)
            androidx.compose.runtime.Composer r10 = r11.startRestartGroup(r2)
            if (r12 != 0) goto L24
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c = r0
            int r1 = r1 % r3
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L89
        L24:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L42
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsCountrySelectorScreen_Selected (FormsCountrySelectorScreen.kt:312)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r12, r1, r0)
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c = r0
            int r1 = r1 % r3
        L42:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$Companion r1 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13309a
            r0 = 1
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r4 = r1.previewData$onboard_release(r0)
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$y r5 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.y.f13728a
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$u r6 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.u.f13710c
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$v r7 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.v.f13717e
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$x r8 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.x.f13726d
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$w r9 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.w.f13722e
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r11 = 224696(0x36db8, float:3.14866E-40)
            FormsCountrySelectorScreen(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 != 0) goto L85
        L69:
            androidx.compose.runtime.ScopeUpdateScope r1 = r10.endRestartGroup()
            if (r1 == 0) goto L92
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$aa r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$aa
            r0.<init>(r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L8d
            return
        L85:
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L69
        L89:
            r10.skipToGroupEnd()
            goto L69
        L8d:
            r0 = 0
            r0.hashCode()
            throw r0
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class f extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13633a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13634b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13635c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13636d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f13637e = new f();

        private static void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13633a + 17;
            f13634b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13633a + 97;
            f13634b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13633a + 45;
            f13634b = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13633a + 67;
            f13634b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13636d + 5;
            f13635c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
        }

        f() {
            super(1);
        }
    }

    static final class l extends Lambda implements Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13667a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f13668b = new l();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13669c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13670d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13671e = 0;

        private static void a(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13671e + 3;
            f13667a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(countryUiState, "");
            int i5 = f13667a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13671e = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
            int i2 = 2 % 2;
            int i3 = f13671e + 31;
            f13667a = i3 % 128;
            int i4 = i3 % 2;
            a(str, countryUiState);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 56 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13669c + 93;
            f13670d = i2 % 128;
            int i3 = i2 % 2;
        }

        l() {
            super(2);
        }
    }

    static final class n extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13675a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13676b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13677c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f13678d = new n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13679e = 1;

        private static void d(String str) {
            int i2 = 2 % 2;
            int i3 = f13675a + 19;
            f13679e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = f13679e + 15;
            f13675a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13679e + 115;
            f13675a = i3 % 128;
            int i4 = i3 % 2;
            d(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13675a + 77;
            f13679e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13677c + 67;
            f13676b = i2 % 128;
            int i3 = i2 % 2;
        }

        n() {
            super(1);
        }
    }

    static final class o extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13680a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13681b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13682c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13683d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o f13684e = new o();

        private static void b(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13681b + 31;
            f13680a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i5 = f13680a + 25;
            f13681b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13681b + 3;
            f13680a = i3 % 128;
            int i4 = i3 % 2;
            b(str, str2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13681b + 89;
            f13680a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13683d + 1;
            f13682c = i2 % 128;
            int i3 = i2 % 2;
        }

        o() {
            super(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(androidx.compose.runtime.Composer r8, int r9) {
        /*
            r6 = 2
            int r0 = r6 % r6
            r5 = -77680381(0xfffffffffb5eb103, float:-1.1562801E36)
            androidx.compose.runtime.Composer r7 = r8.startRestartGroup(r5)
            r4 = 0
            if (r9 != 0) goto L1e
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L77
            boolean r0 = r7.getSkipping()
            if (r0 != 0) goto L73
        L1e:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r3 = 0
            if (r0 == 0) goto L39
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13536c
            int r2 = r0 + 5
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f13535a = r0
            int r2 = r2 % r6
            java.lang.String r1 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_CountryPickerDialog_Default (FormsCountrySelectorScreen.kt:319)"
            r0 = -1
            if (r2 == 0) goto L6f
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r9, r0, r1)
            r0 = 78
            int r0 = r0 / r3
        L39:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$Companion r1 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13309a
            r0 = 1
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r2 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.Companion.previewData$onboard_release$default(r1, r3, r0, r4)
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$f r3 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.f.f13637e
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$o r4 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.o.f13684e
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$l r5 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.l.f13668b
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$n r6 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.n.f13678d
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r8 = 28088(0x6db8, float:3.936E-41)
            d(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L5e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L5e:
            androidx.compose.runtime.ScopeUpdateScope r1 = r7.endRestartGroup()
            if (r1 == 0) goto L6e
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$m r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt$m
            r0.<init>(r9)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L6e:
            return
        L6f:
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r9, r0, r1)
            goto L39
        L73:
            r7.skipToGroupEnd()
            goto L5e
        L77:
            r7.getSkipping()
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsCountrySelectorScreenKt.d(androidx.compose.runtime.Composer, int):void");
    }

    static final class aa extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13564b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13565c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13566d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13564b + 9;
            f13565c = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13564b + 65;
            f13565c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13564b + 81;
            f13565c = i3 % 128;
            int i4 = i3 % 2;
            FormsCountrySelectorScreenKt.access$Preview_FormsCountrySelectorScreen_Selected(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13566d | 1));
            int i5 = f13565c + 39;
            f13564b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aa(int i2) {
            super(2);
            this.f13566d = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f13575g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f13576i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> f13579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13581e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ int f13582h;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13575g + 63;
            f13576i = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13575g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13576i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13576i + 21;
            f13575g = i3 % 128;
            if (i3 % 2 != 0) {
                FormsCountrySelectorScreenKt.access$CountryPickerDialog(this.f13581e, this.f13580d, this.f13578b, this.f13579c, this.f13577a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13582h | 1));
            } else {
                FormsCountrySelectorScreenKt.access$CountryPickerDialog(this.f13581e, this.f13580d, this.f13578b, this.f13579c, this.f13577a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13582h | 1));
            }
            int i4 = f13576i + 115;
            f13575g = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1<? super String, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function22, Function1<? super String, Unit> function12, int i2) {
            super(2);
            this.f13581e = formsCountrySelectorUiState;
            this.f13580d = function1;
            this.f13578b = function2;
            this.f13579c = function22;
            this.f13577a = function12;
            this.f13582h = i2;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f13638f = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13639j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> f13640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13644e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ int f13645g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13646i;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13639j + 85;
            f13638f = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13638f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13639j = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13639j + 103;
            f13638f = i3 % 128;
            int i4 = i3 % 2;
            FormsCountrySelectorScreenKt.FormsCountrySelectorScreen(this.f13642c, this.f13643d, this.f13641b, this.f13644e, this.f13640a, this.f13646i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13645g | 1));
            int i5 = f13639j + 93;
            f13638f = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function2<? super String, ? super String, Unit> function2, Function2<? super String, ? super FormsCountrySelectorUiState.CountryUiState, Unit> function22, Function1<? super String, Unit> function13, int i2) {
            super(2);
            this.f13642c = formsCountrySelectorUiState;
            this.f13643d = function1;
            this.f13641b = function12;
            this.f13644e = function2;
            this.f13640a = function22;
            this.f13646i = function13;
            this.f13645g = i2;
        }
    }

    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13651d = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f13652g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f13654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13655c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState f13656e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13651d + 51;
            f13652g = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13652g + 67;
            f13651d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13651d + 49;
            f13652g = i3 % 128;
            int i4 = i3 % 2;
            FormsCountrySelectorScreenKt.access$CountryTextField(this.f13656e, this.f13653a, this.f13655c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13654b | 1));
            int i5 = f13651d + 111;
            f13652g = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(FormsCountrySelectorUiState formsCountrySelectorUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, int i2) {
            super(2);
            this.f13656e = formsCountrySelectorUiState;
            this.f13653a = function1;
            this.f13655c = function12;
            this.f13654b = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13657a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13658d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f13659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<FormsCountrySelectorUiState.CountryUiState, Unit> f13660c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsCountrySelectorUiState.CountryUiState f13661e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13657a + 103;
            f13658d = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 10 / 0;
            }
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13658d + 123;
            f13657a = i3 % 128;
            int i4 = i3 % 2;
            FormsCountrySelectorScreenKt.access$OptionItem(this.f13661e, this.f13660c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13659b | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(FormsCountrySelectorUiState.CountryUiState countryUiState, Function1<? super FormsCountrySelectorUiState.CountryUiState, Unit> function1, int i2) {
            super(2);
            this.f13661e = countryUiState;
            this.f13660c = function1;
            this.f13659b = i2;
        }
    }

    static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13672a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13673d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f13674e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13673d + 69;
            f13672a = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f13673d + 105;
            f13672a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13672a + 27;
            f13673d = i3 % 128;
            int i4 = i3 % 2;
            FormsCountrySelectorScreenKt.access$Preview_CountryPickerDialog_Default(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13674e | 1));
            int i5 = f13672a + 99;
            f13673d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i2) {
            super(2);
            this.f13674e = i2;
        }
    }

    static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13685b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13686d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f13687c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13686d + 37;
            f13685b = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 40 / 0;
            }
            int i6 = f13685b + 87;
            f13686d = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13686d + 109;
            f13685b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f13687c;
            if (i4 != 0) {
                i5 |= 1;
            }
            FormsCountrySelectorScreenKt.access$Preview_FormsCountrySelectorOldScreen_Default(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i2) {
            super(2);
            this.f13687c = i2;
        }
    }
}
