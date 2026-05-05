package com.incode.welcome_sdk.ui.theme;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.incode.welcome_sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$IncodeDialogDatePickerKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17566b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17567c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17569e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17570i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ComposableSingletons$IncodeDialogDatePickerKt f17568d = new ComposableSingletons$IncodeDialogDatePickerKt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Function3<RowScope, Composer, Integer, Unit> f17565a = ComposableLambdaKt.composableLambdaInstance(1312134371, false, b.f17571a);

    static final class b extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17571a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17572b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17573c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17574d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17575e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17574d + 87;
            f17572b = i3 % 128;
            int i4 = i3 % 2;
            b(rowScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void b(RowScope rowScope, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f17574d + 3;
            f17572b = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                int i6 = f17574d + 23;
                f17572b = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1312134371, i2, -1, "com.incode.welcome_sdk.ui.theme.ComposableSingletons$IncodeDialogDatePickerKt.lambda-1.<anonymous> (IncodeDialogDatePicker.kt:36)");
            }
            TextKt.m2711Text4IGK_g(StringResources_androidKt.stringResource(R.string.onboard_sdk_btn_cancel, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                int i8 = f17572b + 77;
                f17574d = i8 % 128;
                if (i8 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                } else {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
            }
        }

        static {
            int i2 = f17575e + 85;
            f17573c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 56 / 0;
            }
        }

        b() {
            super(3);
        }
    }

    static {
        int i2 = f17570i + 33;
        f17569e = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8569getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f17566b;
        int i4 = i3 + 23;
        f17567c = i4 % 128;
        int i5 = i4 % 2;
        Function3<RowScope, Composer, Integer, Unit> function3 = f17565a;
        int i6 = i3 + 25;
        f17567c = i6 % 128;
        int i7 = i6 % 2;
        return function3;
    }
}
