package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zznr implements zzjw {
    private final Context zza;

    public zznr(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        try {
            Context context = this.zza;
            short sXd = (short) (OY.Xd() ^ 561);
            short sXd2 = (short) (OY.Xd() ^ 30056);
            int[] iArr = new int["r%$/\u0015\u0014\b~->&)#QP\u0017%6>A[sh".length()];
            QB qb = new QB("r%$/\u0015\u0014\b~->&)#QP\u0017%6>A[sh");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.Xd("^]mJ\\_h_feNcqelky", (short) (OY.Xd() ^ 32227)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.zza;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("\u0007\u0015\b\u0017\u0019\u0014\fV\u0011\u001e\u001a!\u0017!$^x&\")\u001f3,", (short) (Od.Xd() ^ (-25880)))).getMethod(Qg.kd("PM[6FGNCHE-?JA", (short) (Od.Xd() ^ (-14883)), (short) (Od.Xd() ^ (-10534))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    short sXd3 = (short) (C1499aX.Xd() ^ (-23050));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-32355));
                    int[] iArr2 = new int["(4)62+%m\"-+0 (-e'#b\u0004\u0014\u0015\u001c\u0011\u0016\u0013y\r\u0019\u000b\u0010\r\u0019".length()];
                    QB qb2 = new QB("(4)62+%m\"-+0 (-e'#b\u0004\u0014\u0015\u001c\u0011\u0016\u0013y\r\u0019\u000b\u0010\r\u0019");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                        i3++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr = new Class[2];
                    short sXd5 = (short) (ZN.Xd() ^ 10465);
                    int[] iArr3 = new int["-#7!l*\u001e*\"g\f,)\u001f#\u001b".length()];
                    QB qb3 = new QB("-#7!l*\u001e*\"g\f,)\u001f#\u001b");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd5 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    try {
                        cls2.getMethod(C1561oA.yd("ifxSghshqnUyt|", (short) (ZN.Xd() ^ 13953)), clsArr).setAccessible(true);
                        return new zzrb(Double.valueOf(((PackageInfo) r1.invoke(packageManager, objArr3)).versionCode));
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
            Object[] objArr4 = new Object[0];
            Method method3 = Class.forName(C1561oA.Yd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (C1633zX.Xd() ^ (-14441)))).getMethod(Xg.qd("98H%7:C:A@*>KD", (short) (Od.Xd() ^ (-16997)), (short) (Od.Xd() ^ (-6339))), new Class[0]);
            try {
                method3.setAccessible(true);
                zzho.zza(Jg.Wd("-\b)zd\u0014Qt\u0007C/p^", (short) (C1580rY.Xd() ^ (-22475)), (short) (C1580rY.Xd() ^ (-13461))) + ((String) method3.invoke(context3, objArr4)) + ZO.xd("\u001d)\u0014\u0012H)o\b\u00165}\u007f", (short) (Od.Xd() ^ (-12899)), (short) (Od.Xd() ^ (-24922))) + e5.getMessage());
                return zzrd.zze;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }
}
