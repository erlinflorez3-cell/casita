package com.facebook.react.jstasks;

import android.util.SparseArray;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class HeadlessJsTaskContext {
    private static final WeakHashMap<ReactContext, HeadlessJsTaskContext> INSTANCES = new WeakHashMap<>();
    private final WeakReference<ReactContext> mReactContext;
    private final Set<HeadlessJsTaskEventListener> mHeadlessJsTaskEventListeners = new CopyOnWriteArraySet();
    private final AtomicInteger mLastTaskId = new AtomicInteger(0);
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();
    private final Map<Integer, HeadlessJsTaskConfig> mActiveTaskConfigs = new ConcurrentHashMap();
    private final SparseArray<Runnable> mTaskTimeouts = new SparseArray<>();

    /* JADX INFO: renamed from: com.facebook.react.jstasks.HeadlessJsTaskContext$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ HeadlessJsTaskConfig val$taskConfig;
        final /* synthetic */ int val$taskId;

        AnonymousClass1(HeadlessJsTaskConfig headlessJsTaskConfig, int i2) {
            headlessJsTaskConfig = headlessJsTaskConfig;
            i = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HeadlessJsTaskContext.this.startTask(headlessJsTaskConfig, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.jstasks.HeadlessJsTaskContext$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ int val$taskId;

        AnonymousClass2(int i2) {
            i = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = HeadlessJsTaskContext.this.mHeadlessJsTaskEventListeners.iterator();
            while (it.hasNext()) {
                ((HeadlessJsTaskEventListener) it.next()).onHeadlessJsTaskFinish(i);
            }
        }
    }

    private HeadlessJsTaskContext(ReactContext reactContext) {
        this.mReactContext = new WeakReference<>(reactContext);
    }

    public static HeadlessJsTaskContext getInstance(ReactContext reactContext) {
        WeakHashMap<ReactContext, HeadlessJsTaskContext> weakHashMap = INSTANCES;
        HeadlessJsTaskContext headlessJsTaskContext = weakHashMap.get(reactContext);
        if (headlessJsTaskContext != null) {
            return headlessJsTaskContext;
        }
        HeadlessJsTaskContext headlessJsTaskContext2 = new HeadlessJsTaskContext(reactContext);
        weakHashMap.put(reactContext, headlessJsTaskContext2);
        return headlessJsTaskContext2;
    }

    private void removeTimeout(int i2) {
        Runnable runnable = this.mTaskTimeouts.get(i2);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.mTaskTimeouts.remove(i2);
        }
    }

    private void scheduleTaskTimeout(final int i2, long j2) throws Throwable {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.jstasks.HeadlessJsTaskContext$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleTaskTimeout$0(i2);
            }
        };
        this.mTaskTimeouts.append(i2, runnable);
        UiThreadUtil.runOnUiThread(runnable, j2);
    }

    public synchronized void startTask(HeadlessJsTaskConfig headlessJsTaskConfig, int i2) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) Assertions.assertNotNull(this.mReactContext.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !headlessJsTaskConfig.isAllowedInForeground()) {
            throw new IllegalStateException("Tried to start task " + headlessJsTaskConfig.getTaskKey() + " while in foreground, but this is not allowed.");
        }
        this.mActiveTasks.add(Integer.valueOf(i2));
        this.mActiveTaskConfigs.put(Integer.valueOf(i2), new HeadlessJsTaskConfig(headlessJsTaskConfig));
        if (reactContext.hasActiveReactInstance()) {
            ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i2, headlessJsTaskConfig.getTaskKey(), headlessJsTaskConfig.getData());
        } else {
            ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (headlessJsTaskConfig.getTimeout() > 0) {
            scheduleTaskTimeout(i2, headlessJsTaskConfig.getTimeout());
        }
        Iterator<HeadlessJsTaskEventListener> it = this.mHeadlessJsTaskEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onHeadlessJsTaskStart(i2);
        }
    }

    public synchronized void addTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.add(headlessJsTaskEventListener);
        Iterator<Integer> it = this.mActiveTasks.iterator();
        while (it.hasNext()) {
            headlessJsTaskEventListener.onHeadlessJsTaskStart(it.next().intValue());
        }
    }

    /* JADX INFO: renamed from: finishTask */
    public synchronized void lambda$scheduleTaskTimeout$0(int i2) {
        boolean zRemove = this.mActiveTasks.remove(Integer.valueOf(i2));
        this.mActiveTaskConfigs.remove(Integer.valueOf(i2));
        removeTimeout(i2);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.HeadlessJsTaskContext.2
                final /* synthetic */ int val$taskId;

                AnonymousClass2(int i22) {
                    i = i22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = HeadlessJsTaskContext.this.mHeadlessJsTaskEventListeners.iterator();
                    while (it.hasNext()) {
                        ((HeadlessJsTaskEventListener) it.next()).onHeadlessJsTaskFinish(i);
                    }
                }
            });
        }
    }

    public boolean hasActiveTasks() {
        return this.mActiveTasks.size() > 0;
    }

    public synchronized boolean isTaskRunning(int i2) {
        return this.mActiveTasks.contains(Integer.valueOf(i2));
    }

    public void removeTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.remove(headlessJsTaskEventListener);
    }

    public synchronized boolean retryTask(int i2) {
        HeadlessJsTaskConfig headlessJsTaskConfig = this.mActiveTaskConfigs.get(Integer.valueOf(i2));
        Assertions.assertCondition(headlessJsTaskConfig != null, "Tried to retrieve non-existent task config with id " + i2 + ".");
        HeadlessJsTaskRetryPolicy retryPolicy = headlessJsTaskConfig.getRetryPolicy();
        if (!retryPolicy.canRetry()) {
            return false;
        }
        removeTimeout(i2);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.HeadlessJsTaskContext.1
            final /* synthetic */ HeadlessJsTaskConfig val$taskConfig;
            final /* synthetic */ int val$taskId;

            AnonymousClass1(HeadlessJsTaskConfig headlessJsTaskConfig2, int i22) {
                headlessJsTaskConfig = headlessJsTaskConfig2;
                i = i22;
            }

            @Override // java.lang.Runnable
            public void run() {
                HeadlessJsTaskContext.this.startTask(headlessJsTaskConfig, i);
            }
        }, retryPolicy.getDelay());
        return true;
    }

    public synchronized int startTask(HeadlessJsTaskConfig headlessJsTaskConfig) {
        int iIncrementAndGet;
        iIncrementAndGet = this.mLastTaskId.incrementAndGet();
        startTask(headlessJsTaskConfig, iIncrementAndGet);
        return iIncrementAndGet;
    }
}
