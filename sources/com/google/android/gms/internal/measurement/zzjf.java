package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, "output");
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    public static zzjf zza(zzjc zzjcVar) {
        return zzjcVar.zza != null ? zzjcVar.zza : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i2) throws IOException {
        this.zza.zzc(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, double d2) throws IOException {
        this.zza.zzb(i2, d2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, float f2) throws IOException {
        this.zza.zzb(i2, f2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, zzik zzikVar) throws IOException {
        this.zza.zza(i2, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i2, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i2, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzik) {
            this.zza.zzb(i2, (zzik) obj);
        } else {
            this.zza.zza(i2, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, Object obj, zzlu zzluVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i2, 3);
        zzluVar.zza((zzlc) obj, zzjcVar.zza);
        zzjcVar.zzc(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, String str) throws IOException {
        this.zza.zza(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<zzik> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zza(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<?> list, zzlu zzluVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<Boolean> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzii)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).booleanValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzjc.zza(list.get(i4).booleanValue());
            }
            this.zza.zzc(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (!z2) {
            while (i3 < zziiVar.size()) {
                this.zza.zza(i2, zziiVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZza2 = 0;
        for (int i5 = 0; i5 < zziiVar.size(); i5++) {
            iZza2 += zzjc.zza(zziiVar.zzb(i5));
        }
        this.zza.zzc(iZza2);
        while (i3 < zziiVar.size()) {
            this.zza.zzb(zziiVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, boolean z2) throws IOException {
        this.zza.zza(i2, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i2) throws IOException {
        this.zza.zzc(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zza(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, long j2) throws IOException {
        this.zza.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, Object obj, zzlu zzluVar) throws IOException {
        this.zza.zza(i2, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkj)) {
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzkj zzkjVar = (zzkj) list;
        while (i3 < list.size()) {
            Object objZza = zzkjVar.zza(i3);
            if (objZza instanceof String) {
                this.zza.zza(i2, (String) objZza);
            } else {
                this.zza.zza(i2, (zzik) objZza);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<?> list, zzlu zzluVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<Double> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzje)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).doubleValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzjc.zza(list.get(i4).doubleValue());
            }
            this.zza.zzc(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (!z2) {
            while (i3 < zzjeVar.size()) {
                this.zza.zzb(i2, zzjeVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZza2 = 0;
        for (int i5 = 0; i5 < zzjeVar.size(); i5++) {
            iZza2 += zzjc.zza(zzjeVar.zzb(i5));
        }
        this.zza.zzc(iZza2);
        while (i3 < zzjeVar.size()) {
            this.zza.zzb(zzjeVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzd = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzd += zzjc.zzd(list.get(i4).intValue());
            }
            this.zza.zzc(iZzd);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzb(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzd2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZzd2 += zzjc.zzd(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZzd2);
        while (i3 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, int i3) throws IOException {
        this.zza.zza(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZze = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZze += zzjc.zze(list.get(i4).intValue());
            }
            this.zza.zzc(iZze);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zza(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZze2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZze2 += zzjc.zze(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZze2);
        while (i3 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, int i3) throws IOException {
        this.zza.zzk(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, long j2) throws IOException {
        this.zza.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzc = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzc += zzjc.zzc(list.get(i4).longValue());
            }
            this.zza.zzc(iZzc);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zza(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzc2 = 0;
        for (int i5 = 0; i5 < zzknVar.size(); i5++) {
            iZzc2 += zzjc.zzc(zzknVar.zzb(i5));
        }
        this.zza.zzc(iZzc2);
        while (i3 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i2, List<Float> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).floatValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzjc.zza(list.get(i4).floatValue());
            }
            this.zza.zzc(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (!z2) {
            while (i3 < zzjsVar.size()) {
                this.zza.zzb(i2, zzjsVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZza2 = 0;
        for (int i5 = 0; i5 < zzjsVar.size(); i5++) {
            iZza2 += zzjc.zza(zzjsVar.zzb(i5));
        }
        this.zza.zzc(iZza2);
        while (i3 < zzjsVar.size()) {
            this.zza.zzb(zzjsVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzf = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzf += zzjc.zzf(list.get(i4).intValue());
            }
            this.zza.zzc(iZzf);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzb(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzf2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZzf2 += zzjc.zzf(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZzf2);
        while (i3 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzd = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzd += zzjc.zzd(list.get(i4).longValue());
            }
            this.zza.zzc(iZzd);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzb(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzd2 = 0;
        for (int i5 = 0; i5 < zzknVar.size(); i5++) {
            iZzd2 += zzjc.zzd(zzknVar.zzb(i5));
        }
        this.zza.zzc(iZzd2);
        while (i3 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzg = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzg += zzjc.zzg(list.get(i4).intValue());
            }
            this.zza.zzc(iZzg);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zza(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzg2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZzg2 += zzjc.zzg(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZzg2);
        while (i3 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZze = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZze += zzjc.zze(list.get(i4).longValue());
            }
            this.zza.zzc(iZze);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zza(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZze2 = 0;
        for (int i5 = 0; i5 < zzknVar.size(); i5++) {
            iZze2 += zzjc.zze(zzknVar.zzb(i5));
        }
        this.zza.zzc(iZze2);
        while (i3 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzk(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzh = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzh += zzjc.zzh(list.get(i4).intValue());
            }
            this.zza.zzc(iZzh);
            while (i3 < list.size()) {
                this.zza.zzk(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzk(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzh2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZzh2 += zzjc.zzh(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZzh2);
        while (i3 < zzjwVar.size()) {
            this.zza.zzk(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzf = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzf += zzjc.zzf(list.get(i4).longValue());
            }
            this.zza.zzc(iZzf);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzh(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzf2 = 0;
        for (int i5 = 0; i5 < zzknVar.size(); i5++) {
            iZzf2 += zzjc.zzf(zzknVar.zzb(i5));
        }
        this.zza.zzc(iZzf2);
        while (i3 < zzknVar.size()) {
            this.zza.zzh(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzj = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzj += zzjc.zzj(list.get(i4).intValue());
            }
            this.zza.zzc(iZzj);
            while (i3 < list.size()) {
                this.zza.zzc(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzd(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzj2 = 0;
        for (int i5 = 0; i5 < zzjwVar.size(); i5++) {
            iZzj2 += zzjc.zzj(zzjwVar.zzb(i5));
        }
        this.zza.zzc(iZzj2);
        while (i3 < zzjwVar.size()) {
            this.zza.zzc(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int iZzg = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzg += zzjc.zzg(list.get(i4).longValue());
            }
            this.zza.zzc(iZzg);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzb(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int iZzg2 = 0;
        for (int i5 = 0; i5 < zzknVar.size(); i5++) {
            iZzg2 += zzjc.zzg(zzknVar.zzb(i5));
        }
        this.zza.zzc(iZzg2);
        while (i3 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i3));
            i3++;
        }
    }
}
