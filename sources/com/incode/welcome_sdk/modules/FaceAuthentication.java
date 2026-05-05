package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceAuthentication extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10527b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10528c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10529d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10530e = 0;
    private final int autoCaptureTimeout;
    private final int captureAttempts;
    private final boolean eyesClosedCheckEnabled;
    private final boolean headCoverCheckEnabled;
    private final boolean lensesCheckEnabled;
    private final boolean maskCheckEnabled;
    private final boolean showTutorials;

    public final boolean getShowTutorials() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10530e;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10528c = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.showTutorials;
            int i5 = 89 / 0;
        } else {
            z2 = this.showTutorials;
        }
        int i6 = i3 + 21;
        f10528c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 49 / 0;
        }
        return z2;
    }

    public final int getAutoCaptureTimeout() {
        int i2 = 2 % 2;
        int i3 = f10528c + 25;
        f10530e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.autoCaptureTimeout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getCaptureAttempts() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10528c + 83;
        int i5 = i4 % 128;
        f10530e = i5;
        if (i4 % 2 != 0) {
            i2 = this.captureAttempts;
            int i6 = 19 / 0;
        } else {
            i2 = this.captureAttempts;
        }
        int i7 = i5 + 115;
        f10528c = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public final boolean getEyesClosedCheckEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10528c + 39;
        int i4 = i3 % 128;
        f10530e = i4;
        if (i3 % 2 != 0) {
            z2 = this.eyesClosedCheckEnabled;
            int i5 = 17 / 0;
        } else {
            z2 = this.eyesClosedCheckEnabled;
        }
        int i6 = i4 + 121;
        f10528c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getHeadCoverCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10528c + 9;
        int i4 = i3 % 128;
        f10530e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.headCoverCheckEnabled;
        int i6 = i4 + 69;
        f10528c = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getLensesCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10528c;
        int i4 = i3 + 109;
        f10530e = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.lensesCheckEnabled;
        int i6 = i3 + 53;
        f10530e = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getMaskCheckEnabled() {
        int i2 = 2 % 2;
        int i3 = f10530e;
        int i4 = i3 + 29;
        f10528c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.maskCheckEnabled;
        int i6 = i3 + 53;
        f10528c = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FaceAuthentication(boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(Modules.AUTHENTICATION);
        this.showTutorials = z2;
        this.autoCaptureTimeout = i2;
        this.captureAttempts = i3;
        this.eyesClosedCheckEnabled = z3;
        this.headCoverCheckEnabled = z4;
        this.lensesCheckEnabled = z5;
        this.maskCheckEnabled = z6;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10531a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10532b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10533c = 97 % 128;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10534d = 0;
        private boolean showTutorials = true;
        private int autoCaptureTimeout = -1;
        private int captureAttempts = -1;
        private boolean eyesClosedCheckEnabled = true;
        private boolean headCoverCheckEnabled = true;
        private boolean lensesCheckEnabled = true;
        private boolean maskCheckEnabled = true;

        public final Builder setShowTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10532b + 51;
            f10531a = i3 % 128;
            if (i3 % 2 != 0) {
                this.showTutorials = z2;
                int i4 = 28 / 0;
            } else {
                this.showTutorials = z2;
            }
            return this;
        }

        public final Builder setAutoCaptureTimeout(int i2) {
            int i3 = 2 % 2;
            int i4 = f10532b + 49;
            int i5 = i4 % 128;
            f10531a = i5;
            Object obj = null;
            if (i4 % 2 == 0) {
                this.autoCaptureTimeout = i2;
                int i6 = i5 + 85;
                f10532b = i6 % 128;
                if (i6 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.autoCaptureTimeout = i2;
            obj.hashCode();
            throw null;
        }

        public final Builder setCaptureAttempts(int i2) {
            int i3 = 2 % 2;
            int i4 = f10532b + 69;
            int i5 = i4 % 128;
            f10531a = i5;
            if (i4 % 2 != 0) {
                this.captureAttempts = i2;
                int i6 = 31 / 0;
            } else {
                this.captureAttempts = i2;
            }
            int i7 = i5 + 81;
            f10532b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 49 / 0;
            }
            return this;
        }

        public final Builder setEyesClosedCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10531a;
            int i4 = i3 + 109;
            f10532b = i4 % 128;
            int i5 = i4 % 2;
            this.eyesClosedCheckEnabled = z2;
            int i6 = i3 + 39;
            f10532b = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setHeadCoverCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10531a + 123;
            int i4 = i3 % 128;
            f10532b = i4;
            if (i3 % 2 == 0) {
                this.headCoverCheckEnabled = z2;
                int i5 = 96 / 0;
            } else {
                this.headCoverCheckEnabled = z2;
            }
            int i6 = i4 + 33;
            f10531a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setLensesCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10532b;
            int i4 = i3 + 31;
            f10531a = i4 % 128;
            if (i4 % 2 != 0) {
                this.lensesCheckEnabled = z2;
                int i5 = 85 / 0;
            } else {
                this.lensesCheckEnabled = z2;
            }
            int i6 = i3 + 1;
            f10531a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 38 / 0;
            }
            return this;
        }

        public final Builder setMaskCheckEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10531a;
            int i4 = i3 + 55;
            f10532b = i4 % 128;
            int i5 = i4 % 2;
            this.maskCheckEnabled = z2;
            int i6 = i3 + 3;
            f10532b = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final FaceAuthentication build() {
            int i2 = 2 % 2;
            FaceAuthentication faceAuthentication = new FaceAuthentication(this.showTutorials, this.autoCaptureTimeout, this.captureAttempts, this.eyesClosedCheckEnabled, this.headCoverCheckEnabled, this.lensesCheckEnabled, this.maskCheckEnabled);
            int i3 = f10532b + 71;
            f10531a = i3 % 128;
            int i4 = i3 % 2;
            return faceAuthentication;
        }

        static {
            int i2 = 97 % 2;
        }
    }

    static {
        int i2 = 1 + 39;
        f10529d = i2 % 128;
        int i3 = i2 % 2;
    }
}
