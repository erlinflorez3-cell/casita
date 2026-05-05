package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$PermissionBottomSheetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16527a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16530d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16531e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16532h = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComposableSingletons$PermissionBottomSheetKt f16529c = new ComposableSingletons$PermissionBottomSheetKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f16528b = ComposableLambdaKt.composableLambdaInstance(49355915, false, c.f16534b);

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16533a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f16534b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16535c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16536d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16537e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16533a + 23;
            f16535c = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16533a + 99;
            f16535c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(androidx.compose.runtime.Composer r4, int r5) {
            /*
                r3 = 2
                int r0 = r3 % r3
                r0 = r5 & 11
                if (r0 != r3) goto L1c
                int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16533a
                int r1 = r0 + 97
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16535c = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L46
                boolean r1 = r4.getSkipping()
                r0 = 43
                int r0 = r0 / 0
                if (r1 != 0) goto L4d
            L1c:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L2b
                r2 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.lambda-1.<anonymous> (PermissionBottomSheet.kt:118)"
                r0 = 49355915(0x2f11c8b, float:3.542815E-37)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r2, r1)
            L2b:
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt$c$3 r1 = new kotlin.jvm.functions.Function1<com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit>() { // from class: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons.PermissionBottomSheetKt.c.3

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f16538a = 1;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f16539b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f16540c = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f16541d = 1;

                    private static void e(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r3) {
                        /*
                            r2 = 2
                            int r0 = r2 % r2
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16539b
                            int r1 = r0 + 47
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16541d = r0
                            int r1 = r1 % r2
                            java.lang.String r0 = ""
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16539b
                            int r1 = r0 + 89
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16541d = r0
                            int r1 = r1 % r2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.e(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent):void");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r4) {
                        /*
                            r3 = this;
                            r1 = 2
                            int r0 = r1 % r1
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16541d
                            int r2 = r0 + 27
                            int r0 = r2 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16539b = r0
                            int r2 = r2 % r1
                            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r4 = (com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent) r4
                            e(r4)
                            kotlin.Unit r1 = kotlin.Unit.INSTANCE
                            if (r2 == 0) goto L19
                            r0 = 60
                            int r0 = r0 / 0
                        L19:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.invoke(java.lang.Object):java.lang.Object");
                    }

                    static {
                        /*
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt$c$3 r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt$c$3
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt$c$3) com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons.PermissionBottomSheetKt.c.3.e com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt$c$3
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16538a
                            int r1 = r0 + 113
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.f16540c = r0
                            int r0 = r1 % 2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.AnonymousClass3.<init>():void");
                    }
                }
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r0 = 6
                com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionBottomSheetKt.access$BottomSheetContent(r1, r4, r0)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L50
                int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16533a
                int r1 = r0 + 3
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16535c = r0
                int r1 = r1 % r3
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                return
            L46:
                boolean r0 = r4.getSkipping()
                if (r0 != 0) goto L4d
                goto L1c
            L4d:
                r4.skipToGroupEnd()
            L50:
                int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16533a
                int r1 = r0 + 67
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.f16535c = r0
                int r1 = r1 % r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionBottomSheetKt.c.a(androidx.compose.runtime.Composer, int):void");
        }

        static {
            int i2 = f16536d + 35;
            f16537e = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(2);
        }
    }

    static {
        int i2 = f16532h + 29;
        f16530d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8512getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16531e + 31;
        int i4 = i3 % 128;
        f16527a = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f16528b;
        int i6 = i4 + 69;
        f16531e = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }
}
