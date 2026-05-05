package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.incode.welcome_sdk.commons.theme.g;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState;
import com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsDateInputScreenKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13733b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13734c = 0;

    public static final /* synthetic */ void access$Preview_FormsDateInputScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13733b + 111;
        f13734c = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        int i6 = f13734c + 49;
        f13733b = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13749b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13750d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsDateInputUiState f13751c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13752e;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13749b + 67;
            f13750d = i3 % 128;
            int i4 = i3 % 2;
            this.f13752e.invoke(this.f13751c.getId());
            int i5 = f13750d + 71;
            f13749b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13749b + 29;
            f13750d = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13750d + 9;
            f13749b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super String, Unit> function1, FormsDateInputUiState formsDateInputUiState) {
            super(0);
            this.f13752e = function1;
            this.f13751c = formsDateInputUiState;
        }
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13753b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13754e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsDateInputUiState f13755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function2<String, Long, Unit> f13756d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f13754e + 87;
            f13753b = i3 % 128;
            int i4 = i3 % 2;
            e(l2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13753b + 43;
            f13754e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Long l2) {
            int i2 = 2 % 2;
            int i3 = f13754e + 83;
            f13753b = i3 % 128;
            int i4 = i3 % 2;
            this.f13756d.invoke(this.f13755c.getId(), l2);
            int i5 = f13754e + 69;
            f13753b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super String, ? super Long, Unit> function2, FormsDateInputUiState formsDateInputUiState) {
            super(1);
            this.f13756d = function2;
            this.f13755c = formsDateInputUiState;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13757a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13758c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13759b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsDateInputUiState f13760d;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13758c + 77;
            f13757a = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f13757a + 103;
            f13758c = i3 % 128;
            int i4 = i3 % 2;
            Function1<String, Unit> function1 = this.f13759b;
            if (i4 != 0) {
                function1.invoke(this.f13760d.getId());
                return;
            }
            function1.invoke(this.f13760d.getId());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super String, Unit> function1, FormsDateInputUiState formsDateInputUiState) {
            super(0);
            this.f13759b = function1;
            this.f13760d = formsDateInputUiState;
        }
    }

    public static final void FormsDateInputScreen(FormsDateInputUiState formsDateInputUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function2<? super String, ? super Long, Unit> function2, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13734c + 19;
        f13733b = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(formsDateInputUiState, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-381139452);
        if (ComposerKt.isTraceInProgress()) {
            int i6 = f13734c + 87;
            f13733b = i6 % 128;
            if (i6 % 2 == 0) {
                ComposerKt.traceEventStart(-381139452, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.FormsDateInputScreen (FormsDateInputScreen.kt:30)");
                throw null;
            }
            ComposerKt.traceEventStart(-381139452, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.FormsDateInputScreen (FormsDateInputScreen.kt:30)");
        }
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
        String questionText = formsDateInputUiState.getQuestionText();
        g.d dVar = g.d.f5677e;
        TextStyle textStyleH = g.d.h();
        g.b bVar = g.b.f5657e;
        TextKt.m2711Text4IGK_g(questionText, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(textStyleH, g.b.e(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, 0, 0, 65534);
        SpacerKt.Spacer(SizeKt.m1049height3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(8.0f)), composerStartRestartGroup, 6);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        float fM6638constructorimpl = Dp.m6638constructorimpl(2.0f);
        g.b bVar2 = g.b.f5657e;
        Modifier modifierM1019paddingVpY3zN4 = PaddingKt.m1019paddingVpY3zN4(ClickableKt.m606clickableXHw0xAI$default(BorderKt.m584borderxT4_qwU(modifierFillMaxWidth$default, fM6638constructorimpl, g.b.j(), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f))), false, null, null, new c(function1, formsDateInputUiState), 7, null), Dp.m6638constructorimpl(16.0f), Dp.m6638constructorimpl(16.0f));
        g.d dVar2 = g.d.f5677e;
        TextKt.m2711Text4IGK_g(formsDateInputUiState.getAnswerFormatted(), modifierM1019paddingVpY3zN4, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(g.d.a(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.startReplaceableGroup(-634753489);
        if (formsDateInputUiState.getShowDatePicker()) {
            IncodeDialogDatePickerKt.IncodeDialogDatePicker(new e(function12, formsDateInputUiState), new d(function2, formsDateInputUiState), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            int i7 = f13733b + 61;
            f13734c = i7 % 128;
            if (i7 % 2 != 0) {
                ComposerKt.traceEventEnd();
                int i8 = 11 / 0;
            } else {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(formsDateInputUiState, function1, function12, function2, i2));
        }
    }

    static final class b extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13744a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13745b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13746c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f13747d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13748e = 0;

        private static void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13746c + 51;
            f13748e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13748e + 103;
            f13746c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 97 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13746c + 125;
            f13748e = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13748e + 77;
            f13746c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13744a + 75;
            f13745b = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function2<String, Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13764a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13765b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f13766c = new h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13767d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13768e = 1;

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13764a + 83;
            f13768e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = f13768e + 121;
            f13764a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, Long l2) {
            int i2 = 2 % 2;
            int i3 = f13768e + 121;
            f13764a = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            int i6 = f13764a + 45;
            f13768e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        static {
            int i2 = f13767d + 61;
            f13765b = i2 % 128;
            int i3 = i2 % 2;
        }

        h() {
            super(2);
        }
    }

    static final class i extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13769a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f13770b = new i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13771c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13772d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13773e = 0;

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13769a + 61;
            f13773e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13769a + 35;
            f13773e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13773e + 91;
            f13769a = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13772d + 97;
            f13771c = i2 % 128;
            int i3 = i2 % 2;
        }

        i() {
            super(1);
        }
    }

    private static final void c(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1192215409);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i4 = f13734c + 15;
                f13733b = i4 % 128;
                if (i4 % 2 == 0) {
                    ComposerKt.traceEventStart(1192215409, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsDateInputScreen (FormsDateInputScreen.kt:65)");
                    int i5 = 45 / 0;
                } else {
                    ComposerKt.traceEventStart(1192215409, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsDateInputScreen (FormsDateInputScreen.kt:65)");
                }
            }
            FormsDateInputScreen(FormsDateInputUiState.f13330d.previewData$onboard_release(), b.f13747d, i.f13770b, h.f13766c, composerStartRestartGroup, 3512);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13734c + 13;
                f13733b = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(i2));
        }
    }

    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f13735a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f13736c = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f13737h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f13738i = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13739b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FormsDateInputUiState f13741e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ int f13742g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Function2<String, Long, Unit> f13743j;

        public static int b() {
            int i2 = f13736c;
            int i3 = i2 % 6636117;
            f13736c = i2 + 1;
            if (i3 != 0) {
                return f13735a;
            }
            int iNextInt = new Random().nextInt();
            f13735a = iNextInt;
            return iNextInt;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13738i + 89;
            f13737h = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 62 / 0;
            }
            int i6 = f13738i + 89;
            f13737h = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13737h + 25;
            f13738i = i3 % 128;
            int i4 = i3 % 2;
            FormsDateInputScreenKt.FormsDateInputScreen(this.f13741e, this.f13739b, this.f13740d, this.f13743j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13742g | 1));
            int i5 = f13738i + 63;
            f13737h = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(FormsDateInputUiState formsDateInputUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function2<? super String, ? super Long, Unit> function2, int i2) {
            super(2);
            this.f13741e = formsDateInputUiState;
            this.f13739b = function1;
            this.f13740d = function12;
            this.f13743j = function2;
            this.f13742g = i2;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13761c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13762e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13763a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13761c + 117;
            f13762e = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13761c + 69;
            f13762e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13762e + 57;
            f13761c = i3 % 128;
            int i4 = i3 % 2;
            FormsDateInputScreenKt.access$Preview_FormsDateInputScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13763a | 1));
            int i5 = f13761c + 107;
            f13762e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(2);
            this.f13763a = i2;
        }
    }
}
