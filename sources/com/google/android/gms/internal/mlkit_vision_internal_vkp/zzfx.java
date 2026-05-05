package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfx {
    public static com.google.android.libraries.vision.visionkit.pipeline.zzcg zza(String str, float f2, int i2, String str2) {
        zzhl zzhlVarZza;
        zzhl zzhlVarZza2 = zzhm.zza();
        zzhlVarZza2.zzc(str);
        if (str2.isEmpty()) {
            zzhlVarZza = null;
        } else {
            zzhlVarZza = zzhm.zza();
            zzhlVarZza.zzc(str2);
        }
        return zzd(zzhlVarZza2, f2, i2, zzhlVarZza);
    }

    public static com.google.android.libraries.vision.visionkit.pipeline.zzcg zzb(zzhp zzhpVar, float f2, int i2, String str, Context context) throws IOException {
        zzhl zzhlVarZza;
        zzhl zzhlVarZza2 = zzhm.zza();
        zzhlVarZza2.zzb(zzhpVar);
        if (str.isEmpty()) {
            zzhlVarZza = null;
        } else {
            zzhlVarZza = zzhm.zza();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u000b\u0019\u0010\u001f\u0015\u0010\fV\u0005\u0012\u0012\u0019\u0003\r\u0014N|**1\u001b/,", (short) (OY.Xd() ^ 21764))).getMethod(C1561oA.Yd("\u0006\u0005\u0015b\u0016\u0017\n\u001a\u001a", (short) (C1607wl.Xd() ^ 15085)), new Class[0]);
            try {
                method.setAccessible(true);
                zzhlVarZza.zza(zzbdd.zzp(((AssetManager) method.invoke(context, objArr)).open(str)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return zzd(zzhlVarZza2, f2, i2, zzhlVarZza);
    }

    public static com.google.android.libraries.vision.visionkit.pipeline.zzcg zzc(Context context, float f2, int i2) throws IOException {
        zzhl zzhlVarZza = zzhm.zza();
        short sXd = (short) (C1607wl.Xd() ^ 14164);
        short sXd2 = (short) (C1607wl.Xd() ^ 24050);
        int[] iArr = new int["s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d".length()];
        QB qb = new QB("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("UB\u001a52\u007f\u001bwA", (short) (FB.Xd() ^ 28829), (short) (FB.Xd() ^ 17646)), new Class[0]);
        try {
            method.setAccessible(true);
            zzhlVarZza.zza(zzbdd.zzp(((AssetManager) method.invoke(context, objArr)).open(ZO.xd("[Zkcg( U0~~\tuw#\u0015#f\u0013L@\r>gc|FAhF81W.8&g\bZ\u001f0\u00065DX5k}L\u000eH1LX=UFn<\nMf", (short) (C1633zX.Xd() ^ (-26079)), (short) (C1633zX.Xd() ^ (-569))))));
            return zzd(zzhlVarZza, f2, i2, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static com.google.android.libraries.vision.visionkit.pipeline.zzcg zzd(zzhl zzhlVar, float f2, int i2, zzhl zzhlVar2) {
        zziv zzivVarZza = zziy.zza();
        zzivVarZza.zze(zzhlVar);
        zzivVarZza.zzd(i2);
        if (f2 >= 0.0f) {
            zzivVarZza.zzg(f2);
        }
        if (zzhlVar2 != null) {
            zzivVarZza.zzh(zzhlVar2);
        }
        com.google.android.libraries.vision.visionkit.pipeline.zzcf zzcfVarZzc = com.google.android.libraries.vision.visionkit.pipeline.zzcg.zzc();
        com.google.android.libraries.vision.visionkit.pipeline.zzdr zzdrVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzdu.zza();
        zzdrVarZza.zza(zzivVarZza);
        zzdrVarZza.zzf(true);
        zzcfVarZzc.zzc(zzdrVarZza);
        com.google.android.libraries.vision.visionkit.pipeline.zzfh zzfhVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzfi.zza();
        zzfhVarZza.zzb(2);
        zzcfVarZzc.zzd(zzfhVarZza);
        com.google.android.libraries.vision.visionkit.pipeline.zzi zziVarZza = com.google.android.libraries.vision.visionkit.pipeline.zzj.zza();
        zziVarZza.zza(2);
        zzcfVarZzc.zzb(zziVarZza);
        return (com.google.android.libraries.vision.visionkit.pipeline.zzcg) zzcfVarZzc.zzv();
    }
}
