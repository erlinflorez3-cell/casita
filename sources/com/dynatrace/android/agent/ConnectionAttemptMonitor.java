package com.dynatrace.android.agent;

import com.dynatrace.android.agent.util.Utility;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionAttemptMonitor {
    private static final long FIFTY_SEVEN_MINUTE = 3420000;
    private static final long ONE_MINUTE = 60000;
    private static final String TAG = Global.LOG_PREFIX + "ConnectionAttemptMonitor";
    private static final long THIRTY_TWO_MINUTE = 1920000;
    private Date currentWhen;
    private long initialConnAttempts;
    private boolean lastConnected;
    private long nextAttemptTime;
    private boolean onceConnected;
    private AtomicBoolean timeToConnect;
    private Timer timer;

    private class AttemptTimer extends TimerTask {
        private AttemptTimer() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (ConnectionAttemptMonitor.this) {
                ConnectionAttemptMonitor.this.timeToConnect.set(true);
                ConnectionAttemptMonitor connectionAttemptMonitor = ConnectionAttemptMonitor.this;
                connectionAttemptMonitor.setTimer(connectionAttemptMonitor.getNextAttemptTime());
            }
        }
    }

    ConnectionAttemptMonitor(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("Connection attempts must be greater than zero");
        }
        this.initialConnAttempts = i2 + 1;
        this.timeToConnect = new AtomicBoolean(true);
        this.nextAttemptTime = 0L;
        setTimer(getNextAttemptTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date getNextAttemptTime() {
        Date date = new Date(TimeLineProvider.getSystemTime() + this.nextAttemptTime);
        long j2 = this.initialConnAttempts - 1;
        this.initialConnAttempts = j2;
        if (j2 > 0) {
            this.nextAttemptTime = 60000L;
            return date;
        }
        if (j2 == 0) {
            this.nextAttemptTime = 0L;
        } else {
            long j3 = this.nextAttemptTime;
            if (j3 == THIRTY_TWO_MINUTE) {
                this.nextAttemptTime = FIFTY_SEVEN_MINUTE;
                return date;
            }
            if (j3 != FIFTY_SEVEN_MINUTE && j3 > 0) {
                this.nextAttemptTime = j3 * 2;
                return date;
            }
        }
        return null;
    }

    synchronized void cancelTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer.purge();
            this.timer = null;
        }
    }

    boolean isTimeToConnect() {
        return this.timeToConnect.getAndSet(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r6.nextAttemptTime >= com.dynatrace.android.agent.ConnectionAttemptMonitor.FIFTY_SEVEN_MINUTE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized boolean moreAttemptsAllowed() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.timeToConnect     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            if (r0 == 0) goto Lc
            monitor-exit(r6)
            return r5
        Lc:
            boolean r0 = r6.lastConnected     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L28
            java.util.Timer r0 = r6.timer     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L28
            long r3 = r6.initialConnAttempts     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            long r3 = r6.nextAttemptTime     // Catch: java.lang.Throwable -> L2a
            r1 = 3420000(0x342f60, double:1.6897045E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L28
        L25:
            monitor-exit(r6)
            r0 = 0
            return r0
        L28:
            monitor-exit(r6)
            return r5
        L2a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.ConnectionAttemptMonitor.moreAttemptsAllowed():boolean");
    }

    public synchronized void notifyConnectionState(boolean z2, boolean z3) {
        this.lastConnected = z2;
        this.timeToConnect.set(false);
        if (z2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Connection ok notification");
            }
            this.onceConnected = true;
            this.initialConnAttempts = -1L;
            this.nextAttemptTime = 0L;
            cancelTimer();
        } else {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "No connection notification");
            }
            if (this.onceConnected && this.timer == null && this.nextAttemptTime == 0) {
                this.nextAttemptTime = 60000L;
                setTimer(getNextAttemptTime());
            } else if (z3 && this.timer == null) {
                setTimer(getNextAttemptTime());
            }
        }
    }

    public synchronized void notifyStateTooManyRequests(int i2) {
        this.lastConnected = false;
        this.timeToConnect.set(false);
        if (this.onceConnected && this.timer == null && this.nextAttemptTime == 0) {
            this.nextAttemptTime = 60000L;
        }
        if (this.timer != null || getNextAttemptTime() != null) {
            setTimer(new Date(TimeLineProvider.getSystemTime() + ((long) (i2 * 1000))));
        }
    }

    boolean reconnAttemptInProgress() {
        return this.onceConnected && !this.lastConnected && this.nextAttemptTime > 0;
    }

    protected synchronized void restartTimer() {
        setTimer(this.currentWhen);
    }

    synchronized void setTimer(Date date) {
        cancelTimer();
        this.currentWhen = date;
        if (date != null) {
            String str = TAG;
            Timer timer = new Timer(str);
            this.timer = timer;
            try {
                timer.schedule(new AttemptTimer(), this.currentWhen);
                if (Global.DEBUG) {
                    Utility.zlogD(str, "Connection attempt is scheduled for " + this.currentWhen);
                }
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Failed to schedule a connection attempt ... " + e2.toString());
                }
            }
        }
    }

    public synchronized void stop() {
        this.lastConnected = false;
        this.timeToConnect.set(false);
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Connection stop notification");
        }
        cancelTimer();
    }
}
