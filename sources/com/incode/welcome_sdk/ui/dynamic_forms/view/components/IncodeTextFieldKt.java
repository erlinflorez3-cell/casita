package com.incode.welcome_sdk.ui.dynamic_forms.view.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.theme.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeTextFieldKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13996b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13997d = 1;

    static final class e extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f14037h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f14038i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableInteractionSource f14040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f14042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ boolean f14043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ RoundedCornerShape f14044f;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f14038i + 25;
            f14037h = i3 % 128;
            int i4 = i3 % 2;
            d(function2, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f14037h + 85;
            f14038i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
            int i3 = i2;
            int i4 = 2;
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i3 & 14) == 0) {
                if (composer.changedInstance(function2)) {
                    int i6 = f14038i + 87;
                    f14037h = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 4;
                }
                i3 |= i4;
            }
            if ((i3 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1663655431, i3, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextField.<anonymous> (IncodeTextField.kt:48)");
                }
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                VisualTransformation none = VisualTransformation.Companion.getNone();
                String str = this.f14042d;
                boolean z2 = this.f14043e;
                MutableInteractionSource mutableInteractionSource = this.f14040b;
                Function2<Composer, Integer, Unit> function22 = this.f14039a;
                Function2<Composer, Integer, Unit> function23 = this.f14041c;
                final MutableInteractionSource mutableInteractionSource2 = this.f14040b;
                final RoundedCornerShape roundedCornerShape = this.f14044f;
                outlinedTextFieldDefaults.DecorationBox(str, function2, true, z2, none, mutableInteractionSource, false, null, function22, null, function23, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -354874740, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextFieldKt.e.4

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f14045a = 0;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f14046b = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        int i8 = 2 % 2;
                        int i9 = f14045a + 31;
                        f14046b = i9 % 128;
                        int i10 = i9 % 2;
                        a(composer2, num.intValue());
                        Unit unit = Unit.INSTANCE;
                        if (i10 == 0) {
                            throw null;
                        }
                        int i11 = f14045a + 109;
                        f14046b = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }

                    private void a(Composer composer2, int i8) {
                        int i9 = 2 % 2;
                        int i10 = f14045a + 101;
                        f14046b = i10 % 128;
                        if (i10 % 2 != 0 ? (i8 & 11) == 2 : (i8 & 84) == 4) {
                            if (composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                int i11 = f14046b + 23;
                                f14045a = i11 % 128;
                                int i12 = i11 % 2;
                                return;
                            }
                        }
                        if (!(!ComposerKt.isTraceInProgress())) {
                            ComposerKt.traceEventStart(-354874740, i8, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextField.<anonymous>.<anonymous> (IncodeTextField.kt:58)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = OutlinedTextFieldDefaults.INSTANCE;
                        g.b bVar = g.b.f5657e;
                        long j2 = g.b.j();
                        g.b bVar2 = g.b.f5657e;
                        outlinedTextFieldDefaults2.m2360ContainerBoxnbWgWpA(true, false, mutableInteractionSource3, outlinedTextFieldDefaults3.m2361colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j2, g.b.j(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 432, 0, 0, 3072, 2147477503, 4095), roundedCornerShape, Dp.m6638constructorimpl(2.0f), Dp.m6638constructorimpl(2.0f), composer2, 14352822, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composer, ((i3 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | 221568, 14155776, 64192);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            int i8 = f14037h + 37;
            f14038i = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, boolean z2, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, RoundedCornerShape roundedCornerShape) {
            super(3);
            this.f14042d = str;
            this.f14043e = z2;
            this.f14040b = mutableInteractionSource;
            this.f14039a = function2;
            this.f14041c = function22;
            this.f14044f = roundedCornerShape;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeTextField(java.lang.String r59, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r60, androidx.compose.ui.Modifier r61, boolean r62, androidx.compose.ui.text.input.VisualTransformation r63, androidx.compose.foundation.text.KeyboardOptions r64, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r65, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r66, androidx.compose.runtime.Composer r67, int r68, int r69) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextFieldKt.IncodeTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class c extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f14024f = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f14025j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableInteractionSource f14027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ boolean f14028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ VisualTransformation f14029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ TextFieldValue f14030e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ RoundedCornerShape f14032i;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f14025j + 95;
            f14024f = i3 % 128;
            int i4 = i3 % 2;
            b(function2, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f14025j + 81;
            f14024f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextFieldKt.c.b(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(TextFieldValue textFieldValue, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, RoundedCornerShape roundedCornerShape) {
            super(3);
            this.f14030e = textFieldValue;
            this.f14028c = z2;
            this.f14029d = visualTransformation;
            this.f14027b = mutableInteractionSource;
            this.f14026a = function2;
            this.f14031h = function22;
            this.f14032i = roundedCornerShape;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeTextField(androidx.compose.ui.text.input.TextFieldValue r60, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r61, androidx.compose.ui.Modifier r62, boolean r63, androidx.compose.ui.text.input.VisualTransformation r64, androidx.compose.foundation.text.KeyboardOptions r65, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r66, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r67, androidx.compose.runtime.Composer r68, int r69, int r70) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextFieldKt.IncodeTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f14010c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f14011d = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f14012l = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f14013o = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f14014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f14015b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Modifier f14016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ boolean f14017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ KeyboardOptions f14019h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ VisualTransformation f14020i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14021j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private /* synthetic */ int f14022m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private /* synthetic */ int f14023n;

        public static int b() {
            int i2 = f14011d;
            int i3 = i2 % 5033629;
            f14011d = i2 + 1;
            if (i3 != 0) {
                return f14010c;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            f14010c = iFreeMemory;
            return iFreeMemory;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f14012l + 25;
            f14013o = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f14013o + 99;
            f14012l = i3 % 128;
            if (i3 % 2 == 0) {
                IncodeTextFieldKt.IncodeTextField(this.f14015b, this.f14014a, this.f14016e, this.f14017f, this.f14020i, this.f14019h, this.f14021j, this.f14018g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14022m), this.f14023n);
            } else {
                IncodeTextFieldKt.IncodeTextField(this.f14015b, this.f14014a, this.f14016e, this.f14017f, this.f14020i, this.f14019h, this.f14021j, this.f14018g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14022m | 1), this.f14023n);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i2, int i3) {
            super(2);
            this.f14015b = str;
            this.f14014a = function1;
            this.f14016e = modifier;
            this.f14017f = z2;
            this.f14020i = visualTransformation;
            this.f14019h = keyboardOptions;
            this.f14021j = function2;
            this.f14018g = function22;
            this.f14022m = i2;
            this.f14023n = i3;
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f13998k = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f13999o = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ VisualTransformation f14000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ TextFieldValue f14001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<TextFieldValue, Unit> f14002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f14003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Modifier f14004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Function2<Composer, Integer, Unit> f14006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ KeyboardOptions f14007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ int f14008i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ int f14009j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13998k + 113;
            f13999o = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f13999o + 71;
            f13998k = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13999o + 5;
            f13998k = i3 % 128;
            if (i3 % 2 == 0) {
                IncodeTextFieldKt.IncodeTextField(this.f14001b, this.f14002c, this.f14004e, this.f14003d, this.f14000a, this.f14007h, this.f14006g, this.f14005f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14008i), this.f14009j);
            } else {
                IncodeTextFieldKt.IncodeTextField(this.f14001b, this.f14002c, this.f14004e, this.f14003d, this.f14000a, this.f14007h, this.f14006g, this.f14005f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14008i | 1), this.f14009j);
            }
            int i4 = f13999o + 49;
            f13998k = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i2, int i3) {
            super(2);
            this.f14001b = textFieldValue;
            this.f14002c = function1;
            this.f14004e = modifier;
            this.f14003d = z2;
            this.f14000a = visualTransformation;
            this.f14007h = keyboardOptions;
            this.f14006g = function2;
            this.f14005f = function22;
            this.f14008i = i2;
            this.f14009j = i3;
        }
    }
}
