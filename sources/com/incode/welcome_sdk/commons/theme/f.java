package com.incode.welcome_sdk.commons.theme;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.theme.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal<IncodeColorScheme> f5616b = CompositionLocalKt.staticCompositionLocalOf(e.f5641d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal<IncodeColorPalette> f5617c = CompositionLocalKt.staticCompositionLocalOf(c.f5633a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ProvidableCompositionLocal<j> f5618d = CompositionLocalKt.staticCompositionLocalOf(b.f5629b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ProvidableCompositionLocal<IncodeUXConfig> f5619e = CompositionLocalKt.staticCompositionLocalOf(a.f5623a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5620f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f5621g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f5622i = 1;

    static final class e extends Lambda implements Function0<IncodeColorScheme> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5638a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5639b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5640c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f5641d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5642e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IncodeColorScheme invoke() {
            int i2 = 2 % 2;
            int i3 = f5640c + 33;
            f5639b = i3 % 128;
            int i4 = i3 % 2;
            IncodeColorScheme incodeColorSchemeD = d();
            if (i4 != 0) {
                int i5 = 26 / 0;
            }
            return incodeColorSchemeD;
        }

        private static IncodeColorScheme d() {
            int i2 = 2 % 2;
            IncodeColorScheme incodeColorScheme = new IncodeColorScheme(new IncodeColorPalette(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, (DefaultConstructorMarker) null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -2, 16383, null);
            int i3 = f5640c + 27;
            f5639b = i3 % 128;
            int i4 = i3 % 2;
            return incodeColorScheme;
        }

        static {
            int i2 = f5642e + 117;
            f5638a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        e() {
            super(0);
        }
    }

    static {
        int i2 = f5621g + 13;
        f5620f = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final ProvidableCompositionLocal<IncodeColorScheme> a() {
        int i2 = 2 % 2;
        int i3 = f5622i;
        int i4 = i3 + 93;
        f5615a = i4 % 128;
        int i5 = i4 % 2;
        ProvidableCompositionLocal<IncodeColorScheme> providableCompositionLocal = f5616b;
        int i6 = i3 + 43;
        f5615a = i6 % 128;
        int i7 = i6 % 2;
        return providableCompositionLocal;
    }

    static final class c extends Lambda implements Function0<IncodeColorPalette> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5633a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5634b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5635c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5636d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5637e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IncodeColorPalette invoke() {
            IncodeColorPalette incodeColorPaletteB;
            int i2 = 2 % 2;
            int i3 = f5635c + 113;
            f5636d = i3 % 128;
            if (i3 % 2 == 0) {
                incodeColorPaletteB = b();
                int i4 = 34 / 0;
            } else {
                incodeColorPaletteB = b();
            }
            int i5 = f5636d + 73;
            f5635c = i5 % 128;
            int i6 = i5 % 2;
            return incodeColorPaletteB;
        }

        private static IncodeColorPalette b() {
            int i2 = 2 % 2;
            IncodeColorPalette incodeColorPalette = new IncodeColorPalette(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
            int i3 = f5636d + 29;
            f5635c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
            }
            return incodeColorPalette;
        }

        static {
            int i2 = f5637e + 67;
            f5634b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(0);
        }
    }

    public static final ProvidableCompositionLocal<IncodeColorPalette> c() {
        int i2 = 2 % 2;
        int i3 = f5615a;
        int i4 = i3 + 15;
        f5622i = i4 % 128;
        int i5 = i4 % 2;
        ProvidableCompositionLocal<IncodeColorPalette> providableCompositionLocal = f5617c;
        int i6 = i3 + 99;
        f5622i = i6 % 128;
        int i7 = i6 % 2;
        return providableCompositionLocal;
    }

    static final class b extends Lambda implements Function0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5628a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f5629b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5630c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5631d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5632e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ j invoke() {
            int i2 = 2 % 2;
            int i3 = f5628a + 115;
            f5630c = i3 % 128;
            if (i3 % 2 == 0) {
                d();
                throw null;
            }
            j jVarD = d();
            int i4 = f5628a + 107;
            f5630c = i4 % 128;
            int i5 = i4 % 2;
            return jVarD;
        }

        private static j d() {
            int i2 = 2 % 2;
            j.e eVar = j.f5724a;
            j jVarB = j.e.b(new IncodeThemeConfig((IncodeTypography) null, (IncodeColorPalette) null, (DisplayMode) null, 7, (DefaultConstructorMarker) null), new IncodeColorSchemeLight(new IncodeColorPalette(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, (DefaultConstructorMarker) null)));
            int i3 = f5630c + 73;
            f5628a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
            }
            return jVarB;
        }

        static {
            int i2 = f5631d + 7;
            f5632e = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(0);
        }
    }

    public static final ProvidableCompositionLocal<j> b() {
        int i2 = 2 % 2;
        int i3 = f5622i;
        int i4 = i3 + 93;
        f5615a = i4 % 128;
        int i5 = i4 % 2;
        ProvidableCompositionLocal<j> providableCompositionLocal = f5618d;
        int i6 = i3 + 71;
        f5615a = i6 % 128;
        int i7 = i6 % 2;
        return providableCompositionLocal;
    }

    static final class a extends Lambda implements Function0<IncodeUXConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5623a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5624b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5625c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5626d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5627e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IncodeUXConfig invoke() {
            int i2 = 2 % 2;
            int i3 = f5625c + 103;
            f5626d = i3 % 128;
            int i4 = i3 % 2;
            IncodeUXConfig incodeUXConfigC = c();
            if (i4 == 0) {
                int i5 = 1 / 0;
            }
            return incodeUXConfigC;
        }

        private static IncodeUXConfig c() {
            int i2 = 2 % 2;
            IncodeUXConfig incodeUXConfigBuild = new IncodeUXConfig.Builder().build();
            int i3 = f5625c + 9;
            f5626d = i3 % 128;
            if (i3 % 2 != 0) {
                return incodeUXConfigBuild;
            }
            throw null;
        }

        static {
            int i2 = f5627e + 89;
            f5624b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
        }

        a() {
            super(0);
        }
    }

    public static final ProvidableCompositionLocal<IncodeUXConfig> d() {
        int i2 = 2 % 2;
        int i3 = f5615a;
        int i4 = i3 + 19;
        f5622i = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ProvidableCompositionLocal<IncodeUXConfig> providableCompositionLocal = f5619e;
        int i5 = i3 + 57;
        f5622i = i5 % 128;
        if (i5 % 2 != 0) {
            return providableCompositionLocal;
        }
        throw null;
    }
}
