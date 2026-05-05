package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class WithinAppServiceConnection implements ServiceConnection {
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    static class BindRequest {
        final Intent intent;
        private final TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();

        BindRequest(Intent intent) {
            this.intent = intent;
        }

        void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7773x9cf97a38();
                }
            }, 20L, TimeUnit.SECONDS);
            getTask().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }

        Task<Void> getTask() {
            return this.taskCompletionSource.getTask();
        }

        /* JADX INFO: renamed from: lambda$arrangeTimeout$0$com-google-firebase-messaging-WithinAppServiceConnection$BindRequest, reason: not valid java name */
        /* synthetic */ void m7773x9cf97a38() {
            String str = "Service took too long to process intent: " + this.intent.getAction() + " finishing.";
            finish();
        }
    }

    WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) throws Throwable {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (C1607wl.Xd() ^ 22437), (short) (C1607wl.Xd() ^ 12856))).getMethod(C1561oA.ud("<9G\u0013A@;70-?386\n538(:5", (short) (OY.Xd() ^ 15276)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.context = context2;
            Intent intent = new Intent(str);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.yd("MYR__XV\u001fWbdi]en'\u001fJLQEWV", (short) (OY.Xd() ^ 21593))).getMethod(C1561oA.Yd("\u001a\u0019)\u0006\u0018\u001b$\u001b\"!\u000b\u001f,%", (short) (C1633zX.Xd() ^ (-13113))), new Class[0]);
            try {
                method2.setAccessible(true);
                this.connectionIntent = intent.setPackage((String) method2.invoke(context2, objArr2));
                this.scheduledExecutorService = scheduledExecutorService;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    private synchronized void flushQueue() {
        if (Log.isLoggable(Constants.TAG, 3)) {
        }
        while (!this.intentQueue.isEmpty()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
            }
            WithinAppServiceBinder withinAppServiceBinder = this.binder;
            if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                startConnectionIfNeeded();
                return;
            } else {
                if (Log.isLoggable(Constants.TAG, 3)) {
                }
                this.binder.send(this.intentQueue.poll());
            }
        }
    }

    private void startConnectionIfNeeded() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String str = "binder is dead. start connection? " + (!this.connectionInProgress);
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
            return;
        }
        this.connectionInProgress = false;
        finishAllInQueue();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String str = "onServiceConnected: " + componentName;
        }
        this.connectionInProgress = false;
        if (iBinder instanceof WithinAppServiceBinder) {
            this.binder = (WithinAppServiceBinder) iBinder;
            flushQueue();
        } else {
            String str2 = "Invalid service connection: " + iBinder;
            finishAllInQueue();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String str = "onServiceDisconnected: " + componentName;
        }
        flushQueue();
    }

    synchronized Task<Void> sendIntent(Intent intent) {
        BindRequest bindRequest;
        if (Log.isLoggable(Constants.TAG, 3)) {
        }
        bindRequest = new BindRequest(intent);
        bindRequest.arrangeTimeout(this.scheduledExecutorService);
        this.intentQueue.add(bindRequest);
        flushQueue();
        return bindRequest.getTask();
    }
}
