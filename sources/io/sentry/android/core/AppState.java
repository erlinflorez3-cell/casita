package io.sentry.android.core;

/* JADX INFO: loaded from: classes6.dex */
public final class AppState {
    private static AppState instance = new AppState();
    private Boolean inBackground = null;

    private AppState() {
    }

    public static AppState getInstance() {
        return instance;
    }

    public Boolean isInBackground() {
        return this.inBackground;
    }

    void resetInstance() {
        instance = new AppState();
    }

    synchronized void setInBackground(boolean z2) {
        this.inBackground = Boolean.valueOf(z2);
    }
}
