package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zznl extends zzbel implements zzbft {
    private static final zznl zzb;
    private int zzd;
    private zzmm zzg;
    private byte zzh = 2;
    private String zze = "InOrderOutputStreamHandler";
    private zzbet zzf = zzbel.zzL();

    static {
        zznl zznlVar = new zznl();
        zzb = zznlVar;
        zzbel.zzR(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zznl();
        }
        zznh zznhVar = null;
        if (i3 == 4) {
            return new zznk(zznhVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
