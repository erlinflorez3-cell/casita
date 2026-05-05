package com.facebook.datasource;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDataSource<T> implements DataSource<T> {

    @Nullable
    private static volatile DataSourceInstrumenter sDataSourceInstrumenter = null;

    @Nullable
    private Map<String, Object> mExtras;

    @Nullable
    private T mResult = null;

    @Nullable
    private Throwable mFailureThrowable = null;
    private float mProgress = 0.0f;
    private boolean mIsClosed = false;
    private DataSourceStatus mDataSourceStatus = DataSourceStatus.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue<>();

    public interface DataSourceInstrumenter {
        Runnable decorateRunnable(Runnable runnable, String str);
    }

    private enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected AbstractDataSource() {
    }

    @Nullable
    public static DataSourceInstrumenter getDataSourceInstrumenter() {
        return sDataSourceInstrumenter;
    }

    private void notifyDataSubscribers() {
        boolean zHasFailed = hasFailed();
        boolean zWasCancelled = wasCancelled();
        for (Pair<DataSubscriber<T>, Executor> pair : this.mSubscribers) {
            notifyDataSubscriber((DataSubscriber) pair.first, (Executor) pair.second, zHasFailed, zWasCancelled);
        }
    }

    public static void provideInstrumenter(@Nullable DataSourceInstrumenter dataSourceInstrumenter) {
        sDataSourceInstrumenter = dataSourceInstrumenter;
    }

    private synchronized boolean setFailureInternal(@Nullable Throwable th, @Nullable Map<String, Object> map) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            this.mDataSourceStatus = DataSourceStatus.FAILURE;
            this.mFailureThrowable = th;
            this.mExtras = map;
            return true;
        }
        return false;
    }

    private synchronized boolean setProgressInternal(float f2) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            if (f2 < this.mProgress) {
                return false;
            }
            this.mProgress = f2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
    
        closeResult(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setResultInternal(@javax.annotation.Nullable T r4, boolean r5) {
        /*
            r3 = this;
            r2 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L39
            boolean r0 = r3.mIsClosed     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2b
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = r3.mDataSourceStatus     // Catch: java.lang.Throwable -> L36
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L36
            if (r1 == r0) goto Ld
            goto L2b
        Ld:
            if (r5 == 0) goto L17
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.SUCCESS     // Catch: java.lang.Throwable -> L36
            r3.mDataSourceStatus = r0     // Catch: java.lang.Throwable -> L36
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mProgress = r0     // Catch: java.lang.Throwable -> L36
        L17:
            T r1 = r3.mResult     // Catch: java.lang.Throwable -> L36
            if (r1 == r4) goto L22
            r3.mResult = r4     // Catch: java.lang.Throwable -> L1f
            r4 = r1
            goto L23
        L1f:
            r0 = move-exception
            r2 = r1
            goto L37
        L22:
            r4 = r2
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L29
            r3.closeResult(r4)
        L29:
            r0 = 1
            return r0
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L31
            r3.closeResult(r4)
        L31:
            r0 = 0
            return r0
        L33:
            r0 = move-exception
            r2 = r4
            goto L37
        L36:
            r0 = move-exception
        L37:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            if (r2 == 0) goto L3f
            r3.closeResult(r2)
        L3f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.setResultInternal(java.lang.Object, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean wasCancelled() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isClosed()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lc
            boolean r0 = r1.isFinished()     // Catch: java.lang.Throwable -> L13
            goto Le
        Lc:
            r0 = 0
            goto L11
        Le:
            if (r0 != 0) goto Lc
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.wasCancelled():boolean");
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            if (this.mIsClosed) {
                return false;
            }
            this.mIsClosed = true;
            T t2 = this.mResult;
            this.mResult = null;
            if (t2 != null) {
                closeResult(t2);
            }
            if (!isFinished()) {
                notifyDataSubscribers();
            }
            synchronized (this) {
                this.mSubscribers.clear();
            }
            return true;
        }
    }

    protected void closeResult(@Nullable T t2) {
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized Throwable getFailureCause() {
        return this.mFailureThrowable;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized float getProgress() {
        return this.mProgress;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized T getResult() {
        return this.mResult;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasFailed() {
        return this.mDataSourceStatus == DataSourceStatus.FAILURE;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean hasMultipleResults() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
        return this.mResult != null;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isFinished() {
        return this.mDataSourceStatus != DataSourceStatus.IN_PROGRESS;
    }

    protected void notifyDataSubscriber(final DataSubscriber<T> dataSubscriber, Executor executor, final boolean z2, final boolean z3) {
        Runnable runnableDecorateRunnable = new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.1
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    dataSubscriber.onFailure(AbstractDataSource.this);
                } else if (z3) {
                    dataSubscriber.onCancellation(AbstractDataSource.this);
                } else {
                    dataSubscriber.onNewResult(AbstractDataSource.this);
                }
            }
        };
        DataSourceInstrumenter dataSourceInstrumenter = getDataSourceInstrumenter();
        if (dataSourceInstrumenter != null) {
            runnableDecorateRunnable = dataSourceInstrumenter.decorateRunnable(runnableDecorateRunnable, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnableDecorateRunnable);
    }

    protected void notifyProgressUpdate() {
        for (Pair<DataSubscriber<T>, Executor> pair : this.mSubscribers) {
            final DataSubscriber dataSubscriber = (DataSubscriber) pair.first;
            ((Executor) pair.second).execute(new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.2
                @Override // java.lang.Runnable
                public void run() {
                    dataSubscriber.onProgressUpdate(AbstractDataSource.this);
                }
            });
        }
    }

    protected void setExtras(@Nullable Map<String, Object> map) {
        this.mExtras = map;
    }

    protected boolean setFailure(Throwable th) {
        return setFailure(th, null);
    }

    protected boolean setFailure(@Nullable Throwable th, @Nullable Map<String, Object> map) {
        boolean failureInternal = setFailureInternal(th, map);
        if (failureInternal) {
            notifyDataSubscribers();
        }
        return failureInternal;
    }

    protected boolean setProgress(float f2) {
        boolean progressInternal = setProgressInternal(f2);
        if (progressInternal) {
            notifyProgressUpdate();
        }
        return progressInternal;
    }

    public boolean setResult(@Nullable T t2, boolean z2) {
        return setResult(t2, z2, null);
    }

    protected boolean setResult(@Nullable T t2, boolean z2, @Nullable Map<String, Object> map) {
        setExtras(map);
        boolean resultInternal = setResultInternal(t2, z2);
        if (resultInternal) {
            notifyDataSubscribers();
        }
        return resultInternal;
    }

    @Override // com.facebook.datasource.DataSource
    public void subscribe(DataSubscriber<T> dataSubscriber, Executor executor) {
        Preconditions.checkNotNull(dataSubscriber);
        Preconditions.checkNotNull(executor);
        synchronized (this) {
            if (this.mIsClosed) {
                return;
            }
            if (this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                this.mSubscribers.add(Pair.create(dataSubscriber, executor));
            }
            boolean z2 = hasResult() || isFinished() || wasCancelled();
            if (z2) {
                notifyDataSubscriber(dataSubscriber, executor, hasFailed(), wasCancelled());
            }
        }
    }
}
