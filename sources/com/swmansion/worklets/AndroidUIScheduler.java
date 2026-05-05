package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class AndroidUIScheduler {
    private final ReactApplicationContext mContext;
    private final AtomicBoolean mActive = new AtomicBoolean(true);
    private final Runnable mUIThreadRunnable = new Runnable() { // from class: com.swmansion.worklets.AndroidUIScheduler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.lambda$new$0();
        }
    };
    private final HybridData mHybridData = initHybrid();

    /* JADX INFO: renamed from: com.swmansion.worklets.AndroidUIScheduler$1 */
    class AnonymousClass1 extends GuardedRunnable {
        AnonymousClass1(JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            AndroidUIScheduler.this.mUIThreadRunnable.run();
        }
    }

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private native HybridData initHybrid();

    public /* synthetic */ void lambda$new$0() {
        synchronized (this.mActive) {
            if (this.mActive.get()) {
                triggerUI();
            }
        }
    }

    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mContext.getExceptionHandler()) { // from class: com.swmansion.worklets.AndroidUIScheduler.1
            AnonymousClass1(JSExceptionHandler jSExceptionHandler) {
                super(jSExceptionHandler);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                AndroidUIScheduler.this.mUIThreadRunnable.run();
            }
        });
    }

    public void deactivate() {
        synchronized (this.mActive) {
            this.mActive.set(false);
            invalidate();
        }
    }

    public native void invalidate();

    public native void triggerUI();
}
