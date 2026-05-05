package com.incode.welcome_sdk.ui.id_capture;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.drew.metadata.wav.WavDirectory;
import com.incode.welcome_sdk.commons.theme.IncodeColorScheme;
import com.incode.welcome_sdk.commons.theme.f;
import com.incode.welcome_sdk.commons.theme.g;
import com.incode.welcome_sdk.commons.theme.i;
import com.incode.welcome_sdk.ui.id_capture.BorderStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class StatusColor extends Enum<StatusColor> {

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ StatusColor[] f14904c;

    /* JADX INFO: renamed from: f */
    private static int f14907f = 0;

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ EnumEntries f14908g;

    /* JADX INFO: renamed from: h */
    private static int f14909h = 0;

    /* JADX INFO: renamed from: i */
    private static int f14910i = 1;

    /* JADX INFO: renamed from: j */
    private static int f14911j = 1;

    /* JADX INFO: renamed from: d */
    public static final StatusColor f14905d = new StatusColor("SUCCESS", 0);

    /* JADX INFO: renamed from: b */
    public static final StatusColor f14903b = new StatusColor("NEUTRAL", 1);

    /* JADX INFO: renamed from: e */
    public static final StatusColor f14906e = new StatusColor("ERROR", 2);

    /* JADX INFO: renamed from: a */
    public static final StatusColor f14902a = new StatusColor(WavDirectory.LIST_INFO, 3);

    private StatusColor(String str, int i2) {
        super(str, i2);
    }

    static {
        StatusColor[] statusColorArrD = d();
        f14904c = statusColorArrD;
        f14908g = EnumEntriesKt.enumEntries(statusColorArrD);
        int i2 = f14911j + 97;
        f14909h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final BorderStyle toBorderStyle(Composer composer, int i2) {
        BorderStyle.Solid solid;
        int i3 = 2 % 2;
        composer.startReplaceableGroup(1093815719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1093815719, i2, -1, "com.incode.welcome_sdk.ui.id_capture.StatusColor.toBorderStyle (CaptureUiState.kt:501)");
            int i4 = f14907f + 13;
            f14910i = i4 % 128;
            int i5 = i4 % 2;
        }
        ProvidableCompositionLocal<IncodeColorScheme> providableCompositionLocalA = f.a();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocalA);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IncodeColorScheme incodeColorScheme = (IncodeColorScheme) objConsume;
        int i6 = WhenMappings.f14913d[ordinal()];
        if (i6 == 1) {
            solid = new BorderStyle.Solid(incodeColorScheme.m7982getBorderPositive0d7_KjU(), null);
        } else if (i6 == 2) {
            solid = new BorderStyle.Solid(incodeColorScheme.m7981getBorderNegative0d7_KjU(), null);
        } else if (i6 == 3) {
            solid = new BorderStyle.Solid(incodeColorScheme.m7978getBorderAccent0d7_KjU(), null);
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            g.b bVar = g.b.f5657e;
            long jC = g.b.c();
            i iVar = i.f5712e;
            solid = new BorderStyle.Gradient(jC, i.e(), null);
            int i7 = f14907f + 75;
            f14910i = i7 % 128;
            int i8 = i7 % 2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return solid;
    }

    /* JADX INFO: renamed from: toIconColor-WaAFU9c */
    public final long m8484toIconColorWaAFU9c(Composer composer, int i2) {
        long jM8017getIconPositive0d7_KjU;
        int i3 = 2 % 2;
        int i4 = f14910i + 51;
        f14907f = i4 % 128;
        int i5 = i4 % 2;
        composer.startReplaceableGroup(-758417600);
        if (ComposerKt.isTraceInProgress()) {
            int i6 = f14907f + 77;
            f14910i = i6 % 128;
            if (i6 % 2 == 0) {
                ComposerKt.traceEventStart(-758417600, i2, -1, "com.incode.welcome_sdk.ui.id_capture.StatusColor.toIconColor (CaptureUiState.kt:515)");
                throw null;
            }
            ComposerKt.traceEventStart(-758417600, i2, -1, "com.incode.welcome_sdk.ui.id_capture.StatusColor.toIconColor (CaptureUiState.kt:515)");
        }
        ProvidableCompositionLocal<IncodeColorScheme> providableCompositionLocalA = f.a();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocalA);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IncodeColorScheme incodeColorScheme = (IncodeColorScheme) objConsume;
        int i7 = WhenMappings.f14913d[ordinal()];
        if (i7 == 1) {
            jM8017getIconPositive0d7_KjU = incodeColorScheme.m8017getIconPositive0d7_KjU();
        } else if (i7 == 2) {
            jM8017getIconPositive0d7_KjU = incodeColorScheme.m8016getIconNegative0d7_KjU();
        } else if (i7 == 3) {
            jM8017getIconPositive0d7_KjU = incodeColorScheme.m8014getIconAccent0d7_KjU();
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            jM8017getIconPositive0d7_KjU = incodeColorScheme.m8018getIconPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            int i8 = f14910i + 59;
            f14907f = i8 % 128;
            int i9 = i8 % 2;
            ComposerKt.traceEventEnd();
            if (i9 != 0) {
                int i10 = 92 / 0;
            }
        }
        composer.endReplaceableGroup();
        return jM8017getIconPositive0d7_KjU;
    }

    private static final /* synthetic */ StatusColor[] d() {
        int i2 = 2 % 2;
        int i3 = f14907f + 101;
        int i4 = i3 % 128;
        f14910i = i4;
        int i5 = i3 % 2;
        StatusColor[] statusColorArr = {f14905d, f14903b, f14906e, f14902a};
        int i6 = i4 + 11;
        f14907f = i6 % 128;
        if (i6 % 2 == 0) {
            return statusColorArr;
        }
        throw null;
    }

    public static EnumEntries<StatusColor> getEntries() {
        int i2 = 2 % 2;
        int i3 = f14907f;
        int i4 = i3 + 99;
        f14910i = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<StatusColor> enumEntries = f14908g;
        int i6 = i3 + 89;
        f14910i = i6 % 128;
        if (i6 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        private static int f14912a = 1;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f14913d;

        /* JADX INFO: renamed from: e */
        private static int f14914e = 0;

        static {
            int[] iArr = new int[StatusColor.values().length];
            try {
                iArr[StatusColor.f14905d.ordinal()] = 1;
                int i2 = f14914e + 125;
                f14912a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusColor.f14906e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusColor.f14902a.ordinal()] = 3;
                int i5 = f14914e + 103;
                f14912a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusColor.f14903b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14913d = iArr;
        }
    }

    public static StatusColor valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f14907f + 105;
        f14910i = i3 % 128;
        int i4 = i3 % 2;
        StatusColor statusColor = (StatusColor) Enum.valueOf(StatusColor.class, str);
        int i5 = f14910i + 7;
        f14907f = i5 % 128;
        int i6 = i5 % 2;
        return statusColor;
    }

    public static StatusColor[] values() {
        int i2 = 2 % 2;
        int i3 = f14910i + 69;
        f14907f = i3 % 128;
        int i4 = i3 % 2;
        StatusColor[] statusColorArr = (StatusColor[]) f14904c.clone();
        int i5 = f14907f + 93;
        f14910i = i5 % 128;
        int i6 = i5 % 2;
        return statusColorArr;
    }
}
