package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
final class zzv implements zzf {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ Intent zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzx zzd;

    zzv(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = intent;
        this.zzc = context;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() throws Throwable {
        zzx.zzh(this.zzd, this.zza, 5, 0);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i2) throws Throwable {
        zzx.zzh(this.zzd, this.zza, 6, i2);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() throws Throwable {
        Intent intent = this.zzb;
        String strYd = C1561oA.Yd(" \u001f\u0017\u0016\u0017\u0016$\u0018\u0018\u0014\u001c)'&\u0019\u001c,-\u001d &5'5#;+91/3.-A7>>", (short) (OY.Xd() ^ 32413));
        if (!intent.getBooleanExtra(strYd, false)) {
            this.zzb.putExtra(strYd, true);
            Context context = this.zzc;
            Object[] objArr = {this.zzb};
            Method method = Class.forName(Xg.qd("IWN][VR\u001dS``gYcj%;hhoaur", (short) (C1499aX.Xd() ^ (-7602)), (short) (C1499aX.Xd() ^ (-15850)))).getMethod(ZO.xd("\u00063o\u0017]+Kh\u0017\u007f`a4", (short) (ZN.Xd() ^ 32638), (short) (ZN.Xd() ^ 32628)), Class.forName(Jg.Wd("\u0019c\"k/j2;7\u0001H\u0012I\u0014^WA\"r\u001fn\u001c", (short) (C1580rY.Xd() ^ (-19870)), (short) (C1580rY.Xd() ^ (-17533)))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = this.zzd.zza;
        Object[] objArr2 = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 8508);
        short sXd2 = (short) (ZN.Xd() ^ 20163);
        int[] iArr = new int[";t\u0012\b\u000e[W4\u000e[#\u0006;3\n\u0007UY\u000bP.OVH/$\u000e(\u001eCpz[\\\bs\bQ\u0007z\u0010R".length()];
        QB qb = new QB(";t\u0012\b\u000e[W4\u000e[#\u0006;3\n\u0007UY\u000bP.OVH/$\u000e(\u001eCpz[\\\bs\bQ\u0007z\u0010R");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        zzuVar.zzb(new String(iArr, 0, i2), objArr2);
    }
}
