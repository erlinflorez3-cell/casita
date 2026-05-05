package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.unit.Dp;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.TextInputType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsTextInputViewKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13866c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13867d = 1;

    public static final /* synthetic */ void access$Preview_FormTextInputScreen_InputCpf(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13867d + 69;
        f13866c = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f13867d + 5;
        f13866c = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$Preview_FormTextInputScreen_InputEmail(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13867d + 121;
        f13866c = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        if (i5 != 0) {
            int i6 = 19 / 0;
        }
        int i7 = f13866c + 71;
        f13867d = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$Preview_FormTextInputScreen_InputNumber(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13867d + 15;
        f13866c = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        int i6 = f13867d + 107;
        f13866c = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$Preview_FormTextInputScreen_InputText(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13866c + 3;
        f13867d = i4 % 128;
        int i5 = i4 % 2;
        a(composer, i2);
        int i6 = f13867d + 109;
        f13866c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
    }

    static final class c extends Lambda implements Function1<FocusState, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13888a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13889e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ MutableState<Boolean> f13891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsTextInputUiState f13892d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(FocusState focusState) {
            int i2 = 2 % 2;
            int i3 = f13889e + 11;
            f13888a = i3 % 128;
            int i4 = i3 % 2;
            e(focusState);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13889e + 99;
            f13888a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(androidx.compose.ui.focus.FocusState r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r1 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.c.f13888a
                r2 = 83
                int r1 = r1 + r2
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.c.f13889e = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 == 0) goto L50
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r1 = r5.isFocused()
                int r0 = r2 / 0
                if (r1 != 0) goto L42
            L1c:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.f13891c
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L42
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r4.f13890b
                com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState r0 = r4.f13892d
                java.lang.String r0 = r0.getId()
                r1.invoke(r0)
                int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.c.f13889e
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.c.f13888a = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L42
                r0 = 5
                int r0 = r0 / r3
            L42:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r4.f13891c
                boolean r0 = r5.isFocused()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.setValue(r0)
                return
            L50:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r5.isFocused()
                if (r0 != 0) goto L42
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.c.e(androidx.compose.ui.focus.FocusState):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(MutableState<Boolean> mutableState, Function1<? super String, Unit> function1, FormsTextInputUiState formsTextInputUiState) {
            super(1);
            this.f13891c = mutableState;
            this.f13890b = function1;
            this.f13892d = formsTextInputUiState;
        }
    }

    static final class b extends Lambda implements Function1<Modifier, Modifier> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13883a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13884b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13885c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13886d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13887e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Modifier invoke(Modifier modifier) {
            int i2 = 2 % 2;
            int i3 = f13887e + 95;
            f13886d = i3 % 128;
            int i4 = i3 % 2;
            Modifier modifierB = b(modifier);
            int i5 = f13887e + 31;
            f13886d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return modifierB;
        }

        private static Modifier b(Modifier modifier) {
            int i2 = 2 % 2;
            int i3 = f13887e + 65;
            f13886d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(modifier, "");
            Modifier modifierM1049height3ABfNKs = SizeKt.m1049height3ABfNKs(modifier, Dp.m6638constructorimpl(120.0f));
            int i5 = f13886d + 63;
            f13887e = i5 % 128;
            int i6 = i5 % 2;
            return modifierM1049height3ABfNKs;
        }

        static {
            int i2 = f13884b + 109;
            f13885c = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13896d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13897e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ FormsTextInputUiState f13899b;

        private void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13896d + 87;
            f13897e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.f13898a.invoke(this.f13899b.getId(), str);
            int i5 = f13897e + 85;
            f13896d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13896d + 105;
            f13897e = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 91 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super String, ? super String, Unit> function2, FormsTextInputUiState formsTextInputUiState) {
            super(1);
            this.f13898a = function2;
            this.f13899b = formsTextInputUiState;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13893c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13894e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsTextInputUiState f13895d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13893c + 81;
            f13894e = i3 % 128;
            int i4 = i3 % 2;
            e(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13894e + 113;
            f13893c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(androidx.compose.runtime.Composer r64, int r65) {
            /*
                Method dump skipped, instruction units count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.d.e(androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FormsTextInputUiState formsTextInputUiState) {
            super(2);
            this.f13895d = formsTextInputUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FormsTextInputView(final com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState r61, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, int r65) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.FormsTextInputView(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class n extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13936a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13937b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13938c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13939d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f13940e = new n();

        private static void e(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13936a + 105;
            f13939d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i5 = f13936a + 37;
            f13939d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13939d + 7;
            f13936a = i3 % 128;
            int i4 = i3 % 2;
            e(str, str2);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f13938c + 77;
            f13937b = i2 % 128;
            int i3 = i2 % 2;
        }

        n() {
            super(2);
        }
    }

    static final class r extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f13947a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13948b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13949c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13950d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13951e = 0;

        private static void a(String str) {
            int i2 = 2 % 2;
            int i3 = f13948b + 117;
            f13951e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13951e + 23;
            f13948b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13948b + 113;
            f13951e = i3 % 128;
            int i4 = i3 % 2;
            a(str);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f13950d + 47;
            f13949c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
            }
        }

        r() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r4
  0x001a: PHI (r4v3 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v4 androidx.compose.runtime.Composer) binds: [B:22:0x0081, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[PHI: r4
  0x0020: PHI (r4v1 androidx.compose.runtime.Composer) = 
  (r4v0 androidx.compose.runtime.Composer)
  (r4v3 androidx.compose.runtime.Composer)
  (r4v4 androidx.compose.runtime.Composer)
 binds: [B:22:0x0081, B:7:0x001e, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.runtime.Composer r7, int r8) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d = r0
            int r1 = r1 % r6
            r5 = 1
            r2 = -1791712623(0xffffffff9534a291, float:-3.6478953E-26)
            if (r1 != 0) goto L7d
            androidx.compose.runtime.Composer r4 = r7.startRestartGroup(r2)
            int r0 = r5 / 0
            if (r8 != 0) goto L20
        L1a:
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L70
        L20:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L2c
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormTextInputScreen_InputText (FormsTextInputView.kt:116)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r8, r1, r0)
        L2c:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState$Companion r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13370a
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState r3 = r0.previewTextData$onboard_release()
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$n r2 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.n.f13940e
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$r r1 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.r.f13947a
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 432(0x1b0, float:6.05E-43)
            FormsTextInputView(r3, r2, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r0 = r0 ^ r5
            if (r0 == r5) goto L5f
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c = r0
            int r1 = r1 % r6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L5f
            int r0 = r6 % 4
        L5f:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L6f
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$p r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$p
            r0.<init>(r8)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L6f:
            return
        L70:
            r4.skipToGroupEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d = r0
            int r1 = r1 % r6
            goto L5f
        L7d:
            androidx.compose.runtime.Composer r4 = r7.startRestartGroup(r2)
            if (r8 != 0) goto L20
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.a(androidx.compose.runtime.Composer, int):void");
    }

    static final class f extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13900a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f13901b = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13902c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13903d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13904e = 1;

        private static void d(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13903d + 25;
            f13900a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i5 = f13903d + 21;
            f13900a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13903d + 35;
            f13900a = i3 % 128;
            int i4 = i3 % 2;
            d(str, str2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13900a + 55;
            f13903d = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f13904e + 93;
            f13902c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        f() {
            super(2);
        }
    }

    static final class g extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f13905a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13906b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13907c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13908d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13909e = 0;

        private static void e(String str) {
            int i2 = 2 % 2;
            int i3 = f13908d + 79;
            f13907c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13908d + 73;
            f13907c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13908d + 17;
            f13907c = i3 % 128;
            int i4 = i3 % 2;
            e(str);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 96 / 0;
            }
            int i6 = f13907c + 97;
            f13908d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 39 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13909e + 49;
            f13906b = i2 % 128;
            int i3 = i2 % 2;
        }

        g() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(androidx.compose.runtime.Composer r7, int r8) {
        /*
            r6 = 2
            int r0 = r6 % r6
            r5 = -281522038(0xffffffffef38508a, float:-5.7042608E28)
            androidx.compose.runtime.Composer r4 = r7.startRestartGroup(r5)
            r3 = 0
            if (r8 != 0) goto L1e
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L88
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L74
        L1e:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L35
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d
            int r2 = r0 + 107
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c = r0
            int r2 = r2 % r6
            java.lang.String r1 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormTextInputScreen_InputEmail (FormsTextInputView.kt:123)"
            r0 = -1
            if (r2 != 0) goto L81
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r8, r0, r1)
        L35:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState$Companion r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13370a
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState r3 = r0.previewEmailData$onboard_release()
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$f r2 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f.f13901b
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$g r1 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.g.f13905a
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 432(0x1b0, float:6.05E-43)
            FormsTextInputView(r3, r2, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L63
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c = r0
            int r1 = r1 % r6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d = r0
            int r1 = r1 % r6
        L63:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L73
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$k r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt$k
            r0.<init>(r8)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L73:
            return
        L74:
            r4.skipToGroupEnd()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13866c
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.f13867d = r0
            int r1 = r1 % r6
            goto L63
        L81:
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r8, r0, r1)
            r3.hashCode()
            throw r3
        L88:
            r4.getSkipping()
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsTextInputViewKt.b(androidx.compose.runtime.Composer, int):void");
    }

    static final class h extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13910a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f13911b = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13912c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13913d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13914e = 1;

        private static void d(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13912c + 105;
            f13914e = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i4 = f13914e + 65;
            f13912c = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13912c + 39;
            f13914e = i3 % 128;
            int i4 = i3 % 2;
            d(str, str2);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f13914e + 31;
            f13912c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13913d + 85;
            f13910a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        h() {
            super(2);
        }
    }

    static final class i extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13915a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13916b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13917c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f13918d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13919e = 1;

        private static void d(String str) {
            int i2 = 2 % 2;
            int i3 = f13917c + 109;
            f13915a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13915a + 13;
            f13917c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13917c + 1;
            f13915a = i3 % 128;
            int i4 = i3 % 2;
            d(str);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13917c + 121;
            f13915a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13919e + 29;
            f13916b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        i() {
            super(1);
        }
    }

    private static final void e(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-861648249);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            int i4 = f13867d + 7;
            f13866c = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (!(!ComposerKt.isTraceInProgress())) {
                ComposerKt.traceEventStart(-861648249, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormTextInputScreen_InputCpf (FormsTextInputView.kt:130)");
            }
            FormsTextInputView(FormsTextInputUiState.f13370a.previewCpfData$onboard_release(), h.f13911b, i.f13918d, composerStartRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13866c + 123;
                f13867d = i6 % 128;
                if (i6 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(i2));
            int i7 = f13866c + 55;
            f13867d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    static final class l extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13926a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13927b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13928c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final l f13929d = new l();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13930e = 1;

        private static void d(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13926a + 83;
            f13930e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                int i4 = 55 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }
            int i5 = f13926a + 61;
            f13930e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13926a + 15;
            f13930e = i3 % 128;
            int i4 = i3 % 2;
            d(str, str2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13926a + 25;
            f13930e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f13927b + 27;
            f13928c = i2 % 128;
            int i3 = i2 % 2;
        }

        l() {
            super(2);
        }
    }

    static final class m extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f13931a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13932b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13933c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13934d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13935e = 1;

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13934d + 109;
            f13932b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13932b + 113;
            f13934d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13934d + 123;
            f13932b = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 1 / 0;
            }
            return unit;
        }

        static {
            int i2 = f13935e + 87;
            f13933c = i2 % 128;
            int i3 = i2 % 2;
        }

        m() {
            super(1);
        }
    }

    private static final void d(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13867d + 45;
        f13866c = i4 % 128;
        int i5 = i4 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-617532691);
        if (i2 != 0 || (!composerStartRestartGroup.getSkipping())) {
            if (!(!ComposerKt.isTraceInProgress())) {
                int i6 = f13867d + 101;
                f13866c = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventStart(-617532691, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormTextInputScreen_InputNumber (FormsTextInputView.kt:137)");
            }
            FormsTextInputView(FormsTextInputUiState.f13370a.previewIdNumberData$onboard_release(), l.f13929d, m.f13931a, composerStartRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(i2));
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13877a = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13878j = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f13879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f13880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsTextInputUiState f13881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function2<String, String, Unit> f13882e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13878j + 47;
            f13877a = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13877a + 7;
            f13878j = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13878j + 101;
            f13877a = i3 % 128;
            int i4 = i3 % 2;
            FormsTextInputViewKt.FormsTextInputView(this.f13881d, this.f13882e, this.f13879b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13880c | 1));
            int i5 = f13877a + 117;
            f13878j = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(FormsTextInputUiState formsTextInputUiState, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, int i2) {
            super(2);
            this.f13881d = formsTextInputUiState;
            this.f13882e = function2;
            this.f13879b = function1;
            this.f13880c = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13920b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13921c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f13922e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13920b + 27;
            f13921c = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13921c + 55;
            f13920b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13921c + 79;
            f13920b = i3 % 128;
            FormsTextInputViewKt.access$Preview_FormTextInputScreen_InputCpf(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f13922e : this.f13922e | 1));
            int i4 = f13921c + 81;
            f13920b = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(2);
            this.f13922e = i2;
        }
    }

    static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13923c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13924d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13925a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13924d + 47;
            f13923c = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13924d + 63;
            f13923c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13924d + 91;
            f13923c = i3 % 128;
            FormsTextInputViewKt.access$Preview_FormTextInputScreen_InputEmail(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f13925a : this.f13925a | 1));
            int i4 = f13924d + 81;
            f13923c = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i2) {
            super(2);
            this.f13925a = i2;
        }
    }

    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13941b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13942d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f13943c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13942d + 45;
            f13941b = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13942d + 103;
            f13941b = i3 % 128;
            int i4 = i3 % 2;
            FormsTextInputViewKt.access$Preview_FormTextInputScreen_InputNumber(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13943c | 1));
            int i5 = f13942d + 83;
            f13941b = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i2) {
            super(2);
            this.f13943c = i2;
        }
    }

    static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13944c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13945e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13946d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13944c + 79;
            f13945e = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13944c + 7;
            f13945e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13944c + 85;
            f13945e = i3 % 128;
            FormsTextInputViewKt.access$Preview_FormTextInputScreen_InputText(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f13946d : this.f13946d | 1));
            int i4 = f13945e + 99;
            f13944c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i2) {
            super(2);
            this.f13946d = i2;
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13875c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13876d = 0;

        static {
            int[] iArr = new int[TextInputType.values().length];
            try {
                iArr[TextInputType.f13395a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputType.f13398d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputType.f13399e.ordinal()] = 3;
                int i2 = f13875c + 71;
                f13876d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputType.f13397c.ordinal()] = 4;
                int i5 = f13876d + 63;
                f13875c = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 3;
                } else {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextInputType.f13396b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13874a = iArr;
            int i8 = f13875c + 37;
            f13876d = i8 % 128;
            int i9 = i8 % 2;
        }
    }
}
