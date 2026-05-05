package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress;

import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieProgressItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12620b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12621d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoSelfieProgressItemState f12622a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoSelfieScanState f12623e;

    public VideoSelfieProgressItem(VideoSelfieScanState videoSelfieScanState, VideoSelfieProgressItemState videoSelfieProgressItemState) {
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        Intrinsics.checkNotNullParameter(videoSelfieProgressItemState, "");
        this.f12623e = videoSelfieScanState;
        this.f12622a = videoSelfieProgressItemState;
    }

    public final VideoSelfieScanState getVideoSelfieScanState() {
        int i2 = 2 % 2;
        int i3 = f12620b;
        int i4 = i3 + 69;
        f12621d = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieScanState videoSelfieScanState = this.f12623e;
        int i6 = i3 + 27;
        f12621d = i6 % 128;
        int i7 = i6 % 2;
        return videoSelfieScanState;
    }

    public /* synthetic */ VideoSelfieProgressItem(VideoSelfieScanState videoSelfieScanState, VideoSelfieProgressItemState videoSelfieProgressItemState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoSelfieScanState, (i2 & 2) != 0 ? VideoSelfieProgressItemState.f12624a : videoSelfieProgressItemState);
    }

    public final VideoSelfieProgressItemState getState() {
        int i2 = 2 % 2;
        int i3 = f12621d;
        int i4 = i3 + 71;
        f12620b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        VideoSelfieProgressItemState videoSelfieProgressItemState = this.f12622a;
        int i5 = i3 + 53;
        f12620b = i5 % 128;
        int i6 = i5 % 2;
        return videoSelfieProgressItemState;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSelfieProgressItem)) {
            int i3 = f12621d + 25;
            f12620b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        VideoSelfieProgressItem videoSelfieProgressItem = (VideoSelfieProgressItem) obj;
        if (this.f12623e != videoSelfieProgressItem.f12623e) {
            int i5 = f12621d + 61;
            f12620b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f12622a == videoSelfieProgressItem.f12622a) {
            return true;
        }
        int i7 = f12621d + 115;
        f12620b = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12621d + 69;
        f12620b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f12623e.hashCode() * 31) + this.f12622a.hashCode();
        int i5 = f12620b + 115;
        f12621d = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12620b + 67;
        f12621d = i3 % 128;
        int i4 = i3 % 2;
        String str = "VideoSelfieProgressItem(videoSelfieScanState=" + this.f12623e + ", state=" + this.f12622a + ")";
        int i5 = f12620b + 63;
        f12621d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public static /* synthetic */ VideoSelfieProgressItem copy$default(VideoSelfieProgressItem videoSelfieProgressItem, VideoSelfieScanState videoSelfieScanState, VideoSelfieProgressItemState videoSelfieProgressItemState, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f12621d + 45;
            f12620b = i4 % 128;
            int i5 = i4 % 2;
            videoSelfieScanState = videoSelfieProgressItem.f12623e;
        }
        if ((i2 & 2) != 0) {
            int i6 = f12620b;
            int i7 = i6 + 49;
            f12621d = i7 % 128;
            if (i7 % 2 == 0) {
                videoSelfieProgressItemState = videoSelfieProgressItem.f12622a;
                int i8 = 83 / 0;
            } else {
                videoSelfieProgressItemState = videoSelfieProgressItem.f12622a;
            }
            int i9 = i6 + 7;
            f12621d = i9 % 128;
            int i10 = i9 % 2;
        }
        return videoSelfieProgressItem.copy(videoSelfieScanState, videoSelfieProgressItemState);
    }

    public final VideoSelfieProgressItem copy(VideoSelfieScanState videoSelfieScanState, VideoSelfieProgressItemState videoSelfieProgressItemState) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        Intrinsics.checkNotNullParameter(videoSelfieProgressItemState, "");
        VideoSelfieProgressItem videoSelfieProgressItem = new VideoSelfieProgressItem(videoSelfieScanState, videoSelfieProgressItemState);
        int i3 = f12620b + 85;
        f12621d = i3 % 128;
        if (i3 % 2 != 0) {
            return videoSelfieProgressItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoSelfieProgressItemState component2() {
        int i2 = 2 % 2;
        int i3 = f12621d + 95;
        f12620b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12622a;
        }
        throw null;
    }

    public final VideoSelfieScanState component1() {
        int i2 = 2 % 2;
        int i3 = f12620b + 89;
        int i4 = i3 % 128;
        f12621d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoSelfieScanState videoSelfieScanState = this.f12623e;
        int i5 = i4 + 67;
        f12620b = i5 % 128;
        int i6 = i5 % 2;
        return videoSelfieScanState;
    }
}
