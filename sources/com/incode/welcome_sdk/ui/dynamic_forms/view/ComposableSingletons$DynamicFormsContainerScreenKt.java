package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import cz.msebera.android.httpclient.protocol.HTTP;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ComposableSingletons$DynamicFormsContainerScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13409a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13412d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13413e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13414f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComposableSingletons$DynamicFormsContainerScreenKt f13411c = new ComposableSingletons$DynamicFormsContainerScreenKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f13410b = ComposableLambdaKt.composableLambdaInstance(-719145963, false, d.f13416b);

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13415a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f13416b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13417c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13418d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13419e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13418d + 77;
            f13415a = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private static void a(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f13415a + 33;
            f13418d = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                int i6 = f13418d + 45;
                f13415a = i6 % 128;
                int i7 = i6 % 2;
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    int i8 = f13415a + 47;
                    f13418d = i8 % 128;
                    if (i8 % 2 != 0) {
                        ComposerKt.traceEventStart(-719145963, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$DynamicFormsContainerScreenKt.lambda-1.<anonymous> (DynamicFormsContainerScreen.kt:69)");
                        int i9 = 47 / 0;
                    } else {
                        ComposerKt.traceEventStart(-719145963, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.ComposableSingletons$DynamicFormsContainerScreenKt.lambda-1.<anonymous> (DynamicFormsContainerScreen.kt:69)");
                    }
                }
                IconKt.m2168Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), HTTP.CONN_CLOSE, (Modifier) null, 0L, composer, 48, 12);
                if (ComposerKt.isTraceInProgress()) {
                    int i10 = f13418d + 109;
                    f13415a = i10 % 128;
                    int i11 = i10 % 2;
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            int i12 = f13415a + 97;
            f13418d = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 40 / 0;
            }
        }

        static {
            int i2 = f13417c + 75;
            f13419e = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
        }

        d() {
            super(2);
        }
    }

    static {
        int i2 = f13409a + 1;
        f13414f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
    }

    /* JADX INFO: renamed from: getLambda-1$onboard_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8448getLambda1$onboard_release() {
        int i2 = 2 % 2;
        int i3 = f13413e + 109;
        f13412d = i3 % 128;
        if (i3 % 2 != 0) {
            return f13410b;
        }
        throw null;
    }
}
