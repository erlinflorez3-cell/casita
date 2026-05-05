package com.incode.welcome_sdk.ui.permission_onboarding.view;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionBottomSheetKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16667c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16668e = 0;

    public static final /* synthetic */ void access$BottomSheetContent(Function1 function1, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16668e + 71;
        f16667c = i4 % 128;
        int i5 = i4 % 2;
        d(function1, composer, i2);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f16667c + 3;
        f16668e = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewBottomSheetContent(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16667c + 123;
        f16668e = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f16668e + 85;
        f16667c = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class e extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16683a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16684b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16685c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f16686d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16687e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(SheetValue sheetValue) {
            int i2 = 2 % 2;
            int i3 = f16685c + 11;
            f16687e = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolC = c(sheetValue);
            int i5 = f16685c + 73;
            f16687e = i5 % 128;
            int i6 = i5 % 2;
            return boolC;
        }

        private static Boolean c(SheetValue sheetValue) {
            int i2 = 2 % 2;
            int i3 = f16685c + 123;
            f16687e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sheetValue, "");
                SheetValue sheetValue2 = SheetValue.Hidden;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(sheetValue, "");
            boolean z2 = false;
            if (sheetValue != SheetValue.Hidden) {
                int i4 = f16687e + 17;
                f16685c = i4 % 128;
                if (i4 % 2 == 0) {
                    z2 = true;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i5 = f16687e + 45;
            f16685c = i5 % 128;
            int i6 = i5 % 2;
            return boolValueOf;
        }

        static {
            int i2 = f16684b + 123;
            f16683a = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PermissionIntroBottomSheet(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit> r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionBottomSheetKt.PermissionIntroBottomSheet(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16688a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f16689b = new g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16690c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16691d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16692e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16690c + 9;
            f16691d = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            int i5 = f16691d + 39;
            f16690c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return unit;
        }

        static {
            int i2 = f16692e + 63;
            f16688a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        g() {
            super(0);
        }
    }

    static final class h extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16693a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16694d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16695b;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16694d + 73;
            f16693a = i3 % 128;
            int i4 = i3 % 2;
            a(columnScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16694d + 9;
            f16693a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(ColumnScope columnScope, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f16693a + 45;
            f16694d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i2 & 81) == 16) {
                int i6 = f16694d + 63;
                f16693a = i6 % 128;
                if (i6 % 2 != 0) {
                    composer.getSkipping();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                int i7 = f16693a + 85;
                f16694d = i7 % 128;
                int i8 = i7 % 2;
                ComposerKt.traceEventStart(1316838169, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionModalBottomSheet.<anonymous> (PermissionBottomSheet.kt:71)");
                int i9 = f16693a + 23;
                f16694d = i9 % 128;
                int i10 = i9 % 2;
            }
            PermissionBottomSheetKt.access$BottomSheetContent(this.f16695b, composer, 0);
            if (!ComposerKt.isTraceInProgress()) {
                return;
            }
            ComposerKt.traceEventEnd();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(3);
            this.f16695b = function1;
        }
    }

    public static final void PermissionModalBottomSheet(SheetState sheetState, Function1<? super PermissionOnboardingEvent, Unit> function1, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = f16668e + 51;
        f16667c = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(sheetState, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(441604732);
        if ((i2 & 14) == 0) {
            int i8 = f16668e + 105;
            f16667c = i8 % 128;
            int i9 = i8 % 2;
            i3 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                int i10 = f16667c + 107;
                f16668e = i10 % 128;
                int i11 = i10 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441604732, i3, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionModalBottomSheet (PermissionBottomSheet.kt:56)");
            }
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            long jM8054getSurfaceSecondary500d7_KjU = com.incode.welcome_sdk.commons.theme.h.a(composerStartRestartGroup).m8054getSurfaceSecondary500d7_KjU();
            com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            ModalBottomSheetKt.m2260ModalBottomSheetdYc4hso(g.f16689b, null, sheetState, 0.0f, null, com.incode.welcome_sdk.commons.theme.h.a(composerStartRestartGroup).m8054getSurfaceSecondary500d7_KjU(), jM8054getSurfaceSecondary500d7_KjU, 0.0f, 0L, null, null, new ModalBottomSheetProperties(SecureFlagPolicy.Inherit, true, false), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1316838169, true, new h(function1)), composerStartRestartGroup, ((i3 << 6) & 896) | 6, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 1946);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(sheetState, function1, i2));
            return;
        }
        int i12 = f16668e + 31;
        f16667c = i12 % 128;
        int i13 = i12 % 2;
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16677b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16678d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16679e;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f16677b + 13;
            f16678d = i3 % 128;
            int i4 = i3 % 2;
            this.f16679e.invoke(PermissionOnboardingEvent.OnIntroDoNotAllowPermissionClicked.f16511c);
            int i5 = f16678d + 17;
            f16677b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f16678d + 3;
            f16677b = i3 % 128;
            int i4 = i3 % 2;
            a();
            if (i4 == 0) {
                unit = Unit.INSTANCE;
                int i5 = 27 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f16677b + 5;
            f16678d = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16679e = function1;
        }
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16680c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16681d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16682b;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f16680c + 59;
            f16681d = i3 % 128;
            int i4 = i3 % 2;
            Function1<PermissionOnboardingEvent, Unit> function1 = this.f16682b;
            if (i4 == 0) {
                function1.invoke(PermissionOnboardingEvent.OnIntroAllowPermissionClicked.f16506a);
            } else {
                function1.invoke(PermissionOnboardingEvent.OnIntroAllowPermissionClicked.f16506a);
                int i5 = 97 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f16681d + 41;
            f16680c = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f16680c + 39;
            f16681d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super PermissionOnboardingEvent, Unit> function1) {
            super(0);
            this.f16682b = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionBottomSheetKt.d(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final void e(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1048874370);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1048874370, i2, -1, "com.incode.welcome_sdk.ui.permission_onboarding.view.PreviewBottomSheetContent (PermissionBottomSheet.kt:116)");
                int i4 = f16667c + 3;
                f16668e = i4 % 128;
                int i5 = i4 % 2;
            }
            com.incode.welcome_sdk.commons.theme.h.f5694b.d(DisplayMode.LIGHT, ComposableSingletons$PermissionBottomSheetKt.f16529c.m8512getLambda1$onboard_release(), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f16667c + 117;
                f16668e = i6 % 128;
                if (i6 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(i2));
            return;
        }
        int i7 = f16667c + 95;
        f16668e = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16669d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16670e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f16672b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16669d + 125;
            f16670e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16669d + 123;
            f16670e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16670e + 91;
            f16669d = i3 % 128;
            int i4 = i3 % 2;
            PermissionBottomSheetKt.PermissionIntroBottomSheet(this.f16671a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16672b | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16671a = function1;
            this.f16672b = i2;
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16673c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16674e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16675a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16676d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16673c + 109;
            f16674e = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16673c + 23;
            f16674e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            Function1<PermissionOnboardingEvent, Unit> function1;
            int i2;
            int i3 = 2 % 2;
            int i4 = f16673c + 125;
            f16674e = i4 % 128;
            if (i4 % 2 == 0) {
                function1 = this.f16675a;
                i2 = this.f16676d;
            } else {
                function1 = this.f16675a;
                i2 = this.f16676d | 1;
            }
            PermissionBottomSheetKt.access$BottomSheetContent(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2));
            int i5 = f16674e + 25;
            f16673c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16675a = function1;
            this.f16676d = i2;
        }
    }

    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16696c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16697e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f16698d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16696c + 113;
            f16697e = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16697e + 99;
            f16696c = i3 % 128;
            int i4 = i3 % 2;
            PermissionBottomSheetKt.access$PreviewBottomSheetContent(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16698d | 1));
            int i5 = f16696c + 39;
            f16697e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i2) {
            super(2);
            this.f16698d = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16699b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16700e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<PermissionOnboardingEvent, Unit> f16701a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f16702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ SheetState f16703d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16699b + 103;
            f16700e = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f16700e + 113;
            f16699b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16700e + 73;
            f16699b = i3 % 128;
            int i4 = i3 % 2;
            PermissionBottomSheetKt.PermissionModalBottomSheet(this.f16703d, this.f16701a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16702c | 1));
            int i5 = f16699b + 9;
            f16700e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(SheetState sheetState, Function1<? super PermissionOnboardingEvent, Unit> function1, int i2) {
            super(2);
            this.f16703d = sheetState;
            this.f16701a = function1;
            this.f16702c = i2;
        }
    }
}
