package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzay extends zzbeh implements zzbft {
    private static final zzay zzd;
    private byte zze = 2;

    static {
        zzay zzayVar = new zzay();
        zzd = zzayVar;
        zzbel.zzR(zzay.class, zzayVar);
    }

    private zzay() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0000", null);
        }
        if (i3 == 3) {
            return new zzay();
        }
        if (i3 == 4) {
            return new zzax(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
