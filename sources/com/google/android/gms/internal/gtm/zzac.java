package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.AdkSettings;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzac extends zzxv implements zzzh {
    private static final zzac zza;
    private int zzd;
    private zzs zzq;
    private float zzr;
    private boolean zzs;
    private int zzu;
    private byte zzv = 2;
    private zzyd zze = zzxv.zzah();
    private zzyd zzf = zzxv.zzah();
    private zzyd zzg = zzah();
    private zzyd zzh = zzah();
    private zzyd zzi = zzah();
    private zzyd zzj = zzah();
    private zzyd zzk = zzah();
    private zzyd zzl = zzah();
    private String zzm = "";
    private String zzn = "";
    private String zzo = AdkSettings.PLATFORM_TYPE_MOBILE;
    private String zzp = "";
    private zzyd zzt = zzxv.zzah();

    static {
        zzac zzacVar = new zzac();
        zza = zzacVar;
        zzxv.zzan(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzac zzk() {
        return zza;
    }

    public static zzac zzl(byte[] bArr, zzxf zzxfVar) throws zzyg {
        return (zzac) zzxv.zzaf(zza, bArr, zzxfVar);
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzv);
        }
        if (i3 == 2) {
            return zzak(zza, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007\u001b\tဈ\u0000\nဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဉ\u0004\u000fခ\u0005\u0010\u001a\u0011င\u0007\u0012ဇ\u0006\u0013\u001a", new Object[]{"zzd", "zzf", "zzg", zzam.class, "zzh", zzaa.class, "zzi", zzu.class, "zzj", zzu.class, "zzk", zzu.class, "zzl", zzae.class, "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzt", "zzu", "zzs", "zze"});
        }
        if (i3 == 3) {
            return new zzac();
        }
        if (i3 == 4) {
            return new zzab(null);
        }
        if (i3 == 5) {
            return zza;
        }
        this.zzv = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final int zzd() {
        return this.zzu;
    }

    public final int zze() {
        return this.zzj.size();
    }

    public final int zzf() {
        return this.zzg.size();
    }

    public final zzu zzg(int i2) {
        return (zzu) this.zzi.get(i2);
    }

    public final zzu zzh(int i2) {
        return (zzu) this.zzk.get(i2);
    }

    public final zzu zzi(int i2) {
        return (zzu) this.zzj.get(i2);
    }

    public final zzam zzm(int i2) {
        return (zzam) this.zzg.get(i2);
    }

    public final String zzn() {
        return this.zzp;
    }

    public final List zzo() {
        return this.zzf;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzl;
    }

    public final List zzr() {
        return this.zzg;
    }
}
