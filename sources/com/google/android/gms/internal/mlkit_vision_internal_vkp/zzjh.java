package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjh extends zzbel implements zzbft {
    private static final zzjh zzb;
    private int zzd;
    private zzbet zze = zzL();
    private String zzf = "";

    static {
        zzjh zzjhVar = new zzjh();
        zzb = zzjhVar;
        zzbel.zzR(zzjh.class, zzjhVar);
    }

    private zzjh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zze", zzje.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzjh();
        }
        zzjf zzjfVar = null;
        if (i3 == 4) {
            return new zzjg(zzjfVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
