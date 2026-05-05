package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import com.valid.vssh_bio_validation_library.utils.BioValidationConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionLearnMoreScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16704a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16705b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<ImageText> f16706c = CollectionsKt.listOf((Object[]) new ImageText[]{new ImageText(R.drawable.onboard_sdk_camera_badge, R.string.onboard_sdk_permission_rationale_p1), new ImageText(R.drawable.onboard_sdk_bank_card_badge, R.string.onboard_sdk_permission_rationale_p2), new ImageText(R.drawable.onboard_sdk_key_badge, R.string.onboard_sdk_permission_rationale_p3), new ImageText(R.drawable.onboard_sdk_check_badge, R.string.onboard_sdk_permission_rationale_p4)});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16707d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16708e = 1;

    public static final /* synthetic */ void access$PreviewPermissionRationaleContentDark(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16705b + 3;
        f16704a = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        if (i5 != 0) {
            throw null;
        }
        int i6 = f16705b + 61;
        f16704a = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewPermissionRationaleContentLight(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16704a + 47;
        f16705b = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f16705b + 95;
        f16704a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16712b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16713e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16714d;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f16713e + 39;
            f16712b = i3 % 128;
            int i4 = i3 % 2;
            Function1<PermissionOnboardingEvent, Unit> function1 = this.f16714d;
            if (i4 == 0) {
                function1.invoke(PermissionOnboardingEvent.OnLearnMoreAllowPermissionClicked.f16516d);
                return;
            }
            function1.invoke(PermissionOnboardingEvent.OnLearnMoreAllowPermissionClicked.f16516d);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16713e + 125;
            f16712b = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16714d = function1;
        }
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16715c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16716d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16717a;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f16716d + 29;
            f16715c = i3 % 128;
            int i4 = i3 % 2;
            this.f16717a.invoke(PermissionOnboardingEvent.OnQuitClicked.f16526e);
            int i5 = f16715c + 5;
            f16716d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16716d + 55;
            f16715c = i3 % 128;
            int i4 = i3 % 2;
            b();
            if (i4 == 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f16716d + 21;
            f16715c = i5 % 128;
            int i6 = i5 % 2;
            return unit2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16717a = function1;
        }
    }

    public static final void PermissionLearnMoreScreen(Function1<? super PermissionOnboardingEvent, Unit> function1, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = f16704a + 27;
        f16705b = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1278577281);
        if ((i2 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                int i9 = f16704a + 121;
                f16705b = i9 % 128;
                i4 = i9 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1278577281, i3, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreen (PermissionLearnMoreScreen.kt:40)");
            }
            Modifier.Companion companion = Modifier.Companion;
            h hVar = h.f5694b;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(BackgroundKt.m573backgroundbw27NRU$default(companion, h.a(composerStartRestartGroup).m8045getSurfaceNeutralLight0d7_KjU(), null, 2, null)), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                int i10 = f16705b + 111;
                f16704a = i10 % 128;
                int i11 = i10 % 2;
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
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 0.7f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(32.0f));
            ContentScale fit = ContentScale.Companion.getFit();
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.onboard_sdk_results_status_warn, composerStartRestartGroup, 0);
            ColorFilter.Companion companion2 = ColorFilter.Companion;
            h hVar2 = h.f5694b;
            ImageKt.Image(painterPainterResource, (String) null, modifierM1063size3ABfNKs, (Alignment) null, fit, 0.0f, ColorFilter.Companion.m4219tintxETnrds$default(companion2, h.a(composerStartRestartGroup).m8020getIconWarning0d7_KjU(), 0, 2, null), composerStartRestartGroup, 25016, 40);
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, Dp.m6638constructorimpl(46.0f), Dp.m6638constructorimpl(14.0f), Dp.m6638constructorimpl(46.0f), 0.0f, 8, null);
            String strStringResource = StringResources_androidKt.stringResource(R.string.onboard_sdk_permission_camera_rationale_title, composerStartRestartGroup, 0);
            int iM6527getCentere0LSkKk = TextAlign.Companion.m6527getCentere0LSkKk();
            h hVar3 = h.f5694b;
            TextKt.m2711Text4IGK_g(strStringResource, modifierM1022paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(iM6527getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, h.d(composerStartRestartGroup).c(), composerStartRestartGroup, 0, 0, 65020);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-713641166);
            for (ImageText imageText : f16706c) {
                int i12 = f16705b + 35;
                f16704a = i12 % 128;
                int i13 = i12 % i5;
                Modifier modifierAlign = columnScopeInstance.align(PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, Dp.m6638constructorimpl(24.0f), Dp.m6638constructorimpl(8.0f), Dp.m6638constructorimpl(24.0f), 0.0f, 8, null), Alignment.Companion.getStart());
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(imageText.getImage(), composerStartRestartGroup, 0), (String) null, PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6638constructorimpl(12.0f), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, BioValidationConstants.SC_EXPIRED_SESSION_CORE, 120);
                String strStringResource2 = StringResources_androidKt.stringResource(imageText.getText(), composerStartRestartGroup, 0);
                h hVar4 = h.f5694b;
                TextStyle textStyleE = h.d(composerStartRestartGroup).e();
                h hVar5 = h.f5694b;
                TextKt.m2711Text4IGK_g(strStringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(textStyleE, h.a(composerStartRestartGroup).m8067getTextBodySecondary0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, 0, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i5 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-768666368);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function1);
            b bVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || bVarRememberedValue == Composer.Companion.getEmpty()) {
                bVarRememberedValue = new b(function1);
                composerStartRestartGroup.updateRememberedValue(bVarRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.incode.welcome_sdk.views.b.e.e(null, (Function0) bVarRememberedValue, StringResources_androidKt.stringResource(R.string.onboard_sdk_permission_allow, composerStartRestartGroup, 0), null, false, 0.0f, composerStartRestartGroup, 0, 57);
            Modifier modifierM1022paddingqDBjuR0$default2 = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m6638constructorimpl(16.0f), 0.0f, Dp.m6638constructorimpl(16.0f), 5, null);
            composer2 = composerStartRestartGroup;
            ButtonColors buttonColorsM1837textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1837textButtonColorsro_MJ88(0L, Color.Companion.m4213getTransparent0d7_KjU(), 0L, Color.Companion.m4213getTransparent0d7_KjU(), composer2, (ButtonDefaults.$stable << 12) | 3120, 5);
            composer2.startReplaceableGroup(-768665966);
            boolean zChangedInstance2 = composer2.changedInstance(function1);
            c cVarRememberedValue = composer2.rememberedValue();
            if (zChangedInstance2 || cVarRememberedValue == Composer.Companion.getEmpty()) {
                cVarRememberedValue = new c(function1);
                composer2.updateRememberedValue(cVarRememberedValue);
            } else {
                int i14 = f16704a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16705b = i14 % 128;
                int i15 = i14 % 2;
            }
            composer2.endReplaceableGroup();
            ButtonKt.Button((Function0) cVarRememberedValue, modifierM1022paddingqDBjuR0$default2, false, null, buttonColorsM1837textButtonColorsro_MJ88, null, null, null, null, ComposableSingletons$PermissionLearnMoreScreenKt.f16544b.m8513getLambda1$onboard_release(), composer2, 805306368, 492);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 0.25f, false, 2, null), composer2, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(function1, i2));
        }
    }

    static {
        int i2 = f16707d + 29;
        f16708e = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void e(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16705b + 101;
        f16704a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            composer.startRestartGroup(1648608709);
            obj.hashCode();
            throw null;
        }
        Composer composerStartRestartGroup = composer.startRestartGroup(1648608709);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648608709, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionRationaleContentLight (PermissionLearnMoreScreen.kt:134)");
            }
            h.f5694b.d(DisplayMode.LIGHT, ComposableSingletons$PermissionLearnMoreScreenKt.f16544b.m8514getLambda2$onboard_release(), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f16705b + 51;
                f16704a = i5 % 128;
                int i6 = i5 % 2;
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i2));
            return;
        }
        int i7 = f16704a + 65;
        f16705b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(androidx.compose.runtime.Composer r10, int r11) {
        /*
            r4 = 2
            int r0 = r4 % r4
            r3 = 1052254575(0x3eb8216f, float:0.35963008)
            androidx.compose.runtime.Composer r8 = r10.startRestartGroup(r3)
            if (r11 != 0) goto L38
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16705b
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16704a = r0
            int r1 = r1 % r4
            boolean r0 = r8.getSkipping()
            if (r0 == 0) goto L38
            r8.skipToGroupEnd()
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16704a
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16705b = r0
            int r1 = r1 % r4
        L27:
            androidx.compose.runtime.ScopeUpdateScope r1 = r8.endRestartGroup()
            if (r1 == 0) goto L37
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt$e r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt$e
            r0.<init>(r11)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L37:
            return
        L38:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L4f
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16704a
            int r2 = r0 + 79
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16705b = r0
            int r2 = r2 % r4
            java.lang.String r1 = "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionRationaleContentDark (PermissionLearnMoreScreen.kt:142)"
            r0 = -1
            if (r2 == 0) goto L77
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r11, r0, r1)
        L4f:
            com.incode.welcome_sdk.commons.theme.h r5 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r6 = com.incode.welcome_sdk.DisplayMode.DARK
            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt.f16544b
            kotlin.jvm.functions.Function2 r7 = r0.m8515getLambda3$onboard_release()
            r9 = 438(0x1b6, float:6.14E-43)
            r10 = 0
            r5.d(r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L27
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16704a
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.f16705b = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L27
            r0 = 5
            int r0 = r0 / 4
            goto L27
        L77:
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r11, r0, r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenKt.d(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16709b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16710c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f16711e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16710c + 125;
            f16709b = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 75 / 0;
            }
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16710c + 75;
            f16709b = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenKt.access$PreviewPermissionRationaleContentLight(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16711e | 1));
            int i5 = f16710c + 3;
            f16709b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(2);
            this.f16711e = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16718c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16719e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16720b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16721d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16718c + 93;
            f16719e = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16718c + 67;
            f16719e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16718c + 99;
            f16719e = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenKt.PermissionLearnMoreScreen(this.f16720b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16721d | 1));
            int i5 = f16718c + 97;
            f16719e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16720b = function1;
            this.f16721d = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16722b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16723c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16724a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16722b + 63;
            f16723c = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 38 / 0;
            }
            int i6 = f16722b + 69;
            f16723c = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16723c + 123;
            f16722b = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenKt.access$PreviewPermissionRationaleContentDark(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16724a | 1));
            int i5 = f16723c + 33;
            f16722b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(2);
            this.f16724a = i2;
        }
    }
}
