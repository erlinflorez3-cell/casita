package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.theme.IncodeTypefaceTokens;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentSelectionScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15152a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f15153b = Dp.m6638constructorimpl(26.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f15154c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15155d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f15156e = 0;

    public static final /* synthetic */ void access$DocumentButton(int i2, int i3, int i4, Function0 function0, Composer composer, int i5) {
        int i6 = 2 % 2;
        int i7 = f15154c + 99;
        f15156e = i7 % 128;
        int i8 = i7 % 2;
        b(i2, i3, i4, function0, composer, i5);
        if (i8 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$PreviewDocumentSelectionScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15156e + 65;
        f15154c = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f15154c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f15156e = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewDocumentSelectionScreenDarkMode(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15154c + 53;
        f15156e = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        if (i5 != 0) {
            int i6 = 5 / 0;
        }
        int i7 = f15154c + 37;
        f15156e = i7 % 128;
        int i8 = i7 % 2;
    }

    static final class e extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15177a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15178e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15179d;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15178e + 45;
            f15177a = i3 % 128;
            int i4 = i3 % 2;
            d(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f15177a + 81;
            f15178e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static final class c extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15180b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15181c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15182e;

            private void b() {
                int i2 = 2 % 2;
                int i3 = f15180b + 95;
                f15181c = i3 % 128;
                if (i3 % 2 != 0) {
                    this.f15182e.invoke(InitIdCaptureUiEvent.DocumentSelectionUiEventInit.IdentityCardSelected.f15039d);
                    throw null;
                }
                this.f15182e.invoke(InitIdCaptureUiEvent.DocumentSelectionUiEventInit.IdentityCardSelected.f15039d);
                int i4 = f15181c + 1;
                f15180b = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15181c + 5;
                f15180b = i3 % 128;
                int i4 = i3 % 2;
                b();
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super InitIdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15182e = function1;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt$e$e, reason: collision with other inner class name */
        static final class C0253e extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15183c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f15184e = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15185b;

            private void c() {
                int i2 = 2 % 2;
                int i3 = f15183c + 83;
                f15184e = i3 % 128;
                int i4 = i3 % 2;
                Function1<InitIdCaptureUiEvent, Unit> function1 = this.f15185b;
                if (i4 != 0) {
                    function1.invoke(InitIdCaptureUiEvent.DocumentSelectionUiEventInit.PassportSelected.f15041d);
                } else {
                    function1.invoke(InitIdCaptureUiEvent.DocumentSelectionUiEventInit.PassportSelected.f15041d);
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = f15183c + 27;
                f15184e = i3 % 128;
                int i4 = i3 % 2;
                c();
                if (i4 == 0) {
                    unit = Unit.INSTANCE;
                    int i5 = 53 / 0;
                } else {
                    unit = Unit.INSTANCE;
                }
                int i6 = f15183c + 41;
                f15184e = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0253e(Function1<? super InitIdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15185b = function1;
            }
        }

        private void d(ColumnScope columnScope, Composer composer, int i2) {
            int i3 = i2;
            int i4 = 2 % 2;
            int i5 = f15177a + 85;
            f15178e = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i3 & 14) == 0) {
                i3 |= !(composer.changed(columnScope) ^ true) ? 4 : 2;
            }
            Object obj = null;
            if ((i3 & 91) == 18) {
                int i7 = f15177a + 37;
                f15178e = i7 % 128;
                if (i7 % 2 != 0) {
                    composer.getSkipping();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1793296732, i3, -1, "com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreen.<anonymous> (DocumentSelectionScreen.kt:62)");
            }
            SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.Companion, 1.0f, false, 2, null), composer, 0);
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion, 0.7f);
            String strStringResource = StringResources_androidKt.stringResource(R.string.onboard_sdk_id_document_selection_title, composer, 0);
            int iM6527getCentere0LSkKk = TextAlign.Companion.m6527getCentere0LSkKk();
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextKt.m2711Text4IGK_g(strStringResource, modifierFillMaxWidth, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(iM6527getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(com.incode.welcome_sdk.commons.theme.h.d(composer).c(), 0L, 0L, null, null, null, null, null, IncodeTypefaceTokens.INSTANCE.m8079getLetterSpacingNoneXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777087, null), composer, 48, 0, 65020);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.Companion, 2.0f, false, 2, null), composer, 0);
            int i8 = R.drawable.onboard_sdk_documents_identity_card;
            int i9 = R.string.onboard_sdk_id_document_selection_identity_card;
            int i10 = R.string.onboard_sdk_id_document_selection_identity_card_subtitle;
            composer.startReplaceableGroup(1781325505);
            boolean zChangedInstance = composer.changedInstance(this.f15179d);
            Function1<InitIdCaptureUiEvent, Unit> function1 = this.f15179d;
            c cVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || cVarRememberedValue == Composer.Companion.getEmpty()) {
                cVarRememberedValue = new c(function1);
                composer.updateRememberedValue(cVarRememberedValue);
            }
            composer.endReplaceableGroup();
            DocumentSelectionScreenKt.access$DocumentButton(i8, i9, i10, (Function0) cVarRememberedValue, composer, 0);
            SpacerKt.Spacer(SizeKt.m1049height3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(22.0f)), composer, 6);
            int i11 = R.drawable.onboard_sdk_documents_passport;
            int i12 = R.string.onboard_sdk_id_document_selection_passport;
            int i13 = R.string.onboard_sdk_id_document_selection_passport_subtitle;
            composer.startReplaceableGroup(1781325844);
            boolean zChangedInstance2 = composer.changedInstance(this.f15179d);
            Function1<InitIdCaptureUiEvent, Unit> function12 = this.f15179d;
            C0253e c0253eRememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || c0253eRememberedValue == Composer.Companion.getEmpty()) {
                c0253eRememberedValue = new C0253e(function12);
                composer.updateRememberedValue(c0253eRememberedValue);
            }
            composer.endReplaceableGroup();
            DocumentSelectionScreenKt.access$DocumentButton(i11, i12, i13, (Function0) c0253eRememberedValue, composer, 0);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.Companion, 0.4f, false, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i14 = f15178e + 59;
                f15177a = i14 % 128;
                if (i14 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    obj.hashCode();
                    throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super InitIdCaptureUiEvent, Unit> function1) {
            super(3);
            this.f15179d = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DocumentSelectionScreen(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent, kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, boolean r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.DocumentSelectionScreen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
    }

    static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15172a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15173b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15174c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f15175d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15176e = 0;

        private static void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15176e + 21;
            f15173b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                int i4 = 20 / 0;
            } else {
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            }
            int i5 = f15176e + 91;
            f15173b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15173b + 97;
            f15176e = i3 % 128;
            int i4 = i3 % 2;
            b(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            int i5 = f15176e + 35;
            f15173b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15174c + 83;
            f15172a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15164b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15165c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15166d;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f15165c + 83;
            f15164b = i3 % 128;
            if (i3 % 2 != 0) {
                this.f15166d.invoke();
                throw null;
            }
            this.f15166d.invoke();
            int i4 = f15164b + 83;
            f15165c = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15165c + 93;
            f15164b = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(0);
            this.f15166d = function0;
        }
    }

    static final class c extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15167b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15168c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15169a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15171e;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15168c + 57;
            f15167b = i3 % 128;
            int i4 = i3 % 2;
            c(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f15168c + 117;
            f15167b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void c(ColumnScope columnScope, Composer composer, int i2) throws Throwable {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i2 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220148305, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.DocumentButton.<anonymous> (DocumentSelectionScreen.kt:115)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier.Companion companion2 = companion;
            Object obj = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1021paddingqDBjuR0(companion2, Dp.m6638constructorimpl(6.0f), Dp.m6638constructorimpl(14.0f), Dp.m6638constructorimpl(24.0f), Dp.m6638constructorimpl(14.0f)), 0.0f, 1, null);
            int i4 = this.f15169a;
            int i5 = this.f15170d;
            int i6 = this.f15171e;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                int i7 = f15168c + 115;
                f15167b = i7 % 128;
                if (i7 % 2 != 0) {
                    ComposablesKt.invalidApplier();
                    obj.hashCode();
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
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i4, composer, 0), (String) null, rowScopeInstance.align(SizeKt.m1049height3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(90.0f)), Alignment.Companion.getCenterVertically()), (Alignment) null, ContentScale.Companion.getInside(), 0.0f, (ColorFilter) null, composer, 24632, 104);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer, 0);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                int i8 = f15168c + 67;
                f15167b = i8 % 128;
                if (i8 % 2 != 0) {
                    ComposablesKt.invalidApplier();
                    int i9 = 30 / 0;
                } else {
                    ComposablesKt.invalidApplier();
                }
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                int i10 = f15168c + 47;
                f15167b = i10 % 128;
                if (i10 % 2 != 0) {
                    composer.createNode(constructor2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(i5, composer, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextKt.m2711Text4IGK_g(strStringResource, modifierFillMaxWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(TextAlign.Companion.m6528getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, com.incode.welcome_sdk.commons.theme.h.d(composer).g(), composer, 48, 0, 65020);
            String strStringResource2 = StringResources_androidKt.stringResource(i6, composer, 0);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m6638constructorimpl(4.0f), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextStyle textStyleO = com.incode.welcome_sdk.commons.theme.h.d(composer).o();
            com.incode.welcome_sdk.commons.theme.h hVar3 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextKt.m2711Text4IGK_g(strStringResource2, modifierFillMaxWidth$default3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(TextAlign.Companion.m6528getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(textStyleO, com.incode.welcome_sdk.commons.theme.h.a(composer).m8067getTextBodySecondary0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 48, 0, 65020);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer, 0);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.onboard_sdk_arrow_right, composer, 0);
            Modifier modifierClip = ClipKt.clip(columnScopeInstance.align(SizeKt.m1060requiredWidth3ABfNKs(SizeKt.m1052requiredHeight3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(22.0f)), Dp.m6638constructorimpl(44.0f)), Alignment.Companion.getEnd()), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(28.0f)));
            com.incode.welcome_sdk.commons.theme.h hVar4 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            Modifier modifierM573backgroundbw27NRU$default = BackgroundKt.m573backgroundbw27NRU$default(modifierClip, com.incode.welcome_sdk.commons.theme.h.a(composer).m7986getButtonPrimarySurfaceDefault0d7_KjU(), null, 2, null);
            ContentScale inside = ContentScale.Companion.getInside();
            ColorFilter.Companion companion3 = ColorFilter.Companion;
            com.incode.welcome_sdk.commons.theme.h hVar5 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            ImageKt.Image(painterPainterResource, (String) null, modifierM573backgroundbw27NRU$default, (Alignment) null, inside, 0.0f, ColorFilter.Companion.m4219tintxETnrds$default(companion3, com.incode.welcome_sdk.commons.theme.h.a(composer).m8015getIconInvert0d7_KjU(), 0, 2, null), composer, 24632, 40);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                int i11 = f15168c + 87;
                f15167b = i11 % 128;
                int i12 = i11 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2, int i3, int i4) {
            super(3);
            this.f15169a = i2;
            this.f15170d = i3;
            this.f15171e = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(int r19, int r20, int r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.b(int, int, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    static final class f extends Lambda implements Function1<InitIdCaptureUiEvent, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15186a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15187b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f15188c = new f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15189d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15190e = 1;

        private static void a(InitIdCaptureUiEvent initIdCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15186a + 45;
            f15189d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
            int i4 = f15186a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15189d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(InitIdCaptureUiEvent initIdCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15189d + 81;
            f15186a = i3 % 128;
            int i4 = i3 % 2;
            a(initIdCaptureUiEvent);
            Unit unit = Unit.INSTANCE;
            int i5 = f15186a + 97;
            f15189d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15187b + 59;
            f15190e = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15197a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15198b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f15199c = new h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15200d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15201e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15201e + 111;
            f15198b = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f15198b + 97;
            f15201e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 44 / 0;
            }
            return unit;
        }

        static {
            int i2 = f15200d + 93;
            f15197a = i2 % 128;
            int i3 = i2 % 2;
        }

        h() {
            super(0);
        }
    }

    private static final void e(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020231691);
        if (i2 != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                int i4 = f15156e + 53;
                f15154c = i4 % 128;
                if (i4 % 2 != 0) {
                    ComposerKt.traceEventStart(2020231691, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewDocumentSelectionScreen (DocumentSelectionScreen.kt:169)");
                } else {
                    ComposerKt.traceEventStart(2020231691, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewDocumentSelectionScreen (DocumentSelectionScreen.kt:169)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            DocumentSelectionScreen(f.f15188c, h.f15199c, true, composerStartRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i5 = f15156e + 11;
                f15154c = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            int i7 = f15156e + 41;
            f15154c = i7 % 128;
            int i8 = i7 % 2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(i2));
            int i9 = f15156e + 107;
            f15154c = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(androidx.compose.runtime.Composer r9, int r10) {
        /*
            r3 = 2
            int r0 = r3 % r3
            r2 = 1998307044(0x771bbee4, float:3.1588974E33)
            androidx.compose.runtime.Composer r7 = r9.startRestartGroup(r2)
            if (r10 != 0) goto L1d
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.f15154c
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.f15156e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L62
            boolean r0 = r7.getSkipping()
            if (r0 != 0) goto L5e
        L1d:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L2b
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.id_capture.view.PreviewDocumentSelectionScreenDarkMode (DocumentSelectionScreen.kt:175)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r1, r0)
        L2b:
            com.incode.welcome_sdk.commons.theme.h r4 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r5 = com.incode.welcome_sdk.DisplayMode.DARK
            com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt r0 = com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt.f15098a
            kotlin.jvm.functions.Function2 r6 = r0.m8485getLambda1$onboard_release()
            r8 = 438(0x1b6, float:6.14E-43)
            r9 = 0
            r4.d(r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L44
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L44:
            androidx.compose.runtime.ScopeUpdateScope r1 = r7.endRestartGroup()
            if (r1 == 0) goto L5d
            com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt$j r0 = new com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt$j
            r0.<init>(r10)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.f15154c
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.f15156e = r0
            int r1 = r1 % r3
        L5d:
            return
        L5e:
            r7.skipToGroupEnd()
            goto L44
        L62:
            r7.getSkipping()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.DocumentSelectionScreenKt.b(androidx.compose.runtime.Composer, int):void");
    }

    static {
        int i2 = f15155d + 39;
        f15152a = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f15157g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15158i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15163e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15157g + 37;
            f15158i = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15157g + 39;
            f15158i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15158i + 67;
            f15157g = i3 % 128;
            int i4 = i3 % 2;
            DocumentSelectionScreenKt.access$DocumentButton(this.f15159a, this.f15161c, this.f15162d, this.f15160b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15163e | 1));
            int i5 = f15158i + 57;
            f15157g = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2, int i3, int i4, Function0<Unit> function0, int i5) {
            super(2);
            this.f15159a = i2;
            this.f15161c = i3;
            this.f15162d = i4;
            this.f15160b = function0;
            this.f15163e = i5;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15191e = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15192j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ boolean f15194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15196d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15191e + 37;
            f15192j = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15192j + 25;
            f15191e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15191e + 5;
            f15192j = i3 % 128;
            int i4 = i3 % 2;
            DocumentSelectionScreenKt.DocumentSelectionScreen(this.f15195c, this.f15196d, this.f15194b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15193a | 1));
            int i5 = f15191e + 77;
            f15192j = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super InitIdCaptureUiEvent, Unit> function1, Function0<Unit> function0, boolean z2, int i2) {
            super(2);
            this.f15195c = function1;
            this.f15196d = function0;
            this.f15194b = z2;
            this.f15193a = i2;
        }
    }

    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15202a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15203e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f15204b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15203e + 27;
            f15202a = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15203e + 107;
            f15202a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15203e + 95;
            f15202a = i3 % 128;
            int i4 = i3 % 2;
            DocumentSelectionScreenKt.access$PreviewDocumentSelectionScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15204b | 1));
            int i5 = f15203e + 69;
            f15202a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i2) {
            super(2);
            this.f15204b = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15205b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15206d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15207c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15206d + 47;
            f15205b = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f15206d + 113;
            f15205b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15206d + 7;
            f15205b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f15207c;
            if (i4 != 0) {
                i5 |= 1;
            }
            DocumentSelectionScreenKt.access$PreviewDocumentSelectionScreenDarkMode(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(2);
            this.f15207c = i2;
        }
    }
}
