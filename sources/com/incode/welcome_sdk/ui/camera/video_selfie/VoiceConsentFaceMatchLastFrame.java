package com.incode.welcome_sdk.ui.camera.video_selfie;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VoiceConsentFaceMatchLastFrame {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12218c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12219e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12221b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12222d;

    public VoiceConsentFaceMatchLastFrame(String str, float f2, float f3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f12220a = str;
        this.f12222d = f2;
        this.f12221b = f3;
    }

    public final String getBase64Image() {
        int i2 = 2 % 2;
        int i3 = f12219e + 121;
        f12218c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12220a;
        }
        throw null;
    }

    public final float getConfidence() {
        int i2 = 2 % 2;
        int i3 = f12218c + 107;
        f12219e = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.f12222d;
        if (i4 == 0) {
            int i5 = 59 / 0;
        }
        return f2;
    }

    public final float getThreshold() {
        int i2 = 2 % 2;
        int i3 = f12218c + 35;
        int i4 = i3 % 128;
        f12219e = i4;
        int i5 = i3 % 2;
        float f2 = this.f12221b;
        int i6 = i4 + 9;
        f12218c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return f2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceConsentFaceMatchLastFrame)) {
            int i3 = f12218c + 9;
            f12219e = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        VoiceConsentFaceMatchLastFrame voiceConsentFaceMatchLastFrame = (VoiceConsentFaceMatchLastFrame) obj;
        if (Intrinsics.areEqual(this.f12220a, voiceConsentFaceMatchLastFrame.f12220a)) {
            return Float.compare(this.f12222d, voiceConsentFaceMatchLastFrame.f12222d) == 0 && Float.compare(this.f12221b, voiceConsentFaceMatchLastFrame.f12221b) == 0;
        }
        int i5 = f12218c + 107;
        f12219e = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12219e + 81;
        f12218c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.f12220a.hashCode() * 31) + Float.hashCode(this.f12222d)) * 31) + Float.hashCode(this.f12221b);
        int i5 = f12219e + 15;
        f12218c = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12219e + 23;
        f12218c = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "VoiceConsentFaceMatchLastFrame(base64Image=" + this.f12220a + ", confidence=" + this.f12222d + ", threshold=" + this.f12221b + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "VoiceConsentFaceMatchLastFrame(base64Image=" + this.f12220a + ", confidence=" + this.f12222d + ", threshold=" + this.f12221b + ")";
        int i4 = f12219e + 51;
        f12218c = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ VoiceConsentFaceMatchLastFrame copy$default(VoiceConsentFaceMatchLastFrame voiceConsentFaceMatchLastFrame, String str, float f2, float f3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f12218c + 5;
            f12219e = i4 % 128;
            if (i4 % 2 == 0) {
                String str2 = voiceConsentFaceMatchLastFrame.f12220a;
                throw null;
            }
            str = voiceConsentFaceMatchLastFrame.f12220a;
        }
        if ((i2 & 2) != 0) {
            f2 = voiceConsentFaceMatchLastFrame.f12222d;
        }
        if ((i2 & 4) != 0) {
            int i5 = f12218c + 3;
            f12219e = i5 % 128;
            int i6 = i5 % 2;
            f3 = voiceConsentFaceMatchLastFrame.f12221b;
        }
        return voiceConsentFaceMatchLastFrame.copy(str, f2, f3);
    }

    public final VoiceConsentFaceMatchLastFrame copy(String str, float f2, float f3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        VoiceConsentFaceMatchLastFrame voiceConsentFaceMatchLastFrame = new VoiceConsentFaceMatchLastFrame(str, f2, f3);
        int i3 = f12219e + 19;
        f12218c = i3 % 128;
        int i4 = i3 % 2;
        return voiceConsentFaceMatchLastFrame;
    }

    public final float component3() {
        float f2;
        int i2 = 2 % 2;
        int i3 = f12218c + 81;
        int i4 = i3 % 128;
        f12219e = i4;
        if (i3 % 2 == 0) {
            f2 = this.f12221b;
            int i5 = 86 / 0;
        } else {
            f2 = this.f12221b;
        }
        int i6 = i4 + 41;
        f12218c = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final float component2() {
        int i2 = 2 % 2;
        int i3 = f12219e + 109;
        int i4 = i3 % 128;
        f12218c = i4;
        int i5 = i3 % 2;
        float f2 = this.f12222d;
        int i6 = i4 + 39;
        f12219e = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final String component1() {
        String str;
        int i2 = 2 % 2;
        int i3 = f12218c + 95;
        int i4 = i3 % 128;
        f12219e = i4;
        if (i3 % 2 == 0) {
            str = this.f12220a;
            int i5 = 75 / 0;
        } else {
            str = this.f12220a;
        }
        int i6 = i4 + 7;
        f12218c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
