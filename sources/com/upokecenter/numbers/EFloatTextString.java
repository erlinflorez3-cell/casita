package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class EFloatTextString {
    private EFloatTextString() {
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.numbers.EFloat DoubleEFloatFromString(java.lang.String r25, int r26, int r27, com.upokecenter.numbers.EContext r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EFloatTextString.DoubleEFloatFromString(java.lang.String, int, int, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EFloat");
    }

    static EFloat FromString(String str, int i2, int i3, EContext eContext, boolean z2) {
        EFloat eFloatDoubleEFloatFromString;
        if (str == null) {
            if (z2) {
                throw new NullPointerException("chars");
            }
            return null;
        }
        if (i2 < 0) {
            if (z2) {
                throw new NumberFormatException("offset(" + i2 + ") is not greater or equal to 0");
            }
            return null;
        }
        if (i2 > str.length()) {
            if (z2) {
                throw new NumberFormatException("offset(" + i2 + ") is not less or equal to " + str.length());
            }
            return null;
        }
        if (i3 < 0) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is not greater or equal to 0");
            }
            return null;
        }
        if (i3 > str.length()) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is not less or equal to " + str.length());
            }
            return null;
        }
        if (str.length() - i2 < i3) {
            if (z2) {
                throw new NumberFormatException("str's length minus " + i2 + "(" + (str.length() - i2) + ") is not greater or equal to " + i3);
            }
            return null;
        }
        EContext eContext2 = EContext.Binary64;
        if (eContext != null && eContext.getHasMaxPrecision() && eContext.getHasExponentRange() && !eContext.isSimplified() && eContext.getEMax().compareTo(eContext2.getEMax()) <= 0 && eContext.getEMin().compareTo(eContext2.getEMin()) >= 0 && eContext.getPrecision().compareTo(eContext2.getPrecision()) <= 0) {
            int i4 = i2 + i3;
            if (i3 == 0) {
                if (z2) {
                    throw new NumberFormatException();
                }
                return null;
            }
            int i5 = (str.charAt(i2) == '-' || str.charAt(i2) == '+') ? i2 + 1 : i2;
            if (i5 < i4 && (((str.charAt(i5) >= '0' && str.charAt(i5) <= '9') || str.charAt(i5) == '.') && (eFloatDoubleEFloatFromString = DoubleEFloatFromString(str, i2, i3, eContext, z2)) != null)) {
                return eFloatDoubleEFloatFromString;
            }
        }
        return EDecimal.FromString(str, i2, i3, EContext.Unlimited.WithSimplified(eContext != null && eContext.isSimplified())).ToEFloat(eContext);
    }
}
