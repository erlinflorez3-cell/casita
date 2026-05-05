package com.incode.welcome_sdk.ui.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeModuleHeaderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13014a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13015c = 0;

    public static final /* synthetic */ void access$PreviewIncodeModuleHeader(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13015c + 81;
        f13014a = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f13015c + 91;
        f13014a = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeModuleHeader(androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.IncodeModuleHeader(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13025a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13026b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13027c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13028d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f13029e = new e();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13027c + 9;
            f13025a = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f13025a + 53;
            f13027c = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f13026b + 59;
            f13028d = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(androidx.compose.runtime.Composer r7, int r8) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13015c
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13014a = r0
            int r1 = r1 % r6
            r5 = 1947199428(0x740fe7c4, float:4.560542E31)
            androidx.compose.runtime.Composer r3 = r7.startRestartGroup(r5)
            r4 = 0
            if (r8 != 0) goto L27
            int r0 = com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13014a
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13015c = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L65
            boolean r0 = r3.getSkipping()
            if (r0 != 0) goto L61
        L27:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r2 = 1
            if (r0 == r2) goto L51
        L2e:
            com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt$e r1 = com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.e.f13029e
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 48
            IncodeModuleHeader(r4, r1, r3, r0, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L40
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L40:
            androidx.compose.runtime.ScopeUpdateScope r1 = r3.endRestartGroup()
            if (r1 == 0) goto L50
            com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt$d r0 = new com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt$d
            r0.<init>(r8)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L50:
            return
        L51:
            int r0 = com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13015c
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.f13014a = r0
            int r1 = r1 % r6
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.composables.PreviewIncodeModuleHeader (IncodeModuleHeader.kt:44)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r8, r1, r0)
            goto L2e
        L61:
            r3.skipToGroupEnd()
            goto L40
        L65:
            r3.getSkipping()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.IncodeModuleHeaderKt.e(androidx.compose.runtime.Composer, int):void");
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13016b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f13017f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13018a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Modifier f13019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f13021e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13017f + 31;
            f13016b = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13016b + 13;
            f13017f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13016b + 69;
            f13017f = i3 % 128;
            int i4 = i3 % 2;
            IncodeModuleHeaderKt.IncodeModuleHeader(this.f13019c, this.f13020d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13021e | 1), this.f13018a);
            int i5 = f13017f + 15;
            f13016b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f13019c = modifier;
            this.f13020d = function0;
            this.f13021e = i2;
            this.f13018a = i3;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13022d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13023e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f13024a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13023e + 83;
            f13022d = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13022d + 7;
            f13023e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13023e + 49;
            f13022d = i3 % 128;
            int i4 = i3 % 2;
            IncodeModuleHeaderKt.access$PreviewIncodeModuleHeader(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13024a | 1));
            int i5 = f13023e + 61;
            f13022d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(2);
            this.f13024a = i2;
        }
    }
}
