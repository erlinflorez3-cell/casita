package com.facebook.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum YogaGutter {
    COLUMN(0),
    ROW(1),
    ALL(2);

    private final int mIntValue;

    YogaGutter(int i2) {
        this.mIntValue = i2;
    }

    public static YogaGutter fromInt(int i2) {
        if (i2 == 0) {
            return COLUMN;
        }
        if (i2 == 1) {
            return ROW;
        }
        if (i2 == 2) {
            return ALL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i2);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
