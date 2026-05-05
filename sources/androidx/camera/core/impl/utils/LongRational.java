package androidx.camera.core.impl.utils;

import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    LongRational(long j2, long j3) {
        this.mNumerator = j2;
        this.mDenominator = j3;
    }

    LongRational(double d2) {
        this((long) (d2 * 10000.0d), 10000L);
    }

    long getNumerator() {
        return this.mNumerator;
    }

    long getDenominator() {
        return this.mDenominator;
    }

    double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public String toString() {
        return this.mNumerator + RemoteSettings.FORWARD_SLASH_STRING + this.mDenominator;
    }
}
