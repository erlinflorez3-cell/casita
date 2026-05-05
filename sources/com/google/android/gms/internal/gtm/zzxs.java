package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzxs implements zzxj {
    final zzxy zza;
    final int zzb;
    final zzaba zzc;
    final boolean zzd;

    zzxs(zzxy zzxyVar, int i2, zzaba zzabaVar, boolean z2, boolean z3) {
        this.zza = zzxyVar;
        this.zzb = i2;
        this.zzc = zzabaVar;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzxs) obj).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzzf zzb(zzzf zzzfVar, zzzg zzzgVar) {
        ((zzxp) zzzfVar).zzA((zzxv) zzzgVar);
        return zzzfVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzzl zzc(zzzl zzzlVar, zzzl zzzlVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzaba zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final zzabb zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    public final boolean zzg() {
        return this.zzd;
    }
}
