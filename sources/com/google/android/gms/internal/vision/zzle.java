package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzle {
    private static final Class<?> zza = zzd();
    private static final zzlu<?, ?> zzb = zza(false);
    private static final zzlu<?, ?> zzc = zza(true);
    private static final zzlu<?, ?> zzd = new zzlw();

    static int zza(int i2, Object obj, zzlc zzlcVar) {
        return obj instanceof zzjt ? zzii.zza(i2, (zzjt) obj) : zzii.zzb(i2, (zzkk) obj, zzlcVar);
    }

    static int zza(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iZze = zzii.zze(i2) * size;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i3 < size) {
                Object objZzb = zzjvVar.zzb(i3);
                iZze += objZzb instanceof zzht ? zzii.zzb((zzht) objZzb) : zzii.zzb((String) objZzb);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iZze += obj instanceof zzht ? zzii.zzb((zzht) obj) : zzii.zzb((String) obj);
                i3++;
            }
        }
        return iZze;
    }

    static int zza(int i2, List<?> list, zzlc zzlcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZze = zzii.zze(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iZze += obj instanceof zzjt ? zzii.zza((zzjt) obj) : zzii.zza((zzkk) obj, zzlcVar);
        }
        return iZze;
    }

    static int zza(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzii.zze(i2));
    }

    static int zza(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzii.zzd(zzjyVar.zzb(i2));
                i2++;
            }
        } else {
            iZzd = 0;
            while (i2 < size) {
                iZzd += zzii.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzd;
    }

    public static zzlu<?, ?> zza() {
        return zzb;
    }

    private static zzlu<?, ?> zza(boolean z2) {
        try {
            Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (zzlu) clsZze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB zza(int i2, int i3, UB ub, zzlu<UT, UB> zzluVar) {
        if (ub == null) {
            ub = zzluVar.zza();
        }
        zzluVar.zza(ub, i2, i3);
        return ub;
    }

    static <UT, UB> UB zza(int i2, List<Integer> list, zzjg zzjgVar, UB ub, zzlu<UT, UB> zzluVar) {
        if (zzjgVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (zzjgVar.zza(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zza(i2, iIntValue, ub, zzluVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzjgVar.zza(iIntValue2)) {
                    ub = (UB) zza(i2, iIntValue2, ub, zzluVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i2, List<String> list, zzmr zzmrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i2, list);
    }

    public static void zza(int i2, List<?> list, zzmr zzmrVar, zzlc zzlcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i2, list, zzlcVar);
    }

    public static void zza(int i2, List<Double> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzg(i2, list, z2);
    }

    static <T, FT extends zziw<FT>> void zza(zziq<FT> zziqVar, T t2, T t3) {
        zziu<T> zziuVarZza = zziqVar.zza(t3);
        if (zziuVarZza.zza.isEmpty()) {
            return;
        }
        zziqVar.zzb(t2).zza((zziu) zziuVarZza);
    }

    static <T> void zza(zzkh zzkhVar, T t2, T t3, long j2) {
        zzma.zza(t2, j2, zzkhVar.zza(zzma.zzf(t2, j2), zzma.zzf(t3, j2)));
    }

    static <T, UT, UB> void zza(zzlu<UT, UB> zzluVar, T t2, T t3) {
        zzluVar.zza(t2, zzluVar.zzc(zzluVar.zzb(t2), zzluVar.zzb(t3)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzjb.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zzb(int i2, List<zzht> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZze = size * zzii.zze(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZze += zzii.zzb(list.get(i3));
        }
        return iZze;
    }

    static int zzb(int i2, List<zzkk> list, zzlc zzlcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzc = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZzc += zzii.zzc(i2, list.get(i3), zzlcVar);
        }
        return iZzc;
    }

    static int zzb(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzii.zze(i2));
    }

    static int zzb(List<Long> list) {
        int iZze;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZze = 0;
            while (i2 < size) {
                iZze += zzii.zze(zzjyVar.zzb(i2));
                i2++;
            }
        } else {
            iZze = 0;
            while (i2 < size) {
                iZze += zzii.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return iZze;
    }

    public static zzlu<?, ?> zzb() {
        return zzc;
    }

    public static void zzb(int i2, List<zzht> list, zzmr zzmrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i2, list);
    }

    public static void zzb(int i2, List<?> list, zzmr zzmrVar, zzlc zzlcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i2, list, zzlcVar);
    }

    public static void zzb(int i2, List<Float> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzf(i2, list, z2);
    }

    static int zzc(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzii.zze(i2));
    }

    static int zzc(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzii.zzf(zzjyVar.zzb(i2));
                i2++;
            }
        } else {
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzii.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return iZzf;
    }

    public static zzlu<?, ?> zzc() {
        return zzd;
    }

    public static void zzc(int i2, List<Long> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzc(i2, list, z2);
    }

    static int zzd(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzii.zze(i2));
    }

    static int zzd(List<Integer> list) {
        int iZzk;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            iZzk = 0;
            while (i2 < size) {
                iZzk += zzii.zzk(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            iZzk = 0;
            while (i2 < size) {
                iZzk += zzii.zzk(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzk;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i2, List<Long> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzd(i2, list, z2);
    }

    static int zze(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzii.zze(i2));
    }

    static int zze(List<Integer> list) {
        int iZzf;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzii.zzf(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            iZzf = 0;
            while (i2 < size) {
                iZzf += zzii.zzf(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzf;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zze(int i2, List<Long> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzn(i2, list, z2);
    }

    static int zzf(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzii.zze(i2));
    }

    static int zzf(List<Integer> list) {
        int iZzg;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzii.zzg(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            iZzg = 0;
            while (i2 < size) {
                iZzg += zzii.zzg(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzg;
    }

    public static void zzf(int i2, List<Long> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zze(i2, list, z2);
    }

    static int zzg(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzii.zze(i2));
    }

    static int zzg(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            iZzh = 0;
            while (i2 < size) {
                iZzh += zzii.zzh(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            iZzh = 0;
            while (i2 < size) {
                iZzh += zzii.zzh(list.get(i2).intValue());
                i2++;
            }
        }
        return iZzh;
    }

    public static void zzg(int i2, List<Long> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzl(i2, list, z2);
    }

    static int zzh(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzi(i2, 0);
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    public static void zzh(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i2, list, z2);
    }

    static int zzi(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzg(i2, 0L);
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    public static void zzi(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzj(i2, list, z2);
    }

    static int zzj(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzb(i2, true);
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    public static void zzj(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzm(i2, list, z2);
    }

    public static void zzk(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i2, list, z2);
    }

    public static void zzl(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzk(i2, list, z2);
    }

    public static void zzm(int i2, List<Integer> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzh(i2, list, z2);
    }

    public static void zzn(int i2, List<Boolean> list, zzmr zzmrVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzi(i2, list, z2);
    }
}
