package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjq extends zzbel implements zzbft {
    private static final zzjq zzb;
    private byte zze = 2;
    private zzbet zzd = zzL();

    static {
        zzjq zzjqVar = new zzjq();
        zzb = zzjqVar;
        zzbel.zzR(zzjq.class, zzjqVar);
    }

    private zzjq() {
    }

    public static zzjq zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzjn.class});
        }
        if (i3 == 3) {
            return new zzjq();
        }
        if (i3 == 4) {
            return new zzjp(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zzjn zzc(int i2) {
        return (zzjn) this.zzd.get(i2);
    }
}
