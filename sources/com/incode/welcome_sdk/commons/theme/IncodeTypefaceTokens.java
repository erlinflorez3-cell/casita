package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeTypefaceTokens {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5486a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5487b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5488c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5489d = 0;
    public static final IncodeTypefaceTokens INSTANCE = new IncodeTypefaceTokens();
    private static final FontFamily familyText = FontFamilyKt.FontFamily(FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_dm_sans_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_dm_sans_bold, FontWeight.Companion.getBold(), 0, 0, 12, null), FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_dm_sans_medium, FontWeight.Companion.getMedium(), 0, 0, 12, null));
    private static final FontFamily familyDisplay = FontFamilyKt.FontFamily(FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_dm_sans_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null));
    private static final FontWeight weightMedium = FontWeight.Companion.getMedium();
    private static final FontWeight weightRegular = FontWeight.Companion.getNormal();
    private static final FontWeight weightBold = FontWeight.Companion.getBold();
    private static final FontWeight weightExtraBold = FontWeight.Companion.getExtraBold();
    private static final long letterSpacingNone = TextUnitKt.getSp(0.0f);
    private static final long letterSpacingMedium = TextUnitKt.getSp(-0.5f);
    private static final long letterSpacingLarge = TextUnitKt.getSp(-1.0f);
    private static final long letterSpacingExtraLarge = TextUnitKt.getSp(-1.5f);
    private static final long size12 = TextUnitKt.getSp(12);
    private static final long size14 = TextUnitKt.getSp(14);
    private static final long size16 = TextUnitKt.getSp(16);
    private static final long size18 = TextUnitKt.getSp(18);
    private static final long size20 = TextUnitKt.getSp(20);
    private static final long size24 = TextUnitKt.getSp(24);
    private static final long size26 = TextUnitKt.getSp(26);
    private static final long size32 = TextUnitKt.getSp(32);
    private static final long size48 = TextUnitKt.getSp(48);
    private static final long size80 = TextUnitKt.getSp(80);

    private IncodeTypefaceTokens() {
    }

    public final FontFamily getFamilyText() {
        int i2 = 2 % 2;
        int i3 = f5486a + 103;
        f5488c = i3 % 128;
        if (i3 % 2 == 0) {
            return familyText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f5489d + 95;
        f5487b = i2 % 128;
        int i3 = i2 % 2;
    }

    public final FontFamily getFamilyDisplay() {
        FontFamily fontFamily;
        int i2 = 2 % 2;
        int i3 = f5488c;
        int i4 = i3 + 57;
        f5486a = i4 % 128;
        if (i4 % 2 == 0) {
            fontFamily = familyDisplay;
            int i5 = 53 / 0;
        } else {
            fontFamily = familyDisplay;
        }
        int i6 = i3 + 33;
        f5486a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return fontFamily;
    }

    public final FontWeight getWeightMedium() {
        int i2 = 2 % 2;
        int i3 = f5488c;
        int i4 = i3 + 43;
        f5486a = i4 % 128;
        int i5 = i4 % 2;
        FontWeight fontWeight = weightMedium;
        int i6 = i3 + 25;
        f5486a = i6 % 128;
        int i7 = i6 % 2;
        return fontWeight;
    }

    public final FontWeight getWeightRegular() {
        int i2 = 2 % 2;
        int i3 = f5486a;
        int i4 = i3 + 67;
        f5488c = i4 % 128;
        int i5 = i4 % 2;
        FontWeight fontWeight = weightRegular;
        int i6 = i3 + 51;
        f5488c = i6 % 128;
        int i7 = i6 % 2;
        return fontWeight;
    }

    public final FontWeight getWeightBold() {
        int i2 = 2 % 2;
        int i3 = f5486a;
        int i4 = i3 + 39;
        f5488c = i4 % 128;
        int i5 = i4 % 2;
        FontWeight fontWeight = weightBold;
        int i6 = i3 + 87;
        f5488c = i6 % 128;
        if (i6 % 2 == 0) {
            return fontWeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FontWeight getWeightExtraBold() {
        int i2 = 2 % 2;
        int i3 = f5486a;
        int i4 = i3 + 83;
        f5488c = i4 % 128;
        int i5 = i4 % 2;
        FontWeight fontWeight = weightExtraBold;
        int i6 = i3 + 15;
        f5488c = i6 % 128;
        if (i6 % 2 == 0) {
            return fontWeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getLetterSpacingNone-XSAIIZE, reason: not valid java name */
    public final long m8079getLetterSpacingNoneXSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a + 91;
        f5488c = i3 % 128;
        if (i3 % 2 == 0) {
            return letterSpacingNone;
        }
        int i4 = 59 / 0;
        return letterSpacingNone;
    }

    /* JADX INFO: renamed from: getLetterSpacingMedium-XSAIIZE, reason: not valid java name */
    public final long m8078getLetterSpacingMediumXSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c + 89;
        int i4 = i3 % 128;
        f5486a = i4;
        int i5 = i3 % 2;
        long j2 = letterSpacingMedium;
        int i6 = i4 + 29;
        f5488c = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getLetterSpacingLarge-XSAIIZE, reason: not valid java name */
    public final long m8077getLetterSpacingLargeXSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a + 75;
        int i4 = i3 % 128;
        f5488c = i4;
        int i5 = i3 % 2;
        long j2 = letterSpacingLarge;
        int i6 = i4 + 91;
        f5486a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getLetterSpacingExtraLarge-XSAIIZE, reason: not valid java name */
    public final long m8076getLetterSpacingExtraLargeXSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a + 123;
        f5488c = i3 % 128;
        if (i3 % 2 == 0) {
            return letterSpacingExtraLarge;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getSize12-XSAIIZE, reason: not valid java name */
    public final long m8080getSize12XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a + 55;
        int i4 = i3 % 128;
        f5488c = i4;
        int i5 = i3 % 2;
        long j2 = size12;
        int i6 = i4 + 91;
        f5486a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSize14-XSAIIZE, reason: not valid java name */
    public final long m8081getSize14XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c + 93;
        int i4 = i3 % 128;
        f5486a = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = size14;
        int i5 = i4 + 7;
        f5488c = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSize16-XSAIIZE, reason: not valid java name */
    public final long m8082getSize16XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c;
        int i4 = i3 + 97;
        f5486a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = size16;
        int i6 = i3 + 83;
        f5486a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getSize18-XSAIIZE, reason: not valid java name */
    public final long m8083getSize18XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c;
        int i4 = i3 + 39;
        f5486a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = size18;
        int i6 = i3 + 25;
        f5486a = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getSize20-XSAIIZE, reason: not valid java name */
    public final long m8084getSize20XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a;
        int i4 = i3 + 13;
        f5488c = i4 % 128;
        int i5 = i4 % 2;
        long j2 = size20;
        int i6 = i3 + 55;
        f5488c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return j2;
    }

    /* JADX INFO: renamed from: getSize24-XSAIIZE, reason: not valid java name */
    public final long m8085getSize24XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c + 89;
        int i4 = i3 % 128;
        f5486a = i4;
        int i5 = i3 % 2;
        long j2 = size24;
        if (i5 == 0) {
            int i6 = 52 / 0;
        }
        int i7 = i4 + 79;
        f5488c = i7 % 128;
        if (i7 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSize26-XSAIIZE, reason: not valid java name */
    public final long m8086getSize26XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5486a + 19;
        int i4 = i3 % 128;
        f5488c = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j2 = size26;
        int i5 = i4 + 23;
        f5486a = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getSize32-XSAIIZE, reason: not valid java name */
    public final long m8087getSize32XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c;
        int i4 = i3 + 93;
        f5486a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = size32;
        int i6 = i3 + 21;
        f5486a = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    /* JADX INFO: renamed from: getSize48-XSAIIZE, reason: not valid java name */
    public final long m8088getSize48XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c + 113;
        f5486a = i3 % 128;
        if (i3 % 2 != 0) {
            return size48;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getSize80-XSAIIZE, reason: not valid java name */
    public final long m8089getSize80XSAIIZE() {
        int i2 = 2 % 2;
        int i3 = f5488c + 61;
        f5486a = i3 % 128;
        if (i3 % 2 != 0) {
            return size80;
        }
        int i4 = 77 / 0;
        return size80;
    }
}
