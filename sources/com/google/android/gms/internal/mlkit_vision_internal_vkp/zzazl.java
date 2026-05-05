package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzazl extends zzbel implements zzbft {
    private static final zzazl zzb;
    private int zzd;
    private zzbcq zze;

    static {
        zzazl zzazlVar = new zzazl();
        zzb = zzazlVar;
        zzbel.zzR(zzazl.class, zzazlVar);
    }

    private zzazl() {
    }

    public static zzazl zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzazl();
        }
        zzazg zzazgVar = null;
        if (i3 == 4) {
            return new zzazk(zzazgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
