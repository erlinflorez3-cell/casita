package com.incode.welcome_sdk.ui.composables;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class AnimateContentKt {

    /* JADX INFO: renamed from: d */
    private static int f12991d = 0;

    /* JADX INFO: renamed from: e */
    private static int f12992e = 1;

    /* JADX WARN: Removed duplicated region for block: B:51:0x002a A[PHI: r6
  0x002a: PHI (r6v4 androidx.compose.runtime.Composer) = (r6v1 androidx.compose.runtime.Composer), (r6v5 androidx.compose.runtime.Composer) binds: [B:86:0x00e9, B:50:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed A[PHI: r6
  0x00ed: PHI (r6v2 androidx.compose.runtime.Composer) = (r6v1 androidx.compose.runtime.Composer), (r6v5 androidx.compose.runtime.Composer) binds: [B:86:0x00e9, B:50:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimateContent(S r15, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r16, kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.AnimateContentKt.AnimateContent(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int):void");
    }

    static final class d<S> extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {

        /* JADX INFO: renamed from: a */
        private static int f12999a = 1;

        /* JADX INFO: renamed from: d */
        private static int f13000d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f13001e;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.composables.AnimateContentKt$d$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<Integer, Integer> {

            /* JADX INFO: renamed from: a */
            private static int f13002a = 1;

            /* JADX INFO: renamed from: b */
            private static int f13003b = 0;

            /* JADX INFO: renamed from: c */
            public static final AnonymousClass3 f13004c = ;

            /* JADX INFO: renamed from: d */
            private static int f13005d = 1;

            /* JADX INFO: renamed from: e */
            private static int f13006e = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Integer invoke(Integer num) {
                int i2 = 2 % 2;
                int i3 = f13002a + 89;
                f13003b = i3 % 128;
                int i4 = i3 % 2;
                int iIntValue = num.intValue();
                if (i4 != 0) {
                    a(iIntValue);
                    throw null;
                }
                Integer numA = a(iIntValue);
                int i5 = f13002a + 13;
                f13003b = i5 % 128;
                int i6 = i5 % 2;
                return numA;
            }

            private static Integer a(int i2) {
                int i3 = 2 % 2;
                int i4 = f13002a + 29;
                f13003b = i4 % 128;
                int i5 = i4 % 2;
                Integer numValueOf = Integer.valueOf(i2);
                if (i5 != 0) {
                    int i6 = 24 / 0;
                }
                return numValueOf;
            }

            static {
                int i2 = f13005d + 3;
                f13006e = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass3() {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ContentTransform invoke(Object obj) {
            int i2 = 2 % 2;
            int i3 = f12999a + 45;
            f13000d = i3 % 128;
            int i4 = i3 % 2;
            ContentTransform contentTransformD = d((AnimatedContentTransitionScope) obj);
            if (i4 != 0) {
                int i5 = 12 / 0;
            }
            int i6 = f13000d + 109;
            f12999a = i6 % 128;
            if (i6 % 2 != 0) {
                return contentTransformD;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private ContentTransform d(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
            int i2 = 2 % 2;
            int i3 = f12999a + 29;
            f13000d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
            ContentTransform contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(this.f13001e, 0, null, 6, null), AnonymousClass3.f13004c), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(this.f13001e, 0, null, 6, null), AnonymousClass5.f13008b));
            int i5 = f12999a + 33;
            f13000d = i5 % 128;
            int i6 = i5 % 2;
            return contentTransform;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.composables.AnimateContentKt$d$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<Integer, Integer> {

            /* JADX INFO: renamed from: a */
            private static int f13007a = 1;

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass5 f13008b = ;

            /* JADX INFO: renamed from: c */
            private static int f13009c = 0;

            /* JADX INFO: renamed from: d */
            private static int f13010d = 1;

            /* JADX INFO: renamed from: e */
            private static int f13011e = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Integer invoke(Integer num) {
                int i2 = 2 % 2;
                int i3 = f13011e + 39;
                f13010d = i3 % 128;
                int i4 = i3 % 2;
                Integer numC = c(num.intValue());
                int i5 = f13011e + 9;
                f13010d = i5 % 128;
                if (i5 % 2 != 0) {
                    return numC;
                }
                throw null;
            }

            private static Integer c(int i2) {
                int i3 = 2 % 2;
                int i4 = f13010d + 117;
                f13011e = i4 % 128;
                int i5 = -i2;
                if (i4 % 2 == 0) {
                    return Integer.valueOf(i5);
                }
                Integer.valueOf(i5);
                throw null;
            }

            static {
                int i2 = f13009c + 45;
                f13007a = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            AnonymousClass5() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(1);
            this.f13001e = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> slideInSlideOut(int r4, androidx.compose.runtime.Composer r5, int r6, int r7) {
        /*
            r3 = 2
            int r0 = r3 % r3
            r2 = -468208955(0xffffffffe417b2c5, float:-1.119336E22)
            r5.startReplaceableGroup(r2)
            r0 = r7 & 1
            if (r0 == 0) goto Lf
            r4 = 500(0x1f4, float:7.0E-43)
        Lf:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L24
            int r0 = com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12992e
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12991d = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.composables.slideInSlideOut (AnimateContent.kt:28)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r1, r0)
        L24:
            r0 = 728114564(0x2b662584, float:8.176448E-13)
            r5.startReplaceableGroup(r0)
            boolean r0 = r5.changed(r4)
            java.lang.Object r2 = r5.rememberedValue()
            if (r0 != 0) goto L47
            int r0 = com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12992e
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12991d = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L75
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r2 != r0) goto L5a
        L47:
            com.incode.welcome_sdk.ui.composables.AnimateContentKt$d r2 = new com.incode.welcome_sdk.ui.composables.AnimateContentKt$d
            r2.<init>(r4)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r5.updateRememberedValue(r2)
            int r0 = com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12991d
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12992e = r0
            int r1 = r1 % r3
        L5a:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r5.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L71
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12992e
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.composables.AnimateContentKt.f12991d = r0
            int r1 = r1 % r3
        L71:
            r5.endReplaceableGroup()
            return r2
        L75:
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            r0.getEmpty()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.composables.AnimateContentKt.slideInSlideOut(int, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function1");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e */
        private static int f12993e = 0;

        /* JADX INFO: renamed from: f */
        private static int f12994f = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> f12995a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> f12996b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ S f12997c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f12998d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f12994f + 81;
            f12993e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f12994f + 97;
            f12993e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f12993e + 29;
            f12994f = i3 % 128;
            int i4 = i3 % 2;
            AnimateContentKt.AnimateContent(this.f12997c, this.f12995a, this.f12996b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12998d | 1));
            int i5 = f12994f + 11;
            f12993e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(S s2, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i2) {
            super(2);
            this.f12997c = s2;
            this.f12995a = function1;
            this.f12996b = function4;
            this.f12998d = i2;
        }
    }
}
