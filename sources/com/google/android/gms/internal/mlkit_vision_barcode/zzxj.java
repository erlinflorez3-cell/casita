package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    zzxj(zzxk zzxkVar, zzrc zzrcVar, float f2, zzxn zzxnVar, float f3) {
        this.zza = zzrcVar;
        this.zzb = f2;
        this.zzc = zzxnVar;
        this.zzd = f3;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th) {
        zzxk.zzf.w("AutoZoom", "Unable to set zoom to " + this.zzd, th);
        this.zze.zzg.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Float f2 = (Float) obj;
        if (f2.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f2.floatValue());
            this.zze.zzq(this.zza, this.zzb, f2.floatValue(), this.zzc);
        }
        this.zze.zzg.set(false);
    }
}
