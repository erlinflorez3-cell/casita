package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data;

/* JADX INFO: loaded from: classes5.dex */
public enum Orientation {
    HORIZONTAL,
    VERTICAL;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6189c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6190d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f6192f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f6193h = 0;

    static {
        int i2 = f6192f + 67;
        f6193h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static Orientation valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f6189c + 71;
        f6190d = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Orientation orientation = (Orientation) Enum.valueOf(Orientation.class, str);
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f6189c + 85;
        f6190d = i5 % 128;
        if (i5 % 2 == 0) {
            return orientation;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Orientation[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f6189c + 117;
        f6190d = i3 % 128;
        int i4 = i3 % 2;
        Orientation[] orientationArr = (Orientation[]) values().clone();
        int i5 = f6190d + 47;
        f6189c = i5 % 128;
        int i6 = i5 % 2;
        return orientationArr;
    }
}
