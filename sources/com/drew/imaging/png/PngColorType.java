package com.drew.imaging.png;

/* JADX INFO: loaded from: classes3.dex */
public class PngColorType {
    private final int[] _allowedBitDepths;
    private final String _description;
    private final int _numericValue;
    public static final PngColorType GREYSCALE = new PngColorType(0, "Greyscale", 1, 2, 4, 8, 16);
    public static final PngColorType TRUE_COLOR = new PngColorType(2, "True Color", 8, 16);
    public static final PngColorType INDEXED_COLOR = new PngColorType(3, "Indexed Color", 1, 2, 4, 8);
    public static final PngColorType GREYSCALE_WITH_ALPHA = new PngColorType(4, "Greyscale with Alpha", 8, 16);
    public static final PngColorType TRUE_COLOR_WITH_ALPHA = new PngColorType(6, "True Color with Alpha", 8, 16);

    private PngColorType(int i2, String str, int... iArr) {
        this._numericValue = i2;
        this._description = str;
        this._allowedBitDepths = iArr;
    }

    public static PngColorType fromNumericValue(int i2) {
        return i2 != 0 ? i2 != 6 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new PngColorType(i2, "Unknown (" + i2 + ")", new int[0]) : GREYSCALE_WITH_ALPHA : INDEXED_COLOR : TRUE_COLOR : TRUE_COLOR_WITH_ALPHA : GREYSCALE;
    }

    public int[] getAllowedBitDepths() {
        return this._allowedBitDepths;
    }

    public String getDescription() {
        return this._description;
    }

    public int getNumericValue() {
        return this._numericValue;
    }
}
