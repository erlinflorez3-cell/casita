package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    static int zza(int i2, Object obj, zzlu<?> zzluVar) {
        return obj instanceof zzkk ? zzjc.zzb(i2, (zzkk) obj) : zzjc.zzc(i2, (zzlc) obj, zzluVar);
    }

    static int zza(int i2, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = size * zzjc.zzi(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzi += zzjc.zzb(list.get(i3));
        }
        return iZzi;
    }

    static int zza(int i2, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzb = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZzb += zzjc.zzb(i2, list.get(i3), zzluVar);
        }
        return iZzb;
    }

    static int zza(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzb(i2, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    public static zzmk<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i2, int i3, UB ub, zzmk<UT, UB> zzmkVar) {
        if (ub == null) {
            ub = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub, i2, i3);
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i2, List<Integer> list, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (zzjxVar.zza(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zza(obj, i2, iIntValue, ub, zzmkVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzjxVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i2, iIntValue2, ub, zzmkVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i2, List<zzik> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list);
    }

    public static void zza(int i2, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list, (zzlu) zzluVar);
    }

    public static void zza(int i2, List<Boolean> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list, z2);
    }

    static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t2, T t3) {
        zzjm<T> zzjmVarZza = zzjiVar.zza(t3);
        if (zzjmVarZza.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t2).zza((zzjm) zzjmVarZza);
    }

    static <T> void zza(zzkv zzkvVar, T t2, T t3, long j2) {
        zzml.zza(t2, j2, zzkvVar.zza(zzml.zze(t2, j2), zzml.zze(t3, j2)));
    }

    static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t2, T t3) {
        zzmkVar.zzc(t2, zzmkVar.zza(zzmkVar.zzd(t2), zzmkVar.zzd(t3)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zzb(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i2) * size;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i3 < size) {
                Object objZza = zzkjVar.zza(i3);
                iZzi += objZza instanceof zzik ? zzjc.zzb((zzik) objZza) : zzjc.zzb((String) objZza);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iZzi += obj instanceof zzik ? zzjc.zzb((zzik) obj) : zzjc.zzb((String) obj);
                i3++;
            }
        }
        return iZzi;
    }

    static int zzb(int i2, List<?> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iZzi += obj instanceof zzkk ? zzjc.zza((zzkk) obj) : zzjc.zza((zzlc) obj, zzluVar);
        }
        return iZzi;
    }

    static int zzb(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjc.zzi(i2));
    }

    static int zzb(List<Integer> list) {
        int iZzd;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzjc.zzd(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzjc.zzd(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzd;
    }

    public static void zzb(int i2, List<String> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list);
    }

    public static void zzb(int i2, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list, (zzlu) zzluVar);
    }

    public static void zzb(int i2, List<Double> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list, z2);
    }

    static int zzc(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzf(i2, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static void zzc(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i2, list, z2);
    }

    static int zzd(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzc(i2, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static void zzd(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i2, list, z2);
    }

    static int zze(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjc.zzi(i2));
    }

    static int zze(List<Integer> list) {
        int iZzf;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzjc.zzf(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzjc.zzf(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzf;
    }

    public static void zze(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i2, list, z2);
    }

    static int zzf(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzjc.zzi(i2));
    }

    static int zzf(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzjc.zzd(zzknVar.zzb(i2));
                i2++;
            }
        } else {
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzjc.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzd;
    }

    public static void zzf(int i2, List<Float> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i2, list, z2);
    }

    static int zzg(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjc.zzi(i2));
    }

    static int zzg(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzh = 0;
            while (i2 < size) {
                iZzh += zzjc.zzh(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            iZzh = 0;
            while (i2 < size) {
                iZzh += zzjc.zzh(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzh;
    }

    public static void zzg(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i2, list, z2);
    }

    static int zzh(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjc.zzi(i2));
    }

    static int zzh(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzjc.zzf(zzknVar.zzb(i2));
                i2++;
            }
        } else {
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzjc.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzf;
    }

    public static void zzh(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i2, list, z2);
    }

    static int zzi(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzjc.zzi(i2));
    }

    static int zzi(List<Integer> list) {
        int iZzj;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzj = 0;
            while (i2 < size) {
                iZzj += zzjc.zzj(zzjwVar.zzb(i2));
                i2++;
            }
        } else {
            iZzj = 0;
            while (i2 < size) {
                iZzj += zzjc.zzj(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzj;
    }

    public static void zzi(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i2, list, z2);
    }

    static int zzj(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjc.zzi(i2));
    }

    static int zzj(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzjc.zzg(zzknVar.zzb(i2));
                i2++;
            }
        } else {
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzjc.zzg(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzg;
    }

    public static void zzj(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i2, list, z2);
    }

    public static void zzk(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzk(i2, list, z2);
    }

    public static void zzl(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzl(i2, list, z2);
    }

    public static void zzm(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzm(i2, list, z2);
    }

    public static void zzn(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzn(i2, list, z2);
    }
}
