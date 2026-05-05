package com.incode.welcome_sdk.ui.theme;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.incode.welcome_sdk.commons.theme.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeDialogDatePickerKt {

    /* JADX INFO: renamed from: a */
    private static int f17634a = 1;

    /* JADX INFO: renamed from: b */
    private static int f17635b = 0;

    public static final /* synthetic */ void access$Preview_IncodeDialogDatePicker(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17635b + 59;
        f17634a = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f17634a + 79;
        f17635b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: b */
        private static int f17644b = 1;

        /* JADX INFO: renamed from: e */
        private static int f17645e = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DatePickerState f17646c;

        private Boolean a() {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f17645e + 21;
            f17644b = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17646c.getSelectedDateMillis();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.f17646c.getSelectedDateMillis() != null) {
                z2 = true;
            } else {
                int i4 = f17644b + 19;
                f17645e = i4 % 128;
                int i5 = i4 % 2;
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            int i2 = 2 % 2;
            int i3 = f17644b + 37;
            f17645e = i3 % 128;
            if (i3 % 2 == 0) {
                return a();
            }
            a();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DatePickerState datePickerState) {
            super(0);
            this.f17646c = datePickerState;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f17650d = 0;

        /* JADX INFO: renamed from: e */
        private static int f17651e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ DatePickerState f17652a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Function1<Long, Unit> f17653b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ State<Boolean> f17654c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17651e + 39;
            f17650d = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            e(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f17651e + 13;
            f17650d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            private static int f17655a = 1;

            /* JADX INFO: renamed from: c */
            private static int f17656c = 0;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Function1<Long, Unit> f17657d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ DatePickerState f17658e;

            private void a() {
                int i2 = 2 % 2;
                int i3 = f17655a + 105;
                f17656c = i3 % 128;
                int i4 = i3 % 2;
                this.f17657d.invoke(this.f17658e.getSelectedDateMillis());
                int i5 = f17655a + 65;
                f17656c = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f17655a + 37;
                f17656c = i3 % 128;
                int i4 = i3 % 2;
                a();
                Unit unit = Unit.INSTANCE;
                int i5 = f17655a + 57;
                f17656c = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 68 / 0;
                }
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Long, Unit> function1, DatePickerState datePickerState) {
                super(0);
                this.f17657d = function1;
                this.f17658e = datePickerState;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r4 = 2
                int r0 = r4 % r4
                r0 = r13 & 11
                r8 = r12
                if (r0 != r4) goto Le
                boolean r0 = r8.getSkipping()
                if (r0 != 0) goto L87
            Le:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 != 0) goto L74
            L14:
                int r1 = com.incode.welcome_sdk.R.string.onboard_sdk_ok
                r0 = 0
                java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r8, r0)
                androidx.compose.runtime.State<java.lang.Boolean> r0 = r11.f17654c
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                r0 = -755256141(0xffffffffd2fbb4b3, float:-5.405342E11)
                r8.startReplaceableGroup(r0)
                kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r0 = r11.f17653b
                boolean r1 = r8.changedInstance(r0)
                androidx.compose.material3.DatePickerState r0 = r11.f17652a
                boolean r0 = r8.changed(r0)
                r1 = r1 | r0
                kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r3 = r11.f17653b
                androidx.compose.material3.DatePickerState r2 = r11.f17652a
                java.lang.Object r7 = r8.rememberedValue()
                if (r1 != 0) goto L55
                int r0 = com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.e.f17651e
                int r1 = r0 + 117
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.e.f17650d = r0
                int r1 = r1 % r4
                androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
                java.lang.Object r0 = r0.getEmpty()
                if (r7 != r0) goto L5f
            L55:
                com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt$e$a r7 = new com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt$e$a
                r7.<init>(r3, r2)
                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                r8.updateRememberedValue(r7)
            L5f:
                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                r8.endReplaceableGroup()
                r9 = 0
                r10 = 1
                r4 = 0
                com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.IncodeDialogButtonPrimary(r4, r5, r6, r7, r8, r9, r10)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L73
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            L73:
                return
            L74:
                r2 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.ui.theme.IncodeDialogDatePicker.<anonymous> (IncodeDialogDatePicker.kt:28)"
                r0 = -1537256958(0xffffffffa45f5202, float:-4.842488E-17)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r2, r1)
                int r0 = com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.e.f17650d
                int r1 = r0 + 41
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.e.f17651e = r0
                int r1 = r1 % r4
                goto L14
            L87:
                r8.skipToGroupEnd()
                goto L73
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.e.e(androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(State<Boolean> state, Function1<? super Long, Unit> function1, DatePickerState datePickerState) {
            super(2);
            this.f17654c = state;
            this.f17653b = function1;
            this.f17652a = datePickerState;
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f17641a = 0;

        /* JADX INFO: renamed from: e */
        private static int f17642e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Function0<Unit> f17643b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17642e + 109;
            f17641a = i3 % 128;
            int i4 = i3 % 2;
            c(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f17642e + 105;
            f17641a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f17641a + 121;
                f17642e = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f17641a + 121;
                f17642e = i6 % 128;
                if (i6 % 2 == 0) {
                    ComposerKt.traceEventStart(-2077686464, i2, -1, "com.incode.welcome_sdk.ui.theme.IncodeDialogDatePicker.<anonymous> (IncodeDialogDatePicker.kt:35)");
                    throw null;
                }
                ComposerKt.traceEventStart(-2077686464, i2, -1, "com.incode.welcome_sdk.ui.theme.IncodeDialogDatePicker.<anonymous> (IncodeDialogDatePicker.kt:35)");
                int i7 = f17641a + 11;
                f17642e = i7 % 128;
                int i8 = i7 % 2;
            }
            ButtonKt.TextButton(this.f17643b, null, false, null, null, null, null, null, null, ComposableSingletons$IncodeDialogDatePickerKt.f17568d.m8569getLambda1$onboard_release(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                int i9 = f17642e + 77;
                f17641a = i9 % 128;
                int i10 = i9 % 2;
                ComposerKt.traceEventEnd();
                int i11 = f17641a + 55;
                f17642e = i11 % 128;
                int i12 = i11 % 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(2);
            this.f17643b = function0;
        }
    }

    static final class d extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f17647b = 0;

        /* JADX INFO: renamed from: c */
        private static int f17648c = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ DatePickerState f17649e;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17648c + 113;
            f17647b = i3 % 128;
            int i4 = i3 % 2;
            e(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f17647b + 123;
            f17648c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return unit;
        }

        private void e(ColumnScope columnScope, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f17647b + 23;
            f17648c = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i2 & 81) == 16) {
                int i6 = f17648c + 13;
                f17647b = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i8 = f17648c + 89;
                f17647b = i8 % 128;
                int i9 = i8 % 2;
                ComposerKt.traceEventStart(1756999627, i2, -1, "com.incode.welcome_sdk.ui.theme.IncodeDialogDatePicker.<anonymous> (IncodeDialogDatePicker.kt:40)");
            }
            DatePickerState datePickerState = this.f17649e;
            DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
            g.b bVar = g.b.f5657e;
            long jG = g.b.g();
            g.b bVar2 = g.b.f5657e;
            DatePickerKt.DatePicker(datePickerState, null, null, null, null, false, datePickerDefaults.m2040colorsbSRYm20(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, g.b.g(), 0L, 0L, 0L, 0L, 0L, jG, 0L, 0L, 0L, 0L, 0L, 0L, null, composer, 0, 12582960, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 33421311), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                int i10 = f17647b + 79;
                f17648c = i10 % 128;
                if (i10 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    int i11 = 33 / 0;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DatePickerState datePickerState) {
            super(3);
            this.f17649e = datePickerState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0029 A[PHI: r0
  0x0029: PHI (r0v9 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v10 androidx.compose.runtime.Composer) binds: [B:88:0x0128, B:51:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c A[PHI: r0
  0x012c: PHI (r0v5 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v10 androidx.compose.runtime.Composer) binds: [B:88:0x0128, B:51:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeDialogDatePicker(kotlin.jvm.functions.Function0<kotlin.Unit> r18, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeDialogDatePickerKt.IncodeDialogDatePicker(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class i extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f17662a = 1;

        /* JADX INFO: renamed from: b */
        public static final i f17663b = new i();

        /* JADX INFO: renamed from: c */
        private static int f17664c = 1;

        /* JADX INFO: renamed from: d */
        private static int f17665d = 0;

        /* JADX INFO: renamed from: e */
        private static int f17666e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f17664c + 59;
            f17666e = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f17666e + 77;
            f17664c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f17665d + 25;
            f17662a = i2 % 128;
            if (i2 % 2 != 0) {
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

    static final class j extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f17667a = 0;

        /* JADX INFO: renamed from: b */
        public static final j f17668b = new j();

        /* JADX INFO: renamed from: c */
        private static int f17669c = 0;

        /* JADX INFO: renamed from: d */
        private static int f17670d = 1;

        /* JADX INFO: renamed from: e */
        private static int f17671e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17669c + 55;
            f17670d = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f17669c + 15;
            f17670d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f17667a + 53;
            f17671e = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        j() {
            super(0);
        }
    }

    private static final void e(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17634a + 105;
        f17635b = i4 % 128;
        int i5 = i4 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-111615616);
        if (i2 != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111615616, i2, -1, "com.incode.welcome_sdk.ui.theme.Preview_IncodeDialogDatePicker (IncodeDialogDatePicker.kt:53)");
            }
            IncodeDialogDatePicker(j.f17668b, i.f17663b, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f17634a + 17;
                f17635b = i6 % 128;
                if (i6 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            int i7 = f17635b + 37;
            f17634a = i7 % 128;
            int i8 = i7 % 2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i2));
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f17636b = 0;

        /* JADX INFO: renamed from: d */
        private static int f17637d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ int f17638a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function1<Long, Unit> f17639c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Function0<Unit> f17640e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17636b + 65;
            f17637d = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 15 / 0;
            }
            int i6 = f17636b + 69;
            f17637d = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17637d + 13;
            f17636b = i3 % 128;
            int i4 = i3 % 2;
            IncodeDialogDatePickerKt.IncodeDialogDatePicker(this.f17640e, this.f17639c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f17638a | 1));
            int i5 = f17637d + 53;
            f17636b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<Unit> function0, Function1<? super Long, Unit> function1, int i2) {
            super(2);
            this.f17640e = function0;
            this.f17639c = function1;
            this.f17638a = i2;
        }
    }

    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f17659a = 1;

        /* JADX INFO: renamed from: d */
        private static int f17660d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f17661e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17660d + 89;
            f17659a = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 59 / 0;
            }
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17660d + 99;
            f17659a = i3 % 128;
            int i4 = i3 % 2;
            IncodeDialogDatePickerKt.access$Preview_IncodeDialogDatePicker(composer, RecomposeScopeImplKt.updateChangedFlags(this.f17661e | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(2);
            this.f17661e = i2;
        }
    }
}
