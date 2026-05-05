package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjo {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdw zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzjo(Context context, com.google.android.gms.internal.measurement.zzdw zzdwVar, Long l2) throws Throwable {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        short sXd = (short) (FB.Xd() ^ 30183);
        int[] iArr = new int["M\u0003'\\A\tg\u0001u5.Vry,\u0007I{\"\u0010@z!".length()];
        QB qb = new QB("M\u0003'\\A\tg\u0001u5.Vry,\u0007I{\"\u0010@z!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("SP^*XWRNGDVJOM!LJO?QL", (short) (OY.Xd() ^ 30427)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Preconditions.checkNotNull(context2);
            this.zza = context2;
            this.zzi = l2;
            if (zzdwVar != null) {
                this.zzg = zzdwVar;
                this.zzb = zzdwVar.zzf;
                this.zzc = zzdwVar.zze;
                this.zzd = zzdwVar.zzd;
                this.zzh = zzdwVar.zzc;
                this.zzf = zzdwVar.zzb;
                this.zzj = zzdwVar.zzh;
                if (zzdwVar.zzg != null) {
                    this.zze = Boolean.valueOf(zzdwVar.zzg.getBoolean(C1593ug.zd("LJ^L/\\Z[UTf\\cc:\\^ZogpBl`bmgg", (short) (C1633zX.Xd() ^ (-1194)), (short) (C1633zX.Xd() ^ (-5909))), true));
                }
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
