package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzw {
    private final Context zza;
    private int zzb;
    private int zzc = 0;

    public zzw(Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.zzb == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                "Failed to find package ".concat(e2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.zzb = packageInfo.versionCode;
            }
        }
        return this.zzb;
    }

    public final synchronized int zzb() {
        Object[] objArr;
        Method method;
        int i2 = this.zzc;
        if (i2 != 0) {
            return i2;
        }
        Context context = this.zza;
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(C1561oA.Kd("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk", (short) (ZN.Xd() ^ 22545))).getMethod(Wg.Zd("\u0006\n\u00195*lt/\u0017UA\u0016\u0003:@~q", (short) (Od.Xd() ^ (-5062)), (short) (Od.Xd() ^ (-15942))), new Class[0]);
        try {
            method2.setAccessible(true);
            PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
            if (Wrappers.packageManager(context).checkPermission(C1561oA.Xd("anm/irslrl6jxo~|ws>tDw\u0002C\u0007|\u000b\u0007\u0004\u000f\u0010\u0007\u000e\u000eNtgqh", (short) (ZN.Xd() ^ 5462)), Wg.vd("T_` \\cf]e])[k`qmJD\u0011IRW", (short) (OY.Xd() ^ 2150))) == -1) {
                Qg.kd("\u0010'5!#\u001f1\u001d", (short) (FB.Xd() ^ 31632), (short) (FB.Xd() ^ 258));
                short sXd = (short) (OY.Xd() ^ 28459);
                short sXd2 = (short) (OY.Xd() ^ 11095);
                int[] iArr = new int[",SRIME~.I=TyL=IL>78Ep=8A@591h79e<-7*053] +-,\u001e\u001b+U%\u0019%\u001f\u001a#\"\u0017\u001c\u001aX".length()];
                QB qb = new QB(",SRIME~.I=TyL=IL>78Ep=8A@591h79e<-7*053] +-,\u001e\u001b+U%\u0019%\u001f\u001a#\"\u0017\u001c\u001aX");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                    i3++;
                }
                new String(iArr, 0, i3);
                return 0;
            }
            try {
                if (!PlatformVersion.isAtLeastO()) {
                    short sXd3 = (short) (ZN.Xd() ^ 24252);
                    int[] iArr2 = new int["U`]\u001dU\\[RVN\u0016HTIVRKE\u000eB\u0010AI\tCGL<DI\u0002%\u0017\u0018\u0019\"\"\u0012\u001e".length()];
                    QB qb2 = new QB("U`]\u001dU\\[RVN\u0016HTIVRKE\u000eB\u0010AI\tCGL<DI\u0002%\u0017\u0018\u0019\"\"\u0012\u001e");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    Intent intent = new Intent(new String(iArr2, 0, i4));
                    short sXd4 = (short) (C1633zX.Xd() ^ (-3909));
                    int[] iArr3 = new int[",98y4=>7=7\u00015C:IG\"\u001eh#*1".length()];
                    QB qb3 = new QB(",98y4=>7=7\u00015C:IG\"\u001eh#*1");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i5));
                        i5++;
                    }
                    intent.setPackage(new String(iArr3, 0, i5));
                    Class<?> cls = Class.forName(C1561oA.Yd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^\" a\u0005\u0017\u001a#\u001a! \t\u001e, '&4", (short) (C1580rY.Xd() ^ (-18770))));
                    Class<?>[] clsArr = new Class[2];
                    short sXd5 = (short) (FB.Xd() ^ 11566);
                    short sXd6 = (short) (FB.Xd() ^ 15353);
                    int[] iArr4 = new int["\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0007-4&07".length()];
                    QB qb4 = new QB("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0007-4&07");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i6)) + sXd6);
                        i6++;
                    }
                    clsArr[0] = Class.forName(new String(iArr4, 0, i6));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {intent, 0};
                    Method method3 = cls.getMethod(Jg.Wd(":rG4(3!{0:\f'\u0002bk\u001e\u0005#\u0019", (short) (OY.Xd() ^ 12858), (short) (OY.Xd() ^ 19378)), clsArr);
                    try {
                        method3.setAccessible(true);
                        List list = (List) method3.invoke(packageManager, objArr3);
                        if (list == null || list.isEmpty()) {
                        }
                        this.zzc = i;
                        return i;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                method.setAccessible(true);
                List list2 = (List) method.invoke(packageManager, objArr);
                if (list2 != null && !list2.isEmpty()) {
                    i = 2;
                    this.zzc = i;
                    return i;
                }
                C1593ug.zd("\u0001\u001a*\u0018\u001c\u001a.\u001c", (short) (C1633zX.Xd() ^ (-23937)), (short) (C1633zX.Xd() ^ (-7460)));
                C1561oA.od("Zt{}us.\u0002{+|n{vr{i#KJD\u001fgjlg_f]ejVh\\a_\u0010_OPWLQN\u0014\u0007LFPOKOG~@>?F", (short) (FB.Xd() ^ CanonMakernoteDirectory.TAG_FILTER_INFO_ARRAY));
                i = true == PlatformVersion.isAtLeastO() ? 2 : 1;
                this.zzc = i;
                return i;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
            Intent intent2 = new Intent(ZO.xd("dW}\\GG\u001a1Ad\u001c4Z7JM{L\u001a1ZDGO\u001fvrK", (short) (C1633zX.Xd() ^ (-23224)), (short) (C1633zX.Xd() ^ (-19183))));
            intent2.setPackage(C1626yg.Ud("\u0004(1%n\u0005u\u000e/_jghDs,^\u0019%{\u0006\u0012", (short) (C1633zX.Xd() ^ (-18849)), (short) (C1633zX.Xd() ^ (-25241))));
            objArr = new Object[]{intent2, 0};
            method = Class.forName(Ig.wd("eG\r\u0001#Hm\\OAD&DEav`ag0~N62\u0002Y\u001d\u0001Y8(\u0004j", (short) (Od.Xd() ^ (-31222)))).getMethod(C1561oA.Qd("il[gm5d`QSQN__<NKLO[IUU", (short) (C1607wl.Xd() ^ ExifDirectoryBase.TAG_EXTRA_SAMPLES)), Class.forName(EO.Od("\u001au;$r):>\"\u001d\u0018\u0002\u001d6&D{\u0019yD\fh", (short) (C1499aX.Xd() ^ (-14908)))), Integer.TYPE);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
