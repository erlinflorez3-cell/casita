package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureTutorialScreenKt {

    /* JADX INFO: renamed from: b */
    private static int f15061b = 1;

    /* JADX INFO: renamed from: d */
    private static int f15062d = 0;

    public static final /* synthetic */ void access$PreviewCaptureIntroScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15062d + 17;
        f15061b = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        int i6 = f15061b + 97;
        f15062d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 6 / 0;
        }
    }

    static final class d extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15076a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15077b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IdScan.IdType f15078c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15079d;

        public static final /* synthetic */ float a(LottieAnimationState lottieAnimationState) {
            int i2 = 2 % 2;
            int i3 = f15076a + 51;
            f15077b = i3 % 128;
            int i4 = i3 % 2;
            float fC = c(lottieAnimationState);
            int i5 = f15076a + 35;
            f15077b = i5 % 128;
            int i6 = i5 % 2;
            return fC;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15076a + 109;
            f15077b = i3 % 128;
            int i4 = i3 % 2;
            a(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15076a + 5;
            f15077b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static final LottieComposition c(LottieCompositionResult lottieCompositionResult) {
            int i2 = 2 % 2;
            int i3 = f15077b + 27;
            f15076a = i3 % 128;
            State state = (State) lottieCompositionResult;
            if (i3 % 2 == 0) {
                return (LottieComposition) state.getValue();
            }
            int i4 = 22 / 0;
            return (LottieComposition) state.getValue();
        }

        private static final float c(LottieAnimationState lottieAnimationState) {
            int i2 = 2 % 2;
            int i3 = f15076a + 55;
            f15077b = i3 % 128;
            State state = (State) lottieAnimationState;
            if (i3 % 2 != 0) {
                float fFloatValue = ((Number) state.getValue()).floatValue();
                int i4 = f15076a + 93;
                f15077b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 31 / 0;
                }
                return fFloatValue;
            }
            ((Number) state.getValue()).floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class e extends Lambda implements Function0<Float> {

            /* JADX INFO: renamed from: a */
            private static int f15088a = 1;

            /* JADX INFO: renamed from: b */
            private static int f15089b = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ LottieAnimationState f15090e;

            private Float a() {
                int i2 = 2 % 2;
                int i3 = f15089b + 111;
                f15088a = i3 % 128;
                int i4 = i3 % 2;
                Float fValueOf = Float.valueOf(d.a(this.f15090e));
                int i5 = f15088a + 93;
                f15089b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 38 / 0;
                }
                return fValueOf;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Float invoke() {
                int i2 = 2 % 2;
                int i3 = f15088a + 63;
                f15089b = i3 % 128;
                if (i3 % 2 != 0) {
                    a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Float fA = a();
                int i4 = f15088a + 73;
                f15089b = i4 % 128;
                int i5 = i4 % 2;
                return fA;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(LottieAnimationState lottieAnimationState) {
                super(0);
                this.f15090e = lottieAnimationState;
            }
        }

        static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f15080a = 1;

            /* JADX INFO: renamed from: b */
            private static int f15081b = 0;

            /* JADX INFO: renamed from: c */
            private static int f15082c = 1;

            /* JADX INFO: renamed from: d */
            public static final b f15083d = new b();

            /* JADX INFO: renamed from: e */
            private static int f15084e = 0;

            private static void c(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                int i2 = 2 % 2;
                int i3 = f15082c + 75;
                f15081b = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                int i4 = f15082c + 123;
                f15081b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                int i2 = 2 % 2;
                int i3 = f15081b + 93;
                f15082c = i3 % 128;
                int i4 = i3 % 2;
                c(semanticsPropertyReceiver);
                Unit unit = Unit.INSTANCE;
                int i5 = f15082c + 105;
                f15081b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f15080a + 103;
                f15084e = i2 % 128;
                int i3 = i2 % 2;
            }

            b() {
                super(1);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.CaptureTutorialScreenKt$d$d */
        static final class C0252d extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            private static int f15085a = 1;

            /* JADX INFO: renamed from: b */
            private static int f15086b = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15087c;

            private void b() {
                int i2 = 2 % 2;
                int i3 = f15086b + 5;
                f15085a = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f15087c.invoke(InitIdCaptureUiEvent.ContinueFromTutorial.f15036e);
                    throw null;
                }
                this.f15087c.invoke(InitIdCaptureUiEvent.ContinueFromTutorial.f15036e);
                int i4 = f15086b + 15;
                f15085a = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15086b + 73;
                f15085a = i3 % 128;
                int i4 = i3 % 2;
                b();
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0252d(Function1<? super InitIdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15087c = function1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x035f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(androidx.compose.foundation.layout.ColumnScope r47, androidx.compose.runtime.Composer r48, int r49) {
            /*
                Method dump skipped, instruction units count: 1175
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.CaptureTutorialScreenKt.d.a(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(IdScan.IdType idType, Function1<? super InitIdCaptureUiEvent, Unit> function1) {
            super(3);
            this.f15078c = idType;
            this.f15079d = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CaptureTutorialScreen(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent, kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, com.incode.welcome_sdk.modules.IdScan.IdType r19, boolean r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.CaptureTutorialScreenKt.CaptureTutorialScreen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, com.incode.welcome_sdk.modules.IdScan$IdType, boolean, androidx.compose.runtime.Composer, int):void");
    }

    static final class b extends Lambda implements Function1<InitIdCaptureUiEvent, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15066a = 0;

        /* JADX INFO: renamed from: b */
        private static int f15067b = 0;

        /* JADX INFO: renamed from: c */
        private static int f15068c = 1;

        /* JADX INFO: renamed from: d */
        public static final b f15069d = new b();

        /* JADX INFO: renamed from: e */
        private static int f15070e = 1;

        private static void a(InitIdCaptureUiEvent initIdCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15070e + 111;
            f15066a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                int i4 = 34 / 0;
            } else {
                Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
            }
            int i5 = f15066a + 55;
            f15070e = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(InitIdCaptureUiEvent initIdCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15070e + 97;
            f15066a = i3 % 128;
            int i4 = i3 % 2;
            a(initIdCaptureUiEvent);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f15070e + 41;
            f15066a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15068c + 25;
            f15067b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15071a = 1;

        /* JADX INFO: renamed from: b */
        private static int f15072b = 1;

        /* JADX INFO: renamed from: c */
        private static int f15073c = 0;

        /* JADX INFO: renamed from: d */
        private static int f15074d = 0;

        /* JADX INFO: renamed from: e */
        public static final c f15075e = new c();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15071a + 79;
            f15074d = i3 % 128;
            if (i3 % 2 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = f15074d + 15;
            f15071a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
            return unit2;
        }

        static {
            int i2 = f15072b + 83;
            f15073c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(0);
        }
    }

    private static final void c(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1429249889);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i4 = f15062d + 33;
                f15061b = i4 % 128;
                int i5 = i4 % 2;
                ComposerKt.traceEventStart(1429249889, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCaptureIntroScreen (CaptureTutorialScreen.kt:142)");
                int i6 = f15062d + 59;
                f15061b = i6 % 128;
                int i7 = i6 % 2;
            }
            CaptureTutorialScreen(b.f15069d, c.f15075e, IdScan.IdType.ID, true, composerStartRestartGroup, 3510);
            if (ComposerKt.isTraceInProgress()) {
                int i8 = f15062d + 59;
                f15061b = i8 % 128;
                if (i8 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                    int i9 = 86 / 0;
                } else {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i2));
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15063a = 1;

        /* JADX INFO: renamed from: e */
        private static int f15064e = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15065c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15064e + 53;
            f15063a = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15064e + 67;
            f15063a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15063a + 115;
            f15064e = i3 % 128;
            int i4 = i3 % 2;
            CaptureTutorialScreenKt.access$PreviewCaptureIntroScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15065c | 1));
            int i5 = f15064e + 79;
            f15063a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(2);
            this.f15065c = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f */
        private static int f15091f = 0;

        /* JADX INFO: renamed from: g */
        private static int f15092g = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ int f15093a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Function1<InitIdCaptureUiEvent, Unit> f15094b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ boolean f15095c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ IdScan.IdType f15096d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Function0<Unit> f15097e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15091f + 71;
            f15092g = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15092g + 1;
            f15091f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15091f + 41;
            f15092g = i3 % 128;
            if (i3 % 2 == 0) {
                CaptureTutorialScreenKt.CaptureTutorialScreen(this.f15094b, this.f15097e, this.f15096d, this.f15095c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15093a));
            } else {
                CaptureTutorialScreenKt.CaptureTutorialScreen(this.f15094b, this.f15097e, this.f15096d, this.f15095c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15093a | 1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super InitIdCaptureUiEvent, Unit> function1, Function0<Unit> function0, IdScan.IdType idType, boolean z2, int i2) {
            super(2);
            this.f15094b = function1;
            this.f15097e = function0;
            this.f15096d = idType;
            this.f15095c = z2;
            this.f15093a = i2;
        }
    }
}
