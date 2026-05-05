package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgo {
    public static final /* synthetic */ int zza = 0;
    private static final zzbhd zzb;

    static {
        int i2 = zzbgb.zza;
        zzb = new zzbhf();
    }

    public static void zzA(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzB(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzD(i2, list, z2);
    }

    public static void zzC(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzF(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzK(i2, list, z2);
    }

    public static void zzE(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzM(i2, list, z2);
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int iZzG;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(zzbemVar.zze(i2));
                i2++;
            }
        } else {
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzG;
    }

    static int zzb(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbdq.zzF(i2 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbdq.zzF(i2 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzG;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(zzbemVar.zze(i2));
                i2++;
            }
        } else {
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzG;
    }

    static int zzg(List list) {
        int iZzG;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(zzbfgVar.zze(i2));
                i2++;
            }
        } else {
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return iZzG;
    }

    static int zzh(int i2, Object obj, zzbgm zzbgmVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzbfc)) {
            return zzbdq.zzF(i3) + zzbdq.zzD((zzbfs) obj, zzbgmVar);
        }
        int iZzF = zzbdq.zzF(i3);
        int iZza = ((zzbfc) obj).zza();
        return iZzF + zzbdq.zzF(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzF;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            iZzF = 0;
            while (i2 < size) {
                int iZze = zzbemVar.zze(i2);
                iZzF += zzbdq.zzF((iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
        } else {
            iZzF = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iZzF += zzbdq.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
        }
        return iZzF;
    }

    static int zzj(List list) {
        int iZzG;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            iZzG = 0;
            while (i2 < size) {
                long jZze = zzbfgVar.zze(i2);
                iZzG += zzbdq.zzG((jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
        } else {
            iZzG = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iZzG += zzbdq.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
        }
        return iZzG;
    }

    static int zzk(List list) {
        int iZzF;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbem) {
            zzbem zzbemVar = (zzbem) list;
            iZzF = 0;
            while (i2 < size) {
                iZzF += zzbdq.zzF(zzbemVar.zze(i2));
                i2++;
            }
        } else {
            iZzF = 0;
            while (i2 < size) {
                iZzF += zzbdq.zzF(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzF;
    }

    static int zzl(List list) {
        int iZzG;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(zzbfgVar.zze(i2));
                i2++;
            }
        } else {
            iZzG = 0;
            while (i2 < size) {
                iZzG += zzbdq.zzG(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return iZzG;
    }

    public static zzbhd zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i2, List list, zzbep zzbepVar, Object obj2, zzbhd zzbhdVar) {
        if (zzbepVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                if (zzbepVar.zza(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    obj2 = zzo(obj, i2, iIntValue, obj2, zzbhdVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzbepVar.zza(iIntValue2)) {
                    obj2 = zzo(obj, i2, iIntValue2, obj2, zzbhdVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzo(Object obj, int i2, int i3, Object obj2, zzbhd zzbhdVar) {
        if (obj2 == null) {
            obj2 = zzbhdVar.zza(obj);
        }
        zzbhdVar.zzh(obj2, i2, i3);
        return obj2;
    }

    static void zzp(zzbdw zzbdwVar, Object obj, Object obj2) {
        zzbea zzbeaVar = ((zzbeh) obj2).zzb;
        if (zzbeaVar.zza.isEmpty()) {
            return;
        }
        ((zzbeh) obj).zzn().zzi(zzbeaVar);
    }

    static void zzq(zzbhd zzbhdVar, Object obj, Object obj2) {
        zzbel zzbelVar = (zzbel) obj;
        zzbhe zzbheVarZze = zzbelVar.zzc;
        zzbhe zzbheVar = ((zzbel) obj2).zzc;
        if (!zzbhe.zzc().equals(zzbheVar)) {
            if (zzbhe.zzc().equals(zzbheVarZze)) {
                zzbheVarZze = zzbhe.zze(zzbheVarZze, zzbheVar);
            } else {
                zzbheVarZze.zzd(zzbheVar);
            }
        }
        zzbelVar.zzc = zzbheVarZze;
    }

    public static void zzr(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzc(i2, list, z2);
    }

    public static void zzs(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzg(i2, list, z2);
    }

    public static void zzt(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzj(i2, list, z2);
    }

    public static void zzu(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzl(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzn(i2, list, z2);
    }

    public static void zzw(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzp(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzs(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzu(i2, list, z2);
    }

    public static void zzz(int i2, List list, zzbhs zzbhsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbhsVar.zzz(i2, list, z2);
    }
}
