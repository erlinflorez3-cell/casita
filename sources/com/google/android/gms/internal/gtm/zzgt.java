package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgt {
    private final Context zza;
    private final zzpo zzb;
    private final ExecutorService zzc;
    private final ScheduledExecutorService zzd;
    private final com.google.android.gms.tagmanager.zzco zze;
    private final com.google.android.gms.tagmanager.zzcf zzf;

    public zzgt(Context context, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar) throws Throwable {
        zzpo zzpoVar = new zzpo(context);
        ExecutorService executorServiceZza = zzjn.zza(context);
        ScheduledExecutorService scheduledExecutorService = zzjp.zza;
        Context context2 = (Context) Preconditions.checkNotNull(context);
        short sXd = (short) (C1580rY.Xd() ^ (-24276));
        int[] iArr = new int["\u001an6,q\u0019 ABa^\u0003CFT+\u0016,r@lKU".length()];
        QB qb = new QB("\u001an6,q\u0019 ABa^\u0003CFT+\u0016,r@lKU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("OLZ&TSNJC@RFKI\u001dHFK;MH", (short) (C1607wl.Xd() ^ 31869)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zza = (Context) method.invoke(context2, objArr);
            this.zze = (com.google.android.gms.tagmanager.zzco) Preconditions.checkNotNull(zzcoVar);
            this.zzf = (com.google.android.gms.tagmanager.zzcf) Preconditions.checkNotNull(zzcfVar);
            this.zzb = (zzpo) Preconditions.checkNotNull(zzpoVar);
            this.zzc = (ExecutorService) Preconditions.checkNotNull(executorServiceZza);
            this.zzd = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final zzgs zza(String str, String str2, String str3) {
        zzid zzidVar = new zzid(this.zza, this.zze, this.zzf, str);
        zzgu zzguVar = new zzgu(this.zza, str);
        return new zzgs(this.zza, str, str2, str3, zzidVar, this.zzb, this.zzc, this.zzd, this.zze, DefaultClock.getInstance(), zzguVar);
    }
}
