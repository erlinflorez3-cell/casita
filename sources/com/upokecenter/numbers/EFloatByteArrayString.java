package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class EFloatByteArrayString {
    private EFloatByteArrayString() {
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.numbers.EFloat DoubleEFloatFromString(byte[] r25, int r26, int r27, com.upokecenter.numbers.EContext r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EFloatByteArrayString.DoubleEFloatFromString(byte[], int, int, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EFloat");
    }

    static EFloat FromString(byte[] bArr, int i2, int i3, EContext eContext, boolean z2) {
        byte b2;
        EFloat eFloatDoubleEFloatFromString;
        if (bArr == null) {
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
        if (i2 > bArr.length) {
            if (z2) {
                throw new NumberFormatException("offset(" + i2 + ") is not less or equal to " + bArr.length);
            }
            return null;
        }
        if (i3 < 0) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is not greater or equal to 0");
            }
            return null;
        }
        if (i3 > bArr.length) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is not less or equal to " + bArr.length);
            }
            return null;
        }
        if (bArr.length - i2 < i3) {
            if (z2) {
                throw new NumberFormatException("str's length minus " + i2 + "(" + (bArr.length - i2) + ") is not greater or equal to " + i3);
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
            byte b3 = bArr[i2];
            int i5 = (b3 == 45 || b3 == 43) ? i2 + 1 : i2;
            if (i5 < i4 && ((((b2 = bArr[i5]) >= 48 && b2 <= 57) || b2 == 46) && (eFloatDoubleEFloatFromString = DoubleEFloatFromString(bArr, i2, i3, eContext, z2)) != null)) {
                return eFloatDoubleEFloatFromString;
            }
        }
        return EDecimal.FromString(bArr, i2, i3, EContext.Unlimited.WithSimplified(eContext != null && eContext.isSimplified())).ToEFloat(eContext);
    }
}
