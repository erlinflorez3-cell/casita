package androidx.loader.content;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.core.os.OperationCanceledException;
import com.dynatrace.android.agent.Global;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.Od;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile AsyncTaskLoader<D>.LoadTask mTask;
    private long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(D d2) {
    }

    final class LoadTask extends ModernAsyncTask<D> implements Runnable {
        boolean waiting;

        LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected D doInBackground() {
            try {
                return (D) AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e2) {
                if (isCancelled()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onPostExecute(D d2) throws Throwable {
            AsyncTaskLoader.this.dispatchOnLoadComplete(this, d2);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onCancelled(D d2) throws Throwable {
            AsyncTaskLoader.this.dispatchOnCancelled(this, d2);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            this.waiting = false;
            AsyncTaskLoader.this.executePendingTask();
        }
    }

    public AsyncTaskLoader(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void setUpdateThrottle(long j2) {
        this.mUpdateThrottle = j2;
        if (j2 != 0) {
            this.mHandler = new Handler();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onForceLoad() throws Throwable {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new LoadTask();
        executePendingTask();
    }

    @Override // androidx.loader.content.Loader
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zCancel = this.mTask.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    void executePendingTask() throws Throwable {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.waiting = true;
            Handler handler = this.mHandler;
            AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
            long j2 = this.mLastLoadCompleteTime + this.mUpdateThrottle;
            Class<?> cls = Class.forName(C1593ug.zd(">LCRPKG\u0012TY\u00150JXOXR`", (short) (C1499aX.Xd() ^ (-24979)), (short) (C1499aX.Xd() ^ (-27692))));
            Class<?>[] clsArr = {Class.forName(C1561oA.od("WMaK\u0017THTL\u00125WON@@IA", (short) (Od.Xd() ^ (-8990)))), Long.TYPE};
            Object[] objArr = {loadTask, Long.valueOf(j2)};
            Method method = cls.getMethod(C1561oA.Kd("QQVX&Z;QVO", (short) (C1633zX.Xd() ^ (-19564))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        this.mTask.executeOnExecutor(this.mExecutor);
    }

    void dispatchOnCancelled(AsyncTaskLoader<D>.LoadTask loadTask, D d2) throws Throwable {
        onCanceled(d2);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(AsyncTaskLoader<D>.LoadTask loadTask, D d2) throws Throwable {
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d2);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d2);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d2);
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    protected Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            printWriter.print(this.mLastLoadCompleteTime == -10000 ? "--" : Global.HYPHEN + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime)));
            printWriter.println();
        }
    }
}
