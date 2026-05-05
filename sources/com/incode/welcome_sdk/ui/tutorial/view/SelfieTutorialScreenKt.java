package com.incode.welcome_sdk.ui.tutorial.view;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfieTutorialScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17957a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17958b = 0;

    public static final /* synthetic */ void access$PreviewSelfieTutorialScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17958b + 105;
        f17957a = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        int i6 = f17957a + 77;
        f17958b = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class a extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17959a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17960c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f17961b;

        public static final /* synthetic */ float e(LottieAnimationState lottieAnimationState) {
            int i2 = 2 % 2;
            int i3 = f17960c + 41;
            f17959a = i3 % 128;
            int i4 = i3 % 2;
            float fB = b(lottieAnimationState);
            if (i4 != 0) {
                int i5 = 88 / 0;
            }
            return fB;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17960c + 13;
            f17959a = i3 % 128;
            int i4 = i3 % 2;
            d(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f17959a + 105;
            f17960c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static final LottieComposition c(LottieCompositionResult lottieCompositionResult) {
            int i2 = 2 % 2;
            int i3 = f17959a + 43;
            f17960c = i3 % 128;
            State state = (State) lottieCompositionResult;
            if (i3 % 2 != 0) {
                LottieComposition lottieComposition = (LottieComposition) state.getValue();
                int i4 = f17960c + 107;
                f17959a = i4 % 128;
                int i5 = i4 % 2;
                return lottieComposition;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final float b(LottieAnimationState lottieAnimationState) {
            int i2 = 2 % 2;
            int i3 = f17959a + 27;
            f17960c = i3 % 128;
            int i4 = i3 % 2;
            float fFloatValue = ((Number) ((State) lottieAnimationState).getValue()).floatValue();
            int i5 = f17959a + 15;
            f17960c = i5 % 128;
            int i6 = i5 % 2;
            return fFloatValue;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt$a$a, reason: collision with other inner class name */
        static final class C0256a extends Lambda implements Function0<Float> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17962c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f17963d = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ LottieAnimationState f17964a;

            private Float c() {
                int i2 = 2 % 2;
                int i3 = f17963d + 125;
                f17962c = i3 % 128;
                int i4 = i3 % 2;
                Float fValueOf = Float.valueOf(a.e(this.f17964a));
                int i5 = f17962c + 97;
                f17963d = i5 % 128;
                if (i5 % 2 == 0) {
                    return fValueOf;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Float invoke() {
                int i2 = 2 % 2;
                int i3 = f17963d + 25;
                f17962c = i3 % 128;
                int i4 = i3 % 2;
                Float fC = c();
                int i5 = f17962c + 111;
                f17963d = i5 % 128;
                int i6 = i5 % 2;
                return fC;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0256a(LottieAnimationState lottieAnimationState) {
                super(0);
                this.f17964a = lottieAnimationState;
            }
        }

        static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17968a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f17969b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17970c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f17971d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f17972e = 1;

            private static void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                int i2 = 2 % 2;
                int i3 = f17968a + 93;
                f17971d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
                int i4 = f17968a + 113;
                f17971d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 36 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                int i2 = 2 % 2;
                int i3 = f17968a + 107;
                f17971d = i3 % 128;
                int i4 = i3 % 2;
                a(semanticsPropertyReceiver);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    int i5 = 10 / 0;
                }
                return unit;
            }

            static {
                int i2 = f17972e + 39;
                f17970c = i2 % 128;
                int i3 = i2 % 2;
            }

            d() {
                super(1);
            }
        }

        static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17965c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f17966e = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f17967b;

            private void e() {
                int i2 = 2 % 2;
                int i3 = f17965c + 39;
                f17966e = i3 % 128;
                int i4 = i3 % 2;
                this.f17967b.invoke();
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f17965c + 35;
                f17966e = i3 % 128;
                int i4 = i3 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    int i5 = 51 / 0;
                }
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0<Unit> function0) {
                super(0);
                this.f17967b = function0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0438  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d(androidx.compose.foundation.layout.ColumnScope r41, androidx.compose.runtime.Composer r42, int r43) {
            /*
                Method dump skipped, instruction units count: 1129
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.a.d(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(3);
            this.f17961b = function0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[PHI: r0
  0x00f0: PHI (r0v5 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v11 androidx.compose.runtime.Composer) binds: [B:40:0x00ec, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r0
  0x0024: PHI (r0v10 androidx.compose.runtime.Composer) = (r0v4 androidx.compose.runtime.Composer), (r0v11 androidx.compose.runtime.Composer) binds: [B:40:0x00ec, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelfieTutorialScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, boolean r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.SelfieTutorialScreen(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17979a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17980b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17981c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17982d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17983e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17979a + 93;
            f17983e = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f17981c + 99;
            f17982d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
        }

        c() {
            super(0);
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f17987a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17988b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17989c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17990d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17991e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17990d + 9;
            f17991e = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f17989c + 59;
            f17988b = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r4
  0x001b: PHI (r4v3 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v4 androidx.compose.runtime.Composer) binds: [B:22:0x007a, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[PHI: r4
  0x0029: PHI (r4v1 androidx.compose.runtime.Composer) = 
  (r4v0 androidx.compose.runtime.Composer)
  (r4v3 androidx.compose.runtime.Composer)
  (r4v4 androidx.compose.runtime.Composer)
 binds: [B:22:0x007a, B:7:0x0027, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(androidx.compose.runtime.Composer r6, int r7) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17957a
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17958b = r0
            int r1 = r1 % r5
            r3 = 95
            r2 = 131457511(0x7d5e1e7, float:3.2181451E-34)
            if (r1 == 0) goto L76
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            int r0 = r3 / 0
            if (r7 != 0) goto L29
        L1b:
            int r1 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17958b
            int r1 = r1 + r3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17957a = r0
            int r1 = r1 % r5
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L72
        L29:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L3e
            int r0 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17958b
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17957a = r0
            int r1 = r1 % r5
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.tutorial.view.PreviewSelfieTutorialScreen (SelfieTutorialScreen.kt:122)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r1, r0)
        L3e:
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt$e r3 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.e.f17987a
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt$c r2 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.c.f17980b
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r0 = 438(0x1b6, float:6.14E-43)
            r1 = 1
            SelfieTutorialScreen(r3, r2, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r0 = r0 ^ r1
            if (r0 == r1) goto L61
            int r0 = com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17958b
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.f17957a = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L7d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L61:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L71
            com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt$d r0 = new com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt$d
            r0.<init>(r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L71:
            return
        L72:
            r4.skipToGroupEnd()
            goto L61
        L76:
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            if (r7 != 0) goto L29
            goto L1b
        L7d:
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt.d(androidx.compose.runtime.Composer, int):void");
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17973c = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17974i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f17975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f17976b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f17977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ boolean f17978e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17973c + 63;
            f17974i = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f17973c + 7;
            f17974i = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17974i + 15;
            f17973c = i3 % 128;
            int i4 = i3 % 2;
            SelfieTutorialScreenKt.SelfieTutorialScreen(this.f17977d, this.f17975a, this.f17978e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f17976b | 1));
            int i5 = f17974i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f17973c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0, Function0<Unit> function02, boolean z2, int i2) {
            super(2);
            this.f17977d = function0;
            this.f17975a = function02;
            this.f17978e = z2;
            this.f17976b = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17984d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17985e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f17986c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17985e + 49;
            f17984d = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f17985e + 65;
            f17984d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17984d + 55;
            f17985e = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f17986c;
            if (i4 == 0) {
                i5 |= 1;
            }
            SelfieTutorialScreenKt.access$PreviewSelfieTutorialScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(2);
            this.f17986c = i2;
        }
    }
}
