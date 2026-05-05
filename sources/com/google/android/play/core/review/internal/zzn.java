package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.ServiceConnection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
final class zzn extends zzj {
    final /* synthetic */ zzt zza;

    zzn(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc(C1626yg.Ud("\u001bxo\u007f\tV.\r\u001a\u0015t+/\u0019\u0002\u0003\"\u0001X3\u000es\u001f\u000ez=8?{rc\u0005|CJw<<YVb?\u001e\u007faKF{S{\u001b\u0013", (short) (C1580rY.Xd() ^ (-952)), (short) (C1580rY.Xd() ^ (-24394))), new Object[0]);
                return;
            }
            zzt zztVar = this.zza;
            if (zztVar.zzn != null) {
                zztVar.zzc.zzc(Ig.wd("+|\\>X\u0011rO ki\u007f$\nq\u0015CEl\u007f", (short) (C1607wl.Xd() ^ 17128)), new Object[0]);
                zzt zztVar2 = this.zza;
                Context context = zztVar2.zzb;
                ServiceConnection serviceConnection = zztVar2.zzm;
                short sXd = (short) (C1499aX.Xd() ^ (-2552));
                int[] iArr = new int["Z\u0011tk1w\u0017pde^Fahz\u0017X\u000b2@o+\u0011".length()];
                QB qb = new QB("Z\u0011tk1w\u0017pde^Fahz\u0017X\u000b2@o+\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1580rY.Xd() ^ (-27701));
                int[] iArr2 = new int["\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012Jn\u007f\f\u000f\u0001yzW\u0003\u0001\u007fur\u0003v{y".length()];
                QB qb2 = new QB("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012Jn\u007f\f\u000f\u0001yzW\u0003\u0001\u007fur\u0003v{y");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {serviceConnection};
                Method method = cls.getMethod(C1593ug.zd("\n\u0004x\u0001\u0007}m\u0001\u000f\u0014\b\u0003\u0006", (short) (FB.Xd() ^ 9823), (short) (FB.Xd() ^ 9678)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    this.zza.zzh = false;
                    this.zza.zzn = null;
                    this.zza.zzm = null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.zza.zzw();
        }
    }
}
