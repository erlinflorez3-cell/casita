package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$DocumentSelectionScreenKt {

    /* JADX INFO: renamed from: b */
    private static int f15099b = 0;

    /* JADX INFO: renamed from: c */
    private static int f15100c = 0;

    /* JADX INFO: renamed from: e */
    private static int f15102e = 1;

    /* JADX INFO: renamed from: f */
    private static int f15103f = 1;

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$DocumentSelectionScreenKt f15098a = new ComposableSingletons$DocumentSelectionScreenKt();

    /* JADX INFO: renamed from: d */
    private static Function2<Composer, Integer, Unit> f15101d = ComposableLambdaKt.composableLambdaInstance(86483309, false, a.f15106c);

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15104a = 1;

        /* JADX INFO: renamed from: b */
        private static int f15105b = 1;

        /* JADX INFO: renamed from: c */
        public static final a f15106c = new a();

        /* JADX INFO: renamed from: d */
        private static int f15107d = 0;

        /* JADX INFO: renamed from: e */
        private static int f15108e = 0;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt$a$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<InitIdCaptureUiEvent, Unit> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass3 f15109a = ;

            /* JADX INFO: renamed from: b */
            private static int f15110b = 1;

            /* JADX INFO: renamed from: c */
            private static int f15111c = 0;

            /* JADX INFO: renamed from: d */
            private static int f15112d = 1;

            /* JADX INFO: renamed from: e */
            private static int f15113e = 0;

            private static void b(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15111c + 75;
                f15112d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                } else {
                    Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15111c + 31;
                f15112d = i3 % 128;
                int i4 = i3 % 2;
                b(initIdCaptureUiEvent);
                Unit unit = Unit.INSTANCE;
                int i5 = f15111c + 65;
                f15112d = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f15113e + 11;
                f15110b = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass3() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt$a$5 */
        static final class AnonymousClass5 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            private static int f15114a = 0;

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass5 f15115b = ;

            /* JADX INFO: renamed from: c */
            private static int f15116c = 1;

            /* JADX INFO: renamed from: d */
            private static int f15117d = 0;

            /* JADX INFO: renamed from: e */
            private static int f15118e = 1;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15116c + 109;
                f15114a = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Unit unit = Unit.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i4 = f15116c + 71;
                f15114a = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit2;
                }
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f15118e + 25;
                f15117d = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            AnonymousClass5() {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15104a + 15;
            f15107d = i3 % 128;
            int i4 = i3 % 2;
            e(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void e(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f15104a + 111;
                f15107d = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i6 = f15104a + 71;
                    f15107d = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i8 = f15107d + 79;
                f15104a = i8 % 128;
                if (i8 % 2 == 0) {
                    ComposerKt.traceEventStart(86483309, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt.lambda-1.<anonymous> (DocumentSelectionScreen.kt:177)");
                    int i9 = 51 / 0;
                } else {
                    ComposerKt.traceEventStart(86483309, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$DocumentSelectionScreenKt.lambda-1.<anonymous> (DocumentSelectionScreen.kt:177)");
                }
            }
            DocumentSelectionScreenKt.DocumentSelectionScreen(AnonymousClass3.f15109a, AnonymousClass5.f15115b, true, composer, 438);
            if (ComposerKt.isTraceInProgress()) {
                int i10 = f15107d + 113;
                f15104a = i10 % 128;
                int i11 = i10 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        static {
            int i2 = f15108e + 39;
            f15105b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        a() {
            super(2);
        }
    }

    static {
        int i2 = f15103f + 15;
        f15100c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release */
    public final Function2<Composer, Integer, Unit> m8485getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f15099b + 73;
        int i4 = i3 % 128;
        f15102e = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f15101d;
        int i6 = i4 + 55;
        f15099b = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }
}
