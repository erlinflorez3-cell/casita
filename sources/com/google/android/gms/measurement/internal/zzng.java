package com.google.android.gms.measurement.internal;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1607wl;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzng {
    final /* synthetic */ zznb zza;
    private zznf zzb;

    zzng(zznb zznbVar) {
        this.zza = zznbVar;
    }

    final void zza() {
        this.zza.zzt();
        if (this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        if (this.zza.zze().zza(zzbh.zzcl) && this.zza.zzm().zzau()) {
            this.zza.zzj().zzp().zza("Retrying trigger URI registration in foreground");
            this.zza.zzm().zzas();
        }
    }

    final void zza(long j2) {
        this.zzb = new zznf(this, this.zza.zzb().currentTimeMillis(), j2);
        Handler handler = this.zza.zzc;
        zznf zznfVar = this.zzb;
        Class<?> cls = Class.forName(Wg.vd("q\u007fr\u0002{vn9\b\rD_u\u0004v\u007f\u0006\u0014", (short) (ZN.Xd() ^ 21609)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-14511));
        short sXd2 = (short) (C1499aX.Xd() ^ (-21495));
        int[] iArr = new int["<2F0{9-91v\u001a<43%%.&".length()];
        QB qb = new QB("<2F0{9-91v\u001a<43%%.&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {zznfVar, 2000L};
        Method method = cls.getMethod(hg.Vd("5366\u0005%+\u001f6!\u001f", (short) (C1607wl.Xd() ^ 5736), (short) (C1607wl.Xd() ^ 21281)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
