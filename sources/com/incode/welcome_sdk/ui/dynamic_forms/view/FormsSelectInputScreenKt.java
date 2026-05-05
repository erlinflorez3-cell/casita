package com.incode.welcome_sdk.ui.dynamic_forms.view;

import android.os.Process;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsSelectInputScreenKt {

    /* JADX INFO: renamed from: a */
    private static int f13810a = 0;

    /* JADX INFO: renamed from: b */
    private static int f13811b = 1;

    public static final /* synthetic */ void access$DropdownOptions(List list, String str, Function1 function1, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13810a + 55;
        f13811b = i4 % 128;
        int i5 = i4 % 2;
        e(list, str, function1, composer, i2);
        if (i5 == 0) {
            int i6 = 15 / 0;
        }
    }

    public static final /* synthetic */ boolean access$DropdownOptions$lambda$2(MutableState mutableState) {
        int i2 = 2 % 2;
        int i3 = f13810a + 15;
        f13811b = i3 % 128;
        if (i3 % 2 != 0) {
            return b(mutableState);
        }
        b(mutableState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$DropdownOptions$lambda$3(MutableState mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f13811b + 65;
        f13810a = i3 % 128;
        int i4 = i3 % 2;
        d((MutableState<Boolean>) mutableState, z2);
        int i5 = f13810a + 25;
        f13811b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$Preview_FormsSelectInputScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13811b + 7;
        f13810a = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        int i6 = f13810a + 121;
        f13811b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    static final class f extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13841a = 0;

        /* JADX INFO: renamed from: b */
        private static int f13842b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function2<String, String, Unit> f13843c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ FormsSelectInputUiState f13844e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13842b + 83;
            f13841a = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f13841a + 115;
            f13842b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            return unit;
        }

        private void b(String str) {
            int i2 = 2 % 2;
            int i3 = f13841a + 51;
            f13842b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.f13843c.invoke(this.f13844e.getId(), str);
            int i5 = f13842b + 39;
            f13841a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super String, ? super String, Unit> function2, FormsSelectInputUiState formsSelectInputUiState) {
            super(1);
            this.f13843c = function2;
            this.f13844e = formsSelectInputUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FormsSelectInputScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState r67, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt.FormsSelectInputScreen(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean b(MutableState<Boolean> mutableState) {
        int i2 = 2 % 2;
        int i3 = f13811b + 95;
        f13810a = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = mutableState.getValue().booleanValue();
        int i5 = f13811b + 11;
        f13810a = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static final void d(MutableState<Boolean> mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f13811b + 43;
        f13810a = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(z2);
        if (i4 == 0) {
            mutableState.setValue(boolValueOf);
            int i5 = f13811b + 65;
            f13810a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
                return;
            }
            return;
        }
        mutableState.setValue(boolValueOf);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13833a = 0;

        /* JADX INFO: renamed from: b */
        public static final d f13834b = new d();

        /* JADX INFO: renamed from: c */
        private static int f13835c = 1;

        /* JADX INFO: renamed from: d */
        private static int f13836d = 1;

        /* JADX INFO: renamed from: e */
        private static int f13837e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f13837e + 19;
            f13836d = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 21 / 0;
            }
            return unit;
        }

        private static void c(String str) {
            int i2 = 2 % 2;
            int i3 = f13836d + 85;
            f13837e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = 71 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
            }
            int i5 = f13836d + 71;
            f13837e = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f13833a + 111;
            f13835c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
        }

        d() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13815a = 1;

        /* JADX INFO: renamed from: b */
        private static int f13816b = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ MutableState<Boolean> f13817d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13816b + 85;
            f13815a = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13815a + 39;
            f13816b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer, int i2) {
            ImageVector keyboardArrowDown;
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f13816b + 107;
                f13815a = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734565641, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.DropdownOptions.<anonymous>.<anonymous> (FormsSelectInputScreen.kt:70)");
                int i6 = f13815a + 65;
                f13816b = i6 % 128;
                int i7 = i6 % 2;
            }
            if (!FormsSelectInputScreenKt.access$DropdownOptions$lambda$2(this.f13817d)) {
                keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(Icons.Filled.INSTANCE);
            } else {
                int i8 = f13815a + 49;
                f13816b = i8 % 128;
                int i9 = i8 % 2;
                keyboardArrowDown = KeyboardArrowUpKt.getKeyboardArrowUp(Icons.Filled.INSTANCE);
            }
            IconKt.m2168Iconww6aTOc(keyboardArrowDown, (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (!(!ComposerKt.isTraceInProgress())) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState<Boolean> mutableState) {
            super(2);
            this.f13817d = mutableState;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f13838b = 1;

        /* JADX INFO: renamed from: d */
        private static int f13839d = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ MutableState<Boolean> f13840c;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13839d + 53;
            f13838b = i3 % 128;
            int i4 = i3 % 2;
            FormsSelectInputScreenKt.access$DropdownOptions$lambda$3(this.f13840c, true);
            int i5 = f13839d + 15;
            f13838b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13839d + 61;
            f13838b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13838b + 71;
            f13839d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 17 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MutableState<Boolean> mutableState) {
            super(0);
            this.f13840c = mutableState;
        }
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f13812b = 1;

        /* JADX INFO: renamed from: e */
        private static int f13813e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ MutableState<Boolean> f13814d;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f13812b + 27;
            f13813e = i3 % 128;
            int i4 = i3 % 2;
            FormsSelectInputScreenKt.access$DropdownOptions$lambda$3(this.f13814d, false);
            int i5 = f13813e + 31;
            f13812b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13812b + 25;
            f13813e = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f13812b + 19;
            f13813e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState<Boolean> mutableState) {
            super(0);
            this.f13814d = mutableState;
        }
    }

    public static final class c extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13818a = 0;

        /* JADX INFO: renamed from: d */
        private static int f13819d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ List<String> f13820b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ MutableState<Boolean> f13821c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Function1<String, Unit> f13822e;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13818a + 111;
            f13819d = i3 % 128;
            int i4 = i3 % 2;
            b(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13818a + 37;
            f13819d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 20 / 0;
            }
            return unit;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt$c$c */
        public static final class C0250c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* JADX INFO: renamed from: a */
            public static int f13828a = 0;

            /* JADX INFO: renamed from: c */
            private static int f13829c = 0;

            /* JADX INFO: renamed from: d */
            private static int f13830d = 1;

            /* JADX INFO: renamed from: e */
            public static int f13831e = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ String f13832b;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
                int i2 = 2 % 2;
                int i3 = f13829c + 43;
                f13830d = i3 % 128;
                int i4 = i3 % 2;
                b(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i5 = f13830d + 1;
                f13829c = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            private void b(Composer composer, int i2) {
                int i3 = 2 % 2;
                if ((i2 & 11) == 2) {
                    int i4 = f13829c + 23;
                    f13830d = i4 % 128;
                    int i5 = i4 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    int i6 = f13830d + 41;
                    f13829c = i6 % 128;
                    if (i6 % 2 != 0) {
                        ComposerKt.traceEventStart(-859802085, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.DropdownOptions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FormsSelectInputScreen.kt:91)");
                        throw null;
                    }
                    ComposerKt.traceEventStart(-859802085, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.DropdownOptions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FormsSelectInputScreen.kt:91)");
                }
                TextKt.m2711Text4IGK_g(this.f13832b, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            public static int e() {
                int i2 = f13828a;
                int i3 = i2 % 7234325;
                f13828a = i2 + 1;
                if (i3 != 0) {
                    return f13831e;
                }
                int iNextInt = new Random().nextInt(893736889);
                f13831e = iNextInt;
                return iNextInt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0250c(String str) {
                super(2);
                this.f13832b = str;
            }
        }

        static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: d */
            private static int f13823d = 1;

            /* JADX INFO: renamed from: e */
            private static int f13824e = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ Function1<String, Unit> f13825a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ String f13826b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ MutableState<Boolean> f13827c;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f13823d + 29;
                f13824e = i3 % 128;
                int i4 = i3 % 2;
                b();
                if (i4 != 0) {
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i5 = f13823d + 103;
                f13824e = i5 % 128;
                int i6 = i5 % 2;
                return unit2;
            }

            private void b() {
                int i2 = 2 % 2;
                int i3 = f13823d + 109;
                f13824e = i3 % 128;
                int i4 = i3 % 2;
                this.f13825a.invoke(this.f13826b);
                FormsSelectInputScreenKt.access$DropdownOptions$lambda$3(this.f13827c, false);
                int i5 = f13823d + 81;
                f13824e = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super String, Unit> function1, String str, MutableState<Boolean> mutableState) {
                super(0);
                this.f13825a = function1;
                this.f13826b = str;
                this.f13827c = mutableState;
            }
        }

        private void b(ColumnScope columnScope, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f13818a + 125;
            f13819d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i2 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f13819d + 75;
                f13818a = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventStart(17723291, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.DropdownOptions.<anonymous>.<anonymous> (FormsSelectInputScreen.kt:88)");
            }
            List<String> list = this.f13820b;
            Function1<String, Unit> function1 = this.f13822e;
            MutableState<Boolean> mutableState = this.f13821c;
            for (String str : list) {
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -859802085, true, new C0250c(str));
                composer.startReplaceableGroup(700447971);
                boolean zChangedInstance = composer.changedInstance(function1) | composer.changed(str) | composer.changed(mutableState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new a(function1, str, mutableState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                AndroidMenu_androidKt.DropdownMenuItem(composableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                int i8 = f13818a + 105;
                f13819d = i8 % 128;
                int i9 = i8 % 2;
            }
            if (ComposerKt.isTraceInProgress()) {
                int i10 = f13818a + 107;
                f13819d = i10 % 128;
                int i11 = i10 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<String> list, Function1<? super String, Unit> function1, MutableState<Boolean> mutableState) {
            super(3);
            this.f13820b = list;
            this.f13822e = function1;
            this.f13821c = mutableState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(java.util.List<java.lang.String> r37, java.lang.String r38, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt.e(java.util.List, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class i extends Lambda implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13856a = 1;

        /* JADX INFO: renamed from: b */
        public static final i f13857b = new i();

        /* JADX INFO: renamed from: c */
        private static int f13858c = 1;

        /* JADX INFO: renamed from: d */
        private static int f13859d = 0;

        /* JADX INFO: renamed from: e */
        private static int f13860e = 0;

        private static void b(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13856a + 89;
            f13860e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i5 = f13860e + 103;
            f13856a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f13856a + 9;
            f13860e = i3 % 128;
            int i4 = i3 % 2;
            b(str, str2);
            Unit unit = Unit.INSTANCE;
            int i5 = f13856a + 13;
            f13860e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f13859d + 35;
            f13858c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
        }

        i() {
            super(2);
        }
    }

    private static final void d(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f13811b + 85;
        f13810a = i4 % 128;
        if (i4 % 2 == 0) {
            Composer composerStartRestartGroup = composer.startRestartGroup(1856478897);
            if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    int i5 = f13810a + 123;
                    f13811b = i5 % 128;
                    int i6 = i5 % 2;
                    ComposerKt.traceEventStart(1856478897, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.view.Preview_FormsSelectInputScreen (FormsSelectInputScreen.kt:106)");
                    if (i6 == 0) {
                        throw null;
                    }
                }
                FormsSelectInputScreen(FormsSelectInputUiState.f13357d.previewData$onboard_release(), i.f13857b, composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    int i7 = f13810a + 87;
                    f13811b = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new g(i2));
                return;
            }
            return;
        }
        composer.startRestartGroup(1856478897);
        throw null;
    }

    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        public static int f13848a = 0;

        /* JADX INFO: renamed from: d */
        public static int f13849d = 0;

        /* JADX INFO: renamed from: h */
        private static int f13850h = 0;

        /* JADX INFO: renamed from: i */
        private static int f13851i = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f13852b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function1<String, Unit> f13853c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ List<String> f13854e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ int f13855f;

        public static int b() {
            int i2 = f13849d;
            int i3 = i2 % 8554112;
            f13849d = i2 + 1;
            if (i3 != 0) {
                return f13848a;
            }
            int iMyUid = Process.myUid();
            f13848a = iMyUid;
            return iMyUid;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13851i + 115;
            f13850h = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13850h + 21;
            f13851i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13850h + 51;
            f13851i = i3 % 128;
            int i4 = i3 % 2;
            FormsSelectInputScreenKt.access$DropdownOptions(this.f13854e, this.f13852b, this.f13853c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13855f | 1));
            int i5 = f13850h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13851i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(List<String> list, String str, Function1<? super String, Unit> function1, int i2) {
            super(2);
            this.f13854e = list;
            this.f13852b = str;
            this.f13853c = function1;
            this.f13855f = i2;
        }
    }

    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f13845c = 0;

        /* JADX INFO: renamed from: d */
        private static int f13846d = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f13847e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13846d + 11;
            f13845c = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13845c + 17;
            f13846d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13846d + 79;
            f13845c = i3 % 128;
            int i4 = i3 % 2;
            FormsSelectInputScreenKt.access$Preview_FormsSelectInputScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.f13847e | 1));
            int i5 = f13846d + 31;
            f13845c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(2);
            this.f13847e = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f13861b = 1;

        /* JADX INFO: renamed from: c */
        private static int f13862c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Function2<String, String, Unit> f13863a;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f13864d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ FormsSelectInputUiState f13865e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13862c + 7;
            f13861b = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13862c + 7;
            f13861b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13861b + 45;
            f13862c = i3 % 128;
            int i4 = i3 % 2;
            FormsSelectInputScreenKt.FormsSelectInputScreen(this.f13865e, this.f13863a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13864d | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(FormsSelectInputUiState formsSelectInputUiState, Function2<? super String, ? super String, Unit> function2, int i2) {
            super(2);
            this.f13865e = formsSelectInputUiState;
            this.f13863a = function2;
            this.f13864d = i2;
        }
    }
}
