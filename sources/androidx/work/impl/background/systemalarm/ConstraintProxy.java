package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String TAG = Logger.tagWithPrefix("ConstraintProxy");

    ConstraintProxy() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Logger.get().debug(TAG, Jg.Wd("QD[\u00023\t `b0}v", (short) (C1499aX.Xd() ^ (-24770)), (short) (C1499aX.Xd() ^ (-13296))) + intent);
        Object[] objArr = {CommandHandler.createConstraintsChangedIntent(context)};
        Method method = Class.forName(ZO.xd("\u0001\tuutT\bMm\u0018`sa\u000fn\u00068\\<$G\u0017p", (short) (C1633zX.Xd() ^ (-6162)), (short) (C1633zX.Xd() ^ (-12033)))).getMethod(Ig.wd(" wv \n\u001b\t\u0007K::Z", (short) (C1499aX.Xd() ^ (-13980))), Class.forName(C1626yg.Ud("9/On|\u00112\u0003=sFd]>-\u0004i\t=oqw", (short) (FB.Xd() ^ 25932), (short) (FB.Xd() ^ 24532))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) throws Throwable {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) throws Throwable {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) throws Throwable {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) throws Throwable {
            super.onReceive(context, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    static void updateAll(Context context, List<WorkSpec> list) throws Throwable {
        Iterator<WorkSpec> it = list.iterator();
        boolean zRequiresBatteryNotLow = false;
        ?? r5 = 0;
        ?? r4 = 0;
        ?? r2 = 0;
        while (it.hasNext()) {
            Constraints constraints = it.next().constraints;
            zRequiresBatteryNotLow |= constraints.requiresBatteryNotLow();
            r5 = (-1) - (((-1) - r5) & ((-1) - (constraints.requiresCharging() ? 1 : 0))) != 1 ? 0 : 1;
            r4 = (-1) - (((-1) - r4) & ((-1) - (constraints.requiresStorageNotLow() ? 1 : 0))) != 1 ? 0 : 1;
            r2 = (-1) - (((-1) - r2) & ((-1) - (constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED ? 1 : 0)));
            if (zRequiresBatteryNotLow && r5 != 0 && r4 != 0 && r2 != 0) {
                break;
            }
        }
        Object[] objArr = {ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, zRequiresBatteryNotLow, r5, r4, r2)};
        Method method = Class.forName(C1561oA.yd("\u0017%\u0018')$\u001cf\u0011\u001e\u001a!\u0017!$^\t629/C<", (short) (C1580rY.Xd() ^ (-20789)))).getMethod(Xg.qd("\u0019\f\u0016\rk\u001d\u001b\u000e\u0012\u0012\u0011$&", (short) (C1633zX.Xd() ^ (-9970)), (short) (C1633zX.Xd() ^ (-14560))), Class.forName(C1561oA.Yd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\f29+5<", (short) (OY.Xd() ^ 21484))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
