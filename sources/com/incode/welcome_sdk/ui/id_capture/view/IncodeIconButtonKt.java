package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.theme.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeIconButtonKt {

    /* JADX INFO: renamed from: b */
    private static int f15637b = 0;

    /* JADX INFO: renamed from: c */
    private static int f15638c = 1;

    public static final /* synthetic */ void access$PreviewCloseButton(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15638c + 99;
        f15637b = i4 % 128;
        int i5 = i4 % 2;
        a(composer, i2);
        if (i5 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$PreviewCloseButtonLeft(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15638c + 87;
        f15637b = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        int i6 = f15637b + 65;
        f15638c = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15671a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15672b = 0;

        /* JADX INFO: renamed from: c */
        public static final e f15673c = new e();

        /* JADX INFO: renamed from: d */
        private static int f15674d = 1;

        /* JADX INFO: renamed from: e */
        private static int f15675e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15675e + 47;
            f15672b = i3 % 128;
            int i4 = i3 % 2;
            d(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void d(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15675e + 113;
            f15672b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5925getPolite0phEisY());
            int i5 = f15675e + 51;
            f15672b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
        }

        static {
            int i2 = f15674d + 99;
            f15671a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: IncodeIconButton-TgFrcIs */
    public static final void m8497IncodeIconButtonTgFrcIs(BoxScope boxScope, boolean z2, long j2, Painter painter, String str, Alignment alignment, Function0<Unit> function0, Composer composer, int i2, int i3) {
        int i4;
        boolean z3 = z2;
        long jM8019getIconSecondary0d7_KjU = j2;
        int i5 = 2 % 2;
        int i6 = f15638c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f15637b = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(boxScope, "");
        Intrinsics.checkNotNullParameter(painter, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(alignment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1563411238);
        if ((i3 & 1) != 0) {
            int i8 = f15637b + 99;
            f15638c = i8 % 128;
            z3 = i8 % 2 == 0;
        }
        if ((i3 & 2) != 0) {
            h hVar = h.f5694b;
            jM8019getIconSecondary0d7_KjU = h.a(composerStartRestartGroup).m8019getIconSecondary0d7_KjU();
            i4 = i2 & (-897);
        } else {
            i4 = i2;
        }
        if (ComposerKt.isTraceInProgress()) {
            int i9 = f15637b + 87;
            f15638c = i9 % 128;
            if (i9 % 2 == 0) {
                ComposerKt.traceEventStart(-1563411238, i4, -1, "com.incode.welcome_sdk.ui.id_capture.view.IncodeIconButton (IncodeIconButton.kt:38)");
                throw null;
            }
            ComposerKt.traceEventStart(-1563411238, i4, -1, "com.incode.welcome_sdk.ui.id_capture.view.IncodeIconButton (IncodeIconButton.kt:38)");
        }
        Modifier modifierAlign = boxScope.align(PaddingKt.m1019paddingVpY3zN4(Modifier.Companion.then(z3 ? WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion) : Modifier.Companion), Dp.m6638constructorimpl(16.0f), Dp.m6638constructorimpl(16.0f)), alignment);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            int i10 = f15638c + 65;
            f15637b = i10 % 128;
            int i11 = i10 % 2;
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
            int i12 = f15638c + 13;
            f15637b = i12 % 128;
            int i13 = i12 % 2;
        }
        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!(!composerM3671constructorimpl.getInserting()) || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Object obj = null;
        Modifier modifierM606clickableXHw0xAI$default = ClickableKt.m606clickableXHw0xAI$default(Modifier.Companion, false, null, null, function0, 7, null);
        Alignment center = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM606clickableXHw0xAI$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
            int i14 = f15638c + 87;
            f15637b = i14 % 128;
            int i15 = i14 % 2;
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            int i16 = f15637b + 11;
            f15638c = i16 % 128;
            if (i16 % 2 == 0) {
                composerStartRestartGroup.createNode(constructor2);
                obj.hashCode();
                throw null;
            }
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(painter, str, SemanticsModifierKt.semantics$default(Modifier.Companion, false, e.f15673c, 1, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m4219tintxETnrds$default(ColorFilter.Companion, jM8019getIconSecondary0d7_KjU, 0, 2, null), composerStartRestartGroup, ((i4 >> 9) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | 8, 56);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new d(boxScope, z3, jM8019getIconSecondary0d7_KjU, painter, str, alignment, function0, i2, i3));
            return;
        }
        int i17 = f15637b + 91;
        f15638c = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: IncodeCloseButton-sW7UJKQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m8495IncodeCloseButtonsW7UJKQ(androidx.compose.foundation.layout.BoxScope r15, long r16, boolean r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IncodeIconButtonKt.m8495IncodeCloseButtonsW7UJKQ(androidx.compose.foundation.layout.BoxScope, long, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0042  */
    /* JADX INFO: renamed from: IncodeHelpButton-sW7UJKQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m8496IncodeHelpButtonsW7UJKQ(androidx.compose.foundation.layout.BoxScope r14, long r15, boolean r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IncodeIconButtonKt.m8496IncodeHelpButtonsW7UJKQ(androidx.compose.foundation.layout.BoxScope, long, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15655a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15656b = 1;

        /* JADX INFO: renamed from: c */
        public static final c f15657c = new c();

        /* JADX INFO: renamed from: d */
        private static int f15658d = 1;

        /* JADX INFO: renamed from: e */
        private static int f15659e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15655a + 107;
            f15658d = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f15655a + 19;
            f15658d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15659e + 23;
            f15656b = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(0);
        }
    }

    private static final void a(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-229640548);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-229640548, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCloseButton (IncodeIconButton.kt:102)");
            }
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                int i4 = f15638c + 13;
                f15637b = i4 % 128;
                int i5 = i4 % 2;
                ComposablesKt.invalidApplier();
                int i6 = f15638c + 51;
                f15637b = i6 % 128;
                int i7 = i6 % 2;
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            m8495IncodeCloseButtonsW7UJKQ(BoxScopeInstance.INSTANCE, 0L, false, c.f15657c, composerStartRestartGroup, 3078, 3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i2));
        }
    }

    private static final void c(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15638c + 47;
        f15637b = i4 % 128;
        if (i4 % 2 != 0) {
            composer.startRestartGroup(-303556139);
            throw null;
        }
        Composer composerStartRestartGroup = composer.startRestartGroup(-303556139);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f15637b + 115;
                f15638c = i5 % 128;
                int i6 = i5 % 2;
                ComposerKt.traceEventStart(-303556139, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCloseButtonLeft (IncodeIconButton.kt:114)");
                int i7 = f15638c + 13;
                f15637b = i7 % 128;
                int i8 = i7 % 2;
            }
            CompositionLocalKt.CompositionLocalProvider(com.incode.welcome_sdk.commons.theme.f.d().provides(new IncodeUXConfig.Builder().setCloseButtonPosition(CloseButtonPosition.TOP_LEFT).build()), ComposableSingletons$IncodeIconButtonKt.f15138c.m8488getLambda1$onboard_release(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(i2));
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: h */
        private static int f15639h = 0;

        /* JADX INFO: renamed from: j */
        private static int f15640j = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ long f15641a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Function0<Unit> f15642b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15643c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ BoxScope f15644d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ boolean f15645e;

        /* JADX INFO: renamed from: g */
        private /* synthetic */ int f15646g;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15639h + 53;
            f15640j = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15640j + 3;
            f15639h = i3 % 128;
            if (i3 % 2 != 0) {
                IncodeIconButtonKt.m8495IncodeCloseButtonsW7UJKQ(this.f15644d, this.f15641a, this.f15645e, this.f15642b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15643c), this.f15646g);
            } else {
                IncodeIconButtonKt.m8495IncodeCloseButtonsW7UJKQ(this.f15644d, this.f15641a, this.f15645e, this.f15642b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15643c | 1), this.f15646g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BoxScope boxScope, long j2, boolean z2, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f15644d = boxScope;
            this.f15641a = j2;
            this.f15645e = z2;
            this.f15642b = function0;
            this.f15643c = i2;
            this.f15646g = i3;
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f */
        private static int f15647f = 1;

        /* JADX INFO: renamed from: i */
        private static int f15648i = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ boolean f15649a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f15650b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function0<Unit> f15651c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ long f15652d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ BoxScope f15653e;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ int f15654j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15648i + 67;
            f15647f = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f15648i + 87;
            f15647f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15647f + 69;
            f15648i = i3 % 128;
            int i4 = i3 % 2;
            IncodeIconButtonKt.m8496IncodeHelpButtonsW7UJKQ(this.f15653e, this.f15652d, this.f15649a, this.f15651c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15650b | 1), this.f15654j);
            int i5 = f15647f + 57;
            f15648i = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BoxScope boxScope, long j2, boolean z2, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f15653e = boxScope;
            this.f15652d = j2;
            this.f15649a = z2;
            this.f15651c = function0;
            this.f15650b = i2;
            this.f15654j = i3;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g */
        private static int f15660g = 0;

        /* JADX INFO: renamed from: k */
        private static int f15661k = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ long f15662a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Painter f15663b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ BoxScope f15664c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ String f15665d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ boolean f15666e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Function0<Unit> f15667f;

        /* JADX INFO: renamed from: h */
        private /* synthetic */ Alignment f15668h;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ int f15669i;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ int f15670j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15660g + 111;
            f15661k = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15661k + 89;
            f15660g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15661k + 71;
            f15660g = i3 % 128;
            int i4 = i3 % 2;
            IncodeIconButtonKt.m8497IncodeIconButtonTgFrcIs(this.f15664c, this.f15666e, this.f15662a, this.f15663b, this.f15665d, this.f15668h, this.f15667f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15669i | 1), this.f15670j);
            int i5 = f15660g + 91;
            f15661k = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BoxScope boxScope, boolean z2, long j2, Painter painter, String str, Alignment alignment, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f15664c = boxScope;
            this.f15666e = z2;
            this.f15662a = j2;
            this.f15663b = painter;
            this.f15665d = str;
            this.f15668h = alignment;
            this.f15667f = function0;
            this.f15669i = i2;
            this.f15670j = i3;
        }
    }

    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15676a = 1;

        /* JADX INFO: renamed from: d */
        private static int f15677d = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15678c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15677d + 9;
            f15676a = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15677d + 61;
            f15676a = i3 % 128;
            IncodeIconButtonKt.access$PreviewCloseButton(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 == 0 ? this.f15678c : this.f15678c | 1));
            int i4 = f15676a + 85;
            f15677d = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(2);
            this.f15678c = i2;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f15679c = 0;

        /* JADX INFO: renamed from: d */
        private static int f15680d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ int f15681a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15679c + 43;
            f15680d = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15679c + 115;
            f15680d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 19 / 0;
            }
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15680d + 125;
            f15679c = i3 % 128;
            int i4 = i3 % 2;
            IncodeIconButtonKt.access$PreviewCloseButtonLeft(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15681a | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(2);
            this.f15681a = i2;
        }
    }
}
