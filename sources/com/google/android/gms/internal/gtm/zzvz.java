package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvz extends zzxr implements zzzh {
    private static final zzyb zzd = new zzyb<Integer, zzwo>() { // from class: com.google.android.gms.internal.gtm.zzvz.1
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzwo zzb(Integer num) {
            throw null;
        }
    };
    private static final zzvz zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private int zzs;
    private zzvy zzv;
    private byte zzx = 2;
    private zzyd zzn = zzzq.zze();
    private boolean zzp = true;
    private zzya zzt = zzxw.zzf();
    private zzyd zzu = zzzq.zze();
    private zzyd zzw = zzzq.zze();

    /* JADX INFO: renamed from: com.google.android.gms.internal.gtm.zzvz$1 */
    class AnonymousClass1 implements zzyb<Integer, zzwo> {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzwo zzb(Integer num) {
            throw null;
        }
    }

    static {
        zzvz zzvzVar = new zzvz();
        zze = zzvzVar;
        zzxv.zzan(zzvz.class, zzvzVar);
    }

    private zzvz() {
    }

    public static zzvz zze() {
        return zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i3 == 2) {
            return new zzzr(zze, "\u0001\u0011\u0000\u0001\u0001ϧ\u0011\u0000\u0004\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004\u0010ဇ\n\u0011᠌\u000b\u0013ࠞ\u0014\u001b\u0015ᐉ\fϧЛ", new Object[]{"zzf", "zzg", zzwc.zza, "zzh", "zzl", "zzj", "zzi", zzwh.zza, "zzm", "zzn", zzwq.class, "zzo", "zzp", "zzq", "zzk", "zzr", "zzs", zzwk.zza, "zzt", zzwn.zza, "zzu", zzwf.class, "zzv", "zzw", zzxb.class});
        }
        if (i3 == 3) {
            return new zzvz();
        }
        if (i3 == 4) {
            return new zzwa(null);
        }
        if (i3 == 5) {
            return zze;
        }
        this.zzx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
