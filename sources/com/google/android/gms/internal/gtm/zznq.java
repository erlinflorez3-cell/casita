package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zznq implements zzjw {
    private final Context zza;

    public zznq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        try {
            Context context = this.zza;
            Class<?> cls = Class.forName(Xg.qd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (C1580rY.Xd() ^ (-31236)), (short) (C1580rY.Xd() ^ (-6749))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ (-9400));
            short sXd2 = (short) (C1580rY.Xd() ^ (-6161));
            int[] iArr = new int["r\u0007{|sl\\wcw\u0004\u007f2[\bk ".length()];
            QB qb = new QB("r\u0007{|sl\\wcw\u0004\u007f2[\bk ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.zza;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(ZO.xd("~Zn&y\u0013q\u001a\u00024\u001bKVj\\(\u0010Gu\u000e;p\u0013", (short) (OY.Xd() ^ 17644), (short) (OY.Xd() ^ 11048))).getMethod(C1626yg.Ud("'\u001a\u0015`LK3hY@iiL}", (short) (C1580rY.Xd() ^ (-4234)), (short) (C1580rY.Xd() ^ (-5160))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    Class<?> cls2 = Class.forName(Ig.wd("G{o^Dh\u0010\u0002s\\eEfm\u0004\u0018\u0005\u007f\t\u0013`'\u0019\u0013e7}d7\u0019\u000baN", (short) (C1633zX.Xd() ^ (-18347))));
                    Class<?>[] clsArr2 = new Class[2];
                    short sXd3 = (short) (Od.Xd() ^ (-7665));
                    int[] iArr2 = new int["Y#FT\u0001dI>nT{;$\u0011\n]".length()];
                    QB qb2 = new QB("Y#FT\u0001dI>nT{;$\u0011\n]");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(C1561oA.Qd("\u001e\u001b)t#\"\u001d\u0019\u0012\u000f!\u0015\u001a\u0018q\u0016\r\u0015", (short) (C1633zX.Xd() ^ (-6343))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        short sXd4 = (short) (ZN.Xd() ^ 23494);
                        short sXd5 = (short) (ZN.Xd() ^ 10470);
                        int[] iArr3 = new int["&4+:83/y0==D6@G\u0002EC\u0005(:=F=DC,AOCJIW".length()];
                        QB qb3 = new QB("&4+:83/y0==D6@G\u0002EC\u0005(:=F=DC,AOCJIW");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) - sXd5);
                            i4++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                        Class<?>[] clsArr3 = new Class[1];
                        short sXd6 = (short) (C1633zX.Xd() ^ (-9451));
                        int[] iArr4 = new int[" ,!.*#\u001de\u001a%#(\u0018 %]\u001f\u001bZl\u001b\u001a\u0015\u0011\n\u0007\u0019\r\u0012\u0010i\u000e\u0005\r".length()];
                        QB qb4 = new QB(" ,!.*#\u001de\u001a%#(\u0018 %]\u001f\u001bZl\u001b\u001a\u0015\u0011\n\u0007\u0019\r\u0012\u0010i\u000e\u0005\r");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                            i5++;
                        }
                        clsArr3[0] = Class.forName(new String(iArr4, 0, i5));
                        Object[] objArr4 = {applicationInfo};
                        Method method4 = cls3.getMethod(C1561oA.Kd(":9I\u0017GHEC>=QGNN-CEIQ", (short) (C1580rY.Xd() ^ (-18546))), clsArr3);
                        try {
                            method4.setAccessible(true);
                            return new zzrk(((CharSequence) method4.invoke(packageManager, objArr4)).toString());
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new zzrk("");
        }
    }
}
