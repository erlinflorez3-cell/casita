package com.dynatrace.android.app;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class LcContext {
    private static volatile LcContext theInstance = null;
    private LcCallbacks lifecycleCB = new LcCallbacks();

    private LcContext() {
    }

    public static LcContext getInstance() {
        if (theInstance == null) {
            synchronized (LcContext.class) {
                if (theInstance == null) {
                    theInstance = new LcContext();
                }
            }
        }
        return theInstance;
    }

    public LcCallbacks getActivityLcCallbacks() {
        return this.lifecycleCB;
    }

    public boolean isLifecycleInEffect() {
        return false;
    }
}
