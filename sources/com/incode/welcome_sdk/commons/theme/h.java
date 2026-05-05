package com.incode.welcome_sdk.commons.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.DisplayMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    private static int f5693a = 1;

    /* JADX INFO: renamed from: b */
    public static final h f5694b = new h();

    /* JADX INFO: renamed from: c */
    private static int f5695c = 0;

    /* JADX INFO: renamed from: d */
    private static int f5696d = 1;

    /* JADX INFO: renamed from: e */
    private static int f5697e = 0;

    private h() {
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f5698c = 1;

        /* JADX INFO: renamed from: e */
        private static int f5699e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Function2<Composer, Integer, Unit> f5700a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f5699e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5698c = i3 % 128;
            int i4 = i3 % 2;
            c(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r2 = 2
                int r0 = r2 % r2
                r0 = r13 & 11
                r8 = r12
                if (r0 != r2) goto L32
                int r0 = com.incode.welcome_sdk.commons.theme.h.a.f5698c
                int r1 = r0 + 69
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.h.a.f5699e = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L2c
                boolean r1 = r8.getSkipping()
                r0 = 90
                int r0 = r0 / 0
                r0 = 1
                r1 = r1 ^ r0
                if (r1 == r0) goto L32
            L1f:
                r8.skipToGroupEnd()
            L22:
                int r0 = com.incode.welcome_sdk.commons.theme.h.a.f5698c
                int r1 = r0 + 47
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.theme.h.a.f5699e = r0
                int r1 = r1 % r2
                return
            L2c:
                boolean r0 = r8.getSkipping()
                if (r0 != 0) goto L1f
            L32:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L41
                r3 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.commons.theme.IncodeTheme.IncodeComposeTheme.<anonymous> (IncodeTheme.kt:69)"
                r0 = 78888821(0x4b3bf75, float:4.2258523E-36)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r3, r1)
            L41:
                androidx.compose.runtime.ProvidableCompositionLocal r0 = com.incode.welcome_sdk.commons.theme.f.a()
                androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
                r3 = 2023513938(0x789c5f52, float:2.5372864E34)
                java.lang.String r1 = "CC:CompositionLocal.kt#9igjgp"
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r3, r1)
                java.lang.Object r0 = r8.consume(r0)
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
                com.incode.welcome_sdk.commons.theme.IncodeColorScheme r0 = (com.incode.welcome_sdk.commons.theme.IncodeColorScheme) r0
                androidx.compose.material3.ColorScheme r4 = r0.toMaterial()
                androidx.compose.runtime.ProvidableCompositionLocal r0 = com.incode.welcome_sdk.commons.theme.f.b()
                androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r3, r1)
                java.lang.Object r0 = r8.consume(r0)
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
                com.incode.welcome_sdk.commons.theme.j r0 = (com.incode.welcome_sdk.commons.theme.j) r0
                androidx.compose.material3.Typography r6 = r0.l()
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r7 = r11.f5700a
                r9 = 0
                r10 = 2
                r5 = 0
                androidx.compose.material3.MaterialThemeKt.MaterialTheme(r4, r5, r6, r7, r8, r9, r10)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L22
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.h.a.c(androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f5700a = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.incode.welcome_sdk.DisplayMode r22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.h.d(com.incode.welcome_sdk.DisplayMode, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static IncodeColorPalette b(Composer composer) {
        int i2 = 2 % 2;
        int i3 = f5695c + 11;
        f5696d = i3 % 128;
        if (i3 % 2 == 0) {
            composer.startReplaceableGroup(29967232);
            ComposerKt.isTraceInProgress();
            throw null;
        }
        composer.startReplaceableGroup(29967232);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29967232, 6, -1, "com.incode.welcome_sdk.commons.theme.IncodeTheme.<get-colorPalette> (IncodeTheme.kt:79)");
        }
        ProvidableCompositionLocal<IncodeColorPalette> providableCompositionLocalC = f.c();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocalC);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IncodeColorPalette incodeColorPalette = (IncodeColorPalette) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        int i4 = f5696d + 77;
        f5695c = i4 % 128;
        if (i4 % 2 == 0) {
            return incodeColorPalette;
        }
        throw null;
    }

    public static IncodeColorScheme a(Composer composer) {
        int i2 = 2 % 2;
        int i3 = f5695c + 61;
        f5696d = i3 % 128;
        if (i3 % 2 == 0) {
            composer.startReplaceableGroup(-812851710);
            ComposerKt.isTraceInProgress();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        composer.startReplaceableGroup(-812851710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-812851710, 6, -1, "com.incode.welcome_sdk.commons.theme.IncodeTheme.<get-colorScheme> (IncodeTheme.kt:83)");
        }
        ProvidableCompositionLocal<IncodeColorScheme> providableCompositionLocalA = f.a();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocalA);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IncodeColorScheme incodeColorScheme = (IncodeColorScheme) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
            int i4 = f5696d + 103;
            f5695c = i4 % 128;
            int i5 = i4 % 2;
        }
        composer.endReplaceableGroup();
        return incodeColorScheme;
    }

    public static j d(Composer composer) {
        int i2 = 2 % 2;
        int i3 = f5696d + 65;
        f5695c = i3 % 128;
        int i4 = i3 % 2;
        composer.startReplaceableGroup(290044841);
        if (ComposerKt.isTraceInProgress()) {
            int i5 = f5695c + 87;
            f5696d = i5 % 128;
            ComposerKt.traceEventStart(290044841, i5 % 2 == 0 ? 8 : 6, -1, "com.incode.welcome_sdk.commons.theme.IncodeTheme.<get-typography> (IncodeTheme.kt:87)");
        }
        ProvidableCompositionLocal<j> providableCompositionLocalB = f.b();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocalB);
        ComposerKt.sourceInformationMarkerEnd(composer);
        j jVar = (j) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
            int i6 = f5696d + 117;
            f5695c = i6 % 128;
            int i7 = i6 % 2;
        }
        composer.endReplaceableGroup();
        return jVar;
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f */
        private static int f5701f = 1;

        /* JADX INFO: renamed from: g */
        private static int f5702g = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ int f5703a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function2<Composer, Integer, Unit> f5705c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f5706d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ DisplayMode f5707e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f5702g + 15;
            f5701f = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f5701f + 11;
            f5702g = i3 % 128;
            int i4 = i3 % 2;
            h.this.d(this.f5707e, this.f5705c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5703a | 1), this.f5706d);
            int i5 = f5702g + 43;
            f5701f = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(DisplayMode displayMode, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            this.f5707e = displayMode;
            this.f5705c = function2;
            this.f5703a = i2;
            this.f5706d = i3;
        }
    }

    static {
        int i2 = f5693a + 15;
        f5697e = i2 % 128;
        int i3 = i2 % 2;
    }
}
