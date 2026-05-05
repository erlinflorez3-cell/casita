package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zzaf implements zzcb {
    private final zzcb zza;

    public zzaf(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() throws Throwable {
        PackageManager packageManager;
        Object[] objArr;
        Method method;
        Context contextZzb = ((zzad) this.zza).zzb();
        try {
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1626yg.Ud("0m|Ihb|\u0004 #\u0018}SW\"q_*%\u0006[Vn", (short) (FB.Xd() ^ 32261), (short) (FB.Xd() ^ 1633))).getMethod(Ig.wd("Kqp/5bP4s\u000fr/q\\p\u0012B", (short) (ZN.Xd() ^ 28108)), new Class[0]);
            try {
                method2.setAccessible(true);
                packageManager = (PackageManager) method2.invoke(contextZzb, objArr2);
                objArr = new Object[0];
                method = Class.forName(EO.Od("K\u0011hSGu\t\u000bbodTs~\u00155~I`b\u0016\u0002\u0018", (short) (Od.Xd() ^ (-15054)))).getMethod(C1561oA.Qd("\u0013\u0010\u001ex\t\n\u0011\u0006\u000b\bo\u0002\r\u0004", (short) (FB.Xd() ^ 3175)), new Class[0]);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(contextZzb, objArr);
            Class<?> cls = Class.forName(C1593ug.zd("6D;JHC?\n@MMTFPW\u0012US\u00158JMVMTS<Q_SZYg", (short) (ZN.Xd() ^ 26119), (short) (ZN.Xd() ^ 15215)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.od("$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012", (short) (C1499aX.Xd() ^ (-11417))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr3 = {str, 128};
            Method method3 = cls.getMethod(C1561oA.Kd("sr\u0003P\u0001\u0002~|wv\u000b\u0001\b\bc\n\u0003\r", (short) (FB.Xd() ^ 17795)), clsArr);
            try {
                method3.setAccessible(true);
                Bundle bundle = ((ApplicationInfo) method3.invoke(packageManager, objArr3)).metaData;
                if (bundle != null) {
                    short sXd = (short) (Od.Xd() ^ (-18391));
                    short sXd2 = (short) (Od.Xd() ^ (-7904));
                    int[] iArr = new int["\u00173=!IRMU\u0002hr\u001ev\u00061\f2".length()];
                    QB qb = new QB("\u00173=!IRMU\u0002hr\u001ev\u00061\f2");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    String string = bundle.getString(new String(iArr, 0, i2));
                    if (string != null) {
                        Class<?> cls2 = Class.forName(C1561oA.Xd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (Od.Xd() ^ (-24757))));
                        Class<?>[] clsArr2 = new Class[1];
                        short sXd3 = (short) (C1499aX.Xd() ^ (-22667));
                        int[] iArr2 = new int["QI[G\u0011PBPV\u001e@b]UWQ".length()];
                        QB qb2 = new QB("QI[G\u0011PBPV\u001e@b]UWQ");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                        Object[] objArr4 = {null};
                        short sXd4 = (short) (ZN.Xd() ^ 25071);
                        short sXd5 = (short) (ZN.Xd() ^ 7131);
                        int[] iArr3 = new int["~{\nY\f\u0007v\u0003}oyRtvn{Kow".length()];
                        QB qb3 = new QB("~{\nY\f\u0007v\u0003}oyRtvn{Kow");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                            i4++;
                        }
                        Method method4 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                        try {
                            method4.setAccessible(true);
                            return new File((File) method4.invoke(contextZzb, objArr4), string);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                }
                return null;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
