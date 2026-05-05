package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzfe implements zzgf {
    private static final zzfk zza = new zzfc();
    private final zzfk zzb;

    public zzfe() {
        zzfk zzfkVar = zza;
        int i2 = zzfu.zza;
        zzfd zzfdVar = new zzfd(zzea.zza(), zzfkVar);
        byte[] bArr = zzep.zzb;
        this.zzb = zzfdVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgf
    public final zzge zza(Class cls) {
        int i2 = zzgg.zza;
        if (!zzeh.class.isAssignableFrom(cls)) {
            int i3 = zzfu.zza;
        }
        zzfj zzfjVarZzb = this.zzb.zzb(cls);
        if (zzfjVarZzb.zzb()) {
            int i4 = zzfu.zza;
            return zzfq.zzc(zzgg.zzm(), zzdv.zza(), zzfjVarZzb.zza());
        }
        int i5 = zzfu.zza;
        return zzfp.zzl(cls, zzfjVarZzb, zzft.zza(), zzfa.zza(), zzgg.zzm(), zzfjVarZzb.zzc() + (-1) != 1 ? zzdv.zza() : null, zzfi.zza());
    }
}
