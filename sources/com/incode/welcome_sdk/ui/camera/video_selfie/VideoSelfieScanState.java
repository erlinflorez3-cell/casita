package com.incode.welcome_sdk.ui.camera.video_selfie;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieScanState {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ VideoSelfieScanState[] f12200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12201g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f12205k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f12206l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f12207n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f12208o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final VideoSelfieScanState f12198d = new VideoSelfieScanState("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final VideoSelfieScanState f12196b = new VideoSelfieScanState("SETUP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VideoSelfieScanState f12197c = new VideoSelfieScanState("SELFIE_STEP", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final VideoSelfieScanState f12199e = new VideoSelfieScanState("FRONT_ID_STEP", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final VideoSelfieScanState f12195a = new VideoSelfieScanState("BACK_ID_STEP", 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static VideoSelfieScanState f12202h = new VideoSelfieScanState("POA_STEP", 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final VideoSelfieScanState f12203i = new VideoSelfieScanState("QUESTIONS_STEP", 6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final VideoSelfieScanState f12204j = new VideoSelfieScanState("VOICE_CONSENT_STEP", 7);

    private VideoSelfieScanState(String str, int i2) {
    }

    static {
        VideoSelfieScanState[] videoSelfieScanStateArrB = b();
        f12200f = videoSelfieScanStateArrB;
        f12201g = EnumEntriesKt.enumEntries(videoSelfieScanStateArrB);
        int i2 = f12205k + 99;
        f12206l = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ VideoSelfieScanState[] b() {
        int i2 = 2 % 2;
        int i3 = f12207n;
        int i4 = i3 + 85;
        f12208o = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieScanState[] videoSelfieScanStateArr = {f12198d, f12196b, f12197c, f12199e, f12195a, f12202h, f12203i, f12204j};
        int i6 = i3 + 61;
        f12208o = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return videoSelfieScanStateArr;
    }

    public static EnumEntries<VideoSelfieScanState> getEntries() {
        int i2 = 2 % 2;
        int i3 = f12207n + 65;
        int i4 = i3 % 128;
        f12208o = i4;
        int i5 = i3 % 2;
        EnumEntries<VideoSelfieScanState> enumEntries = f12201g;
        int i6 = i4 + 99;
        f12207n = i6 % 128;
        int i7 = i6 % 2;
        return enumEntries;
    }

    public static VideoSelfieScanState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12208o + 15;
        f12207n = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieScanState videoSelfieScanState = (VideoSelfieScanState) Enum.valueOf(VideoSelfieScanState.class, str);
        if (i4 != 0) {
            return videoSelfieScanState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoSelfieScanState[] values() {
        int i2 = 2 % 2;
        int i3 = f12207n + 89;
        f12208o = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieScanState[] videoSelfieScanStateArr = (VideoSelfieScanState[]) f12200f.clone();
        int i5 = f12207n + 65;
        f12208o = i5 % 128;
        if (i5 % 2 == 0) {
            return videoSelfieScanStateArr;
        }
        throw null;
    }
}
