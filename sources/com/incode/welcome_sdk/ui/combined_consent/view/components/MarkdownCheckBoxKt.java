package com.incode.welcome_sdk.ui.combined_consent.view.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.commons.theme.i;
import com.incode.welcome_sdk.commons.utils.b;
import com.incode.welcome_sdk.data.local.db.c.a.z;
import com.incode.welcome_sdk.ui.combined_consent.CheckboxState;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public final class MarkdownCheckBoxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12957a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12958b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f12959d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12960e = 0;

    static final class c extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12966a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12967d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Context f12968c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ AnnotatedString f12969e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) throws Exception {
            int i2 = 2 % 2;
            int i3 = f12966a + 15;
            f12967d = i3 % 128;
            int i4 = i3 % 2;
            c(num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f12967d + 53;
            f12966a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(int i2) throws Exception {
            int i3 = 2 % 2;
            int i4 = f12967d + 39;
            f12966a = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f12969e.getStringAnnotations("URL", i2, i2));
                if (range != null) {
                    Context context = this.f12968c;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) range.getItem()));
                    CX.ud();
                    context.startActivity(intent);
                    int i5 = f12967d + 123;
                    f12966a = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                return;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AnnotatedString annotatedString, Context context) {
            super(1);
            this.f12969e = annotatedString;
            this.f12968c = context;
        }
    }

    public static final void MarkdownCheckbox(CheckboxState checkboxState, Function1<? super Boolean, Unit> function1, Composer composer, int i2) {
        long jC;
        long jI;
        int i3 = 2 % 2;
        int i4 = f12960e + 35;
        f12958b = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(checkboxState, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2113802398);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2113802398, i2, -1, "com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckbox (MarkdownCheckBox.kt:31)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        b bVar = b.f6439a;
        AnnotatedString annotatedStringA = b.a(checkboxState.getText());
        Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, Dp.m6638constructorimpl(20.0f), 0.0f, Dp.m6638constructorimpl(20.0f), 0.0f, 10, null);
        i iVar = i.f5712e;
        int iD = z.AnonymousClass5.d();
        int iD2 = z.AnonymousClass5.d();
        Modifier modifierM1018padding3ABfNKs = PaddingKt.m1018padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m572backgroundbw27NRU(modifierM1022paddingqDBjuR0$default, ((Long) i.b(new Object[0], z.AnonymousClass5.d(), 1533725691, z.AnonymousClass5.d(), iD, -1533725691, iD2)).longValue(), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(16.0f))), 0.0f, 1, null), Dp.m6638constructorimpl(12.0f));
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            int i6 = f12960e + 23;
            f12958b = i6 % 128;
            int i7 = i6 % 2;
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Vertical top = Alignment.Companion.getTop();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            int i8 = f12960e + 87;
            f12958b = i8 % 128;
            if (i8 % 2 == 0) {
                ComposablesKt.invalidApplier();
                throw null;
            }
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            int i9 = f12960e + 121;
            f12958b = i9 % 128;
            if (i9 % 2 == 0) {
                composerStartRestartGroup.createNode(constructor2);
                int i10 = 51 / 0;
            } else {
                composerStartRestartGroup.createNode(constructor2);
            }
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
            int i11 = f12958b + 63;
            f12960e = i11 % 128;
            int i12 = i11 % 2;
        }
        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(24.0f));
        if (!checkboxState.isChecked()) {
            jC = Color.Companion.m4215getWhite0d7_KjU();
        } else {
            int i13 = f12960e + 95;
            f12958b = i13 % 128;
            if (i13 % 2 == 0) {
                i iVar2 = i.f5712e;
                i.c();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i iVar3 = i.f5712e;
            jC = i.c();
        }
        Modifier modifierM572backgroundbw27NRU = BackgroundKt.m572backgroundbw27NRU(modifierM1063size3ABfNKs, jC, RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f)));
        float fM6638constructorimpl = Dp.m6638constructorimpl(1.0f);
        if (checkboxState.isChecked()) {
            int i14 = f12958b + 117;
            f12960e = i14 % 128;
            if (i14 % 2 != 0) {
                i iVar4 = i.f5712e;
                i.c();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i iVar5 = i.f5712e;
            jI = i.c();
        } else {
            i iVar6 = i.f5712e;
            jI = i.i();
        }
        Modifier modifierClip = ClipKt.clip(BorderKt.m584borderxT4_qwU(modifierM572backgroundbw27NRU, fM6638constructorimpl, jI, RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f))), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(8.0f)));
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
        Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        CheckboxKt.Checkbox(checkboxState.isChecked(), function1, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), false, CheckboxDefaults.INSTANCE.m1866colors5tl4gsc(Color.Companion.m4213getTransparent0d7_KjU(), Color.Companion.m4213getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, (CheckboxDefaults.$stable << 18) | 54, 60), null, composerStartRestartGroup, (i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 40);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(12.0f)), composerStartRestartGroup, 6);
        h hVar = h.f5694b;
        ClickableTextKt.m1319ClickableText4YKlhWE(annotatedStringA, null, h.d(composerStartRestartGroup).f(), false, 0, 0, null, new c(annotatedStringA, context), composerStartRestartGroup, 0, 122);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a(checkboxState, function1, i2));
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12961a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12962e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<Boolean, Unit> f12963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ CheckboxState f12964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f12965d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f12961a + 89;
            f12962e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f12962e + 111;
            f12961a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f12961a + 47;
            f12962e = i3 % 128;
            int i4 = i3 % 2;
            MarkdownCheckBoxKt.MarkdownCheckbox(this.f12964c, this.f12963b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12965d | 1));
            int i5 = f12962e + 71;
            f12961a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CheckboxState checkboxState, Function1<? super Boolean, Unit> function1, int i2) {
            super(2);
            this.f12964c = checkboxState;
            this.f12963b = function1;
            this.f12965d = i2;
        }
    }

    public static int c() {
        int i2 = f12959d;
        int i3 = i2 % 7327872;
        f12959d = i2 + 1;
        if (i3 != 0) {
            return f12957a;
        }
        int iNextInt = new Random().nextInt();
        f12957a = iNextInt;
        return iNextInt;
    }
}
