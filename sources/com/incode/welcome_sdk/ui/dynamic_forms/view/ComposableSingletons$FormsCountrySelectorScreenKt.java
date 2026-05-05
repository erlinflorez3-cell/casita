package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ClearKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException;
import com.incode.welcome_sdk.commons.theme.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$FormsCountrySelectorScreenKt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13425g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13426h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13427i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13428j = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComposableSingletons$FormsCountrySelectorScreenKt f13424e = new ComposableSingletons$FormsCountrySelectorScreenKt();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f13423d = ComposableLambdaKt.composableLambdaInstance(-686287933, false, d.f13446c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f13421b = ComposableLambdaKt.composableLambdaInstance(2133812597, false, c.f13443e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f13420a = ComposableLambdaKt.composableLambdaInstance(-312764741, false, a.f13430b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f13422c = ComposableLambdaKt.composableLambdaInstance(1580995968, false, b.f13435b);

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13444a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13445b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f13446c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13447d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13448e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13444a + 25;
            f13447d = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13447d + 55;
            f13444a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f13447d + 69;
            f13444a = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 11) == 2 && !(!composer.getSkipping())) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13444a + 111;
                f13447d = i6 % 128;
                if (i6 % 2 != 0) {
                    ComposerKt.traceEventStart(-686287933, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.lambda-1.<anonymous> (FormsCountrySelectorScreen.kt:150)");
                    throw null;
                }
                ComposerKt.traceEventStart(-686287933, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.lambda-1.<anonymous> (FormsCountrySelectorScreen.kt:150)");
                int i7 = f13444a + 37;
                f13447d = i7 % 128;
                int i8 = i7 % 2;
            }
            ImageVector clear = ClearKt.getClear(Icons.INSTANCE.getDefault());
            g.b bVar = g.b.f5657e;
            IconKt.m2168Iconww6aTOc(clear, "", (Modifier) null, ((Long) g.b.c(CompareOcrException.e(), new Object[0], CompareOcrException.e(), CompareOcrException.e(), 547854677, CompareOcrException.e(), -547854676)).longValue(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                int i9 = f13447d + 55;
                f13444a = i9 % 128;
                if (i9 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
                ComposerKt.traceEventEnd();
                int i10 = f13447d + 73;
                f13444a = i10 % 128;
                int i11 = i10 % 2;
            }
        }

        static {
            int i2 = f13445b + 73;
            f13448e = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(2);
        }
    }

    static {
        int i2 = f13427i + 69;
        f13425g = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13439a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13440b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13441c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13442d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f13443e = new c();

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13442d + 101;
            f13441c = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13442d + 49;
            f13441c = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void a(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f13442d + 47;
            int i5 = i4 % 128;
            f13441c = i5;
            Object obj = null;
            if (i4 % 2 == 0 ? (i2 & 11) == 2 : (i2 & 77) == 2) {
                int i6 = i5 + 21;
                f13442d = i6 % 128;
                if (i6 % 2 == 0) {
                    composer.getSkipping();
                    obj.hashCode();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133812597, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.lambda-2.<anonymous> (FormsCountrySelectorScreen.kt:234)");
            }
            String strStringResource = StringResources_androidKt.stringResource(R.string.onboard_sdk_dynamic_forms_country_selector_hint, composer, 0);
            g.d dVar = g.d.f5677e;
            TextStyle textStyleA = g.d.a();
            g.b bVar = g.b.f5657e;
            TextKt.m2711Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6136copyp1EtxEg$default(textStyleA, g.b.h(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                int i7 = f13442d + 59;
                f13441c = i7 % 128;
                if (i7 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
            }
        }

        static {
            int i2 = f13439a + 63;
            f13440b = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(2);
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13429a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13430b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13431c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13432d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13433e = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13431c + 5;
            f13433e = i3 % 128;
            int i4 = i3 % 2;
            e(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 48 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(androidx.compose.runtime.Composer r15, int r16) {
            /*
                r1 = 2
                int r0 = r1 % r1
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13433e
                int r2 = r0 + 15
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13431c = r0
                int r2 = r2 % r1
                r4 = r16
                r14 = r15
                if (r2 != 0) goto L77
                r2 = r4 & 65
                r0 = 4
                if (r2 != r0) goto L1c
            L16:
                boolean r0 = r14.getSkipping()
                if (r0 != 0) goto L7c
            L1c:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L34
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13433e
                int r2 = r0 + 121
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13431c = r0
                int r2 = r2 % r1
                r3 = -1
                java.lang.String r2 = "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.lambda-3.<anonymous> (FormsCountrySelectorScreen.kt:247)"
                r0 = -312764741(0xffffffffed5b96bb, float:-4.247465E27)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r3, r2)
            L34:
                androidx.compose.material.icons.Icons r0 = androidx.compose.material.icons.Icons.INSTANCE
                androidx.compose.material.icons.Icons$Filled r0 = r0.getDefault()
                androidx.compose.ui.graphics.vector.ImageVector r9 = androidx.compose.material.icons.filled.ClearKt.getClear(r0)
                com.incode.welcome_sdk.commons.theme.g$b r0 = com.incode.welcome_sdk.commons.theme.g.b.f5657e
                r0 = 0
                java.lang.Object[] r3 = new java.lang.Object[r0]
                int r4 = com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException.e()
                int r7 = com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException.e()
                int r2 = com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException.e()
                int r5 = com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException.e()
                r6 = 547854677(0x20a79955, float:2.8392367E-19)
                r8 = -547854676(0xffffffffdf5866ac, float:-1.559334E19)
                java.lang.Object r0 = com.incode.welcome_sdk.commons.theme.g.b.c(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Long r0 = (java.lang.Long) r0
                long r12 = r0.longValue()
                r15 = 3120(0xc30, float:4.372E-42)
                r16 = 4
                java.lang.String r10 = ""
                r11 = 0
                androidx.compose.material3.IconKt.m2168Iconww6aTOc(r9, r10, r11, r12, r14, r15, r16)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L7f
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                return
            L77:
                r0 = r4 & 11
                if (r0 != r1) goto L1c
                goto L16
            L7c:
                r14.skipToGroupEnd()
            L7f:
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13431c
                int r2 = r0 + 111
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.f13433e = r0
                int r2 = r2 % r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.a.e(androidx.compose.runtime.Composer, int):void");
        }

        static {
            int i2 = f13429a + 33;
            f13432d = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        a() {
            super(2);
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13434a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13435b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13436c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13437d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13438e = 0;

        private static void a(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                int i4 = f13438e + 123;
                f13434a = i4 % 128;
                int i5 = i4 % 2;
                ComposerKt.traceEventStart(1580995968, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsCountrySelectorScreenKt.lambda-4.<anonymous> (FormsCountrySelectorScreen.kt:255)");
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13434a + 79;
                f13438e = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
                if (i7 != 0) {
                    int i8 = 36 / 0;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13438e + 31;
            f13434a = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13434a + 53;
            f13438e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13436c + 15;
            f13437d = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-4$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8452getLambda4$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13428j + 47;
        int i4 = i3 % 128;
        f13426h = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f13422c;
        int i6 = i4 + 97;
        f13428j = i6 % 128;
        if (i6 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-3$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8451getLambda3$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13428j + 57;
        f13426h = i3 % 128;
        if (i3 % 2 == 0) {
            return f13420a;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8450getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13426h;
        int i4 = i3 + 63;
        f13428j = i4 % 128;
        int i5 = i4 % 2;
        Function2<Composer, Integer, Unit> function2 = f13421b;
        int i6 = i3 + 69;
        f13428j = i6 % 128;
        if (i6 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8449getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13428j;
        int i4 = i3 + 83;
        f13426h = i4 % 128;
        int i5 = i4 % 2;
        Function2<Composer, Integer, Unit> function2 = f13423d;
        int i6 = i3 + 29;
        f13426h = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }
}
