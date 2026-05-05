package com.incode.welcome_sdk.ui.id_capture;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.incode.welcome_sdk.commons.theme.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class IconTintType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ IconTintType[] f14642a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14644c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14645d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14647g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14648h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14649j = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final IconTintType f14646e = new IconTintType("INVERT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IconTintType f14643b = new IconTintType("NORMAL", 1);

    private IconTintType(String str, int i2) {
    }

    static {
        IconTintType[] iconTintTypeArrC = c();
        f14642a = iconTintTypeArrC;
        f14645d = EnumEntriesKt.enumEntries(iconTintTypeArrC);
        int i2 = f14647g + 81;
        f14649j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: toColor-WaAFU9c, reason: not valid java name */
    public final long m8483toColorWaAFU9c(Composer composer, int i2) {
        long jM7957getGray00d7_KjU;
        int i3 = 2 % 2;
        int i4 = f14644c + 105;
        f14648h = i4 % 128;
        int i5 = i4 % 2;
        composer.startReplaceableGroup(1371439420);
        if (!(!ComposerKt.isTraceInProgress())) {
            int i6 = f14644c + 105;
            f14648h = i6 % 128;
            int i7 = i6 % 2;
            ComposerKt.traceEventStart(1371439420, i2, -1, "com.incode.welcome_sdk.ui.id_capture.IconTintType.toColor (CaptureUiState.kt:549)");
        }
        int i8 = WhenMappings.f14651b[ordinal()];
        if (i8 == 1) {
            composer.startReplaceableGroup(1658035054);
            h hVar = h.f5694b;
            jM7957getGray00d7_KjU = h.b(composer).m7957getGray00d7_KjU();
            composer.endReplaceableGroup();
            int i9 = f14648h + 73;
            f14644c = i9 % 128;
            int i10 = i9 % 2;
        } else {
            if (i8 != 2) {
                composer.startReplaceableGroup(1658011173);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(1658035102);
            h hVar2 = h.f5694b;
            jM7957getGray00d7_KjU = h.a(composer).m8019getIconSecondary0d7_KjU();
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            int i11 = f14648h + 61;
            f14644c = i11 % 128;
            int i12 = i11 % 2;
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM7957getGray00d7_KjU;
    }

    private static final /* synthetic */ IconTintType[] c() {
        int i2 = 2 % 2;
        int i3 = f14644c + 1;
        int i4 = i3 % 128;
        f14648h = i4;
        int i5 = i3 % 2;
        IconTintType[] iconTintTypeArr = {f14646e, f14643b};
        int i6 = i4 + 107;
        f14644c = i6 % 128;
        int i7 = i6 % 2;
        return iconTintTypeArr;
    }

    public static EnumEntries<IconTintType> getEntries() {
        int i2 = 2 % 2;
        int i3 = f14644c + 53;
        f14648h = i3 % 128;
        if (i3 % 2 != 0) {
            return f14645d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14650a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14652c = 0;

        static {
            int[] iArr = new int[IconTintType.values().length];
            try {
                iArr[IconTintType.f14646e.ordinal()] = 1;
                int i2 = f14652c + 23;
                f14650a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconTintType.f14643b.ordinal()] = 2;
                int i5 = f14652c + 43;
                f14650a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            f14651b = iArr;
        }
    }

    public static IconTintType valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f14648h + 105;
        f14644c = i3 % 128;
        int i4 = i3 % 2;
        IconTintType iconTintType = (IconTintType) Enum.valueOf(IconTintType.class, str);
        if (i4 == 0) {
            return iconTintType;
        }
        throw null;
    }

    public static IconTintType[] values() {
        int i2 = 2 % 2;
        int i3 = f14644c + 75;
        f14648h = i3 % 128;
        int i4 = i3 % 2;
        IconTintType[] iconTintTypeArr = (IconTintType[]) f14642a.clone();
        int i5 = f14644c + 1;
        f14648h = i5 % 128;
        int i6 = i5 % 2;
        return iconTintTypeArr;
    }
}
