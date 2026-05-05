package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzil implements zzmr {
    private final zzii zza;

    private zzil(zzii zziiVar) {
        zzii zziiVar2 = (zzii) zzjf.zza(zziiVar, "output");
        this.zza = zziiVar2;
        zziiVar2.zza = this;
    }

    public static zzil zza(zzii zziiVar) {
        return zziiVar.zza != null ? zziiVar.zza : new zzil(zziiVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final int zza() {
        return zzmq.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2) throws IOException {
        this.zza.zza(i2, 3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, double d2) throws IOException {
        this.zza.zza(i2, d2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, float f2) throws IOException {
        this.zza.zza(i2, f2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, int i3) throws IOException {
        this.zza.zze(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, zzht zzhtVar) throws IOException {
        this.zza.zza(i2, zzhtVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final <K, V> void zza(int i2, zzkf<K, V> zzkfVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zza(i2, 2);
            this.zza.zzb(zzkc.zza(zzkfVar, entry.getKey(), entry.getValue()));
            zzkc.zza(this.zza, zzkfVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzht) {
            this.zza.zzb(i2, (zzht) obj);
        } else {
            this.zza.zza(i2, (zzkk) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, Object obj, zzlc zzlcVar) throws IOException {
        this.zza.zza(i2, (zzkk) obj, zzlcVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, String str) throws IOException {
        this.zza.zza(i2, str);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjv)) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzjv zzjvVar = (zzjv) list;
        while (i3 < list.size()) {
            Object objZzb = zzjvVar.zzb(i3);
            if (objZzb instanceof String) {
                this.zza.zza(i2, (String) objZzb);
            } else {
                this.zza.zza(i2, (zzht) objZzb);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, List<?> list, zzlc zzlcVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzlcVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzf = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzf += zzii.zzf(list.get(i4).intValue());
        }
        this.zza.zzb(iZzf);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i2, boolean z2) throws IOException {
        this.zza.zza(i2, z2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2) throws IOException {
        this.zza.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, long j2) throws IOException {
        this.zza.zzc(i2, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, Object obj, zzlc zzlcVar) throws IOException {
        zzii zziiVar = this.zza;
        zziiVar.zza(i2, 3);
        zzlcVar.zza((zzkk) obj, zziiVar.zza);
        zziiVar.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, List<zzht> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zza(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, List<?> list, zzlc zzlcVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzlcVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zze(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzi = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzi += zzii.zzi(list.get(i4).intValue());
        }
        this.zza.zzb(iZzi);
        while (i3 < list.size()) {
            this.zza.zzd(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzd = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzd += zzii.zzd(list.get(i4).longValue());
        }
        this.zza.zzb(iZzd);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i2, int i3) throws IOException {
        this.zza.zze(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzc(i2, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZze = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZze += zzii.zze(list.get(i4).longValue());
        }
        this.zza.zzb(iZze);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i2, int i3) throws IOException {
        this.zza.zzc(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i2, long j2) throws IOException {
        this.zza.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzc(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzg = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzg += zzii.zzg(list.get(i4).longValue());
        }
        this.zza.zzb(iZzg);
        while (i3 < list.size()) {
            this.zza.zzc(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int i2, List<Float> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzii.zzb(list.get(i4).floatValue());
        }
        this.zza.zzb(iZzb);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzg(int i2, List<Double> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzii.zzb(list.get(i4).doubleValue());
        }
        this.zza.zzb(iZzb);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzh(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzk = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzk += zzii.zzk(list.get(i4).intValue());
        }
        this.zza.zzb(iZzk);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzi(int i2, List<Boolean> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzb = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzb += zzii.zzb(list.get(i4).booleanValue());
        }
        this.zza.zzb(iZzb);
        while (i3 < list.size()) {
            this.zza.zza(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzj(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzc(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzg = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzg += zzii.zzg(list.get(i4).intValue());
        }
        this.zza.zzb(iZzg);
        while (i3 < list.size()) {
            this.zza.zzb(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzk(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zze(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzj = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzj += zzii.zzj(list.get(i4).intValue());
        }
        this.zza.zzb(iZzj);
        while (i3 < list.size()) {
            this.zza.zzd(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzl(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzc(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzh = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzh += zzii.zzh(list.get(i4).longValue());
        }
        this.zza.zzb(iZzh);
        while (i3 < list.size()) {
            this.zza.zzc(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzm(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzh = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzh += zzii.zzh(list.get(i4).intValue());
        }
        this.zza.zzb(iZzh);
        while (i3 < list.size()) {
            this.zza.zzc(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzn(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.zza.zza(i2, 2);
        int iZzf = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzf += zzii.zzf(list.get(i4).longValue());
        }
        this.zza.zzb(iZzf);
        while (i3 < list.size()) {
            this.zza.zzb(list.get(i3).longValue());
            i3++;
        }
    }
}
