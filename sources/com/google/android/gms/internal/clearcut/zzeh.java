package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzeh {
    private static final Class<?> zzoh = zzdp();
    private static final zzex<?, ?> zzoi = zzd(false);
    private static final zzex<?, ?> zzoj = zzd(true);
    private static final zzex<?, ?> zzok = new zzez();

    static int zza(List<Long> list) {
        int iZze;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            iZze = 0;
            while (i2 < size) {
                iZze += zzbn.zze(zzdcVar.getLong(i2));
                i2++;
            }
        } else {
            iZze = 0;
            while (i2 < size) {
                iZze += zzbn.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return iZze;
    }

    private static <UT, UB> UB zza(int i2, int i3, UB ub, zzex<UT, UB> zzexVar) {
        if (ub == null) {
            ub = zzexVar.zzdz();
        }
        zzexVar.zza(ub, i2, i3);
        return ub;
    }

    static <UT, UB> UB zza(int i2, List<Integer> list, zzck<?> zzckVar, UB ub, zzex<UT, UB> zzexVar) {
        if (zzckVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (zzckVar.zzb(iIntValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zza(i2, iIntValue, ub, zzexVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (zzckVar.zzb(iIntValue2) == null) {
                    ub = (UB) zza(i2, iIntValue2, ub, zzexVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i2, List<String> list, zzfr zzfrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i2, list);
    }

    public static void zza(int i2, List<?> list, zzfr zzfrVar, zzef zzefVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i2, list, zzefVar);
    }

    public static void zza(int i2, List<Double> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzg(i2, list, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends zzca<FT>> void zza(zzbu<FT> zzbuVar, T t2, T t3) {
        zzby<T> zzbyVarZza = zzbuVar.zza(t3);
        if (zzbyVarZza.isEmpty()) {
            return;
        }
        zzbuVar.zzb(t2).zza(zzbyVarZza);
    }

    static <T> void zza(zzdj zzdjVar, T t2, T t3, long j2) {
        zzfd.zza(t2, j2, zzdjVar.zzb(zzfd.zzo(t2, j2), zzfd.zzo(t3, j2)));
    }

    static <T, UT, UB> void zza(zzex<UT, UB> zzexVar, T t2, T t3) {
        zzexVar.zze(t2, zzexVar.zzg(zzexVar.zzq(t2), zzexVar.zzq(t3)));
    }

    static int zzb(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzbn.zzf(zzdcVar.getLong(i2));
                i2++;
            }
        } else {
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzbn.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzf;
    }

    public static void zzb(int i2, List<zzbb> list, zzfr zzfrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i2, list);
    }

    public static void zzb(int i2, List<?> list, zzfr zzfrVar, zzef zzefVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i2, list, zzefVar);
    }

    public static void zzb(int i2, List<Float> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzf(i2, list, z2);
    }

    static int zzc(int i2, Object obj, zzef zzefVar) {
        return obj instanceof zzcv ? zzbn.zza(i2, (zzcv) obj) : zzbn.zzb(i2, (zzdo) obj, zzefVar);
    }

    static int zzc(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzr = zzbn.zzr(i2) * size;
        if (list instanceof zzcx) {
            zzcx zzcxVar = (zzcx) list;
            while (i3 < size) {
                Object raw = zzcxVar.getRaw(i3);
                iZzr += raw instanceof zzbb ? zzbn.zzb((zzbb) raw) : zzbn.zzh((String) raw);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iZzr += obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzh((String) obj);
                i3++;
            }
        }
        return iZzr;
    }

    static int zzc(int i2, List<?> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = zzbn.zzr(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iZzr += obj instanceof zzcv ? zzbn.zza((zzcv) obj) : zzbn.zzb((zzdo) obj, zzefVar);
        }
        return iZzr;
    }

    static int zzc(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzbn.zzg(zzdcVar.getLong(i2));
                i2++;
            }
        } else {
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzbn.zzg(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzg;
    }

    public static void zzc(int i2, List<Long> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzc(i2, list, z2);
    }

    public static boolean zzc(int i2, int i3, int i4) {
        if (i3 < 40) {
            return true;
        }
        long j2 = i4;
        return (((long) i3) - ((long) i2)) + 10 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }

    static int zzd(int i2, List<zzbb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = size * zzbn.zzr(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzr += zzbn.zzb(list.get(i3));
        }
        return iZzr;
    }

    static int zzd(int i2, List<zzdo> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzc = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZzc += zzbn.zzc(i2, list.get(i3), zzefVar);
        }
        return iZzc;
    }

    static int zzd(List<Integer> list) {
        int iZzx;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            iZzx = 0;
            while (i2 < size) {
                iZzx += zzbn.zzx(zzchVar.getInt(i2));
                i2++;
            }
        } else {
            iZzx = 0;
            while (i2 < size) {
                iZzx += zzbn.zzx(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzx;
    }

    private static zzex<?, ?> zzd(boolean z2) {
        try {
            Class<?> clsZzdq = zzdq();
            if (clsZzdq == null) {
                return null;
            }
            return (zzex) clsZzdq.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i2, List<Long> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzd(i2, list, z2);
    }

    static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzex<?, ?> zzdm() {
        return zzoi;
    }

    public static zzex<?, ?> zzdn() {
        return zzoj;
    }

    public static zzex<?, ?> zzdo() {
        return zzok;
    }

    private static Class<?> zzdp() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzdq() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zze(List<Integer> list) {
        int iZzs;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            iZzs = 0;
            while (i2 < size) {
                iZzs += zzbn.zzs(zzchVar.getInt(i2));
                i2++;
            }
        } else {
            iZzs = 0;
            while (i2 < size) {
                iZzs += zzbn.zzs(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzs;
    }

    public static void zze(int i2, List<Long> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzn(i2, list, z2);
    }

    static int zzf(List<Integer> list) {
        int iZzt;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            iZzt = 0;
            while (i2 < size) {
                iZzt += zzbn.zzt(zzchVar.getInt(i2));
                i2++;
            }
        } else {
            iZzt = 0;
            while (i2 < size) {
                iZzt += zzbn.zzt(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzt;
    }

    public static void zzf(int i2, List<Long> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zze(i2, list, z2);
    }

    public static void zzf(Class<?> cls) {
        Class<?> cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = zzoh) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int zzg(List<Integer> list) {
        int iZzu;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            iZzu = 0;
            while (i2 < size) {
                iZzu += zzbn.zzu(zzchVar.getInt(i2));
                i2++;
            }
        } else {
            iZzu = 0;
            while (i2 < size) {
                iZzu += zzbn.zzu(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzu;
    }

    public static void zzg(int i2, List<Long> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzl(i2, list, z2);
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    public static void zzh(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i2, list, z2);
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    public static void zzi(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzj(i2, list, z2);
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    public static void zzj(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzm(i2, list, z2);
    }

    public static void zzk(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i2, list, z2);
    }

    public static void zzl(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzk(i2, list, z2);
    }

    public static void zzm(int i2, List<Integer> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzh(i2, list, z2);
    }

    public static void zzn(int i2, List<Boolean> list, zzfr zzfrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzi(i2, list, z2);
    }

    static int zzo(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzbn.zzr(i2));
    }

    static int zzp(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzbn.zzr(i2));
    }

    static int zzq(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzbn.zzr(i2));
    }

    static int zzr(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzbn.zzr(i2));
    }

    static int zzs(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzbn.zzr(i2));
    }

    static int zzt(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzbn.zzr(i2));
    }

    static int zzu(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzbn.zzr(i2));
    }

    static int zzv(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzj(i2, 0);
    }

    static int zzw(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzg(i2, 0L);
    }

    static int zzx(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzc(i2, true);
    }
}
