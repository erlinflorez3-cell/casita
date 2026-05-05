package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionLearnMoreScreenNewKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16725a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<ImageText> f16726b = CollectionsKt.listOf((Object[]) new ImageText[]{new ImageText(R.drawable.onboard_sdk_camera_badge, R.string.onboard_sdk_permission_rationale_p1), new ImageText(R.drawable.onboard_sdk_bank_card_badge, R.string.onboard_sdk_permission_rationale_p2), new ImageText(R.drawable.onboard_sdk_check_badge, R.string.onboard_sdk_permission_rationale_p4)});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16727c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16728d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16729e = 1;

    public static final /* synthetic */ void access$PermissionLearnMoreContent(boolean z2, Function1 function1, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f16728d + 73;
        f16729e = i4 % 128;
        int i5 = i4 % 2;
        c(z2, function1, composer, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$PreviewPermissionRationaleContentDark(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16728d + 33;
        f16729e = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        if (i5 == 0) {
            int i6 = 39 / 0;
        }
    }

    public static final /* synthetic */ void access$PreviewPermissionRationaleContentLight(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16728d + 67;
        f16729e = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        if (i5 == 0) {
            int i6 = 29 / 0;
        }
        int i7 = f16728d + 13;
        f16729e = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 50 / 0;
        }
    }

    public static final void PermissionLearnMoreScreenNew(PermissionViewModel permissionViewModel, Function1<? super PermissionOnboardingEvent, Unit> function1, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16729e + 19;
        f16728d = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(permissionViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1429763316);
        if (ComposerKt.isTraceInProgress()) {
            int i6 = f16728d + 65;
            f16729e = i6 % 128;
            int i7 = i6 % 2;
            ComposerKt.traceEventStart(1429763316, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNew (PermissionLearnMoreScreenNew.kt:42)");
        }
        c(((PermissionViewModel.State) FlowExtKt.collectAsStateWithLifecycle(permissionViewModel.getState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue()).getShowCloseButton(), function1, composerStartRestartGroup, i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        if (ComposerKt.isTraceInProgress()) {
            int i8 = f16728d + 21;
            f16729e = i8 % 128;
            int i9 = i8 % 2;
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(permissionViewModel, function1, i2));
            int i10 = f16729e + 9;
            f16728d = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16746a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16747c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16748d;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f16746a + 31;
            f16747c = i3 % 128;
            int i4 = i3 % 2;
            this.f16748d.invoke(PermissionOnboardingEvent.OnQuitClicked.f16526e);
            int i5 = f16746a + 117;
            f16747c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16746a + 17;
            f16747c = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16748d = function1;
        }
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16738b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16739d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16740e;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f16738b + 19;
            f16739d = i3 % 128;
            int i4 = i3 % 2;
            this.f16740e.invoke(PermissionOnboardingEvent.OnLearnMoreAllowPermissionClicked.f16516d);
            int i5 = f16738b + 35;
            f16739d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16738b + 37;
            f16739d = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 82 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16740e = function1;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16735a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16736b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16737d;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f16735a + 25;
            f16736b = i3 % 128;
            int i4 = i3 % 2;
            a();
            if (i4 == 0) {
                unit = Unit.INSTANCE;
                int i5 = 6 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f16736b + 125;
            f16735a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f16735a + 99;
            f16736b = i3 % 128;
            int i4 = i3 % 2;
            this.f16737d.invoke(PermissionOnboardingEvent.OnQuitClicked.f16526e);
            int i5 = f16736b + 75;
            f16735a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16737d = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(boolean r39, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.c(boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static {
        int i2 = f16725a + 9;
        f16727c = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void d(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1661748777);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            int i4 = f16728d + 115;
            f16729e = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f16729e + 55;
                f16728d = i6 % 128;
                if (i6 % 2 != 0) {
                    ComposerKt.traceEventStart(1661748777, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionRationaleContentLight (PermissionLearnMoreScreenNew.kt:163)");
                    throw null;
                }
                ComposerKt.traceEventStart(1661748777, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionRationaleContentLight (PermissionLearnMoreScreenNew.kt:163)");
            }
            com.incode.welcome_sdk.commons.theme.h.f5694b.d(DisplayMode.LIGHT, ComposableSingletons$PermissionLearnMoreScreenNewKt.f16579d.m8517getLambda2$onboard_release(), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i7 = f16729e + 31;
                f16728d = i7 % 128;
                int i8 = i7 % 2;
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r9, int r10) {
        /*
            r3 = 2
            int r0 = r3 % r3
            r2 = -339520961(0xffffffffebc3523f, float:-4.7225786E26)
            androidx.compose.runtime.Composer r7 = r9.startRestartGroup(r2)
            if (r10 != 0) goto L21
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16728d
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16729e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L6b
            boolean r1 = r7.getSkipping()
            r0 = 80
            int r0 = r0 / 0
            if (r1 != 0) goto L72
        L21:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L36
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16729e
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16728d = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionRationaleContentDark (PermissionLearnMoreScreenNew.kt:174)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r1, r0)
        L36:
            com.incode.welcome_sdk.commons.theme.h r4 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r5 = com.incode.welcome_sdk.DisplayMode.DARK
            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.f16579d
            kotlin.jvm.functions.Function2 r6 = r0.m8518getLambda3$onboard_release()
            r8 = 438(0x1b6, float:6.14E-43)
            r9 = 0
            r4.d(r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L5a
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16729e
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.f16728d = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L76
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L5a:
            androidx.compose.runtime.ScopeUpdateScope r1 = r7.endRestartGroup()
            if (r1 == 0) goto L6a
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt$j r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt$j
            r0.<init>(r10)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L6a:
            return
        L6b:
            boolean r0 = r7.getSkipping()
            if (r0 != 0) goto L72
            goto L21
        L72:
            r7.skipToGroupEnd()
            goto L5a
        L76:
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16730b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16731c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ PermissionViewModel f16732a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16734e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16730b + 113;
            f16731c = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16731c + 29;
            f16730b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16731c + 67;
            f16730b = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenNewKt.PermissionLearnMoreScreenNew(this.f16732a, this.f16734e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16733d | 1));
            int i5 = f16731c + 37;
            f16730b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(PermissionViewModel permissionViewModel, Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16732a = permissionViewModel;
            this.f16734e = function1;
            this.f16733d = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16741c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16742e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16744b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f16745d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16742e + 91;
            f16741c = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16742e + 49;
            f16741c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16741c + 101;
            f16742e = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenNewKt.access$PermissionLearnMoreContent(this.f16745d, this.f16744b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16743a | 1));
            int i5 = f16742e + 99;
            f16741c = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z2, Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16745d = z2;
            this.f16744b = function1;
            this.f16743a = i2;
        }
    }

    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16749a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16750c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f16751b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16750c + 93;
            f16749a = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16750c + 71;
            f16749a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16750c + 49;
            f16749a = i3 % 128;
            int i4 = i3 % 2;
            PermissionLearnMoreScreenNewKt.access$PreviewPermissionRationaleContentLight(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16751b | 1));
            int i5 = f16749a + 103;
            f16750c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i2) {
            super(2);
            this.f16751b = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16752d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16753e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16754a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16752d + 43;
            f16753e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16753e + 87;
            f16752d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16753e + 57;
            f16752d = i3 % 128;
            PermissionLearnMoreScreenNewKt.access$PreviewPermissionRationaleContentDark(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f16754a : this.f16754a | 1));
            int i4 = f16752d + 1;
            f16753e = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(2);
            this.f16754a = i2;
        }
    }
}
