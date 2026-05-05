package com.hbisoft.hbrecorder;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Countdown extends Timer {
    private long delay;
    private long interval;
    private boolean restart;
    private long startTime;
    private TimerTask task;
    private long totalTime;
    private boolean wasCancelled;
    private boolean wasStarted;

    public Countdown(long j2, long j3) {
        this(j2, j3, 0L);
    }

    public Countdown(long j2, long j3, long j4) {
        super("PreciseCountdown", true);
        this.startTime = -1L;
        this.restart = false;
        this.wasCancelled = false;
        this.wasStarted = false;
        this.delay = j4;
        this.interval = j3;
        this.totalTime = j2;
        this.task = getTask(j2);
    }

    private TimerTask getTask(final long j2) {
        return new TimerTask() { // from class: com.hbisoft.hbrecorder.Countdown.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                long jScheduledExecutionTime;
                if (Countdown.this.startTime < 0 || Countdown.this.restart) {
                    Countdown.this.startTime = scheduledExecutionTime();
                    jScheduledExecutionTime = j2;
                    Countdown.this.restart = false;
                } else {
                    jScheduledExecutionTime = j2 - (scheduledExecutionTime() - Countdown.this.startTime);
                    if (jScheduledExecutionTime <= 0) {
                        cancel();
                        Countdown.this.startTime = -1L;
                        Countdown.this.onFinished();
                        return;
                    }
                }
                Countdown.this.onTick(jScheduledExecutionTime);
            }
        };
    }

    public void dispose() {
        cancel();
        purge();
    }

    public abstract void onFinished();

    public abstract void onStopCalled();

    public abstract void onTick(long j2);

    public void start() {
        this.wasStarted = true;
        schedule(this.task, this.delay, this.interval);
    }

    public void stop() {
        onStopCalled();
        this.wasCancelled = true;
        this.task.cancel();
        dispose();
    }
}
