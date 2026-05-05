package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.commons.theme.j;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$PermissionLearnMoreScreenNewKt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16580e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f16581f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16582h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f16583i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ComposableSingletons$PermissionLearnMoreScreenNewKt f16579d = new ComposableSingletons$PermissionLearnMoreScreenNewKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function3<RowScope, Composer, Integer, Unit> f16577b = ComposableLambdaKt.composableLambdaInstance(-624320440, false, a.f16587d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f16578c = ComposableLambdaKt.composableLambdaInstance(-1677986126, false, d.f16602d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f16576a = ComposableLambdaKt.composableLambdaInstance(-1555633002, false, c.f16590b);

    static final class a extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16584a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16585b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16586c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f16587d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16588e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16585b + 81;
            f16586c = i3 % 128;
            int i4 = i3 % 2;
            a(rowScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16586c + 17;
            f16585b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(RowScope rowScope, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f16585b + 113;
            f16586c = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 81) == 16) {
                int i6 = f16586c + 3;
                f16585b = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i8 = f16586c + 17;
                    f16585b = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 / 4;
                        return;
                    }
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-624320440, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.lambda-1.<anonymous> (PermissionLearnMoreScreenNew.kt:119)");
            }
            h hVar = h.f5694b;
            TextStyle textStyle = (TextStyle) j.c(1047502806, new Object[]{h.d(composer)}, BaseView.DefaultImpls.e(), -1047502804, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
            h hVar2 = h.f5694b;
            TextKt.m2711Text4IGK_g(StringResources_androidKt.stringResource(R.string.onboard_sdk_permission_quit, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(textStyle, h.a(composer).m8066getTextBodyPrimary0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                int i10 = f16586c + 107;
                f16585b = i10 % 128;
                if (i10 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    int i11 = 99 / 0;
                }
            }
        }

        static {
            int i2 = f16584a + 95;
            f16588e = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        a() {
            super(3);
        }
    }

    static {
        int i2 = f16582h + 103;
        f16583i = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16599a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16600b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16601c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f16602d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16603e = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16601c + 71;
            f16603e = i3 % 128;
            int i4 = i3 % 2;
            c(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16601c + 11;
            f16603e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void c(Composer composer, int i2) throws Throwable {
            int i3 = 2 % 2;
            int i4 = f16601c;
            int i5 = i4 + 81;
            f16603e = i5 % 128;
            if (i5 % 2 == 0 ? (i2 & 11) == 2 : (i2 & 25) == 2) {
                int i6 = i4 + 83;
                f16603e = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1677986126, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.lambda-2.<anonymous> (PermissionLearnMoreScreenNew.kt:165)");
            }
            PermissionLearnMoreScreenNewKt.access$PermissionLearnMoreContent(true, new Function1<PermissionOnboardingEvent, Unit>() { // from class: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons.PermissionLearnMoreScreenNewKt.d.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f16604a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f16605b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f16606c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f16608e = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
                    int i8 = 2 % 2;
                    int i9 = f16604a + 69;
                    f16606c = i9 % 128;
                    int i10 = i9 % 2;
                    c(permissionOnboardingEvent);
                    Unit unit = Unit.INSTANCE;
                    if (i10 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static void c(PermissionOnboardingEvent permissionOnboardingEvent) {
                    int i8 = 2 % 2;
                    int i9 = f16606c + 29;
                    f16604a = i9 % 128;
                    int i10 = i9 % 2;
                    Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                    int i11 = f16606c + 39;
                    f16604a = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 97 / 0;
                    }
                }

                static {
                    int i8 = f16608e + 53;
                    f16605b = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 49 / 0;
                    }
                }
            }, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i8 = f16601c + 109;
                f16603e = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i2 = f16599a + 35;
            f16600b = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(2);
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16589a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f16590b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16591c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16592d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16593e = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f16591c + 81;
            f16592d = i3 % 128;
            int i4 = i3 % 2;
            c(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f16591c + 69;
            f16592d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r4.getSkipping() == false) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            r4.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r4.getSkipping() == false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(androidx.compose.runtime.Composer r4, int r5) throws java.lang.Throwable {
            /*
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.f16591c
                int r0 = r0 + 21
                int r1 = r0 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.f16592d = r1
                int r0 = r0 % r2
                r0 = r5 & 11
                if (r0 != r2) goto L23
                int r1 = r1 + 51
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.f16591c = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L51
                boolean r1 = r4.getSkipping()
                r0 = 95
                int r0 = r0 / 0
                if (r1 != 0) goto L58
            L23:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L3d
                int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.f16592d
                int r3 = r0 + 5
                int r0 = r3 % 128
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.f16591c = r0
                int r3 = r3 % r2
                java.lang.String r2 = "com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.lambda-3.<anonymous> (PermissionLearnMoreScreenNew.kt:176)"
                r1 = -1
                r0 = -1555633002(0xffffffffa346ec96, float:-1.07837005E-17)
                if (r3 != 0) goto L5c
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r1, r2)
            L3d:
                com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt$c$2 r2 = new kotlin.jvm.functions.Function1<com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit>() { // from class: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons.PermissionLearnMoreScreenNewKt.c.2

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f16594a = 1;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f16595b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f16596c = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f16598e = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r4) {
                        /*
                            r3 = this;
                            r2 = 2
                            int r0 = r2 % r2
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16595b
                            int r1 = r0 + 83
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16598e = r0
                            int r1 = r1 % r2
                            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r4 = (com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent) r4
                            e(r4)
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            if (r1 == 0) goto L16
                            return r0
                        L16:
                            r0 = 0
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.invoke(java.lang.Object):java.lang.Object");
                    }

                    private static void e(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r3) {
                        /*
                            r2 = 2
                            int r0 = r2 % r2
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16598e
                            int r1 = r0 + 43
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16595b = r0
                            int r1 = r1 % r2
                            java.lang.String r0 = ""
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16595b
                            int r1 = r0 + 63
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16598e = r0
                            int r1 = r1 % r2
                            if (r1 == 0) goto L1d
                            return
                        L1d:
                            r0 = 0
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.e(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent):void");
                    }

                    static {
                        /*
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt$c$2 r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt$c$2
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt$c$2) com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons.PermissionLearnMoreScreenNewKt.c.2.d com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt$c$2
                            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16596c
                            int r1 = r0 + 21
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.f16594a = r0
                            int r0 = r1 % 2
                            if (r0 == 0) goto L14
                            return
                        L14:
                            r0 = 0
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.AnonymousClass2.<init>():void");
                    }
                }
                kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                r1 = 54
                r0 = 1
                com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionLearnMoreScreenNewKt.access$PermissionLearnMoreContent(r0, r2, r4, r1)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L50
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            L50:
                return
            L51:
                boolean r0 = r4.getSkipping()
                if (r0 != 0) goto L58
                goto L23
            L58:
                r4.skipToGroupEnd()
                goto L50
            L5c:
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r1, r2)
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.ComposableSingletons$PermissionLearnMoreScreenNewKt.c.c(androidx.compose.runtime.Composer, int):void");
        }

        static {
            int i2 = f16589a + 79;
            f16593e = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-3$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8518getLambda3$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16581f + 19;
        int i4 = i3 % 128;
        f16580e = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f16576a;
        int i6 = i4 + 91;
        f16581f = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8517getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16580e + 55;
        int i4 = i3 % 128;
        f16581f = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function2<Composer, Integer, Unit> function2 = f16578c;
        int i5 = i4 + 83;
        f16580e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return function2;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8516getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f16580e + 35;
        int i4 = i3 % 128;
        f16581f = i4;
        int i5 = i3 % 2;
        Function3<RowScope, Composer, Integer, Unit> function3 = f16577b;
        int i6 = i4 + 81;
        f16580e = i6 % 128;
        int i7 = i6 % 2;
        return function3;
    }
}
