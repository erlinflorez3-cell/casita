package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.work.PeriodicWorkRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfy {
    public static final zziy zza;
    private static final zzkz zzb;

    static {
        zziv zzivVarZza = zziy.zza();
        zzivVarZza.zzb("");
        zza = (zziy) zzivVarZza.zzv();
        zzb = zzkz.zzi("/m/0jbk");
    }

    public static com.google.android.libraries.vision.visionkit.pipeline.zzdr zza(Context context, boolean z2, zzhp zzhpVar, zziy zziyVar, zzbhv zzbhvVar) {
        com.google.android.libraries.vision.visionkit.pipeline.zzdr zzdrVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzdu.zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\u001c>C\\Z*~t\u0005v\u0017!j+M[nnagr\u001f7", (short) (C1499aX.Xd() ^ (-31929)), (short) (C1499aX.Xd() ^ (-29538)))).getMethod(Ig.wd("\u000e^?l\u00071O\u0007B", (short) (C1633zX.Xd() ^ (-26540))), new Class[0]);
        try {
            method.setAccessible(true);
            zzdrVarZza.zzb(zzg(zzi((AssetManager) method.invoke(context, objArr), zzhpVar), zziyVar, z2, zzbhvVar, 0));
            String strZze = zze(context);
            if (strZze != null) {
                zzdrVarZza.zzd(strZze);
                zzdrVarZza.zze(strZze);
            }
            return zzdrVarZza;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static com.google.android.libraries.vision.visionkit.pipeline.zzdr zzb(Context context, boolean z2, zzhp zzhpVar, zziy zziyVar, long j2, zzbhx zzbhxVar) {
        short sXd = (short) (C1580rY.Xd() ^ (-2119));
        int[] iArr = new int["?\u0015\u0019JO\u0007Y#\bC<h\u0005\u001c\u000eh\u001b9\u0011r\"\nc".length()];
        QB qb = new QB("?\u0015\u0019JO\u0007Y#\bC<h\u0005\u001c\u000eh\u001b9\u0011r\"\nc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("NKY%VUFTR", (short) (ZN.Xd() ^ 13884)), new Class[0]);
        try {
            method.setAccessible(true);
            zzbsm zzbsmVarZzi = zzi((AssetManager) method.invoke(context, objArr), zzhpVar);
            String strZze = zze(context);
            com.google.android.libraries.vision.visionkit.pipeline.zzdr zzdrVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzdu.zza();
            com.google.android.libraries.vision.visionkit.pipeline.zzeb zzebVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzec.zza();
            com.google.android.libraries.vision.visionkit.pipeline.zzco zzcoVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzcv.zza();
            com.google.android.libraries.vision.visionkit.pipeline.zzcp zzcpVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzcu.zza();
            zzcpVarZza.zza(C1593ug.zd("\u0003&\u001a\"& \u000b\u001f($#5\u000e2'&20B.<!~,~#6\u001d;G9\u0018B@=GN", (short) (C1633zX.Xd() ^ (-18574)), (short) (C1633zX.Xd() ^ (-998))));
            zzcpVarZza.zzb(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            zzcoVarZza.zza(zzcpVarZza);
            zzebVarZza.zza((com.google.android.libraries.vision.visionkit.pipeline.zzcv) zzcoVarZza.zzv());
            zzdrVarZza.zzh((com.google.android.libraries.vision.visionkit.pipeline.zzec) zzebVarZza.zzv());
            if (strZze != null) {
                zzdrVarZza.zzd(strZze);
                zzdrVarZza.zze(strZze);
            }
            if (zzbhxVar != null) {
                zzdrVarZza.zzc(zzbhxVar);
            }
            int iZzf = zzf(z2);
            zzdrVarZza.zzf(true);
            zzdrVarZza.zzi(zzjy.zzc());
            com.google.android.libraries.vision.visionkit.pipeline.zzbw zzbwVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzby.zza();
            zzbwVarZza.zzc(false);
            zzbwVarZza.zzb(iZzf);
            zzbwVarZza.zzd(0.2f);
            zzbwVarZza.zza(0.0f);
            zzbwVarZza.zze(3);
            zzdrVarZza.zzg(zzbwVarZza);
            zzdrVarZza.zzb(zzg(zzbsmVarZzi, zziyVar, z2, zzbhv.zze(), 0));
            return zzdrVarZza;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static zziy zzc(Context context, zzhp zzhpVar, String str, float f2, int i2) throws IOException {
        zziv zzivVarZza = zziy.zza();
        zzhl zzhlVarZza = zzhm.zza();
        zzhlVarZza.zzb(zzhpVar);
        zzivVarZza.zze(zzhlVarZza);
        zzivVarZza.zzd(i2);
        if (f2 >= 0.0f) {
            zzivVarZza.zzg(f2);
        }
        if (!str.isEmpty()) {
            zzhl zzhlVarZza2 = zzhm.zza();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:", (short) (Od.Xd() ^ (-12067)))).getMethod(C1561oA.Kd("jiyGz{n~~", (short) (C1607wl.Xd() ^ 30637)), new Class[0]);
            try {
                method.setAccessible(true);
                zzhlVarZza2.zza(zzbdd.zzp(((AssetManager) method.invoke(context, objArr)).open(str)));
                zzivVarZza.zzh(zzhlVarZza2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return (zziy) zzivVarZza.zzv();
    }

    public static zziy zzd(zzhp zzhpVar, zzbhv zzbhvVar) {
        zzhl zzhlVarZza = zzhm.zza();
        zzhlVarZza.zzb(zzhpVar);
        zzhm zzhmVar = (zzhm) zzhlVarZza.zzv();
        zziv zzivVarZza = zziy.zza();
        zzivVarZza.zza(zzb);
        zzivVarZza.zzc(zzbhvVar);
        zzivVarZza.zzf(zzhmVar);
        return (zziy) zzivVarZza.zzv();
    }

    public static String zze(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("*c&^\u0018\\\u0004\u0018\n@\f>i?ouE\u001eg\u001aE%L", (short) (Od.Xd() ^ (-20502)), (short) (Od.Xd() ^ (-13994)))).getMethod(C1561oA.Xd("98H\u0018E;=\u001c;>DB\"HR", (short) (Od.Xd() ^ (-21882))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(context, objArr), Wg.vd("(\u001c+d3l", (short) (ZN.Xd() ^ 27628)));
            if (file.mkdirs() || file.exists()) {
                return file.toString();
            }
            Qg.kd("\\tffog!tn\u001e`n`[m]\u0017WXWX^VbPb\\^\u000bNRZLIYSU[\u0001", (short) (C1633zX.Xd() ^ (-6380)), (short) (C1633zX.Xd() ^ (-13579))).concat(file.toString());
            short sXd = (short) (FB.Xd() ^ 7274);
            short sXd2 = (short) (FB.Xd() ^ 6053);
            int[] iArr = new int["\u0003!~\u001c&\u007f\u0012\u0019\u0013\u0010 \u001el\u0018\u0016\r\u000f\f\u0017".length()];
            QB qb = new QB("\u0003!~\u001c&\u007f\u0012\u0019\u0013\u0010 \u001el\u0018\u0016\r\u000f\f\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            new String(iArr, 0, i2);
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int zzf(boolean z2) {
        return z2 ? 5 : 1;
    }

    private static com.google.android.libraries.vision.visionkit.pipeline.zzao zzg(zzbsm zzbsmVar, zziy zziyVar, boolean z2, zzbhv zzbhvVar, int i2) {
        com.google.android.libraries.vision.visionkit.pipeline.zzao zzaoVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzap.zza();
        zzaoVarZza.zzd(true);
        zzbsk zzbskVarZzc = zzbsq.zzc();
        zzbskVarZzc.zzd("MobileSSDTfLiteClient");
        zzbskVarZzc.zza(true);
        zzbskVarZzc.zzc(zzbsmVar);
        zzbskVarZzc.zzb(zzbhvVar);
        zzaoVarZza.zzc((zzbsq) zzbskVarZzc.zzv());
        zzaoVarZza.zzb(zziyVar);
        zzhf zzhfVarZza = zzhg.zza();
        zzhc zzhcVarZza = zzhd.zza();
        zzhcVarZza.zza("/m/0bl9f");
        zzhcVarZza.zzb(0.46f);
        zzhfVarZza.zza(zzhcVarZza);
        zzaoVarZza.zza(zzhfVarZza);
        zzaoVarZza.zzh(!z2);
        zzaoVarZza.zzf(zzf(z2));
        zzaoVarZza.zze(0.6f);
        zzaoVarZza.zzg(0);
        return zzaoVarZza;
    }

    private static zzbdd zzh(AssetManager assetManager, String str, String str2) throws IOException {
        return zzbdd.zzp(assetManager.open("mlkit_odt_localizer/".concat(str2)));
    }

    private static zzbsm zzi(AssetManager assetManager, zzhp zzhpVar) {
        try {
            zzbsn zzbsnVarZzc = zzbso.zzc();
            zzbsnVarZzc.zza(zzhpVar.zza());
            zzbsnVarZzc.zzc(zzhpVar.zzd());
            zzbsnVarZzc.zzb(zzhpVar.zzc());
            zzbso zzbsoVar = (zzbso) zzbsnVarZzc.zzv();
            zzbsl zzbslVarZzc = zzbsm.zzc();
            zzbslVarZzc.zzc(zzbsoVar);
            zzbslVarZzc.zzb(zzh(assetManager, "mlkit_odt_localizer", "mobile_object_localizer_labelmap"));
            zzbslVarZzc.zza(zzh(assetManager, "mlkit_odt_localizer", "mobile_object_localizer_3_1_anchors.pb"));
            return (zzbsm) zzbslVarZzc.zzv();
        } catch (IOException e2) {
            return zzbsm.zzf();
        }
    }
}
