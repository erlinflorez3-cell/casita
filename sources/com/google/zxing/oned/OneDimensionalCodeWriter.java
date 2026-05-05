package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    private static final Pattern NUMERIC = Pattern.compile("[0-9]+");

    protected static int appendPattern(boolean[] zArr, int i2, int[] iArr, boolean z2) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z2;
                i5++;
                i2++;
            }
            i3 += i4;
            z2 = !z2;
        }
        return i3;
    }

    protected static void checkNumeric(String str) {
        if (!NUMERIC.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    private static BitMatrix renderResult(boolean[] zArr, int i2, int i3, int i4) {
        int length = zArr.length;
        int i5 = i4 + length;
        int iMax = Math.max(i2, i5);
        int iMax2 = Math.max(1, i3);
        int i6 = iMax / i5;
        int i7 = (iMax - (length * i6)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                bitMatrix.setRegion(i7, 0, i6, iMax2);
            }
            i8++;
            i7 += i6;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) {
        return encode(str, barcodeFormat, i2, i3, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        }
        Collection<BarcodeFormat> supportedWriteFormats = getSupportedWriteFormats();
        if (supportedWriteFormats != null && !supportedWriteFormats.contains(barcodeFormat)) {
            throw new IllegalArgumentException("Can only encode " + supportedWriteFormats + ", but got " + barcodeFormat);
        }
        int defaultMargin = getDefaultMargin();
        if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
            defaultMargin = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
        }
        return renderResult(encode(str), i2, i3, defaultMargin);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }

    protected Collection<BarcodeFormat> getSupportedWriteFormats() {
        return null;
    }
}
