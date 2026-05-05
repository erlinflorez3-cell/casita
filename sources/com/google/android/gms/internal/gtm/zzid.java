package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzid {
    private final Context zza;
    private final String zzb;
    private final com.google.android.gms.tagmanager.zzco zzc;
    private final com.google.android.gms.tagmanager.zzcf zzd;

    public zzid(Context context, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (FB.Xd() ^ 32019))).getMethod(Wg.Zd("|\u001cJ8\u0007*Ec|\u001aLb\b*\u001ek\n1?s\u000f", (short) (ZN.Xd() ^ 2673), (short) (ZN.Xd() ^ 24302)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zza = (Context) method.invoke(context, objArr);
            this.zzc = zzcoVar;
            this.zzd = zzcfVar;
            this.zzb = str;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final zzic zza(zzqj zzqjVar, zzqs zzqsVar) {
        return new zzic(this.zza, this.zzb, zzqjVar, zzqsVar, this.zzc, this.zzd);
    }
}
