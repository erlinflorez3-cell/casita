package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabo extends zzxv implements zzzh {
    private static final zzyb zza = new zzyb<Integer, zzaby>() { // from class: com.google.android.gms.internal.gtm.zzabo.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzaby zzb(Integer num) {
            throw null;
        }
    };
    private static final zzabo zzd;
    private zzya zze = zzag();

    /* JADX INFO: renamed from: com.google.android.gms.internal.gtm.zzabo$1 */
    class AnonymousClass1 implements zzyb<Integer, zzaby> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzaby zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzabo zzaboVar = new zzabo();
        zzd = zzaboVar;
        zzxv.zzan(zzabo.class, zzaboVar);
    }

    private zzabo() {
    }

    public static zzabo zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzak(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zze", zzabx.zza});
        }
        if (i3 == 3) {
            return new zzabo();
        }
        if (i3 == 4) {
            return new zzabp(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzd;
    }
}
