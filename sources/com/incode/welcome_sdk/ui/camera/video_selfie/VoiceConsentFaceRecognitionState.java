package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.reactnativeincodesdk.ModuleNames;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class VoiceConsentFaceRecognitionState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ VoiceConsentFaceRecognitionState[] f12224b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12228f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12230h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12231i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12232j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final VoiceConsentFaceRecognitionState f12223a = new VoiceConsentFaceRecognitionState("FaceScan", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final VoiceConsentFaceRecognitionState f12226d = new VoiceConsentFaceRecognitionState(ModuleNames.FACE_MATCH, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final VoiceConsentFaceRecognitionState f12227e = new VoiceConsentFaceRecognitionState("Disabled", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VoiceConsentFaceRecognitionState f12225c = new VoiceConsentFaceRecognitionState("Done", 3);

    private VoiceConsentFaceRecognitionState(String str, int i2) {
    }

    static {
        VoiceConsentFaceRecognitionState[] voiceConsentFaceRecognitionStateArrD = d();
        f12224b = voiceConsentFaceRecognitionStateArrD;
        f12229g = EnumEntriesKt.enumEntries(voiceConsentFaceRecognitionStateArrD);
        int i2 = f12228f + 113;
        f12232j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ VoiceConsentFaceRecognitionState[] d() {
        int i2 = 2 % 2;
        int i3 = f12231i + 87;
        int i4 = i3 % 128;
        f12230h = i4;
        int i5 = i3 % 2;
        VoiceConsentFaceRecognitionState[] voiceConsentFaceRecognitionStateArr = {f12223a, f12226d, f12227e, f12225c};
        int i6 = i4 + 37;
        f12231i = i6 % 128;
        int i7 = i6 % 2;
        return voiceConsentFaceRecognitionStateArr;
    }

    public static EnumEntries<VoiceConsentFaceRecognitionState> getEntries() {
        int i2 = 2 % 2;
        int i3 = f12231i + 103;
        f12230h = i3 % 128;
        if (i3 % 2 != 0) {
            return f12229g;
        }
        throw null;
    }

    public static VoiceConsentFaceRecognitionState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12231i + 47;
        f12230h = i3 % 128;
        int i4 = i3 % 2;
        VoiceConsentFaceRecognitionState voiceConsentFaceRecognitionState = (VoiceConsentFaceRecognitionState) Enum.valueOf(VoiceConsentFaceRecognitionState.class, str);
        int i5 = f12231i + 17;
        f12230h = i5 % 128;
        int i6 = i5 % 2;
        return voiceConsentFaceRecognitionState;
    }

    public static VoiceConsentFaceRecognitionState[] values() {
        int i2 = 2 % 2;
        int i3 = f12230h + 63;
        f12231i = i3 % 128;
        int i4 = i3 % 2;
        VoiceConsentFaceRecognitionState[] voiceConsentFaceRecognitionStateArr = (VoiceConsentFaceRecognitionState[]) f12224b.clone();
        int i5 = f12231i + 87;
        f12230h = i5 % 128;
        if (i5 % 2 != 0) {
            return voiceConsentFaceRecognitionStateArr;
        }
        throw null;
    }
}
