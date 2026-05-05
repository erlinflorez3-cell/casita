package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzzv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzaak zzc;
    private static final zzaak zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzaak zzaakVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzaakVar = (zzaak) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzaakVar;
        zzd = new zzaam();
    }

    public static void zzA(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzp(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzur zzurVar, zzzt zzztVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzurVar.zzq(i2, list.get(i3), zzztVar);
        }
    }

    public static void zzC(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzs(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzu(i2, list, z2);
    }

    public static void zzE(int i2, List list, zzur zzurVar, zzzt zzztVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzurVar.zzv(i2, list.get(i3), zzztVar);
        }
    }

    public static void zzF(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzy(i2, list, z2);
    }

    public static void zzG(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzA(i2, list, z2);
    }

    public static void zzH(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzC(i2, list, z2);
    }

    public static void zzI(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzE(i2, list, z2);
    }

    public static void zzJ(int i2, List list, zzur zzurVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzH(i2, list);
    }

    public static void zzK(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzJ(i2, list, z2);
    }

    public static void zzL(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzL(i2, list, z2);
    }

    static int zza(List list) {
        int iZzz;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            iZzz = 0;
            while (i2 < size) {
                iZzz += zzuq.zzz(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            iZzz = 0;
            while (i2 < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzz;
    }

    static int zzb(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i2 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i2 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzz;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            iZzz = 0;
            while (i2 < size) {
                iZzz += zzuq.zzz(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            iZzz = 0;
            while (i2 < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzz;
    }

    static int zzg(List list) {
        int iZzE;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            iZzE = 0;
            while (i2 < size) {
                iZzE += zzuq.zzE(zzyvVar.zze(i2));
                i2++;
            }
        } else {
            iZzE = 0;
            while (i2 < size) {
                iZzE += zzuq.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return iZzE;
    }

    static int zzh(int i2, Object obj, zzzt zzztVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzym)) {
            return zzuq.zzD(i3) + zzuq.zzB((zzzg) obj, zzztVar);
        }
        int i4 = zzuq.zzf;
        int iZza = ((zzym) obj).zza();
        return zzuq.zzD(i3) + zzuq.zzD(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzD;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            iZzD = 0;
            while (i2 < size) {
                int iZze = zzxwVar.zze(i2);
                iZzD += zzuq.zzD((iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
        } else {
            iZzD = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iZzD += zzuq.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
        }
        return iZzD;
    }

    static int zzj(List list) {
        int iZzE;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            iZzE = 0;
            while (i2 < size) {
                long jZze = zzyvVar.zze(i2);
                iZzE += zzuq.zzE((jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
        } else {
            iZzE = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iZzE += zzuq.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
        }
        return iZzE;
    }

    static int zzk(List list) {
        int iZzD;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            iZzD = 0;
            while (i2 < size) {
                iZzD += zzuq.zzD(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            iZzD = 0;
            while (i2 < size) {
                iZzD += zzuq.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return iZzD;
    }

    static int zzl(List list) {
        int iZzE;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            iZzE = 0;
            while (i2 < size) {
                iZzE += zzuq.zzE(zzyvVar.zze(i2));
                i2++;
            }
        } else {
            iZzE = 0;
            while (i2 < size) {
                iZzE += zzuq.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return iZzE;
    }

    public static zzaak zzm() {
        return zzc;
    }

    public static zzaak zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i2, List list, zzxz zzxzVar, Object obj2, zzaak zzaakVar) {
        if (zzxzVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                if (zzxzVar.zza(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    obj2 = zzp(obj, i2, iIntValue, obj2, zzaakVar);
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
                if (!zzxzVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i2, iIntValue2, obj2, zzaakVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i2, int i3, Object obj2, zzaak zzaakVar) {
        if (obj2 == null) {
            obj2 = zzaakVar.zzc(obj);
        }
        zzaakVar.zzl(obj2, i2, i3);
        return obj2;
    }

    static void zzq(zzxg zzxgVar, Object obj, Object obj2) {
        zzxk zzxkVarZzb = zzxgVar.zzb(obj2);
        if (zzxkVarZzb.zza.isEmpty()) {
            return;
        }
        zzxgVar.zzc(obj).zzj(zzxkVarZzb);
    }

    static void zzr(zzaak zzaakVar, Object obj, Object obj2) {
        zzaakVar.zzo(obj, zzaakVar.zze(zzaakVar.zzd(obj), zzaakVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzxv.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzt(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzu(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzc(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzur zzurVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zze(i2, list);
    }

    public static void zzw(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzg(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzj(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzl(i2, list, z2);
    }

    public static void zzz(int i2, List list, zzur zzurVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzn(i2, list, z2);
    }
}
