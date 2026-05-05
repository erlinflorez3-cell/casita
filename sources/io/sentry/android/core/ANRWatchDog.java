package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.transport.ICurrentDateProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
final class ANRWatchDog extends Thread {
    private final ANRListener anrListener;
    private final Context context;
    private volatile long lastKnownActiveUiTimestampMs;
    private final ILogger logger;
    private long pollingIntervalMs;
    private final boolean reportInDebug;
    private final AtomicBoolean reported;
    private final Runnable ticker;
    private final ICurrentDateProvider timeProvider;
    private final long timeoutIntervalMillis;
    private final MainLooperHandler uiHandler;

    public interface ANRListener {
        void onAppNotResponding(ApplicationNotResponding applicationNotResponding);
    }

    ANRWatchDog(long j2, boolean z2, ANRListener aNRListener, ILogger iLogger, Context context) {
        this(new ICurrentDateProvider() { // from class: io.sentry.android.core.ANRWatchDog$$ExternalSyntheticLambda0
            @Override // io.sentry.transport.ICurrentDateProvider
            public final long getCurrentTimeMillis() {
                return SystemClock.uptimeMillis();
            }
        }, j2, 500L, z2, aNRListener, iLogger, new MainLooperHandler(), context);
    }

    ANRWatchDog(final ICurrentDateProvider iCurrentDateProvider, long j2, long j3, boolean z2, ANRListener aNRListener, ILogger iLogger, MainLooperHandler mainLooperHandler, Context context) {
        super("|ANR-WatchDog|");
        this.lastKnownActiveUiTimestampMs = 0L;
        this.reported = new AtomicBoolean(false);
        this.timeProvider = iCurrentDateProvider;
        this.timeoutIntervalMillis = j2;
        this.pollingIntervalMs = j3;
        this.reportInDebug = z2;
        this.anrListener = aNRListener;
        this.logger = iLogger;
        this.uiHandler = mainLooperHandler;
        this.context = context;
        this.ticker = new Runnable() { // from class: io.sentry.android.core.ANRWatchDog$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8888lambda$new$1$iosentryandroidcoreANRWatchDog(iCurrentDateProvider);
            }
        };
        if (j2 < this.pollingIntervalMs * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.pollingIntervalMs * 2)));
        }
    }

    private boolean isProcessNotResponding() throws Throwable {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        Context context = this.context;
        Object[] objArr = {C1561oA.Xd("\u0003\u0006\u0018\u000e\u001c\u0010\u001c\"", (short) (Od.Xd() ^ (-22403)))};
        Method method = Class.forName(Wg.vd("=I>KOHB\u000bGRPUMUZ\u0013/ZX]Ugb", (short) (OY.Xd() ^ 27572))).getMethod(hg.Vd("pm{Y~wwgnSdpse^_", (short) (C1580rY.Xd() ^ (-15168)), (short) (C1580rY.Xd() ^ (-7114))), Class.forName(Qg.kd("\u0005z\u000fxD\u0002u\u0002y?c\u0004\u0001vzr", (short) (Od.Xd() ^ (-28641)), (short) (Od.Xd() ^ (-2317)))));
        try {
            method.setAccessible(true);
            ActivityManager activityManager = (ActivityManager) method.invoke(context, objArr);
            if (activityManager == null) {
                return true;
            }
            try {
                processesInErrorState = activityManager.getProcessesInErrorState();
            } catch (Throwable th) {
                this.logger.log(SentryLevel.ERROR, C1561oA.ud("Bnmik\u0018^[ih\\`X\u00100QaUaS]a4GSEJGS\u0003FCQ,MI<=JI:G\u001c@\u0016BA=?\u001f?+=-t", (short) (Od.Xd() ^ (-11353))), th);
                processesInErrorState = null;
            }
            if (processesInErrorState == null) {
                return false;
            }
            Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
            while (it.hasNext()) {
                if (it.next().condition == 2) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$io-sentry-android-core-ANRWatchDog */
    /* synthetic */ void m8888lambda$new$1$iosentryandroidcoreANRWatchDog(ICurrentDateProvider iCurrentDateProvider) {
        this.lastKnownActiveUiTimestampMs = iCurrentDateProvider.getCurrentTimeMillis();
        this.reported.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        this.ticker.run();
        while (!isInterrupted()) {
            this.uiHandler.post(this.ticker);
            try {
                Thread.sleep(this.pollingIntervalMs);
                if (this.timeProvider.getCurrentTimeMillis() - this.lastKnownActiveUiTimestampMs > this.timeoutIntervalMillis) {
                    if (!this.reportInDebug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.logger.log(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.reported.set(true);
                    } else if (isProcessNotResponding() && this.reported.compareAndSet(false, true)) {
                        this.anrListener.onAppNotResponding(new ApplicationNotResponding("Application Not Responding for at least " + this.timeoutIntervalMillis + " ms.", this.uiHandler.getThread()));
                    }
                }
            } catch (InterruptedException e2) {
                try {
                    Thread.currentThread().interrupt();
                    this.logger.log(SentryLevel.WARNING, "Interrupted: %s", e2.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.logger.log(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e2.getMessage());
                    return;
                }
            }
        }
    }
}
