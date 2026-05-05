package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieProgress {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12604c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12605e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12606b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final VideoSelfieProgressItem f12607d;

    public VideoSelfieProgress(VideoSelfieProgressItem videoSelfieProgressItem, boolean z2) {
        Intrinsics.checkNotNullParameter(videoSelfieProgressItem, "");
        this.f12607d = videoSelfieProgressItem;
        this.f12606b = z2;
    }

    public /* synthetic */ VideoSelfieProgress(VideoSelfieProgressItem videoSelfieProgressItem, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoSelfieProgressItem, (i2 & 2) != 0 ? false : z2);
    }

    public final VideoSelfieProgressItem getVideoSelfieProgressItem() {
        int i2 = 2 % 2;
        int i3 = f12604c + 115;
        int i4 = i3 % 128;
        f12605e = i4;
        int i5 = i3 % 2;
        VideoSelfieProgressItem videoSelfieProgressItem = this.f12607d;
        int i6 = i4 + 123;
        f12604c = i6 % 128;
        int i7 = i6 % 2;
        return videoSelfieProgressItem;
    }

    public final boolean isVideoSelfieProgressCompleted() {
        int i2 = 2 % 2;
        int i3 = f12605e + 109;
        f12604c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f12606b;
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f12604c + 105;
        int i4 = i3 % 128;
        f12605e = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSelfieProgress) {
            VideoSelfieProgress videoSelfieProgress = (VideoSelfieProgress) obj;
            return Intrinsics.areEqual(this.f12607d, videoSelfieProgress.f12607d) && this.f12606b == videoSelfieProgress.f12606b;
        }
        int i6 = i4 + 93;
        f12604c = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i4 + 107;
        f12604c = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12604c + 89;
        f12605e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f12607d.hashCode() * 31) + Boolean.hashCode(this.f12606b);
        int i5 = f12604c + 1;
        f12605e = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12604c + 107;
        f12605e = i3 % 128;
        int i4 = i3 % 2;
        String str = "VideoSelfieProgress(videoSelfieProgressItem=" + this.f12607d + ", isVideoSelfieProgressCompleted=" + this.f12606b + ")";
        int i5 = f12605e + 11;
        f12604c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ VideoSelfieProgress copy$default(VideoSelfieProgress videoSelfieProgress, VideoSelfieProgressItem videoSelfieProgressItem, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f12605e;
        int i5 = i4 + 87;
        f12604c = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 53;
            f12604c = i7 % 128;
            int i8 = i7 % 2;
            videoSelfieProgressItem = videoSelfieProgress.f12607d;
        }
        if ((i2 & 2) != 0) {
            z2 = videoSelfieProgress.f12606b;
        }
        return videoSelfieProgress.copy(videoSelfieProgressItem, z2);
    }

    public final VideoSelfieProgress copy(VideoSelfieProgressItem videoSelfieProgressItem, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieProgressItem, "");
        VideoSelfieProgress videoSelfieProgress = new VideoSelfieProgress(videoSelfieProgressItem, z2);
        int i3 = f12604c + 53;
        f12605e = i3 % 128;
        int i4 = i3 % 2;
        return videoSelfieProgress;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f12604c + 49;
        f12605e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12606b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoSelfieProgressItem component1() {
        int i2 = 2 % 2;
        int i3 = f12605e + 25;
        int i4 = i3 % 128;
        f12604c = i4;
        int i5 = i3 % 2;
        VideoSelfieProgressItem videoSelfieProgressItem = this.f12607d;
        int i6 = i4 + 99;
        f12605e = i6 % 128;
        if (i6 % 2 == 0) {
            return videoSelfieProgressItem;
        }
        throw null;
    }
}
