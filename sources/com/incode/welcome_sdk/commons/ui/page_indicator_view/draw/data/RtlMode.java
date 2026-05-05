package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data;

/* JADX INFO: loaded from: classes5.dex */
public enum RtlMode {
    On,
    Off,
    Auto;


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6207e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f6208h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f6209i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f6210j = 0;

    static {
        int i2 = f6208h + 71;
        f6210j = i2 % 128;
        int i3 = i2 % 2;
    }

    public static RtlMode valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f6209i + 1;
        f6207e = i3 % 128;
        int i4 = i3 % 2;
        RtlMode rtlMode = (RtlMode) Enum.valueOf(RtlMode.class, str);
        if (i4 != 0) {
            int i5 = 17 / 0;
        }
        int i6 = f6207e + 89;
        f6209i = i6 % 128;
        int i7 = i6 % 2;
        return rtlMode;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static RtlMode[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f6209i + 69;
        f6207e = i3 % 128;
        int i4 = i3 % 2;
        RtlMode[] rtlModeArr = (RtlMode[]) values().clone();
        int i5 = f6209i + 89;
        f6207e = i5 % 128;
        if (i5 % 2 == 0) {
            return rtlModeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
