package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzxk {
    private static final zzxk zzb = new zzxk(true);
    final zzaag zza = new zzzw(16);
    private boolean zzc;
    private boolean zzd;

    private zzxk() {
    }

    private zzxk(boolean z2) {
        zzi();
        zzi();
    }

    static int zza(zzaba zzabaVar, int i2, Object obj) {
        int length;
        int iZzD;
        int i3 = zzuq.zzf;
        int iZzD2 = zzuq.zzD(i2 << 3);
        if (zzabaVar == zzaba.GROUP) {
            zzzg zzzgVar = (zzzg) obj;
            byte[] bArr = zzye.zzd;
            if (zzzgVar instanceof zztm) {
                throw null;
            }
            iZzD2 += iZzD2;
        }
        zzabb zzabbVar = zzabb.INT;
        int iZzE = 4;
        switch (zzabaVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZzD2 + iZzE;
            case INT64:
                iZzE = zzuq.zzE(((Long) obj).longValue());
                return iZzD2 + iZzE;
            case UINT64:
                iZzE = zzuq.zzE(((Long) obj).longValue());
                return iZzD2 + iZzE;
            case INT32:
                iZzE = zzuq.zzz(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case FIXED64:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZzD2 + iZzE;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iZzE = 1;
                return iZzD2 + iZzE;
            case STRING:
                if (!(obj instanceof zzud)) {
                    iZzE = zzuq.zzC((String) obj);
                    return iZzD2 + iZzE;
                }
                length = ((zzud) obj).zzd();
                iZzD = zzuq.zzD(length);
                iZzE = iZzD + length;
                return iZzD2 + iZzE;
            case GROUP:
                iZzE = ((zzzg) obj).zzX();
                return iZzD2 + iZzE;
            case MESSAGE:
                if (!(obj instanceof zzyl)) {
                    iZzE = zzuq.zzA((zzzg) obj);
                    return iZzD2 + iZzE;
                }
                length = ((zzyl) obj).zza();
                iZzD = zzuq.zzD(length);
                iZzE = iZzD + length;
                return iZzD2 + iZzE;
            case BYTES:
                if (obj instanceof zzud) {
                    length = ((zzud) obj).zzd();
                    iZzD = zzuq.zzD(length);
                } else {
                    length = ((byte[]) obj).length;
                    iZzD = zzuq.zzD(length);
                }
                iZzE = iZzD + length;
                return iZzD2 + iZzE;
            case UINT32:
                iZzE = zzuq.zzD(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case ENUM:
                iZzE = obj instanceof zzxx ? zzuq.zzz(((zzxx) obj).zza()) : zzuq.zzz(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZzD2 + iZzE;
            case SFIXED64:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzE = zzuq.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzD2 + iZzE;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzE = zzuq.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzD2 + iZzE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzxj zzxjVar, Object obj) {
        zzaba zzabaVarZzd = zzxjVar.zzd();
        int iZza = zzxjVar.zza();
        if (!zzxjVar.zzg()) {
            return zza(zzabaVarZzd, iZza, obj);
        }
        zzxjVar.zzf();
        Iterator it = ((List) obj).iterator();
        int iZza2 = 0;
        while (it.hasNext()) {
            iZza2 += zza(zzabaVarZzd, iZza, it.next());
        }
        return iZza2;
    }

    public static zzxk zze() {
        return zzb;
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzzl) {
            return ((zzzl) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzo(Map.Entry entry) {
        zzzg zzzgVarZzD;
        zzxj zzxjVar = (zzxj) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzyl) {
            throw null;
        }
        if (zzxjVar.zzg()) {
            Object objZzf = zzf(zzxjVar);
            if (objZzf == null) {
                objZzf = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZzf).add(zzn(it.next()));
            }
            this.zza.put(zzxjVar, objZzf);
            return;
        }
        if (zzxjVar.zze() != zzabb.MESSAGE) {
            this.zza.put(zzxjVar, zzn(value));
            return;
        }
        Object objZzf2 = zzf(zzxjVar);
        if (objZzf2 == null) {
            this.zza.put(zzxjVar, zzn(value));
            return;
        }
        if (objZzf2 instanceof zzzl) {
            zzzgVarZzD = zzxjVar.zzc((zzzl) objZzf2, (zzzl) value);
        } else {
            zzzf zzzfVarZzav = ((zzzg) objZzf2).zzav();
            zzxjVar.zzb(zzzfVarZzav, (zzzg) value);
            zzzgVarZzD = zzzfVarZzav.zzD();
        }
        this.zza.put(zzxjVar, zzzgVarZzD);
    }

    private static boolean zzp(Map.Entry entry) {
        zzxj zzxjVar = (zzxj) entry.getKey();
        if (zzxjVar.zze() != zzabb.MESSAGE) {
            return true;
        }
        if (!zzxjVar.zzg()) {
            return zzq(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzq(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzq(Object obj) {
        if (obj instanceof zzzh) {
            return ((zzzh) obj).zzay();
        }
        if (obj instanceof zzyl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzr(Map.Entry entry) {
        zzxj zzxjVar = (zzxj) entry.getKey();
        Object value = entry.getValue();
        if (zzxjVar.zze() != zzabb.MESSAGE || zzxjVar.zzg()) {
            return zzb(zzxjVar, value);
        }
        zzxjVar.zzf();
        if (!(value instanceof zzyl)) {
            int iZzD = zzuq.zzD(((zzxj) entry.getKey()).zza());
            int iZzD2 = zzuq.zzD(24) + zzuq.zzA((zzzg) value);
            int iZzD3 = zzuq.zzD(16);
            int iZzD4 = zzuq.zzD(8);
            return iZzD4 + iZzD4 + iZzD3 + iZzD + iZzD2;
        }
        int iZzD5 = zzuq.zzD(((zzxj) entry.getKey()).zza());
        int iZza = ((zzyl) value).zza();
        int iZzD6 = zzuq.zzD(iZza) + iZza;
        int iZzD7 = zzuq.zzD(24);
        int iZzD8 = zzuq.zzD(16);
        int iZzD9 = zzuq.zzD(8);
        return iZzD9 + iZzD9 + iZzD8 + iZzD5 + iZzD7 + iZzD6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void zzs(zzxj zzxjVar, Object obj) {
        boolean z2;
        zzxjVar.zzd();
        byte[] bArr = zzye.zzd;
        obj.getClass();
        zzaba zzabaVar = zzaba.DOUBLE;
        zzabb zzabbVar = zzabb.INT;
        switch (r1.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof zzud) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzxjVar.zza()), zzxjVar.zzd().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzxx)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzxjVar.zza()), zzxjVar.zzd().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzzg) || (obj instanceof zzyl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzxjVar.zza()), zzxjVar.zzd().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzxjVar.zza()), zzxjVar.zzd().zza(), obj.getClass().getName()));
        }
        if (z2) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzxjVar.zza()), zzxjVar.zzd().zza(), obj.getClass().getName()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzxk) {
            return this.zza.equals(((zzxk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzr = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            iZzr += zzr(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzr += zzr((Map.Entry) it.next());
        }
        return iZzr;
    }

    /* JADX INFO: renamed from: zzd */
    public final zzxk clone() {
        zzxk zzxkVar = new zzxk();
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzxkVar.zzk((zzxj) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzxkVar.zzk((zzxj) entry.getKey(), entry.getValue());
        }
        zzxkVar.zzd = this.zzd;
        return zzxkVar;
    }

    public final Object zzf(zzxj zzxjVar) {
        Object obj = this.zza.get(zzxjVar);
        if (!(obj instanceof zzyl)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        return this.zzd ? new zzyk(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzxj zzxjVar, Object obj) {
        List arrayList;
        if (!((zzxs) zzxjVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzs(zzxjVar, obj);
        Object objZzf = zzf(zzxjVar);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.zza.put(zzxjVar, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            if (entryZzg.getValue() instanceof zzxv) {
                ((zzxv) entryZzg.getValue()).zzal();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzxk zzxkVar) {
        for (int i2 = 0; i2 < zzxkVar.zza.zzb(); i2++) {
            zzo(zzxkVar.zza.zzg(i2));
        }
        Iterator it = zzxkVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzo((Map.Entry) it.next());
        }
    }

    public final void zzk(zzxj zzxjVar, Object obj) {
        if (!zzxjVar.zzg()) {
            zzs(zzxjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzs(zzxjVar, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof zzyl) {
            this.zzd = true;
        }
        this.zza.put(zzxjVar, obj);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            if (!zzp(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
