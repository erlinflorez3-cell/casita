package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzif {
    int zza;
    int zzb;
    zzig zzc;
    private int zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    zzif() {
        this.zzb = 100;
        this.zzd = Integer.MAX_VALUE;
        this.zze = false;
    }

    /* synthetic */ zzif(zzie zzieVar) {
        this();
    }

    public static long zza(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    static zzif zza(byte[] bArr, int i2, int i3, boolean z2) {
        zzih zzihVar = new zzih(bArr, i3);
        try {
            zzihVar.zzc(i3);
            return zzihVar;
        } catch (zzjk e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zze(int i2) {
        return (-((i2 + 1) - (i2 | 1))) ^ (i2 >>> 1);
    }

    public abstract int zza() throws IOException;

    public abstract void zza(int i2) throws zzjk;

    public abstract double zzb() throws IOException;

    public abstract boolean zzb(int i2) throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzc(int i2) throws zzjk;

    public abstract long zzd() throws IOException;

    public abstract void zzd(int i2);

    public abstract long zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract boolean zzi() throws IOException;

    public abstract String zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract zzht zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    abstract long zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract int zzu();
}
