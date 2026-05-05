package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbp implements zzfr {
    private final zzbn zzfo;

    private zzbp(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) zzci.zza(zzbnVar, "output");
        this.zzfo = zzbnVar2;
        zzbnVar2.zzfz = this;
    }

    public static zzbp zza(zzbn zzbnVar) {
        return zzbnVar.zzfz != null ? zzbnVar.zzfz : new zzbp(zzbnVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, double d2) throws IOException {
        this.zzfo.zza(i2, d2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, float f2) throws IOException {
        this.zzfo.zza(i2, f2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, long j2) throws IOException {
        this.zzfo.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, zzbb zzbbVar) throws IOException {
        this.zzfo.zza(i2, zzbbVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final <K, V> void zza(int i2, zzdh<K, V> zzdhVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzfo.zzb(i2, 2);
            this.zzfo.zzo(zzdg.zza(zzdhVar, entry.getKey(), entry.getValue()));
            zzdg.zza(this.zzfo, zzdhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzbb) {
            this.zzfo.zzb(i2, (zzbb) obj);
        } else {
            this.zzfo.zzb(i2, (zzdo) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, Object obj, zzef zzefVar) throws IOException {
        this.zzfo.zza(i2, (zzdo) obj, zzefVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, String str) throws IOException {
        this.zzfo.zza(i2, str);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzcx)) {
            while (i3 < list.size()) {
                this.zzfo.zza(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzcx zzcxVar = (zzcx) list;
        while (i3 < list.size()) {
            Object raw = zzcxVar.getRaw(i3);
            if (raw instanceof String) {
                this.zzfo.zza(i2, (String) raw);
            } else {
                this.zzfo.zza(i2, (zzbb) raw);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, List<?> list, zzef zzefVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzc(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzs = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzs += zzbn.zzs(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzs);
        while (i3 < list.size()) {
            this.zzfo.zzn(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzaa(int i2) throws IOException {
        this.zzfo.zzb(i2, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzab(int i2) throws IOException {
        this.zzfo.zzb(i2, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final int zzaj() {
        return zzcg.zzg.zzko;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, long j2) throws IOException {
        this.zzfo.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, Object obj, zzef zzefVar) throws IOException {
        zzbn zzbnVar = this.zzfo;
        zzbnVar.zzb(i2, 3);
        zzefVar.zza((zzdo) obj, zzbnVar.zzfz);
        zzbnVar.zzb(i2, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, List<zzbb> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zzfo.zza(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, List<?> list, zzef zzefVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzf(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzv = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzv += zzbn.zzv(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzv);
        while (i3 < list.size()) {
            this.zzfo.zzq(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i2, boolean z2) throws IOException {
        this.zzfo.zzb(i2, z2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i2, int i3) throws IOException {
        this.zzfo.zzc(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i2, long j2) throws IOException {
        this.zzfo.zzc(i2, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zza(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZze = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZze += zzbn.zze(list.get(i4).longValue());
        }
        this.zzfo.zzo(iZze);
        while (i3 < list.size()) {
            this.zzfo.zzb(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i2, int i3) throws IOException {
        this.zzfo.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zza(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzf = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzf += zzbn.zzf(list.get(i4).longValue());
        }
        this.zzfo.zzo(iZzf);
        while (i3 < list.size()) {
            this.zzfo.zzb(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i2, int i3) throws IOException {
        this.zzfo.zze(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzc(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzh = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzh += zzbn.zzh(list.get(i4).longValue());
        }
        this.zzfo.zzo(iZzh);
        while (i3 < list.size()) {
            this.zzfo.zzd(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i2, int i3) throws IOException {
        this.zzfo.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i2, List<Float> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zza(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzbn.zzb(list.get(i4).floatValue());
        }
        this.zzfo.zzo(iZzb);
        while (i3 < list.size()) {
            this.zzfo.zza(list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzg(int i2, List<Double> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zza(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzbn.zzb(list.get(i4).doubleValue());
        }
        this.zzfo.zzo(iZzb);
        while (i3 < list.size()) {
            this.zzfo.zza(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzh(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzc(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzx = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzx += zzbn.zzx(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzx);
        while (i3 < list.size()) {
            this.zzfo.zzn(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i2, long j2) throws IOException {
        this.zzfo.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i2, List<Boolean> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzb(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzbn.zzb(list.get(i4).booleanValue());
        }
        this.zzfo.zzo(iZzb);
        while (i3 < list.size()) {
            this.zzfo.zza(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i2, long j2) throws IOException {
        this.zzfo.zzc(i2, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzd(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzt = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzt += zzbn.zzt(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzt);
        while (i3 < list.size()) {
            this.zzfo.zzo(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzk(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzf(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzw = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzw += zzbn.zzw(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzw);
        while (i3 < list.size()) {
            this.zzfo.zzq(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzl(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzc(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzi = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzi += zzbn.zzi(list.get(i4).longValue());
        }
        this.zzfo.zzo(iZzi);
        while (i3 < list.size()) {
            this.zzfo.zzd(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i2, int i3) throws IOException {
        this.zzfo.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zze(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzu = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzu += zzbn.zzu(list.get(i4).intValue());
        }
        this.zzfo.zzo(iZzu);
        while (i3 < list.size()) {
            this.zzfo.zzp(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i2, int i3) throws IOException {
        this.zzfo.zzc(i2, i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zzfo.zzb(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zzfo.zzb(i2, 2);
        int iZzg = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzg += zzbn.zzg(list.get(i4).longValue());
        }
        this.zzfo.zzo(iZzg);
        while (i3 < list.size()) {
            this.zzfo.zzc(list.get(i3).longValue());
            i3++;
        }
    }
}
