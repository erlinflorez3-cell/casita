package com.incode.welcome_sdk.commons.theme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeColorSchemeDark extends IncodeColorScheme {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5459a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5460b = 103 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5461c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5462e = 0;
    private final IncodeColorPalette incodeColorPalette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeColorSchemeDark(IncodeColorPalette incodeColorPalette) {
        super(incodeColorPalette, incodeColorPalette.m7950getBrand4000d7_KjU(), incodeColorPalette.m7947getBlack0d7_KjU(), incodeColorPalette.m7970getNeutral0d7_KjU(), incodeColorPalette.m7954getBrand9000d7_KjU(), incodeColorPalette.m7950getBrand4000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7953getBrand6000d7_KjU(), incodeColorPalette.m7947getBlack0d7_KjU(), incodeColorPalette.m7965getGray9000d7_KjU(), incodeColorPalette.m7964getGray8000d7_KjU(), incodeColorPalette.m7963getGray7000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7959getGray2000d7_KjU(), incodeColorPalette.m7958getGray1000d7_KjU(), incodeColorPalette.m7961getGray500d7_KjU(), incodeColorPalette.m7969getNegative9500d7_KjU(), incodeColorPalette.m7977getWarning9500d7_KjU(), incodeColorPalette.m7973getPositive8000d7_KjU(), incodeColorPalette.m7967getNegative5000d7_KjU(), incodeColorPalette.m7974getWarning4000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7958getGray1000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7961getGray500d7_KjU(), incodeColorPalette.m7967getNegative5000d7_KjU(), incodeColorPalette.m7974getWarning4000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7963getGray7000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7967getNegative5000d7_KjU(), incodeColorPalette.m7974getWarning4000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7961getGray500d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7957getGray00d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7956getBrandSecondary5000d7_KjU(), incodeColorPalette.m7967getNegative5000d7_KjU(), incodeColorPalette.m7974getWarning4000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), null);
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        this.incodeColorPalette = incodeColorPalette;
    }

    static {
        if (103 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f5459a + 1;
            f5462e = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj instanceof IncodeColorSchemeDark) {
            return Intrinsics.areEqual(this.incodeColorPalette, ((IncodeColorSchemeDark) obj).incodeColorPalette);
        }
        int i5 = f5462e + 97;
        f5459a = i5 % 128;
        return i5 % 2 == 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5462e + 73;
        f5459a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.incodeColorPalette.hashCode();
        int i5 = f5459a + 19;
        f5462e = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f5459a + 31;
        f5462e = i3 % 128;
        int i4 = i3 % 2;
        String str = "IncodeColorSchemeDark(incodeColorPalette=" + this.incodeColorPalette + ")";
        int i5 = f5462e + 123;
        f5459a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ IncodeColorSchemeDark copy$default(IncodeColorSchemeDark incodeColorSchemeDark, IncodeColorPalette incodeColorPalette, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f5459a + 55;
        f5462e = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 1) != 0) {
            incodeColorPalette = incodeColorSchemeDark.incodeColorPalette;
        }
        IncodeColorSchemeDark incodeColorSchemeDarkCopy = incodeColorSchemeDark.copy(incodeColorPalette);
        int i6 = f5462e + 55;
        f5459a = i6 % 128;
        if (i6 % 2 != 0) {
            return incodeColorSchemeDarkCopy;
        }
        throw null;
    }

    public final IncodeColorSchemeDark copy(IncodeColorPalette incodeColorPalette) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        IncodeColorSchemeDark incodeColorSchemeDark = new IncodeColorSchemeDark(incodeColorPalette);
        int i3 = f5459a + 109;
        f5462e = i3 % 128;
        int i4 = i3 % 2;
        return incodeColorSchemeDark;
    }

    private final IncodeColorPalette component1() {
        int i2 = 2 % 2;
        int i3 = f5459a + 27;
        int i4 = i3 % 128;
        f5462e = i4;
        int i5 = i3 % 2;
        IncodeColorPalette incodeColorPalette = this.incodeColorPalette;
        int i6 = i4 + 53;
        f5459a = i6 % 128;
        int i7 = i6 % 2;
        return incodeColorPalette;
    }
}
