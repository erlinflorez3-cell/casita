package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.id_capture.SuggestionBoxModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$IdCaptureScreenKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f15121c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f15123e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f15124f = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f15125j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ComposableSingletons$IdCaptureScreenKt f15122d = new ComposableSingletons$IdCaptureScreenKt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Function4<AnimatedContentScope, SuggestionBoxModel, Composer, Integer, Unit> f15119a = ComposableLambdaKt.composableLambdaInstance(548420408, false, b.f15129d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f15120b = ComposableLambdaKt.composableLambdaInstance(-2088486811, false, e.f15134d);

    static final class b extends Lambda implements Function4<AnimatedContentScope, SuggestionBoxModel, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15126a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15127b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15128c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f15129d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15130e = 1;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, SuggestionBoxModel suggestionBoxModel, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15126a + 1;
            f15127b = i3 % 128;
            int i4 = i3 % 2;
            b(animatedContentScope, suggestionBoxModel, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 44 / 0;
            }
            int i6 = f15127b + 67;
            f15126a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static void b(AnimatedContentScope animatedContentScope, SuggestionBoxModel suggestionBoxModel, Composer composer, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548420408, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$IdCaptureScreenKt.lambda-1.<anonymous> (IdCaptureScreen.kt:276)");
                int i4 = f15127b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f15126a = i4 % 128;
                int i5 = i4 % 2;
            }
            if (suggestionBoxModel != null) {
                int i6 = f15127b + 61;
                f15126a = i6 % 128;
                int i7 = i6 % 2;
                IdCaptureScreenKt.access$CaptureHintBox(StringResources_androidKt.stringResource(suggestionBoxModel.getTitleResId(), composer, 0), StringResources_androidKt.stringResource(suggestionBoxModel.getSubtitleResId(), composer, 0), suggestionBoxModel.getIconResId(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i8 = f15126a + 63;
                f15127b = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        static {
            int i2 = f15130e + 87;
            f15128c = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(4);
        }
    }

    static {
        int i2 = f15124f + 101;
        f15125j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15131a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15132b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15133c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f15134d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15135e = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15133c + 109;
            f15131a = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 30 / 0;
            }
            return unit;
        }

        private static void a(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f15133c + 45;
            f15131a = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088486811, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.ComposableSingletons$IdCaptureScreenKt.lambda-2.<anonymous> (IdCaptureScreen.kt:1297)");
                int i6 = f15131a + 107;
                f15133c = i6 % 128;
                int i7 = i6 % 2;
            }
            IdCaptureScreenKt.access$TooltipBubble(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i8 = f15133c + 31;
                f15131a = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        static {
            int i2 = f15132b + 79;
            f15135e = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: getLambda-2$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8487getLambda2$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f15121c + 113;
        int i4 = i3 % 128;
        f15123e = i4;
        int i5 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f15120b;
        int i6 = i4 + 61;
        f15121c = i6 % 128;
        if (i6 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function4<AnimatedContentScope, SuggestionBoxModel, Composer, Integer, Unit> m8486getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f15123e + 65;
        int i4 = i3 % 128;
        f15121c = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function4<AnimatedContentScope, SuggestionBoxModel, Composer, Integer, Unit> function4 = f15119a;
        int i5 = i4 + 117;
        f15123e = i5 % 128;
        if (i5 % 2 == 0) {
            return function4;
        }
        obj.hashCode();
        throw null;
    }
}
