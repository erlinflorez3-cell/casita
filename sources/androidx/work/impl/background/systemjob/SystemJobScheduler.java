package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.core.util.Consumer;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class SystemJobScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
    private final Context mContext;
    private final JobScheduler mJobScheduler;
    private final SystemJobInfoConverter mSystemJobInfoConverter;
    private final WorkManagerImpl mWorkManager;

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemJobScheduler(Context context, WorkManagerImpl workManager) throws Throwable {
        String strUd = C1626yg.Ud("\u0015\u0001-}i{@\u0003*\u000fc\u0013", (short) (C1580rY.Xd() ^ (-27882)), (short) (C1580rY.Xd() ^ (-15133)));
        short sXd = (short) (Od.Xd() ^ (-13286));
        int[] iArr = new int["b*P{&kPWj{~!_`|Q.\u0007+W\u0006F\"".length()];
        QB qb = new QB("b*P{&kPWj{~!_`|Q.\u0007+W\u0006F\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1633zX.Xd() ^ (-5124));
        int[] iArr2 = new int["8_\u0019&$\u0017aq\r\u0012/x% 3T".length()];
        QB qb2 = new QB("8_\u0019&$\u0017aq\r\u0012/x% 3T");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strUd};
        short sXd3 = (short) (ZN.Xd() ^ 4020);
        int[] iArr3 = new int["qn|Z\u007fxxhoTeqtf_`".length()];
        QB qb3 = new QB("qn|Z\u007fxxhoTeqtf_`");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            this(context, workManager, (JobScheduler) method.invoke(context, objArr), new SystemJobInfoConverter(context));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public SystemJobScheduler(Context context, WorkManagerImpl workManager, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.mContext = context;
        this.mWorkManager = workManager;
        this.mJobScheduler = jobScheduler;
        this.mSystemJobInfoConverter = systemJobInfoConverter;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(WorkSpec... workSpecs) {
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecs) {
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(workSpec.id);
                if (workSpec2 == null) {
                    Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger.get().warning(TAG, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
                    SystemIdInfo systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(workGenerationalIdGenerationalId);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalIdGenerationalId, iNextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(workSpec, iNextJobSchedulerIdWithRange);
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public void scheduleInternal(WorkSpec workSpec, int jobId) {
        JobInfo jobInfoConvert = this.mSystemJobInfoConverter.convert(workSpec, jobId);
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Scheduling work ID " + workSpec.id + "Job ID " + jobId);
        try {
            if (this.mJobScheduler.schedule(jobInfoConvert) == 0) {
                Logger.get().warning(str, "Unable to schedule work ID " + workSpec.id);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    Logger.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.id));
                    scheduleInternal(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e2) {
            List<JobInfo> pendingJobs = getPendingJobs(this.mContext, this.mJobScheduler);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(pendingJobs != null ? pendingJobs.size() : 0), Integer.valueOf(this.mWorkManager.getWorkDatabase().workSpecDao().getScheduledWork().size()), Integer.valueOf(this.mWorkManager.getConfiguration().getMaxSchedulerLimit()));
            Logger.get().error(TAG, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
            Consumer<Throwable> schedulingExceptionHandler = this.mWorkManager.getConfiguration().getSchedulingExceptionHandler();
            if (schedulingExceptionHandler != null) {
                schedulingExceptionHandler.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            Logger.get().error(TAG, "Unable to schedule " + workSpec, th);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(String workSpecId) {
        List<Integer> pendingJobIds = getPendingJobIds(this.mContext, this.mJobScheduler, workSpecId);
        if (pendingJobIds == null || pendingJobIds.isEmpty()) {
            return;
        }
        Iterator<Integer> it = pendingJobIds.iterator();
        while (it.hasNext()) {
            cancelJobById(this.mJobScheduler, it.next().intValue());
        }
        this.mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(workSpecId);
    }

    private static void cancelJobById(JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            Logger.get().error(TAG, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }

    public static void cancelAll(Context context) {
        List<JobInfo> pendingJobs;
        Object[] objArr = {C1593ug.zd("\u0007\r\u0001\u0013\u0004\n\b\b\u001a\u0012\f\u001a", (short) (C1607wl.Xd() ^ 1114), (short) (C1607wl.Xd() ^ 6530))};
        Method method = Class.forName(C1561oA.od("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (OY.Xd() ^ 3569))).getMethod(Wg.Zd("\u001cl2kL\u0019P\u001c_u^*\u0005*z<", (short) (FB.Xd() ^ 2382), (short) (FB.Xd() ^ 19388)), Class.forName(C1561oA.Kd("^VlX&e[ic+Qsrjpj", (short) (ZN.Xd() ^ 15263))));
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) method.invoke(context, objArr);
            if (jobScheduler == null || (pendingJobs = getPendingJobs(context, jobScheduler)) == null || pendingJobs.isEmpty()) {
                return;
            }
            Iterator<JobInfo> it = pendingJobs.iterator();
            while (it.hasNext()) {
                cancelJobById(jobScheduler, it.next().getId());
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean reconcileJobs(Context context, WorkManagerImpl workManager) throws Throwable {
        Object[] objArr = {C1561oA.Xd("9?3E6<::LD>L", (short) (C1633zX.Xd() ^ (-843)))};
        Method method = Class.forName(Wg.vd(" ,!.*#\u001de*538(05m\u0012=;@0B=", (short) (ZN.Xd() ^ 14920))).getMethod(hg.Vd("ro}[\u0001yyipUfrug`a", (short) (C1607wl.Xd() ^ 12744), (short) (C1607wl.Xd() ^ 10864)), Class.forName(Qg.kd("\u0004y\u000ewC\u0001t\u0001x>b\u0003\u007fuyq", (short) (C1607wl.Xd() ^ 29373), (short) (C1607wl.Xd() ^ 30253))));
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) method.invoke(context, objArr);
            List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
            List<String> workSpecIds = workManager.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
            boolean z2 = false;
            HashSet hashSet = new HashSet(pendingJobs != null ? pendingJobs.size() : 0);
            if (pendingJobs != null && !pendingJobs.isEmpty()) {
                for (JobInfo jobInfo : pendingJobs) {
                    WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(jobInfo);
                    if (workGenerationalIdFromJobInfo != null) {
                        hashSet.add(workGenerationalIdFromJobInfo.getWorkSpecId());
                    } else {
                        cancelJobById(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator<String> it = workSpecIds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!hashSet.contains(it.next())) {
                    Logger.get().debug(TAG, C1561oA.ud("Ykhsqejlhld\u001cei[k", (short) (C1607wl.Xd() ^ 23356)));
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                WorkDatabase workDatabase = workManager.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                    Iterator<String> it2 = workSpecIds.iterator();
                    while (it2.hasNext()) {
                        workSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                    }
                    workDatabase.setTransactionSuccessful();
                } finally {
                    workDatabase.endTransaction();
                }
            }
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static List<JobInfo> getPendingJobs(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Logger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static List<Integer> getPendingJobIds(Context context, JobScheduler jobScheduler, String workSpecId) {
        List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : pendingJobs) {
            WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(jobInfo);
            if (workGenerationalIdFromJobInfo != null && workSpecId.equals(workGenerationalIdFromJobInfo.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static WorkGenerationalId getWorkGenerationalIdFromJobInfo(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
