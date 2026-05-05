package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;

/* JADX INFO: loaded from: classes8.dex */
public final class zzv {
    private static zzv zza = null;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzp zzd = new zzp(this, null);
    private int zze = 1;

    zzv(Context context, ScheduledExecutorService scheduledExecutorService) throws Throwable {
        this.zzc = scheduledExecutorService;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (C1607wl.Xd() ^ 18098), (short) (C1607wl.Xd() ^ 8160))).getMethod(C1561oA.od("xu\u0004O}|wsli{otrFqotdvq", (short) (Od.Xd() ^ (-28844))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzb = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static synchronized zzv zzb(Context context) {
        if (zza == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            zza = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
        }
        return zza;
    }

    private final synchronized int zzf() {
        int i2;
        i2 = this.zze;
        this.zze = i2 + 1;
        return i2;
    }

    private final synchronized Task zzg(zzs zzsVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            "Queueing ".concat(zzsVar.toString());
        }
        if (!this.zzd.zzg(zzsVar)) {
            zzp zzpVar = new zzp(this, null);
            this.zzd = zzpVar;
            zzpVar.zzg(zzsVar);
        }
        return zzsVar.zzb.getTask();
    }

    public final Task zzc(int i2, Bundle bundle) {
        return zzg(new zzr(zzf(), i2, bundle));
    }

    public final Task zzd(int i2, Bundle bundle) {
        return zzg(new zzu(zzf(), i2, bundle));
    }
}
