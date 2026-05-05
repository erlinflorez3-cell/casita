package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacm extends zzxv implements zzzh {
    private static final zzacm zza;
    private int zzd;
    private String zze = "";

    static {
        zzacm zzacmVar = new zzacm();
        zza = zzacmVar;
        zzxv.zzan(zzacm.class, zzacmVar);
    }

    private zzacm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzacm();
        }
        zzaci zzaciVar = null;
        if (i3 == 4) {
            return new zzacl(zzaciVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zza;
    }
}
