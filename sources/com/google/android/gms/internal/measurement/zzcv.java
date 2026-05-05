package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcv {
    private static final Method zza = zzc();
    private static final Method zzb = zzb();
    private final JobScheduler zzc;

    private zzcv(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                }
            }
        }
        return 0;
    }

    private final int zza(JobInfo jobInfo, String str, int i2, String str2) {
        Method method = zza;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.zzc, jobInfo, str, Integer.valueOf(i2), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) throws Throwable {
        Object[] objArr = {C1561oA.Yd("\\bVhY_]]ogao", (short) (OY.Xd() ^ 16470))};
        Method method = Class.forName(Xg.qd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (C1633zX.Xd() ^ (-13254)), (short) (C1633zX.Xd() ^ (-16394)))).getMethod(ZO.xd("d\f-K\u0004\u00022o\u000e5t=>\u0003|F", (short) (C1607wl.Xd() ^ 23941), (short) (C1607wl.Xd() ^ 29014)), Class.forName(Jg.Wd("C7UE\u0013N,>H\f:\u0001\u007fs\u0002\u007f", (short) (C1633zX.Xd() ^ (-18088)), (short) (C1633zX.Xd() ^ (-9400)))));
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) Preconditions.checkNotNull((JobScheduler) method.invoke(context, objArr));
            if (zza != null) {
                Object[] objArr2 = {C1626yg.Ud("\u00140hP\u0015+f,|\t\u0015\u0004\u0003j\u0017\u0010=hi\u000eRR\u0007g&v\\TW\u0002Y/\u001cr3\u0017a\u0003", (short) (OY.Xd() ^ 31082), (short) (OY.Xd() ^ 20433))};
                Method method2 = Class.forName(Ig.wd("?\u007f\"VR\u000fs\u0014\n<;a# \b\nU\u001a?;l:\u001a", (short) (ZN.Xd() ^ 6369))).getMethod(C1561oA.Qd("UYURY@QWP9MYSNWVKPN", (short) (Od.Xd() ^ (-4500))), Class.forName(EO.Od("7e\u001f#*\u001eho\f\u0010-v$\u001f2R", (short) (OY.Xd() ^ 10751))));
                try {
                    method2.setAccessible(true);
                    if (((Integer) method2.invoke(context, objArr2)).intValue() == 0) {
                        return new zzcv(jobScheduler).zza(jobInfo, str, zza(), str2);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return jobScheduler.schedule(jobInfo);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Method zzb() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            return Log.isLoggable("JobSchedulerCompat", 6) ? null : null;
        }
    }

    private static Method zzc() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return Log.isLoggable("JobSchedulerCompat", 6) ? null : null;
        }
    }
}
