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
public final class ComposableSingletons$PermissionOpenSettingsScreenNewKt {

    /* JADX INFO: renamed from: a */
    private static int f16636a = 1;

    /* JADX INFO: renamed from: c */
    private static int f16638c = 0;

    /* JADX INFO: renamed from: g */
    private static int f16641g = 0;

    /* JADX INFO: renamed from: j */
    private static int f16642j = 1;

    /* JADX INFO: renamed from: e */
    public static final ComposableSingletons$PermissionOpenSettingsScreenNewKt f16640e = new ComposableSingletons$PermissionOpenSettingsScreenNewKt();

    /* JADX INFO: renamed from: d */
    private static Function2<Composer, Integer, Unit> f16639d = ComposableLambdaKt.composableLambdaInstance(-568331407, false, a.f16647e);

    /* JADX INFO: renamed from: b */
    private static Function2<Composer, Integer, Unit> f16637b = ComposableLambdaKt.composableLambdaInstance(-989255809, false, c.f16656d);

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16643a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16644b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16645c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16646d = 0;

        /* JADX INFO: renamed from: e */
        public static final a f16647e = new a();

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt$a$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16648a = 1;

            /* JADX INFO: renamed from: b */
            private static int f16649b = 1;

            /* JADX INFO: renamed from: c */
            private static int f16650c = 0;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass5 f16651d = ;

            /* JADX INFO: renamed from: e */
            private static int f16652e = 0;

            private static void c(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16649b + 105;
                f16652e = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                int i5 = f16649b + 77;
                f16652e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16652e + 55;
                f16649b = i3 % 128;
                int i4 = i3 % 2;
                c(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    int i5 = 30 / 0;
                }
                return unit;
            }

            static {
                int i2 = f16648a + 47;
                f16650c = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass5() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16643a + 123;
            f16644b = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16644b + 57;
            f16643a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f16643a + 103;
            f16644b = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-568331407, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt.lambda-1.<anonymous> (PermissionOpenSettingsScreenNew.kt:140)");
            }
            PermissionOpenSettingsScreenNewKt.OpenSettingsContent(true, AnonymousClass5.f16651d, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f16643a + 45;
                f16644b = i6 % 128;
                if (i6 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
            }
        }

        static {
            int i2 = f16645c + 117;
            f16646d = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(2);
        }
    }

    static {
        int i2 = f16641g + 51;
        f16642j = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16653a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16654b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16655c = 1;

        /* JADX INFO: renamed from: d */
        public static final c f16656d = new c();

        /* JADX INFO: renamed from: e */
        private static int f16657e = 0;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt$c$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<PermissionOnboardingEvent, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f16658a = 1;

            /* JADX INFO: renamed from: b */
            private static int f16659b = 0;

            /* JADX INFO: renamed from: c */
            private static int f16660c = 1;

            /* JADX INFO: renamed from: d */
            private static int f16661d = 0;

            /* JADX INFO: renamed from: e */
            public static final AnonymousClass5 f16662e = ;

            private static void c(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16661d + 65;
                f16658a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                int i5 = f16661d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16658a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                int i2 = 2 % 2;
                int i3 = f16658a + 41;
                f16661d = i3 % 128;
                int i4 = i3 % 2;
                c(permissionOnboardingEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f16659b + 15;
                f16660c = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass5() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16657e + 13;
            f16655c = i3 % 128;
            int i4 = i3 % 2;
            e(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void e(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f16657e + 9;
            f16655c = i4 % 128;
            if (i4 % 2 != 0 ? (i2 & 11) == 2 : (i2 & 33) == 4) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i5 = f16655c + 81;
                    f16657e = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-989255809, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionOpenSettingsScreenNewKt.lambda-2.<anonymous> (PermissionOpenSettingsScreenNew.kt:148)");
                int i7 = f16657e + 49;
                f16655c = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 3;
                }
            }
            PermissionOpenSettingsScreenNewKt.OpenSettingsContent(true, AnonymousClass5.f16662e, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i9 = f16657e + 5;
                f16655c = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }
        }

        static {
            int i2 = f16654b + 19;
            f16653a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 36 / 0;
            }
        }

        c() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release */
    public final Function2<Composer, Integer, Unit> m8522getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16638c + 31;
        f16636a = i3 % 128;
        if (i3 % 2 != 0) {
            return f16637b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release */
    public final Function2<Composer, Integer, Unit> m8521getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16638c + 85;
        int i4 = i3 % 128;
        f16636a = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f16639d;
        int i6 = i4 + 113;
        f16638c = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }
}
