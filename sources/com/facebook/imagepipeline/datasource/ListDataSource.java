package com.facebook.imagepipeline.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ListDataSource<T> extends AbstractDataSource<List<CloseableReference<T>>> {
    private final DataSource<CloseableReference<T>>[] mDataSources;
    private int mFinishedDataSources = 0;

    private class InternalDataSubscriber implements DataSubscriber<CloseableReference<T>> {
        boolean mFinished;

        private InternalDataSubscriber() {
            this.mFinished = false;
        }

        private synchronized boolean tryFinish() {
            if (this.mFinished) {
                return false;
            }
            this.mFinished = true;
            return true;
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onCancellation(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceCancelled();
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onFailure(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceFailed(dataSource);
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onNewResult(DataSource<CloseableReference<T>> dataSource) {
            if (dataSource.isFinished() && tryFinish()) {
                ListDataSource.this.onDataSourceFinished();
            }
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onProgressUpdate(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceProgress();
        }
    }

    protected ListDataSource(DataSource<CloseableReference<T>>[] dataSourceArr) {
        this.mDataSources = dataSourceArr;
    }

    public static <T> ListDataSource<T> create(DataSource<CloseableReference<T>>... dataSourceArr) {
        Preconditions.checkNotNull(dataSourceArr);
        Preconditions.checkState(dataSourceArr.length > 0);
        ListDataSource<T> listDataSource = new ListDataSource<>(dataSourceArr);
        for (DataSource<CloseableReference<T>> dataSource : dataSourceArr) {
            if (dataSource != null) {
                Objects.requireNonNull(listDataSource);
                dataSource.subscribe(new InternalDataSubscriber(), CallerThreadExecutor.getInstance());
            }
        }
        return listDataSource;
    }

    private synchronized boolean increaseAndCheckIfLast() {
        int i2;
        i2 = this.mFinishedDataSources + 1;
        this.mFinishedDataSources = i2;
        return i2 == this.mDataSources.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceCancelled() {
        setFailure(new CancellationException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceFailed(DataSource<CloseableReference<T>> dataSource) {
        Throwable failureCause = dataSource.getFailureCause();
        if (failureCause == null) {
            failureCause = new Throwable("Unknown failure cause");
        }
        setFailure(failureCause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceFinished() {
        if (increaseAndCheckIfLast()) {
            setResult(null, true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceProgress() {
        float progress = 0.0f;
        for (DataSource<CloseableReference<T>> dataSource : this.mDataSources) {
            progress += dataSource.getProgress();
        }
        setProgress(progress / this.mDataSources.length);
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        for (DataSource<CloseableReference<T>> dataSource : this.mDataSources) {
            dataSource.close();
        }
        return true;
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    @Nullable
    public synchronized List<CloseableReference<T>> getResult() {
        if (!hasResult()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.mDataSources.length);
        for (DataSource<CloseableReference<T>> dataSource : this.mDataSources) {
            arrayList.add(dataSource.getResult());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean hasResult() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Ld
            int r1 = r2.mFinishedDataSources     // Catch: java.lang.Throwable -> L14
            com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>>[] r0 = r2.mDataSources     // Catch: java.lang.Throwable -> L14
            int r0 = r0.length     // Catch: java.lang.Throwable -> L14
            goto Lf
        Ld:
            r0 = 0
            goto L12
        Lf:
            if (r1 != r0) goto Ld
            r0 = 1
        L12:
            monitor-exit(r2)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.datasource.ListDataSource.hasResult():boolean");
    }
}
