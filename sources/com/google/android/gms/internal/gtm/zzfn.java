package com.google.android.gms.internal.gtm;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.EO;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zzfn implements zzdb {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfp zzb;

    zzfn(zzfp zzfpVar, Runnable runnable) {
        this.zzb = zzfpVar;
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzdb
    public final void zza(Throwable th) throws Throwable {
        Handler handler = this.zzb.zzb;
        Runnable runnable = this.zza;
        short sXd = (short) (C1580rY.Xd() ^ (-21454));
        int[] iArr = new int["Ez#PM\u001bi\u0013\u001a=u6\u001d{]K{\u0017".length()];
        QB qb = new QB("Ez#PM\u001bi\u0013\u001a=u6\u001d{]K{\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {runnable};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("\u001d\u001b\u001e\u001e", (short) (C1580rY.Xd() ^ (-25723))), Class.forName(EO.Od("n\u001eU[osP%qG\u0002Owi\\\u00032I", (short) (OY.Xd() ^ 7611))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
