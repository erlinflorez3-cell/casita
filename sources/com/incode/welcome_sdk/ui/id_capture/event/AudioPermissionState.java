package com.incode.welcome_sdk.ui.id_capture.event;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class AudioPermissionState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AudioPermissionState[] f14990c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14994g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14995h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f14996i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14997j = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AudioPermissionState f14992e = new AudioPermissionState("INIT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AudioPermissionState f14989b = new AudioPermissionState("REQUESTING", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AudioPermissionState f14991d = new AudioPermissionState("DENIED", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioPermissionState f14988a = new AudioPermissionState("GRANTED", 3);

    private AudioPermissionState(String str, int i2) {
    }

    static {
        AudioPermissionState[] audioPermissionStateArrC = c();
        f14990c = audioPermissionStateArrC;
        f14993f = EnumEntriesKt.enumEntries(audioPermissionStateArrC);
        int i2 = f14994g + 61;
        f14997j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
    }

    private static final /* synthetic */ AudioPermissionState[] c() {
        int i2 = 2 % 2;
        int i3 = f14996i;
        int i4 = i3 + 51;
        f14995h = i4 % 128;
        int i5 = i4 % 2;
        AudioPermissionState[] audioPermissionStateArr = {f14992e, f14989b, f14991d, f14988a};
        int i6 = i3 + 17;
        f14995h = i6 % 128;
        int i7 = i6 % 2;
        return audioPermissionStateArr;
    }

    public static EnumEntries<AudioPermissionState> getEntries() {
        int i2 = 2 % 2;
        int i3 = f14996i;
        int i4 = i3 + 33;
        f14995h = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<AudioPermissionState> enumEntries = f14993f;
        int i6 = i3 + 65;
        f14995h = i6 % 128;
        int i7 = i6 % 2;
        return enumEntries;
    }

    public static AudioPermissionState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f14995h + 99;
        f14996i = i3 % 128;
        int i4 = i3 % 2;
        AudioPermissionState audioPermissionState = (AudioPermissionState) Enum.valueOf(AudioPermissionState.class, str);
        if (i4 == 0) {
            return audioPermissionState;
        }
        throw null;
    }

    public static AudioPermissionState[] values() {
        int i2 = 2 % 2;
        int i3 = f14996i + 115;
        f14995h = i3 % 128;
        int i4 = i3 % 2;
        AudioPermissionState[] audioPermissionStateArr = (AudioPermissionState[]) f14990c.clone();
        int i5 = f14995h + 85;
        f14996i = i5 % 128;
        if (i5 % 2 == 0) {
            return audioPermissionStateArr;
        }
        throw null;
    }
}
