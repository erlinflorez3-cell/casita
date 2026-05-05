package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

/* JADX INFO: loaded from: classes5.dex */
public enum AnimationType {
    NONE,
    COLOR,
    SCALE,
    WORM,
    SLIDE,
    FILL,
    THIN_WORM,
    DROP,
    SWAP,
    SCALE_DOWN;


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f6069k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f6070l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f6071m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f6073o = 0;

    static {
        int i2 = f6073o + 79;
        f6069k = i2 % 128;
        int i3 = i2 % 2;
    }

    public static AnimationType valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f6071m + 7;
        f6070l = i3 % 128;
        int i4 = i3 % 2;
        AnimationType animationType = (AnimationType) Enum.valueOf(AnimationType.class, str);
        int i5 = f6071m + 19;
        f6070l = i5 % 128;
        int i6 = i5 % 2;
        return animationType;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AnimationType[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f6071m + 15;
        f6070l = i3 % 128;
        int i4 = i3 % 2;
        AnimationType[] animationTypeArrValuesCustom = values();
        if (i4 != 0) {
            return (AnimationType[]) animationTypeArrValuesCustom.clone();
        }
        throw null;
    }
}
