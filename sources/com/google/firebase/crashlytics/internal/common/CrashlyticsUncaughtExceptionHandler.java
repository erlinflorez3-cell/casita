package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r6 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r5 = "Completed exception processing, but no default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.isHandlingException
            r4 = 1
            r0.set(r4)
            r2 = 0
            boolean r0 = r7.shouldRecordUncaughtException(r8, r9)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            if (r0 == 0) goto L19
            com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener r1 = r7.crashListener     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r0 = r7.settingsProvider     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            r1.onUncaughtException(r0, r8, r9)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            goto L3d
        L19:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            java.lang.String r0 = "Uncaught exception will not be recorded by Crashlytics."
            r1.d(r0)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L53
            goto L3d
        L23:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "An error occurred in the uncaught exception handler"
            r1.e(r0, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            if (r0 == 0) goto L32
            goto L41
        L32:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r5)
            java.lang.System.exit(r4)
            goto L4d
        L3d:
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            if (r0 == 0) goto L32
        L41:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r6)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.isHandlingException
            r0.set(r2)
            return
        L53:
            r1 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            if (r0 == 0) goto L6a
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r6)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
        L64:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.isHandlingException
            r0.set(r2)
            throw r1
        L6a:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r5)
            java.lang.System.exit(r4)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
