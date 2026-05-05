package com.incode.welcome_sdk.ui.dynamic_forms.view;

import android.os.Process;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsYesNoScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13952a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13953d = 0;

    public static final /* synthetic */ void access$AnswerOption(String str, boolean z2, Function0 function0, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13952a + 17;
        f13953d = i4 % 128;
        int i5 = i4 % 2;
        c(str, z2, function0, composer, i2);
        int i6 = f13953d + 43;
        f13952a = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$Preview_FormsYesNoScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13952a + 93;
        f13953d = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        int i6 = f13952a + 109;
        f13953d = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13958a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13959c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsYesNoUiState f13960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function2<String, Boolean, Unit> f13961e;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13958a + 75;
            f13959c = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13959c + 1;
            f13958a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13959c + 3;
            f13958a = i3 % 128;
            int i4 = i3 % 2;
            this.f13961e.invoke(this.f13960d.getId(), Boolean.TRUE);
            int i5 = f13958a + 5;
            f13959c = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super String, ? super Boolean, Unit> function2, FormsYesNoUiState formsYesNoUiState) {
            super(0);
            this.f13961e = function2;
            this.f13960d = formsYesNoUiState;
        }
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13954a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13955d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function2<String, Boolean, Unit> f13956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsYesNoUiState f13957c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13954a + 77;
            f13955d = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13954a + 11;
            f13955d = i3 % 128;
            int i4 = i3 % 2;
            this.f13956b.invoke(this.f13957c.getId(), Boolean.FALSE);
            int i5 = f13954a + 17;
            f13955d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super String, ? super Boolean, Unit> function2, FormsYesNoUiState formsYesNoUiState) {
            super(0);
            this.f13956b = function2;
            this.f13957c = formsYesNoUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FormsYesNoScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState r60, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r61, androidx.compose.runtime.Composer r62, int r63) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.FormsYesNoScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13962b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13963c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13964a;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f13962b + 125;
            f13963c = i3 % 128;
            int i4 = i3 % 2;
            this.f13964a.invoke();
            if (i4 != 0) {
                int i5 = 52 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f13962b + 13;
            f13963c = i3 % 128;
            int i4 = i3 % 2;
            b();
            if (i4 != 0) {
                unit = Unit.INSTANCE;
                int i5 = 76 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f13962b + 33;
            f13963c = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
            super(0);
            this.f13964a = function0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(java.lang.String r58, boolean r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.c(java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    static final class f extends Lambda implements Function2<String, Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13976a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13977b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f13978c = new f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13979d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13980e = 1;

        private static void b(String str) {
            int i2 = 2 % 2;
            int i3 = f13979d + 23;
            f13977b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = f13979d + 89;
            f13977b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f13979d + 75;
            f13977b = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13979d + 59;
            f13977b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13980e + 53;
            f13976a = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(androidx.compose.runtime.Composer r5, int r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13952a
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13953d = r0
            int r1 = r1 % r4
            r2 = -1224858639(0xffffffffb6fe23f1, float:-7.573974E-6)
            if (r1 != 0) goto L72
            androidx.compose.runtime.Composer r3 = r5.startRestartGroup(r2)
            if (r6 != 0) goto L26
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13952a
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13953d = r0
            int r1 = r1 % r4
            boolean r0 = r3.getSkipping()
            if (r0 != 0) goto L6e
        L26:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L3b
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsYesNoScreen (FormsYesNoScreen.kt:85)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r1, r0)
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13952a
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13953d = r0
            int r1 = r1 % r4
        L3b:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState$Companion r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState.f13383b
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState r2 = r0.previewData$onboard_release()
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt$f r1 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f.f13978c
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 48
            FormsYesNoScreen(r2, r1, r3, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 != 0) goto L61
        L50:
            androidx.compose.runtime.ScopeUpdateScope r1 = r3.endRestartGroup()
            if (r1 == 0) goto L60
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt$h r0 = new com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt$h
            r0.<init>(r6)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L60:
            return
        L61:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13952a
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.f13953d = r0
            int r1 = r1 % r4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L50
        L6e:
            r3.skipToGroupEnd()
            goto L50
        L72:
            r5.startRestartGroup(r2)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt.b(androidx.compose.runtime.Composer, int):void");
    }

    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f13981a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13982b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f13983d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13984e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f13985c;

        public static int c() {
            int i2 = f13983d;
            int i3 = i2 % 9119608;
            f13983d = i2 + 1;
            if (i3 != 0) {
                return f13981a;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            f13981a = elapsedCpuTime;
            return elapsedCpuTime;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13984e + 113;
            f13982b = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13982b + 15;
            f13984e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13982b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13984e = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f13985c;
            if (i4 != 0) {
                i5 |= 1;
            }
            FormsYesNoScreenKt.access$Preview_FormsYesNoScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i2) {
            super(2);
            this.f13985c = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13965a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13966b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function2<String, Boolean, Unit> f13967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsYesNoUiState f13968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f13969e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13965a + 79;
            f13966b = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f13965a + 23;
            f13966b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13966b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13965a = i3 % 128;
            int i4 = i3 % 2;
            FormsYesNoScreenKt.FormsYesNoScreen(this.f13968d, this.f13967c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13969e | 1));
            int i5 = f13965a + 11;
            f13966b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(FormsYesNoUiState formsYesNoUiState, Function2<? super String, ? super Boolean, Unit> function2, int i2) {
            super(2);
            this.f13968d = formsYesNoUiState;
            this.f13967c = function2;
            this.f13969e = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13970c = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13971j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f13973b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f13974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13975e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13970c + 113;
            f13971j = i3 % 128;
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
            int i3 = f13971j + 95;
            f13970c = i3 % 128;
            int i4 = i3 % 2;
            FormsYesNoScreenKt.access$AnswerOption(this.f13973b, this.f13974d, this.f13975e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13972a | 1));
            int i5 = f13970c + 9;
            f13971j = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, boolean z2, Function0<Unit> function0, int i2) {
            super(2);
            this.f13973b = str;
            this.f13974d = z2;
            this.f13975e = function0;
            this.f13972a = i2;
        }
    }
}
