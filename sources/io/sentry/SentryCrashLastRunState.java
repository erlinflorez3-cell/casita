package io.sentry;

import io.sentry.cache.EnvelopeCache;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryCrashLastRunState {
    private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
    private Boolean crashedLastRun;
    private final Object crashedLastRunLock = new Object();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    public Boolean isCrashedLastRun(String str, boolean z2) {
        synchronized (this.crashedLastRunLock) {
            if (this.readCrashedLastRun) {
                return this.crashedLastRun;
            }
            if (str == null) {
                return null;
            }
            boolean z3 = true;
            this.readCrashedLastRun = true;
            File file = new File(str, EnvelopeCache.CRASH_MARKER_FILE);
            File file2 = new File(str, EnvelopeCache.NATIVE_CRASH_MARKER_FILE);
            if (!file.exists()) {
                if (!file2.exists()) {
                    z3 = false;
                } else if (z2) {
                    file2.delete();
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                this.crashedLastRun = boolValueOf;
                return boolValueOf;
            }
            file.delete();
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            this.crashedLastRun = boolValueOf2;
            return boolValueOf2;
        }
    }

    public void reset() {
        synchronized (this.crashedLastRunLock) {
            this.readCrashedLastRun = false;
            this.crashedLastRun = null;
        }
    }

    public void setCrashedLastRun(boolean z2) {
        synchronized (this.crashedLastRunLock) {
            if (!this.readCrashedLastRun) {
                this.crashedLastRun = Boolean.valueOf(z2);
                this.readCrashedLastRun = true;
            }
        }
    }
}
