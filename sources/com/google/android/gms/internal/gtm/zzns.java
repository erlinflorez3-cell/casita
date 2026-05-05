package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzns implements zzjw {
    private final Context zza;

    public zzns(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        try {
            Context context = this.zza;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("OU\u001b`pJ\u0003:Fc\u0016\u0010 SZ~\b+P5m_J", (short) (OY.Xd() ^ 22796), (short) (OY.Xd() ^ 15786))).getMethod(Ig.wd("\u000b2o~xV.\u0004StVp/0\u001e}B", (short) (C1499aX.Xd() ^ (-16839))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.zza;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(EO.Od("#]G/nF_*;\u0005\u0004i*?;T\u000fG\u007f\u0010<xT", (short) (C1499aX.Xd() ^ (-26643)))).getMethod(C1561oA.Qd("85C\u001e./6+0-\u0015'2)", (short) (ZN.Xd() ^ 7172)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    Class<?> cls = Class.forName(C1593ug.zd("\u001a(\u001f.,'#m$118*4;u97x\u001c.1:187 5C7>=K", (short) (FB.Xd() ^ 18391), (short) (FB.Xd() ^ 32364)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.od("\u0007|\u0011zF\u0004w\u0004{Ae\u0006\u0003x|t", (short) (Od.Xd() ^ (-18824))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls.getMethod(C1561oA.Kd("cbrOadmdkjOunx", (short) (ZN.Xd() ^ 26554)), clsArr);
                    try {
                        method3.setAccessible(true);
                        return new zzrk(((PackageInfo) method3.invoke(packageManager, objArr3)).versionName);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Context context3 = this.zza;
            short sXd = (short) (C1633zX.Xd() ^ (-30105));
            short sXd2 = (short) (C1633zX.Xd() ^ (-7084));
            int[] iArr = new int["\u0012]q\u001d8IjQ%He\u0011 @d;vZw\u001b*Tv".length()];
            QB qb = new QB("\u0012]q\u001d8IjQ%He\u0011 @d;vZw\u001b*Tv");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Xd("LK[8JMVMTS=Q^W", (short) (C1633zX.Xd() ^ (-28007))), new Class[0]);
            try {
                method4.setAccessible(true);
                zzho.zza(Wg.vd("\f\u001c\u001d$\u0019\u001e\u001bT2$/&_", (short) (C1607wl.Xd() ^ 28306)) + ((String) method4.invoke(context3, objArr4)) + Qg.kd("Z((,V\u001c$)!\u0016^O", (short) (FB.Xd() ^ 23733), (short) (FB.Xd() ^ 11052)) + e5.toString());
                return zzrd.zze;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }
}
