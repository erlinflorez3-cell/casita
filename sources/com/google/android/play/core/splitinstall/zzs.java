package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.hermes.intl.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public final class zzs {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    private final Context zzc;
    private final String zzd;

    zzs(Context context) throws Throwable {
        this.zzc = context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("Y\u0007\u0011\u001d\u001f]\u001e%\"S_i6UP\f,h(p'>?", (short) (OY.Xd() ^ 26225), (short) (OY.Xd() ^ 23082))).getMethod(C1626yg.Ud("\\C\u0004\u00137X|h\u0007>gm\u001c\u0016", (short) (C1633zX.Xd() ^ (-18101)), (short) (C1633zX.Xd() ^ (-804))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzd = (String) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public zzs(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzf(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : zzh(packageInfo)) {
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final PackageInfo zzg() throws Throwable {
        try {
            Context context = this.zzc;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("@ \"]H\u000ejy\t\u001a\u0011?\u0002\u0007\u0017oLh=9c \b", (short) (FB.Xd() ^ 10110))).getMethod(EO.Od("\u0004Q4n\u0002@bz;\u001c\u0004s/.j\tZ", (short) (OY.Xd() ^ 27457)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String str = this.zzd;
                Class<?> cls = Class.forName(C1561oA.Qd("MYN[WPJ\u0013GRPUEMR\u000bLH\b)9:A6;8\u001f2>052>", (short) (OY.Xd() ^ 8247)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1593ug.zd("VNdP\u001e]Sa[#Ikjbhb", (short) (C1607wl.Xd() ^ 2725), (short) (C1607wl.Xd() ^ 11750)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 128};
                Method method2 = cls.getMethod(C1561oA.od("\u001e\u001b)\u0004\u0014\u0015\u001c\u0011\u0016\u0013u\u001a\u0011\u0019", (short) (C1499aX.Xd() ^ (-10226))), clsArr);
                try {
                    method2.setAccessible(true);
                    return (PackageInfo) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzb.zzb(C1561oA.Kd("Brs$ny'vx~+r|\u0004}t1{\u00024ewz\u0004z\u0002\u0001i~\r\u0001\b\u0007\u0015", (short) (C1580rY.Xd() ^ (-16652))), new Object[0]);
            return null;
        }
    }

    private static final Set zzh(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zzb.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove(Constants.SENSITIVITY_BASE);
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zzb.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zzb.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        zzq zzqVarZza = zzr.zza();
        if (zzqVarZza != null) {
            hashSet.addAll(zzqVarZza.zza());
        }
        return hashSet;
    }

    public final zzk zza(Bundle bundle) throws Throwable {
        if (bundle == null) {
            zzb.zze(Wg.Zd("4VYs>(e;\u0005Z\u0012!: 8{B@V.*.-vQ|`os", (short) (ZN.Xd() ^ 12167), (short) (ZN.Xd() ^ 62)), new Object[0]);
            return null;
        }
        short sXd = (short) (ZN.Xd() ^ 29103);
        int[] iArr = new int["bon0drixvqm8\u0002q{rx~x@\u0007\u0005\u0002\u007f\f\f".length()];
        QB qb = new QB("bon0drixvqm8\u0002q{rx~x@\u0007\u0005\u0002\u007f\f\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        int i3 = bundle.getInt(new String(iArr, 0, i2));
        if (i3 == 0) {
            zzb.zze(Wg.vd("*L}LEUCG5I7v>HOI0l7=o\u0012@764/+\u0015*84\"\"13m", (short) (FB.Xd() ^ 8500)), new Object[0]);
            return null;
        }
        try {
            Context context = this.zzc;
            Class<?> cls = Class.forName(Qg.kd("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (Od.Xd() ^ (-11135)), (short) (Od.Xd() ^ (-8919))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (Od.Xd() ^ (-29004));
            short sXd3 = (short) (Od.Xd() ^ (-27401));
            int[] iArr2 = new int["-*8\u0015'4/40 !.".length()];
            QB qb2 = new QB("-*8\u0015'4/40 !.");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2) + sXd3);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                zzk zzkVarZza = zzbg.zza(((Resources) method.invoke(context, objArr)).getXml(i3), new zzi());
                if (zzkVarZza == null) {
                    zzb.zze(C1561oA.ud("\u0003 ,c0Z*\u001a**\u001bT \u0014 \u0018%\u0010\u0015\u0012\u001fJ\u0017\u000e\u001c\b\n\u0006\u0018\u0004O", (short) (C1607wl.Xd() ^ 10258)), new Object[0]);
                }
                return zzkVarZza;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Resources.NotFoundException unused) {
            com.google.android.play.core.splitinstall.internal.zzu zzuVar = zzb;
            Object[] objArr2 = new Object[0];
            short sXd4 = (short) (ZN.Xd() ^ 3764);
            int[] iArr3 = new int["w\f\u001b\u0018\u0017\u0015\u0007\nM&\u0019%\u0012J\u0018\u000e$\u001e-\u001a\u0019\u0018'T+$4\"\u001e\u001c0\u001ee+7.51j9m4H:=?y".length()];
            QB qb3 = new QB("w\f\u001b\u0018\u0017\u0015\u0007\nM&\u0019%\u0012J\u0018\u000e$\u001e-\u001a\u0019\u0018'T+$4\"\u001e\u001c0\u001ee+7.51j9m4H:=?y");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i5));
                i5++;
            }
            zzuVar.zze(new String(iArr3, 0, i5), objArr2);
            return null;
        }
    }

    public final Set zzc() throws Throwable {
        PackageInfo packageInfoZzg = zzg();
        return (packageInfoZzg == null || packageInfoZzg.applicationInfo == null) ? new HashSet() : zzf(packageInfoZzg);
    }

    public final Set zzd() throws Throwable {
        PackageInfo packageInfoZzg = zzg();
        HashSet hashSet = null;
        if (packageInfoZzg != null && packageInfoZzg.applicationInfo != null) {
            zzk zzkVarZza = zza(packageInfoZzg.applicationInfo.metaData);
            if (zzkVarZza == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setZzh = zzh(packageInfoZzg);
            setZzh.add("");
            Set setZzf = zzf(packageInfoZzg);
            setZzf.add("");
            for (Map.Entry entry : zzkVarZza.zza(setZzf).entrySet()) {
                if (setZzh.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
