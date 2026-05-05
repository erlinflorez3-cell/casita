package com.google.common.util.concurrent;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {
    private static final Logger logger = Logger.getLogger(ListenerCallQueue.class.getName());
    private final List<PerListenerQueue<L>> listeners = Collections.synchronizedList(new ArrayList());

    interface Event<L> {
        void call(L listener);
    }

    private static final class PerListenerQueue<L> implements Runnable {
        final Executor executor;
        boolean isThreadScheduled;
        final L listener;
        final Queue<Event<L>> waitQueue = Queues.newArrayDeque();
        final Queue<Object> labelQueue = Queues.newArrayDeque();

        PerListenerQueue(L l2, Executor executor) {
            this.listener = (L) Preconditions.checkNotNull(l2);
            this.executor = (Executor) Preconditions.checkNotNull(executor);
        }

        synchronized void add(Event<L> event, Object label) {
            this.waitQueue.add(event);
            this.labelQueue.add(label);
        }

        void dispatch() {
            boolean z2;
            synchronized (this) {
                if (this.isThreadScheduled) {
                    z2 = false;
                } else {
                    z2 = true;
                    this.isThreadScheduled = true;
                }
            }
            if (z2) {
                try {
                    this.executor.execute(this);
                } catch (RuntimeException e2) {
                    synchronized (this) {
                        this.isThreadScheduled = false;
                        ListenerCallQueue.logger.log(Level.SEVERE, "Exception while running callbacks for " + this.listener + " on " + this.executor, (Throwable) e2);
                        throw e2;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            com.google.common.util.concurrent.ListenerCallQueue.logger.log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r8.listener + com.dynatrace.android.agent.Global.BLANK + r6, (java.lang.Throwable) r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            r1.call(r8.listener);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r8 = this;
            L0:
                r5 = 0
                r7 = 1
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L57
                boolean r0 = r8.isThreadScheduled     // Catch: java.lang.Throwable -> L51
                com.google.common.base.Preconditions.checkState(r0)     // Catch: java.lang.Throwable -> L51
                java.util.Queue<com.google.common.util.concurrent.ListenerCallQueue$Event<L>> r0 = r8.waitQueue     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L51
                com.google.common.util.concurrent.ListenerCallQueue$Event r1 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r1     // Catch: java.lang.Throwable -> L51
                java.util.Queue<java.lang.Object> r0 = r8.labelQueue     // Catch: java.lang.Throwable -> L51
                java.lang.Object r6 = r0.poll()     // Catch: java.lang.Throwable -> L51
                if (r1 != 0) goto L1b
                r8.isThreadScheduled = r5     // Catch: java.lang.Throwable -> L51
                goto L4c
            L1b:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L51
                L r0 = r8.listener     // Catch: java.lang.RuntimeException -> L22 java.lang.Throwable -> L57
                r1.call(r0)     // Catch: java.lang.RuntimeException -> L22 java.lang.Throwable -> L57
                goto L0
            L22:
                r4 = move-exception
                java.util.logging.Logger r3 = com.google.common.util.concurrent.ListenerCallQueue.access$000()     // Catch: java.lang.Throwable -> L57
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L57
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
                r1.<init>()     // Catch: java.lang.Throwable -> L57
                java.lang.String r0 = "Exception while executing callback: "
                java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L57
                L r0 = r8.listener     // Catch: java.lang.Throwable -> L57
                java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L57
                java.lang.String r0 = " "
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L57
                java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Throwable -> L57
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
                r3.log(r2, r0, r4)     // Catch: java.lang.Throwable -> L57
                goto L0
            L4c:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
                return
            L4e:
                r0 = move-exception
                r7 = r5
                goto L52
            L51:
                r0 = move-exception
            L52:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
                goto L56
            L54:
                r0 = move-exception
                goto L52
            L56:
                throw r0     // Catch: java.lang.Throwable -> L59
            L57:
                r0 = move-exception
                goto L5a
            L59:
                r0 = move-exception
            L5a:
                if (r7 == 0) goto L64
                monitor-enter(r8)
                r8.isThreadScheduled = r5     // Catch: java.lang.Throwable -> L61
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
                goto L64
            L61:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
                throw r0
            L64:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue.run():void");
        }
    }

    ListenerCallQueue() {
    }

    private void enqueueHelper(Event<L> event, Object label) {
        Preconditions.checkNotNull(event, NotificationCompat.CATEGORY_EVENT);
        Preconditions.checkNotNull(label, Constants.ScionAnalytics.PARAM_LABEL);
        synchronized (this.listeners) {
            Iterator<PerListenerQueue<L>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().add(event, label);
            }
        }
    }

    public void addListener(L listener, Executor executor) {
        Preconditions.checkNotNull(listener, "listener");
        Preconditions.checkNotNull(executor, "executor");
        this.listeners.add(new PerListenerQueue<>(listener, executor));
    }

    public void dispatch() {
        for (int i2 = 0; i2 < this.listeners.size(); i2++) {
            this.listeners.get(i2).dispatch();
        }
    }

    public void enqueue(Event<L> event) {
        enqueueHelper(event, event);
    }

    public void enqueue(Event<L> event, String label) {
        enqueueHelper(event, label);
    }
}
