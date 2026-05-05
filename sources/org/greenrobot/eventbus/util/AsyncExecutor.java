package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncExecutor {
    private final EventBus eventBus;
    private final Constructor<?> failureEventConstructor;
    private final Object scope;
    private final Executor threadPool;

    public static class Builder {
        private EventBus eventBus;
        private Class<?> failureEventType;
        private Executor threadPool;

        private Builder() {
        }

        public AsyncExecutor build() {
            return buildForScope(null);
        }

        public AsyncExecutor buildForScope(Object obj) {
            if (this.eventBus == null) {
                this.eventBus = EventBus.getDefault();
            }
            if (this.threadPool == null) {
                this.threadPool = Executors.newCachedThreadPool();
            }
            if (this.failureEventType == null) {
                this.failureEventType = ThrowableFailureEvent.class;
            }
            return new AsyncExecutor(this.threadPool, this.eventBus, this.failureEventType, obj);
        }

        public Builder eventBus(EventBus eventBus) {
            this.eventBus = eventBus;
            return this;
        }

        public Builder failureEventType(Class<?> cls) {
            this.failureEventType = cls;
            return this;
        }

        public Builder threadPool(Executor executor) {
            this.threadPool = executor;
            return this;
        }
    }

    public interface RunnableEx {
        void run() throws Exception;
    }

    private AsyncExecutor(Executor executor, EventBus eventBus, Class<?> cls, Object obj) {
        this.threadPool = executor;
        this.eventBus = eventBus;
        this.scope = obj;
        try {
            this.failureEventConstructor = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e2);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncExecutor create() {
        return new Builder().build();
    }

    public void execute(final RunnableEx runnableEx) {
        this.threadPool.execute(new Runnable() { // from class: org.greenrobot.eventbus.util.AsyncExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m10824lambda$execute$0$orggreenroboteventbusutilAsyncExecutor(runnableEx);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$execute$0$org-greenrobot-eventbus-util-AsyncExecutor, reason: not valid java name */
    /* synthetic */ void m10824lambda$execute$0$orggreenroboteventbusutilAsyncExecutor(RunnableEx runnableEx) {
        try {
            runnableEx.run();
        } catch (Exception e2) {
            try {
                Object objNewInstance = this.failureEventConstructor.newInstance(e2);
                if (objNewInstance instanceof HasExecutionScope) {
                    ((HasExecutionScope) objNewInstance).setExecutionScope(this.scope);
                }
                this.eventBus.post(objNewInstance);
            } catch (Exception e3) {
                this.eventBus.getLogger().log(Level.SEVERE, "Original exception:", e2);
                throw new RuntimeException("Could not create failure event", e3);
            }
        }
    }
}
