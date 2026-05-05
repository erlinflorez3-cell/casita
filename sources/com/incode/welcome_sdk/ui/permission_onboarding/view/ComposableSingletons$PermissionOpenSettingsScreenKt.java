package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$PermissionOpenSettingsScreenKt {

    /* JADX INFO: renamed from: c */
    private static int f16611c = 1;

    /* JADX INFO: renamed from: e */
    private static int f16613e = 0;

    /* JADX INFO: renamed from: i */
    private static int f16614i = 0;

    /* JADX INFO: renamed from: j */
    private static int f16615j = 1;

    /* JADX INFO: renamed from: d */
    public static final ComposableSingletons$PermissionOpenSettingsScreenKt f16612d = new ComposableSingletons$PermissionOpenSettingsScreenKt();

    /* JADX INFO: renamed from: b */
    private static Function2<Composer, Integer, Unit> f16610b = ComposableLambdaKt.composableLambdaInstance(-1634291574, false, c.f16628c);

    /* JADX INFO: renamed from: a */
    private static Function2<Composer, Integer, Unit> f16609a = ComposableLambdaKt.composableLambdaInstance(1621683074, false, b.f16620e);

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16626a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16627b = 1;

        /* JADX INFO: renamed from: c */
        public static final c f16628c = new c();

        /* JADX INFO: renamed from: d */
        private static int f16629d = 1;

        /* JADX INFO: renamed from: e */
        private static int f16630e = 0;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt$c$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16631a = 0;

            /* JADX INFO: renamed from: b */
            private static int f16632b = 1;

            /* JADX INFO: renamed from: c */
            private static int f16633c = 1;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass3 f16634d = ;

            /* JADX INFO: renamed from: e */
            private static int f16635e = 0;

            private static void d(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16632b + 79;
                f16631a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                int i5 = f16632b + 79;
                f16631a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16632b + 117;
                f16631a = i3 % 128;
                int i4 = i3 % 2;
                d(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f16635e + 15;
                f16633c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 38 / 0;
                }
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16627b + 89;
            f16630e = i3 % 128;
            int i4 = i3 % 2;
            d(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16627b + 57;
            f16630e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void d(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f16627b + 115;
                f16630e = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f16630e + 99;
                f16627b = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventStart(-1634291574, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt.lambda-1.<anonymous> (PermissionOpenSettingsScreen.kt:75)");
            }
            PermissionOpenSettingsScreenKt.PermissionOpenSettingsScreen(AnonymousClass3.f16634d, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i8 = f16627b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16630e = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        static {
            int i2 = f16629d + 39;
            f16626a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        c() {
            super(2);
        }
    }

    static {
        int i2 = f16615j + 67;
        f16614i = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16616a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16617b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16618c = 0;

        /* JADX INFO: renamed from: d */
        private static int f16619d = 1;

        /* JADX INFO: renamed from: e */
        public static final b f16620e = new b();

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt$b$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16621a = 1;

            /* JADX INFO: renamed from: b */
            private static int f16622b = 0;

            /* JADX INFO: renamed from: c */
            private static int f16623c = 0;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass3 f16624d = ;

            /* JADX INFO: renamed from: e */
            private static int f16625e = 1;

            private static void c(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16623c + 63;
                f16621a = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                int i4 = f16621a + 15;
                f16623c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 81 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16623c + 17;
                f16621a = i3 % 128;
                int i4 = i3 % 2;
                c(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                int i5 = f16623c + 95;
                f16621a = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f16622b + 41;
                f16625e = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16619d + 59;
            f16618c = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private static void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f16619d + 5;
                f16618c = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621683074, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenKt.lambda-2.<anonymous> (PermissionOpenSettingsScreen.kt:83)");
            }
            PermissionOpenSettingsScreenKt.PermissionOpenSettingsScreen(AnonymousClass3.f16624d, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i6 = f16619d + 55;
                f16618c = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 79 / 0;
                }
            }
        }

        static {
            int i2 = f16616a + 89;
            f16617b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release */
    public final Function2<Composer, Integer, Unit> m8520getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16613e;
        int i4 = i3 + 99;
        f16611c = i4 % 128;
        int i5 = i4 % 2;
        Function2<Composer, Integer, Unit> function2 = f16609a;
        int i6 = i3 + 9;
        f16611c = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release */
    public final Function2<Composer, Integer, Unit> m8519getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16611c;
        int i4 = i3 + 27;
        f16613e = i4 % 128;
        int i5 = i4 % 2;
        Function2<Composer, Integer, Unit> function2 = f16610b;
        int i6 = i3 + 105;
        f16613e = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }
}
