package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class Alarms {
    private static final String TAG = Logger.tagWithPrefix("Alarms");

    public static void setAlarm(Context context, WorkDatabase workDatabase, WorkGenerationalId id, long triggerAtMillis) throws Throwable {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(id);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, id, systemIdInfo.systemId);
            setExactAlarm(context, id, systemIdInfo.systemId, triggerAtMillis);
        } else {
            int iNextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
            systemIdInfoDao.insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(id, iNextAlarmManagerId));
            setExactAlarm(context, id, iNextAlarmManagerId, triggerAtMillis);
        }
    }

    public static void cancelAlarm(Context context, WorkDatabase workDatabase, WorkGenerationalId id) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(id);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, id, systemIdInfo.systemId);
            Logger.get().debug(TAG, "Removing SystemIdInfo for workSpecId (" + id + ")");
            systemIdInfoDao.removeSystemIdInfo(id);
        }
    }

    private static void cancelExactAlarm(Context context, WorkGenerationalId id, int alarmId) throws Throwable {
        Object[] objArr = {EO.Od(" ]\u0001:t", (short) (C1633zX.Xd() ^ (-21191)))};
        Method method = Class.forName(C1561oA.Qd(")5*73,&n#.,1!).fz&$)\u0019+&", (short) (C1607wl.Xd() ^ 3934))).getMethod(C1561oA.od("liwUzsscjO`loaZ[", (short) (FB.Xd() ^ 18525)), Class.forName(C1593ug.zd("YQgS!`Vd^&Lnmeke", (short) (C1499aX.Xd() ^ (-26860)), (short) (C1499aX.Xd() ^ (-29732)))));
        try {
            method.setAccessible(true);
            AlarmManager alarmManager = (AlarmManager) method.invoke(context, objArr);
            PendingIntent service = PendingIntent.getService(context, alarmId, CommandHandler.createDelayMetIntent(context, id), 603979776);
            if (service == null || alarmManager == null) {
                return;
            }
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sbAppend = new StringBuilder(C1561oA.Kd("Wv\u0005z}\u0006\u0007\u0005\u000b\u0005>\u0005\u0019\u000b\u0016\u0018\u000e\u0014\u000eG\n\u0016\f\u001e\u001aM&\u0019%\u001aR[,%)#\f* \u001f\u0006\"j_4;68*3\u0010,qir", (short) (FB.Xd() ^ 12792))).append(id).append(Wg.Zd("r&", (short) (ZN.Xd() ^ 12009), (short) (ZN.Xd() ^ 27928))).append(alarmId);
            short sXd = (short) (C1580rY.Xd() ^ (-26724));
            int[] iArr = new int["!".length()];
            QB qb = new QB("!");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            logger.debug(str, sbAppend.append(new String(iArr, 0, i2)).toString());
            alarmManager.cancel(service);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void setExactAlarm(Context context, WorkGenerationalId id, int alarmId, long triggerAtMillis) throws Throwable {
        Object[] objArr = {Wg.vd("\u007f\n\u0002\u0012\u0010", (short) (C1633zX.Xd() ^ (-11643)))};
        Method method = Class.forName(Qg.kd("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB", (short) (C1607wl.Xd() ^ 20715), (short) (C1607wl.Xd() ^ 28229))).getMethod(C1561oA.ud("{x\u0007d\n\u0003\u0003ry^o{~pij", (short) (C1607wl.Xd() ^ 6541)), Class.forName(hg.Vd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (ZN.Xd() ^ 30176), (short) (ZN.Xd() ^ 9480))));
        try {
            method.setAccessible(true);
            AlarmManager alarmManager = (AlarmManager) method.invoke(context, objArr);
            PendingIntent service = PendingIntent.getService(context, alarmId, CommandHandler.createDelayMetIntent(context, id), 201326592);
            if (alarmManager != null) {
                Api19Impl.setExact(alarmManager, 0, triggerAtMillis, service);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Alarms() {
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setExact(AlarmManager alarmManager, int type, long triggerAtMillis, PendingIntent operation) {
            alarmManager.setExact(type, triggerAtMillis, operation);
        }
    }
}
