package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacp extends zzxv implements zzzh {
    private static final zzacp zza;
    private int zzd;
    private boolean zze;

    static {
        zzacp zzacpVar = new zzacp();
        zza = zzacpVar;
        zzxv.zzan(zzacp.class, zzacpVar);
    }

    private zzacp() {
    }

    public static zzacp zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzacp();
        }
        zzacn zzacnVar = null;
        if (i3 == 4) {
            return new zzaco(zzacnVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
