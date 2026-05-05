package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$FormsPhoneInputScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13449a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13450b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13453e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13454g = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ComposableSingletons$FormsPhoneInputScreenKt f13452d = new ComposableSingletons$FormsPhoneInputScreenKt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f13451c = ComposableLambdaKt.composableLambdaInstance(-1678282015, false, b.f13455a);

    static final class b extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13455a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13456b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13457c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13458d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13459e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13456b + 27;
            f13459e = i3 % 128;
            int i4 = i3 % 2;
            e(animatedVisibilityScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 4 / 0;
            }
            int i6 = f13459e + 111;
            f13456b = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(androidx.compose.animation.AnimatedVisibilityScope r57, androidx.compose.runtime.Composer r58, int r59) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$FormsPhoneInputScreenKt.b.e(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
        }

        static {
            int i2 = f13458d + 87;
            f13457c = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(3);
        }
    }

    static {
        int i2 = f13453e + 15;
        f13454g = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m8453getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13450b + 9;
        f13449a = i3 % 128;
        int i4 = i3 % 2;
        Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function3 = f13451c;
        if (i4 != 0) {
            int i5 = 31 / 0;
        }
        return function3;
    }
}
