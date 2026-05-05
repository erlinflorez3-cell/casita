package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzack extends zzxr implements zzzh {
    private static final zzack zzd;
    private int zze;
    private zzacm zzf;
    private byte zzg = 2;

    static {
        zzack zzackVar = new zzack();
        zzd = zzackVar;
        zzxv.zzan(zzack.class, zzackVar);
    }

    private zzack() {
    }

    public static zzack zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzak(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzack();
        }
        if (i3 == 4) {
            return new zzacj(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
