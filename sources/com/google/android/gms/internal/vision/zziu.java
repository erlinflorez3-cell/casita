package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zziw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zziu<T extends zziw<T>> {
    private static final zziu zzd = new zziu(true);
    final zzlh<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zziu() {
        this.zza = zzlh.zza(16);
    }

    private zziu(zzlh<T, Object> zzlhVar) {
        this.zza = zzlhVar;
        zzb();
    }

    private zziu(boolean z2) {
        this(zzlh.zza(0));
        zzb();
    }

    static int zza(zzml zzmlVar, int i2, Object obj) {
        int iZze = zzii.zze(i2);
        if (zzmlVar == zzml.zzj) {
            zzjf.zza((zzkk) obj);
            iZze <<= 1;
        }
        return iZze + zza(zzmlVar, obj);
    }

    private static int zza(zzml zzmlVar, Object obj) {
        switch (zzit.zzb[zzmlVar.ordinal()]) {
            case 1:
                return zzii.zzb(((Double) obj).doubleValue());
            case 2:
                return zzii.zzb(((Float) obj).floatValue());
            case 3:
                return zzii.zzd(((Long) obj).longValue());
            case 4:
                return zzii.zze(((Long) obj).longValue());
            case 5:
                return zzii.zzf(((Integer) obj).intValue());
            case 6:
                return zzii.zzg(((Long) obj).longValue());
            case 7:
                return zzii.zzi(((Integer) obj).intValue());
            case 8:
                return zzii.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzii.zzc((zzkk) obj);
            case 10:
                return obj instanceof zzjp ? zzii.zza((zzjp) obj) : zzii.zzb((zzkk) obj);
            case 11:
                return obj instanceof zzht ? zzii.zzb((zzht) obj) : zzii.zzb((String) obj);
            case 12:
                return obj instanceof zzht ? zzii.zzb((zzht) obj) : zzii.zzb((byte[]) obj);
            case 13:
                return zzii.zzg(((Integer) obj).intValue());
            case 14:
                return zzii.zzj(((Integer) obj).intValue());
            case 15:
                return zzii.zzh(((Long) obj).longValue());
            case 16:
                return zzii.zzh(((Integer) obj).intValue());
            case 17:
                return zzii.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzje ? zzii.zzk(((zzje) obj).zza()) : zzii.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends zziw<T>> zziu<T> zza() {
        return zzd;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzkt) {
            return ((zzkt) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void zza(zzii zziiVar, zzml zzmlVar, int i2, Object obj) throws IOException {
        if (zzmlVar == zzml.zzj) {
            zzkk zzkkVar = (zzkk) obj;
            zzjf.zza(zzkkVar);
            zziiVar.zza(i2, 3);
            zzkkVar.zza(zziiVar);
            zziiVar.zza(i2, 4);
        }
        zziiVar.zza(i2, zzmlVar.zzb());
        switch (zzit.zzb[zzmlVar.ordinal()]) {
            case 1:
                zziiVar.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zziiVar.zza(((Float) obj).floatValue());
                break;
            case 3:
                zziiVar.zza(((Long) obj).longValue());
                break;
            case 4:
                zziiVar.zza(((Long) obj).longValue());
                break;
            case 5:
                zziiVar.zza(((Integer) obj).intValue());
                break;
            case 6:
                zziiVar.zzc(((Long) obj).longValue());
                break;
            case 7:
                zziiVar.zzd(((Integer) obj).intValue());
                break;
            case 8:
                zziiVar.zza(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzkk) obj).zza(zziiVar);
                break;
            case 10:
                zziiVar.zza((zzkk) obj);
                break;
            case 11:
                if (!(obj instanceof zzht)) {
                    zziiVar.zza((String) obj);
                } else {
                    zziiVar.zza((zzht) obj);
                }
                break;
            case 12:
                if (!(obj instanceof zzht)) {
                    byte[] bArr = (byte[]) obj;
                    zziiVar.zzb(bArr, 0, bArr.length);
                } else {
                    zziiVar.zza((zzht) obj);
                }
                break;
            case 13:
                zziiVar.zzb(((Integer) obj).intValue());
                break;
            case 14:
                zziiVar.zzd(((Integer) obj).intValue());
                break;
            case 15:
                zziiVar.zzc(((Long) obj).longValue());
                break;
            case 16:
                zziiVar.zzc(((Integer) obj).intValue());
                break;
            case 17:
                zziiVar.zzb(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzje)) {
                    zziiVar.zza(((Integer) obj).intValue());
                } else {
                    zziiVar.zza(((zzje) obj).zza());
                }
                break;
        }
    }

    private static <T extends zziw<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzmo.MESSAGE) {
            if (key.zzd()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzkk) it.next()).zzk()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzkk)) {
                    if (value instanceof zzjp) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzkk) value).zzk()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzjp) {
            value = zzjp.zza();
        }
        if (key.zzd()) {
            Object objZza = zza((zziw) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzmo.MESSAGE) {
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zziw) key);
        if (objZza2 == null) {
            this.zza.put(key, zza(value));
        } else {
            this.zza.put(key, objZza2 instanceof zzkt ? key.zza((zzkt) objZza2, (zzkt) value) : key.zza(((zzkk) objZza2).zzp(), (zzkk) value).zzf());
        }
    }

    public static int zzc(zziw<?> zziwVar, Object obj) {
        zzml zzmlVarZzb = zziwVar.zzb();
        int iZza = zziwVar.zza();
        if (!zziwVar.zzd()) {
            return zza(zzmlVarZzb, iZza, obj);
        }
        int iZza2 = 0;
        if (zziwVar.zze()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzmlVarZzb, it.next());
            }
            return zzii.zze(iZza) + iZza2 + zzii.zzl(iZza2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iZza2 += zza(zzmlVarZzb, iZza, it2.next());
        }
        return iZza2;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzc() != zzmo.MESSAGE || key.zzd() || key.zze()) ? zzc(key, value) : value instanceof zzjp ? zzii.zzb(entry.getKey().zza(), (zzjp) value) : zzii.zzb(entry.getKey().zza(), (zzkk) value);
    }

    private static void zzd(T t2, Object obj) {
        zzml zzmlVarZzb = t2.zzb();
        zzjf.zza(obj);
        boolean z2 = true;
        switch (zzit.zza[zzmlVarZzb.zza().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzht) && !(obj instanceof byte[])) {
                    z2 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzje)) {
                    z2 = false;
                }
                break;
            case 9:
                if (!(obj instanceof zzkk) && !(obj instanceof zzjp)) {
                    z2 = false;
                }
                break;
            default:
                z2 = false;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t2.zza()), t2.zzb().zza(), obj.getClass().getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziu zziuVar = new zziu();
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i2);
            zziuVar.zza((zziw) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zziuVar.zza((zziw) entry.getKey(), entry.getValue());
        }
        zziuVar.zzc = this.zzc;
        return zziuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziu) {
            return this.zza.equals(((zziu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Object zza(T t2) {
        Object obj = this.zza.get(t2);
        if (!(obj instanceof zzjp)) {
            return obj;
        }
        return zzjp.zza();
    }

    public final void zza(zziu<T> zziuVar) {
        for (int i2 = 0; i2 < zziuVar.zza.zzc(); i2++) {
            zzb(zziuVar.zza.zzb(i2));
        }
        Iterator it = zziuVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final void zza(T t2, Object obj) {
        if (!t2.zzd()) {
            zzd(t2, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                zzd(t2, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzjp) {
            this.zzc = true;
        }
        this.zza.put(t2, obj);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final void zzb(T t2, Object obj) {
        List arrayList;
        if (!t2.zzd()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzd(t2, obj);
        Object objZza = zza((zziw) t2);
        if (objZza == null) {
            arrayList = new ArrayList();
            this.zza.put(t2, arrayList);
        } else {
            arrayList = (List) objZza;
        }
        arrayList.add(obj);
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzc ? new zzjq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> zze() {
        return this.zzc ? new zzjq(this.zza.zze().iterator()) : this.zza.zze().iterator();
    }

    public final boolean zzf() {
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            if (!zza((Map.Entry) this.zza.zzb(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zza((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        int iZzc = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            iZzc += zzc(this.zza.zzb(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzc += zzc((Map.Entry) it.next());
        }
        return iZzc;
    }
}
