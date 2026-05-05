package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzht implements DialogInterface.OnClickListener {
    final /* synthetic */ zzhu zza;

    zzht(zzhu zzhuVar) {
        this.zza = zzhuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) throws Throwable {
        Context context = this.zza.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\\h]jf_Y\"Va_dT\\a\u001a.YW\\L^Y", (short) (OY.Xd() ^ 9740))).getMethod(C1561oA.Kd("\u001e\u001d-\n\u001c\u001f(\u001f&%\u000f#0)", (short) (ZN.Xd() ^ 28813)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            Context context2 = this.zza.zza;
            Class<?> cls = Class.forName(Wg.Zd("\u007f\u001ea>I.V\u00102,yMNDu\u001c\u001f;\u0007XZ]\u0007", (short) (Od.Xd() ^ (-9062)), (short) (Od.Xd() ^ (-28749))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-16480));
            int[] iArr = new int["\u0003\u0002\u0012n\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e".length()];
            QB qb = new QB("\u0003\u0002\u0012n\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                Class<?> cls2 = Class.forName(Wg.vd("eqfswpj3_jhmemr+d` AYZaVSP7J^PUR\u0017", (short) (ZN.Xd() ^ 30100)));
                Class<?>[] clsArr2 = new Class[1];
                short sXd2 = (short) (C1580rY.Xd() ^ (-12595));
                short sXd3 = (short) (C1580rY.Xd() ^ (-11017));
                int[] iArr2 = new int["\t~\u0013|H\u0006y\u0006}Cg\b\u0005z~v".length()];
                QB qb2 = new QB("\t~\u0013|H\u0006y\u0006}Cg\b\u0005z~v");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                    i4++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
                Object[] objArr3 = {str};
                short sXd4 = (short) (ZN.Xd() ^ 4629);
                short sXd5 = (short) (ZN.Xd() ^ 12329);
                int[] iArr3 = new int["1.<\u0013':2&*\n.3#+0\u0001)+\b\u0018\u0019 \u0015\u001a\u0017".length()];
                QB qb3 = new QB("1.<\u0013':2&*\n.3#+0\u0001)+\b\u0018\u0019 \u0015\u001a\u0017");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(sXd4 + i5 + xuXd3.CK(iKK3) + sXd5);
                    i5++;
                }
                Method method3 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
                try {
                    method3.setAccessible(true);
                    Intent intent = (Intent) method3.invoke(packageManager, objArr3);
                    if (intent == null) {
                        zzho.zze(Jg.Wd("6z8I;\rr,.boV$\u001ephP\u001aEOU\u007f\u00069q=rr[1nUR\u000e!c\u0013\u0005\u0005UJ\u001c/", (short) (OY.Xd() ^ 3763), (short) (OY.Xd() ^ 32410)).concat(String.valueOf(str)));
                        return;
                    }
                    zzho.zzc(C1561oA.ud("a\u0006\r\u0005\u007fx2\u0006xt.ym\u0001xlp'ghxlxjtx\u001eckm\u001aiYZaV[X\u0012_Q\\S'\f", (short) (ZN.Xd() ^ 17823)).concat(String.valueOf(str)));
                    Context context3 = this.zza.zza;
                    Class<?> cls3 = Class.forName(C1561oA.yd("0<1>B;5}:ECH@HM\u0006\"MKPHZU", (short) (FB.Xd() ^ 31376)));
                    Class<?>[] clsArr3 = new Class[1];
                    short sXd6 = (short) (C1607wl.Xd() ^ 26431);
                    int[] iArr4 = new int["SaXge`\\']jjqcmt/Kqxjt{".length()];
                    QB qb4 = new QB("SaXge`\\']jjqcmt/Kqxjt{");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd6 + sXd6) + sXd6) + i6));
                        i6++;
                    }
                    clsArr3[0] = Class.forName(new String(iArr4, 0, i6));
                    Object[] objArr4 = {intent};
                    short sXd7 = (short) (C1633zX.Xd() ^ (-17023));
                    short sXd8 = (short) (C1633zX.Xd() ^ (-27396));
                    int[] iArr5 = new int["57%7:\b+=3A5AG".length()];
                    QB qb5 = new QB("57%7:\b+=3A5AG");
                    int i7 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i7] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i7)) + sXd8);
                        i7++;
                    }
                    Method method4 = cls3.getMethod(new String(iArr5, 0, i7), clsArr3);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(context3, objArr4);
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
    }
}
