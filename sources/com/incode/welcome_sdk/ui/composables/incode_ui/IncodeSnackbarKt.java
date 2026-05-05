package com.incode.welcome_sdk.ui.composables.incode_ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeSnackbarKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13046b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13047c = 1;

    public static final /* synthetic */ void access$PreviewIncodeSnackbar(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f13046b + 95;
        f13047c = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        if (i5 == 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f13048f = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13049j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ long f13050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ FontFamily f13051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f13052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ long f13053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ FontWeight f13054e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13049j + 117;
            f13048f = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13049j + 55;
            f13048f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.compose.runtime.Composer r36, int r37) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.incode_ui.IncodeSnackbarKt.a.b(androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j2, long j3, FontWeight fontWeight, FontFamily fontFamily) {
            super(2);
            this.f13052c = str;
            this.f13050a = j2;
            this.f13053d = j3;
            this.f13054e = fontWeight;
            this.f13051b = fontFamily;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f13069f = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f13070i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ long f13071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ FontWeight f13072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ long f13073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f13074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13075e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ FontFamily f13076h;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13069f + 55;
            f13070i = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13069f + 1;
            f13070i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13077b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13078e = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f13079c;

            private void c() {
                int i2 = 2 % 2;
                int i3 = f13077b + 79;
                f13078e = i3 % 128;
                int i4 = i3 % 2;
                this.f13079c.invoke();
                int i5 = f13078e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f13077b = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f13078e + 69;
                f13077b = i3 % 128;
                int i4 = i3 % 2;
                c();
                if (i4 == 0) {
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i5 = f13077b + 113;
                f13078e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 29 / 0;
                }
                return unit2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0<Unit> function0) {
                super(0);
                this.f13079c = function0;
            }
        }

        static final class c extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f13080f = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f13081i = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ String f13082a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ FontWeight f13083b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ FontFamily f13084c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ long f13085d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ long f13086e;

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                int i2 = 2 % 2;
                int i3 = f13080f + 55;
                f13081i = i3 % 128;
                int i4 = i3 % 2;
                a(rowScope, composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i5 = f13080f + 25;
                f13081i = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void a(androidx.compose.foundation.layout.RowScope r46, androidx.compose.runtime.Composer r47, int r48) {
                /*
                    Method dump skipped, instruction units count: 219
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.incode_ui.IncodeSnackbarKt.e.c.a(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, long j2, long j3, FontWeight fontWeight, FontFamily fontFamily) {
                super(3);
                this.f13082a = str;
                this.f13086e = j2;
                this.f13085d = j3;
                this.f13083b = fontWeight;
                this.f13084c = fontFamily;
            }
        }

        private void b(Composer composer, int i2) {
            Modifier modifierM1068width3ABfNKs;
            int i3;
            int i4 = 2 % 2;
            int i5 = f13069f + 3;
            f13070i = i5 % 128;
            if (i5 % 2 == 0 ? (i2 & 11) == 2 : (i2 & 70) == 5) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1669838796, i2, -1, "com.incode.welcome_sdk.ui.composables.incode_ui.IncodeSnackbar.<anonymous> (IncodeSnackbar.kt:85)");
            }
            String str = this.f13074d;
            Object obj = null;
            if (str == null) {
                int i6 = f13069f + 57;
                f13070i = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                Function0<Unit> function0 = this.f13075e;
                long j2 = this.f13071a;
                long j3 = this.f13073c;
                FontWeight fontWeight = this.f13072b;
                FontFamily fontFamily = this.f13076h;
                Modifier modifierM1049height3ABfNKs = SizeKt.m1049height3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(88.0f));
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1049height3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    int i7 = f13070i + 51;
                    f13069f = i7 % 128;
                    if (i7 % 2 == 0) {
                        ComposablesKt.invalidApplier();
                        throw null;
                    }
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer);
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    int i8 = f13069f + 79;
                    f13070i = i8 % 128;
                    int i9 = i8 % 2;
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1056740974);
                boolean zChangedInstance = composer.changedInstance(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new b(function0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1834266603, true, new c(str, j2, j3, fontWeight, fontFamily)), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                composer.startReplaceableGroup(-1124950897);
                if (str.length() <= 14) {
                    int i10 = f13070i + 85;
                    f13069f = i10 % 128;
                    if (i10 % 2 == 0) {
                        modifierM1068width3ABfNKs = SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(32.0f));
                        i3 = 56;
                    } else {
                        modifierM1068width3ABfNKs = SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(32.0f));
                        i3 = 6;
                    }
                    SpacerKt.Spacer(modifierM1068width3ABfNKs, composer, i3);
                }
                composer.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Function0<Unit> function0, long j2, long j3, FontWeight fontWeight, FontFamily fontFamily) {
            super(2);
            this.f13074d = str;
            this.f13075e = function0;
            this.f13071a = j2;
            this.f13073c = j3;
            this.f13072b = fontWeight;
            this.f13076h = fontFamily;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f A[PHI: r0
  0x018f: PHI (r0v5 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v14 androidx.compose.runtime.Composer) binds: [B:43:0x018b, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b A[PHI: r0
  0x002b: PHI (r0v13 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v14 androidx.compose.runtime.Composer) binds: [B:43:0x018b, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeSnackbar(java.lang.String r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, java.lang.String r33, androidx.compose.runtime.Composer r34, int r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.incode_ui.IncodeSnackbarKt.IncodeSnackbar(java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13064a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13065b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13066c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13067d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f13068e = new d();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13064a + 51;
            f13066c = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f13066c + 27;
            f13064a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13065b + 29;
            f13067d = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(0);
        }
    }

    private static final void b(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(53504537);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            int i4 = f13047c + 39;
            f13046b = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13046b + 29;
                f13047c = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventStart(53504537, i2, -1, "com.incode.welcome_sdk.ui.composables.incode_ui.PreviewIncodeSnackbar (IncodeSnackbar.kt:114)");
            }
            IncodeSnackbar(StringResources_androidKt.stringResource(R.string.onboard_sdk_no_network_snackbar_action_text, composerStartRestartGroup, 0), d.f13068e, StringResources_androidKt.stringResource(R.string.onboard_sdk_no_network_snackbar_content_text, composerStartRestartGroup, 0), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i2));
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13055e = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f13056h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f13058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f13059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13060d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f13056h + 37;
            f13055e = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 92 / 0;
            }
            int i6 = f13056h + 29;
            f13055e = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f13056h + 97;
            f13055e = i3 % 128;
            int i4 = i3 % 2;
            IncodeSnackbarKt.IncodeSnackbar(this.f13059c, this.f13057a, this.f13058b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13060d | 1));
            int i5 = f13055e + 113;
            f13056h = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0<Unit> function0, String str2, int i2) {
            super(2);
            this.f13059c = str;
            this.f13057a = function0;
            this.f13058b = str2;
            this.f13060d = i2;
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13061b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13062c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13063d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f13062c + 99;
            f13061b = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 17 / 0;
            }
            int i6 = f13062c + 27;
            f13061b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 18 / 0;
            }
            return unit;
        }

        private void c(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f13062c + 9;
            f13061b = i3 % 128;
            int i4 = i3 % 2;
            IncodeSnackbarKt.access$PreviewIncodeSnackbar(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13063d | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(2);
            this.f13063d = i2;
        }
    }
}
