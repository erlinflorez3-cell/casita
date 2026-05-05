package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* JADX INFO: loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    OnEnableDisableSessionDurationCheck(boolean z2) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z2;
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j3 = jElapsedRealtime - j2;
            if (j3 >= 100) {
                return;
            }
            long j4 = 100 - j3;
            try {
                Logger.d(TAG, "onDisableSession too soon, wait " + j4 + " ms");
                Thread.sleep(j4);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j2 = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.e(TAG, "sleep interrupted");
                return;
            }
        }
    }
}
