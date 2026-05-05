package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);
    private int attemptCount;
    private long nextRequestTime;
    private final Utils utils;

    RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    RequestLimiter(Utils utils) {
        this.utils = utils;
    }

    private synchronized long getBackoffDuration(int i2) {
        if (isRetryableError(i2)) {
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
    }

    private static boolean isRetryableError(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isRequestAllowed() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.attemptCount     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            com.google.firebase.installations.Utils r0 = r5.utils     // Catch: java.lang.Throwable -> L16
            long r3 = r0.currentTimeInMillis()     // Catch: java.lang.Throwable -> L16
            long r1 = r5.nextRequestTime     // Catch: java.lang.Throwable -> L16
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
        L11:
            r0 = 1
        L12:
            monitor-exit(r5)
            return r0
        L14:
            r0 = 0
            goto L12
        L16:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.RequestLimiter.isRequestAllowed():boolean");
    }

    public synchronized void setNextRequestTime(int i2) {
        if (isSuccessfulOrRequiresNewFidCreation(i2)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i2);
    }
}
