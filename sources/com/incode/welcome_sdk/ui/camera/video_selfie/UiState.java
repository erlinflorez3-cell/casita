package com.incode.welcome_sdk.ui.camera.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public enum UiState {
    DEFAULT,
    PROCESSING,
    SUCCESS,
    RETRY,
    ERROR,
    ERROR_CONTINUE;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12154f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12155g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12157i = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f12159o = 1;

    public static UiState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12155g + 51;
        f12154f = i3 % 128;
        int i4 = i3 % 2;
        UiState uiState = (UiState) Enum.valueOf(UiState.class, str);
        int i5 = f12154f + 101;
        f12155g = i5 % 128;
        int i6 = i5 % 2;
        return uiState;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static UiState[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f12155g + 45;
        f12154f = i3 % 128;
        int i4 = i3 % 2;
        UiState[] uiStateArr = (UiState[]) values().clone();
        int i5 = f12154f + 75;
        f12155g = i5 % 128;
        int i6 = i5 % 2;
        return uiStateArr;
    }

    static {
        int i2 = f12157i + 103;
        f12159o = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }
}
