package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadStep {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ VideoUploadStep[] f12714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12715d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12717f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12718g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12719h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12720i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final VideoUploadStep f12712a = new VideoUploadStep("CONCAT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final VideoUploadStep f12713b = new VideoUploadStep("GENERATE_URL", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final VideoUploadStep f12716e = new VideoUploadStep("UPLOAD_TO_URL", 2);

    private VideoUploadStep(String str, int i2) {
    }

    static {
        VideoUploadStep[] videoUploadStepArrA = a();
        f12714c = videoUploadStepArrA;
        f12715d = EnumEntriesKt.enumEntries(videoUploadStepArrA);
        int i2 = f12717f + 107;
        f12719h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ VideoUploadStep[] a() {
        int i2 = 2 % 2;
        int i3 = f12720i + 15;
        f12718g = i3 % 128;
        if (i3 % 2 != 0) {
            return new VideoUploadStep[]{f12712a, f12713b, f12716e};
        }
        VideoUploadStep[] videoUploadStepArr = new VideoUploadStep[2];
        videoUploadStepArr[0] = f12712a;
        videoUploadStepArr[1] = f12713b;
        videoUploadStepArr[4] = f12716e;
        return videoUploadStepArr;
    }

    public static EnumEntries<VideoUploadStep> getEntries() {
        int i2 = 2 % 2;
        int i3 = f12720i + 47;
        int i4 = i3 % 128;
        f12718g = i4;
        int i5 = i3 % 2;
        EnumEntries<VideoUploadStep> enumEntries = f12715d;
        int i6 = i4 + 27;
        f12720i = i6 % 128;
        if (i6 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoUploadStep valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12720i + 9;
        f12718g = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadStep videoUploadStep = (VideoUploadStep) Enum.valueOf(VideoUploadStep.class, str);
        int i5 = f12720i + 45;
        f12718g = i5 % 128;
        if (i5 % 2 != 0) {
            return videoUploadStep;
        }
        throw null;
    }

    public static VideoUploadStep[] values() {
        int i2 = 2 % 2;
        int i3 = f12718g + 33;
        f12720i = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadStep[] videoUploadStepArr = (VideoUploadStep[]) f12714c.clone();
        int i5 = f12718g + 49;
        f12720i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return videoUploadStepArr;
    }
}
