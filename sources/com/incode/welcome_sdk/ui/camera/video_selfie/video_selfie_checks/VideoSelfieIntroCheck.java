package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieIntroCheck {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12600d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12601e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12603c;

    public VideoSelfieIntroCheck(int i2, int i3) {
        this.f12602b = i2;
        this.f12603c = i3;
    }

    public final int getIcon() {
        int i2 = 2 % 2;
        int i3 = f12600d;
        int i4 = i3 + 67;
        f12601e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f12602b;
        int i7 = i3 + 117;
        f12601e = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final int getText() {
        int i2 = 2 % 2;
        int i3 = f12600d + 121;
        int i4 = i3 % 128;
        f12601e = i4;
        int i5 = i3 % 2;
        int i6 = this.f12603c;
        int i7 = i4 + 49;
        f12600d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f12600d;
        int i4 = i3 + 63;
        f12601e = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = i3 + 25;
            f12601e = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof VideoSelfieIntroCheck)) {
            return false;
        }
        VideoSelfieIntroCheck videoSelfieIntroCheck = (VideoSelfieIntroCheck) obj;
        return this.f12602b == videoSelfieIntroCheck.f12602b && this.f12603c == videoSelfieIntroCheck.f12603c;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12601e + 23;
        f12600d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Integer.hashCode(this.f12602b) * 31) + Integer.hashCode(this.f12603c);
        int i5 = f12601e + 83;
        f12600d = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12600d + 13;
        f12601e = i3 % 128;
        int i4 = i3 % 2;
        String str = "VideoSelfieIntroCheck(icon=" + this.f12602b + ", text=" + this.f12603c + ")";
        int i5 = f12600d + 57;
        f12601e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ VideoSelfieIntroCheck copy$default(VideoSelfieIntroCheck videoSelfieIntroCheck, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = f12600d;
        int i7 = i6 + 115;
        f12601e = i7 % 128;
        if (i7 % 2 == 0 && (i4 & 1) != 0) {
            i2 = videoSelfieIntroCheck.f12602b;
            int i8 = i6 + 21;
            f12601e = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i4 & 2) != 0) {
            i3 = videoSelfieIntroCheck.f12603c;
        }
        return videoSelfieIntroCheck.copy(i2, i3);
    }

    public final VideoSelfieIntroCheck copy(int i2, int i3) {
        int i4 = 2 % 2;
        VideoSelfieIntroCheck videoSelfieIntroCheck = new VideoSelfieIntroCheck(i2, i3);
        int i5 = f12600d + 95;
        f12601e = i5 % 128;
        int i6 = i5 % 2;
        return videoSelfieIntroCheck;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f12600d + 89;
        int i4 = i3 % 128;
        f12601e = i4;
        int i5 = i3 % 2;
        int i6 = this.f12603c;
        int i7 = i4 + 113;
        f12600d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f12600d + 115;
        int i4 = i3 % 128;
        f12601e = i4;
        int i5 = i3 % 2;
        int i6 = this.f12602b;
        int i7 = i4 + 33;
        f12600d = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
