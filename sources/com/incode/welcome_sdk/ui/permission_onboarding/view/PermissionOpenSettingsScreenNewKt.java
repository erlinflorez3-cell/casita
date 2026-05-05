package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionOpenSettingsScreenNewKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16803b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16804c = 1;

    public static final /* synthetic */ void access$PreviewPermissionOpenSettingsBlockContentDark(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16804c + 45;
        f16803b = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        int i6 = f16803b + 79;
        f16804c = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$PreviewPermissionOpenSettingsBlockContentLight(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16804c + 45;
        f16803b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        a(composer, i2);
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = f16804c + 65;
        f16803b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final void PermissionOpenSettingsScreenNew(PermissionViewModel permissionViewModel, Function1<? super PermissionOnboardingEvent, Unit> function1, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16804c + 97;
        f16803b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(permissionViewModel, "");
            Intrinsics.checkNotNullParameter(function1, "");
            composer.startRestartGroup(-771021974);
            ComposerKt.isTraceInProgress();
            throw null;
        }
        Intrinsics.checkNotNullParameter(permissionViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-771021974);
        if (ComposerKt.isTraceInProgress()) {
            int i5 = f16804c + 21;
            f16803b = i5 % 128;
            if (i5 % 2 != 0) {
                ComposerKt.traceEventStart(-771021974, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNew (PermissionOpenSettingsScreenNew.kt:38)");
                obj.hashCode();
                throw null;
            }
            ComposerKt.traceEventStart(-771021974, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNew (PermissionOpenSettingsScreenNew.kt:38)");
        }
        OpenSettingsContent(((PermissionViewModel.State) FlowExtKt.collectAsStateWithLifecycle(permissionViewModel.getState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue()).getShowCloseButton(), function1, composerStartRestartGroup, i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(permissionViewModel, function1, i2));
            return;
        }
        int i6 = f16803b + 11;
        f16804c = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16821a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16822b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16823e;

        private void e() {
            int i2 = 2 % 2;
            int i3 = f16822b + 7;
            f16821a = i3 % 128;
            int i4 = i3 % 2;
            this.f16823e.invoke(PermissionOnboardingEvent.OnOpenSystemSettingsClicked.f16519b);
            int i5 = f16822b + 7;
            f16821a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16821a + 43;
            f16822b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            e();
            if (i4 == 0) {
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f16821a + 109;
            f16822b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16823e = function1;
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16808c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16809e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16810a;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f16809e + 65;
            f16808c = i3 % 128;
            int i4 = i3 % 2;
            b();
            if (i4 == 0) {
                unit = Unit.INSTANCE;
                int i5 = 70 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f16808c + 123;
            f16809e = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b() {
            int i2 = 2 % 2;
            int i3 = f16808c + 41;
            f16809e = i3 % 128;
            int i4 = i3 % 2;
            this.f16810a.invoke(PermissionOnboardingEvent.OnQuitClicked.f16526e);
            int i5 = f16809e + 113;
            f16808c = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16810a = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OpenSettingsContent(boolean r33, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.OpenSettingsContent(boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[PHI: r1
  0x01d4: PHI (r1v3 androidx.compose.runtime.Composer) = (r1v2 androidx.compose.runtime.Composer), (r1v7 androidx.compose.runtime.Composer) binds: [B:51:0x01d0, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[PHI: r1
  0x001f: PHI (r1v6 androidx.compose.runtime.Composer) = (r1v2 androidx.compose.runtime.Composer), (r1v7 androidx.compose.runtime.Composer) binds: [B:51:0x01d0, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TwoVectorsOverlayImage(int r19, int r20, androidx.compose.runtime.Composer r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.TwoVectorsOverlayImage(int, int, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.runtime.Composer r9, int r10) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b = r0
            int r1 = r1 % r3
            r2 = 1923883930(0x72ac239a, float:6.819131E30)
            if (r1 != 0) goto L7e
            androidx.compose.runtime.Composer r7 = r9.startRestartGroup(r2)
            if (r10 != 0) goto L2c
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L74
            boolean r1 = r7.getSkipping()
            r0 = 44
            int r0 = r0 / 0
            if (r1 != 0) goto L7a
        L2c:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L41
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionOpenSettingsBlockContentLight (PermissionOpenSettingsScreenNew.kt:138)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r1, r0)
        L41:
            com.incode.welcome_sdk.commons.theme.h r4 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r5 = com.incode.welcome_sdk.DisplayMode.LIGHT
            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt.f16640e
            kotlin.jvm.functions.Function2 r6 = r0.m8521getLambda1$onboard_release()
            r8 = 438(0x1b6, float:6.14E-43)
            r9 = 0
            r4.d(r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L63
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c = r0
            int r1 = r1 % r3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L63:
            androidx.compose.runtime.ScopeUpdateScope r1 = r7.endRestartGroup()
            if (r1 == 0) goto L73
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt$j r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt$j
            r0.<init>(r10)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L73:
            return
        L74:
            boolean r0 = r7.getSkipping()
            if (r0 == 0) goto L2c
        L7a:
            r7.skipToGroupEnd()
            goto L63
        L7e:
            r9.startRestartGroup(r2)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.a(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(androidx.compose.runtime.Composer r6, int r7) {
        /*
            r3 = 2
            int r0 = r3 % r3
            r2 = -1047409098(0xffffffffc191ce36, float:-18.225689)
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            if (r7 != 0) goto L31
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L60
            boolean r0 = r4.getSkipping()
            if (r0 == 0) goto L31
            r4.skipToGroupEnd()
        L20:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L30
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt$a r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt$a
            r0.<init>(r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L30:
            return
        L31:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L46
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionOpenSettingsBlockContentDark (PermissionOpenSettingsScreenNew.kt:146)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r1, r0)
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16804c
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.f16803b = r0
            int r1 = r1 % r3
        L46:
            com.incode.welcome_sdk.commons.theme.h r1 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r2 = com.incode.welcome_sdk.DisplayMode.DARK
            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt.f16640e
            kotlin.jvm.functions.Function2 r3 = r0.m8522getLambda2$onboard_release()
            r5 = 438(0x1b6, float:6.14E-43)
            r6 = 0
            r1.d(r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L20
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L20
        L60:
            r4.getSkipping()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenNewKt.b(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16805b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16806e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16807a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16805b + 13;
            f16806e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16806e + 85;
            f16805b = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenNewKt.access$PreviewPermissionOpenSettingsBlockContentDark(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16807a | 1));
            int i5 = f16805b + 21;
            f16806e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(2);
            this.f16807a = i2;
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16811a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16812d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ PermissionViewModel f16814c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f16815e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16811a + 17;
            f16812d = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16811a + 125;
            f16812d = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenNewKt.PermissionOpenSettingsScreenNew(this.f16814c, this.f16813b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16815e | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(PermissionViewModel permissionViewModel, Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16814c = permissionViewModel;
            this.f16813b = function1;
            this.f16815e = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16816d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16817e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ boolean f16819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16820c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16817e + 37;
            f16816d = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 5 / 0;
            }
            int i6 = f16816d + 61;
            f16817e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16816d + 79;
            f16817e = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenNewKt.OpenSettingsContent(this.f16819b, this.f16820c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16818a | 1));
            int i5 = f16816d + 111;
            f16817e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z2, Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16819b = z2;
            this.f16820c = function1;
            this.f16818a = i2;
        }
    }

    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16824b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16825c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16826a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f16828e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16824b + 95;
            f16825c = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 21 / 0;
            }
            return unit;
        }

        private void b(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16824b + 53;
            f16825c = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenNewKt.TwoVectorsOverlayImage(this.f16826a, this.f16827d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16828e | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i2, int i3, int i4) {
            super(2);
            this.f16826a = i2;
            this.f16827d = i3;
            this.f16828e = i4;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16829b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16830c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f16831a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16830c + 35;
            f16829b = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 81 / 0;
            }
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16829b + 81;
            f16830c = i3 % 128;
            PermissionOpenSettingsScreenNewKt.access$PreviewPermissionOpenSettingsBlockContentLight(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f16831a : this.f16831a | 1));
            int i4 = f16829b + 55;
            f16830c = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(2);
            this.f16831a = i2;
        }
    }
}
