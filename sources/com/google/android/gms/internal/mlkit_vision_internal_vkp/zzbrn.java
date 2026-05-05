package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbrn extends zzbel implements zzbft {
    private static final zzbrn zzb;
    private int zzd;
    private zzbrh zze;
    private zzbet zzf = zzL();
    private float zzg;

    static {
        zzbrn zzbrnVar = new zzbrn();
        zzb = zzbrnVar;
        zzbel.zzR(zzbrn.class, zzbrnVar);
    }

    private zzbrn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"zzd", "zze", "zzf", zzbrm.class, "zzg"});
        }
        if (i3 == 3) {
            return new zzbrn();
        }
        if (i3 == 4) {
            return new zzbri(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
