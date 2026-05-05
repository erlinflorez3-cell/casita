package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$PermissionLearnMoreScreenKt {

    /* JADX INFO: renamed from: e */
    private static int f16547e = 0;

    /* JADX INFO: renamed from: f */
    private static int f16548f = 0;

    /* JADX INFO: renamed from: i */
    private static int f16549i = 1;

    /* JADX INFO: renamed from: j */
    private static int f16550j = 1;

    /* JADX INFO: renamed from: b */
    public static final ComposableSingletons$PermissionLearnMoreScreenKt f16544b = new ComposableSingletons$PermissionLearnMoreScreenKt();

    /* JADX INFO: renamed from: d */
    private static Function3<RowScope, Composer, Integer, Unit> f16546d = ComposableLambdaKt.composableLambdaInstance(1634730343, false, e.f16575e);

    /* JADX INFO: renamed from: a */
    private static Function2<Composer, Integer, Unit> f16543a = ComposableLambdaKt.composableLambdaInstance(-372766244, false, d.f16561a);

    /* JADX INFO: renamed from: c */
    private static Function2<Composer, Integer, Unit> f16545c = ComposableLambdaKt.composableLambdaInstance(1679785592, false, a.f16555e);

    static final class e extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16571a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16572b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16573c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16574d = 0;

        /* JADX INFO: renamed from: e */
        public static final e f16575e = new e();

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16571a + 123;
            f16573c = i3 % 128;
            int i4 = i3 % 2;
            b(rowScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16573c + 47;
            f16571a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(androidx.compose.foundation.layout.RowScope r31, androidx.compose.runtime.Composer r32, int r33) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt.e.b(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
        }

        static {
            int i2 = f16572b + 37;
            f16574d = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(3);
        }
    }

    static {
        int i2 = f16549i + 51;
        f16548f = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        public static final d f16561a = new d();

        /* JADX INFO: renamed from: b */
        private static int f16562b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16563c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16564d = 1;

        /* JADX INFO: renamed from: e */
        private static int f16565e = 0;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt$d$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16566a = 0;

            /* JADX INFO: renamed from: b */
            private static int f16567b = 1;

            /* JADX INFO: renamed from: c */
            public static final AnonymousClass3 f16568c = ;

            /* JADX INFO: renamed from: d */
            private static int f16569d = 0;

            /* JADX INFO: renamed from: e */
            private static int f16570e = 1;

            private static void c(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16566a + 43;
                f16570e = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                } else {
                    Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16566a + 37;
                f16570e = i3 % 128;
                int i4 = i3 % 2;
                c(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                int i5 = f16566a + 105;
                f16570e = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f16567b + 115;
                f16569d = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16564d + 61;
            f16565e = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16564d + 125;
            f16565e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f16564d + 9;
            f16565e = i4 % 128;
            if (i4 % 2 == 0 ? (i2 & 11) == 2 : (i2 & 105) == 3) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f16565e + 15;
                f16564d = i5 % 128;
                int i6 = i5 % 2;
                ComposerKt.traceEventStart(-372766244, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt.lambda-2.<anonymous> (PermissionLearnMoreScreen.kt:136)");
                if (i6 == 0) {
                    throw null;
                }
            }
            PermissionLearnMoreScreenKt.PermissionLearnMoreScreen(AnonymousClass3.f16568c, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                int i7 = f16564d + 97;
                f16565e = i7 % 128;
                int i8 = i7 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        static {
            int i2 = f16562b + 87;
            f16563c = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(2);
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16551a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16552b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16553c = 0;

        /* JADX INFO: renamed from: d */
        private static int f16554d = 0;

        /* JADX INFO: renamed from: e */
        public static final a f16555e = new a();

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt$a$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16556a = 0;

            /* JADX INFO: renamed from: b */
            private static int f16557b = 1;

            /* JADX INFO: renamed from: c */
            private static int f16558c = 1;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass3 f16559d = ;

            /* JADX INFO: renamed from: e */
            private static int f16560e = 0;

            private static void e(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16557b + 15;
                f16556a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                int i5 = f16557b + 105;
                f16556a = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16556a + 15;
                f16557b = i3 % 128;
                int i4 = i3 % 2;
                e(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f16560e + 23;
                f16558c = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16551a + 63;
            f16553c = i3 % 128;
            int i4 = i3 % 2;
            d(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16551a + 115;
            f16553c = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void d(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f16553c + 55;
                f16551a = i4 % 128;
                if (i4 % 2 != 0) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                } else {
                    composer.getSkipping();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f16553c + 93;
                f16551a = i5 % 128;
                int i6 = i5 % 2;
                ComposerKt.traceEventStart(1679785592, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenKt.lambda-3.<anonymous> (PermissionLearnMoreScreen.kt:144)");
            }
            PermissionLearnMoreScreenKt.PermissionLearnMoreScreen(AnonymousClass3.f16559d, composer, 6);
            if (!ComposerKt.isTraceInProgress()) {
                return;
            }
            ComposerKt.traceEventEnd();
        }

        static {
            int i2 = f16552b + 9;
            f16554d = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
        }

        a() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-3$onboard_release */
    public final Function2<Composer, Integer, Unit> m8515getLambda3$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16550j + 83;
        f16547e = i3 % 128;
        int i4 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f16545c;
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        return function2;
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release */
    public final Function2<Composer, Integer, Unit> m8514getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16547e + 71;
        int i4 = i3 % 128;
        f16550j = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<Composer, Integer, Unit> function2 = f16543a;
        int i5 = i4 + 83;
        f16547e = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release */
    public final Function3<RowScope, Composer, Integer, Unit> m8513getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16550j + 83;
        f16547e = i3 % 128;
        if (i3 % 2 == 0) {
            return f16546d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
