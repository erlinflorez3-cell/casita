package com.google.android.gms.internal.gtm;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzcx implements Runnable {
    final /* synthetic */ zzcy zza;

    zzcx(zzcy zzcyVar) {
        this.zza = zzcyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("s\u007ft\u0002}vp9y|6Suttht", (short) (C1607wl.Xd() ^ 31307), (short) (C1607wl.Xd() ^ 30837))).getDeclaredMethod(C1561oA.ud("\\Yg?RY]:\\[[O[", (short) (OY.Xd() ^ 10656)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                this.zza.zzb.zzd().zzi(this);
                return;
            }
            zzcy zzcyVar = this.zza;
            boolean zZzh = zzcyVar.zzh();
            zzcyVar.zzd = 0L;
            if (zZzh) {
                this.zza.zza();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
