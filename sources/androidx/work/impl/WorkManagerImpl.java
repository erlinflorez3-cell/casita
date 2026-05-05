package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.R;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class WorkManagerImpl extends WorkManager {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private Configuration mConfiguration;
    private Context mContext;
    private boolean mForceStopRunnableCompleted;
    private PreferenceUtils mPreferenceUtils;
    private Processor mProcessor;
    private volatile RemoteWorkManager mRemoteWorkManager;
    private BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private List<Scheduler> mSchedulers;
    private final Trackers mTrackers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private static final String TAG = Logger.tagWithPrefix("WorkManagerImpl");
    private static WorkManagerImpl sDelegatedInstance = null;
    private static WorkManagerImpl sDefaultInstance = null;
    private static final Object sLock = new Object();

    public static void setDelegate(WorkManagerImpl delegate) {
        synchronized (sLock) {
            sDelegatedInstance = delegate;
        }
    }

    @Deprecated
    public static WorkManagerImpl getInstance() {
        synchronized (sLock) {
            WorkManagerImpl workManagerImpl = sDelegatedInstance;
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            return sDefaultInstance;
        }
    }

    public static boolean isInitialized() {
        return getInstance() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl getInstance(Context context) {
        WorkManagerImpl workManagerImpl;
        synchronized (sLock) {
            workManagerImpl = getInstance();
            if (workManagerImpl == null) {
                short sXd = (short) (C1607wl.Xd() ^ 27871);
                int[] iArr = new int["\\j]lnia,Vc_f\\fi$.[W^Tha".length()];
                QB qb = new QB("\\j]lnia,Vc_f\\fi$.[W^Tha");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd2 = (short) (Od.Xd() ^ (-15370));
                short sXd3 = (short) (Od.Xd() ^ (-23716));
                int[] iArr2 = new int["\f\t\u0017b\u0011\u0010\u000b\u0007\u007f|\u000f\u0003\b\u0006Y\u0005\u0003\bw\n\u0005".length()];
                QB qb2 = new QB("\f\t\u0017b\u0011\u0010\u000b\u0007\u007f|\u000f\u0003\b\u0006Y\u0005\u0003\bw\n\u0005");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    if (context2 instanceof Configuration.Provider) {
                        initialize(context2, ((Configuration.Provider) context2).getWorkManagerConfiguration());
                        workManagerImpl = getInstance(context2);
                    } else {
                        throw new IllegalStateException(hg.Vd("~\u0016\u0018\u0010p\u0004\u0010\u0002\u0007\u0004\u0010<\u0005\u000e9\u0007\u0007\u000b5}\u0002{\u0006ypzv\u0007pn)xyuuiunz.\u001f\u001eVkp\u001aaYm[\u0015Ykb]YRWaXd\nMQZGGPHF\u00017NPH)<H:?<H\u001eB<F:1;7G1=i26f?495a.!-'#!..dW\u001f\u0017+\u0019R  $N\u001b\u000e\u001a \u000b\u0015\u0014 E\b\u0005\u000f\u000e\u0006\u0004>t\f\u000e\u0006fy\u0006w|y\u00065z~x\u0003vmws\u0004m'gy$wjjs\u001fnlein%\u0018XdY\u0014lafb\u000f/]\\WSLI[OTR\u0003FPER}KKOyBEGB:A8@Eo\u0012=;241>:(:.31o\u00112.4&  ,f", (short) (C1633zX.Xd() ^ (-27764)), (short) (C1633zX.Xd() ^ (-20255))));
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return workManagerImpl;
    }

    public static void initialize(Context context, Configuration configuration) {
        synchronized (sLock) {
            WorkManagerImpl workManagerImpl = sDelegatedInstance;
            if (workManagerImpl != null && sDefaultInstance != null) {
                throw new IllegalStateException(C1561oA.ud("(?A9\u001a-9+0-9e.7b#-2$\u001f!5Z#'!+\u001f\u0016 \u001c,\u0016\u0014\\MLo\u0014\u000eH!\u0016\u001bD\u0018\u0015\u001b@\u0014\u000e=\u0006\n\u0004\u000e\u0002x\u0003~\u000fx2z\u0005/{nz\u0001kut\u0001&|mwjpus\u001eaen[[d`d\\\u0014Jac[<O[MRO[1UOYMDNJZDP\u001c{.?>w.EG? 3?163?n482<0'1-='h\u0003.,1!3.dWy%#\u001a\u001c\u0019&\"\u0010\"\u0016\u001b\u0019RH\u0017\u0019E\u0019\f\bA\u0004\f\u007f\u0011\u0010;\u0007~\u000f|\u00035^t\trt~q-rz|)uvxj$lpgoqk^pdig&", (short) (C1633zX.Xd() ^ (-3305))));
            }
            if (workManagerImpl == null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.yd("iwn}{vr=cppwisz5;hhoaur", (short) (C1499aX.Xd() ^ (-44)))).getMethod(C1561oA.Yd("WVf4deb`[ZndkkAnnug{x", (short) (C1499aX.Xd() ^ (-15354))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    if (sDefaultInstance == null) {
                        sDefaultInstance = new WorkManagerImpl(context2, configuration, new WorkManagerTaskExecutor(configuration.getTaskExecutor()));
                    }
                    sDelegatedInstance = sDefaultInstance;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor workTaskExecutor) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u001e\u0003H0s\u0011:!\b\u0012\u0015z!\u001aF[4\\!`\u0013{_", (short) (C1499aX.Xd() ^ (-2676)))).getMethod(EO.Od("q?^U\u001cW9)\u0005DB4", (short) (OY.Xd() ^ 10228)), new Class[0]);
        try {
            method.setAccessible(true);
            this(context, configuration, workTaskExecutor, ((Resources) method.invoke(context, objArr)).getBoolean(R.bool.workmanager_test_configuration));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor workTaskExecutor, boolean useTestDatabase) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("$97lqr\u0016f$W^\f\u0005\u0017E\u0006#v\u001eKD^\u0003", (short) (C1633zX.Xd() ^ (-29627)), (short) (C1633zX.Xd() ^ (-11199)))).getMethod(C1561oA.Xd("jiyGwxusnm\u0002w~~T\u0002\u0002\tz\u000f\f", (short) (FB.Xd() ^ 27848)), new Class[0]);
        try {
            method.setAccessible(true);
            this(context, configuration, workTaskExecutor, WorkDatabase.create((Context) method.invoke(context, objArr), workTaskExecutor.getSerialTaskExecutor(), useTestDatabase));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase database) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("codqmf`)]hfk[ch!5`^cSe`", (short) (ZN.Xd() ^ 19868)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-30975));
        short sXd2 = (short) (C1499aX.Xd() ^ (-14045));
        int[] iArr = new int["\t\b\u0018e\u0016\u0017\u0014\u0012\r\f \u0016\u001d\u001dr  '\u0019-*".length()];
        QB qb = new QB("\t\b\u0018e\u0016\u0017\u0014\u0012\r\f \u0016\u001d\u001dr  '\u0019-*");
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
            Context context2 = (Context) method.invoke(context, objArr);
            Logger.setLogger(new Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
            Trackers trackers = new Trackers(context2, workTaskExecutor);
            this.mTrackers = trackers;
            List<Scheduler> listCreateSchedulers = createSchedulers(context2, configuration, trackers);
            internalInit(context, configuration, workTaskExecutor, database, listCreateSchedulers, new Processor(context, configuration, workTaskExecutor, database, listCreateSchedulers));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, List<Scheduler> schedulers, Processor processor) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("s\u007ft\u0002}vp9mxv{ksx1Epnscup", (short) (OY.Xd() ^ 5205)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 30313);
        int[] iArr = new int["\u0002\u0001\u0011^\u000f\u0010\r\u000b\u0006\u0005\u0019\u000f\u0016\u0016k\u0019\u0019 \u0012&#".length()];
        QB qb = new QB("\u0002\u0001\u0011^\u000f\u0010\r\u000b\u0006\u0005\u0019\u000f\u0016\u0016k\u0019\u0019 \u0012&#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this(context, configuration, workTaskExecutor, workDatabase, schedulers, processor, new Trackers((Context) method.invoke(context, objArr), workTaskExecutor));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, List<Scheduler> schedulers, Processor processor, Trackers trackers) throws Throwable {
        this.mTrackers = trackers;
        internalInit(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public WorkDatabase getWorkDatabase() {
        return this.mWorkDatabase;
    }

    @Override // androidx.work.WorkManager
    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public List<Scheduler> getSchedulers() {
        return this.mSchedulers;
    }

    public Processor getProcessor() {
        return this.mProcessor;
    }

    public TaskExecutor getWorkTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public PreferenceUtils getPreferenceUtils() {
        return this.mPreferenceUtils;
    }

    public Trackers getTrackers() {
        return this.mTrackers;
    }

    @Override // androidx.work.WorkManager
    public Operation enqueue(List<? extends WorkRequest> requests) {
        if (requests.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new WorkContinuationImpl(this, requests).enqueue();
    }

    @Override // androidx.work.WorkManager
    public WorkContinuation beginWith(List<OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, work);
    }

    @Override // androidx.work.WorkManager
    public WorkContinuation beginUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, work);
    }

    @Override // androidx.work.WorkManager
    public Operation enqueueUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> work) {
        return new WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, work).enqueue();
    }

    @Override // androidx.work.WorkManager
    public Operation enqueueUniquePeriodicWork(String uniqueWorkName, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWork) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE) {
            return WorkerUpdater.enqueueUniquelyNamedPeriodic(this, uniqueWorkName, periodicWork);
        }
        return createWorkContinuationForUniquePeriodicWork(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).enqueue();
    }

    public WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(String uniqueWorkName, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWork) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, Collections.singletonList(periodicWork));
    }

    @Override // androidx.work.WorkManager
    public Operation cancelWorkById(UUID id) {
        CancelWorkRunnable cancelWorkRunnableForId = CancelWorkRunnable.forId(id, this);
        this.mWorkTaskExecutor.executeOnTaskThread(cancelWorkRunnableForId);
        return cancelWorkRunnableForId.getOperation();
    }

    @Override // androidx.work.WorkManager
    public Operation cancelAllWorkByTag(final String tag) {
        CancelWorkRunnable cancelWorkRunnableForTag = CancelWorkRunnable.forTag(tag, this);
        this.mWorkTaskExecutor.executeOnTaskThread(cancelWorkRunnableForTag);
        return cancelWorkRunnableForTag.getOperation();
    }

    @Override // androidx.work.WorkManager
    public Operation cancelUniqueWork(String uniqueWorkName) {
        CancelWorkRunnable cancelWorkRunnableForName = CancelWorkRunnable.forName(uniqueWorkName, this, true);
        this.mWorkTaskExecutor.executeOnTaskThread(cancelWorkRunnableForName);
        return cancelWorkRunnableForName.getOperation();
    }

    @Override // androidx.work.WorkManager
    public Operation cancelAllWork() {
        CancelWorkRunnable cancelWorkRunnableForAll = CancelWorkRunnable.forAll(this);
        this.mWorkTaskExecutor.executeOnTaskThread(cancelWorkRunnableForAll);
        return cancelWorkRunnableForAll.getOperation();
    }

    @Override // androidx.work.WorkManager
    public PendingIntent createCancelPendingIntent(UUID id) {
        return PendingIntent.getService(this.mContext, 0, SystemForegroundDispatcher.createCancelWorkIntent(this.mContext, id.toString()), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    @Override // androidx.work.WorkManager
    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return this.mPreferenceUtils.getLastCancelAllTimeMillisLiveData();
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<Long> getLastCancelAllTimeMillis() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.mWorkTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.WorkManagerImpl.1
            final /* synthetic */ SettableFuture val$future;
            final /* synthetic */ PreferenceUtils val$preferenceUtils;

            AnonymousClass1(SettableFuture settableFutureCreate2, final PreferenceUtils val$preferenceUtils) {
                val$future = settableFutureCreate2;
                val$preferenceUtils = val$preferenceUtils;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    val$future.set(Long.valueOf(val$preferenceUtils.getLastCancelAllTimeMillis()));
                } catch (Throwable th) {
                    val$future.setException(th);
                }
            }
        });
        return settableFutureCreate2;
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ SettableFuture val$future;
        final /* synthetic */ PreferenceUtils val$preferenceUtils;

        AnonymousClass1(SettableFuture settableFutureCreate2, final PreferenceUtils val$preferenceUtils) {
            val$future = settableFutureCreate2;
            val$preferenceUtils = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                val$future.set(Long.valueOf(val$preferenceUtils.getLastCancelAllTimeMillis()));
            } catch (Throwable th) {
                val$future.setException(th);
            }
        }
    }

    @Override // androidx.work.WorkManager
    public Operation pruneWork() {
        PruneWorkRunnable pruneWorkRunnable = new PruneWorkRunnable(this);
        this.mWorkTaskExecutor.executeOnTaskThread(pruneWorkRunnable);
        return pruneWorkRunnable.getOperation();
    }

    @Override // androidx.work.WorkManager
    public LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID id) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(id.toString())), new Function<List<WorkSpec.WorkInfoPojo>, WorkInfo>() { // from class: androidx.work.impl.WorkManagerImpl.2
            AnonymousClass2() {
            }

            @Override // androidx.arch.core.util.Function
            public WorkInfo apply(List<WorkSpec.WorkInfoPojo> input) {
                if (input == null || input.size() <= 0) {
                    return null;
                }
                return input.get(0).toWorkInfo();
            }
        }, this.mWorkTaskExecutor);
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$2 */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        AnonymousClass2() {
        }

        @Override // androidx.arch.core.util.Function
        public WorkInfo apply(List<WorkSpec.WorkInfoPojo> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).toWorkInfo();
        }
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<WorkInfo> getWorkInfoById(UUID id) {
        StatusRunnable<WorkInfo> statusRunnableForUUID = StatusRunnable.forUUID(this, id);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(statusRunnableForUUID);
        return statusRunnableForUUID.getFuture();
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String tag) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForTag(tag), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<List<WorkInfo>> getWorkInfosByTag(String tag) {
        StatusRunnable<List<WorkInfo>> statusRunnableForTag = StatusRunnable.forTag(this, tag);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(statusRunnableForTag);
        return statusRunnableForTag.getFuture();
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String uniqueWorkName) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForName(uniqueWorkName), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(String uniqueWorkName) {
        StatusRunnable<List<WorkInfo>> statusRunnableForUniqueWork = StatusRunnable.forUniqueWork(this, uniqueWorkName);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(statusRunnableForUniqueWork);
        return statusRunnableForUniqueWork.getFuture();
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery workQuery) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.rawWorkInfoDao().getWorkInfoPojosLiveData(RawQueries.toRawQuery(workQuery)), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<List<WorkInfo>> getWorkInfos(WorkQuery workQuery) {
        StatusRunnable<List<WorkInfo>> statusRunnableForWorkQuerySpec = StatusRunnable.forWorkQuerySpec(this, workQuery);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(statusRunnableForWorkQuerySpec);
        return statusRunnableForWorkQuerySpec.getFuture();
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture<WorkManager.UpdateResult> updateWork(WorkRequest request) {
        return WorkerUpdater.updateWorkImpl(this, request);
    }

    LiveData<List<WorkInfo>> getWorkInfosById(List<String> workSpecIds) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(workSpecIds), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    public RemoteWorkManager getRemoteWorkManager() {
        if (this.mRemoteWorkManager == null) {
            synchronized (sLock) {
                if (this.mRemoteWorkManager == null) {
                    tryInitializeMultiProcessSupport();
                    if (this.mRemoteWorkManager == null && !TextUtils.isEmpty(this.mConfiguration.getDefaultProcessName())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.mRemoteWorkManager;
    }

    public void startWork(StartStopToken workSpecId) {
        startWork(workSpecId, null);
    }

    public void startWork(StartStopToken workSpecId, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StartWorkRunnable(this, workSpecId, runtimeExtras));
    }

    public void stopWork(StartStopToken workSpecId) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this, workSpecId, false));
    }

    public void stopForegroundWork(WorkGenerationalId id) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this, new StartStopToken(id), true));
    }

    public void rescheduleEligibleWork() {
        SystemJobScheduler.cancelAll(getApplicationContext());
        getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            this.mForceStopRunnableCompleted = true;
            BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
            if (pendingResult != null) {
                pendingResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (sLock) {
            BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
            if (pendingResult != null) {
                pendingResult.finish();
            }
            this.mRescheduleReceiverResult = rescheduleReceiverResult;
            if (this.mForceStopRunnableCompleted) {
                rescheduleReceiverResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    private void internalInit(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, List<Scheduler> schedulers, Processor processor) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("IWN][VR\u001dS``gYcj%;hhoaur", (short) (C1607wl.Xd() ^ 7780), (short) (C1607wl.Xd() ^ 23482))).getMethod(Jg.Wd("aY^A\u0007\\NaqENUqF\u0011ShD+\\n", (short) (ZN.Xd() ^ 18684), (short) (ZN.Xd() ^ 19732)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.mContext = context2;
            this.mConfiguration = configuration;
            this.mWorkTaskExecutor = workTaskExecutor;
            this.mWorkDatabase = workDatabase;
            this.mSchedulers = schedulers;
            this.mProcessor = processor;
            this.mPreferenceUtils = new PreferenceUtils(workDatabase);
            this.mForceStopRunnableCompleted = false;
            if (Api24Impl.isDeviceProtectedStorage(context2)) {
                throw new IllegalStateException(ZO.xd("nhN:Y\u000f+=h2J\u00043OK\"<\u0002\u0016\u000frB\r\u0018\bJe\u001fG8fK_\u0015*m+\u0004/={\u0010a\u0002@\u0007j1I", (short) (OY.Xd() ^ 19831), (short) (OY.Xd() ^ 2145)));
            }
            this.mWorkTaskExecutor.executeOnTaskThread(new ForceStopRunnable(context2, this));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public List<Scheduler> createSchedulers(Context context, Configuration configuration, Trackers trackers) {
        return Arrays.asList(Schedulers.createBestAvailableBackgroundScheduler(context, this), new GreedyScheduler(context, configuration, trackers, this));
    }

    private void tryInitializeMultiProcessSupport() {
        try {
            this.mRemoteWorkManager = (RemoteWorkManager) Class.forName(REMOTE_WORK_MANAGER_CLIENT).getConstructor(Context.class, WorkManagerImpl.class).newInstance(this.mContext, this);
        } catch (Throwable th) {
            Logger.get().debug(TAG, "Unable to initialize multi-process support", th);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isDeviceProtectedStorage(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("c\u001e5Mn?7ib%5pIYth8%:[\u001b(\u001b", (short) (Od.Xd() ^ (-29692)), (short) (Od.Xd() ^ (-4908)))).getMethod(C1626yg.Ud("\u007fy7?\u0018}\u0010H\u0019^\\:\u0019[QZ\u0005\rUc=B\u0006|", (short) (C1607wl.Xd() ^ 19820), (short) (C1607wl.Xd() ^ 31931)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(context, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
