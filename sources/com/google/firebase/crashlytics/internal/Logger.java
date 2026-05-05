package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i2) {
        return this.logLevel <= i2 || Log.isLoggable(this.tag, i2);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String str) {
        d(str, null);
    }

    public void d(String str, Throwable th) {
        if (canLog(3)) {
            String str2 = this.tag;
        }
    }

    public void e(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (canLog(6)) {
            String str2 = this.tag;
        }
    }

    public void i(String str) {
        i(str, null);
    }

    public void i(String str, Throwable th) {
        if (canLog(4)) {
            String str2 = this.tag;
        }
    }

    public void log(int i2, String str) {
        log(i2, str, false);
    }

    public void log(int i2, String str, boolean z2) {
        if (z2 || canLog(i2)) {
            String str2 = this.tag;
        }
    }

    public void v(String str) {
        v(str, null);
    }

    public void v(String str, Throwable th) {
        if (canLog(2)) {
            String str2 = this.tag;
        }
    }

    public void w(String str) {
        w(str, null);
    }

    public void w(String str, Throwable th) {
        if (canLog(5)) {
            String str2 = this.tag;
        }
    }
}
