package com.facebook.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum YogaErrata {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITIONING_INCORRECT(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);

    private final int mIntValue;

    YogaErrata(int i2) {
        this.mIntValue = i2;
    }

    public static YogaErrata fromInt(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return STRETCH_FLEX_BASIS;
        }
        if (i2 == 2) {
            return ABSOLUTE_POSITIONING_INCORRECT;
        }
        if (i2 == 4) {
            return ABSOLUTE_PERCENT_AGAINST_INNER_SIZE;
        }
        switch (i2) {
            case 2147483646:
                return CLASSIC;
            case Integer.MAX_VALUE:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i2);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
