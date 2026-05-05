package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ForceStopRunnable implements Runnable {
    static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final long BACKOFF_DURATION_MS = 300;
    static final int MAX_ATTEMPTS = 3;
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
    private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650);
    private final Context mContext;
    private final PreferenceUtils mPreferenceUtils;
    private int mRetryCount;
    private final WorkManagerImpl mWorkManager;

    public ForceStopRunnable(Context context, WorkManagerImpl workManager) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Yd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (C1607wl.Xd() ^ 6309)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 8147);
        short sXd2 = (short) (C1607wl.Xd() ^ 29756);
        int[] iArr = new int["QP`.^_\\ZUTh^ee;hhoaur".length()];
        QB qb = new QB("QP`.^_\\ZUTh^ee;hhoaur");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.mContext = (Context) method.invoke(context, objArr);
            this.mWorkManager = workManager;
            this.mPreferenceUtils = workManager.getPreferenceUtils();
            this.mRetryCount = 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2;
        try {
            if (multiProcessChecks()) {
                while (true) {
                    try {
                        WorkDatabasePathHelper.migrateDatabase(this.mContext);
                        Logger.get().debug(TAG, "Performing cleanup operations.");
                        try {
                            forceStopRunnable();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e2) {
                            i2 = this.mRetryCount + 1;
                            this.mRetryCount = i2;
                            if (i2 >= 3) {
                                Logger logger = Logger.get();
                                String str = TAG;
                                logger.error(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                                Consumer<Throwable> initializationExceptionHandler = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                                if (initializationExceptionHandler != null) {
                                    Logger.get().debug(str, "Routing exception to the specified exception handler", illegalStateException);
                                    initializationExceptionHandler.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                Logger.get().debug(TAG, "Retrying after " + (((long) i2) * BACKOFF_DURATION_MS), e2);
                                sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                            }
                        }
                        Logger.get().debug(TAG, "Retrying after " + (((long) i2) * BACKOFF_DURATION_MS), e2);
                        sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                    } catch (SQLiteException e3) {
                        Logger.get().error(TAG, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                        Consumer<Throwable> initializationExceptionHandler2 = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                        if (initializationExceptionHandler2 != null) {
                            initializationExceptionHandler2.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.mWorkManager.onForceStopRunnableCompleted();
        }
    }

    public boolean isForceStopped() {
        try {
            PendingIntent pendingIntent = getPendingIntent(this.mContext, Build.VERSION.SDK_INT >= 31 ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                Context context = this.mContext;
                String strOd = EO.Od(":nm?[\u001bN[", (short) (C1580rY.Xd() ^ (-9083)));
                Class<?> cls = Class.forName(C1561oA.Qd("$0%2.'!i\u001e)',\u001c$)au!\u001f$\u0014&!", (short) (ZN.Xd() ^ 17664)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1593ug.zd("3+A-z:0>8\u007f&HG?E?", (short) (ZN.Xd() ^ 26258), (short) (ZN.Xd() ^ 11129)));
                Object[] objArr = {strOd};
                Method method = cls.getMethod(C1561oA.od(";8F$IBB29\u001e/;>0)*", (short) (Od.Xd() ^ (-21263))), clsArr);
                try {
                    method.setAccessible(true);
                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) method.invoke(context, objArr)).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        long lastForceStopEventMillis = this.mPreferenceUtils.getLastForceStopEventMillis();
                        for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                            ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i2);
                            if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= lastForceStopEventMillis) {
                                return true;
                            }
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (pendingIntent == null) {
                setAlarm(this.mContext);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e3) {
            Logger.get().warning(TAG, C1561oA.Kd("y\u0019!#'\u001f%\u001fX\u001f3\u001f\".3)00", (short) (C1580rY.Xd() ^ (-6369))), e3);
            return true;
        }
    }

    public void forceStopRunnable() throws Throwable {
        boolean zCleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            Logger.get().debug(TAG, "Rescheduling Workers.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mWorkManager.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(TAG, "Application was force-stopped, rescheduling.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mPreferenceUtils.setLastForceStopEventMillis(System.currentTimeMillis());
        } else if (zCleanUp) {
            Logger.get().debug(TAG, "Found unfinished work, scheduling it.");
            Schedulers.schedule(this.mWorkManager.getConfiguration(), this.mWorkManager.getWorkDatabase(), this.mWorkManager.getSchedulers());
        }
    }

    public boolean cleanUp() throws Throwable {
        boolean zReconcileJobs = SystemJobScheduler.reconcileJobs(this.mContext, this.mWorkManager);
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z2 = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z2) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            return z2 || zReconcileJobs;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public boolean shouldRescheduleWorkers() {
        return this.mWorkManager.getPreferenceUtils().getNeedsReschedule();
    }

    public boolean multiProcessChecks() throws Throwable {
        Configuration configuration = this.mWorkManager.getConfiguration();
        if (TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            Logger.get().debug(TAG, "The default process name was not specified.");
            return true;
        }
        boolean zIsDefaultProcess = ProcessUtils.isDefaultProcess(this.mContext, configuration);
        Logger.get().debug(TAG, "Is default app process = " + zIsDefaultProcess);
        return zIsDefaultProcess;
    }

    public void sleep(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException unused) {
        }
    }

    private static PendingIntent getPendingIntent(Context context, int flags) {
        return PendingIntent.getBroadcast(context, -1, getIntent(context), flags);
    }

    static Intent getIntent(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction(ACTION_FORCE_STOP_RESCHEDULE);
        return intent;
    }

    static void setAlarm(Context context) throws Throwable {
        String strWd = Jg.Wd("})i:x", (short) (FB.Xd() ^ 2558), (short) (FB.Xd() ^ 7658));
        Class<?> cls = Class.forName(ZO.xd("@{\u001eNf\u0006s4\u001c\u0017*\u0011QDoj]<xk\u0015Gt", (short) (C1580rY.Xd() ^ (-32665)), (short) (C1580rY.Xd() ^ (-3155))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1633zX.Xd() ^ (-12486));
        short sXd2 = (short) (C1633zX.Xd() ^ (-1831));
        int[] iArr = new int["2\u001e-\u0016\u0001:LEAN[\"\u0019\u001dgb".length()];
        QB qb = new QB("2\u001e-\u0016\u0001:LEAN[\"\u0019\u001dgb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strWd};
        short sXd3 = (short) (C1633zX.Xd() ^ (-23627));
        int[] iArr2 = new int["W\u0007RMDhQ#gm\n-aR|\u0019".length()];
        QB qb2 = new QB("W\u0007RMDhQ#gm\n-aR|\u0019");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            AlarmManager alarmManager = (AlarmManager) method.invoke(context, objArr);
            PendingIntent pendingIntent = getPendingIntent(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            long jCurrentTimeMillis = System.currentTimeMillis() + TEN_YEARS;
            if (alarmManager != null) {
                alarmManager.setExact(0, jCurrentTimeMillis, pendingIntent);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            if (intent == null || !ForceStopRunnable.ACTION_FORCE_STOP_RESCHEDULE.equals(intent.getAction())) {
                return;
            }
            Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.setAlarm(context);
        }
    }
}
