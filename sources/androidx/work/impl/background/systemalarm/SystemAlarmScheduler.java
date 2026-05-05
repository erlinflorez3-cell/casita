package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public class SystemAlarmScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
    private final Context mContext;

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    public SystemAlarmScheduler(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd(">\u001f =EMS,l\t\u0013($;L\u00155p{\u0011\r/5", (short) (Od.Xd() ^ (-7148)), (short) (Od.Xd() ^ (-5212)))).getMethod(C1561oA.Xd("edtBrspnih|ryyO||\u0004u\n\u0007", (short) (FB.Xd() ^ 13175)), new Class[0]);
        try {
            method.setAccessible(true);
            this.mContext = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(WorkSpec... workSpecs) throws Throwable {
        for (WorkSpec workSpec : workSpecs) {
            scheduleWorkSpec(workSpec);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(String workSpecId) throws Throwable {
        Intent intentCreateStopWorkIntent = CommandHandler.createStopWorkIntent(this.mContext, workSpecId);
        Context context = this.mContext;
        Class<?> cls = Class.forName(C1561oA.yd("Xf]lb]Y$R__fPZa\u001c*WW^H\\Y", (short) (C1633zX.Xd() ^ (-22729))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (-11488));
        int[] iArr = new int["p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lh\u000f\u0016\b\u0012\u0019".length()];
        QB qb = new QB("p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lh\u000f\u0016\b\u0012\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {intentCreateStopWorkIntent};
        Method method = cls.getMethod(Xg.qd("ikYknNaothcf", (short) (C1633zX.Xd() ^ (-24383)), (short) (C1633zX.Xd() ^ (-23353))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void scheduleWorkSpec(WorkSpec workSpec) throws Throwable {
        Logger.get().debug(TAG, Wg.vd("\u0012#%#'9-+%\u001fT-*.$YF9A6rK@D2\u001b5+.\u0015-i", (short) (OY.Xd() ^ 19805)) + workSpec.id);
        Intent intentCreateScheduleWorkIntent = CommandHandler.createScheduleWorkIntent(this.mContext, WorkSpecKt.generationalId(workSpec));
        Context context = this.mContext;
        Class<?> cls = Class.forName(Qg.kd("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (FB.Xd() ^ 12340), (short) (FB.Xd() ^ 20115)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (-30502));
        short sXd2 = (short) (C1580rY.Xd() ^ (-27973));
        int[] iArr = new int["\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015Mg\f\u0011\u0001\t\u000e".length()];
        QB qb = new QB("\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015Mg\f\u0011\u0001\t\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {intentCreateScheduleWorkIntent};
        Method method = cls.getMethod(C1561oA.ud("__K[\\:KWZLEF", (short) (Od.Xd() ^ (-31706))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
