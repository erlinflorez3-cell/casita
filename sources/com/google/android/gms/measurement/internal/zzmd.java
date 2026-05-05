package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zzmd implements Runnable {
    private final /* synthetic */ zzlk zza;
    private final /* synthetic */ zzls zzb;

    zzmd(zzls zzlsVar, zzlk zzlkVar) {
        this.zza = zzlkVar;
        this.zzb = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzgb zzgbVar = this.zzb.zzb;
        if (zzgbVar == null) {
            zzgq zzgqVarZzg = this.zzb.zzj().zzg();
            short sXd = (short) (FB.Xd() ^ 27074);
            int[] iArr = new int["C_hlff#xt&zmwn+o\u0003\u0001\u0002u\u007f\u00073\bx\t|}\b:\u0010\f=\u0012\u0005\u0013\u0018\f\u0007\n".length()];
            QB qb = new QB("C_hlff#xt&zmwn+o\u0003\u0001\u0002u\u007f\u00073\bx\t|}\b:\u0010\f=\u0012\u0005\u0013\u0018\f\u0007\n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            zzgqVarZzg.zza(new String(iArr, 0, i2));
            return;
        }
        try {
            zzlk zzlkVar = this.zza;
            if (zzlkVar == null) {
                Context contextZza = this.zzb.zza();
                Object[] objArr = new Object[0];
                Method method = Class.forName(Xg.qd("\u001b) /-($n%229+5<v\r::A3GD", (short) (C1633zX.Xd() ^ (-22423)), (short) (C1633zX.Xd() ^ (-15658)))).getMethod(Jg.Wd("9\u001c\u0017wd[oIL>\u0014\u001b\u0013\u007f", (short) (C1580rY.Xd() ^ (-6101)), (short) (C1580rY.Xd() ^ (-4857))), new Class[0]);
                try {
                    method.setAccessible(true);
                    zzgbVar.zza(0L, (String) null, (String) null, (String) method.invoke(contextZza, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                long j2 = zzlkVar.zzc;
                String str = this.zza.zza;
                String str2 = this.zza.zzb;
                Context contextZza2 = this.zzb.zza();
                short sXd2 = (short) (C1633zX.Xd() ^ (-31134));
                short sXd3 = (short) (C1633zX.Xd() ^ (-13055));
                int[] iArr2 = new int["F\u0003S?mMNQ]u\n*h\u0004\u001d<[wk\u00018}0".length()];
                QB qb2 = new QB("F\u0003S?mMNQ]u\n*h\u0004\u001d<[wk\u00018}0");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = new Object[0];
                Method method2 = cls.getMethod(C1626yg.Ud("3H\"YLY'\u007fu7_\u0010\u00112", (short) (FB.Xd() ^ 21520), (short) (FB.Xd() ^ 30653)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    zzgbVar.zza(j2, str, str2, (String) method2.invoke(contextZza2, objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            this.zzb.zzar();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza(Ig.wd("j:2\u0013\u0001$?|,\u0011bv,$[E}\u0015MtB\tZ.\u001eEV%H(\u001d<\u0001wa%wc4WS'Ie", (short) (C1633zX.Xd() ^ (-28752))), e4);
        }
    }
}
