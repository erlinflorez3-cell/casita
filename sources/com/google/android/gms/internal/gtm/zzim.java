package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
final class zzim implements zzij {
    final /* synthetic */ zzin zza;
    private final Handler zzb;

    /* synthetic */ zzim(zzin zzinVar, zzil zzilVar) throws Throwable {
        this.zza = zzinVar;
        Context context = zzinVar.zzc;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (FB.Xd() ^ 18965))).getMethod(Wg.vd("A>L$?FJ'QPPDX", (short) (OY.Xd() ^ 7188)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzb = new zzgc((Looper) method.invoke(context, objArr), new zzik(this));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final Message zzd() {
        return this.zzb.obtainMessage(1, zzin.zza);
    }

    @Override // com.google.android.gms.internal.gtm.zzij
    public final void zza() {
        this.zzb.removeMessages(1, zzin.zza);
    }

    @Override // com.google.android.gms.internal.gtm.zzij
    public final void zzb() {
        this.zzb.removeMessages(1, zzin.zza);
        this.zzb.sendMessage(zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzij
    public final void zzc(long j2) {
        this.zzb.removeMessages(1, zzin.zza);
        this.zzb.sendMessageDelayed(zzd(), 1800000L);
    }
}
