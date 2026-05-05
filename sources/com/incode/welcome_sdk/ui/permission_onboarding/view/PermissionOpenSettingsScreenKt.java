package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionOpenSettingsScreenKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16788c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16789d = 1;

    public static final /* synthetic */ void access$PreviewPermissionOpenSettingsContentDark(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16788c + 29;
        f16789d = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        int i6 = f16789d + 121;
        f16788c = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewPermissionOpenSettingsContentLight(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16788c + 73;
        f16789d = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        int i6 = f16788c + 39;
        f16789d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16800a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16801e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16802c;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f16800a + 7;
            f16801e = i3 % 128;
            int i4 = i3 % 2;
            this.f16802c.invoke(PermissionOnboardingEvent.OnOpenSystemSettingsClicked.f16519b);
            int i5 = f16801e + 115;
            f16800a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16800a + 21;
            f16801e = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f16801e + 45;
            f16800a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16802c = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PermissionOpenSettingsScreen(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.PermissionOpenSettingsScreen(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final void b(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16789d + 115;
        f16788c = i4 % 128;
        int i5 = i4 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-509208141);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-509208141, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionOpenSettingsContentLight (PermissionOpenSettingsScreen.kt:73)");
            }
            h.f5694b.d(DisplayMode.LIGHT, ComposableSingletons$PermissionOpenSettingsScreenKt.f16612d.m8519getLambda1$onboard_release(), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f16788c + 11;
                f16789d = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
                int i8 = f16789d + 37;
                f16788c = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 3;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r4
  0x001b: PHI (r4v3 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v4 androidx.compose.runtime.Composer) binds: [B:20:0x0071, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[PHI: r4
  0x0021: PHI (r4v1 androidx.compose.runtime.Composer) = 
  (r4v0 androidx.compose.runtime.Composer)
  (r4v3 androidx.compose.runtime.Composer)
  (r4v4 androidx.compose.runtime.Composer)
 binds: [B:20:0x0071, B:7:0x001f, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r6, int r7) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16789d
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16788c = r0
            int r1 = r1 % r3
            r2 = -1528612551(0xffffffffa4e33939, float:-9.8542496E-17)
            if (r1 == 0) goto L6d
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            r0 = 63
            int r0 = r0 / 0
            if (r7 != 0) goto L21
        L1b:
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L69
        L21:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L3f
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16789d
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16788c = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewPermissionOpenSettingsContentDark (PermissionOpenSettingsScreen.kt:81)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r1, r0)
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16788c
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.f16789d = r0
            int r1 = r1 % r3
        L3f:
            com.incode.welcome_sdk.commons.theme.h r1 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.DisplayMode r2 = com.incode.welcome_sdk.DisplayMode.DARK
            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt.f16612d
            kotlin.jvm.functions.Function2 r3 = r0.m8520getLambda2$onboard_release()
            r5 = 438(0x1b6, float:6.14E-43)
            r6 = 0
            r1.d(r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L58
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L58:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L68
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt$a r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt$a
            r0.<init>(r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L68:
            return
        L69:
            r4.skipToGroupEnd()
            goto L58
        L6d:
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            if (r7 != 0) goto L21
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOpenSettingsScreenKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16790a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16791d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f16792b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16790a + 123;
            f16791d = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16791d + 109;
            f16790a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16791d + 41;
            f16790a = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenKt.access$PreviewPermissionOpenSettingsContentDark(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16792b | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(2);
            this.f16792b = i2;
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16793b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16794e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16795d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16794e + 101;
            f16793b = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16793b + 67;
            f16794e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16794e + 33;
            f16793b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f16795d;
            if (i4 != 0) {
                i5 |= 1;
            }
            PermissionOpenSettingsScreenKt.access$PreviewPermissionOpenSettingsContentLight(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(2);
            this.f16795d = i2;
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16796a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16797d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f16798b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16799e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16797d + 117;
            f16796a = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16797d + 17;
            f16796a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16796a + 73;
            f16797d = i3 % 128;
            int i4 = i3 % 2;
            PermissionOpenSettingsScreenKt.PermissionOpenSettingsScreen(this.f16799e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16798b | 1));
            int i5 = f16796a + 21;
            f16797d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16799e = function1;
            this.f16798b = i2;
        }
    }
}
