package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.L;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class LogUtils {
    public static zzfi.zza zza(Context context) throws Throwable {
        zzfi.zza.C0183zza c0183zzaZza = zzfi.zza.zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1633zX.Xd() ^ (-18111)))).getMethod(C1561oA.Kd("\u0016\u0015%\u0002\u0014\u0017 \u0017\u001e\u001d\u0007\u001b(!", (short) (FB.Xd() ^ 14682)), new Class[0]);
        try {
            method.setAccessible(true);
            zzfi.zza.C0183zza c0183zzaZza2 = c0183zzaZza.zza((String) method.invoke(context, objArr));
            String strZzb = zzb(context);
            if (strZzb != null) {
                c0183zzaZza2.zzb(strZzb);
            }
            return (zzfi.zza) ((zzjb) c0183zzaZza2.zzf());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static zzfi.zzo zza(long j2, int i2, String str, String str2, List<zzfi.zzn> list, zzs zzsVar) {
        zzfi.zzi.zza zzaVarZza = zzfi.zzi.zza();
        zzfi.zzf.zzb zzbVarZzb = zzfi.zzf.zza().zza(str2).zza(j2).zzb(i2);
        zzbVarZzb.zza(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((zzfi.zzf) ((zzjb) zzbVarZzb.zzf()));
        return (zzfi.zzo) ((zzjb) zzfi.zzo.zza().zza((zzfi.zzi) ((zzjb) zzaVarZza.zza(arrayList).zza((zzfi.zzj) ((zzjb) zzfi.zzj.zza().zzb(zzsVar.zzb).zza(zzsVar.zza).zzc(zzsVar.zzc).zzd(zzsVar.zzd).zzf())).zzf())).zzf());
    }

    private static String zzb(Context context) throws Throwable {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(context);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("eA\nf\u001aZ0\\L#xIt`AA\r\bYJuK&", (short) (OY.Xd() ^ 29152), (short) (OY.Xd() ^ 16812))).getMethod(C1561oA.Xd("@?O,>AJAHG1ERK", (short) (C1633zX.Xd() ^ (-24828))), new Class[0]);
            try {
                method.setAccessible(true);
                return packageManagerWrapperPackageManager.getPackageInfo((String) method.invoke(context, objArr), 0).versionName;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException e3) {
            short sXd = (short) (FB.Xd() ^ 6535);
            int[] iArr = new int[">J?LPIC\f8CAF>FK\u00040[Y^Vhc".length()];
            QB qb = new QB(">J?LPIC\f8CAF>FK\u00040[Y^Vhc");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u0019\u0016$~\u000f\u0010\u0017\f\u0011\u000eu\b\u0013\n", (short) (FB.Xd() ^ 5729), (short) (FB.Xd() ^ 10452)), new Class[0]);
            try {
                method2.setAccessible(true);
                L.e(e3, hg.Vd("5M??H@yMGv<>B7q41;:6:2i9)*1&+(a*.%-\\\"*,X\\*", (short) (OY.Xd() ^ 13147), (short) (OY.Xd() ^ 29713)), (String) method2.invoke(context, objArr2));
                return null;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }
}
