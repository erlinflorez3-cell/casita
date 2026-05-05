package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    CompatJobEngine mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<CompatWorkItem> mCompatQueue = null;

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    protected abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        abstract void enqueueWork(Intent intent);

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }

        WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        void ensureJobId(int i2) {
            if (this.mHasJobId) {
                if (this.mJobId == i2) {
                } else {
                    throw new IllegalArgumentException("Given job ID " + i2 + " is different than previous " + this.mJobId);
                }
            } else {
                this.mHasJobId = true;
                this.mJobId = i2;
            }
        }
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context, ComponentName componentName) throws Throwable {
            super(componentName);
            Class<?> cls = Class.forName(C1561oA.Qd("*6+84-'o$/-2\"*/g{'%*\u001a,'", (short) (C1633zX.Xd() ^ (-18492))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 23723);
            short sXd2 = (short) (FB.Xd() ^ 7734);
            int[] iArr = new int["PO_-]^[YTSg]dd:ggn`tq".length()];
            QB qb = new QB("PO_-]^[YTSg]dd:ggn`tq");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
                short sXd3 = (short) (C1607wl.Xd() ^ 12381);
                int[] iArr2 = new int["SQXEQ".length()];
                QB qb2 = new QB("SQXEQ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Object[] objArr2 = {new String(iArr2, 0, i3)};
                Method method2 = Class.forName(C1561oA.Kd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (C1607wl.Xd() ^ 19411))).getMethod(C1561oA.Xd("ts\u0004c\u000b\u0006\by\u0003i|\u000b\u0010\u0004~\u0002", (short) (C1580rY.Xd() ^ (-1786))), Class.forName(Wg.Zd("Dn\u000fUM'f\u000f3U\u0006\u0002+=\u000e\"", (short) (C1580rY.Xd() ^ (-485)), (short) (C1580rY.Xd() ^ (-12791)))));
                try {
                    method2.setAccessible(true);
                    PowerManager powerManager = (PowerManager) method2.invoke(context, objArr2);
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + Wg.vd("x,\"71'-", (short) (ZN.Xd() ^ 23175)));
                    this.mLaunchWakeLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    StringBuilder sbAppend = new StringBuilder().append(componentName.getClassName());
                    short sXd4 = (short) (C1499aX.Xd() ^ (-4680));
                    short sXd5 = (short) (C1499aX.Xd() ^ (-10857));
                    int[] iArr3 = new int["\u0011HJB".length()];
                    QB qb3 = new QB("\u0011HJB");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, sbAppend.append(new String(iArr3, 0, i4)).toString());
                    this.mRunWakeLock = wakeLockNewWakeLock2;
                    wakeLockNewWakeLock2.setReferenceCounted(false);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent intent) throws Throwable {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            Context context = this.mContext;
            Object[] objArr = {intent2};
            Method method = Class.forName(hg.Vd("jvkxtmg0domrbjo(<gejZlg", (short) (C1633zX.Xd() ^ (-11404)), (short) (C1633zX.Xd() ^ (-17005)))).getMethod(C1561oA.yd("||hxyWht\byrs", (short) (FB.Xd() ^ 12212)), Class.forName(C1561oA.ud("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014Lf\u000b\u0010\u007f\b\r", (short) (ZN.Xd() ^ 165))));
            try {
                method.setAccessible(true);
                if (((ComponentName) method.invoke(context, objArr)) != null) {
                    synchronized (this) {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(StatsigLoggerKt.FLUSH_TIMER_MS);
                            }
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000L);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(StatsigLoggerKt.FLUSH_TIMER_MS);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
                synchronized (JobServiceEngineImpl.this.mLock) {
                    if (JobServiceEngineImpl.this.mParams != null) {
                        JobServiceEngineImpl.this.mParams.completeWork(this.mJobWork);
                    }
                }
            }
        }

        JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zDoStopCurrentWork = this.mService.doStopCurrentWork();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return zDoStopCurrentWork;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                return new WrapperWorkItem(jobWorkItemDequeueWork);
            }
        }
    }

    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context, ComponentName componentName, int i2) throws Throwable {
            super(componentName);
            ensureJobId(i2);
            this.mJobInfo = new JobInfo.Builder(i2, this.mComponentName).setOverrideDeadline(0L).build();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (C1607wl.Xd() ^ 24690))).getMethod(Xg.qd("KJZ(XYVTONbX__5bbi[ol", (short) (C1607wl.Xd() ^ 18258), (short) (C1607wl.Xd() ^ 32424)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = {Jg.Wd("1d,x;wE\u001e\bN\u0002b", (short) (C1499aX.Xd() ^ (-3682)), (short) (C1499aX.Xd() ^ (-10693)))};
                Method method2 = Class.forName(ZO.xd("\u0011\u0011t\u0002\u0001\u0018\u0005i-9R\u001e\u0019\u0013r1\u00035,:\t\u0007:", (short) (ZN.Xd() ^ 16095), (short) (ZN.Xd() ^ 16111))).getMethod(Ig.wd("`\bGLA\u000e`0|x\u00078\tKC*", (short) (Od.Xd() ^ (-6586))), Class.forName(C1626yg.Ud("i#74\u0012\u001brwU.)<xg\u000fn", (short) (C1499aX.Xd() ^ (-15903)), (short) (C1499aX.Xd() ^ (-13559)))));
                try {
                    method2.setAccessible(true);
                    this.mJobScheduler = (JobScheduler) method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        CompatWorkItem(Intent intent, int i2) {
            this.mIntent = intent;
            this.mStartId = i2;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }
    }

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem genericWorkItemDequeueWork = JobIntentService.this.dequeueWork();
                if (genericWorkItemDequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(genericWorkItemDequeueWork.getIntent());
                genericWorkItemDequeueWork.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(Void r2) {
            JobIntentService.this.processorFinished();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r2) {
            JobIntentService.this.processorFinished();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new JobServiceEngineImpl(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.serviceStartReceived();
        synchronized (this.mCompatQueue) {
            ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            }
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i2, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i2, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i2, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i2);
            workEnqueuer.ensureJobId(i2);
            workEnqueuer.enqueueWork(intent);
        }
    }

    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z2, int i2) {
        HashMap<ComponentName, WorkEnqueuer> map = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer = map.get(componentName);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (!z2) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        JobWorkEnqueuer jobWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i2);
        map.put(componentName, jobWorkEnqueuer);
        return jobWorkEnqueuer;
    }

    public void setInterruptIfStopped(boolean z2) {
        this.mInterruptIfStopped = z2;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z2) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z2) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    void processorFinished() {
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<CompatWorkItem> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.serviceProcessingFinished();
                }
            }
        }
    }

    GenericWorkItem dequeueWork() {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.dequeueWork();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            return this.mCompatQueue.remove(0);
        }
    }
}
