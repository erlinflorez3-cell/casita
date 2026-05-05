package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieProgressItemState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ VideoSelfieProgressItemState[] f12625b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12627d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12629g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12630h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12631i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12632j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final VideoSelfieProgressItemState f12624a = new VideoSelfieProgressItemState("IDLE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final VideoSelfieProgressItemState f12626c = new VideoSelfieProgressItemState("ACTIVE", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final VideoSelfieProgressItemState f12628e = new VideoSelfieProgressItemState("COMPLETED", 2);

    private VideoSelfieProgressItemState(String str, int i2) {
    }

    static {
        VideoSelfieProgressItemState[] videoSelfieProgressItemStateArrC = c();
        f12625b = videoSelfieProgressItemStateArrC;
        f12627d = EnumEntriesKt.enumEntries(videoSelfieProgressItemStateArrC);
        int i2 = f12629g + 55;
        f12630h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ VideoSelfieProgressItemState[] c() {
        int i2 = 2 % 2;
        int i3 = f12631i + 25;
        int i4 = i3 % 128;
        f12632j = i4;
        int i5 = i3 % 2;
        VideoSelfieProgressItemState[] videoSelfieProgressItemStateArr = {f12624a, f12626c, f12628e};
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12631i = i6 % 128;
        int i7 = i6 % 2;
        return videoSelfieProgressItemStateArr;
    }

    public static EnumEntries<VideoSelfieProgressItemState> getEntries() {
        int i2 = 2 % 2;
        int i3 = f12631i + 21;
        f12632j = i3 % 128;
        if (i3 % 2 != 0) {
            return f12627d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoSelfieProgressItemState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f12631i + 101;
        f12632j = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieProgressItemState videoSelfieProgressItemState = (VideoSelfieProgressItemState) Enum.valueOf(VideoSelfieProgressItemState.class, str);
        int i5 = f12631i + 115;
        f12632j = i5 % 128;
        if (i5 % 2 != 0) {
            return videoSelfieProgressItemState;
        }
        throw null;
    }

    public static VideoSelfieProgressItemState[] values() {
        int i2 = 2 % 2;
        int i3 = f12631i + 123;
        f12632j = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieProgressItemState[] videoSelfieProgressItemStateArr = (VideoSelfieProgressItemState[]) f12625b.clone();
        int i5 = f12632j + 117;
        f12631i = i5 % 128;
        int i6 = i5 % 2;
        return videoSelfieProgressItemStateArr;
    }
}
