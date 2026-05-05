package com.incode.welcome_sdk.commons.theme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeColorSchemeLight extends IncodeColorScheme {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5463a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5464b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5465c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5466e = 0;
    private final IncodeColorPalette incodeColorPalette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeColorSchemeLight(IncodeColorPalette incodeColorPalette) {
        super(incodeColorPalette, incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7970getNeutral0d7_KjU(), incodeColorPalette.m7947getBlack0d7_KjU(), incodeColorPalette.m7951getBrand500d7_KjU(), incodeColorPalette.m7950getBrand4000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7953getBrand6000d7_KjU(), incodeColorPalette.m7970getNeutral0d7_KjU(), incodeColorPalette.m7961getGray500d7_KjU(), incodeColorPalette.m7958getGray1000d7_KjU(), incodeColorPalette.m7959getGray2000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7963getGray7000d7_KjU(), incodeColorPalette.m7964getGray8000d7_KjU(), incodeColorPalette.m7965getGray9000d7_KjU(), incodeColorPalette.m7966getNegative500d7_KjU(), incodeColorPalette.m7975getWarning500d7_KjU(), incodeColorPalette.m7971getPositive500d7_KjU(), incodeColorPalette.m7968getNegative6000d7_KjU(), incodeColorPalette.m7976getWarning5000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7964getGray8000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7961getGray500d7_KjU(), incodeColorPalette.m7968getNegative6000d7_KjU(), incodeColorPalette.m7976getWarning5000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7958getGray1000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7968getNegative6000d7_KjU(), incodeColorPalette.m7976getWarning5000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), incodeColorPalette.m7964getGray8000d7_KjU(), incodeColorPalette.m7962getGray5000d7_KjU(), incodeColorPalette.m7960getGray3000d7_KjU(), incodeColorPalette.m7957getGray00d7_KjU(), incodeColorPalette.m7952getBrand5000d7_KjU(), incodeColorPalette.m7956getBrandSecondary5000d7_KjU(), incodeColorPalette.m7968getNegative6000d7_KjU(), incodeColorPalette.m7976getWarning5000d7_KjU(), incodeColorPalette.m7972getPositive6000d7_KjU(), null);
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        this.incodeColorPalette = incodeColorPalette;
    }

    static {
        int i2 = 1 + 97;
        f5463a = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f5466e + 9;
            f5464b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof IncodeColorSchemeLight)) {
            int i5 = f5466e + 61;
            f5464b = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.incodeColorPalette, ((IncodeColorSchemeLight) obj).incodeColorPalette)) {
            return true;
        }
        int i6 = f5464b + 113;
        f5466e = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5464b + 63;
        f5466e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.incodeColorPalette.hashCode();
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f5466e + 27;
        f5464b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            String str = "IncodeColorSchemeLight(incodeColorPalette=" + this.incodeColorPalette + ")";
            obj.hashCode();
            throw null;
        }
        String str2 = "IncodeColorSchemeLight(incodeColorPalette=" + this.incodeColorPalette + ")";
        int i4 = f5464b + 9;
        f5466e = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ IncodeColorSchemeLight copy$default(IncodeColorSchemeLight incodeColorSchemeLight, IncodeColorPalette incodeColorPalette, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f5466e;
        int i5 = i4 + 99;
        f5464b = i5 % 128;
        if (i5 % 2 != 0 && (i2 & 1) != 0) {
            incodeColorPalette = incodeColorSchemeLight.incodeColorPalette;
            int i6 = i4 + 83;
            f5464b = i6 % 128;
            int i7 = i6 % 2;
        }
        return incodeColorSchemeLight.copy(incodeColorPalette);
    }

    public final IncodeColorSchemeLight copy(IncodeColorPalette incodeColorPalette) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        IncodeColorSchemeLight incodeColorSchemeLight = new IncodeColorSchemeLight(incodeColorPalette);
        int i3 = f5464b + 37;
        f5466e = i3 % 128;
        int i4 = i3 % 2;
        return incodeColorSchemeLight;
    }

    private final IncodeColorPalette component1() {
        int i2 = 2 % 2;
        int i3 = f5466e;
        int i4 = i3 + 77;
        f5464b = i4 % 128;
        int i5 = i4 % 2;
        IncodeColorPalette incodeColorPalette = this.incodeColorPalette;
        int i6 = i3 + 63;
        f5464b = i6 % 128;
        int i7 = i6 % 2;
        return incodeColorPalette;
    }
}
