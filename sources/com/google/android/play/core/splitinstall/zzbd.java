package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbd implements zzcb {
    private final zzcb zza;

    public zzbd(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() throws Throwable {
        Context contextZzb = ((zzad) this.zza).zzb();
        Class<?> cls = Class.forName(hg.Vd("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (C1499aX.Xd() ^ (-28133)), (short) (C1499aX.Xd() ^ (-14403))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 29070);
        int[] iArr = new int["liwRbcj_daI[f]".length()];
        QB qb = new QB("liwRbcj_daI[f]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return new zzbc(contextZzb, (String) method.invoke(contextZzb, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
