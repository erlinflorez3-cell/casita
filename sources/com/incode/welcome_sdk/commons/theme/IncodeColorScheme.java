package com.incode.welcome_sdk.commons.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class IncodeColorScheme {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5455a = 41 % 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5456b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5457c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5458d = 0;
    private final long borderAccent;
    private final long borderDisabled;
    private final long borderFocus;
    private final long borderNegative;
    private final long borderPositive;
    private final long borderPrimary;
    private final long borderWarning;
    private final long brand;
    private final long buttonPrimarySurfaceDefault;
    private final long buttonPrimarySurfaceDisabled;
    private final long buttonPrimarySurfaceHover;
    private final long buttonPrimarySurfacePressed;
    private final long buttonPrimaryText;
    private final long buttonPrimaryTextDefault;
    private final long buttonPrimaryTextDisabled;
    private final long buttonSecondaryBorderDefault;
    private final long buttonSecondaryBorderDisabled;
    private final long buttonSecondaryBorderHover;
    private final long buttonSecondaryBorderPressed;
    private final long buttonSecondarySurfaceDefault;
    private final long buttonSecondarySurfaceDisabled;
    private final long buttonSecondarySurfaceHover;
    private final long buttonSecondarySurfacePressed;
    private final long buttonSecondaryTextDefault;
    private final long buttonSecondaryTextDisabled;
    private final long checkboxBorderDefault;
    private final long checkboxBorderDisabled;
    private final long checkboxBorderError;
    private final long checkboxBorderSelect;
    private final long checkboxIconDefault;
    private final long checkboxSurfaceDefault;
    private final long checkboxSurfaceDisabled;
    private final long checkboxSurfaceSelect;
    private final long checkboxTextDefault;
    private final long checkboxTextDisabled;
    private final long checkboxTextNegative;
    private final long iconAccent;
    private final long iconInvert;
    private final long iconNegative;
    private final long iconPositive;
    private final long iconPrimary;
    private final long iconSecondary;
    private final long iconWarning;
    private final IncodeColorPalette incodeColorPalette;
    private final long inputBorderActive;
    private final long inputBorderDefault;
    private final long inputBorderDisabled;
    private final long inputBorderNegative;
    private final long inputIconDefault;
    private final long inputIconNegative;
    private final long inputIconPositive;
    private final long inputIconWarning;
    private final long inputSurfaceActive;
    private final long inputSurfaceDefault;
    private final long inputSurfaceDisabled;
    private final long inputSurfaceNegative;
    private final long inputTextFieldDefault;
    private final long inputTextFieldDisabled;
    private final long inputTextFieldPlaceholder;
    private final long inputTextHelperDefault;
    private final long inputTextHelperDisabled;
    private final long inputTextHelperNegative;
    private final long inputTextLabelDefault;
    private final long inputTextLabelDisabled;
    private final long linkTextDefault;
    private final long linkTextHover;
    private final long linkTextVisited;
    private final long surfaceNeutralDark;
    private final long surfaceNeutralLight;
    private final long surfacePrimary400;
    private final long surfacePrimary50;
    private final long surfacePrimary500;
    private final long surfacePrimary600;
    private final long surfaceSecondary0;
    private final long surfaceSecondary100;
    private final long surfaceSecondary200;
    private final long surfaceSecondary300;
    private final long surfaceSecondary50;
    private final long surfaceSecondary500;
    private final long surfaceSecondary700;
    private final long surfaceSecondary800;
    private final long surfaceSecondary900;
    private final long surfaceStatusNegative;
    private final long surfaceStatusPositive;
    private final long surfaceStatusSoftNegative;
    private final long surfaceStatusSoftPositive;
    private final long surfaceStatusSoftWarning;
    private final long surfaceStatusWarning;
    private final long textBodyInvert;
    private final long textBodyPrimary;
    private final long textBodySecondary;
    private final long textBodyTertiary;
    private final long textBrandAccent;
    private final long textBrandSpecial;
    private final long textStatusNegative;
    private final long textStatusPositive;
    private final long textStatusWarning;
    private final long tooltipSurfaceDefault;
    private final long tooltipTextDefault;

    private IncodeColorScheme(IncodeColorPalette incodeColorPalette, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46) {
        Intrinsics.checkNotNullParameter(incodeColorPalette, "");
        this.incodeColorPalette = incodeColorPalette;
        this.brand = j2;
        this.surfaceNeutralLight = j3;
        this.surfaceNeutralDark = j4;
        this.surfacePrimary50 = j5;
        this.surfacePrimary400 = j6;
        this.surfacePrimary500 = j7;
        this.surfacePrimary600 = j8;
        this.surfaceSecondary0 = j9;
        this.surfaceSecondary50 = j10;
        this.surfaceSecondary100 = j11;
        this.surfaceSecondary200 = j12;
        this.surfaceSecondary300 = j13;
        this.surfaceSecondary500 = j14;
        this.surfaceSecondary700 = j15;
        this.surfaceSecondary800 = j16;
        this.surfaceSecondary900 = j17;
        this.surfaceStatusSoftNegative = j18;
        this.surfaceStatusSoftWarning = j19;
        this.surfaceStatusSoftPositive = j20;
        this.surfaceStatusNegative = j21;
        this.surfaceStatusWarning = j22;
        this.surfaceStatusPositive = j23;
        this.iconPrimary = j24;
        this.iconSecondary = j25;
        this.iconAccent = j26;
        this.iconInvert = j27;
        this.iconNegative = j28;
        this.iconWarning = j29;
        this.iconPositive = j30;
        this.borderPrimary = j31;
        this.borderDisabled = j32;
        this.borderFocus = j33;
        this.borderAccent = j34;
        this.borderNegative = j35;
        this.borderWarning = j36;
        this.borderPositive = j37;
        this.textBodyPrimary = j38;
        this.textBodySecondary = j39;
        this.textBodyTertiary = j40;
        this.textBodyInvert = j41;
        this.textBrandAccent = j42;
        this.textBrandSpecial = j43;
        this.textStatusNegative = j44;
        this.textStatusWarning = j45;
        this.textStatusPositive = j46;
        this.buttonPrimarySurfaceDefault = j7;
        this.buttonPrimarySurfaceHover = j6;
        this.buttonPrimarySurfacePressed = j8;
        this.buttonPrimarySurfaceDisabled = j12;
        this.buttonPrimaryTextDefault = j41;
        this.buttonPrimaryTextDisabled = j40;
        this.buttonPrimaryText = j38;
        this.buttonSecondarySurfaceDefault = j9;
        this.buttonSecondarySurfaceHover = j5;
        this.buttonSecondarySurfacePressed = j8;
        this.buttonSecondarySurfaceDisabled = j12;
        this.buttonSecondaryTextDefault = j42;
        this.buttonSecondaryTextDisabled = j39;
        this.buttonSecondaryBorderDefault = j7;
        this.buttonSecondaryBorderHover = j5;
        this.buttonSecondaryBorderPressed = j8;
        this.buttonSecondaryBorderDisabled = j12;
        this.linkTextDefault = j42;
        this.linkTextHover = j38;
        this.linkTextVisited = j42;
        this.checkboxSurfaceDefault = j9;
        this.checkboxSurfaceSelect = j7;
        this.checkboxSurfaceDisabled = j12;
        this.checkboxBorderDefault = j31;
        this.checkboxBorderSelect = j34;
        this.checkboxBorderDisabled = j32;
        this.checkboxBorderError = j35;
        this.checkboxTextDefault = j38;
        this.checkboxTextDisabled = j40;
        this.checkboxTextNegative = j44;
        this.checkboxIconDefault = j9;
        this.inputSurfaceDefault = j9;
        this.inputSurfaceActive = j9;
        this.inputSurfaceDisabled = j12;
        this.inputSurfaceNegative = j9;
        this.inputBorderDefault = j31;
        this.inputBorderActive = j34;
        this.inputBorderDisabled = j32;
        this.inputBorderNegative = j35;
        this.inputTextLabelDefault = j38;
        this.inputTextLabelDisabled = j40;
        this.inputTextFieldDefault = j38;
        this.inputTextFieldDisabled = j40;
        this.inputTextFieldPlaceholder = j40;
        this.inputTextHelperDefault = j39;
        this.inputTextHelperDisabled = j40;
        this.inputTextHelperNegative = j44;
        this.inputIconPositive = j23;
        this.inputIconWarning = j22;
        this.inputIconNegative = j21;
        this.inputIconDefault = j13;
        this.tooltipTextDefault = incodeColorPalette.m7957getGray00d7_KjU();
        this.tooltipSurfaceDefault = incodeColorPalette.m7965getGray9000d7_KjU();
    }

    public /* synthetic */ IncodeColorScheme(IncodeColorPalette incodeColorPalette, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(incodeColorPalette, (i2 & 2) != 0 ? incodeColorPalette.m7952getBrand5000d7_KjU() : j2, (i2 & 4) != 0 ? incodeColorPalette.m7970getNeutral0d7_KjU() : j3, (i2 & 8) != 0 ? incodeColorPalette.m7947getBlack0d7_KjU() : j4, (i2 & 16) != 0 ? incodeColorPalette.m7951getBrand500d7_KjU() : j5, (i2 & 32) != 0 ? incodeColorPalette.m7950getBrand4000d7_KjU() : j6, (i2 & 64) != 0 ? incodeColorPalette.m7952getBrand5000d7_KjU() : j7, (i2 & 128) != 0 ? incodeColorPalette.m7953getBrand6000d7_KjU() : j8, (i2 & 256) != 0 ? incodeColorPalette.m7970getNeutral0d7_KjU() : j9, (i2 & 512) != 0 ? incodeColorPalette.m7961getGray500d7_KjU() : j10, (i2 & 1024) != 0 ? incodeColorPalette.m7958getGray1000d7_KjU() : j11, (i2 & 2048) != 0 ? incodeColorPalette.m7959getGray2000d7_KjU() : j12, (i2 & 4096) != 0 ? incodeColorPalette.m7960getGray3000d7_KjU() : j13, (i2 & 8192) != 0 ? incodeColorPalette.m7962getGray5000d7_KjU() : j14, (i2 & 16384) != 0 ? incodeColorPalette.m7963getGray7000d7_KjU() : j15, (32768 & i2) != 0 ? incodeColorPalette.m7964getGray8000d7_KjU() : j16, (65536 & i2) != 0 ? incodeColorPalette.m7965getGray9000d7_KjU() : j17, (131072 & i2) != 0 ? incodeColorPalette.m7966getNegative500d7_KjU() : j18, (262144 & i2) != 0 ? incodeColorPalette.m7975getWarning500d7_KjU() : j19, (524288 & i2) != 0 ? incodeColorPalette.m7971getPositive500d7_KjU() : j20, (1048576 & i2) != 0 ? incodeColorPalette.m7968getNegative6000d7_KjU() : j21, (2097152 & i2) != 0 ? incodeColorPalette.m7976getWarning5000d7_KjU() : j22, (4194304 & i2) != 0 ? incodeColorPalette.m7972getPositive6000d7_KjU() : j23, (8388608 & i2) != 0 ? incodeColorPalette.m7962getGray5000d7_KjU() : j24, (16777216 & i2) != 0 ? incodeColorPalette.m7964getGray8000d7_KjU() : j25, (33554432 & i2) != 0 ? incodeColorPalette.m7952getBrand5000d7_KjU() : j26, (67108864 & i2) != 0 ? incodeColorPalette.m7961getGray500d7_KjU() : j27, (134217728 & i2) != 0 ? incodeColorPalette.m7968getNegative6000d7_KjU() : j28, (268435456 & i2) != 0 ? incodeColorPalette.m7976getWarning5000d7_KjU() : j29, (536870912 & i2) != 0 ? incodeColorPalette.m7972getPositive6000d7_KjU() : j30, (1073741824 & i2) != 0 ? incodeColorPalette.m7958getGray1000d7_KjU() : j31, (i2 & Integer.MIN_VALUE) != 0 ? incodeColorPalette.m7960getGray3000d7_KjU() : j32, (i3 & 1) != 0 ? incodeColorPalette.m7962getGray5000d7_KjU() : j33, (i3 & 2) != 0 ? incodeColorPalette.m7952getBrand5000d7_KjU() : j34, (i3 & 4) != 0 ? incodeColorPalette.m7968getNegative6000d7_KjU() : j35, (i3 & 8) != 0 ? incodeColorPalette.m7976getWarning5000d7_KjU() : j36, (i3 & 16) != 0 ? incodeColorPalette.m7972getPositive6000d7_KjU() : j37, (i3 & 32) != 0 ? incodeColorPalette.m7964getGray8000d7_KjU() : j38, (i3 & 64) != 0 ? incodeColorPalette.m7962getGray5000d7_KjU() : j39, (i3 & 128) != 0 ? incodeColorPalette.m7960getGray3000d7_KjU() : j40, (i3 & 256) != 0 ? incodeColorPalette.m7957getGray00d7_KjU() : j41, (i3 & 512) != 0 ? incodeColorPalette.m7952getBrand5000d7_KjU() : j42, (i3 & 1024) != 0 ? incodeColorPalette.m7956getBrandSecondary5000d7_KjU() : j43, (i3 & 2048) != 0 ? incodeColorPalette.m7968getNegative6000d7_KjU() : j44, (i3 & 4096) != 0 ? incodeColorPalette.m7976getWarning5000d7_KjU() : j45, (i3 & 8192) != 0 ? incodeColorPalette.m7972getPositive6000d7_KjU() : j46, null);
    }

    /* JADX INFO: renamed from: getBrand-0d7_KjU, reason: not valid java name */
    public final long m7985getBrand0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 25;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.brand;
        int i6 = i3 + 23;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceNeutralLight-0d7_KjU, reason: not valid java name */
    public final long m8045getSurfaceNeutralLight0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 73;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfaceNeutralLight;
        int i6 = i3 + 47;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceNeutralDark-0d7_KjU, reason: not valid java name */
    public final long m8044getSurfaceNeutralDark0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.surfaceNeutralDark;
        int i6 = i4 + 5;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfacePrimary50-0d7_KjU, reason: not valid java name */
    public final long m8047getSurfacePrimary500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 11;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfacePrimary50;
        int i6 = i3 + 103;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getSurfacePrimary400-0d7_KjU, reason: not valid java name */
    public final long m8046getSurfacePrimary4000d7_KjU() {
        long j2;
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 5;
        f5457c = i4 % 128;
        if (i4 % 2 != 0) {
            j2 = this.surfacePrimary400;
            int i5 = 33 / 0;
        } else {
            j2 = this.surfacePrimary400;
        }
        int i6 = i3 + 7;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfacePrimary500-0d7_KjU, reason: not valid java name */
    public final long m8048getSurfacePrimary5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 91;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfacePrimary500;
        int i6 = i3 + 15;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfacePrimary600-0d7_KjU, reason: not valid java name */
    public final long m8049getSurfacePrimary6000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 15;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.surfacePrimary600;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary0-0d7_KjU, reason: not valid java name */
    public final long m8050getSurfaceSecondary00d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 55;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.surfaceSecondary0;
        if (i5 == 0) {
            int i6 = 8 / 0;
        }
        int i7 = i4 + 59;
        f5457c = i7 % 128;
        int i8 = i7 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary50-0d7_KjU, reason: not valid java name */
    public final long m8054getSurfaceSecondary500d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 109;
        int i4 = i3 % 128;
        f5456b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.surfaceSecondary50;
        int i5 = i4 + 43;
        f5457c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary100-0d7_KjU, reason: not valid java name */
    public final long m8051getSurfaceSecondary1000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 55;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.surfaceSecondary100;
        int i6 = i4 + 23;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary200-0d7_KjU, reason: not valid java name */
    public final long m8052getSurfaceSecondary2000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 11;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.surfaceSecondary200;
        int i6 = i4 + 43;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary300-0d7_KjU, reason: not valid java name */
    public final long m8053getSurfaceSecondary3000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 13;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfaceSecondary300;
        int i6 = i3 + 105;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary500-0d7_KjU, reason: not valid java name */
    public final long m8055getSurfaceSecondary5000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 19;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.surfaceSecondary500;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary700-0d7_KjU, reason: not valid java name */
    public final long m8056getSurfaceSecondary7000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 41;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfaceSecondary700;
        int i6 = i3 + 41;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary800-0d7_KjU, reason: not valid java name */
    public final long m8057getSurfaceSecondary8000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 3;
        int i4 = i3 % 128;
        f5457c = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j2 = this.surfaceSecondary800;
        int i5 = i4 + 61;
        f5456b = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSurfaceSecondary900-0d7_KjU, reason: not valid java name */
    public final long m8058getSurfaceSecondary9000d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 93;
        f5456b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        long j2 = this.surfaceSecondary900;
        int i5 = i3 + 33;
        f5456b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceStatusSoftNegative-0d7_KjU, reason: not valid java name */
    public final long m8061getSurfaceStatusSoftNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 73;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfaceStatusSoftNegative;
        int i6 = i3 + 53;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceStatusSoftWarning-0d7_KjU, reason: not valid java name */
    public final long m8063getSurfaceStatusSoftWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 123;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.surfaceStatusSoftWarning;
        int i6 = i3 + 25;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceStatusSoftPositive-0d7_KjU, reason: not valid java name */
    public final long m8062getSurfaceStatusSoftPositive0d7_KjU() {
        long j2;
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 21;
        f5457c = i4 % 128;
        if (i4 % 2 != 0) {
            j2 = this.surfaceStatusSoftPositive;
            int i5 = 15 / 0;
        } else {
            j2 = this.surfaceStatusSoftPositive;
        }
        int i6 = i3 + 3;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSurfaceStatusNegative-0d7_KjU, reason: not valid java name */
    public final long m8059getSurfaceStatusNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 123;
        f5456b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        long j2 = this.surfaceStatusNegative;
        int i5 = i3 + 123;
        f5456b = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSurfaceStatusWarning-0d7_KjU, reason: not valid java name */
    public final long m8064getSurfaceStatusWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 85;
        int i4 = i3 % 128;
        f5456b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j2 = this.surfaceStatusWarning;
        int i5 = i4 + 63;
        f5457c = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSurfaceStatusPositive-0d7_KjU, reason: not valid java name */
    public final long m8060getSurfaceStatusPositive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 91;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.surfaceStatusPositive;
        int i6 = i4 + 71;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getIconPrimary-0d7_KjU, reason: not valid java name */
    public final long m8018getIconPrimary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 69;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.iconPrimary;
        }
        int i4 = 20 / 0;
        return this.iconPrimary;
    }

    /* JADX INFO: renamed from: getIconSecondary-0d7_KjU, reason: not valid java name */
    public final long m8019getIconSecondary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 99;
        int i4 = i3 % 128;
        f5457c = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.iconSecondary;
        int i5 = i4 + 25;
        f5456b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getIconAccent-0d7_KjU, reason: not valid java name */
    public final long m8014getIconAccent0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 65;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.iconAccent;
        int i6 = i4 + 59;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getIconInvert-0d7_KjU, reason: not valid java name */
    public final long m8015getIconInvert0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 41;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.iconInvert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getIconNegative-0d7_KjU, reason: not valid java name */
    public final long m8016getIconNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 31;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.iconNegative;
        }
        int i4 = 96 / 0;
        return this.iconNegative;
    }

    /* JADX INFO: renamed from: getIconWarning-0d7_KjU, reason: not valid java name */
    public final long m8020getIconWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 19;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.iconWarning;
        int i6 = i3 + 51;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getIconPositive-0d7_KjU, reason: not valid java name */
    public final long m8017getIconPositive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 39;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.iconPositive;
        int i6 = i3 + 109;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBorderPrimary-0d7_KjU, reason: not valid java name */
    public final long m7983getBorderPrimary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 99;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.borderPrimary;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getBorderDisabled-0d7_KjU, reason: not valid java name */
    public final long m7979getBorderDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 69;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.borderDisabled;
        int i6 = i4 + 25;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBorderFocus-0d7_KjU, reason: not valid java name */
    public final long m7980getBorderFocus0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 81;
        int i4 = i3 % 128;
        f5457c = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j2 = this.borderFocus;
        int i5 = i4 + 45;
        f5456b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getBorderAccent-0d7_KjU, reason: not valid java name */
    public final long m7978getBorderAccent0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 85;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.borderAccent;
        int i6 = i3 + 91;
        f5456b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getBorderNegative-0d7_KjU, reason: not valid java name */
    public final long m7981getBorderNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 107;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.borderNegative;
        int i6 = i3 + 13;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getBorderWarning-0d7_KjU, reason: not valid java name */
    public final long m7984getBorderWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 17;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.borderWarning;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getBorderPositive-0d7_KjU, reason: not valid java name */
    public final long m7982getBorderPositive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 123;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.borderPositive;
        int i6 = i3 + 9;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getTextBodyPrimary-0d7_KjU, reason: not valid java name */
    public final long m8066getTextBodyPrimary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 45;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.textBodyPrimary;
        }
        int i4 = 51 / 0;
        return this.textBodyPrimary;
    }

    /* JADX INFO: renamed from: getTextBodySecondary-0d7_KjU, reason: not valid java name */
    public final long m8067getTextBodySecondary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 19;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.textBodySecondary;
        int i6 = i3 + 111;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getTextBodyTertiary-0d7_KjU, reason: not valid java name */
    public final long m8068getTextBodyTertiary0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 29;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.textBodyTertiary;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getTextBodyInvert-0d7_KjU, reason: not valid java name */
    public final long m8065getTextBodyInvert0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 37;
        f5456b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        long j2 = this.textBodyInvert;
        int i5 = i3 + 47;
        f5456b = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getTextBrandAccent-0d7_KjU, reason: not valid java name */
    public final long m8069getTextBrandAccent0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 27;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.textBrandAccent;
        int i6 = i3 + 79;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getTextBrandSpecial-0d7_KjU, reason: not valid java name */
    public final long m8070getTextBrandSpecial0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 53;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.textBrandSpecial;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getTextStatusNegative-0d7_KjU, reason: not valid java name */
    public final long m8071getTextStatusNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 39;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.textStatusNegative;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getTextStatusWarning-0d7_KjU, reason: not valid java name */
    public final long m8073getTextStatusWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 41;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.textStatusWarning;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getTextStatusPositive-0d7_KjU, reason: not valid java name */
    public final long m8072getTextStatusPositive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 97;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.textStatusPositive;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getButtonPrimarySurfaceDefault-0d7_KjU, reason: not valid java name */
    public final long m7986getButtonPrimarySurfaceDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 49;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.buttonPrimarySurfaceDefault;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getButtonPrimarySurfaceHover-0d7_KjU, reason: not valid java name */
    public final long m7988getButtonPrimarySurfaceHover0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 107;
        int i4 = i3 % 128;
        f5456b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.buttonPrimarySurfaceHover;
        int i5 = i4 + 37;
        f5457c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonPrimarySurfacePressed-0d7_KjU, reason: not valid java name */
    public final long m7989getButtonPrimarySurfacePressed0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 93;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.buttonPrimarySurfacePressed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getButtonPrimarySurfaceDisabled-0d7_KjU, reason: not valid java name */
    public final long m7987getButtonPrimarySurfaceDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 25;
        int i4 = i3 % 128;
        f5456b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.buttonPrimarySurfaceDisabled;
        int i5 = i4 + 33;
        f5457c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonPrimaryTextDefault-0d7_KjU, reason: not valid java name */
    public final long m7991getButtonPrimaryTextDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 73;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.buttonPrimaryTextDefault;
        int i6 = i3 + 107;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonPrimaryTextDisabled-0d7_KjU, reason: not valid java name */
    public final long m7992getButtonPrimaryTextDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 59;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.buttonPrimaryTextDisabled;
        int i6 = i3 + 41;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getButtonPrimaryText-0d7_KjU, reason: not valid java name */
    public final long m7990getButtonPrimaryText0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 73;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.buttonPrimaryText;
        int i6 = i4 + 7;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondarySurfaceDefault-0d7_KjU, reason: not valid java name */
    public final long m7997getButtonSecondarySurfaceDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 93;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.buttonSecondarySurfaceDefault;
        int i6 = i4 + 63;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondarySurfaceHover-0d7_KjU, reason: not valid java name */
    public final long m7999getButtonSecondarySurfaceHover0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 19;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.buttonSecondarySurfaceHover;
        }
        int i4 = 99 / 0;
        return this.buttonSecondarySurfaceHover;
    }

    /* JADX INFO: renamed from: getButtonSecondarySurfacePressed-0d7_KjU, reason: not valid java name */
    public final long m8000getButtonSecondarySurfacePressed0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 99;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.buttonSecondarySurfacePressed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getButtonSecondarySurfaceDisabled-0d7_KjU, reason: not valid java name */
    public final long m7998getButtonSecondarySurfaceDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 107;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.buttonSecondarySurfaceDisabled;
        int i6 = i3 + 35;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondaryTextDefault-0d7_KjU, reason: not valid java name */
    public final long m8001getButtonSecondaryTextDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 97;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.buttonSecondaryTextDefault;
        int i6 = i3 + 125;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondaryTextDisabled-0d7_KjU, reason: not valid java name */
    public final long m8002getButtonSecondaryTextDisabled0d7_KjU() {
        long j2;
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 61;
        f5456b = i4 % 128;
        if (i4 % 2 == 0) {
            j2 = this.buttonSecondaryTextDisabled;
            int i5 = 73 / 0;
        } else {
            j2 = this.buttonSecondaryTextDisabled;
        }
        int i6 = i3 + 117;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondaryBorderDefault-0d7_KjU, reason: not valid java name */
    public final long m7993getButtonSecondaryBorderDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 83;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.buttonSecondaryBorderDefault;
        }
        int i4 = 37 / 0;
        return this.buttonSecondaryBorderDefault;
    }

    /* JADX INFO: renamed from: getButtonSecondaryBorderHover-0d7_KjU, reason: not valid java name */
    public final long m7995getButtonSecondaryBorderHover0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 23;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.buttonSecondaryBorderHover;
        int i6 = i4 + 103;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondaryBorderPressed-0d7_KjU, reason: not valid java name */
    public final long m7996getButtonSecondaryBorderPressed0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 85;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.buttonSecondaryBorderPressed;
        int i6 = i4 + 79;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getButtonSecondaryBorderDisabled-0d7_KjU, reason: not valid java name */
    public final long m7994getButtonSecondaryBorderDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 51;
        f5456b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.buttonSecondaryBorderDisabled;
        }
        int i4 = 1 / 0;
        return this.buttonSecondaryBorderDisabled;
    }

    /* JADX INFO: renamed from: getLinkTextDefault-0d7_KjU, reason: not valid java name */
    public final long m8041getLinkTextDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 85;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.linkTextDefault;
        int i6 = i4 + 69;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getLinkTextHover-0d7_KjU, reason: not valid java name */
    public final long m8042getLinkTextHover0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 109;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.linkTextHover;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLinkTextVisited-0d7_KjU, reason: not valid java name */
    public final long m8043getLinkTextVisited0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 3;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.linkTextVisited;
        int i6 = i4 + 69;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getCheckboxSurfaceDefault-0d7_KjU, reason: not valid java name */
    public final long m8008getCheckboxSurfaceDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 99;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.checkboxSurfaceDefault;
        int i6 = i4 + 3;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getCheckboxSurfaceSelect-0d7_KjU, reason: not valid java name */
    public final long m8010getCheckboxSurfaceSelect0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 83;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.checkboxSurfaceSelect;
        }
        int i4 = 11 / 0;
        return this.checkboxSurfaceSelect;
    }

    /* JADX INFO: renamed from: getCheckboxSurfaceDisabled-0d7_KjU, reason: not valid java name */
    public final long m8009getCheckboxSurfaceDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 79;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.checkboxSurfaceDisabled;
        int i6 = i4 + 23;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getCheckboxBorderDefault-0d7_KjU, reason: not valid java name */
    public final long m8003getCheckboxBorderDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 117;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.checkboxBorderDefault;
        int i6 = i3 + 45;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getCheckboxBorderSelect-0d7_KjU, reason: not valid java name */
    public final long m8006getCheckboxBorderSelect0d7_KjU() {
        long j2;
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 31;
        f5456b = i4 % 128;
        if (i4 % 2 == 0) {
            j2 = this.checkboxBorderSelect;
            int i5 = 49 / 0;
        } else {
            j2 = this.checkboxBorderSelect;
        }
        int i6 = i3 + 95;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getCheckboxBorderDisabled-0d7_KjU, reason: not valid java name */
    public final long m8004getCheckboxBorderDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 97;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.checkboxBorderDisabled;
        int i6 = i4 + 3;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getCheckboxBorderError-0d7_KjU, reason: not valid java name */
    public final long m8005getCheckboxBorderError0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 95;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.checkboxBorderError;
        int i6 = i4 + 91;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getCheckboxTextDefault-0d7_KjU, reason: not valid java name */
    public final long m8011getCheckboxTextDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 89;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.checkboxTextDefault;
        int i6 = i3 + 121;
        f5457c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getCheckboxTextDisabled-0d7_KjU, reason: not valid java name */
    public final long m8012getCheckboxTextDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 125;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.checkboxTextDisabled;
        }
        int i4 = 53 / 0;
        return this.checkboxTextDisabled;
    }

    /* JADX INFO: renamed from: getCheckboxTextNegative-0d7_KjU, reason: not valid java name */
    public final long m8013getCheckboxTextNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 15;
        f5457c = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.checkboxTextNegative;
        int i5 = i3 + 85;
        f5457c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getCheckboxIconDefault-0d7_KjU, reason: not valid java name */
    public final long m8007getCheckboxIconDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 15;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.checkboxIconDefault;
        int i6 = i4 + 95;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getInputSurfaceDefault-0d7_KjU, reason: not valid java name */
    public final long m8030getInputSurfaceDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 79;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputSurfaceDefault;
        int i6 = i3 + 63;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputSurfaceActive-0d7_KjU, reason: not valid java name */
    public final long m8029getInputSurfaceActive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 61;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.inputSurfaceActive;
        }
        int i4 = 38 / 0;
        return this.inputSurfaceActive;
    }

    /* JADX INFO: renamed from: getInputSurfaceDisabled-0d7_KjU, reason: not valid java name */
    public final long m8031getInputSurfaceDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 111;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.inputSurfaceDisabled;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getInputSurfaceNegative-0d7_KjU, reason: not valid java name */
    public final long m8032getInputSurfaceNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 121;
        int i4 = i3 % 128;
        f5456b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.inputSurfaceNegative;
        int i5 = i4 + 15;
        f5457c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputBorderDefault-0d7_KjU, reason: not valid java name */
    public final long m8022getInputBorderDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 1;
        f5457c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.inputBorderDefault;
        int i5 = i3 + 115;
        f5457c = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputBorderActive-0d7_KjU, reason: not valid java name */
    public final long m8021getInputBorderActive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 71;
        int i4 = i3 % 128;
        f5457c = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.inputBorderActive;
        int i5 = i4 + 73;
        f5456b = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputBorderDisabled-0d7_KjU, reason: not valid java name */
    public final long m8023getInputBorderDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 125;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.inputBorderDisabled;
        int i6 = i4 + 17;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputBorderNegative-0d7_KjU, reason: not valid java name */
    public final long m8024getInputBorderNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 1;
        int i4 = i3 % 128;
        f5457c = i4;
        int i5 = i3 % 2;
        long j2 = this.inputBorderNegative;
        int i6 = i4 + 111;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputTextLabelDefault-0d7_KjU, reason: not valid java name */
    public final long m8039getInputTextLabelDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 25;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputTextLabelDefault;
        int i6 = i3 + 51;
        f5456b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getInputTextLabelDisabled-0d7_KjU, reason: not valid java name */
    public final long m8040getInputTextLabelDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 51;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputTextLabelDisabled;
        int i6 = i3 + 97;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputTextFieldDefault-0d7_KjU, reason: not valid java name */
    public final long m8033getInputTextFieldDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 87;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.inputTextFieldDefault;
        int i6 = i4 + 97;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputTextFieldDisabled-0d7_KjU, reason: not valid java name */
    public final long m8034getInputTextFieldDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 107;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.inputTextFieldDisabled;
        int i6 = i4 + 105;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputTextFieldPlaceholder-0d7_KjU, reason: not valid java name */
    public final long m8035getInputTextFieldPlaceholder0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 83;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputTextFieldPlaceholder;
        int i6 = i3 + 17;
        f5457c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getInputTextHelperDefault-0d7_KjU, reason: not valid java name */
    public final long m8036getInputTextHelperDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 113;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputTextHelperDefault;
        int i6 = i3 + 95;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputTextHelperDisabled-0d7_KjU, reason: not valid java name */
    public final long m8037getInputTextHelperDisabled0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 43;
        f5457c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.inputTextHelperDisabled;
        int i5 = i3 + 51;
        f5457c = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputTextHelperNegative-0d7_KjU, reason: not valid java name */
    public final long m8038getInputTextHelperNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 97;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputTextHelperNegative;
        int i6 = i3 + 39;
        f5456b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputIconPositive-0d7_KjU, reason: not valid java name */
    public final long m8027getInputIconPositive0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 1;
        f5457c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputIconPositive;
        int i6 = i3 + 123;
        f5457c = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputIconWarning-0d7_KjU, reason: not valid java name */
    public final long m8028getInputIconWarning0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b;
        int i4 = i3 + 9;
        f5457c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        long j2 = this.inputIconWarning;
        int i5 = i3 + 9;
        f5457c = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getInputIconNegative-0d7_KjU, reason: not valid java name */
    public final long m8026getInputIconNegative0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 47;
        f5456b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.inputIconNegative;
        int i6 = i3 + 87;
        f5456b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getInputIconDefault-0d7_KjU, reason: not valid java name */
    public final long m8025getInputIconDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c + 39;
        int i4 = i3 % 128;
        f5456b = i4;
        int i5 = i3 % 2;
        long j2 = this.inputIconDefault;
        if (i5 == 0) {
            int i6 = 69 / 0;
        }
        int i7 = i4 + 117;
        f5457c = i7 % 128;
        int i8 = i7 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getTooltipTextDefault-0d7_KjU, reason: not valid java name */
    public final long m8075getTooltipTextDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5456b + 27;
        f5457c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.tooltipTextDefault;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getTooltipSurfaceDefault-0d7_KjU, reason: not valid java name */
    public final long m8074getTooltipSurfaceDefault0d7_KjU() {
        int i2 = 2 % 2;
        int i3 = f5457c;
        int i4 = i3 + 75;
        f5456b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j2 = this.tooltipSurfaceDefault;
        int i5 = i3 + 101;
        f5456b = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    public final ColorScheme toMaterial() {
        int i2 = 2 % 2;
        int i3 = f5457c + 125;
        f5456b = i3 % 128;
        int i4 = i3 % 2;
        ColorScheme colorSchemeM1953lightColorSchemeCXl9yA$default = ColorSchemeKt.m1953lightColorSchemeCXl9yA$default(this.surfacePrimary500, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, this.surfaceNeutralLight, this.surfaceNeutralDark, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -393218, 15, null);
        int i5 = f5457c + 15;
        f5456b = i5 % 128;
        if (i5 % 2 != 0) {
            return colorSchemeM1953lightColorSchemeCXl9yA$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = 41 % 2;
    }

    public /* synthetic */ IncodeColorScheme(IncodeColorPalette incodeColorPalette, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, DefaultConstructorMarker defaultConstructorMarker) {
        this(incodeColorPalette, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46);
    }
}
