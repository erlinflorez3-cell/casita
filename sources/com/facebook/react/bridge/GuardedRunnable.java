package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GuardedRunnable implements Runnable {
    private final JSExceptionHandler mExceptionHandler;

    public GuardedRunnable(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }

    public GuardedRunnable(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e2) {
            this.mExceptionHandler.handleException(e2);
        }
    }

    public abstract void runGuarded();
}
