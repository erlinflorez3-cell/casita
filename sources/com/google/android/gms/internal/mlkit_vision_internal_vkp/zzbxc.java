package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbxc extends zzbel implements zzbft {
    private static final zzbxc zzb;

    static {
        zzbxc zzbxcVar = new zzbxc();
        zzb = zzbxcVar;
        zzbel.zzR(zzbxc.class, zzbxcVar);
    }

    private zzbxc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        zzbxa zzbxaVar = null;
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new zzbxc();
        }
        if (i3 == 4) {
            return new zzbxb(zzbxaVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
