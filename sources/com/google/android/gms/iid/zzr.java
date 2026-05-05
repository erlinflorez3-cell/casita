package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr {
    private final ScheduledExecutorService zzce;
    private zzt zzcf;
    private int zzcg;
    private final Context zzl;

    public zzr(Context context) {
        this(context, com.google.android.gms.internal.gcm.zzg.zzaa().zze(1, new NamedThreadFactory("MessengerIpcClient"), 9));
    }

    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) throws Throwable {
        this.zzcf = new zzt(this);
        this.zzcg = 1;
        short sXd = (short) (OY.Xd() ^ 14519);
        short sXd2 = (short) (OY.Xd() ^ 4300);
        int[] iArr = new int["\"Yi1&\u000ebf\u0017\buV+u\u000e\u007f*\u0005xChR*".length()];
        QB qb = new QB("\"Yi1&\u000ebf\u0017\buV+u\u000e\u007f*\u0005xChR*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("E\"F%\u0002\"(\\t\u0015n\u001a\u001f\u0006\u000eV.C\b;|", (short) (C1607wl.Xd() ^ 24110), (short) (C1607wl.Xd() ^ 26882)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzl = (Context) method.invoke(context, objArr);
            this.zzce = scheduledExecutorService;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final synchronized <T> Task<T> zzd(zzz<T> zzzVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(zzzVar);
            new StringBuilder(String.valueOf(strValueOf).length() + 9).append("Queueing ").append(strValueOf).toString();
        }
        if (!this.zzcf.zze(zzzVar)) {
            zzt zztVar = new zzt(this);
            this.zzcf = zztVar;
            zztVar.zze(zzzVar);
        }
        return zzzVar.zzcq.getTask();
    }

    private final synchronized int zzs() {
        int i2;
        i2 = this.zzcg;
        this.zzcg = i2 + 1;
        return i2;
    }

    public final Task<Bundle> zzd(int i2, Bundle bundle) {
        return zzd(new zzab(zzs(), 1, bundle));
    }
}
