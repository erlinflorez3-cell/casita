package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjn extends zzbeh implements zzbft {
    private static final zzjn zzd;
    private int zze;
    private long zzf;
    private zzgp zzg;
    private zzgx zzh;
    private byte zzj = 2;
    private zzbet zzi = zzL();

    static {
        zzjn zzjnVar = new zzjn();
        zzd = zzjnVar;
        zzbel.zzR(zzjn.class, zzjnVar);
    }

    private zzjn() {
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzi", zzha.class, "zzh"});
        }
        if (i3 == 3) {
            return new zzjn();
        }
        if (i3 == 4) {
            return new zzjm(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzgp zzd() {
        zzgp zzgpVar = this.zzg;
        return zzgpVar == null ? zzgp.zzg() : zzgpVar;
    }

    public final zzha zze(int i2) {
        return (zzha) this.zzi.get(i2);
    }

    public final boolean zzg() {
        int i2 = this.zze;
        return (i2 + 1) - (i2 | 1) != 0;
    }
}
